package com.itzhang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品实体类
 * id 序号
 * name 商品名
 * price 商品价格
 * content 商品描述
 * picture 商品照片
 * user 卖家
 * status 商品状态 0待审核 1可销售
 * tag 商品分类
 */
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
