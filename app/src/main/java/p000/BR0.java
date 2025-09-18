package p000;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class BR0 implements InterfaceFutureC1105RZ, FR0 {

    /* renamed from: a */
    public final int f810a;

    /* renamed from: b */
    public final int f811b;

    /* renamed from: c */
    public Object f812c;

    /* renamed from: d */
    public InterfaceC10905rR0 f813d;

    /* renamed from: e */
    public boolean f814e;

    /* renamed from: f */
    public boolean f815f;

    /* renamed from: g */
    public boolean f816g;

    /* renamed from: h */
    public C11871z10 f817h;

    public BR0(int i, int i2) {
        this.f810a = i;
        this.f811b = i2;
    }

    @Override // p000.A81
    /* renamed from: b */
    public final void mo78b(J11 j11) throws Throwable {
        j11.m4129n(this.f810a, this.f811b);
    }

    @Override // p000.A81
    /* renamed from: c */
    public final synchronized void mo79c(InterfaceC10905rR0 interfaceC10905rR0) {
        this.f813d = interfaceC10905rR0;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f814e = true;
                notifyAll();
                InterfaceC10905rR0 interfaceC10905rR0 = null;
                if (z) {
                    InterfaceC10905rR0 interfaceC10905rR02 = this.f813d;
                    this.f813d = null;
                    interfaceC10905rR0 = interfaceC10905rR02;
                }
                if (interfaceC10905rR0 != null) {
                    interfaceC10905rR0.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.A81
    /* renamed from: e */
    public final synchronized void mo80e(Object obj) {
    }

    @Override // p000.A81
    /* renamed from: f */
    public final synchronized void mo81f(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return m718j(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.A81
    /* renamed from: h */
    public final synchronized InterfaceC10905rR0 mo83h() {
        return this.f813d;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f814e;
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
            boolean r0 = r1.f814e     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f815f     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f816g     // Catch: java.lang.Throwable -> L10
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
        throw new UnsupportedOperationException("Method not decompiled: p000.BR0.isDone():boolean");
    }

    /* renamed from: j */
    public final synchronized Object m718j(Long l) {
        if (!isDone() && !AbstractC7381Bh1.m810i()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.f814e) {
            throw new CancellationException();
        }
        if (this.f816g) {
            throw new ExecutionException(this.f817h);
        }
        if (this.f815f) {
            return this.f812c;
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
        if (this.f816g) {
            throw new ExecutionException(this.f817h);
        }
        if (this.f814e) {
            throw new CancellationException();
        }
        if (!this.f815f) {
            throw new TimeoutException();
        }
        return this.f812c;
    }

    @Override // p000.FR0
    public final synchronized boolean onLoadFailed(C11871z10 c11871z10, Object obj, A81 a81, boolean z) {
        this.f816g = true;
        this.f817h = c11871z10;
        notifyAll();
        return false;
    }

    @Override // p000.FR0
    public final synchronized boolean onResourceReady(Object obj, Object obj2, A81 a81, EnumC1460XC enumC1460XC, boolean z) {
        this.f815f = true;
        this.f812c = obj;
        notifyAll();
        return false;
    }

    public final String toString() {
        InterfaceC10905rR0 interfaceC10905rR0;
        String str;
        String strM8593l = AbstractC1374Vq.m8593l(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                interfaceC10905rR0 = null;
                if (this.f814e) {
                    str = "CANCELLED";
                } else if (this.f816g) {
                    str = "FAILURE";
                } else if (this.f815f) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    interfaceC10905rR0 = this.f813d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC10905rR0 == null) {
            return AbstractC1374Vq.m8589h(strM8593l, str, "]");
        }
        return strM8593l + str + ", request=[" + interfaceC10905rR0 + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return m718j(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onDestroy() {
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStart() {
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStop() {
    }

    @Override // p000.A81
    /* renamed from: a */
    public final void mo77a(J11 j11) {
    }

    @Override // p000.A81
    /* renamed from: g */
    public final void mo82g(Drawable drawable) {
    }

    @Override // p000.A81
    /* renamed from: i */
    public final void mo84i(Drawable drawable) {
    }
}
