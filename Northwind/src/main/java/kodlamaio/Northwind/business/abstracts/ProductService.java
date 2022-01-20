package kodlamaio.Northwind.business.abstracts;

import java.util.List;



import kodlamaio.Northwind.entities.concretes.Product;
import kodlamaio.Northwind.core.utilities.results.DataResult;
import kodlamaio.Northwind.core.utilities.results.Result;

public interface ProductService {
	DataResult< List<Product>> getAll();
	DataResult< List<Product>> getAll(int pageNo,int pageSize);
	DataResult< List<Product>> getAllSorted();
	Result add(Product product);
	

	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	DataResult<List<Product>>  getByCategoryIn(List<Integer> categroies);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>>  getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	
	
	
	
	

}
