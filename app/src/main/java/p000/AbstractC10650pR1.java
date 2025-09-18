package p000;

import android.graphics.drawable.Drawable;

/* renamed from: pR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10650pR1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C10913rV0 m23785a(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof C10913rV0) {
            return (C10913rV0) drawable;
        }
        if (drawable instanceof InterfaceC6231jL) {
            return m23785a(((InterfaceC6231jL) drawable).mo22024p());
        }
        if (drawable instanceof C6553oS) {
            C6553oS c6553oS = (C6553oS) drawable;
            int length = c6553oS.f39002c.length;
            for (int i = 0; i < length; i++) {
                C10913rV0 c10913rV0M23785a = m23785a(c6553oS.m23407c(i));
                if (c10913rV0M23785a != null) {
                    return c10913rV0M23785a;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m23786b(p000.C0555Io r3, p000.S91 r4, p000.CD0 r5, boolean r6, int r7, java.lang.String r8, p000.AbstractC1571Yy r9) {
        /*
            boolean r8 = r9 instanceof p000.C0618Jo
            if (r8 == 0) goto L13
            r8 = r9
            Jo r8 = (p000.C0618Jo) r8
            int r0 = r8.f5707e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.f5707e = r0
            goto L18
        L13:
            Jo r8 = new Jo
            r8.<init>(r9)
        L18:
            java.lang.Object r9 = r8.f5706d
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r8.f5707e
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            int r7 = r8.f5705c
            boolean r6 = r8.f5704b
            Io r3 = r8.f5703a
            p000.RQ1.m7017d(r9)
            goto L59
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L35:
            p000.RQ1.m7017d(r9)
            java.util.concurrent.Executor r9 = p000.AbstractC3982eJ.m17901c(r4)
            java.lang.String r1 = "getMainExecutor(...)"
            p000.O90.m5967e(r9, r1)
            Jj0 r4 = androidx.camera.extensions.C1691a.m9899b(r4, r5)
            java.lang.String r5 = "getInstanceAsync(...)"
            p000.O90.m5967e(r4, r5)
            r8.f5703a = r3
            r8.f5704b = r6
            r8.f5705c = r7
            r8.f5707e = r2
            java.lang.Object r9 = p000.AbstractC4250iZ.m19062a(r4, r9, r8)
            if (r9 != r0) goto L59
            return r0
        L59:
            androidx.camera.extensions.a r9 = (androidx.camera.extensions.C1691a) r9
            boolean r4 = r9.m9903d(r3, r7)
            if (r4 == 0) goto L73
            if (r6 == 0) goto L6a
            boolean r4 = r9.m9904e(r3, r7)
            if (r4 != 0) goto L6a
            return r3
        L6a:
            Io r3 = r9.m9902a(r3, r7)
            java.lang.String r4 = "getExtensionEnabledCameraSelector(...)"
            p000.O90.m5967e(r3, r4)
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10650pR1.m23786b(Io, S91, CD0, boolean, int, java.lang.String, Yy):java.lang.Object");
    }
}
