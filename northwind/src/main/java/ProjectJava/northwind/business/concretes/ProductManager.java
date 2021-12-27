package ProjectJava.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjectJava.northwind.business.abstracts.ProductService;
import ProjectJava.northwind.core.utilities.results.DataResult;
import ProjectJava.northwind.core.utilities.results.Result;
import ProjectJava.northwind.core.utilities.results.SuccessDataResult;
import ProjectJava.northwind.core.utilities.results.SuccessResult;
import ProjectJava.northwind.dataAccess.abstracts.ProductDao;
import ProjectJava.northwind.entitites.concretes.Product;

@Service
public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	
    @Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi.");
				
				
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi.");
	}

}
