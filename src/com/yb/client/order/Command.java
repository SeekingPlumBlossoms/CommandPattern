package com.yb.client.order;

import com.yb.client.base.group.CodeGroup;
import com.yb.client.base.group.PageGroup;
import com.yb.client.base.group.RequirementGroup;

/**
 * @author 17611
 * @version 1.0
 * @className Command
 * @description 抽象命令类
 * @date 2018/12/3 10:26
 **/
public abstract class Command {
    /**需求组*/
    protected RequirementGroup rg = new RequirementGroup();
    /**美工组*/
    protected PageGroup pg = new PageGroup();
    /**代码组*/
    protected CodeGroup cg = new CodeGroup();

    /**
     * 命令方法
     */
    public abstract void execute();

}
