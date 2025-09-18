package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: pR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6459pR1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static C6851rV0 a(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof C6851rV0) {
            return (C6851rV0) drawable;
        }
        if (drawable instanceof InterfaceC5293jL) {
            return a(((InterfaceC5293jL) drawable).p());
        }
        if (drawable instanceof C6269oS) {
            C6269oS c6269oS = (C6269oS) drawable;
            int length = c6269oS.c.length;
            for (int i = 0; i < length; i++) {
                C6851rV0 c6851rV0A = a(c6269oS.c(i));
                if (c6851rV0A != null) {
                    return c6851rV0A;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.C0686Io r3, defpackage.S91 r4, defpackage.CD0 r5, boolean r6, int r7, java.lang.String r8, defpackage.AbstractC1963Yy r9) {
        /*
            boolean r8 = r9 instanceof defpackage.C0764Jo
            if (r8 == 0) goto L13
            r8 = r9
            Jo r8 = (defpackage.C0764Jo) r8
            int r0 = r8.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.e = r0
            goto L18
        L13:
            Jo r8 = new Jo
            r8.<init>(r9)
        L18:
            java.lang.Object r9 = r8.d
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r8.e
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            int r7 = r8.c
            boolean r6 = r8.b
            Io r3 = r8.a
            defpackage.RQ1.d(r9)
            goto L59
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L35:
            defpackage.RQ1.d(r9)
            java.util.concurrent.Executor r9 = defpackage.AbstractC3556eJ.c(r4)
            java.lang.String r1 = "getMainExecutor(...)"
            defpackage.O90.e(r9, r1)
            Jj0 r4 = androidx.camera.extensions.a.b(r4, r5)
            java.lang.String r5 = "getInstanceAsync(...)"
            defpackage.O90.e(r4, r5)
            r8.a = r3
            r8.b = r6
            r8.c = r7
            r8.e = r2
            java.lang.Object r9 = defpackage.AbstractC4368iZ.a(r4, r9, r8)
            if (r9 != r0) goto L59
            return r0
        L59:
            androidx.camera.extensions.a r9 = (androidx.camera.extensions.a) r9
            boolean r4 = r9.d(r3, r7)
            if (r4 == 0) goto L73
            if (r6 == 0) goto L6a
            boolean r4 = r9.e(r3, r7)
            if (r4 != 0) goto L6a
            return r3
        L6a:
            Io r3 = r9.a(r3, r7)
            java.lang.String r4 = "getExtensionEnabledCameraSelector(...)"
            defpackage.O90.e(r3, r4)
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6459pR1.b(Io, S91, CD0, boolean, int, java.lang.String, Yy):java.lang.Object");
    }
}
