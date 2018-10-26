package quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by Admin on 2018/10/18.
 */
public class ScheduledJob implements  Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.err.println("这是第一个任务 is running…………………………………… ");
    }
}
