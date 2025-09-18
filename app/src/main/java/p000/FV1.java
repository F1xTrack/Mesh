package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class FV1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3287a;

    /* renamed from: b */
    public final /* synthetic */ EY1 f3288b;

    /* renamed from: c */
    public final /* synthetic */ C8989cV1 f3289c;

    public /* synthetic */ FV1(C8989cV1 c8989cV1, EY1 ey1, int i) {
        this.f3287a = i;
        this.f3288b = ey1;
        this.f3289c = c8989cV1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3287a) {
            case 0:
                EY1 ey1 = this.f3288b;
                C8989cV1 c8989cV1 = this.f3289c;
                MJ1 mj1 = c8989cV1.f17574e;
                if (mj1 != null) {
                    try {
                        Preconditions.checkNotNull(ey1);
                        mj1.mo5323o(ey1);
                    } catch (RemoteException e) {
                        c8989cV1.mo6070n().f8378g.m24554c(e, "Failed to reset data on the service: remote exception");
                    }
                    c8989cV1.m10751M1();
                    break;
                } else {
                    c8989cV1.mo6070n().f8378g.m24555d("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                EY1 ey12 = this.f3288b;
                C8989cV1 c8989cV12 = this.f3289c;
                MJ1 mj12 = c8989cV12.f17574e;
                if (mj12 == null) {
                    c8989cV12.mo6070n().f8381j.m24555d("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        Preconditions.checkNotNull(ey12);
                        mj12.mo5326u(ey12);
                        c8989cV12.m10751M1();
                        break;
                    } catch (RemoteException e2) {
                        c8989cV12.mo6070n().f8378g.m24554c(e2, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            default:
                EY1 ey13 = this.f3288b;
                C8989cV1 c8989cV13 = this.f3289c;
                MJ1 mj13 = c8989cV13.f17574e;
                if (mj13 == null) {
                    c8989cV13.mo6070n().f8378g.m24555d("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        Preconditions.checkNotNull(ey13);
                        mj13.mo5329z(ey13);
                        c8989cV13.m10751M1();
                        break;
                    } catch (RemoteException e3) {
                        c8989cV13.mo6070n().f8378g.m24554c(e3, "Failed to send measurementEnabled to the service");
                    }
                }
        }
    }
}
