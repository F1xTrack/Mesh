package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class A20 extends Handler {
    public final C3383dO1 a;
    public final int b;
    public final C6832rP c;
    public boolean d;

    public A20(C6832rP c6832rP, Looper looper) {
        super(looper);
        this.c = c6832rP;
        this.b = 10;
        this.a = new C3383dO1(20, false);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                CA0 ca0C = this.a.C();
                if (ca0C == null) {
                    synchronized (this) {
                        ca0C = this.a.C();
                        if (ca0C == null) {
                            this.d = false;
                            return;
                        }
                    }
                }
                this.c.c(ca0C);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.b);
            if (!sendMessage(obtainMessage())) {
                throw new C7074sg("Could not send handler message");
            }
            this.d = true;
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }
}
