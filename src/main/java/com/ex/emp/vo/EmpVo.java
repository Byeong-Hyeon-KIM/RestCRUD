package com.ex.emp.vo;

public class EmpVo {
	//Field
	private String ename;
	private String job;
	private String hiredate;
	private int    empno;
	private int    mgr;
	private int    sal;
	private int    comm;
	private int    deptno;
	
	//Constructor
	public EmpVo() {}
	public EmpVo(String ename, String job, String hiredate, int empno, int mgr, int sal, int comm, int deptno) {
		super();
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.empno = empno;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	// toString 
	@Override
	public String toString() {
		return "EmpVo [ename=" + ename + ", job=" + job + ", hiredate=" + hiredate + ", empno=" + empno + ", mgr=" + mgr
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
}