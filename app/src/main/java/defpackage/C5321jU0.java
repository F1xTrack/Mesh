package defpackage;

import java.util.ArrayList;

/* renamed from: jU0 */
/* loaded from: classes.dex */
public final class C5321jU0 {
    public AbstractC6716qn1 a;
    public ArrayList b;

    public static long a(XH xh, long j) {
        AbstractC6716qn1 abstractC6716qn1 = xh.d;
        if (abstractC6716qn1 instanceof W20) {
            return j;
        }
        ArrayList arrayList = xh.k;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            SH sh = (SH) arrayList.get(i);
            if (sh instanceof XH) {
                XH xh2 = (XH) sh;
                if (xh2.d != abstractC6716qn1) {
                    jMin = Math.min(jMin, a(xh2, xh2.f + j));
                }
            }
        }
        if (xh != abstractC6716qn1.i) {
            return jMin;
        }
        long j2 = abstractC6716qn1.j();
        long j3 = j - j2;
        return Math.min(Math.min(jMin, a(abstractC6716qn1.h, j3)), j3 - r9.f);
    }

    public static long b(XH xh, long j) {
        AbstractC6716qn1 abstractC6716qn1 = xh.d;
        if (abstractC6716qn1 instanceof W20) {
            return j;
        }
        ArrayList arrayList = xh.k;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            SH sh = (SH) arrayList.get(i);
            if (sh instanceof XH) {
                XH xh2 = (XH) sh;
                if (xh2.d != abstractC6716qn1) {
                    jMax = Math.max(jMax, b(xh2, xh2.f + j));
                }
            }
        }
        if (xh != abstractC6716qn1.h) {
            return jMax;
        }
        long j2 = abstractC6716qn1.j();
        long j3 = j + j2;
        return Math.max(Math.max(jMax, b(abstractC6716qn1.i, j3)), j3 - r9.f);
    }
}
