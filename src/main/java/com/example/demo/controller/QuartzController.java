package com.example.demo.controller;

import org.quartz.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import quartz.MyScheduler;
import quartz.ScheduledJob;
import quartz.ScheduledJob2;

/**
 * Created by Admin on 2018/10/18.
 */
@Controller
public class QuartzController {
//    @Resource(name="multitaskScheduler")
    private Scheduler scheduler2;

//    @Autowired
//    private MyScheduler myScheduler;

    MyScheduler myScheduler =new MyScheduler();

//    @ResponseBody
//    @RequestMapping("/multitask")
//    public String multitask() throws SchedulerException {
//        scheduleJob2(scheduler2);
//        return "多任务";
//
//    }
//    @ResponseBody
//    @RequestMapping("/multitask2")
//    public String multitask2() throws SchedulerException {
//        scheduleJob(scheduler2);
//        return "这个也是多任务";
//    }

    @ResponseBody
    @RequestMapping("/ff")
    public String ff() throws SchedulerException {
        myScheduler.scheduleJobs();
        return "成功";
    }


    //具体的定时任务
    private void scheduleJob2(Scheduler scheduler) throws SchedulerException{
        //配置定时任务对应的Job，这里执行的是ScheduledJob类中定时的方法
        JobDetail jobDetail = JobBuilder.newJob(ScheduledJob.class) .withIdentity("job2", "group1").build();
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/3 * * * * ?");
        // 每3s执行一次
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("trigger2", "group1") .withSchedule(scheduleBuilder).build();
        scheduler.scheduleJob(jobDetail,cronTrigger);
    }

    private void scheduleJob(Scheduler scheduler) throws SchedulerException{
        //配置定时任务对应的Job，这里执行的是ScheduledJob2类中定时的方法
        JobDetail jobDetail = JobBuilder.newJob(ScheduledJob2.class) .withIdentity("job1", "group1").build();
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/6 * * * * ?");
        // 每6s执行一次
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1") .withSchedule(scheduleBuilder).build();
        scheduler.scheduleJob(jobDetail,cronTrigger);
    }

}
