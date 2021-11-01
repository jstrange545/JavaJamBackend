package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ApplicationDao;
import com.example.entity.Application;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	ApplicationDao AppDao;
	
	@Override
	public void saveApplication(String name, String email, String exp) {
		// TODO Auto-generated method stub
		Application newApp = new Application(name, email, exp);
		AppDao.save(newApp);
	}

}
