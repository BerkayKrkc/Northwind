package ProjectJava.northwind.business.abstracts;

import java.util.List;



import ProjectJava.northwind.core.utilities.results.DataResult;
import ProjectJava.northwind.core.utilities.results.Result;
import ProjectJava.northwind.entitites.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAll(int pageNo,int pageSize);
	DataResult<List<Product>> getAllSorted();
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategoryId(String productName,int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName,int categoryId);

	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategory(String productName,int categoryId);


}
