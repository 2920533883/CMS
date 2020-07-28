package com.itzhang.pojo;
import lombok.*;

/**
 * 针对Lay-ui数据表格的Json数据返回
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JsonRes {
    int code;
    String message;
    Object data;

}
