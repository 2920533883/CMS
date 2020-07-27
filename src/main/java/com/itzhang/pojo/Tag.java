package com.itzhang.pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tag {
    Integer id;
    String name;
    Integer parent_id;
}
