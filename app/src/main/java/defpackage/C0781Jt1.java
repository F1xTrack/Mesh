package defpackage;

import android.app.Application;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsSenderProvider;
import com.vk.push.common.component.PushTokenComponent;
import com.vk.push.common.component.TopicComponent;
import com.vk.push.common.logger.LoggerProvider;
import com.vk.push.common.messaging.interceptor.PushInterceptorStore;
import com.vk.push.common.messaging.interceptor.PushInterceptorStoreProvider;
import com.vk.push.common.token.OnNewPushTokenListenerStore;
import com.vk.push.common.token.OnNewPushTokenListenerStoreProvider;

/* renamed from: Jt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0781Jt1 implements TopicComponent, InterfaceC4051gu1, InterfaceC1161Oq1, PushTokenComponent, PushInterceptorStoreProvider, OnNewPushTokenListenerStoreProvider, AnalyticsSenderProvider, LoggerProvider {
    public static final C0079At1 u = new C0079At1();
    public static volatile C0781Jt1 v;
    public final Application a;
    public final Logger b;
    public final F71 c;
    public final F71 d;
    public final F71 e;
    public final F71 f;
    public final F71 g;
    public final F71 h;
    public final F71 i;
    public final F71 j;
    public final F71 k;
    public final F71 l;
    public final F71 m;
    public final F71 n;
    public final F71 o;
    public final F71 p;
    public final F71 q;
    public final F71 r;
    public final C1339Qy s;
    public C3895g41 t;

    public C0781Jt1(C1020Mv1 c1020Mv1) {
        C1538Tm0 c1538Tm0 = C1538Tm0.g;
        if (!O90.a(C1538Tm0.h, c1020Mv1)) {
            synchronized (c1538Tm0) {
                if (!O90.a(C1538Tm0.h, c1020Mv1)) {
                    C1538Tm0.h = c1020Mv1;
                }
            }
        }
        this.a = C1538Tm0.o().a;
        this.b = C1538Tm0.m();
        this.c = LB.b(C6667qX0.A);
        this.d = LB.b(C6667qX0.F);
        this.e = LB.b(C6667qX0.C);
        this.f = LB.b(new C0157Bt1(this, 4));
        this.g = LB.b(new C0157Bt1(this, 1));
        this.h = LB.b(C6667qX0.B);
        this.i = LB.b(C6667qX0.H);
        this.j = LB.b(C6667qX0.E);
        this.k = LB.b(new C0157Bt1(this, 0));
        this.l = LB.b(C6667qX0.D);
        this.m = LB.b(C6667qX0.G);
        this.n = LB.b(C6667qX0.I);
        this.o = LB.b(new C0157Bt1(this, 6));
        this.p = LB.b(new C0157Bt1(this, 5));
        this.q = LB.b(new C0157Bt1(this, 3));
        this.r = LB.b(new C0157Bt1(this, 2));
        this.s = AbstractC7625vY1.a(GK.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.C0781Jt1 r5, defpackage.AbstractC1963Yy r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C7884wv1
            if (r0 == 0) goto L13
            r0 = r6
            wv1 r0 = (defpackage.C7884wv1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            wv1 r0 = new wv1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.vk.push.common.analytics.AnalyticsSender r5 = r0.b
            Jt1 r0 = r0.a
            defpackage.RQ1.d(r6)
            goto L57
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.RQ1.d(r6)
            F71 r6 = r5.c
            java.lang.Object r6 = r6.getValue()
            com.vk.push.common.analytics.AnalyticsSender r6 = (com.vk.push.common.analytics.AnalyticsSender) r6
            F71 r2 = r5.n
            java.lang.Object r2 = r2.getValue()
            Aq1 r2 = (defpackage.C0070Aq1) r2
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L53
            goto L6e
        L53:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L57:
            java.lang.String r6 = (java.lang.String) r6
            android.app.Application r0 = r0.a
            vw0 r1 = new vw0
            r1.<init>(r0)
            boolean r0 = r1.a()
            Cq1 r1 = new Cq1
            r1.<init>(r6, r0)
            r5.send(r1)
            Tf1 r1 = defpackage.C1518Tf1.a
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0781Jt1.b(Jt1, Yy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1161Oq1
    public final Q81 a() {
        return ((InterfaceC1161Oq1) this.r.getValue()).a();
    }

    @Override // com.vk.push.common.component.PushTokenComponent
    public final Q81 deleteToken() {
        Q81 q81 = new Q81();
        K81 k81 = new K81(q81);
        Logger.DefaultImpls.info$default(this.b, "Delete current push token", null, 2, null);
        GK gk = GK.a;
        AbstractC3767fP1.b(this.s, QF.c, new C5591ku1(this, k81, null, 0), 2);
        return q81;
    }

    @Override // com.vk.push.common.component.PushTokenComponent
    public final Q81 getToken() {
        Q81 q81 = new Q81();
        K81 k81 = new K81(q81);
        Logger.DefaultImpls.info$default(this.b, "Get token requested", null, 2, null);
        GK gk = GK.a;
        AbstractC3767fP1.b(this.s, QF.c, new C5591ku1(this, k81, null, 1), 2);
        return q81;
    }

    @Override // com.vk.push.common.analytics.AnalyticsSenderProvider
    public final AnalyticsSender provideAnalyticsSender() {
        return (AnalyticsSender) this.c.getValue();
    }

    @Override // com.vk.push.common.logger.LoggerProvider
    public final Logger provideLogger() {
        return C1538Tm0.m();
    }

    @Override // com.vk.push.common.token.OnNewPushTokenListenerStoreProvider
    public final OnNewPushTokenListenerStore provideOnNewPushTokenListenerStore() {
        return (C0850Kq1) AbstractC1083Nq1.b.getValue();
    }

    @Override // com.vk.push.common.messaging.interceptor.PushInterceptorStoreProvider
    public final PushInterceptorStore providePushInterceptorStore() {
        return (C1164Or1) AbstractC1083Nq1.a.getValue();
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final Q81 subscribeToTopic(String str) {
        O90.f(str, "topic");
        return ((TopicComponent) this.p.getValue()).subscribeToTopic(str);
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final Q81 unsubscribeFromTopic(String str) {
        O90.f(str, "topic");
        return ((TopicComponent) this.p.getValue()).unsubscribeFromTopic(str);
    }

    @Override // defpackage.InterfaceC4051gu1
    public final Q81 a(T71 t71) {
        return ((InterfaceC4051gu1) this.q.getValue()).a(t71);
    }
}
