package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: hV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9634hV1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f28437a;

    /* renamed from: b */
    public /* synthetic */ C8989cV1 f28438b;

    public /* synthetic */ RunnableC9634hV1(int i) {
        this.f28437a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28437a) {
            case 0:
                C8989cV1 c8989cV1 = this.f28438b;
                MJ1 mj1 = c8989cV1.f17574e;
                if (mj1 == null) {
                    c8989cV1.mo6070n().f8378g.m24555d("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        EY1 ey1M10752N1 = c8989cV1.m10752N1(false);
                        Preconditions.checkNotNull(ey1M10752N1);
                        mj1.mo5318h(ey1M10752N1);
                        c8989cV1.m10751M1();
                        break;
                    } catch (RemoteException e) {
                        c8989cV1.mo6070n().f8378g.m24554c(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                C8989cV1 c8989cV12 = this.f28438b;
                MJ1 mj12 = c8989cV12.f17574e;
                if (mj12 == null) {
                    c8989cV12.mo6070n().f8378g.m24555d("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        EY1 ey1M10752N12 = c8989cV12.m10752N1(false);
                        Preconditions.checkNotNull(ey1M10752N12);
                        mj12.mo5309E(ey1M10752N12);
                        c8989cV12.m10751M1();
                        break;
                    } catch (RemoteException e2) {
                        c8989cV12.mo6070n().f8378g.m24554c(e2, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
