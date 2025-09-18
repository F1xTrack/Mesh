package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2706dg;
import com.yandex.metrica.impl.ob.P3;
import defpackage.AbstractC7287tn0;
import defpackage.O90;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.da, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2700da implements InterfaceC2725ea<P3, C2706dg> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public P3 a(C2706dg c2706dg) {
        C2706dg c2706dg2 = c2706dg;
        C2706dg.a aVar = c2706dg2.b;
        if (aVar == null) {
            aVar = new C2706dg.a();
        }
        P3.a aVarA = a(aVar);
        C2706dg.a[] aVarArr = c2706dg2.c;
        O90.e(aVarArr, "nano.candidates");
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C2706dg.a aVar2 : aVarArr) {
            O90.e(aVar2, "it");
            arrayList.add(a(aVar2));
        }
        return new P3(aVarA, arrayList);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2706dg b(P3 p3) {
        P3 p32 = p3;
        C2706dg c2706dg = new C2706dg();
        c2706dg.b = a(p32.c());
        int size = p32.a().size();
        C2706dg.a[] aVarArr = new C2706dg.a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = a(p32.a().get(i));
        }
        c2706dg.c = aVarArr;
        return c2706dg;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[PHI: r1
  0x0066: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:15:0x0060, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.yandex.metrica.impl.ob.C2706dg.a a(com.yandex.metrica.impl.ob.P3.a r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.dg$a r0 = new com.yandex.metrica.impl.ob.dg$a
            r0.<init>()
            java.util.Map r1 = r10.b()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L52
            com.yandex.metrica.impl.ob.dg$b r4 = new com.yandex.metrica.impl.ob.dg$b
            r4.<init>()
            int r5 = r1.size()
            com.yandex.metrica.impl.ob.dg$b$a[] r6 = new com.yandex.metrica.impl.ob.C2706dg.b.a[r5]
            r7 = r2
        L19:
            if (r7 >= r5) goto L25
            com.yandex.metrica.impl.ob.dg$b$a r8 = new com.yandex.metrica.impl.ob.dg$b$a
            r8.<init>()
            r6[r7] = r8
            int r7 = r7 + 1
            goto L19
        L25:
            r4.b = r6
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r5 = r2
        L30:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            com.yandex.metrica.impl.ob.dg$b$a[] r8 = r4.b
            r8 = r8[r5]
            r8.b = r7
            r8.c = r6
            int r5 = r5 + r3
            goto L30
        L52:
            r4 = 0
        L53:
            r0.b = r4
            com.yandex.metrica.impl.ob.E0 r10 = r10.a()
            int r10 = r10.ordinal()
            if (r10 == r3) goto L68
            r1 = 2
            if (r10 == r1) goto L66
            r1 = 3
            if (r10 == r1) goto L66
            goto L69
        L66:
            r2 = r1
            goto L69
        L68:
            r2 = r3
        L69:
            r0.c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2700da.a(com.yandex.metrica.impl.ob.P3$a):com.yandex.metrica.impl.ob.dg$a");
    }

    private final P3.a a(C2706dg.a aVar) {
        E0 e0;
        C2706dg.b bVar = aVar.b;
        Map<String, String> mapA = bVar != null ? a(bVar) : null;
        int i = aVar.c;
        if (i == 0) {
            e0 = E0.UNDEFINED;
        } else if (i == 1) {
            e0 = E0.APP;
        } else if (i == 2) {
            e0 = E0.SATELLITE;
        } else if (i != 3) {
            e0 = E0.UNDEFINED;
        } else {
            e0 = E0.RETAIL;
        }
        return new P3.a(mapA, e0);
    }

    private final Map<String, String> a(C2706dg.b bVar) {
        C2706dg.b.a[] aVarArr = bVar.b;
        O90.e(aVarArr, "proto.pairs");
        int iB = AbstractC7287tn0.b(aVarArr.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (C2706dg.b.a aVar : aVarArr) {
            linkedHashMap.put(aVar.b, aVar.c);
        }
        return linkedHashMap;
    }
}
