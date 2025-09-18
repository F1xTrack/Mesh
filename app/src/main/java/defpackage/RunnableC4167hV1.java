package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: hV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4167hV1 implements Runnable {
    public final /* synthetic */ int a;
    public /* synthetic */ C2528cV1 b;

    public /* synthetic */ RunnableC4167hV1(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C2528cV1 c2528cV1 = this.b;
                MJ1 mj1 = c2528cV1.e;
                if (mj1 == null) {
                    c2528cV1.n().g.d("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        EY1 ey1N1 = c2528cV1.N1(false);
                        Preconditions.checkNotNull(ey1N1);
                        mj1.h(ey1N1);
                        c2528cV1.M1();
                        break;
                    } catch (RemoteException e) {
                        c2528cV1.n().g.c(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                C2528cV1 c2528cV12 = this.b;
                MJ1 mj12 = c2528cV12.e;
                if (mj12 == null) {
                    c2528cV12.n().g.d("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        EY1 ey1N12 = c2528cV12.N1(false);
                        Preconditions.checkNotNull(ey1N12);
                        mj12.E(ey1N12);
                        c2528cV12.M1();
                        break;
                    } catch (RemoteException e2) {
                        c2528cV12.n().g.c(e2, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
