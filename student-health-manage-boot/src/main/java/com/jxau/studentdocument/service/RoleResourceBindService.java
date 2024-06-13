package com.jxau.studentdocument.service;

import com.jxau.studentdocument.entity.RoleResourceBind;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoufanxi
 * @since 2024-01-12
 */
public interface RoleResourceBindService extends IService<RoleResourceBind> {

    List<Integer> getRoleIds(Integer resourceId);


    /**
     * 添加绑定信息
     *
     * @param id
     * @param list 列表
     * @return {@link Integer}
     */
    Integer addBindInfo(Integer id, List<Integer> list);

    /**
     * @param resourceId  资源id
     * @return  0 失败  1成功
     */
    Integer deleteBindInfo(Integer resourceId);
}
