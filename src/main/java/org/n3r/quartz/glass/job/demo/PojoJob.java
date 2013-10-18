package org.n3r.quartz.glass.job.demo;

import org.n3r.quartz.glass.job.annotation.GlassJob;
import org.n3r.quartz.glass.log.joblog.JobLogs;
import org.quartz.DisallowConcurrentExecution;

@DisallowConcurrentExecution
public class PojoJob {
    private String orderType;

    @GlassJob(description = "淘宝订单同步", team = "小牛队", created = "2013-10-16")
    public void execute() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JobLogs.info("淘宝订单:" + orderType);
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
