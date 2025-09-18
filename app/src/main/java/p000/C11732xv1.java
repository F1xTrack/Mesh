package p000;

import com.p019vk.push.common.Logger;

/* renamed from: xv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11732xv1 {

    /* renamed from: a */
    public final C8233Rr1 f45901a;

    /* renamed from: b */
    public final ExecutorC1023QF f45902b;

    /* renamed from: c */
    public final Logger f45903c;

    public C11732xv1(C8233Rr1 c8233Rr1, Logger logger) {
        C0399GK c0399gk = C0399GK.f3694a;
        ExecutorC1023QF executorC1023QF = ExecutorC1023QF.f9548c;
        O90.m5968f(executorC1023QF, "dispatcher");
        O90.m5968f(logger, "rootLogger");
        this.f45901a = c8233Rr1;
        this.f45902b = executorC1023QF;
        this.f45903c = logger.createLogger(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26001a(java.lang.String r5, p000.T71 r6, p000.AbstractC1571Yy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p000.C10838qv1
            if (r0 == 0) goto L13
            r0 = r7
            qv1 r0 = (p000.C10838qv1) r0
            int r1 = r0.f41252c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41252c = r1
            goto L18
        L13:
            qv1 r0 = new qv1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f41250a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f41252c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000.RQ1.m7017d(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p000.RQ1.m7017d(r7)
            sv1 r7 = new sv1
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.f41252c = r3
            QF r5 = r4.f45902b
            java.lang.Object r7 = p000.AbstractC9366fP1.m18233e(r5, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            PS0 r7 = (p000.PS0) r7
            java.lang.Object r5 = r7.f9075a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11732xv1.m26001a(java.lang.String, T71, Yy):java.lang.Object");
    }
}
