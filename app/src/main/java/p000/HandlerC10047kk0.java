package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: kk0 */
/* loaded from: classes.dex */
public final class HandlerC10047kk0 extends Handler implements Runnable {

    /* renamed from: a */
    public final int f36647a;

    /* renamed from: b */
    public final InterfaceC10175lk0 f36648b;

    /* renamed from: c */
    public final long f36649c;

    /* renamed from: d */
    public InterfaceC9919jk0 f36650d;

    /* renamed from: e */
    public IOException f36651e;

    /* renamed from: f */
    public int f36652f;

    /* renamed from: g */
    public Thread f36653g;

    /* renamed from: h */
    public boolean f36654h;

    /* renamed from: i */
    public volatile boolean f36655i;

    /* renamed from: j */
    public final /* synthetic */ C8539Xo1 f36656j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC10047kk0(C8539Xo1 c8539Xo1, Looper looper, InterfaceC10175lk0 interfaceC10175lk0, InterfaceC9919jk0 interfaceC9919jk0, int i, long j) {
        super(looper);
        this.f36656j = c8539Xo1;
        this.f36648b = interfaceC10175lk0;
        this.f36650d = interfaceC9919jk0;
        this.f36647a = i;
        this.f36649c = j;
    }

    /* renamed from: a */
    public final void m22250a(boolean z) {
        this.f36655i = z;
        this.f36651e = null;
        if (hasMessages(1)) {
            this.f36654h = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f36654h = true;
                    this.f36648b.mo402s();
                    Thread thread = this.f36653g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.f36656j.f13982c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC9919jk0 interfaceC9919jk0 = this.f36650d;
            interfaceC9919jk0.getClass();
            interfaceC9919jk0.mo2001m(this.f36648b, jElapsedRealtime, jElapsedRealtime - this.f36649c, true);
            this.f36650d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f36655i) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            this.f36651e = null;
            C8539Xo1 c8539Xo1 = this.f36656j;
            ExecutorService executorService = (ExecutorService) c8539Xo1.f13981b;
            HandlerC10047kk0 handlerC10047kk0 = (HandlerC10047kk0) c8539Xo1.f13982c;
            handlerC10047kk0.getClass();
            executorService.execute(handlerC10047kk0);
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f36656j.f13982c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f36649c;
        InterfaceC9919jk0 interfaceC9919jk0 = this.f36650d;
        interfaceC9919jk0.getClass();
        if (this.f36654h) {
            interfaceC9919jk0.mo2001m(this.f36648b, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                interfaceC9919jk0.mo2004v(this.f36648b, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                AbstractC10872rA1.m24172e("Unexpected exception handling load completed", e);
                this.f36656j.f13983d = new C10559ok0(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f36651e = iOException;
        int i3 = this.f36652f + 1;
        this.f36652f = i3;
        C9407fk0 c9407fk0Mo2002o0 = interfaceC9919jk0.mo2002o0(this.f36648b, jElapsedRealtime, j, iOException, i3);
        int i4 = c9407fk0Mo2002o0.f27363a;
        if (i4 == 3) {
            this.f36656j.f13983d = this.f36651e;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f36652f = 1;
            }
            long jMin = c9407fk0Mo2002o0.f27364b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f36652f - 1) * 1000, 5000);
            }
            C8539Xo1 c8539Xo12 = this.f36656j;
            YN1.m9281f(((HandlerC10047kk0) c8539Xo12.f13982c) == null);
            c8539Xo12.f13982c = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                this.f36651e = null;
                ((ExecutorService) c8539Xo12.f13981b).execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f36654h;
                this.f36653g = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f36648b.getClass().getSimpleName()));
                try {
                    this.f36648b.mo388e();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f36653g = null;
                Thread.interrupted();
            }
            if (this.f36655i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f36655i) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.f36655i) {
                return;
            }
            AbstractC10872rA1.m24172e("OutOfMemory error loading stream", e2);
            obtainMessage(3, new C10559ok0(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.f36655i) {
                AbstractC10872rA1.m24172e("Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.f36655i) {
                return;
            }
            AbstractC10872rA1.m24172e("Unexpected exception loading stream", e4);
            obtainMessage(3, new C10559ok0(e4)).sendToTarget();
        }
    }
}
