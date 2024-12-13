package dao;
import model.*;
import java.util.*;
public interface ProductDaoInterface 
{
  public int save(Product p);
  public int update(Product p);
  public int delete(Product p);
  public Product showProduct(int pid);
  public List<Product> showAll();
}
