package com.guigu.yaopin.xsr.doamin;

public class emp {

		private int empid;
		private String  empname;
		private String  sex;
		private int age; 
		private String phone;
		private int uid;
		public emp() {
			super();
		}
		public emp(int empid, String empname, String sex, int age, String phone, int uid) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.sex = sex;
			this.age = age;
			this.phone = phone;
			this.uid = uid;
		}
		@Override
		public String toString() {
			return "emp [empid=" + empid + ", empname=" + empname + ", sex=" + sex + ", age=" + age + ", phone=" + phone
					+ ", uid=" + uid + "]";
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
}
