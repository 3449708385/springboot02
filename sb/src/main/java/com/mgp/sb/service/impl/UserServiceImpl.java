package com.mgp.sb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mgp.sb.beans.User;
import com.mgp.sb.onedao.UserDaoOne;
import com.mgp.sb.service.UserService;
import com.mgp.sb.twodao.UserDaoTwo;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired(required=false)@Qualifier("userDaoOne")
	private UserDaoOne userDaoOne;
	
	@Autowired(required=false)@Qualifier("userDaoTwo")
	private UserDaoTwo userDaoTwo;

	@Override
	public int insert(User user) {
		return userDaoOne.insertXml(user);
	}

	@Override
	@Transactional
	public int test(User user) {
		System.out.println("1"+userDaoOne);
		System.out.println("2"+userDaoTwo);	
		userDaoOne.insert(user);
		userDaoTwo.insert(user);
		
		int c=1/0;
		return 0;
	}

}
