package p000;

import com.p019vk.push.common.AppInfo;
import com.p019vk.push.common.Logger;
import com.p019vk.push.common.analytics.AnalyticsSender;
import com.p019vk.push.core.data.source.PackageManagerDataSource;
import com.p019vk.push.core.network.data.source.MasterHostApi;

/* renamed from: Qr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8181Qr1 {

    /* renamed from: a */
    public final PackageManagerDataSource f9820a;

    /* renamed from: b */
    public final C7715Hs1 f9821b;

    /* renamed from: c */
    public final MasterHostApi f9822c;

    /* renamed from: d */
    public final C10226m71 f9823d;

    /* renamed from: e */
    public final C8233Rr1 f9824e;

    /* renamed from: f */
    public final AnalyticsSender f9825f;

    /* renamed from: g */
    public final Logger f9826g;

    /* renamed from: h */
    public final C8028Nt0 f9827h;

    public C8181Qr1(PackageManagerDataSource packageManagerDataSource, C10689pl0 c10689pl0, C7715Hs1 c7715Hs1, MasterHostApi masterHostApi, C10226m71 c10226m71, C8233Rr1 c8233Rr1, AnalyticsSender analyticsSender, Logger logger) {
        O90.m5968f(analyticsSender, "analyticsSender");
        O90.m5968f(logger, "logger");
        this.f9820a = packageManagerDataSource;
        this.f9821b = c7715Hs1;
        this.f9822c = masterHostApi;
        this.f9823d = c10226m71;
        this.f9824e = c8233Rr1;
        this.f9825f = analyticsSender;
        this.f9826g = logger.createLogger(this);
        this.f9827h = SA1.m7187a();
    }

    /* renamed from: a */
    public final AppInfo m6794a(AbstractC10702pr1 abstractC10702pr1) {
        this.f9825f.send(new C7869Kr1(RQ1.m7015b(abstractC10702pr1)));
        return (AppInfo) C7719Hu1.f4578E.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6795b(p000.AbstractC1571Yy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p000.C11214tr1
            if (r0 == 0) goto L13
            r0 = r8
            tr1 r0 = (p000.C11214tr1) r0
            int r1 = r0.f43381e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43381e = r1
            goto L18
        L13:
            tr1 r0 = new tr1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f43379c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f43381e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f43377a
            Lt0 r0 = (p000.InterfaceC7924Lt0) r0
            p000.RQ1.m7017d(r8)     // Catch: java.lang.Throwable -> L2f
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
            Nt0 r2 = r0.f43378b
            java.lang.Object r4 = r0.f43377a
            Qr1 r4 = (p000.C8181Qr1) r4
            p000.RQ1.m7017d(r8)
            r8 = r2
            goto L57
        L44:
            p000.RQ1.m7017d(r8)
            r0.f43377a = r7
            Nt0 r8 = r7.f9827h
            r0.f43378b = r8
            r0.f43381e = r4
            java.lang.Object r2 = r8.m5899d(r0)
            if (r2 != r1) goto L56
            return r1
        L56:
            r4 = r7
        L57:
            Hs1 r2 = r4.f9821b     // Catch: java.lang.Throwable -> L6f
            r0.f43377a = r8     // Catch: java.lang.Throwable -> L6f
            r0.f43378b = r5     // Catch: java.lang.Throwable -> L6f
            r0.f43381e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r2.m3637a(r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 != r1) goto L66
            return r1
        L66:
            r0 = r8
        L67:
            Tf1 r8 = p000.C8313Tf1.f11463a     // Catch: java.lang.Throwable -> L2f
            Nt0 r0 = (p000.C8028Nt0) r0
            r0.m5900e(r5)
            return r8
        L6f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L73:
            Nt0 r0 = (p000.C8028Nt0) r0
            r0.m5900e(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8181Qr1.m6795b(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6796c(com.p019vk.push.common.AppInfo r6, boolean r7, p000.AbstractC1571Yy r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p000.C11978zr1
            if (r0 == 0) goto L13
            r0 = r8
            zr1 r0 = (p000.C11978zr1) r0
            int r1 = r0.f47051f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47051f = r1
            goto L18
        L13:
            zr1 r0 = new zr1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f47049d
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f47051f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r7 = r0.f47048c
            com.vk.push.common.AppInfo r6 = r0.f47047b
            Qr1 r0 = r0.f47046a
            p000.RQ1.m7017d(r8)
            goto L59
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            p000.RQ1.m7017d(r8)
            r0.f47046a = r5
            r0.f47047b = r6
            r0.f47048c = r7
            r0.f47051f = r3
            Hs1 r8 = r5.f9821b
            is1 r2 = new is1
            java.lang.String r3 = r6.getPackageName()
            java.lang.String r4 = r6.getPubKey()
            r2.<init>(r3, r4)
            com.vk.push.core.filedatastore.FileDataStore r8 = r8.f4564a
            java.lang.Object r8 = r8.write(r2, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r0 = r5
        L59:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L75
            com.vk.push.common.analytics.AnalyticsSender r8 = r0.f9825f
            Kr1 r0 = new Kr1
            Dq1 r1 = new Dq1
            java.lang.String r6 = r6.getPackageName()
            r1.<init>(r6, r7)
            r0.<init>(r1)
            r8.send(r0)
            goto L85
        L75:
            com.vk.push.common.analytics.AnalyticsSender r6 = r0.f9825f
            Kr1 r7 = new Kr1
            ir1 r8 = p000.C9806ir1.f34778a
            OS0 r8 = p000.RQ1.m7015b(r8)
            r7.<init>(r8)
            r6.send(r7)
        L85:
            Tf1 r6 = p000.C8313Tf1.f11463a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8181Qr1.m6796c(com.vk.push.common.AppInfo, boolean, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6797d(java.util.List r5, p000.AbstractC1571Yy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.C11470vr1
            if (r0 == 0) goto L13
            r0 = r6
            vr1 r0 = (p000.C11470vr1) r0
            int r1 = r0.f44571d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44571d = r1
            goto L18
        L13:
            vr1 r0 = new vr1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f44569b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f44571d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Qr1 r5 = r0.f44568a
            p000.RQ1.m7017d(r6)
            PS0 r6 = (p000.PS0) r6
            java.lang.Object r6 = r6.f9075a
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p000.RQ1.m7017d(r6)
            r0.f44568a = r4
            r0.f44571d = r3
            com.vk.push.core.network.data.source.MasterHostApi r6 = r4.f9822c
            java.lang.Object r6 = r6.m26677getHostListgIAlus(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Throwable r0 = p000.PS0.m6365a(r6)
            if (r0 != 0) goto L4d
            goto L56
        L4d:
            com.vk.push.common.Logger r5 = r5.f9826g
            java.lang.String r6 = "Unable to get host list. Will be used empty host list"
            r5.warn(r6, r0)
            MN r6 = p000.C0779MN.f7117a
        L56:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8181Qr1.m6797d(java.util.List, Yy):java.lang.Object");
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
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6798e(p000.AbstractC1571Yy r13) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8181Qr1.m6798e(Yy):java.lang.Object");
    }
}
