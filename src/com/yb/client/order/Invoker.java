package com.yb.client.order;

/**
 * @author 17611
 * @version 1.0
 * @className Invoker
 * @description 负责人
 * @date 2018/12/3 15:20
 **/
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public  void  action(){
        command.execute();
    }
}
