package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: fa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC3799fa0 implements Executor {
    public static volatile ExecutorC3799fa0 c;
    public final /* synthetic */ int a;
    public Object b;

    public ExecutorC3799fa0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.b = Executors.newFixedThreadPool(2, new ThreadFactoryC4180ha(3));
                break;
        }
    }

    public void a() {
        ThreadLocal threadLocal = (ThreadLocal) this.b;
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
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                return;
            case 1:
                ThreadLocal threadLocal = (ThreadLocal) this.b;
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
                        C0512Gi.d.a.execute(runnable);
                    }
                    a();
                    return;
                } catch (Throwable th) {
                    a();
                    throw th;
                }
            default:
                ((Handler) ((C1857Xo1) this.b).c).post(runnable);
                return;
        }
    }

    public ExecutorC3799fa0(C1857Xo1 c1857Xo1) {
        this.a = 2;
        this.b = c1857Xo1;
    }
}
