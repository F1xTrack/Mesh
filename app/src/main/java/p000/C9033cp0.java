package p000;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* renamed from: cp0 */
/* loaded from: classes.dex */
public final class C9033cp0 implements Handler.Callback {

    /* renamed from: a */
    public final Handler f25671a;

    /* renamed from: b */
    public final /* synthetic */ C9161dp0 f25672b;

    public C9033cp0(C9161dp0 c9161dp0, InterfaceC7758Io0 interfaceC7758Io0) {
        this.f25672b = c9161dp0;
        Handler handlerM1829n = AbstractC7485Dh1.m1829n(this);
        this.f25671a = handlerM1829n;
        interfaceC7758Io0.mo4014l(this, handlerM1829n);
    }

    /* renamed from: a */
    public final void m17420a(long j) {
        Surface surface;
        C9161dp0 c9161dp0 = this.f25672b;
        if (this != c9161dp0.f26315u2 || c9161dp0.f12090L == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            c9161dp0.f12087J1 = true;
            return;
        }
        try {
            c9161dp0.m8181t0(j);
            c9161dp0.m17757z0(c9161dp0.f26310p2);
            c9161dp0.f12091L1.f13069e++;
            C11962zj1 c11962zj1 = c9161dp0.f26290V1;
            boolean z = c11962zj1.f46961d != 3;
            c11962zj1.f46961d = 3;
            c11962zj1.f46968k.getClass();
            c11962zj1.f46963f = AbstractC7485Dh1.m1802Q(SystemClock.elapsedRealtime());
            if (z && (surface = c9161dp0.f26298d2) != null) {
                C8165Qj1 c8165Qj1 = c9161dp0.f26287S1;
                Handler handler = (Handler) c8165Qj1.f9756a;
                if (handler != null) {
                    handler.post(new RunnableC9844j81(c8165Qj1, surface, SystemClock.elapsedRealtime(), 1));
                }
                c9161dp0.f26301g2 = true;
            }
            c9161dp0.mo8168b0(j);
        } catch (C0531IQ e) {
            c9161dp0.f12089K1 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = AbstractC7485Dh1.f2166a;
        m17420a(((i & 4294967295L) << 32) | (4294967295L & i2));
        return true;
    }
}
