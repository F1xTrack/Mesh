package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class MZ {
    public static final MZ c = new MZ(AbstractC8259yu.f(GZ.c, JZ.c, HZ.c, IZ.c));
    public final List a;
    public final LinkedHashMap b;

    public MZ(List list) {
        this.a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            KX kx = ((KZ) obj).a;
            Object arrayList = linkedHashMap.get(kx);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kx, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.b = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.LZ a(defpackage.KX r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "packageFqName"
            defpackage.O90.f(r9, r0)
            java.util.LinkedHashMap r0 = r8.b
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
            KZ r1 = (defpackage.KZ) r1
            java.lang.String r2 = r1.b
            r3 = 0
            boolean r2 = defpackage.D51.o(r10, r2, r3)
            if (r2 == 0) goto L15
            java.lang.String r2 = r1.b
            int r2 = r2.length()
            java.lang.String r2 = r10.substring(r2)
            java.lang.String r4 = "substring(...)"
            defpackage.O90.e(r2, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MZ.a(KX, java.lang.String):LZ");
    }
}
