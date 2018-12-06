package com.yb.model;

/**
 * @author 17611
 * @version 1.0
 * @className Client
 * @description 场景类
 * @date 2018/12/3 17:55
 **/
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReceiver1();

        Command command = new ConcreteCommand1(receiver);

        invoker.setCommand(command);
        invoker.action();
    }
}
