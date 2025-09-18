package com.huawei.hms.hatool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.huawei.hms.hatool.b0 */
/* loaded from: classes.dex */
public class C2132b0 {

    /* renamed from: b */
    private static C2132b0 f19142b;

    /* renamed from: c */
    private static C2132b0 f19143c;

    /* renamed from: d */
    private static C2132b0 f19144d;

    /* renamed from: a */
    private ThreadPoolExecutor f19145a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000), new b());

    /* renamed from: com.huawei.hms.hatool.b0$a */
    public static class a implements Runnable {

        /* renamed from: a */
        private Runnable f19146a;

        public a(Runnable runnable) {
            this.f19146a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f19146a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    C2186v.m12275e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    /* renamed from: com.huawei.hms.hatool.b0$b */
    public static class b implements ThreadFactory {

        /* renamed from: d */
        private static final AtomicInteger f19147d = new AtomicInteger(1);

        /* renamed from: a */
        private final ThreadGroup f19148a;

        /* renamed from: b */
        private final AtomicInteger f19149b = new AtomicInteger(1);

        /* renamed from: c */
        private final String f19150c;

        public b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f19148a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f19150c = "FormalHASDK-base-" + f19147d.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(this.f19148a, runnable, this.f19150c + this.f19149b.getAndIncrement(), 0L);
        }
    }

    static {
        new C2132b0();
        new C2132b0();
        f19142b = new C2132b0();
        f19143c = new C2132b0();
        f19144d = new C2132b0();
    }

    private C2132b0() {
    }

    /* renamed from: a */
    public static C2132b0 m11926a() {
        return f19144d;
    }

    /* renamed from: b */
    public static C2132b0 m11927b() {
        return f19143c;
    }

    /* renamed from: c */
    public static C2132b0 m11928c() {
        return f19142b;
    }

    /* renamed from: a */
    public void m11929a(InterfaceRunnableC2146g interfaceRunnableC2146g) {
        try {
            this.f19145a.execute(new a(interfaceRunnableC2146g));
        } catch (RejectedExecutionException unused) {
            C2186v.m12275e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
