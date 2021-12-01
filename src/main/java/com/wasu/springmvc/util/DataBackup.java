package com.wasu.springmvc.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataBackup {
    public void backup() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
    }
}
