/**
 * Copyright (C), 2015-2020, 王飞
 * FileName: CatPivService
 * Author:   WF
 * Date:     2020/4/23 17:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.shucat.service.impl;

import com.wf.shucat.mapper.CatPicMapper;
import com.wf.shucat.service.ICatPicService;
import com.wf.shucat.service.ICatService;
import org.springframework.beans.factory.annotation.Autowired;
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
@Service
public class CatPicService implements ICatPicService {
    @Autowired
    CatPicMapper catPicMapper;

    @Override
    public List<String> findPicById(Integer id) {
        return catPicMapper.findPicById(id);
    }
}
