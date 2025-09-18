package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class DV {
    public static final DV a = new DV();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static BV a(EnumC5336jZ0 enumC5336jZ0) {
        Map map = b;
        O90.e(map, "dependencies");
        Object obj = map.get(enumC5336jZ0);
        if (obj != null) {
            return (BV) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + enumC5336jZ0 + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x0099, B:25:0x00b0, B:26:0x00c8), top: B:31:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.AbstractC1963Yy r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.CV
            if (r0 == 0) goto L13
            r0 = r11
            CV r0 = (defpackage.CV) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            CV r0 = new CV
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.g
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.f
            java.util.Map r4 = r0.e
            java.util.Map r4 = (java.util.Map) r4
            Lt0 r5 = r0.d
            jZ0 r6 = r0.c
            java.util.Iterator r7 = r0.b
            java.util.Map r8 = r0.a
            java.util.Map r8 = (java.util.Map) r8
            defpackage.RQ1.d(r11)
            goto L98
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            defpackage.RQ1.d(r11)
            java.util.Map r11 = defpackage.DV.b
            java.lang.String r2 = "dependencies"
            defpackage.O90.e(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = defpackage.AbstractC7287tn0.b(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r4 = r2
        L60:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Ld0
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            jZ0 r6 = (defpackage.EnumC5336jZ0) r6
            java.lang.Object r11 = r11.getValue()
            BV r11 = (defpackage.BV) r11
            Nt0 r5 = r11.a
            r11 = r4
            java.util.Map r11 = (java.util.Map) r11
            r0.a = r11
            r0.b = r7
            r0.c = r6
            r0.d = r5
            r0.e = r11
            r0.f = r2
            r0.i = r3
            java.lang.Object r11 = r5.d(r0)
            if (r11 != r1) goto L97
            return r1
        L97:
            r8 = r4
        L98:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            defpackage.O90.f(r6, r9)     // Catch: java.lang.Throwable -> Lc9
            BV r9 = a(r6)     // Catch: java.lang.Throwable -> Lc9
            jA r9 = r9.b     // Catch: java.lang.Throwable -> Lc9
            if (r9 == 0) goto Lb0
            Nt0 r5 = (defpackage.C1091Nt0) r5
            r5.e(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L60
        Lb0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc9
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r0 = move-exception
            Nt0 r5 = (defpackage.C1091Nt0) r5
            r5.e(r11)
            throw r0
        Ld0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DV.b(Yy):java.lang.Object");
    }
}
