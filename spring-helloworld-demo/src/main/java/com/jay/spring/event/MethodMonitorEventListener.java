package com.jay.spring.event;

import java.util.EventListener;

/**
 * 定义事件监听接口
 * @author xiang.wei
 * @date 2020/5/5 5:24 PM
 */
public interface MethodMonitorEventListener extends EventListener {

    /**
     * 处理方法执行之前发布的事件
     * @param event
     */
    void onMethodBegin(MethodMonitorEvent event);

    /**
     * 处理方法结束时发布的事件
     * @param event
     */
    void onMethodEnd(MethodMonitorEvent event);
}
