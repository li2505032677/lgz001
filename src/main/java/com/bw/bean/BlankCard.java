package com.bw.bean;

public class BlankCard {
		private String cid;
		private String cname;
		public String getCid() {
			return cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public BlankCard(String cid, String cname) {
			super();
			this.cid = cid;
			this.cname = cname;
		}
		
}
