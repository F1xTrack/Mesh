package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2566E;
import com.yandex.metrica.impl.p022ob.C2766M;
import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.ta */
/* loaded from: classes2.dex */
public class C3620ta implements InterfaceC3230ea {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r6
  0x0035: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:8:0x0030, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p022ob.C3392kg.k.b mo13847b(com.yandex.metrica.impl.p022ob.C3337id r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.kg$k$b r0 = new com.yandex.metrica.impl.ob.kg$k$b
            r0.<init>()
            java.util.List<com.yandex.metrica.impl.ob.M$b$a> r1 = r10.f23645a
            int r1 = r1.size()
            int[] r1 = new int[r1]
            r0.f24055b = r1
            java.util.List<com.yandex.metrica.impl.ob.M$b$a> r1 = r10.f23645a
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        L17:
            boolean r4 = r1.hasNext()
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3e
            java.lang.Object r4 = r1.next()
            com.yandex.metrica.impl.ob.M$b$a r4 = (com.yandex.metrica.impl.p022ob.C2766M.b.a) r4
            int[] r8 = r0.f24055b
            int r4 = r4.ordinal()
            if (r4 == r7) goto L39
            if (r4 == r6) goto L37
            if (r4 == r5) goto L35
            r6 = 4
            if (r4 == r6) goto L3a
        L35:
            r5 = r6
            goto L3a
        L37:
            r5 = r7
            goto L3a
        L39:
            r5 = r2
        L3a:
            r8[r3] = r5
            int r3 = r3 + r7
            goto L17
        L3e:
            java.util.List<com.yandex.metrica.impl.ob.E$a> r1 = r10.f23646b
            int r1 = r1.size()
            int[] r1 = new int[r1]
            r0.f24056c = r1
            java.util.List<com.yandex.metrica.impl.ob.E$a> r10 = r10.f23646b
            java.util.Iterator r10 = r10.iterator()
            r1 = r2
        L4f:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r10.next()
            com.yandex.metrica.impl.ob.E$a r3 = (com.yandex.metrica.impl.p022ob.C2566E.a) r3
            int[] r4 = r0.f24056c
            int r3 = r3.ordinal()
            if (r3 == r7) goto L69
            if (r3 == r6) goto L67
            r3 = r5
            goto L6a
        L67:
            r3 = r6
            goto L6a
        L69:
            r3 = r2
        L6a:
            r4[r1] = r3
            int r1 = r1 + r7
            goto L4f
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3620ta.mo13847b(com.yandex.metrica.impl.ob.id):com.yandex.metrica.impl.ob.kg$k$b");
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3337id mo13846a(C3392kg.k.b bVar) {
        C2766M.b.a aVar;
        C2566E.a aVar2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (bVar.f24055b.length != 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = bVar.f24055b;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = iArr[i2];
                if (i3 == 0) {
                    aVar = C2766M.b.a.NONE;
                } else if (i3 == 1) {
                    aVar = C2766M.b.a.USB;
                } else if (i3 == 2) {
                    aVar = C2766M.b.a.WIRELESS;
                } else if (i3 != 3) {
                    aVar = C2766M.b.a.UNKNOWN;
                } else {
                    aVar = C2766M.b.a.AC;
                }
                arrayList.add(aVar);
                i2++;
            }
        } else {
            arrayList.addAll(Arrays.asList(C2766M.b.a.values()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (bVar.f24056c.length != 0) {
            while (true) {
                int[] iArr2 = bVar.f24056c;
                if (i >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i];
                if (i4 == 0) {
                    aVar2 = C2566E.a.BACKGROUND;
                } else if (i4 != 2) {
                    aVar2 = C2566E.a.UNKNOWN;
                } else {
                    aVar2 = C2566E.a.VISIBLE;
                }
                arrayList2.add(aVar2);
                i++;
            }
        } else {
            arrayList2.addAll(Arrays.asList(C2566E.a.values()));
        }
        return new C3337id(arrayList, arrayList2);
    }
}
