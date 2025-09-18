package defpackage;

import com.vk.push.core.analytics.BaseAnalyticsSender;
import kotlin.jvm.functions.Function2;

/* renamed from: Mf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0970Mf extends AbstractC4286i71 implements Function2 {
    public C8416zj a;
    public int b;
    public final /* synthetic */ BaseAnalyticsSender c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0970Mf(BaseAnalyticsSender baseAnalyticsSender, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = baseAnalyticsSender;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C0970Mf(this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0970Mf) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0054 -> B:11:0x0033). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r5.b
            com.vk.push.core.analytics.BaseAnalyticsSender r2 = r5.c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            zj r1 = r5.a
            defpackage.RQ1.d(r6)
            goto L33
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            zj r1 = r5.a
            defpackage.RQ1.d(r6)
            goto L3e
        L22:
            defpackage.RQ1.d(r6)
            kr r6 = com.vk.push.core.analytics.BaseAnalyticsSender.access$getEventsQueue$p(r2)
            Bj r6 = (defpackage.C0125Bj) r6
            r6.getClass()
            zj r1 = new zj
            r1.<init>(r6)
        L33:
            r5.a = r1
            r5.b = r4
            java.lang.Object r6 = r1.a(r5)
            if (r6 != r0) goto L3e
            return r0
        L3e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L57
            java.lang.Object r6 = r1.c()
            com.vk.push.common.analytics.BaseAnalyticsEvent r6 = (com.vk.push.common.analytics.BaseAnalyticsEvent) r6
            r5.a = r1
            r5.b = r3
            java.lang.Object r6 = com.vk.push.core.analytics.BaseAnalyticsSender.access$handleEvent(r2, r6, r5)
            if (r6 != r0) goto L33
            return r0
        L57:
            Tf1 r6 = defpackage.C1518Tf1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0970Mf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
