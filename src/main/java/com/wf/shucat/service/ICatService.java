/**
 * Copyright (C), 2015-2020, 王飞
 * FileName: ICatService
 * Author:   WF
 * Date:     2020/4/23 17:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.shucat.service;

import com.wf.shucat.bean.Cat;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author WF
 * @create 2020/4/23
 * @since 1.0.0
 */
public interface ICatService {
    public List<Cat> findAll();
}
