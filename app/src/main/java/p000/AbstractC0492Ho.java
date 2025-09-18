package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: Ho */
/* loaded from: classes2.dex */
public abstract class AbstractC0492Ho {

    /* renamed from: a */
    public static final ExecutorService f4509a;

    /* renamed from: b */
    public static final ExecutorService f4510b;

    /* renamed from: c */
    public static final C10910rT1 f4511c;

    static {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        O90.m5967e(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
        f4509a = executorServiceNewCachedThreadPool;
        ExecutorService executorServiceNewCachedThreadPool2 = Executors.newCachedThreadPool();
        O90.m5967e(executorServiceNewCachedThreadPool2, "newCachedThreadPool(...)");
        f4510b = executorServiceNewCachedThreadPool2;
        f4511c = new C10910rT1(7);
    }
}
