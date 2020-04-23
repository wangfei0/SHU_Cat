/**
 * Copyright (C), 2015-2020, 王飞
 * FileName: CatController
 * Author:   WF
 * Date:     2020/4/23 15:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.shucat.controller;

import com.wf.shucat.service.impl.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author WF
 * @create 2020/4/23
 * @since 1.0.0
 */
@RestController
@RequestMapping("/cat")
public class CatController {
    @Autowired
    CatService catService;

    @GetMapping("findAll")
    public Map findAll(){
        Map<Object, Object> resMap = new HashMap<>();
        resMap.put("code",200);
        resMap.put("status","success");
        resMap.put("data",catService.findAll());
        return resMap;
    }
}
