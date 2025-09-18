package defpackage;

import android.os.Trace;
import java.net.URI;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld9;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-asset_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d9 */
/* loaded from: classes2.dex */
public final class C3336d9 extends AbstractC7874ws0 {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.C3336d9 r5, defpackage.C7 r6, java.net.URI r7, java.io.File r8, defpackage.AbstractC1963Yy r9) throws defpackage.C1319Qr0 {
        /*
            r5.getClass()
            boolean r0 = r9 instanceof defpackage.C2270b9
            if (r0 == 0) goto L16
            r0 = r9
            b9 r0 = (defpackage.C2270b9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.c = r1
            goto L1b
        L16:
            b9 r0 = new b9
            r0.<init>(r5, r9)
        L1b:
            java.lang.Object r9 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.RQ1.d(r9)
            goto L7f
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.RQ1.d(r9)
            java.io.File r9 = r8.getParentFile()
            if (r9 == 0) goto L42
            boolean r9 = r9.exists()
            if (r9 != r3) goto L42
            goto L45
        L42:
            r8.mkdirs()
        L45:
            r6.getClass()
            r9 = 0
            Js0 r2 = r6.a     // Catch: java.lang.Exception -> L54
            java.lang.Class<CT> r4 = defpackage.CT.class
            java.util.HashMap r2 = r2.a     // Catch: java.lang.Exception -> L54
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Exception -> L54
            goto L55
        L54:
            r2 = r9
        L55:
            CT r2 = (defpackage.CT) r2
            if (r2 == 0) goto L86
            android.content.Context r2 = r6.c()
            java.lang.String r4 = r8.getParent()
            java.util.EnumSet r2 = defpackage.CT.c(r2, r4)
            OA0 r4 = defpackage.OA0.b
            boolean r2 = r2.contains(r4)
            if (r2 != r3) goto L86
            Qy r6 = r6.j
            Bz r6 = r6.a
            c9 r2 = new c9
            r2.<init>(r7, r5, r8, r9)
            r0.c = r3
            java.lang.Object r9 = defpackage.AbstractC3767fP1.e(r6, r2, r0)
            if (r9 != r1) goto L7f
            goto L85
        L7f:
            java.lang.String r5 = "withContext(...)"
            defpackage.O90.e(r9, r5)
            r1 = r9
        L85:
            return r1
        L86:
            Qr0 r5 = new Qr0
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "toString(...)"
            defpackage.O90.e(r6, r7)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3336d9.d(d9, C7, java.net.URI, java.io.File, Yy):java.lang.Object");
    }

    @Override // defpackage.AbstractC7874ws0
    public final C0075As0 a() {
        OY1.a("[ExpoModulesCore] " + (C3336d9.class + ".ModuleDefinition"));
        try {
            C8444zs0 c8444zs0 = new C8444zs0(this);
            c8444zs0.a = "ExpoAsset";
            C6212o9 c6212o9 = new C6212o9("downloadAsync");
            ((LinkedHashMap) c8444zs0.g).put("downloadAsync", c6212o9);
            X2 x2 = X2.g;
            IP0 ip0 = BP0.a;
            c6212o9.a = new C3713f71("downloadAsync", new O5[]{new O5(new C1679Vh0(ip0.b(URI.class), false, x2)), new O5(new C1679Vh0(ip0.b(String.class), true, X2.h)), new O5(new C1679Vh0(ip0.b(String.class), false, X2.i))}, new C7048sX0(null, this, 2));
            return c8444zs0.b();
        } finally {
            Trace.endSection();
        }
    }
}
