/**
 * Copyright (C), 2015-2020, 王飞
 * FileName: CatMapper
 * Author:   WF
 * Date:     2020/4/23 14:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.shucat.mapper;

import com.wf.shucat.bean.Cat;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author WF
 * @create 2020/4/23
 * @since 1.0.0
 */
public interface CatMapper {
    /*获取所有*/
    public List<Cat> findAll();
    /*根据id获取*/
    public Cat findById(Integer id);
}
