package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC10018kV1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36512a = 0;

    /* renamed from: b */
    public /* synthetic */ AtomicReference f36513b;

    /* renamed from: c */
    public /* synthetic */ EY1 f36514c;

    /* renamed from: d */
    public /* synthetic */ Bundle f36515d;

    /* renamed from: e */
    public /* synthetic */ C8989cV1 f36516e;

    public /* synthetic */ RunnableC10018kV1() {
    }

    /* renamed from: a */
    private final void m22218a() {
        MJ1 mj1;
        C8989cV1 c8989cV1 = this.f36516e;
        AtomicReference atomicReference = this.f36513b;
        EY1 ey1 = this.f36514c;
        Bundle bundle = this.f36515d;
        synchronized (atomicReference) {
            try {
                mj1 = c8989cV1.f17574e;
            } catch (RemoteException e) {
                c8989cV1.mo6070n().f8378g.m24554c(e, "Failed to request trigger URIs; remote exception");
                atomicReference.notifyAll();
            }
            if (mj1 == null) {
                c8989cV1.mo6070n().f8378g.m24555d("Failed to request trigger URIs; not connected to service");
                return;
            }
            Preconditions.checkNotNull(ey1);
            mj1.mo5310F(ey1, bundle, new BinderC11680xV1(atomicReference));
            c8989cV1.m10751M1();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8989cV1 c8989cV1;
        MJ1 mj1;
        switch (this.f36512a) {
            case 0:
                m22218a();
                return;
            default:
                synchronized (this.f36513b) {
                    try {
                        try {
                            c8989cV1 = this.f36516e;
                            mj1 = c8989cV1.f17574e;
                        } catch (RemoteException e) {
                            this.f36516e.mo6070n().f8378g.m24554c(e, "Failed to get trigger URIs; remote exception");
                        }
                        if (mj1 == null) {
                            c8989cV1.mo6070n().f8378g.m24555d("Failed to get trigger URIs; not connected to service");
                            return;
                        }
                        Preconditions.checkNotNull(this.f36514c);
                        this.f36513b.set(mj1.mo5311a(this.f36515d, this.f36514c));
                        this.f36516e.m10751M1();
                        this.f36513b.notify();
                        return;
                    } finally {
                        this.f36513b.notify();
                    }
                }
        }
    }

    public RunnableC10018kV1(C8989cV1 c8989cV1, AtomicReference atomicReference, EY1 ey1, Bundle bundle) {
        this.f36513b = atomicReference;
        this.f36514c = ey1;
        this.f36515d = bundle;
        this.f36516e = c8989cV1;
    }
}
