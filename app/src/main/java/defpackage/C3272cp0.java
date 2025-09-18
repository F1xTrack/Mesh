package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* renamed from: cp0 */
/* loaded from: classes.dex */
public final class C3272cp0 implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ C3462dp0 b;

    public C3272cp0(C3462dp0 c3462dp0, InterfaceC0687Io0 interfaceC0687Io0) {
        this.b = c3462dp0;
        Handler handlerN = AbstractC0277Dh1.n(this);
        this.a = handlerN;
        interfaceC0687Io0.l(this, handlerN);
    }

    public final void a(long j) {
        Surface surface;
        C3462dp0 c3462dp0 = this.b;
        if (this != c3462dp0.u2 || c3462dp0.L == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            c3462dp0.J1 = true;
            return;
        }
        try {
            c3462dp0.t0(j);
            c3462dp0.z0(c3462dp0.p2);
            c3462dp0.L1.e++;
            C8418zj1 c8418zj1 = c3462dp0.V1;
            boolean z = c8418zj1.d != 3;
            c8418zj1.d = 3;
            c8418zj1.k.getClass();
            c8418zj1.f = AbstractC0277Dh1.Q(SystemClock.elapsedRealtime());
            if (z && (surface = c3462dp0.d2) != null) {
                C1296Qj1 c1296Qj1 = c3462dp0.S1;
                Handler handler = (Handler) c1296Qj1.a;
                if (handler != null) {
                    handler.post(new RunnableC5256j81(c1296Qj1, surface, SystemClock.elapsedRealtime(), 1));
                }
                c3462dp0.g2 = true;
            }
            c3462dp0.b0(j);
        } catch (IQ e) {
            c3462dp0.K1 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = AbstractC0277Dh1.a;
        a(((i & 4294967295L) << 32) | (4294967295L & i2));
        return true;
    }
}
