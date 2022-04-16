package webshop.com.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webshop.com.Dto.ProductsDto;

@Service
public interface ICategoryService {
	@Autowired
	public List<ProductsDto> GetAllProductsByID(int id);

	public List<ProductsDto> GetDataProductsPaginates(int id, int start, int totalPage);

	
	
}
