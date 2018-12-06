package com.yb.client.order.impl;

import com.yb.client.order.Command;

/**
 * @author 17611
 * @version 1.0
 * @className AddRequirementCommand
 * @description 增加需求的命令
 * @date 2018/12/3 15:16
 **/
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
