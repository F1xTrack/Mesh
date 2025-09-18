package defpackage;

import com.vk.push.core.filedatastore.FileDataStore;

/* renamed from: Uv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1644Uv1 {
    public final FileDataStore a;

    public C1644Uv1(FileDataStore fileDataStore) {
        O90.f(fileDataStore, "storage");
        this.a = fileDataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r7, defpackage.AbstractC1963Yy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C1410Rv1
            if (r0 == 0) goto L13
            r0 = r8
            Rv1 r0 = (defpackage.C1410Rv1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Rv1 r0 = new Rv1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r7 = r0.b
            java.lang.Object r0 = r0.a
            Qv1 r0 = (defpackage.C1332Qv1) r0
            defpackage.RQ1.d(r8)
            goto L6c
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            int r7 = r0.b
            java.lang.Object r2 = r0.a
            Uv1 r2 = (defpackage.C1644Uv1) r2
            defpackage.RQ1.d(r8)
            goto L55
        L42:
            defpackage.RQ1.d(r8)
            r0.a = r6
            r0.b = r7
            r0.e = r4
            com.vk.push.core.filedatastore.FileDataStore r8 = r6.a
            java.lang.Object r8 = r8.read(r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            Qv1 r8 = (defpackage.C1332Qv1) r8
            com.vk.push.core.filedatastore.FileDataStore r2 = r2.a
            Qv1 r5 = new Qv1
            r5.<init>(r7)
            r0.a = r8
            r0.b = r7
            r0.e = r3
            java.lang.Object r0 = r2.write(r5, r0)
            if (r0 != r1) goto L6b
            return r1
        L6b:
            r0 = r8
        L6c:
            if (r0 == 0) goto L74
            int r8 = r0.a
            if (r8 != r7) goto L74
            r7 = r4
            goto L75
        L74:
            r7 = 0
        L75:
            r7 = r7 ^ r4
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1644Uv1.a(int, Yy):java.lang.Object");
    }
}
