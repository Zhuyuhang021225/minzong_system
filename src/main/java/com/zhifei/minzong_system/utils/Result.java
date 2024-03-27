package com.zhifei.minzong_system.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月21日 11:09
 */
@Data
public class Result<T> {

    private Integer code;

    private T data;

    private String msg;

    public static <T> Result<T> success(T object){
        Result<T> result = new Result<>();
        result.setData(object);
        result.code = 200;
        result.msg = "OK";
        return result;
    }

    public static <T> Result<T> error(String message){
        Result<T> result = new Result<>();
        result.msg = message;
        result.code = 500;

        return result;
    }

}
