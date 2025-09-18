package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class EM1 extends BroadcastReceiver {

    /* renamed from: a */
    public final C10152lY1 f2672a;

    /* renamed from: b */
    public boolean f2673b;

    /* renamed from: c */
    public boolean f2674c;

    public EM1(C10152lY1 c10152lY1) {
        Preconditions.checkNotNull(c10152lY1);
        this.f2672a = c10152lY1;
    }

    /* renamed from: a */
    public final void m2198a() {
        C10152lY1 c10152lY1 = this.f2672a;
        c10152lY1.m22488g0();
        c10152lY1.mo6071p0().mo7681v1();
        c10152lY1.mo6071p0().mo7681v1();
        if (this.f2673b) {
            c10152lY1.mo6070n().f8386o.m24555d("Unregistering connectivity change receiver");
            this.f2673b = false;
            this.f2674c = false;
            try {
                c10152lY1.f37134l.f26031a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                c10152lY1.mo6070n().f8378g.m24554c(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C10152lY1 c10152lY1 = this.f2672a;
        c10152lY1.m22488g0();
        String action = intent.getAction();
        c10152lY1.mo6070n().f8386o.m24554c(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            c10152lY1.mo6070n().f8381j.m24554c(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        C10896rM1 c10896rM1 = c10152lY1.f37124b;
        C10152lY1.m22451w(c10896rM1);
        boolean zM24323E1 = c10896rM1.m24323E1();
        if (this.f2674c != zM24323E1) {
            this.f2674c = zM24323E1;
            c10152lY1.mo6071p0().m25412E1(new RunnableC10431nk0(this, zM24323E1));
        }
    }
}
