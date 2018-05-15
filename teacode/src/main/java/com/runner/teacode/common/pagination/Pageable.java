package com.runner.teacode.common.pagination;

public interface Pageable {
	
	String[] getKeys();

	void setKeys(String[] keys);

	String[] getTypes();

	void setTypes(String[] types);

	Integer getPage();

	void setPage(Integer page);

	Integer getSize();

	void setSize(Integer size);

	String[] getDirSort();

	void setDirSort(String[] dirSort);

	String[] getSort();

	void setSort(String[] sort);
}
