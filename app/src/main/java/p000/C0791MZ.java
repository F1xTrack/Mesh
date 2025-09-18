package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: MZ */
/* loaded from: classes2.dex */
public final class C0791MZ {

    /* renamed from: c */
    public static final C0791MZ f7224c = new C0791MZ(AbstractC7230yu.m26275f(C0414GZ.f3802c, C0603JZ.f5603c, C0477HZ.f4350c, C0540IZ.f4983c));

    /* renamed from: a */
    public final List f7225a;

    /* renamed from: b */
    public final LinkedHashMap f7226b;

    public C0791MZ(List list) {
        this.f7225a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C0664KX c0664kx = ((AbstractC0666KZ) obj).f6190a;
            Object arrayList = linkedHashMap.get(c0664kx);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c0664kx, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f7226b = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0015 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C0728LZ m5399a(p000.C0664KX r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "packageFqName"
            p000.O90.m5968f(r9, r0)
            java.util.LinkedHashMap r0 = r8.f7226b
            java.lang.Object r9 = r0.get(r9)
            java.util.List r9 = (java.util.List) r9
            r0 = 0
            if (r9 != 0) goto L11
            return r0
        L11:
            java.util.Iterator r9 = r9.iterator()
        L15:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r9.next()
            KZ r1 = (p000.AbstractC0666KZ) r1
            java.lang.String r2 = r1.f6191b
            r3 = 0
            boolean r2 = p000.D51.m1556o(r10, r2, r3)
            if (r2 == 0) goto L15
            java.lang.String r2 = r1.f6191b
            int r2 = r2.length()
            java.lang.String r2 = r10.substring(r2)
            java.lang.String r4 = "substring(...)"
            p000.O90.m5967e(r2, r4)
            int r4 = r2.length()
            if (r4 != 0) goto L41
        L3f:
            r2 = r0
            goto L5e
        L41:
            int r4 = r2.length()
            r5 = r3
        L46:
            if (r3 >= r4) goto L5a
            char r6 = r2.charAt(r3)
            int r6 = r6 + (-48)
            if (r6 < 0) goto L3f
            r7 = 10
            if (r6 >= r7) goto L3f
            int r5 = r5 * 10
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L46
        L5a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L5e:
            if (r2 == 0) goto L15
            int r9 = r2.intValue()
            LZ r10 = new LZ
            r10.<init>(r1, r9)
            return r10
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0791MZ.m5399a(KX, java.lang.String):LZ");
    }
}
