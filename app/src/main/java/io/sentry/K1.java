package io.sentry;

import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class K1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ M1 b;

    public /* synthetic */ K1(M1 m1, int i) {
        this.a = i;
        this.b = m1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                M1 m1 = this.b;
                U1 status = m1.getStatus();
                if (status == null) {
                    status = U1.OK;
                }
                m1.p(status, null);
                m1.k.set(false);
                break;
            default:
                M1 m12 = this.b;
                U1 status2 = m12.getStatus();
                if (status2 == null) {
                    status2 = U1.DEADLINE_EXCEEDED;
                }
                m12.c(status2, m12.r.e != null, null);
                m12.l.set(false);
                break;
        }
    }
}
