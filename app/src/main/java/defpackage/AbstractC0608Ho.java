package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: Ho */
/* loaded from: classes2.dex */
public abstract class AbstractC0608Ho {
    public static final ExecutorService a;
    public static final ExecutorService b;
    public static final C6846rT1 c;

    static {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        O90.e(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
        a = executorServiceNewCachedThreadPool;
        ExecutorService executorServiceNewCachedThreadPool2 = Executors.newCachedThreadPool();
        O90.e(executorServiceNewCachedThreadPool2, "newCachedThreadPool(...)");
        b = executorServiceNewCachedThreadPool2;
        c = new C6846rT1(7);
    }
}
