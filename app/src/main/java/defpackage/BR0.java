package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class BR0 implements RZ, FR0 {
    public final int a;
    public final int b;
    public Object c;
    public InterfaceC6839rR0 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public C8283z10 h;

    public BR0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.A81
    public final void b(J11 j11) throws Throwable {
        j11.n(this.a, this.b);
    }

    @Override // defpackage.A81
    public final synchronized void c(InterfaceC6839rR0 interfaceC6839rR0) {
        this.d = interfaceC6839rR0;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.e = true;
                notifyAll();
                InterfaceC6839rR0 interfaceC6839rR0 = null;
                if (z) {
                    InterfaceC6839rR0 interfaceC6839rR02 = this.d;
                    this.d = null;
                    interfaceC6839rR0 = interfaceC6839rR02;
                }
                if (interfaceC6839rR0 != null) {
                    interfaceC6839rR0.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.A81
    public final synchronized void e(Object obj) {
    }

    @Override // defpackage.A81
    public final synchronized void f(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return j(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.A81
    public final synchronized InterfaceC6839rR0 h() {
        return this.d;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.g     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BR0.isDone():boolean");
    }

    public final synchronized Object j(Long l) {
        if (!isDone() && !AbstractC0121Bh1.i()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.e) {
            throw new CancellationException();
        }
        if (this.g) {
            throw new ExecutionException(this.h);
        }
        if (this.f) {
            return this.c;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.g) {
            throw new ExecutionException(this.h);
        }
        if (this.e) {
            throw new CancellationException();
        }
        if (!this.f) {
            throw new TimeoutException();
        }
        return this.c;
    }

    @Override // defpackage.FR0
    public final synchronized boolean onLoadFailed(C8283z10 c8283z10, Object obj, A81 a81, boolean z) {
        this.g = true;
        this.h = c8283z10;
        notifyAll();
        return false;
    }

    @Override // defpackage.FR0
    public final synchronized boolean onResourceReady(Object obj, Object obj2, A81 a81, XC xc, boolean z) {
        this.f = true;
        this.c = obj;
        notifyAll();
        return false;
    }

    public final String toString() {
        InterfaceC6839rR0 interfaceC6839rR0;
        String str;
        String strL = AbstractC1705Vq.l(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                interfaceC6839rR0 = null;
                if (this.e) {
                    str = "CANCELLED";
                } else if (this.g) {
                    str = "FAILURE";
                } else if (this.f) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    interfaceC6839rR0 = this.d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6839rR0 == null) {
            return AbstractC1705Vq.h(strL, str, "]");
        }
        return strL + str + ", request=[" + interfaceC6839rR0 + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return j(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onDestroy() {
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStart() {
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStop() {
    }

    @Override // defpackage.A81
    public final void a(J11 j11) {
    }

    @Override // defpackage.A81
    public final void g(Drawable drawable) {
    }

    @Override // defpackage.A81
    public final void i(Drawable drawable) {
    }
}
