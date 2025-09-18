package defpackage;

import android.location.LocationManager;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.google.android.gms.tasks.Task;
import com.my.tracker.obfuscated.b3;
import com.my.tracker.obfuscated.f0;
import com.my.tracker.obfuscated.j0;
import com.my.tracker.obfuscated.m2;
import com.my.tracker.obfuscated.n0;
import com.my.tracker.obfuscated.o0;
import com.my.tracker.obfuscated.q;
import com.my.tracker.obfuscated.r2;
import com.yandex.metrica.o;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.u;
import io.sentry.K0;
import io.sentry.L0;
import io.sentry.M0;
import io.sentry.P;
import io.sentry.Q1;
import io.sentry.S1;
import io.sentry.cache.c;
import io.sentry.protocol.t;
import io.sentry.util.b;
import java.util.Iterator;
import java.util.List;

/* renamed from: Go1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0532Go1 implements InterfaceC8304z71, InterfaceC4285i70, M0, b, K0, InterfaceC1103Nx0, q, SkuDetailsResponseListener, f0.c, FunctionWithThrowable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0532Go1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.my.tracker.obfuscated.q
    public void a(Object obj, Object obj2) {
        ((m2) this.b).b((r2) obj, (b3) obj2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, defpackage.InterfaceC6021n9
    public Object apply(Object obj) {
        return u.a((u) this.b, (LocationManager) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0094  */
    @Override // io.sentry.M0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(io.sentry.L0 r9) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0532Go1.b(io.sentry.L0):void");
    }

    @Override // io.sentry.util.b
    public Object c() {
        return ((c) this.b).a.getSerializer();
    }

    @Override // defpackage.InterfaceC8304z71
    public Object execute() {
        C0610Ho1 c0610Ho1 = (C0610Ho1) this.b;
        Iterator it = ((Iterable) ((C7992xU0) c0610Ho1.b).o(new C0681Im0(19))).iterator();
        while (it.hasNext()) {
            c0610Ho1.c.a((C1513Te) it.next(), 1, false);
        }
        return null;
    }

    @Override // defpackage.InterfaceC4285i70
    public void k(InterfaceC5252j70 interfaceC5252j70) {
        C1704Vp1 c1704Vp1 = (C1704Vp1) this.b;
        c1704Vp1.getClass();
        try {
            InterfaceC3903g70 interfaceC3903g70A = interfaceC5252j70.a();
            if (interfaceC3903g70A != null) {
                c1704Vp1.b.g(interfaceC3903g70A);
            }
        } catch (IllegalStateException e) {
            e.getMessage();
            AbstractC0759Jm0.f("ZslControlImpl");
        }
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        j0.b.a((j0.c) this.b, task);
    }

    @Override // com.android.billingclient.api.SkuDetailsResponseListener
    public void onSkuDetailsResponse(BillingResult billingResult, List list) {
        ((n0) this.b).c(billingResult, list);
    }

    @Override // com.my.tracker.obfuscated.f0.c
    public void a(List list) {
        ((o0) this.b).b(list);
    }

    @Override // io.sentry.K0
    public void a(o oVar) {
        o oVar2 = new o();
        L0 l0 = (L0) this.b;
        l0.q = oVar2;
        Q1 q1 = new Q1((t) oVar2.a, (S1) oVar2.b, "default", null, null);
        q1.i = "auto";
        Iterator<P> it = l0.j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().d(q1, l0);
        }
    }
}
