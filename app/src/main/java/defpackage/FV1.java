package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class FV1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EY1 b;
    public final /* synthetic */ C2528cV1 c;

    public /* synthetic */ FV1(C2528cV1 c2528cV1, EY1 ey1, int i) {
        this.a = i;
        this.b = ey1;
        this.c = c2528cV1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                EY1 ey1 = this.b;
                C2528cV1 c2528cV1 = this.c;
                MJ1 mj1 = c2528cV1.e;
                if (mj1 != null) {
                    try {
                        Preconditions.checkNotNull(ey1);
                        mj1.o(ey1);
                    } catch (RemoteException e) {
                        c2528cV1.n().g.c(e, "Failed to reset data on the service: remote exception");
                    }
                    c2528cV1.M1();
                    break;
                } else {
                    c2528cV1.n().g.d("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                EY1 ey12 = this.b;
                C2528cV1 c2528cV12 = this.c;
                MJ1 mj12 = c2528cV12.e;
                if (mj12 == null) {
                    c2528cV12.n().j.d("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        Preconditions.checkNotNull(ey12);
                        mj12.u(ey12);
                        c2528cV12.M1();
                        break;
                    } catch (RemoteException e2) {
                        c2528cV12.n().g.c(e2, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            default:
                EY1 ey13 = this.b;
                C2528cV1 c2528cV13 = this.c;
                MJ1 mj13 = c2528cV13.e;
                if (mj13 == null) {
                    c2528cV13.n().g.d("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        Preconditions.checkNotNull(ey13);
                        mj13.z(ey13);
                        c2528cV13.M1();
                        break;
                    } catch (RemoteException e3) {
                        c2528cV13.n().g.c(e3, "Failed to send measurementEnabled to the service");
                    }
                }
        }
    }
}
