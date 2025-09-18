package defpackage;

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
public final class RunnableC0220Co1 implements Runnable {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;

    public /* synthetic */ RunnableC0220Co1() {
        this.a = 1;
    }

    private final void a() {
        C2528cV1 c2528cV1;
        MJ1 mj1;
        synchronized (((AtomicReference) this.b)) {
            try {
                try {
                    c2528cV1 = (C2528cV1) this.f;
                    mj1 = c2528cV1.e;
                } catch (RemoteException e) {
                    ((C2528cV1) this.f).n().g.e("(legacy) Failed to get conditional properties; remote exception", null, (String) this.c, e);
                    ((AtomicReference) this.b).set(Collections.emptyList());
                }
                if (mj1 == null) {
                    c2528cV1.n().g.e("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.c, (String) this.d);
                    ((AtomicReference) this.b).set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    Preconditions.checkNotNull((EY1) this.e);
                    ((AtomicReference) this.b).set(mj1.j((String) this.c, (String) this.d, (EY1) this.e));
                } else {
                    ((AtomicReference) this.b).set(mj1.n(null, (String) this.c, (String) this.d));
                }
                ((C2528cV1) this.f).M1();
                ((AtomicReference) this.b).notify();
            } finally {
                ((AtomicReference) this.b).notify();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x005a -> B:173:0x0061). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.a) {
            case 0:
                try {
                    if (!(((C8007xZ0) this.b).a instanceof S)) {
                        String string = ((UUID) this.c).toString();
                        C1623Uo1 c1623Uo1L = ((C0298Do1) this.f).c.l(string);
                        if (c1623Uo1L == null || F91.r(c1623Uo1L.b)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((C0298Do1) this.f).b.i(string, (C6093nX) this.d);
                        ((Context) this.e).startService(N71.b((Context) this.e, AbstractC5615l12.d(c1623Uo1L), (C6093nX) this.d));
                    }
                    ((C8007xZ0) this.b).j(null);
                    return;
                } catch (Throwable th) {
                    ((C8007xZ0) this.b).k(th);
                    return;
                }
            case 1:
                XJ1 xj1 = (XJ1) this.e;
                BinderC5880mP1 binderC5880mP1 = (BinderC5880mP1) this.b;
                binderC5880mP1.a.f0();
                C5716lY1 c5716lY1 = binderC5880mP1.a;
                try {
                    xj1.m(c5716lY1.g((Bundle) this.d, (EY1) this.c));
                    return;
                } catch (RemoteException e) {
                    c5716lY1.n().g.b((String) this.f, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 2:
                AbstractC0447Fm0 abstractC0447Fm0 = (AbstractC0447Fm0) this.b;
                FA1 fa1 = (FA1) this.c;
                G10 g10 = (G10) this.d;
                Callable callable = (Callable) this.e;
                S81 s81 = (S81) this.f;
                abstractC0447Fm0.getClass();
                try {
                    if (fa1.a.j()) {
                        g10.y();
                        return;
                    }
                    try {
                        if (!((AtomicBoolean) abstractC0447Fm0.d).get()) {
                            C6465pT1 c6465pT1 = (C6465pT1) abstractC0447Fm0;
                            synchronized (c6465pT1) {
                                c6465pT1.j = c6465pT1.f.zzc();
                            }
                            ((AtomicBoolean) abstractC0447Fm0.d).set(true);
                        }
                        if (fa1.a.j()) {
                            g10.y();
                            return;
                        }
                        Object objCall = callable.call();
                        if (fa1.a.j()) {
                            g10.y();
                            return;
                        } else {
                            s81.b(objCall);
                            return;
                        }
                    } catch (RuntimeException e2) {
                        throw new C3281cs0("Internal error has occurred when executing ML Kit tasks", e2);
                    }
                } catch (Exception e3) {
                    if (fa1.a.j()) {
                        g10.y();
                        return;
                    } else {
                        s81.a(e3);
                        return;
                    }
                }
            case 3:
                a();
                return;
            default:
                EY1 ey1 = (EY1) this.d;
                String str = (String) this.c;
                String str2 = (String) this.b;
                InterfaceC7377uF1 interfaceC7377uF1 = (InterfaceC7377uF1) this.e;
                C2528cV1 c2528cV1 = (C2528cV1) this.f;
                ArrayList arrayList = new ArrayList();
                try {
                    MJ1 mj1 = c2528cV1.e;
                    if (mj1 == null) {
                        c2528cV1.n().g.b(str2, str, "Failed to get conditional properties; not connected to service");
                    } else {
                        Preconditions.checkNotNull(ey1);
                        arrayList = C5910mZ1.q2(mj1.j(str2, str, ey1));
                        c2528cV1.M1();
                        c2528cV1.u1().V1(interfaceC7377uF1, arrayList);
                    }
                } catch (RemoteException e4) {
                    c2528cV1.n().g.e("Failed to get conditional properties; remote exception", str2, str, e4);
                } finally {
                    c2528cV1.u1().V1(interfaceC7377uF1, arrayList);
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0220Co1(AbstractC0447Fm0 abstractC0447Fm0, FA1 fa1, G10 g10, Callable callable, S81 s81) {
        this.a = 2;
        this.b = abstractC0447Fm0;
        this.c = fa1;
        this.d = g10;
        this.e = callable;
        this.f = s81;
    }

    public /* synthetic */ RunnableC0220Co1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.f = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }
}
