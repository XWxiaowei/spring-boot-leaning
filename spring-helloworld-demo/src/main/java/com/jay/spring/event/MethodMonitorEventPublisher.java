package com.jay.spring.event;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author xiang.wei
 * @date 2020/5/5 5:32 PM
 */
public class MethodMonitorEventPublisher {

    private List<MethodMonitorEventListener> eventListeners = new ArrayList<>();

    public void methodMonitor() throws InterruptedException {
        //定义事件
        MethodMonitorEvent eventObject = new MethodMonitorEvent(this);
        publishEvent("begin", eventObject);
        //模拟方法执行：休眠5秒钟
        TimeUnit.SECONDS.sleep(5);
        publishEvent("end", eventObject);

    }

    public void publishEvent(String status, MethodMonitorEvent event) {
        //避免在事件处理期间，监听器被移除，这里为了安全做了一个复制操作
        List<MethodMonitorEventListener> copyListeners = new ArrayList<>(eventListeners);
        for (MethodMonitorEventListener listener : copyListeners) {
            if ("begin".equals(status)) {
                listener.onMethodBegin(event);
            } else {
                listener.onMethodEnd(event);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MethodMonitorEventPublisher publisher = new MethodMonitorEventPublisher();
        //添加监听器
        publisher.addEventListener(new MethodMonitorEventListenerImpl());
        publisher.methodMonitor();
    }

    public void addEventListener(MethodMonitorEventListener listener) {
        eventListeners.add(listener);
    }

    public void removeEventListener(MethodMonitorEventListener listener) {
        eventListeners.remove(listener);
    }

    public void removeAllListeners() {
        eventListeners.clear();
    }
}
