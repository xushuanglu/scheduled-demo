package com.scheduled;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: ScheduledTasks
 * DATE: 2021/1/21
 * TIME: 0:47
 * JDK 11
 */

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName ScheduledTasks
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/21
 * @Time 0:47
 * @Version v1.0
 **/
@Component
public class ScheduledTasks {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 任务调度：每隔一秒执行一次
     */
    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime(){
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }

}
