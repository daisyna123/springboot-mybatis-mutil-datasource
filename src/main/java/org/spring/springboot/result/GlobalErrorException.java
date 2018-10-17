package org.spring.springboot.result;

/**
 * @DESCRIPTION
 * @AUTHER administrator zhangna
 * @create 2018-09-29
 */
public class GlobalErrorException extends  Exception{
    private GlobalErrorInfoInterface globalErrorInfoInterface;

    public GlobalErrorException(GlobalErrorInfoInterface globalErrorInfoInterface) {
        this.globalErrorInfoInterface = globalErrorInfoInterface;
    }

    public GlobalErrorInfoInterface getGlobalErrorInfoInterface() {
        return globalErrorInfoInterface;
    }

    public void setGlobalErrorInfoInterface(GlobalErrorInfoInterface globalErrorInfoInterface) {
        this.globalErrorInfoInterface = globalErrorInfoInterface;
    }


}
