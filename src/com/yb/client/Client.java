package com.yb.client;

import com.yb.client.order.Command;
import com.yb.client.order.Invoker;
import com.yb.client.order.impl.AddRequirementCommand;

/**
 * @author 17611
 * @version 1.0
 * @className Client
 * @description 命令模式测试
 * @date 2018/12/3 10:20
 **/
public class Client {

    public static void main(String[] args) {
        //定义我们的接头人
        Invoker invoker = new Invoker();

        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
