package com.xiaofeng.example.collect.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Auther: 晓枫
 * @Date: 2019/1/21 22:33
 * @Description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Accessors(chain=true)
public class CollectEntity {

    private Integer id;
    //用户Id
    private Integer userId;
    //名称
    private String title;
    //url
    private String url;
}
