package com.sike.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData<T> {
    private String code;//响应状态码
    private String errorMsg;//用于封装异常信息，正常返回一般为null即可
    private Boolean result;//表示执行成功还是失败
    private T data;//封装返回数据
}
