package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: q9 */
/* loaded from: classes.dex */
public final class RunnableC6662q9 implements Runnable {

    /* renamed from: f */
    public static Handler f40629f;

    /* renamed from: e */
    public final /* synthetic */ AbstractC6725r9 f40634e;

    /* renamed from: b */
    public volatile int f40631b = 1;

    /* renamed from: c */
    public final AtomicBoolean f40632c = new AtomicBoolean();

    /* renamed from: d */
    public final AtomicBoolean f40633d = new AtomicBoolean();

    /* renamed from: a */
    public final C11203tm0 f40630a = new C11203tm0(this, new CallableC6230jK(3, this));

    public RunnableC6662q9(AbstractC6725r9 abstractC6725r9) {
        this.f40634e = abstractC6725r9;
    }

    /* renamed from: a */
    public final void m23935a(Object obj) {
        Handler handler;
        synchronized (RunnableC6662q9.class) {
            try {
                if (f40629f == null) {
                    f40629f = new Handler(Looper.getMainLooper());
                }
                handler = f40629f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new RunnableC1420WZ(this, obj, false, 10));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40634e.m24164e();
    }
}
