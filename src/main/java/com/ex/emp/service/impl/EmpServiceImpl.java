package com.ex.emp.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.emp.dao.EmpDao;
import com.ex.emp.service.EmpService;
import com.ex.emp.vo.EmpVo;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpDao empDao;
	
	
	// 모든 직원 조회
	@Override
	public List<EmpVo> getAllEmp() {
		return empDao.getAllEmp();
	}

	// 사번으로 직원검색
	@Override
	public EmpVo getEmpByEmpno(int empno) {
		return empDao.getEmpByEmpno(empno);
	}

	// 직원 추가
	@Override
	public List<EmpVo> insertEmp(HashMap<String, Object> map) {
		return empDao.insertEmp(map);
	}

	@Override
	public void updateEmp(HashMap<String, Object> map) {
		empDao.updateEmp(map);
		
	}

}
