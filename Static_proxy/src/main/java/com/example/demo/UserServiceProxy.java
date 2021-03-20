package com.example.demo;

public class UserServiceProxy  implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {

        log("add");
        userService.delete();
    }

    @Override
    public void update() {

        log("add");
        userService.update();
    }

    @Override
    public void query() {

        log("add");
        userService.query();
    }

    public void log(String msg){
        System.out.println("使用了"+msg);
    }
}
