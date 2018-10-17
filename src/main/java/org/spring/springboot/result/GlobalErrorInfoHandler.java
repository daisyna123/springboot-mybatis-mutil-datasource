package org.spring.springboot.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @DESCRIPTION 错误码异常处理
 * @AUTHER administrator zhangna
 * @create 2018-09-29
 */
@RestControllerAdvice
public class GlobalErrorInfoHandler {

    @ExceptionHandler(value = GlobalErrorException.class)
    public ResultBody errorHandlerOverJson(HttpServletRequest request, GlobalErrorException excption){
        GlobalErrorInfoInterface globalErrorInfoInterface = excption.getGlobalErrorInfoInterface();
        ResultBody resultBody = new ResultBody(globalErrorInfoInterface);
        return resultBody;
    }
}
