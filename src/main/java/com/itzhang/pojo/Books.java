package com.itzhang.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    Integer id;
    String name, price, content, picture;
    String user;
    Integer status;
    String  tag;
}
