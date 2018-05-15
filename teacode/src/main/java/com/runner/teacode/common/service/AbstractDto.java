package com.runner.teacode.common.service;

import java.io.Serializable;

import org.modelmapper.ModelMapper;

abstract public class AbstractDto {
	
	static protected ModelMapper mapper = new ModelMapper();
	
//	abstract public Serializable mapToEntity(Dto dto);
//	
//	abstract public Dto mapToDto(Serializable entity);
}
