package com.guigu.yaopin.xsr.doamin;

public class drugType {

	
		private int typeid;
		private String typename;
		@Override
		public String toString() {
			return "drugType [typeid=" + typeid + ", typename=" + typename + "]";
		}
		public drugType() {
			super();
		}
		public drugType(int typeid, String typename) {
			super();
			this.typeid = typeid;
			this.typename = typename;
		}
		public int getTypeid() {
			return typeid;
		}
		public void setTypeid(int typeid) {
			this.typeid = typeid;
		}
		public String getTypename() {
			return typename;
		}
		public void setTypename(String typename) {
			this.typename = typename;
		}
}
