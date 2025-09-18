package defpackage;

import com.vk.push.core.filedatastore.FileDataStore;

/* renamed from: Hs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0622Hs1 {
    public final FileDataStore a;
    public final FileDataStore b;

    public C0622Hs1(FileDataStore fileDataStore, FileDataStore fileDataStore2) {
        O90.f(fileDataStore, "masterHostStorage");
        O90.f(fileDataStore2, "defaultMasterHostStorage");
        this.a = fileDataStore;
        this.b = fileDataStore2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.AbstractC1963Yy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C7112ss1
            if (r0 == 0) goto L13
            r0 = r6
            ss1 r0 = (defpackage.C7112ss1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ss1 r0 = new ss1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.RQ1.d(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            Hs1 r2 = r0.a
            defpackage.RQ1.d(r6)
            goto L49
        L38:
            defpackage.RQ1.d(r6)
            r0.a = r5
            r0.d = r4
            com.vk.push.core.filedatastore.FileDataStore r6 = r5.a
            java.lang.Object r6 = r6.clear(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            com.vk.push.core.filedatastore.FileDataStore r6 = r2.b
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.clear(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            Tf1 r6 = defpackage.C1518Tf1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0622Hs1.a(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.vk.push.common.AppInfo r11, defpackage.AbstractC1963Yy r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.C7685vs1
            if (r0 == 0) goto L13
            r0 = r12
            vs1 r0 = (defpackage.C7685vs1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            vs1 r0 = new vs1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3c
            if (r2 != r5) goto L34
            java.lang.Object r11 = r0.b
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r0.a
            com.vk.push.common.AppInfo r0 = (com.vk.push.common.AppInfo) r0
            defpackage.RQ1.d(r12)
            goto L81
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            java.lang.Object r11 = r0.b
            com.vk.push.common.AppInfo r11 = (com.vk.push.common.AppInfo) r11
            java.lang.Object r2 = r0.a
            Hs1 r2 = (defpackage.C0622Hs1) r2
            defpackage.RQ1.d(r12)
            goto L5b
        L48:
            defpackage.RQ1.d(r12)
            r0.a = r10
            r0.b = r11
            r0.e = r6
            com.vk.push.core.filedatastore.FileDataStore r12 = r10.b
            java.lang.Object r12 = r12.read(r0)
            if (r12 != r1) goto L5a
            return r1
        L5a:
            r2 = r10
        L5b:
            os1 r12 = (defpackage.C6349os1) r12
            if (r12 == 0) goto L62
            java.lang.String r12 = r12.a
            goto L63
        L62:
            r12 = r4
        L63:
            if (r11 == 0) goto L8c
            com.vk.push.core.filedatastore.FileDataStore r2 = r2.b
            os1 r7 = new os1
            java.lang.String r8 = r11.getPackageName()
            r7.<init>(r8)
            r0.a = r11
            r0.b = r12
            r0.e = r5
            java.lang.Object r0 = r2.write(r7, r0)
            if (r0 != r1) goto L7d
            return r1
        L7d:
            r9 = r0
            r0 = r11
            r11 = r12
            r12 = r9
        L81:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r9 = r12
            r12 = r11
            r11 = r0
            r0 = r9
            goto L8d
        L8c:
            r0 = r3
        L8d:
            if (r11 == 0) goto L93
            java.lang.String r4 = r11.getPackageName()
        L93:
            boolean r11 = defpackage.O90.a(r12, r4)
            if (r11 != 0) goto L9c
            if (r0 == 0) goto L9c
            r3 = r6
        L9c:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0622Hs1.b(com.vk.push.common.AppInfo, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.AbstractC1963Yy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C7303ts1
            if (r0 == 0) goto L13
            r0 = r5
            ts1 r0 = (defpackage.C7303ts1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ts1 r0 = new ts1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.RQ1.d(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.RQ1.d(r5)
            r0.c = r3
            com.vk.push.core.filedatastore.FileDataStore r5 = r4.a
            java.lang.Object r5 = r5.read(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            is1 r5 = (defpackage.C5204is1) r5
            if (r5 == 0) goto L4b
            com.vk.push.common.AppInfo r0 = new com.vk.push.common.AppInfo
            java.lang.String r1 = r5.a
            java.lang.String r5 = r5.b
            r0.<init>(r1, r5)
            goto L4c
        L4b:
            r0 = 0
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0622Hs1.c(Yy):java.lang.Object");
    }
}
