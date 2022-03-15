package com.cjc.crud.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.web.dao.HomeDao;
import com.cjc.crud.web.model.Student;
import com.cjc.crud.web.service.HomeService;

@Service
public class HomeServiceImpl  implements HomeService{

	@Autowired
	HomeDao hd;
	
	public void saveData(Student s) {
		
		hd.saveData(s);
		
	}

}
