package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class EM1 extends BroadcastReceiver {
    public final C5716lY1 a;
    public boolean b;
    public boolean c;

    public EM1(C5716lY1 c5716lY1) {
        Preconditions.checkNotNull(c5716lY1);
        this.a = c5716lY1;
    }

    public final void a() {
        C5716lY1 c5716lY1 = this.a;
        c5716lY1.g0();
        c5716lY1.p0().v1();
        c5716lY1.p0().v1();
        if (this.b) {
            c5716lY1.n().o.d("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                c5716lY1.l.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                c5716lY1.n().g.c(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C5716lY1 c5716lY1 = this.a;
        c5716lY1.g0();
        String action = intent.getAction();
        c5716lY1.n().o.c(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            c5716lY1.n().j.c(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        C6825rM1 c6825rM1 = c5716lY1.b;
        C5716lY1.w(c6825rM1);
        boolean zE1 = c6825rM1.E1();
        if (this.c != zE1) {
            this.c = zE1;
            c5716lY1.p0().E1(new RunnableC6133nk0(this, zE1));
        }
    }
}
