package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5516kV1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public /* synthetic */ AtomicReference b;
    public /* synthetic */ EY1 c;
    public /* synthetic */ Bundle d;
    public /* synthetic */ C2528cV1 e;

    public /* synthetic */ RunnableC5516kV1() {
    }

    private final void a() {
        MJ1 mj1;
        C2528cV1 c2528cV1 = this.e;
        AtomicReference atomicReference = this.b;
        EY1 ey1 = this.c;
        Bundle bundle = this.d;
        synchronized (atomicReference) {
            try {
                mj1 = c2528cV1.e;
            } catch (RemoteException e) {
                c2528cV1.n().g.c(e, "Failed to request trigger URIs; remote exception");
                atomicReference.notifyAll();
            }
            if (mj1 == null) {
                c2528cV1.n().g.d("Failed to request trigger URIs; not connected to service");
                return;
            }
            Preconditions.checkNotNull(ey1);
            mj1.F(ey1, bundle, new BinderC7996xV1(atomicReference));
            c2528cV1.M1();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2528cV1 c2528cV1;
        MJ1 mj1;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                synchronized (this.b) {
                    try {
                        try {
                            c2528cV1 = this.e;
                            mj1 = c2528cV1.e;
                        } catch (RemoteException e) {
                            this.e.n().g.c(e, "Failed to get trigger URIs; remote exception");
                        }
                        if (mj1 == null) {
                            c2528cV1.n().g.d("Failed to get trigger URIs; not connected to service");
                            return;
                        }
                        Preconditions.checkNotNull(this.c);
                        this.b.set(mj1.a(this.d, this.c));
                        this.e.M1();
                        this.b.notify();
                        return;
                    } finally {
                        this.b.notify();
                    }
                }
        }
    }

    public RunnableC5516kV1(C2528cV1 c2528cV1, AtomicReference atomicReference, EY1 ey1, Bundle bundle) {
        this.b = atomicReference;
        this.c = ey1;
        this.d = bundle;
        this.e = c2528cV1;
    }
}
