package org.spring.springboot.constant;

import org.spring.springboot.result.GlobalErrorInfoInterface;

/**
 * Created by administrator on 2018-09-29.
 */
public enum GlobalErrorInfoEnum implements GlobalErrorInfoInterface {
   SUCCESS("0","success") ,
    NOT_FOUND("01","service not found");

   private String  code;

   private String message;

    GlobalErrorInfoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
