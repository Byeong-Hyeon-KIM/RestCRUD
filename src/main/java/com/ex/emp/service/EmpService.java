package com.ex.emp.service;

import java.util.HashMap;
import java.util.List;

import com.ex.emp.vo.EmpVo;

public interface EmpService {

	List<EmpVo> getAllEmp(); // 모든 직원 조회

	EmpVo getEmpByEmpno(int empno); // 사번으로 직원검색

	List<EmpVo> insertEmp(HashMap<String, Object> map); // 직원 추가

	void updateEmp(HashMap<String, Object> map);

}
