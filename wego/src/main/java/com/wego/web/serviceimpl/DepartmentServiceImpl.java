package com.wego.web.serviceimpl;

import java.util.List;

import com.wego.web.services.DepartmentService;



public class DepartmentServiceImpl implements DepartmentService{
	private static DepartmentServiceImpl instance = new DepartmentServiceImpl();
	public static DepartmentServiceImpl getInstance() {
		return instance;
	}
	private DepartmentServiceImpl() {}
	
	
	@Override
	public List<String> findDName() {
		
		return null;
	}

}