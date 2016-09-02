package com.example.dao;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath:dao.xml"
})
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testDao() {
		User user = userDao.getUserByName("admin");
		assertEquals(user.getUsername(), "admin");
		
		user.setUserid(1200);
		user.setUsername("chen");
		user.setPassword("xiaofeng");
		userDao.insertUser(user);
		user = userDao.getUserByName("chen");
		assertEquals(user.getUserid(), 1200);
	}

}
