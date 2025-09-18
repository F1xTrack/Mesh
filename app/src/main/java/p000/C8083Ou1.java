package p000;

import com.p019vk.push.common.Logger;

/* renamed from: Ou1 */
/* loaded from: classes2.dex */
public final class C8083Ou1 {

    /* renamed from: a */
    public final InterfaceC8179Qq1 f8669a;

    /* renamed from: b */
    public final C8233Rr1 f8670b;

    /* renamed from: c */
    public final C8233Rr1 f8671c;

    /* renamed from: d */
    public final C1068Qy f8672d;

    /* renamed from: e */
    public final Logger f8673e;

    /* renamed from: f */
    public volatile C6353lH f8674f;

    /* renamed from: g */
    public final C8028Nt0 f8675g;

    public C8083Ou1(InterfaceC8179Qq1 interfaceC8179Qq1, C8233Rr1 c8233Rr1, C8233Rr1 c8233Rr12, Logger logger) {
        C0399GK c0399gk = C0399GK.f3694a;
        C1068Qy c1068QyM25444a = AbstractC11432vY1.m25444a(ExecutorC1023QF.f9548c);
        O90.m5968f(logger, "logger");
        this.f8669a = interfaceC8179Qq1;
        this.f8670b = c8233Rr1;
        this.f8671c = c8233Rr12;
        this.f8672d = c1068QyM25444a;
        this.f8673e = logger.createLogger("IPCClientsDataSource");
        this.f8675g = SA1.m7187a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m6184b(p000.C8083Ou1 r4, p000.AbstractC1571Yy r5) {
        /*
            boolean r0 = r5 instanceof p000.C8551Xu1
            if (r0 == 0) goto L13
            r0 = r5
            Xu1 r0 = (p000.C8551Xu1) r0
            int r1 = r0.f14047d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14047d = r1
            goto L18
        L13:
            Xu1 r0 = new Xu1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f14045b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f14047d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ou1 r4 = r0.f14044a
            p000.RQ1.m7017d(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            p000.RQ1.m7017d(r5)
            r0.f14044a = r4
            r0.f14047d = r3
            Rr1 r5 = r4.f8670b
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r1) goto L41
            goto L69
        L41:
            com.vk.push.common.AppInfo r5 = (com.p019vk.push.common.AppInfo) r5
            com.vk.push.common.Logger r0 = r4.f8673e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Client works with host: "
            r1.<init>(r2)
            java.lang.String r2 = r5.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            r3 = 0
            com.vk.push.common.Logger.DefaultImpls.info$default(r0, r1, r3, r2, r3)
            S51 r0 = new S51
            r1 = 12
            r0.<init>(r1, r4)
            Qq1 r4 = r4.f8669a
            Pq1 r1 = r4.mo887d(r5, r0)
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8083Ou1.m6184b(Ou1, Yy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3, types: [Lt0] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6185a(p000.AbstractC1571Yy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p000.C7667Gu1
            if (r0 == 0) goto L13
            r0 = r7
            Gu1 r0 = (p000.C7667Gu1) r0
            int r1 = r0.f3960e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3960e = r1
            goto L18
        L13:
            Gu1 r0 = new Gu1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f3958c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f3960e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            Lt0 r1 = r0.f3957b
            Ou1 r0 = r0.f3956a
            p000.RQ1.m7017d(r7)     // Catch: java.lang.Throwable -> L2f
            goto L66
        L2f:
            r7 = move-exception
            goto L75
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            Lt0 r2 = r0.f3957b
            Ou1 r4 = r0.f3956a
            p000.RQ1.m7017d(r7)
            r7 = r2
            goto L55
        L42:
            p000.RQ1.m7017d(r7)
            Nt0 r7 = r6.f8675g
            r0.f3956a = r6
            r0.f3957b = r7
            r0.f3960e = r4
            java.lang.Object r2 = r7.m5899d(r0)
            if (r2 != r1) goto L54
            return r1
        L54:
            r4 = r6
        L55:
            Rr1 r2 = r4.f8671c     // Catch: java.lang.Throwable -> L73
            r0.f3956a = r4     // Catch: java.lang.Throwable -> L73
            r0.f3957b = r7     // Catch: java.lang.Throwable -> L73
            r0.f3960e = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r1) goto L64
            return r1
        L64:
            r1 = r7
            r0 = r4
        L66:
            r0.f8674f = r5     // Catch: java.lang.Throwable -> L2f
            Tf1 r7 = p000.C8313Tf1.f11463a     // Catch: java.lang.Throwable -> L2f
            Nt0 r1 = (p000.C8028Nt0) r1
            r1.m5900e(r5)
            return r7
        L70:
            r1 = r7
            r7 = r0
            goto L75
        L73:
            r0 = move-exception
            goto L70
        L75:
            Nt0 r1 = (p000.C8028Nt0) r1
            r1.m5900e(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8083Ou1.m6185a(Yy):java.lang.Object");
    }
}
