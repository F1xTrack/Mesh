package p000;

import com.p019vk.push.common.analytics.AnalyticsSender;
import com.p019vk.push.core.domain.repository.PackagesRepository;

/* renamed from: Js1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7819Js1 {

    /* renamed from: a */
    public final InterfaceC8439Vq1 f5765a;

    /* renamed from: b */
    public final PackagesRepository f5766b;

    /* renamed from: c */
    public final AnalyticsSender f5767c;

    /* renamed from: d */
    public final F71 f5768d;

    public C7819Js1(InterfaceC8439Vq1 interfaceC8439Vq1, PackagesRepository packagesRepository, AnalyticsSender analyticsSender) {
        O90.m5968f(packagesRepository, "packagesRepository");
        O90.m5968f(analyticsSender, "analyticsSender");
        this.f5765a = interfaceC8439Vq1;
        this.f5766b = packagesRepository;
        this.f5767c = analyticsSender;
        this.f5768d = AbstractC0705LB.m4915b(C10789qX0.f41015x);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m4461a(java.lang.String r8, p000.AbstractC1571Yy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p000.C9936js1
            if (r0 == 0) goto L13
            r0 = r9
            js1 r0 = (p000.C9936js1) r0
            int r1 = r0.f35436e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35436e = r1
            goto L18
        L13:
            js1 r0 = new js1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f35434c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f35436e
            r3 = 2
            java.lang.String r4 = "Push token "
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 != r5) goto L33
            java.lang.String r8 = r0.f35433b
            Js1 r0 = r0.f35432a
            p000.RQ1.m7017d(r9)
            PS0 r9 = (p000.PS0) r9
            java.lang.Object r9 = r9.f9075a
            goto L7d
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            p000.RQ1.m7017d(r9)
            com.vk.push.core.domain.repository.PackagesRepository r9 = r7.f5766b
            java.util.List r9 = r9.getInitializedHostPackages()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L6d
            F71 r9 = r7.f5768d
            java.lang.Object r9 = r9.getValue()
            com.vk.push.common.Logger r9 = (com.p019vk.push.common.Logger) r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            java.lang.String r8 = com.p019vk.push.core.utils.StringExtensionsKt.hideSensitive(r8)
            r0.append(r8)
            java.lang.String r8 = " will not be deleted because host app has been installed"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r8, r6, r3, r6)
            Tf1 r8 = p000.C8313Tf1.f11463a
            return r8
        L6d:
            r0.f35432a = r7
            r0.f35433b = r8
            r0.f35436e = r5
            Vq1 r9 = r7.f5765a
            java.lang.Object r9 = r9.mo6148b(r8, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            r0 = r7
        L7d:
            boolean r1 = r9 instanceof p000.OS0
            if (r1 != 0) goto Lb4
            r1 = r9
            Tf1 r1 = (p000.C8313Tf1) r1
            F71 r1 = r0.f5768d
            java.lang.Object r1 = r1.getValue()
            com.vk.push.common.Logger r1 = (com.p019vk.push.common.Logger) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            java.lang.String r4 = com.p019vk.push.core.utils.StringExtensionsKt.hideSensitive(r8)
            r2.append(r4)
            java.lang.String r4 = " has been deleted"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.vk.push.common.Logger.DefaultImpls.info$default(r1, r2, r6, r3, r6)
            java.lang.String r1 = "pushToken"
            p000.O90.m5968f(r8, r1)
            Bs1 r1 = new Bs1
            r2 = 3
            r1.<init>(r8, r2)
            com.vk.push.common.analytics.AnalyticsSender r8 = r0.f5767c
            r8.send(r1)
        Lb4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7819Js1.m4461a(java.lang.String, Yy):java.lang.Object");
    }
}
