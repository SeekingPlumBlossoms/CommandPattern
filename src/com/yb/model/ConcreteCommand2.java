package com.yb.model;

/**
 * @author 17611
 * @version 1.0
 * @className ConcreteCommand2
 * @description 具体命令类2
 * @date 2018/12/3 17:16
 **/
public class ConcreteCommand2 extends Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver _receiver){
        this.receiver=_receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
