package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: q9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6594q9 implements Runnable {
    public static Handler f;
    public final /* synthetic */ AbstractC6784r9 e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final C7284tm0 a = new C7284tm0(this, new CallableC5290jK(3, this));

    public RunnableC6594q9(AbstractC6784r9 abstractC6784r9) {
        this.e = abstractC6784r9;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (RunnableC6594q9.class) {
            try {
                if (f == null) {
                    f = new Handler(Looper.getMainLooper());
                }
                handler = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new WZ(this, obj, false, 10));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.e();
    }
}
