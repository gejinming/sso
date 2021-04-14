package com.aaa.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Description：
 * @Author：GJM
 * @Date：2021/4/13 5:46 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser")
    public Object getUser(Authentication authentication){
        //User user = (User)authentication.getPrincipal();
        System.out.println("--------clint-01客户端服务器----------");
        Object principal = authentication.getPrincipal();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        Object details = authentication.getDetails();
        return authentication;
    }


    /**
     *
     * 专业负责人教师的接口
     * @Author:Gjm
     * @Date :2021/4/14 10:14 上午
     * @return java.lang.String
     */

    @PreAuthorize("hasAnyAuthority('teacher:leader:defenseTeacher:join')")
    @RequestMapping("/select")
    public String select(){
        return "这是查询接口";
    }
    /**
     *
     * 专业负责人教师的接口
     * @Author:Gjm
     * @Date :2021/4/14 10:14 上午
     * @return java.lang.String
     */

    @PreAuthorize("hasAnyAuthority('teacher:leader:timeControl:list')")
    @RequestMapping("/dele")
    public String dele(){
        return "这是删除接口";
    }
    /**
     *
     * 指导教师的接口
     * @Author:Gjm
     * @Date :2021/4/14 10:14 上午
     * @return java.lang.String
     */
    @PreAuthorize("hasAnyAuthority('teacher:guider:review:getHistoryDetail')")
    @RequestMapping("/add")
    public String add(){
        return "这是添加接口";
    }
    /**
     *
     * 答辩教师的接口
     * @Author:Gjm
     * @Date :2021/4/14 10:14 上午
     * @return java.lang.String
     */
    @PreAuthorize("hasAnyAuthority('teacher:headman:checker:list')")
    @RequestMapping("/update")
    public String update(){
        return "这是修改接口";
    }

}
