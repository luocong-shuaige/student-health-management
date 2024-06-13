package com.jxau.studentdocument.dao;

import com.jxau.studentdocument.entity.RoleResourceBind;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhoufanxi
 * @since 2024-01-12
 */
public interface RoleResourceBindMapper extends BaseMapper<RoleResourceBind> {
    Integer addBindInfo(@Param("resourceId") Integer resourceId, @Param("roleList") List<Integer> roleList);


    /**
     * 删除绑定该资源的所有信息
     * @param resourceId  资源id
     * @return  0 失败  1成功
     */
    Integer deleteBindInfo(@Param("resourceId")Integer resourceId);
}
