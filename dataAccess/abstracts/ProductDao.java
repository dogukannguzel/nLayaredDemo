package nLayeredDemo.dataAccess.abstracts;

import nLayeredDemo.entities.concrete.Product;


import java.util.List;

public interface ProductDao {
    void add(Product product);
    void uptade(Product product);
    void delete(Product product);
    Product get(int id);
    List<Product> getAll();

}