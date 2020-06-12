package com.liting.dao.Imp;

import com.liting.dao.OrdersDao;
import com.liting.domain.Orderitem;
import com.liting.domain.Orders;
import com.liting.domain.Products;
import com.liting.util.C3p0;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.ietf.jgss.Oid;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdersDaoImp implements OrdersDao {
    private QueryRunner qr = new QueryRunner(C3p0.getDataSource());

    @Override
    public void createOrders(Orders order) throws Exception {
        String sql = "insert into orders values (?,?,?,?,?,?,?,?)";
        qr.update(sql,
                order.getId(),
                order.getMoney(),
                order.getReceiverAddress(),
                order.getReceiverName(),
                order.getReceiverPhone(),
                order.getPaystate(),
                order.getOrdertime(),
                order.getUser().getId()
        );

    }

    @Override
    public void checkOrders(Orderitem orderitem) throws Exception {
        String sql = "insert into orderitem values (?,?,?)";
        qr.update(sql, orderitem.getOrder_id().getId(), orderitem.getP().getId(), orderitem.getBuynum());

    }

    @Override
    public void updatepaystate(String id, int paystate) throws Exception {
        String sql = "update orders set paystate=? where id=?";
        qr.update(sql, paystate, id);
    }

    @Override
    public List<Orders> ShowAllOrders(String user_id) throws Exception {
        String sql = "select *from orders where user_id=?";
        return qr.query(sql, new BeanListHandler<Orders>(Orders.class), user_id);
    }


    @Override
    public List<Orders> ShowAllOrdersInfo(String id) throws Exception {
        String sql = "select *from orders ,orderitem  ,products where orders.id=orderitem.order_id and orderitem.product_id=products.id and orders.id=?";
        //ResultSetHandler对结果集进行处理，这里的多表连接所以要进行处理，依赖于ResultSetHandler 接口及其实现类。
        return qr.query(sql, new ResultSetHandler<List<Orders>>() {
            @Override
            public List<Orders> handle(ResultSet resultSet) throws SQLException {
                //订单集合
                List<Orders> order = new ArrayList<>();
                //查询数据库时，返回的是一个二维的结果集，我们需要用到ResultSet来遍历结果集，获取每一行的数据。
                while (resultSet.next()) {
                    Orders orders = new Orders();
                    //封装订单表把订单表的数据封装
                    orders.setId(resultSet.getString("orders.id"));
                    orders.setMoney(resultSet.getDouble("orders.money"));
                    orders.setReceiverAddress(resultSet.getString("orders.receiverAddress"));
                    orders.setReceiverName(resultSet.getString("orders.receiverName"));
                    orders.setReceiverPhone(resultSet.getString("orders.receiverPhone"));
                    orders.setPaystate(resultSet.getInt("orders.paystate"));
                    orders.setOrdertime(resultSet.getDate("orders.ordertime"));

                    Products products = new Products();
                    products.setId(resultSet.getString("products.id"));
                    products.setName(resultSet.getString("products.name"));
                    products.setPrice(resultSet.getDouble("products.price"));

                    orders.setProductsList(products);

                    //封装订单的主表它是中间表把订单表与用户表相连接，  //订单具体详情集合
                    Orderitem orderitem = new Orderitem();
                    orderitem.setBuynum(resultSet.getInt("orderitem.buynum"));

                    orders.setOrderitems(orderitem);
                    //把orderitem表封装到一个list当中，然后把list封装到orders表中Orderitems list集合中
                    order.add(orders);
                    //封装到一个list当中，返回list类型
                }
                return order;
            }
        }, id);
    }

    @Override
    public void DeleteID(String id) throws Exception {
        String sql = "delete from orderitem where order_id=?";
        qr.update(sql, id);
        String sql1 = "delete from orders where id=?";
        qr.update(sql1, id);

    }


    @Override
    public void AdminDeleteID(String id) throws Exception {
        String sql = "delete from orderitem where order_id=?";
        qr.update(sql, id);
        String sql1 = "delete from orders where id=?";
        qr.update(sql1, id);

    }

    @Override
    public void updatepnum(Integer id) throws Exception {
        String sql = "update products set pnum=?  where id=?";
        qr.update(sql, id);
    }

    @Override
    public List<Products> findProductById() throws Exception {
        String sql = "select *from products ";
        List<Products> query = qr.query(sql, new BeanListHandler<Products>(Products.class));
        return query;
    }

    @Override
    public List<Products> Liketerm(String id, String category, String name) throws Exception {
        String sql = "select *from products where 1=1";
        if (!"".equals(id)) {
            sql = sql + " and id='" + id + "'";
        }
        if (!"".equals(category)) {
            sql = sql + " and category='" + category + "'";
        }
        if (!"".equals(name)) {
            sql = sql + " and name like '%" + name + "%'";
        }
        return qr.query(sql, new BeanListHandler<Products>(Products.class));

    }

    @Override
    public List<Orders> OrdersLike(String id,String receiverName) throws Exception {
        String sql="select *from orders where 1=1";
        if ("".equals(id)){
            sql=sql+" and id='"+id+"'";
        }
        if ("".equals(receiverName)){
            sql=sql+"and receiverName like'%"+receiverName+"%'";
        }
        return qr.query(sql, new BeanListHandler<Orders>(Orders.class));
    }

    @Override
    public List<Orders> AdminShowAllOrdersInfo(String id) throws Exception {
        String sql1 = "select *from orders ,orderitem ,products where orders.id=orderitem.order_id and orderitem.product_id=products.id and orders.id=?";
        //ResultSetHandler对结果集进行处理，这里的多表连接所以要进行处理，依赖于ResultSetHandler 接口及其实现类。
        return qr.query(sql1, new ResultSetHandler<List<Orders>>() {
            @Override
            public List<Orders> handle(ResultSet resultSet) throws SQLException {
                List<Orders> order = new ArrayList<>();
                while (resultSet.next()) {
                    Products products = new Products(resultSet.getString("products.id"),resultSet.getString("products.name"), resultSet.getDouble("products.price"),
                            resultSet.getString("products.category"),
                            resultSet.getInt("products.pnum"),resultSet.getString("products.imgurl"),
                            resultSet.getString("products.description"));
                    Orderitem orderitem = new Orderitem();
                    orderitem.setBuynum(resultSet.getInt("orderitem.buynum"));
                    Orders orders = new Orders(resultSet.getString("orders.id"),resultSet.getDouble("orders.money"),
                            resultSet.getString("orders.receiverAddress"),resultSet.getString("orders.receiverName"),
                            resultSet.getString("orders.receiverPhone"),resultSet.getInt("orders.paystate"),
                            resultSet.getDate("orders.ordertime"),products,orderitem);
                    order.add(orders);
                }
                return order;
            }
        }, id);
    }


    @Override
    public void AddBook(Products products) throws Exception {
        String sql = "insert into products values(?,?,?,?,?,?,?)";
        qr.update(sql,
                products.getId(),
                products.getName(),
                products.getPrice(),
                products.getCategory(),
                products.getPnum(),
                products.getImgurl(),
                products.getDescription()
        );
    }

    @Override
    public void redactServlet(Products p) throws Exception {
        String sql = "update products set name=?, price=?,pnum=?,category=?,imgurl=?,description=? where id=?";
        qr.update(sql,
                p.getName(),
                p.getPrice(),
                p.getPnum(),
                p.getCategory(),
                p.getImgurl(),
                p.getDescription(),
                p.getId()
        );

    }

    @Override
    public void delete(String id) throws Exception {
        String sql = "DELETE from products where id=? ";
        qr.update(sql, id);
    }



}
