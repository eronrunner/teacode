package com.runner.teacode.web.bussiness.exception;

import com.runner.teacode.common.message.ResponseMessage;

public interface BussinessException extends com.runner.teacode.common.exception.BussinessException {

	ResponseMessage message();
}
