package ctgu.awt.entity;

import java.util.List;

import ctgu.awt.frame.homepage.item.Default;

/*
 * @author 孙超
 * 实现分页效果 
 */
public class PageBean {
	private int pageCode; // 当前页码
//	private int totalPage; 			// 总页数
	private int totalRecord; // 总记录数
	private int pageSize; // 每页记录数
	private List<Default> beanList; // 当前页记录

	public int getPageCode() {
		return pageCode;
	}

	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}

	/*
	 * 计算总页数
	 */
	public int getTotalPage() {
		int tp = totalRecord / pageSize;
		return totalRecord % pageSize == 0 ? tp : tp + 1;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<Default> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<Default> beanList) {
		this.beanList = beanList;
	}

}
