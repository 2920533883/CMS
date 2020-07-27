package com.itzhang.pojo;

import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JsonRes {
    int code;
    String message;
    Object data;

}
