package ProjectJava.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjectJava.northwind.entitites.concretes.Product;

public interface ProductDao extends JpaRepository <Product,Integer>{

}
