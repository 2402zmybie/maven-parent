package com.hr.ssm.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class Item {

    private int id;
    private String name;
    private float price;
    private Date createtime;
    private String detail;

}
