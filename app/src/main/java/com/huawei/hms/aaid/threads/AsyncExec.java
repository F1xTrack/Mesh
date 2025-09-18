package com.huawei.hms.aaid.threads;

import com.huawei.hms.opendevice.RunnableC2211o;
import com.huawei.hms.opendevice.ThreadFactoryC2199c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class AsyncExec {

    /* renamed from: a */
    private static final ThreadPoolExecutor f18688a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2199c("SeqIO"), new ThreadPoolExecutor.AbortPolicy());

    public static void submitSeqIO(Runnable runnable) {
        try {
            f18688a.execute(new RunnableC2211o(runnable));
        } catch (Exception e) {
            e.toString();
        }
    }
}
