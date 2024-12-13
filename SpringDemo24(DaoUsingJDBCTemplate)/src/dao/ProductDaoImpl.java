package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import model.Product;

public class ProductDaoImpl implements ProductDaoInterface 
{
	JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) 
	{
		this.jt = jt;
	}

	@Override
	public int save(Product p) 
	{
		String query="insert into products values('"+p.getPid()+"','"+p.getPname()+"','"+p.getPqty()+"','"+p.getPprice()+"')";
      	return  jt.update(query);
	}

	@Override
	public int update(Product p) 
	{
		 String query="update products set pname='"+p.getPname()+"',pqty='"+p.getPqty()+"',pprice='"+p.getPprice()+"' where pid='"+p.getPid()+"'";
		 return  jt.update(query);
	}

	@Override
	public int delete(Product p) 
	{
		String query="delete from products where pid="+p.getPid();
		return jt.update(query);
	}

	@Override
	public Product showProduct(int pid) 
	{
	   String query="select * from products where pid=?";
	   Product p=jt.queryForObject(query, new RowMapper<Product>()
	   {// start class

		@Override
		public Product mapRow(ResultSet rs, int cnt) throws SQLException 
		{
		    Product p=new Product();
		    p.setPid(rs.getInt(1));
		    p.setPname(rs.getString(2));
		    p.setPqty(rs.getInt(3));
		    p.setPprice(rs.getInt(4));
	    	return p;
		}
      }  ,pid);
	      
	   return p;
	}

	@Override
	public List<Product> showAll() 
	{
		String query="Select * from products";
		List<Product> plist=jt.query(query,new RowMapper<Product>()
		   {// start class

			@Override
			public Product mapRow(ResultSet rs, int cnt) throws SQLException 
			{
			    Product p=new Product();
			    p.setPid(rs.getInt(1));
			    p.setPname(rs.getString(2));
			    p.setPqty(rs.getInt(3));
			    p.setPprice(rs.getInt(4));
		    	return p;
			}
	      } );
		
	
		return plist;
	}
}// end class


// by using another class
/*
@Override
public Product showProduct(int pid) 
{
	String query="select * from products where pid=?";
	Product p=jt.queryForObject(query,new RowMapperImpl(),pid); 
    return p;
}
@Override
public List<Product> showAll() 
{
	String query="select * from products";
	List<Product> plist=jt.query(query,new RowMapperImpl());
  	return plist;
}
*/





