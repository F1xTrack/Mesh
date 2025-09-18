package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2845P3;
import com.yandex.metrica.impl.p022ob.C3210dg;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC11205tn0;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.da */
/* loaded from: classes2.dex */
public final class C3204da implements InterfaceC3230ea<C2845P3, C3210dg> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C2845P3 mo13846a(C3210dg c3210dg) {
        C3210dg c3210dg2 = c3210dg;
        C3210dg.a aVar = c3210dg2.f23249b;
        if (aVar == null) {
            aVar = new C3210dg.a();
        }
        C2845P3.a aVarM15744a = m15744a(aVar);
        C3210dg.a[] aVarArr = c3210dg2.f23250c;
        O90.m5967e(aVarArr, "nano.candidates");
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C3210dg.a aVar2 : aVarArr) {
            O90.m5967e(aVar2, "it");
            arrayList.add(m15744a(aVar2));
        }
        return new C2845P3(aVarM15744a, arrayList);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public C3210dg mo13847b(C2845P3 c2845p3) {
        C2845P3 c2845p32 = c2845p3;
        C3210dg c3210dg = new C3210dg();
        c3210dg.f23249b = m15745a(c2845p32.m14760c());
        int size = c2845p32.mo13931a().size();
        C3210dg.a[] aVarArr = new C3210dg.a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = m15745a(c2845p32.mo13931a().get(i));
        }
        c3210dg.f23250c = aVarArr;
        return c3210dg;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[PHI: r1
  0x0066: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:15:0x0060, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.yandex.metrica.impl.p022ob.C3210dg.a m15745a(com.yandex.metrica.impl.p022ob.C2845P3.a r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.dg$a r0 = new com.yandex.metrica.impl.ob.dg$a
            r0.<init>()
            java.util.Map r1 = r10.m14761b()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L52
            com.yandex.metrica.impl.ob.dg$b r4 = new com.yandex.metrica.impl.ob.dg$b
            r4.<init>()
            int r5 = r1.size()
            com.yandex.metrica.impl.ob.dg$b$a[] r6 = new com.yandex.metrica.impl.p022ob.C3210dg.b.a[r5]
            r7 = r2
        L19:
            if (r7 >= r5) goto L25
            com.yandex.metrica.impl.ob.dg$b$a r8 = new com.yandex.metrica.impl.ob.dg$b$a
            r8.<init>()
            r6[r7] = r8
            int r7 = r7 + 1
            goto L19
        L25:
            r4.f23254b = r6
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
            com.yandex.metrica.impl.ob.dg$b$a[] r8 = r4.f23254b
            r8 = r8[r5]
            r8.f23256b = r7
            r8.f23257c = r6
            int r5 = r5 + r3
            goto L30
        L52:
            r4 = 0
        L53:
            r0.f23252b = r4
            com.yandex.metrica.impl.ob.E0 r10 = r10.mo14053a()
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
            r0.f23253c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3204da.m15745a(com.yandex.metrica.impl.ob.P3$a):com.yandex.metrica.impl.ob.dg$a");
    }

    /* renamed from: a */
    private final C2845P3.a m15744a(C3210dg.a aVar) {
        EnumC2567E0 enumC2567E0;
        C3210dg.b bVar = aVar.f23252b;
        Map<String, String> mapM15746a = bVar != null ? m15746a(bVar) : null;
        int i = aVar.f23253c;
        if (i == 0) {
            enumC2567E0 = EnumC2567E0.UNDEFINED;
        } else if (i == 1) {
            enumC2567E0 = EnumC2567E0.APP;
        } else if (i == 2) {
            enumC2567E0 = EnumC2567E0.SATELLITE;
        } else if (i != 3) {
            enumC2567E0 = EnumC2567E0.UNDEFINED;
        } else {
            enumC2567E0 = EnumC2567E0.RETAIL;
        }
        return new C2845P3.a(mapM15746a, enumC2567E0);
    }

    /* renamed from: a */
    private final Map<String, String> m15746a(C3210dg.b bVar) {
        C3210dg.b.a[] aVarArr = bVar.f23254b;
        O90.m5967e(aVarArr, "proto.pairs");
        int iM24983b = AbstractC11205tn0.m24983b(aVarArr.length);
        if (iM24983b < 16) {
            iM24983b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
        for (C3210dg.b.a aVar : aVarArr) {
            linkedHashMap.put(aVar.f23256b, aVar.f23257c);
        }
        return linkedHashMap;
    }
}
