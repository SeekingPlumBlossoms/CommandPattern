package com.yb.client.order.impl;

import com.yb.client.order.Command;

/**
 * @author 17611
 * @version 1.0
 * @className DeletePageCommand
 * @description 删除页面需求
 * @date 2018/12/3 15:17
 **/
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
