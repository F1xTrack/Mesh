package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.M;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.ta, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3098ta implements InterfaceC2725ea {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r6
  0x0035: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:8:0x0030, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.ob.C2880kg.k.b b(com.yandex.metrica.impl.ob.C2828id r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.kg$k$b r0 = new com.yandex.metrica.impl.ob.kg$k$b
            r0.<init>()
            java.util.List<com.yandex.metrica.impl.ob.M$b$a> r1 = r10.a
            int r1 = r1.size()
            int[] r1 = new int[r1]
            r0.b = r1
            java.util.List<com.yandex.metrica.impl.ob.M$b$a> r1 = r10.a
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
            com.yandex.metrica.impl.ob.M$b$a r4 = (com.yandex.metrica.impl.ob.M.b.a) r4
            int[] r8 = r0.b
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
            java.util.List<com.yandex.metrica.impl.ob.E$a> r1 = r10.b
            int r1 = r1.size()
            int[] r1 = new int[r1]
            r0.c = r1
            java.util.List<com.yandex.metrica.impl.ob.E$a> r10 = r10.b
            java.util.Iterator r10 = r10.iterator()
            r1 = r2
        L4f:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r10.next()
            com.yandex.metrica.impl.ob.E$a r3 = (com.yandex.metrica.impl.ob.E.a) r3
            int[] r4 = r0.c
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C3098ta.b(com.yandex.metrica.impl.ob.id):com.yandex.metrica.impl.ob.kg$k$b");
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2828id a(C2880kg.k.b bVar) {
        M.b.a aVar;
        E.a aVar2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (bVar.b.length != 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = bVar.b;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = iArr[i2];
                if (i3 == 0) {
                    aVar = M.b.a.NONE;
                } else if (i3 == 1) {
                    aVar = M.b.a.USB;
                } else if (i3 == 2) {
                    aVar = M.b.a.WIRELESS;
                } else if (i3 != 3) {
                    aVar = M.b.a.UNKNOWN;
                } else {
                    aVar = M.b.a.AC;
                }
                arrayList.add(aVar);
                i2++;
            }
        } else {
            arrayList.addAll(Arrays.asList(M.b.a.values()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (bVar.c.length != 0) {
            while (true) {
                int[] iArr2 = bVar.c;
                if (i >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i];
                if (i4 == 0) {
                    aVar2 = E.a.BACKGROUND;
                } else if (i4 != 2) {
                    aVar2 = E.a.UNKNOWN;
                } else {
                    aVar2 = E.a.VISIBLE;
                }
                arrayList2.add(aVar2);
                i++;
            }
        } else {
            arrayList2.addAll(Arrays.asList(E.a.values()));
        }
        return new C2828id(arrayList, arrayList2);
    }
}
