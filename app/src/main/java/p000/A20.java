package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class A20 extends Handler {

    /* renamed from: a */
    public final C9108dO1 f22a;

    /* renamed from: b */
    public final int f23b;

    /* renamed from: c */
    public final C6741rP f24c;

    /* renamed from: d */
    public boolean f25d;

    public A20(C6741rP c6741rP, Looper looper) {
        super(looper);
        this.f24c = c6741rP;
        this.f23b = 10;
        this.f22a = new C9108dO1(20, false);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                CA0 ca0M17563C = this.f22a.m17563C();
                if (ca0M17563C == null) {
                    synchronized (this) {
                        ca0M17563C = this.f22a.m17563C();
                        if (ca0M17563C == null) {
                            this.f25d = false;
                            return;
                        }
                    }
                }
                this.f24c.m24328c(ca0M17563C);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f23b);
            if (!sendMessage(obtainMessage())) {
                throw new C6838sg("Could not send handler message");
            }
            this.f25d = true;
        } catch (Throwable th) {
            this.f25d = false;
            throw th;
        }
    }
}
