package com.huawei.hms.push;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.huawei.hms.push.q */
/* loaded from: classes.dex */
public class C2231q {

    /* renamed from: a */
    private static final Object f19463a = new Object();

    /* renamed from: b */
    private static ThreadPoolExecutor f19464b = new ThreadPoolExecutor(1, 50, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    public static ThreadPoolExecutor m12515a() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (f19463a) {
            threadPoolExecutor = f19464b;
        }
        return threadPoolExecutor;
    }
}
