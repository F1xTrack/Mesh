package p000;

import com.p019vk.push.common.Logger;

/* renamed from: Nv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8033Nv1 {

    /* renamed from: a */
    public final C7397Bp1 f8130a;

    /* renamed from: b */
    public final C7765Ir1 f8131b;

    /* renamed from: c */
    public final ExecutorC1023QF f8132c;

    /* renamed from: d */
    public final Logger f8133d;

    public C8033Nv1(C7397Bp1 c7397Bp1, C7765Ir1 c7765Ir1, Logger logger) {
        C0399GK c0399gk = C0399GK.f3694a;
        ExecutorC1023QF executorC1023QF = ExecutorC1023QF.f9548c;
        O90.m5968f(c7765Ir1, "pushStorage");
        O90.m5968f(executorC1023QF, "dispatcher");
        O90.m5968f(logger, "rootLogger");
        this.f8130a = c7397Bp1;
        this.f8131b = c7765Ir1;
        this.f8132c = executorC1023QF;
        this.f8133d = logger.createLogger("TopicRepo");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5905a(java.lang.String r6, p000.AbstractC1571Yy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.C7565Ev1
            if (r0 == 0) goto L13
            r0 = r7
            Ev1 r0 = (p000.C7565Ev1) r0
            int r1 = r0.f2970c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2970c = r1
            goto L18
        L13:
            Ev1 r0 = new Ev1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f2968a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f2970c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000.RQ1.m7017d(r7)
            goto L44
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            p000.RQ1.m7017d(r7)
            Fv1 r7 = new Fv1
            r2 = 0
            r4 = 0
            r7.<init>(r5, r6, r2, r4)
            r0.f2970c = r3
            QF r6 = r5.f8132c
            java.lang.Object r7 = p000.AbstractC9366fP1.m18233e(r6, r7, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            PS0 r7 = (p000.PS0) r7
            java.lang.Object r6 = r7.f9075a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8033Nv1.m5905a(java.lang.String, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5906b(java.lang.String r6, p000.AbstractC1571Yy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.C7669Gv1
            if (r0 == 0) goto L13
            r0 = r7
            Gv1 r0 = (p000.C7669Gv1) r0
            int r1 = r0.f3964c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3964c = r1
            goto L18
        L13:
            Gv1 r0 = new Gv1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f3962a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f3964c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000.RQ1.m7017d(r7)
            goto L44
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            p000.RQ1.m7017d(r7)
            Fv1 r7 = new Fv1
            r2 = 0
            r4 = 1
            r7.<init>(r5, r6, r2, r4)
            r0.f3964c = r3
            QF r6 = r5.f8132c
            java.lang.Object r7 = p000.AbstractC9366fP1.m18233e(r6, r7, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            PS0 r7 = (p000.PS0) r7
            java.lang.Object r6 = r7.f9075a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8033Nv1.m5906b(java.lang.String, Yy):java.lang.Object");
    }
}
