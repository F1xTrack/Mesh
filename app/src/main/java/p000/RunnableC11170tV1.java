package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tV1 */
/* loaded from: classes.dex */
public final class RunnableC11170tV1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f43099a = 0;

    /* renamed from: b */
    public final /* synthetic */ String f43100b;

    /* renamed from: c */
    public final /* synthetic */ String f43101c;

    /* renamed from: d */
    public final /* synthetic */ EY1 f43102d;

    /* renamed from: e */
    public final /* synthetic */ boolean f43103e;

    /* renamed from: f */
    public final /* synthetic */ C8989cV1 f43104f;

    /* renamed from: g */
    public final /* synthetic */ Object f43105g;

    public RunnableC11170tV1(C8989cV1 c8989cV1, String str, String str2, EY1 ey1, boolean z, InterfaceC11266uF1 interfaceC11266uF1) {
        this.f43100b = str;
        this.f43101c = str2;
        this.f43102d = ey1;
        this.f43103e = z;
        this.f43105g = interfaceC11266uF1;
        this.f43104f = c8989cV1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8989cV1 c8989cV1;
        MJ1 mj1;
        switch (this.f43099a) {
            case 0:
                EY1 ey1 = this.f43102d;
                String str = this.f43100b;
                InterfaceC11266uF1 interfaceC11266uF1 = (InterfaceC11266uF1) this.f43105g;
                C8989cV1 c8989cV12 = this.f43104f;
                Bundle bundle = new Bundle();
                try {
                    MJ1 mj12 = c8989cV12.f17574e;
                    String str2 = this.f43101c;
                    if (mj12 == null) {
                        c8989cV12.mo6070n().f8378g.m24553b(str, str2, "Failed to get user properties; not connected to service");
                    } else {
                        Preconditions.checkNotNull(ey1);
                        bundle = C10282mZ1.m22842H1(mj12.mo5321l(str, str2, this.f43103e, ey1));
                        c8989cV12.m10751M1();
                        c8989cV12.m7852u1().m22880U1(interfaceC11266uF1, bundle);
                    }
                    return;
                } catch (RemoteException e) {
                    c8989cV12.mo6070n().f8378g.m24553b(str, e, "Failed to get user properties; remote exception");
                    return;
                } finally {
                    c8989cV12.m7852u1().m22880U1(interfaceC11266uF1, bundle);
                }
            default:
                synchronized (((AtomicReference) this.f43105g)) {
                    try {
                        try {
                            c8989cV1 = this.f43104f;
                            mj1 = c8989cV1.f17574e;
                        } catch (RemoteException e2) {
                            this.f43104f.mo6070n().f8378g.m24556e("(legacy) Failed to get user properties; remote exception", null, this.f43100b, e2);
                            ((AtomicReference) this.f43105g).set(Collections.emptyList());
                        }
                        if (mj1 == null) {
                            c8989cV1.mo6070n().f8378g.m24556e("(legacy) Failed to get user properties; not connected to service", null, this.f43100b, this.f43101c);
                            ((AtomicReference) this.f43105g).set(Collections.emptyList());
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            Preconditions.checkNotNull(this.f43102d);
                            ((AtomicReference) this.f43105g).set(mj1.mo5321l(this.f43100b, this.f43101c, this.f43103e, this.f43102d));
                        } else {
                            ((AtomicReference) this.f43105g).set(mj1.mo5316e(null, this.f43100b, this.f43101c, this.f43103e));
                        }
                        this.f43104f.m10751M1();
                        ((AtomicReference) this.f43105g).notify();
                        return;
                    } finally {
                        ((AtomicReference) this.f43105g).notify();
                    }
                }
        }
    }

    public RunnableC11170tV1(C8989cV1 c8989cV1, AtomicReference atomicReference, String str, String str2, EY1 ey1, boolean z) {
        this.f43105g = atomicReference;
        this.f43100b = str;
        this.f43101c = str2;
        this.f43102d = ey1;
        this.f43103e = z;
        this.f43104f = c8989cV1;
    }
}
