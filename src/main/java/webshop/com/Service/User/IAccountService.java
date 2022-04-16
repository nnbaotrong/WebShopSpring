package webshop.com.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webshop.com.Entity.Users;
@Service
public interface IAccountService {

	@Autowired
	public int AddAccount(Users user);
}
