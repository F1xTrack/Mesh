package com.huawei.hms.opendevice;

import defpackage.AbstractC8235ym;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class c implements ThreadFactory {
    private final ThreadGroup a;
    private int b = 1;
    private final String c;

    public c(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.c = AbstractC8235ym.i(str, "-pool-");
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        synchronized (this) {
            this.b++;
        }
        Thread thread = new Thread(this.a, runnable, this.c + this.b, 0L);
        thread.setUncaughtExceptionHandler(null);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
