package com.ex.emp.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ex.emp.dao.EmpDao;
import com.ex.emp.vo.EmpVo;

@Repository
public class EmpDaoImpl implements EmpDao {

	@Autowired
	private SqlSession sqlSession;
	
	// 모든 직원 조회
	@Override
	public List<EmpVo> getAllEmp() {
		return sqlSession.selectList("emp.getAll");
	}

	// 사번으로 직원검색
	@Override
	public EmpVo getEmpByEmpno(int empno) {
		return sqlSession.selectOne("emp.getEmpByEmpno", empno);
	}

	// 직원 추가
	@Override
	public List<EmpVo> insertEmp(HashMap<String, Object> map) {
		System.out.println(map);
		sqlSession.insert("emp.createEmp", map);
	
		return sqlSession.selectList("emp.getAll");
	}

	@Override
	public void updateEmp(HashMap<String, Object> map) {
		System.out.println("업뎃맵 :" + map);
		sqlSession.update("emp.updateEmp", map);
	}
}
