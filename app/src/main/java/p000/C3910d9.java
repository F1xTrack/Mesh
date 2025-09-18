package p000;

import android.os.Trace;
import java.net.URI;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m22267d2 = {"Ld9;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-asset_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* renamed from: d9 */
/* loaded from: classes2.dex */
public final class C3910d9 extends AbstractC11598ws0 {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0016  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m17496d(p000.C3910d9 r5, p000.C0134C7 r6, java.net.URI r7, java.io.File r8, p000.AbstractC1571Yy r9) throws p000.C8180Qr0 {
        /*
            r5.getClass()
            boolean r0 = r9 instanceof p000.C1767b9
            if (r0 == 0) goto L16
            r0 = r9
            b9 r0 = (p000.C1767b9) r0
            int r1 = r0.f16824c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f16824c = r1
            goto L1b
        L16:
            b9 r0 = new b9
            r0.<init>(r5, r9)
        L1b:
            java.lang.Object r9 = r0.f16822a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f16824c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            p000.RQ1.m7017d(r9)
            goto L7f
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            p000.RQ1.m7017d(r9)
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
            Js0 r2 = r6.f1196a     // Catch: java.lang.Exception -> L54
            java.lang.Class<CT> r4 = p000.C0156CT.class
            java.util.HashMap r2 = r2.f5762a     // Catch: java.lang.Exception -> L54
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Exception -> L54
            goto L55
        L54:
            r2 = r9
        L55:
            CT r2 = (p000.C0156CT) r2
            if (r2 == 0) goto L86
            android.content.Context r2 = r6.m987c()
            java.lang.String r4 = r8.getParent()
            java.util.EnumSet r2 = p000.C0156CT.m1190c(r2, r4)
            OA0 r4 = p000.OA0.f8265b
            boolean r2 = r2.contains(r4)
            if (r2 != r3) goto L86
            Qy r6 = r6.f1205j
            Bz r6 = r6.f9874a
            c9 r2 = new c9
            r2.<init>(r7, r5, r8, r9)
            r0.f16824c = r3
            java.lang.Object r9 = p000.AbstractC9366fP1.m18233e(r6, r2, r0)
            if (r9 != r1) goto L7f
            goto L85
        L7f:
            java.lang.String r5 = "withContext(...)"
            p000.O90.m5967e(r9, r5)
            r1 = r9
        L85:
            return r1
        L86:
            Qr0 r5 = new Qr0
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "toString(...)"
            p000.O90.m5967e(r6, r7)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3910d9.m17496d(d9, C7, java.net.URI, java.io.File, Yy):java.lang.Object");
    }

    @Override // p000.AbstractC11598ws0
    /* renamed from: a */
    public final C7350As0 mo2834a() {
        OY1.m6083a("[ExpoModulesCore] " + (C3910d9.class + ".ModuleDefinition"));
        try {
            C11979zs0 c11979zs0 = new C11979zs0(this);
            c11979zs0.f47055a = "ExpoAsset";
            C6534o9 c6534o9 = new C6534o9("downloadAsync");
            ((LinkedHashMap) c11979zs0.f47061g).put("downloadAsync", c6534o9);
            C1450X2 c1450x2 = C1450X2.f13503g;
            IP0 ip0 = BP0.f799a;
            c6534o9.f38832a = new C9330f71("downloadAsync", new C0887O5[]{new C0887O5(new C8420Vh0(ip0.mo3846b(URI.class), false, c1450x2)), new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), true, C1450X2.f13504h)), new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, C1450X2.f13505i))}, new C11045sX0(null, this, 2));
            return c11979zs0.m26561b();
        } finally {
            Trace.endSection();
        }
    }
}
