package com.jxau.studentdocument.utils.DTO;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
public class Condition {

    /**
     * 每页条数
     */
    private int pageSize;

    /**
     * 页码
     */
    private int pageNum;

    private String userId;

    private String role;

    /**
     * 查询条件对象
     */
    private List<Clause> clauses = new ArrayList<Clause>();

    /**
     * 排序map
     */
    private Map<String, Object> sortMap = new HashMap<String, Object>();

}
