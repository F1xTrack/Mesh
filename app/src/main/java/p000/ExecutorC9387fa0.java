package p000;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: fa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC9387fa0 implements Executor {

    /* renamed from: c */
    public static volatile ExecutorC9387fa0 f27240c;

    /* renamed from: a */
    public final /* synthetic */ int f27241a;

    /* renamed from: b */
    public Object f27242b;

    public ExecutorC9387fa0(int i) {
        this.f27241a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.f27242b = Executors.newFixedThreadPool(2, new ThreadFactoryC4188ha(3));
                break;
        }
    }

    /* renamed from: a */
    public void m18260a() {
        ThreadLocal threadLocal = (ThreadLocal) this.f27242b;
        Integer num = (Integer) threadLocal.get();
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue() - 1;
        if (iIntValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(iIntValue));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f27241a) {
            case 0:
                ((ExecutorService) this.f27242b).execute(runnable);
                return;
            case 1:
                ThreadLocal threadLocal = (ThreadLocal) this.f27242b;
                Integer num = (Integer) threadLocal.get();
                if (num == null) {
                    num = 0;
                }
                int iIntValue = num.intValue() + 1;
                threadLocal.set(Integer.valueOf(iIntValue));
                try {
                    if (iIntValue <= 15) {
                        runnable.run();
                    } else {
                        C0423Gi.f3853d.f3854a.execute(runnable);
                    }
                    m18260a();
                    return;
                } catch (Throwable th) {
                    m18260a();
                    throw th;
                }
            default:
                ((Handler) ((C8539Xo1) this.f27242b).f13982c).post(runnable);
                return;
        }
    }

    public ExecutorC9387fa0(C8539Xo1 c8539Xo1) {
        this.f27241a = 2;
        this.f27242b = c8539Xo1;
    }
}
