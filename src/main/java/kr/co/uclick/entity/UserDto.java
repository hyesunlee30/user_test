package kr.co.uclick.entity;

import java.util.List;

public class UserDto {

		private List<User> Users;
		private int firstPage;
		private int lastPage;
		private int totalpage;
		private int prev;
		private int next;
		private int curr;
		private int start;
		private int end;
		
		public int getStart() {
			return start;
		}
		public void setStart(int start) {
			this.start = start;
		}
		public int getEnd() {
			return end;
		}
		public void setEnd(int end) {
			this.end = end;
		}
		public List<User> getUsers() {
			return Users;
		}
		public void setGongjies(List<User> Users) {
			this.Users = Users;
		}
		public int getFirstPage() {
			return firstPage;
		}
		public void setFirstPage(int firstPage) {
			this.firstPage = firstPage;
		}
		public int getLastPage() {
			return lastPage;
		}
		public void setLastPage(int lastPage) {
			this.lastPage = lastPage;
		}
		public int getTotalpage() {
			return totalpage;
		}
		public void setTotalpage(int totalpage) {
			this.totalpage = totalpage;
		}
		public int getPrev() {
			return prev;
		}
		public void setPrev(int prev) {
			this.prev = prev;
		}
		public int getNext() {
			return next;
		}
		public void setNext(int next) {
			this.next = next;
		}
		public int getCurr() {
			return curr;
		}
		public void setCurr(int curr) {
			this.curr = curr;
		}
	}
