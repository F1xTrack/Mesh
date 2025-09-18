package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tV1 */
/* loaded from: classes.dex */
public final class RunnableC7234tV1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ EY1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ C2528cV1 f;
    public final /* synthetic */ Object g;

    public RunnableC7234tV1(C2528cV1 c2528cV1, String str, String str2, EY1 ey1, boolean z, InterfaceC7377uF1 interfaceC7377uF1) {
        this.b = str;
        this.c = str2;
        this.d = ey1;
        this.e = z;
        this.g = interfaceC7377uF1;
        this.f = c2528cV1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2528cV1 c2528cV1;
        MJ1 mj1;
        switch (this.a) {
            case 0:
                EY1 ey1 = this.d;
                String str = this.b;
                InterfaceC7377uF1 interfaceC7377uF1 = (InterfaceC7377uF1) this.g;
                C2528cV1 c2528cV12 = this.f;
                Bundle bundle = new Bundle();
                try {
                    MJ1 mj12 = c2528cV12.e;
                    String str2 = this.c;
                    if (mj12 == null) {
                        c2528cV12.n().g.b(str, str2, "Failed to get user properties; not connected to service");
                    } else {
                        Preconditions.checkNotNull(ey1);
                        bundle = C5910mZ1.H1(mj12.l(str, str2, this.e, ey1));
                        c2528cV12.M1();
                        c2528cV12.u1().U1(interfaceC7377uF1, bundle);
                    }
                    return;
                } catch (RemoteException e) {
                    c2528cV12.n().g.b(str, e, "Failed to get user properties; remote exception");
                    return;
                } finally {
                    c2528cV12.u1().U1(interfaceC7377uF1, bundle);
                }
            default:
                synchronized (((AtomicReference) this.g)) {
                    try {
                        try {
                            c2528cV1 = this.f;
                            mj1 = c2528cV1.e;
                        } catch (RemoteException e2) {
                            this.f.n().g.e("(legacy) Failed to get user properties; remote exception", null, this.b, e2);
                            ((AtomicReference) this.g).set(Collections.emptyList());
                        }
                        if (mj1 == null) {
                            c2528cV1.n().g.e("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                            ((AtomicReference) this.g).set(Collections.emptyList());
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            Preconditions.checkNotNull(this.d);
                            ((AtomicReference) this.g).set(mj1.l(this.b, this.c, this.e, this.d));
                        } else {
                            ((AtomicReference) this.g).set(mj1.e(null, this.b, this.c, this.e));
                        }
                        this.f.M1();
                        ((AtomicReference) this.g).notify();
                        return;
                    } finally {
                        ((AtomicReference) this.g).notify();
                    }
                }
        }
    }

    public RunnableC7234tV1(C2528cV1 c2528cV1, AtomicReference atomicReference, String str, String str2, EY1 ey1, boolean z) {
        this.g = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = ey1;
        this.e = z;
        this.f = c2528cV1;
    }
}
