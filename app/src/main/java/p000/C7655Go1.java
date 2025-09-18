package p000;

import android.location.LocationManager;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.google.android.gms.tasks.Task;
import com.p018my.tracker.obfuscated.C2298b3;
import com.p018my.tracker.obfuscated.C2313f0;
import com.p018my.tracker.obfuscated.C2329j0;
import com.p018my.tracker.obfuscated.C2343m2;
import com.p018my.tracker.obfuscated.C2345n0;
import com.p018my.tracker.obfuscated.C2349o0;
import com.p018my.tracker.obfuscated.C2363r2;
import com.p018my.tracker.obfuscated.InterfaceC2356q;
import com.yandex.metrica.C3796o;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.C5657u;
import io.sentry.C5782L0;
import io.sentry.C5798Q1;
import io.sentry.C5803S1;
import io.sentry.InterfaceC5779K0;
import io.sentry.InterfaceC5785M0;
import io.sentry.InterfaceC5793P;
import io.sentry.cache.C5991c;
import io.sentry.protocol.C6104t;
import io.sentry.util.InterfaceC6169b;
import java.util.Iterator;
import java.util.List;

/* renamed from: Go1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C7655Go1 implements InterfaceC11886z71, InterfaceC9713i70, InterfaceC5785M0, InterfaceC6169b, InterfaceC5779K0, InterfaceC8036Nx0, InterfaceC2356q, SkuDetailsResponseListener, C2313f0.c, FunctionWithThrowable {

    /* renamed from: a */
    public final /* synthetic */ int f3912a;

    /* renamed from: b */
    public final /* synthetic */ Object f3913b;

    public /* synthetic */ C7655Go1(int i, Object obj) {
        this.f3912a = i;
        this.f3913b = obj;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2356q
    /* renamed from: a */
    public void mo3168a(Object obj, Object obj2) {
        ((C2343m2) this.f3913b).m13316b((C2363r2) obj, (C2298b3) obj2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    public Object apply(Object obj) {
        return C5657u.m21279a((C5657u) this.f3913b, (LocationManager) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0094  */
    @Override // io.sentry.InterfaceC5785M0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo3170b(io.sentry.C5782L0 r9) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7655Go1.mo3170b(io.sentry.L0):void");
    }

    @Override // io.sentry.util.InterfaceC6169b
    /* renamed from: c */
    public Object mo3171c() {
        return ((C5991c) this.f3913b).f34098a.getSerializer();
    }

    @Override // p000.InterfaceC11886z71
    public Object execute() {
        C7707Ho1 c7707Ho1 = (C7707Ho1) this.f3913b;
        Iterator it = ((Iterable) ((C11677xU0) c7707Ho1.f4513b).m25902o(new C7754Im0(19))).iterator();
        while (it.hasNext()) {
            c7707Ho1.f4514c.m7045a((C1236Te) it.next(), 1, false);
        }
        return null;
    }

    @Override // p000.InterfaceC9713i70
    /* renamed from: k */
    public void mo504k(InterfaceC9841j70 interfaceC9841j70) {
        C8437Vp1 c8437Vp1 = (C8437Vp1) this.f3913b;
        c8437Vp1.getClass();
        try {
            InterfaceC9457g70 interfaceC9457g70Mo4037a = interfaceC9841j70.mo4037a();
            if (interfaceC9457g70Mo4037a != null) {
                c8437Vp1.f12791b.m8868g(interfaceC9457g70Mo4037a);
            }
        } catch (IllegalStateException e) {
            e.getMessage();
            AbstractC7806Jm0.m4412f("ZslControlImpl");
        }
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        C2329j0.b.m13212a((C2329j0.c) this.f3913b, task);
    }

    @Override // com.android.billingclient.api.SkuDetailsResponseListener
    public void onSkuDetailsResponse(BillingResult billingResult, List list) {
        ((C2345n0) this.f3913b).m13329c(billingResult, list);
    }

    @Override // com.p018my.tracker.obfuscated.C2313f0.c
    /* renamed from: a */
    public void mo3169a(List list) {
        ((C2349o0) this.f3913b).m13363b(list);
    }

    @Override // io.sentry.InterfaceC5779K0
    /* renamed from: a */
    public void mo3167a(C3796o c3796o) {
        C3796o c3796o2 = new C3796o();
        C5782L0 c5782l0 = (C5782L0) this.f3913b;
        c5782l0.f33321q = c3796o2;
        C5798Q1 c5798q1 = new C5798Q1((C6104t) c3796o2.f25478a, (C5803S1) c3796o2.f25479b, "default", null, null);
        c5798q1.f33387i = "auto";
        Iterator<InterfaceC5793P> it = c5782l0.f33314j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo21443d(c5798q1, c5782l0);
        }
    }
}
