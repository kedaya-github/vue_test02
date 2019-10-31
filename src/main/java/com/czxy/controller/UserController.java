package com.czxy.controller;

import com.czxy.pojo.User;
import com.czxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangjian1
 * @version 1.3
 * @Date 2019/10/18
 * @since 1.2
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        List<User> users = userService.getAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Integer id){
        User user = userService.getById(id);
        return ResponseEntity.ok(user);
    }

    @PutMapping
    public ResponseEntity<Void> updateUser(@RequestBody User user){
        try {
            userService.updateUser(user);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id){
        try {
            userService.deleteUser(id);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/shangchuan")
    public ResponseEntity<Void> shangchan(MultipartFile file , User user) throws IOException {
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());

        file.transferTo(new File("M:\\课堂老师案例代码3\\2019.10.24_Chapter08_npm_Vue全家桶\\123.png"));

        System.out.println(user);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }




}
