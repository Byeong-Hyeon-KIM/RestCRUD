package com.ex.emp.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ex.emp.service.EmpService;
import com.ex.emp.vo.EmpVo;

@RestController
@RequestMapping("/") // 루트 url을 /users 로 매핑함. 보통 실무에서는 복수형으로 잡음.
public class EmpController {
	/*
	 * 전체적인 restful 구조는 Uniform interface에 대한 개념이 적용됨. 
	 * 하나의 URL을 이용해서 여러 응답을 가져갈 수 있다는 뜻.
	   /users라는 url로 하나는 GET 하나는 POST로 요청을 보내고
	   또 /users/{userid}라는 url로 GET, PUT, DELETE 메서드 요청을 보내고 있다. 
	 */
	
	
	@Autowired
	private EmpService empService;
	
	// 모든 직원 조회
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<EmpVo> getAllEmp(){
		return empService.getAllEmp();
	}
	
	// 사번으로 직원검색
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public EmpVo getEmpByEmpno() {
		int empno = 7566;
		return empService.getEmpByEmpno(empno);
	}
	
	// 유저 등록
	// uri : localhost:0000/users
	@RequestMapping(value = "/test2", method = RequestMethod.POST)
	public List<EmpVo> createEmp() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		String ename    = "LEE";
		String job      = "TEACHER";
		int    empno    = 9000;
		int    mgr      = 7839;
		int    sal      = 600;
		int    comm     = 20;
		int    deptno   = 20;
		map.put("ename", ename);
		map.put("job", job);
		map.put("empno", empno);
		map.put("mgr", mgr);
		map.put("sal", sal);
		map.put("comm", comm);
		map.put("deptno", deptno);
/*		EmpVo vo = new EmpVo();
		vo.setEmpno(8000);
		vo.setEname("KIM");
		vo.setJob("STUDENT");
		vo.setMgr(7839);
		vo.setHiredate("SYSDATE");
		vo.setSal(555);
		vo.setComm(100);
		vo.setDeptno(10);*/
		return empService.insertEmp(map);
	}
	
	// 유저 수정
	// uri : localhost:0000/users/{userid} 
	// 수정은 PUT
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public void modifyUser() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		String ename    = "LEE";
		String job      = "TEACHER";
		int    empno    = 8000;
		int    mgr      = 7839;
		int    sal      = 600;
		int    comm     = 20;
		int    deptno   = 20;
		map.put("ename", ename);
		map.put("job", job);
		map.put("empno", empno);
		map.put("mgr", mgr);
		map.put("sal", sal);
		map.put("comm", comm);
		map.put("deptno", deptno);
		empService.updateEmp(map);
	}

/*	// 유저 삭제
	// uri : localhost:0000/users
	@DeleteMapping("/{userid}")
	public void removeUser(@PathVariable String userid) {
		userService.removeUser(userid);
	}*/
}