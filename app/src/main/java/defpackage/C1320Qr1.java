package defpackage;

import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.network.data.source.MasterHostApi;

/* renamed from: Qr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1320Qr1 {
    public final PackageManagerDataSource a;
    public final C0622Hs1 b;
    public final MasterHostApi c;
    public final C5826m71 d;
    public final C1398Rr1 e;
    public final AnalyticsSender f;
    public final Logger g;
    public final C1091Nt0 h;

    public C1320Qr1(PackageManagerDataSource packageManagerDataSource, C6518pl0 c6518pl0, C0622Hs1 c0622Hs1, MasterHostApi masterHostApi, C5826m71 c5826m71, C1398Rr1 c1398Rr1, AnalyticsSender analyticsSender, Logger logger) {
        O90.f(analyticsSender, "analyticsSender");
        O90.f(logger, "logger");
        this.a = packageManagerDataSource;
        this.b = c0622Hs1;
        this.c = masterHostApi;
        this.d = c5826m71;
        this.e = c1398Rr1;
        this.f = analyticsSender;
        this.g = logger.createLogger(this);
        this.h = SA1.a();
    }

    public final AppInfo a(AbstractC6537pr1 abstractC6537pr1) {
        this.f.send(new C0853Kr1(RQ1.b(abstractC6537pr1)));
        return (AppInfo) C0628Hu1.E.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.AbstractC1963Yy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.C7300tr1
            if (r0 == 0) goto L13
            r0 = r8
            tr1 r0 = (defpackage.C7300tr1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            tr1 r0 = new tr1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.a
            Lt0 r0 = (defpackage.InterfaceC0935Lt0) r0
            defpackage.RQ1.d(r8)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r8 = move-exception
            goto L73
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            Nt0 r2 = r0.b
            java.lang.Object r4 = r0.a
            Qr1 r4 = (defpackage.C1320Qr1) r4
            defpackage.RQ1.d(r8)
            r8 = r2
            goto L57
        L44:
            defpackage.RQ1.d(r8)
            r0.a = r7
            Nt0 r8 = r7.h
            r0.b = r8
            r0.e = r4
            java.lang.Object r2 = r8.d(r0)
            if (r2 != r1) goto L56
            return r1
        L56:
            r4 = r7
        L57:
            Hs1 r2 = r4.b     // Catch: java.lang.Throwable -> L6f
            r0.a = r8     // Catch: java.lang.Throwable -> L6f
            r0.b = r5     // Catch: java.lang.Throwable -> L6f
            r0.e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 != r1) goto L66
            return r1
        L66:
            r0 = r8
        L67:
            Tf1 r8 = defpackage.C1518Tf1.a     // Catch: java.lang.Throwable -> L2f
            Nt0 r0 = (defpackage.C1091Nt0) r0
            r0.e(r5)
            return r8
        L6f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L73:
            Nt0 r0 = (defpackage.C1091Nt0) r0
            r0.e(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1320Qr1.b(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.vk.push.common.AppInfo r6, boolean r7, defpackage.AbstractC1963Yy r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C8442zr1
            if (r0 == 0) goto L13
            r0 = r8
            zr1 r0 = (defpackage.C8442zr1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            zr1 r0 = new zr1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.d
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r7 = r0.c
            com.vk.push.common.AppInfo r6 = r0.b
            Qr1 r0 = r0.a
            defpackage.RQ1.d(r8)
            goto L59
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.RQ1.d(r8)
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.f = r3
            Hs1 r8 = r5.b
            is1 r2 = new is1
            java.lang.String r3 = r6.getPackageName()
            java.lang.String r4 = r6.getPubKey()
            r2.<init>(r3, r4)
            com.vk.push.core.filedatastore.FileDataStore r8 = r8.a
            java.lang.Object r8 = r8.write(r2, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r0 = r5
        L59:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L75
            com.vk.push.common.analytics.AnalyticsSender r8 = r0.f
            Kr1 r0 = new Kr1
            Dq1 r1 = new Dq1
            java.lang.String r6 = r6.getPackageName()
            r1.<init>(r6, r7)
            r0.<init>(r1)
            r8.send(r0)
            goto L85
        L75:
            com.vk.push.common.analytics.AnalyticsSender r6 = r0.f
            Kr1 r7 = new Kr1
            ir1 r8 = defpackage.C5201ir1.a
            OS0 r8 = defpackage.RQ1.b(r8)
            r7.<init>(r8)
            r6.send(r7)
        L85:
            Tf1 r6 = defpackage.C1518Tf1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1320Qr1.c(com.vk.push.common.AppInfo, boolean, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r5, defpackage.AbstractC1963Yy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C7682vr1
            if (r0 == 0) goto L13
            r0 = r6
            vr1 r0 = (defpackage.C7682vr1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vr1 r0 = new vr1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Qr1 r5 = r0.a
            defpackage.RQ1.d(r6)
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r6 = r6.a
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.RQ1.d(r6)
            r0.a = r4
            r0.d = r3
            com.vk.push.core.network.data.source.MasterHostApi r6 = r4.c
            java.lang.Object r6 = r6.m83getHostListgIAlus(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Throwable r0 = defpackage.PS0.a(r6)
            if (r0 != 0) goto L4d
            goto L56
        L4d:
            com.vk.push.common.Logger r5 = r5.g
            java.lang.String r6 = "Unable to get host list. Will be used empty host list"
            r5.warn(r6, r0)
            MN r6 = defpackage.MN.a
        L56:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1320Qr1.d(java.util.List, Yy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee A[Catch: all -> 0x020c, TRY_LEAVE, TryCatch #7 {all -> 0x020c, blocks: (B:103:0x01e8, B:105:0x01ee, B:110:0x0210, B:111:0x0215, B:113:0x021b, B:115:0x022b, B:120:0x0238, B:121:0x023c, B:123:0x0242, B:127:0x0255, B:129:0x025a, B:130:0x026e, B:132:0x0274, B:133:0x0282, B:135:0x0287, B:138:0x0291, B:141:0x029b, B:148:0x02ad), top: B:167:0x01e8, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #5 {all -> 0x007b, blocks: (B:26:0x0072, B:39:0x00ac, B:50:0x00fa, B:52:0x0102), top: B:164:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116 A[Catch: all -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x009c, blocks: (B:34:0x0097, B:56:0x0116, B:59:0x0123), top: B:166:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123 A[Catch: all -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x009c, blocks: (B:34:0x0097, B:56:0x0116, B:59:0x0123), top: B:166:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141 A[Catch: all -> 0x0235, TRY_ENTER, TryCatch #1 {all -> 0x0235, blocks: (B:114:0x0228, B:134:0x0284, B:139:0x0297, B:97:0x01d9, B:31:0x0086, B:63:0x0137, B:67:0x0141, B:69:0x014d, B:72:0x0160), top: B:161:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b A[Catch: all -> 0x018a, TRY_LEAVE, TryCatch #4 {all -> 0x018a, blocks: (B:76:0x0173, B:78:0x017b, B:83:0x018e, B:85:0x0194, B:91:0x01b3, B:93:0x01bb, B:96:0x01d1, B:99:0x01dc), top: B:165:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e A[Catch: all -> 0x018a, TRY_ENTER, TryCatch #4 {all -> 0x018a, blocks: (B:76:0x0173, B:78:0x017b, B:83:0x018e, B:85:0x0194, B:91:0x01b3, B:93:0x01bb, B:96:0x01d1, B:99:0x01dc), top: B:165:0x0173 }] */
    /* JADX WARN: Type inference failed for: r13v7, types: [Nt0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [Lt0] */
    /* JADX WARN: Type inference failed for: r6v14, types: [Lt0] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.AbstractC1963Yy r13) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1320Qr1.e(Yy):java.lang.Object");
    }
}
