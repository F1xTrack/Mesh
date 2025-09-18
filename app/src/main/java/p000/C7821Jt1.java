package p000;

import android.app.Application;
import com.p019vk.push.common.Logger;
import com.p019vk.push.common.analytics.AnalyticsSender;
import com.p019vk.push.common.analytics.AnalyticsSenderProvider;
import com.p019vk.push.common.component.PushTokenComponent;
import com.p019vk.push.common.component.TopicComponent;
import com.p019vk.push.common.logger.LoggerProvider;
import com.p019vk.push.common.messaging.interceptor.PushInterceptorStore;
import com.p019vk.push.common.messaging.interceptor.PushInterceptorStoreProvider;
import com.p019vk.push.common.token.OnNewPushTokenListenerStore;
import com.p019vk.push.common.token.OnNewPushTokenListenerStoreProvider;

/* renamed from: Jt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7821Jt1 implements TopicComponent, InterfaceC9556gu1, InterfaceC8075Oq1, PushTokenComponent, PushInterceptorStoreProvider, OnNewPushTokenListenerStoreProvider, AnalyticsSenderProvider, LoggerProvider {

    /* renamed from: u */
    public static final C7353At1 f5774u = new C7353At1();

    /* renamed from: v */
    public static volatile C7821Jt1 f5775v;

    /* renamed from: a */
    public final Application f5776a;

    /* renamed from: b */
    public final Logger f5777b;

    /* renamed from: c */
    public final F71 f5778c;

    /* renamed from: d */
    public final F71 f5779d;

    /* renamed from: e */
    public final F71 f5780e;

    /* renamed from: f */
    public final F71 f5781f;

    /* renamed from: g */
    public final F71 f5782g;

    /* renamed from: h */
    public final F71 f5783h;

    /* renamed from: i */
    public final F71 f5784i;

    /* renamed from: j */
    public final F71 f5785j;

    /* renamed from: k */
    public final F71 f5786k;

    /* renamed from: l */
    public final F71 f5787l;

    /* renamed from: m */
    public final F71 f5788m;

    /* renamed from: n */
    public final F71 f5789n;

    /* renamed from: o */
    public final F71 f5790o;

    /* renamed from: p */
    public final F71 f5791p;

    /* renamed from: q */
    public final F71 f5792q;

    /* renamed from: r */
    public final F71 f5793r;

    /* renamed from: s */
    public final C1068Qy f5794s;

    /* renamed from: t */
    public C9452g41 f5795t;

    public C7821Jt1(C7981Mv1 c7981Mv1) {
        C8326Tm0 c8326Tm0 = C8326Tm0.f11510g;
        if (!O90.m5963a(C8326Tm0.f11511h, c7981Mv1)) {
            synchronized (c8326Tm0) {
                if (!O90.m5963a(C8326Tm0.f11511h, c7981Mv1)) {
                    C8326Tm0.f11511h = c7981Mv1;
                }
            }
        }
        this.f5776a = C8326Tm0.m7740o().f7395a;
        this.f5777b = C8326Tm0.m7738m();
        this.f5778c = AbstractC0705LB.m4915b(C10789qX0.f40988A);
        this.f5779d = AbstractC0705LB.m4915b(C10789qX0.f40993F);
        this.f5780e = AbstractC0705LB.m4915b(C10789qX0.f40990C);
        this.f5781f = AbstractC0705LB.m4915b(new C7405Bt1(this, 4));
        this.f5782g = AbstractC0705LB.m4915b(new C7405Bt1(this, 1));
        this.f5783h = AbstractC0705LB.m4915b(C10789qX0.f40989B);
        this.f5784i = AbstractC0705LB.m4915b(C10789qX0.f40995H);
        this.f5785j = AbstractC0705LB.m4915b(C10789qX0.f40992E);
        this.f5786k = AbstractC0705LB.m4915b(new C7405Bt1(this, 0));
        this.f5787l = AbstractC0705LB.m4915b(C10789qX0.f40991D);
        this.f5788m = AbstractC0705LB.m4915b(C10789qX0.f40994G);
        this.f5789n = AbstractC0705LB.m4915b(C10789qX0.f40996I);
        this.f5790o = AbstractC0705LB.m4915b(new C7405Bt1(this, 6));
        this.f5791p = AbstractC0705LB.m4915b(new C7405Bt1(this, 5));
        this.f5792q = AbstractC0705LB.m4915b(new C7405Bt1(this, 3));
        this.f5793r = AbstractC0705LB.m4915b(new C7405Bt1(this, 2));
        this.f5794s = AbstractC11432vY1.m25444a(C0399GK.f3695b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m4462b(p000.C7821Jt1 r5, p000.AbstractC1571Yy r6) {
        /*
            boolean r0 = r6 instanceof p000.C11605wv1
            if (r0 == 0) goto L13
            r0 = r6
            wv1 r0 = (p000.C11605wv1) r0
            int r1 = r0.f45170e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45170e = r1
            goto L18
        L13:
            wv1 r0 = new wv1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f45168c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f45170e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.vk.push.common.analytics.AnalyticsSender r5 = r0.f45167b
            Jt1 r0 = r0.f45166a
            p000.RQ1.m7017d(r6)
            goto L57
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p000.RQ1.m7017d(r6)
            F71 r6 = r5.f5778c
            java.lang.Object r6 = r6.getValue()
            com.vk.push.common.analytics.AnalyticsSender r6 = (com.p019vk.push.common.analytics.AnalyticsSender) r6
            F71 r2 = r5.f5789n
            java.lang.Object r2 = r2.getValue()
            Aq1 r2 = (p000.C7347Aq1) r2
            r0.f45166a = r5
            r0.f45167b = r6
            r0.f45170e = r3
            java.lang.Object r0 = r2.m348a(r0)
            if (r0 != r1) goto L53
            goto L6e
        L53:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L57:
            java.lang.String r6 = (java.lang.String) r6
            android.app.Application r0 = r0.f5776a
            vw0 r1 = new vw0
            r1.<init>(r0)
            boolean r0 = r1.m25529a()
            Cq1 r1 = new Cq1
            r1.<init>(r6, r0)
            r5.send(r1)
            Tf1 r1 = p000.C8313Tf1.f11463a
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7821Jt1.m4462b(Jt1, Yy):java.lang.Object");
    }

    @Override // p000.InterfaceC8075Oq1
    /* renamed from: a */
    public final Q81 mo369a() {
        return ((InterfaceC8075Oq1) this.f5793r.getValue()).mo369a();
    }

    @Override // com.p019vk.push.common.component.PushTokenComponent
    public final Q81 deleteToken() {
        Q81 q81 = new Q81();
        K81 k81 = new K81(q81);
        Logger.DefaultImpls.info$default(this.f5777b, "Delete current push token", null, 2, null);
        C0399GK c0399gk = C0399GK.f3694a;
        AbstractC9366fP1.m18230b(this.f5794s, ExecutorC1023QF.f9548c, new C10068ku1(this, k81, null, 0), 2);
        return q81;
    }

    @Override // com.p019vk.push.common.component.PushTokenComponent
    public final Q81 getToken() {
        Q81 q81 = new Q81();
        K81 k81 = new K81(q81);
        Logger.DefaultImpls.info$default(this.f5777b, "Get token requested", null, 2, null);
        C0399GK c0399gk = C0399GK.f3694a;
        AbstractC9366fP1.m18230b(this.f5794s, ExecutorC1023QF.f9548c, new C10068ku1(this, k81, null, 1), 2);
        return q81;
    }

    @Override // com.p019vk.push.common.analytics.AnalyticsSenderProvider
    public final AnalyticsSender provideAnalyticsSender() {
        return (AnalyticsSender) this.f5778c.getValue();
    }

    @Override // com.p019vk.push.common.logger.LoggerProvider
    public final Logger provideLogger() {
        return C8326Tm0.m7738m();
    }

    @Override // com.p019vk.push.common.token.OnNewPushTokenListenerStoreProvider
    public final OnNewPushTokenListenerStore provideOnNewPushTokenListenerStore() {
        return (C7867Kq1) AbstractC8023Nq1.f8031b.getValue();
    }

    @Override // com.p019vk.push.common.messaging.interceptor.PushInterceptorStoreProvider
    public final PushInterceptorStore providePushInterceptorStore() {
        return (C8077Or1) AbstractC8023Nq1.f8030a.getValue();
    }

    @Override // com.p019vk.push.common.component.TopicComponent
    public final Q81 subscribeToTopic(String str) {
        O90.m5968f(str, "topic");
        return ((TopicComponent) this.f5791p.getValue()).subscribeToTopic(str);
    }

    @Override // com.p019vk.push.common.component.TopicComponent
    public final Q81 unsubscribeFromTopic(String str) {
        O90.m5968f(str, "topic");
        return ((TopicComponent) this.f5791p.getValue()).unsubscribeFromTopic(str);
    }

    @Override // p000.InterfaceC9556gu1
    /* renamed from: a */
    public final Q81 mo370a(T71 t71) {
        return ((InterfaceC9556gu1) this.f5792q.getValue()).mo370a(t71);
    }
}
