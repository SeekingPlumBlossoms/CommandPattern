package com.yb.model;

/**
 * @author 17611
 * @version 1.0
 * @className Invoker
 * @description 负责人
 * @date 2018/12/3 17:30
 **/
public class Invoker {
    private Command command;

    public void setCommand(Command _command){
        this.command=_command;
    }
    public void action(){
        this.command.execute();
    }
}
