package com.huy.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String message;
}
