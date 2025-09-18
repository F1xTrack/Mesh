package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: kk0 */
/* loaded from: classes.dex */
public final class HandlerC5560kk0 extends Handler implements Runnable {
    public final int a;
    public final InterfaceC5751lk0 b;
    public final long c;
    public InterfaceC5369jk0 d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ C1857Xo1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5560kk0(C1857Xo1 c1857Xo1, Looper looper, InterfaceC5751lk0 interfaceC5751lk0, InterfaceC5369jk0 interfaceC5369jk0, int i, long j) {
        super(looper);
        this.j = c1857Xo1;
        this.b = interfaceC5751lk0;
        this.d = interfaceC5369jk0;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.i = z;
        this.e = null;
        if (hasMessages(1)) {
            this.h = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.h = true;
                    this.b.s();
                    Thread thread = this.g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.j.c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC5369jk0 interfaceC5369jk0 = this.d;
            interfaceC5369jk0.getClass();
            interfaceC5369jk0.m(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            this.e = null;
            C1857Xo1 c1857Xo1 = this.j;
            ExecutorService executorService = (ExecutorService) c1857Xo1.b;
            HandlerC5560kk0 handlerC5560kk0 = (HandlerC5560kk0) c1857Xo1.c;
            handlerC5560kk0.getClass();
            executorService.execute(handlerC5560kk0);
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.j.c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        InterfaceC5369jk0 interfaceC5369jk0 = this.d;
        interfaceC5369jk0.getClass();
        if (this.h) {
            interfaceC5369jk0.m(this.b, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                interfaceC5369jk0.v(this.b, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                AbstractC6789rA1.e("Unexpected exception handling load completed", e);
                this.j.d = new C6324ok0(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i3 = this.f + 1;
        this.f = i3;
        C3829fk0 c3829fk0O0 = interfaceC5369jk0.o0(this.b, jElapsedRealtime, j, iOException, i3);
        int i4 = c3829fk0O0.a;
        if (i4 == 3) {
            this.j.d = this.e;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f = 1;
            }
            long jMin = c3829fk0O0.b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f - 1) * 1000, 5000);
            }
            C1857Xo1 c1857Xo12 = this.j;
            YN1.f(((HandlerC5560kk0) c1857Xo12.c) == null);
            c1857Xo12.c = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                this.e = null;
                ((ExecutorService) c1857Xo12.b).execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.h;
                this.g = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.e();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.i) {
                return;
            }
            AbstractC6789rA1.e("OutOfMemory error loading stream", e2);
            obtainMessage(3, new C6324ok0(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.i) {
                AbstractC6789rA1.e("Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.i) {
                return;
            }
            AbstractC6789rA1.e("Unexpected exception loading stream", e4);
            obtainMessage(3, new C6324ok0(e4)).sendToTarget();
        }
    }
}
