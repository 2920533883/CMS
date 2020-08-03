package com.itzhang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * id 序号
 * name 留言用户名
 * content 留言内容
 * create_time 留言时间
 */
public class Message {
    Integer id;
    String name;
    String content;
    String create_time;
}
