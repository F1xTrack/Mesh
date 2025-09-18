package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import java.util.LinkedList;

/* renamed from: Aq1 */
/* loaded from: classes2.dex */
public final class C0070Aq1 {
    public final C1398Rr1 a;
    public final InterfaceC1707Vq1 b;
    public final C1632Ur1 c;
    public final C7409uQ0 d;
    public final C6860rY0 e;
    public final T71 f;
    public final AnalyticsSender g;
    public final AnalyticsTimingsStore h;
    public final C1320Qr1 i;
    public final LinkedList j;
    public final C1091Nt0 k;
    public final Logger l;

    public C0070Aq1(C1398Rr1 c1398Rr1, InterfaceC1707Vq1 interfaceC1707Vq1, C1632Ur1 c1632Ur1, C7409uQ0 c7409uQ0, C6860rY0 c6860rY0, T71 t71, AnalyticsSender analyticsSender, AnalyticsTimingsStore analyticsTimingsStore, C1320Qr1 c1320Qr1, Logger logger) {
        O90.f(analyticsSender, "analyticsSender");
        O90.f(analyticsTimingsStore, "analyticsTimingsStore");
        O90.f(c1320Qr1, "arbiterRepository");
        O90.f(logger, "logger");
        this.a = c1398Rr1;
        this.b = interfaceC1707Vq1;
        this.c = c1632Ur1;
        this.d = c7409uQ0;
        this.e = c6860rY0;
        this.f = t71;
        this.g = analyticsSender;
        this.h = analyticsTimingsStore;
        this.i = c1320Qr1;
        this.j = new LinkedList();
        this.k = SA1.a();
        this.l = logger.createLogger("SubscribeComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.AbstractC1963Yy r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C5961mq1
            if (r0 == 0) goto L13
            r0 = r7
            mq1 r0 = (defpackage.C5961mq1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mq1 r0 = new mq1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            Aq1 r0 = r0.a
            defpackage.RQ1.d(r7)
            Wq1 r7 = (defpackage.C1785Wq1) r7
            java.lang.String r7 = r7.a
            goto L4f
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            defpackage.RQ1.d(r7)
            com.vk.push.common.Logger r7 = r6.l
            java.lang.String r2 = "Get current push token"
            com.vk.push.common.Logger.DefaultImpls.info$default(r7, r2, r5, r3, r5)
            r0.a = r6
            r0.d = r4
            Vq1 r7 = r6.b
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r0 = r6
        L4f:
            java.lang.String r7 = (java.lang.String) r7
            boolean r1 = defpackage.AbstractC7538v51.C(r7)
            if (r1 == 0) goto L5e
            com.vk.push.common.Logger r0 = r0.l
            java.lang.String r1 = "No saved push token found"
            com.vk.push.common.Logger.DefaultImpls.warn$default(r0, r1, r5, r3, r5)
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0070Aq1.a(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.K81 r9, defpackage.AbstractC1963Yy r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C4039gq1
            if (r0 == 0) goto L13
            r0 = r10
            gq1 r0 = (defpackage.C4039gq1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            gq1 r0 = new gq1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.f
            Tf1 r3 = defpackage.C1518Tf1.a
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3f
            if (r2 != r5) goto L37
            java.lang.String r9 = r0.c
            K81 r1 = r0.b
            Aq1 r0 = r0.a
            defpackage.RQ1.d(r10)
            PS0 r10 = (defpackage.PS0) r10
            java.lang.Object r10 = r10.a
            goto L8c
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            K81 r9 = r0.b
            Aq1 r2 = r0.a
            defpackage.RQ1.d(r10)
            goto L5f
        L47:
            defpackage.RQ1.d(r10)
            com.vk.push.common.Logger r10 = r8.l
            java.lang.String r2 = "Deletion current push token"
            com.vk.push.common.Logger.DefaultImpls.warn$default(r10, r2, r6, r5, r6)
            r0.a = r8
            r0.b = r9
            r0.f = r4
            java.lang.Object r10 = r8.a(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            r2 = r8
        L5f:
            java.lang.String r10 = (java.lang.String) r10
            boolean r7 = defpackage.AbstractC7538v51.C(r10)
            if (r7 == 0) goto L77
            com.vk.push.common.Logger r10 = r2.l
            java.lang.String r0 = "No saved push token to delete"
            com.vk.push.common.Logger.DefaultImpls.warn$default(r10, r0, r6, r5, r6)
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r0)
            r9.a(r10)
            return r3
        L77:
            Vq1 r7 = r2.b
            r0.a = r2
            r0.b = r9
            r0.c = r10
            r0.f = r5
            java.lang.Object r0 = r7.b(r10, r0)
            if (r0 != r1) goto L88
            return r1
        L88:
            r1 = r9
            r9 = r10
            r10 = r0
            r0 = r2
        L8c:
            boolean r2 = r10 instanceof defpackage.OS0
            if (r2 != 0) goto Laa
            com.vk.push.common.Logger r10 = r0.l
            java.lang.String r2 = "Push token successfully deleted"
            com.vk.push.common.Logger.DefaultImpls.info$default(r10, r2, r6, r5, r6)
            java.lang.String r10 = "pushToken"
            defpackage.O90.f(r9, r10)
            Bs1 r10 = new Bs1
            r10.<init>(r9, r4)
            com.vk.push.common.analytics.AnalyticsSender r9 = r0.g
            r9.send(r10)
            r1.b(r3)
            goto Lbd
        Laa:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.Throwable r10 = defpackage.PS0.a(r10)
            java.lang.String r2 = "Push token deletion failed"
            r9.<init>(r2, r10)
            com.vk.push.common.Logger r10 = r0.l
            com.vk.push.common.Logger.DefaultImpls.warn$default(r10, r2, r6, r5, r6)
            r1.a(r9)
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0070Aq1.b(K81, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r7, defpackage.AbstractC1963Yy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C6534pq1
            if (r0 == 0) goto L13
            r0 = r8
            pq1 r0 = (defpackage.C6534pq1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            pq1 r0 = new pq1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.f
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            boolean r7 = r0.c
            defpackage.RQ1.d(r8)
            goto L6f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.b
            Aq1 r2 = r0.a
            defpackage.RQ1.d(r8)
            goto L57
        L3d:
            defpackage.RQ1.d(r8)
            com.vk.push.common.Logger r8 = r6.l
            java.lang.String r2 = "Saving new push token to the storage"
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r2, r5, r4, r5)
            r0.a = r6
            r0.b = r7
            r0.f = r3
            Vq1 r8 = r6.b
            java.lang.Object r8 = r8.i(r7, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            r2 = r6
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6e
            r0.a = r5
            r0.b = r5
            r0.c = r8
            r0.f = r4
            java.lang.Object r7 = r2.h(r7, r0)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r7 = r8
        L6f:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0070Aq1.c(java.lang.String, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r16, java.lang.Object r17, defpackage.AbstractC1963Yy r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            boolean r2 = r1 instanceof defpackage.C7869wq1
            if (r2 == 0) goto L16
            r2 = r1
            wq1 r2 = (defpackage.C7869wq1) r2
            int r3 = r2.g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.g = r3
            goto L1b
        L16:
            wq1 r2 = new wq1
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.e
            Mz r3 = defpackage.EnumC1030Mz.a
            int r4 = r2.g
            r5 = 1
            if (r4 == 0) goto L3d
            if (r4 != r5) goto L35
            long r3 = r2.d
            java.lang.Object r5 = r2.c
            java.lang.String r6 = r2.b
            com.vk.push.common.analytics.AnalyticsSender r2 = r2.a
            defpackage.RQ1.d(r1)
            r9 = r3
            r11 = r5
            r12 = r6
            goto L67
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            defpackage.RQ1.d(r1)
            com.vk.push.common.analytics.AnalyticsTimingsStore r1 = r0.h
            java.lang.Class<Fq1> r4 = defpackage.C0460Fq1.class
            long r6 = r1.getTimePassed(r4)
            com.vk.push.common.analytics.AnalyticsSender r1 = r0.g
            r2.a = r1
            r4 = r16
            r2.b = r4
            r8 = r17
            r2.c = r8
            r2.d = r6
            r2.g = r5
            Qr1 r5 = r0.i
            java.lang.Object r2 = r5.e(r2)
            if (r2 != r3) goto L61
            return r3
        L61:
            r12 = r4
            r9 = r6
            r11 = r8
            r14 = r2
            r2 = r1
            r1 = r14
        L67:
            com.vk.push.common.AppInfo r1 = (com.vk.push.common.AppInfo) r1
            java.lang.String r13 = r1.getPackageName()
            nt1 r1 = new nt1
            r8 = r1
            r8.<init>(r9, r11, r12, r13)
            r2.send(r1)
            Tf1 r1 = defpackage.C1518Tf1.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0070Aq1.d(java.lang.String, java.lang.Object, Yy):java.lang.Object");
    }

    public final void e(Throwable th) {
        C1518Tf1 c1518Tf1;
        synchronized (this.j) {
            do {
                K81 k81 = (K81) this.j.poll();
                if (k81 != null) {
                    k81.a(th);
                    c1518Tf1 = C1518Tf1.a;
                } else {
                    c1518Tf1 = null;
                }
            } while (c1518Tf1 != null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.AbstractC1963Yy r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C7106sq1
            if (r0 == 0) goto L13
            r0 = r9
            sq1 r0 = (defpackage.C7106sq1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sq1 r0 = new sq1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            Tf1 r3 = defpackage.C1518Tf1.a
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3c
            if (r2 == r6) goto L38
            if (r2 != r4) goto L30
            defpackage.RQ1.d(r9)
            goto L8e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            defpackage.RQ1.d(r9)
            goto L82
        L3c:
            Aq1 r2 = r0.a
            defpackage.RQ1.d(r9)
            Wq1 r9 = (defpackage.C1785Wq1) r9
            java.lang.String r9 = r9.a
            goto L5e
        L46:
            defpackage.RQ1.d(r9)
            com.vk.push.common.Logger r9 = r8.l
            java.lang.String r2 = "Calling register for pushes"
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r2, r7, r6, r7)
            r0.a = r8
            r0.d = r5
            Vq1 r9 = r8.b
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L5d
            return r1
        L5d:
            r2 = r8
        L5e:
            java.lang.String r9 = (java.lang.String) r9
            boolean r5 = defpackage.AbstractC7538v51.C(r9)
            if (r5 == 0) goto L83
            com.vk.push.common.Logger r9 = r2.l
            java.lang.String r4 = "No saved push token found."
            com.vk.push.common.Logger.DefaultImpls.warn$default(r9, r4, r7, r6, r7)
            Q81 r9 = new Q81
            r9.<init>()
            K81 r4 = new K81
            r4.<init>(r9)
            r0.a = r7
            r0.d = r6
            java.lang.Object r9 = r2.g(r4, r0)
            if (r9 != r1) goto L82
            return r1
        L82:
            return r3
        L83:
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r2.h(r9, r0)
            if (r9 != r1) goto L8e
            return r1
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0070Aq1.f(Yy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0105 A[Catch: Exception -> 0x0113, TryCatch #7 {Exception -> 0x0113, blocks: (B:223:0x00ed, B:225:0x0105, B:227:0x010b, B:230:0x0117, B:232:0x0124, B:234:0x0140, B:237:0x0150), top: B:319:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0124 A[Catch: Exception -> 0x0113, TryCatch #7 {Exception -> 0x0113, blocks: (B:223:0x00ed, B:225:0x0105, B:227:0x010b, B:230:0x0117, B:232:0x0124, B:234:0x0140, B:237:0x0150), top: B:319:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0187 A[Catch: Exception -> 0x01da, TryCatch #2 {Exception -> 0x01da, blocks: (B:269:0x01be, B:271:0x01c6, B:275:0x01dd, B:276:0x01e6, B:285:0x01fc, B:287:0x01fe, B:288:0x01ff, B:247:0x0183, B:249:0x0187, B:253:0x018e, B:261:0x019b, B:264:0x01a2, B:266:0x01b2, B:289:0x0200, B:291:0x0206, B:292:0x020d, B:277:0x01e7, B:279:0x01f1), top: B:313:0x0183, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01c6 A[Catch: Exception -> 0x01da, TryCatch #2 {Exception -> 0x01da, blocks: (B:269:0x01be, B:271:0x01c6, B:275:0x01dd, B:276:0x01e6, B:285:0x01fc, B:287:0x01fe, B:288:0x01ff, B:247:0x0183, B:249:0x0187, B:253:0x018e, B:261:0x019b, B:264:0x01a2, B:266:0x01b2, B:289:0x0200, B:291:0x0206, B:292:0x020d, B:277:0x01e7, B:279:0x01f1), top: B:313:0x0183, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01dd A[Catch: Exception -> 0x01da, TryCatch #2 {Exception -> 0x01da, blocks: (B:269:0x01be, B:271:0x01c6, B:275:0x01dd, B:276:0x01e6, B:285:0x01fc, B:287:0x01fe, B:288:0x01ff, B:247:0x0183, B:249:0x0187, B:253:0x018e, B:261:0x019b, B:264:0x01a2, B:266:0x01b2, B:289:0x0200, B:291:0x0206, B:292:0x020d, B:277:0x01e7, B:279:0x01f1), top: B:313:0x0183, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0206 A[Catch: Exception -> 0x01da, TryCatch #2 {Exception -> 0x01da, blocks: (B:269:0x01be, B:271:0x01c6, B:275:0x01dd, B:276:0x01e6, B:285:0x01fc, B:287:0x01fe, B:288:0x01ff, B:247:0x0183, B:249:0x0187, B:253:0x018e, B:261:0x019b, B:264:0x01a2, B:266:0x01b2, B:289:0x0200, B:291:0x0206, B:292:0x020d, B:277:0x01e7, B:279:0x01f1), top: B:313:0x0183, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0234  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [Aq1] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r12v0, types: [K81, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.K81 r12, defpackage.AbstractC1963Yy r13) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0070Aq1.g(K81, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00cc A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:118:0x00c8, B:120:0x00cc, B:127:0x0109, B:126:0x0106, B:125:0x00f4, B:101:0x006e, B:115:0x00b7), top: B:146:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0125 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:89:0x003d, B:131:0x011f, B:133:0x0125), top: B:142:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r18, defpackage.AbstractC1963Yy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0070Aq1.h(java.lang.String, Yy):java.lang.Object");
    }
}
