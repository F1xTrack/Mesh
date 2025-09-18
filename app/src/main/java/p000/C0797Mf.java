package p000;

import com.p019vk.push.core.analytics.BaseAnalyticsSender;
import kotlin.jvm.functions.Function2;

/* renamed from: Mf */
/* loaded from: classes2.dex */
public final class C0797Mf extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public C7282zj f7289a;

    /* renamed from: b */
    public int f7290b;

    /* renamed from: c */
    public final /* synthetic */ BaseAnalyticsSender f7291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0797Mf(BaseAnalyticsSender baseAnalyticsSender, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f7291c = baseAnalyticsSender;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C0797Mf(this.f7291c, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0797Mf) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0054 -> B:11:0x0033). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r5.f7290b
            com.vk.push.core.analytics.BaseAnalyticsSender r2 = r5.f7291c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            zj r1 = r5.f7289a
            p000.RQ1.m7017d(r6)
            goto L33
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            zj r1 = r5.f7289a
            p000.RQ1.m7017d(r6)
            goto L3e
        L22:
            p000.RQ1.m7017d(r6)
            kr r6 = com.p019vk.push.core.analytics.BaseAnalyticsSender.access$getEventsQueue$p(r2)
            Bj r6 = (p000.C0109Bj) r6
            r6.getClass()
            zj r1 = new zj
            r1.<init>(r6)
        L33:
            r5.f7289a = r1
            r5.f7290b = r4
            java.lang.Object r6 = r1.m26519a(r5)
            if (r6 != r0) goto L3e
            return r0
        L3e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L57
            java.lang.Object r6 = r1.m26520c()
            com.vk.push.common.analytics.BaseAnalyticsEvent r6 = (com.p019vk.push.common.analytics.BaseAnalyticsEvent) r6
            r5.f7289a = r1
            r5.f7290b = r3
            java.lang.Object r6 = com.p019vk.push.core.analytics.BaseAnalyticsSender.access$handleEvent(r2, r6, r5)
            if (r6 != r0) goto L33
            return r0
        L57:
            Tf1 r6 = p000.C8313Tf1.f11463a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0797Mf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
