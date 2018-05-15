package com.runner.teacode.common.pagination;

import java.util.Collection;

public class RequestPage<T> implements Page<T> {
	
	private Integer current;
	
	private Integer size;
	
	private Integer total;
	
	private Collection<T> content;

	public RequestPage(Integer current, Integer size, Integer total, Collection<T> content) {
		super();
		this.current = current;
		this.size = size;
		this.total = total;
		this.content = content;
	}

	public Integer getCurrent() {
		return current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Collection<T> getContent() {
		return content;
	}

	public void setContent(Collection<T> content) {
		this.content = content;
	}
	
}
