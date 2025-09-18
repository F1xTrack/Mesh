package defpackage;

import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.domain.repository.PackagesRepository;

/* renamed from: Js1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0778Js1 {
    public final InterfaceC1707Vq1 a;
    public final PackagesRepository b;
    public final AnalyticsSender c;
    public final F71 d;

    public C0778Js1(InterfaceC1707Vq1 interfaceC1707Vq1, PackagesRepository packagesRepository, AnalyticsSender analyticsSender) {
        O90.f(packagesRepository, "packagesRepository");
        O90.f(analyticsSender, "analyticsSender");
        this.a = interfaceC1707Vq1;
        this.b = packagesRepository;
        this.c = analyticsSender;
        this.d = LB.b(C6667qX0.x);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, defpackage.AbstractC1963Yy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C5394js1
            if (r0 == 0) goto L13
            r0 = r9
            js1 r0 = (defpackage.C5394js1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            js1 r0 = new js1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 2
            java.lang.String r4 = "Push token "
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 != r5) goto L33
            java.lang.String r8 = r0.b
            Js1 r0 = r0.a
            defpackage.RQ1.d(r9)
            PS0 r9 = (defpackage.PS0) r9
            java.lang.Object r9 = r9.a
            goto L7d
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            defpackage.RQ1.d(r9)
            com.vk.push.core.domain.repository.PackagesRepository r9 = r7.b
            java.util.List r9 = r9.getInitializedHostPackages()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L6d
            F71 r9 = r7.d
            java.lang.Object r9 = r9.getValue()
            com.vk.push.common.Logger r9 = (com.vk.push.common.Logger) r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            java.lang.String r8 = com.vk.push.core.utils.StringExtensionsKt.hideSensitive(r8)
            r0.append(r8)
            java.lang.String r8 = " will not be deleted because host app has been installed"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r8, r6, r3, r6)
            Tf1 r8 = defpackage.C1518Tf1.a
            return r8
        L6d:
            r0.a = r7
            r0.b = r8
            r0.e = r5
            Vq1 r9 = r7.a
            java.lang.Object r9 = r9.b(r8, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            r0 = r7
        L7d:
            boolean r1 = r9 instanceof defpackage.OS0
            if (r1 != 0) goto Lb4
            r1 = r9
            Tf1 r1 = (defpackage.C1518Tf1) r1
            F71 r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            com.vk.push.common.Logger r1 = (com.vk.push.common.Logger) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            java.lang.String r4 = com.vk.push.core.utils.StringExtensionsKt.hideSensitive(r8)
            r2.append(r4)
            java.lang.String r4 = " has been deleted"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.vk.push.common.Logger.DefaultImpls.info$default(r1, r2, r6, r3, r6)
            java.lang.String r1 = "pushToken"
            defpackage.O90.f(r8, r1)
            Bs1 r1 = new Bs1
            r2 = 3
            r1.<init>(r8, r2)
            com.vk.push.common.analytics.AnalyticsSender r8 = r0.c
            r8.send(r1)
        Lb4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0778Js1.a(java.lang.String, Yy):java.lang.Object");
    }
}
