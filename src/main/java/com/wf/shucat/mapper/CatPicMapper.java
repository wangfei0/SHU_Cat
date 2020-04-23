/**
 * Copyright (C), 2015-2020, 王飞
 * FileName: CatPicMapper
 * Author:   WF
 * Date:     2020/4/23 17:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.shucat.mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author WF
 * @create 2020/4/23
 * @since 1.0.0
 */
public interface CatPicMapper {
    public List<String> findPicById(Integer id);
}
