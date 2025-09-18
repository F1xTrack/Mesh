package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: DV */
/* loaded from: classes.dex */
public final class C0221DV {

    /* renamed from: a */
    public static final C0221DV f2022a = new C0221DV();

    /* renamed from: b */
    public static final Map f2023b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: a */
    public static C0095BV m1706a(EnumC9897jZ0 enumC9897jZ0) {
        Map map = f2023b;
        O90.m5967e(map, "dependencies");
        Object obj = map.get(enumC9897jZ0);
        if (obj != null) {
            return (C0095BV) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + enumC9897jZ0 + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x0099, B:25:0x00b0, B:26:0x00c8), top: B:31:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x0098). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1707b(p000.AbstractC1571Yy r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p000.C0158CV
            if (r0 == 0) goto L13
            r0 = r11
            CV r0 = (p000.C0158CV) r0
            int r1 = r0.f1413i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1413i = r1
            goto L18
        L13:
            CV r0 = new CV
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f1411g
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f1413i
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.f1410f
            java.util.Map r4 = r0.f1409e
            java.util.Map r4 = (java.util.Map) r4
            Lt0 r5 = r0.f1408d
            jZ0 r6 = r0.f1407c
            java.util.Iterator r7 = r0.f1406b
            java.util.Map r8 = r0.f1405a
            java.util.Map r8 = (java.util.Map) r8
            p000.RQ1.m7017d(r11)
            goto L98
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            p000.RQ1.m7017d(r11)
            java.util.Map r11 = p000.C0221DV.f2023b
            java.lang.String r2 = "dependencies"
            p000.O90.m5967e(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = p000.AbstractC11205tn0.m24983b(r4)
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
            jZ0 r6 = (p000.EnumC9897jZ0) r6
            java.lang.Object r11 = r11.getValue()
            BV r11 = (p000.C0095BV) r11
            Nt0 r5 = r11.f844a
            r11 = r4
            java.util.Map r11 = (java.util.Map) r11
            r0.f1405a = r11
            r0.f1406b = r7
            r0.f1407c = r6
            r0.f1408d = r5
            r0.f1409e = r11
            r0.f1410f = r2
            r0.f1413i = r3
            java.lang.Object r11 = r5.m5899d(r0)
            if (r11 != r1) goto L97
            return r1
        L97:
            r8 = r4
        L98:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            p000.O90.m5968f(r6, r9)     // Catch: java.lang.Throwable -> Lc9
            BV r9 = m1706a(r6)     // Catch: java.lang.Throwable -> Lc9
            jA r9 = r9.f845b     // Catch: java.lang.Throwable -> Lc9
            if (r9 == 0) goto Lb0
            Nt0 r5 = (p000.C8028Nt0) r5
            r5.m5900e(r11)
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
            Nt0 r5 = (p000.C8028Nt0) r5
            r5.m5900e(r11)
            throw r0
        Ld0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0221DV.m1707b(Yy):java.lang.Object");
    }
}
