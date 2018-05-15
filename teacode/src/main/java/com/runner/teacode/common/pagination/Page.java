package com.runner.teacode.common.pagination;

import java.util.Collection;

public interface Page<T> {
	
	Integer getCurrent();

	void setCurrent(Integer current);

	Integer getSize();

	void setSize(Integer size);

	Integer getTotal();

	void setTotal(Integer total);

	Collection<T> getContent();

	void setContent(Collection<T> content);
}
