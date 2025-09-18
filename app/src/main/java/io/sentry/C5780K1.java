package io.sentry;

import java.util.TimerTask;

/* renamed from: io.sentry.K1 */
/* loaded from: classes2.dex */
public final class C5780K1 extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ int f33303a;

    /* renamed from: b */
    public final /* synthetic */ C5786M1 f33304b;

    public /* synthetic */ C5780K1(C5786M1 c5786m1, int i) {
        this.f33303a = i;
        this.f33304b = c5786m1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f33303a) {
            case 0:
                C5786M1 c5786m1 = this.f33304b;
                EnumC5809U1 status = c5786m1.getStatus();
                if (status == null) {
                    status = EnumC5809U1.OK;
                }
                c5786m1.mo21434p(status, null);
                c5786m1.f33336k.set(false);
                break;
            default:
                C5786M1 c5786m12 = this.f33304b;
                EnumC5809U1 status2 = c5786m12.getStatus();
                if (status2 == null) {
                    status2 = EnumC5809U1.DEADLINE_EXCEEDED;
                }
                c5786m12.mo21421c(status2, c5786m12.f33343r.f33475e != null, null);
                c5786m12.f33337l.set(false);
                break;
        }
    }
}
