package com.sike.controller;

import com.sike.dao.UserDao;
import com.sike.entity.ResponseData;
import com.sike.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/exception")
@RestController
public class ExceptionController {

    @GetMapping("/test1")
    public ResponseData test1() {
        int[] arr= {1,2,3};
        arr=null;
        System.out.println(arr[0]);//发生空指针异常
        //以下是正常业务代码
        Map<Integer, User> users=UserDao.findAllUsers();
        return new ResponseData("200",null,true,users);
    }

    @GetMapping("/test2")
    public ResponseData test2() {
        int[] arr= {1,2,3};
        System.out.println(arr[3]);//发生越界针异常
        //以下是正常业务代码
        Map<Integer, User> users=UserDao.findAllUsers();
        return new ResponseData("200",null,true,users);
    }

    @GetMapping("/test3")
    public ResponseData test3() {
        int[] arr= {1,2,3};
        int i=10/0; //发生算术异常
        //以下是正常业务代码
        Map<Integer, User> users=UserDao.findAllUsers();
        return new ResponseData("200",null,true,users);
    }

    @GetMapping("/test4")
    public ResponseData test4() {

        Map<Integer, User> users=UserDao.findAllUsers();
        return new ResponseData("200",null,true,users);
    }

}
