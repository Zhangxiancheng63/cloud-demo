package com.zxc.sericefeign;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHiImpl implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,error!";
    }
}
