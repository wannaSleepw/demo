package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.context.annotation.Primary;


@Data
public class Book
{
    private Integer id;
    private String type;
    private String name;
    private String description;

}
