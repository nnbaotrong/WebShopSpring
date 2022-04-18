package webshop.com.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webshop.com.Dto.CartDto;
import webshop.com.Entity.Bills;

@Service
public interface IBillsService {

	@Autowired
	public int AddBills(Bills bill);

	public void AddBillsDetail(HashMap<Long, CartDto> carts);
}
