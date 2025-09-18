package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class HV1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EY1 b;
    public final /* synthetic */ C2528cV1 c;

    public /* synthetic */ HV1(C2528cV1 c2528cV1, EY1 ey1, int i) {
        this.a = i;
        this.b = ey1;
        this.c = c2528cV1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                EY1 ey1 = this.b;
                C2528cV1 c2528cV1 = this.c;
                MJ1 mj1 = c2528cV1.e;
                if (mj1 == null) {
                    c2528cV1.n().g.d("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        Preconditions.checkNotNull(ey1);
                        mj1.k(ey1);
                        ((C3386dP1) c2528cV1.b).k().F1();
                        c2528cV1.E1(mj1, null, ey1);
                        c2528cV1.M1();
                        break;
                    } catch (RemoteException e) {
                        c2528cV1.n().g.c(e, "Failed to send app launch to the service");
                        return;
                    }
                }
            default:
                EY1 ey12 = this.b;
                C2528cV1 c2528cV12 = this.c;
                MJ1 mj12 = c2528cV12.e;
                if (mj12 == null) {
                    c2528cV12.n().g.d("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        Preconditions.checkNotNull(ey12);
                        mj12.b(ey12);
                        c2528cV12.M1();
                        break;
                    } catch (RemoteException e2) {
                        c2528cV12.n().g.c(e2, "Failed to send consent settings to the service");
                    }
                }
        }
    }
}
