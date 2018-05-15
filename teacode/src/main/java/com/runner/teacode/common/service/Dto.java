package com.runner.teacode.common.service;

import java.io.Serializable;

public interface Dto {
	
	Serializable mapToEntity(Dto dto);
	
	Dto mapToDto(Serializable entity);

}
