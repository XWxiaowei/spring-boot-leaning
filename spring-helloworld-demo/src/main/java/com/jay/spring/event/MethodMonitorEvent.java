package com.jay.spring.event;

import java.util.EventObject;

/**
 * 定义事件类型，通常的做法是继承 EnventObject,
 * 随着事件的发生，相应的状态通常都封装在此类中。
 * @author xiang.wei
 * @date 2020/5/5 5:13 PM
 */
public class MethodMonitorEvent extends EventObject {

    /**
     * 时间戳，用于记录方法开始执行的时间
     */
    protected long timestamp;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MethodMonitorEvent(Object source) {
        super(source);
    }
}
