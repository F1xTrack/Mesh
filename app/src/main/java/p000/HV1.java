package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class HV1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4327a;

    /* renamed from: b */
    public final /* synthetic */ EY1 f4328b;

    /* renamed from: c */
    public final /* synthetic */ C8989cV1 f4329c;

    public /* synthetic */ HV1(C8989cV1 c8989cV1, EY1 ey1, int i) {
        this.f4327a = i;
        this.f4328b = ey1;
        this.f4329c = c8989cV1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f4327a) {
            case 0:
                EY1 ey1 = this.f4328b;
                C8989cV1 c8989cV1 = this.f4329c;
                MJ1 mj1 = c8989cV1.f17574e;
                if (mj1 == null) {
                    c8989cV1.mo6070n().f8378g.m24555d("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        Preconditions.checkNotNull(ey1);
                        mj1.mo5320k(ey1);
                        ((C9110dP1) c8989cV1.f11615b).m17598k().m25845F1();
                        c8989cV1.m10743E1(mj1, null, ey1);
                        c8989cV1.m10751M1();
                        break;
                    } catch (RemoteException e) {
                        c8989cV1.mo6070n().f8378g.m24554c(e, "Failed to send app launch to the service");
                        return;
                    }
                }
            default:
                EY1 ey12 = this.f4328b;
                C8989cV1 c8989cV12 = this.f4329c;
                MJ1 mj12 = c8989cV12.f17574e;
                if (mj12 == null) {
                    c8989cV12.mo6070n().f8378g.m24555d("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        Preconditions.checkNotNull(ey12);
                        mj12.mo5313b(ey12);
                        c8989cV12.m10751M1();
                        break;
                    } catch (RemoteException e2) {
                        c8989cV12.mo6070n().f8378g.m24554c(e2, "Failed to send consent settings to the service");
                    }
                }
        }
    }
}
