package com.runner.teacode.common.pagination;

public class RequestPageable implements Pageable {
	
	final static public String ASC = "ASC";
	
	final static public String DESC = "DESC";
	
	private String[] keys = {};
	
	private String[] types = {};
	
	private Integer page = 1;
	
	private Integer size = 1;
	
	private String[] dirSort = {};
	
	private String[] sort = {};

	public RequestPageable(String[] keys, String[] types, Integer page, Integer size, String[] dirSort, String[] sort) {
		super();
		this.keys = keys;
		this.types = types;
		this.page = page;
		this.size = size;
		this.dirSort = dirSort;
		this.sort = sort;
	}

	public String[] getKeys() {
		return keys;
	}

	public void setKeys(String[] keys) {
		this.keys = keys;
	}

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String[] getDirSort() {
		return dirSort;
	}

	public void setDirSort(String[] dirSort) {
		this.dirSort = dirSort;
	}

	public String[] getSort() {
		return sort;
	}

	public void setSort(String[] sort) {
		this.sort = sort;
	}

}
