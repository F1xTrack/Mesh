package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Co1 */
/* loaded from: classes.dex */
public final class RunnableC7447Co1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1665a;

    /* renamed from: b */
    public /* synthetic */ Object f1666b;

    /* renamed from: c */
    public /* synthetic */ Object f1667c;

    /* renamed from: d */
    public /* synthetic */ Object f1668d;

    /* renamed from: e */
    public /* synthetic */ Object f1669e;

    /* renamed from: f */
    public /* synthetic */ Object f1670f;

    public /* synthetic */ RunnableC7447Co1() {
        this.f1665a = 1;
    }

    /* renamed from: a */
    private final void m1372a() {
        C8989cV1 c8989cV1;
        MJ1 mj1;
        synchronized (((AtomicReference) this.f1666b)) {
            try {
                try {
                    c8989cV1 = (C8989cV1) this.f1670f;
                    mj1 = c8989cV1.f17574e;
                } catch (RemoteException e) {
                    ((C8989cV1) this.f1670f).mo6070n().f8378g.m24556e("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f1667c, e);
                    ((AtomicReference) this.f1666b).set(Collections.emptyList());
                }
                if (mj1 == null) {
                    c8989cV1.mo6070n().f8378g.m24556e("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f1667c, (String) this.f1668d);
                    ((AtomicReference) this.f1666b).set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    Preconditions.checkNotNull((EY1) this.f1669e);
                    ((AtomicReference) this.f1666b).set(mj1.mo5319j((String) this.f1667c, (String) this.f1668d, (EY1) this.f1669e));
                } else {
                    ((AtomicReference) this.f1666b).set(mj1.mo5322n(null, (String) this.f1667c, (String) this.f1668d));
                }
                ((C8989cV1) this.f1670f).m10751M1();
                ((AtomicReference) this.f1666b).notify();
            } finally {
                ((AtomicReference) this.f1666b).notify();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x005a -> B:173:0x0061). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f1665a) {
            case 0:
                try {
                    if (!(((C11687xZ0) this.f1666b).f37381a instanceof C1132S)) {
                        String string = ((UUID) this.f1667c).toString();
                        C8383Uo1 c8383Uo1M8569l = ((C7499Do1) this.f1670f).f2258c.m8569l(string);
                        if (c8383Uo1M8569l == null || F91.m2535r(c8383Uo1M8569l.f12135b)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((C7499Do1) this.f1670f).f2257b.m6264i(string, (C6495nX) this.f1668d);
                        ((Context) this.f1669e).startService(N71.m5548b((Context) this.f1669e, AbstractC10084l12.m22338d(c8383Uo1M8569l), (C6495nX) this.f1668d));
                    }
                    ((C11687xZ0) this.f1666b).m25921j(null);
                    return;
                } catch (Throwable th) {
                    ((C11687xZ0) this.f1666b).m25922k(th);
                    return;
                }
            case 1:
                XJ1 xj1 = (XJ1) this.f1669e;
                BinderC10262mP1 binderC10262mP1 = (BinderC10262mP1) this.f1666b;
                binderC10262mP1.f37671a.m22486f0();
                C10152lY1 c10152lY1 = binderC10262mP1.f37671a;
                try {
                    xj1.mo8972m(c10152lY1.m22487g((Bundle) this.f1668d, (EY1) this.f1667c));
                    return;
                } catch (RemoteException e) {
                    c10152lY1.mo6070n().f8378g.m24553b((String) this.f1670f, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 2:
                AbstractC7598Fm0 abstractC7598Fm0 = (AbstractC7598Fm0) this.f1666b;
                FA1 fa1 = (FA1) this.f1667c;
                G10 g10 = (G10) this.f1668d;
                Callable callable = (Callable) this.f1669e;
                S81 s81 = (S81) this.f1670f;
                abstractC7598Fm0.getClass();
                try {
                    if (fa1.f3084a.mo11143j()) {
                        g10.m2909y();
                        return;
                    }
                    try {
                        if (!((AtomicBoolean) abstractC7598Fm0.f3416d).get()) {
                            C10654pT1 c10654pT1 = (C10654pT1) abstractC7598Fm0;
                            synchronized (c10654pT1) {
                                c10654pT1.f40110j = c10654pT1.f40106f.zzc();
                            }
                            ((AtomicBoolean) abstractC7598Fm0.f3416d).set(true);
                        }
                        if (fa1.f3084a.mo11143j()) {
                            g10.m2909y();
                            return;
                        }
                        Object objCall = callable.call();
                        if (fa1.f3084a.mo11143j()) {
                            g10.m2909y();
                            return;
                        } else {
                            s81.m7184b(objCall);
                            return;
                        }
                    } catch (RuntimeException e2) {
                        throw new C9039cs0("Internal error has occurred when executing ML Kit tasks", e2);
                    }
                } catch (Exception e3) {
                    if (fa1.f3084a.mo11143j()) {
                        g10.m2909y();
                        return;
                    } else {
                        s81.m7183a(e3);
                        return;
                    }
                }
            case 3:
                m1372a();
                return;
            default:
                EY1 ey1 = (EY1) this.f1668d;
                String str = (String) this.f1667c;
                String str2 = (String) this.f1666b;
                InterfaceC11266uF1 interfaceC11266uF1 = (InterfaceC11266uF1) this.f1669e;
                C8989cV1 c8989cV1 = (C8989cV1) this.f1670f;
                ArrayList arrayList = new ArrayList();
                try {
                    MJ1 mj1 = c8989cV1.f17574e;
                    if (mj1 == null) {
                        c8989cV1.mo6070n().f8378g.m24553b(str2, str, "Failed to get conditional properties; not connected to service");
                    } else {
                        Preconditions.checkNotNull(ey1);
                        arrayList = C10282mZ1.m22855q2(mj1.mo5319j(str2, str, ey1));
                        c8989cV1.m10751M1();
                        c8989cV1.m7852u1().m22881V1(interfaceC11266uF1, arrayList);
                    }
                } catch (RemoteException e4) {
                    c8989cV1.mo6070n().f8378g.m24556e("Failed to get conditional properties; remote exception", str2, str, e4);
                } finally {
                    c8989cV1.m7852u1().m22881V1(interfaceC11266uF1, arrayList);
                }
                return;
        }
    }

    public /* synthetic */ RunnableC7447Co1(AbstractC7598Fm0 abstractC7598Fm0, FA1 fa1, G10 g10, Callable callable, S81 s81) {
        this.f1665a = 2;
        this.f1666b = abstractC7598Fm0;
        this.f1667c = fa1;
        this.f1668d = g10;
        this.f1669e = callable;
        this.f1670f = s81;
    }

    public /* synthetic */ RunnableC7447Co1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1665a = i;
        this.f1670f = obj;
        this.f1666b = obj2;
        this.f1667c = obj3;
        this.f1668d = obj4;
        this.f1669e = obj5;
    }
}
