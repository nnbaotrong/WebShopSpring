package webshop.com.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webshop.com.Dao.ProductsDao;
import webshop.com.Dto.ProductsDto;

@Service
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	private ProductsDao productsDao;

	@Override
	public List<ProductsDto> GetAllProductsByID(int id) {
		return productsDao.GetAllProductsByID(id);
	}

	@Override
	public List<ProductsDto> GetDataProductsPaginates(int id, int start, int totalPage) {
		return productsDao.GetDataProductsPaginates(id, start, totalPage);
	}

}
