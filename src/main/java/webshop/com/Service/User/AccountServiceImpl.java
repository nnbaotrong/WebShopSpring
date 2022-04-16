package webshop.com.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webshop.com.Dao.UsersDao;
import webshop.com.Entity.Users;
@Service
public class AccountServiceImpl implements IAccountService {

	@Autowired
	UsersDao userDao = new UsersDao();
	
	@Override
	public int AddAccount(Users user) {
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		return userDao.AddAccount(user);
	}

}
