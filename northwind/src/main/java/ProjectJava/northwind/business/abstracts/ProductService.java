package ProjectJava.northwind.business.abstracts;

import java.util.List;

import ProjectJava.northwind.core.utilities.results.DataResult;
import ProjectJava.northwind.core.utilities.results.Result;
import ProjectJava.northwind.entitites.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);

}
