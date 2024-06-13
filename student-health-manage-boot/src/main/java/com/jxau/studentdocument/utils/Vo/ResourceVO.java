package com.jxau.studentdocument.utils.Vo;

import com.jxau.studentdocument.entity.Resources;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@Data
@EqualsAndHashCode(callSuper = false)
public class ResourceVO extends Resources {
    List<ResourceVO> children;
}
