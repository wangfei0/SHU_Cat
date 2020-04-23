/**
 * Copyright (C), 2015-2020, 王飞
 * FileName: CatPic
 * Author:   WF
 * Date:     2020/4/23 17:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.shucat.bean;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author WF
 * @create 2020/4/23
 * @since 1.0.0
 */
public class CatPic {
    private Integer pid;
    private Integer cid;
    private List<String> pics;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }
}
