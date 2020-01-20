package com.dlh.git.user;

/**
 * @author helidi
 * @title: MyUser
 * @projectName FirstIdeaRepo
 * @date 2020/1/20 11:01
 */
public class MyUser {
    public static void mytest() {
        System.out.println("分支1.0");
    }

    public static int testMerge01() {
        System.out.println("master的");
        return 1;
    }
    public static void main(String[] args) {
        mytest();

        testMerge01();
    }
}
