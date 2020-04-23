/**
 * Copyright (C), 2015-2020, 王飞
 * FileName: CatPicController
 * Author:   WF
 * Date:     2020/4/23 17:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.shucat.controller;

import com.wf.shucat.service.ICatPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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
@RequestMapping("/catpic")
public class CatPicController {
    @Autowired
    ICatPicService iCatPicService;

    @GetMapping("/{id}")
    public Map findPicById(@PathVariable Integer id){
        Map<Object,Object> resMap = new HashMap<>();
        resMap.put("cood",200);
        resMap.put("status","success");
        resMap.put("data",iCatPicService.findPicById(id));
        return resMap;
    }
}
