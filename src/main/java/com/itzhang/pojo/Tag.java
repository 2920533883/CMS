package com.itzhang.pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

/**
 * 分类实体类
 * id 序号
 * name 分类名
 * parent_id 父分类名   一级分类的parent_id为0
 */
public class Tag {
    Integer id;
    String name;
    Integer parent_id;
}
