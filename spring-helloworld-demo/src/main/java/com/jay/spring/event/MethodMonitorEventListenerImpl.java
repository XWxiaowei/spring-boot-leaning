package com.jay.spring.event;

/**
 * 事件监听接口的实现：如何处理
 * @author xiang.wei
 * @date 2020/5/5 5:29 PM
 */
public class MethodMonitorEventListenerImpl implements MethodMonitorEventListener {


    @Override
    public void onMethodBegin(MethodMonitorEvent event) {
        //记录方法开始执行时的时间
        event.timestamp = System.currentTimeMillis();
    }

    @Override
    public void onMethodEnd(MethodMonitorEvent event) {
        //计算耗时
        long duration = System.currentTimeMillis() - event.timestamp;
        System.out.println("总耗时：" + duration+" ms");
    }
}
