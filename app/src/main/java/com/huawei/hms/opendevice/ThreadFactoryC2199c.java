package com.huawei.hms.opendevice;

import java.util.concurrent.ThreadFactory;
import p000.AbstractC7222ym;

/* renamed from: com.huawei.hms.opendevice.c */
/* loaded from: classes.dex */
public class ThreadFactoryC2199c implements ThreadFactory {

    /* renamed from: a */
    private final ThreadGroup f19328a;

    /* renamed from: b */
    private int f19329b = 1;

    /* renamed from: c */
    private final String f19330c;

    public ThreadFactoryC2199c(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.f19328a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.f19330c = AbstractC7222ym.m26232i(str, "-pool-");
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        synchronized (this) {
            this.f19329b++;
        }
        Thread thread = new Thread(this.f19328a, runnable, this.f19330c + this.f19329b, 0L);
        thread.setUncaughtExceptionHandler(null);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
