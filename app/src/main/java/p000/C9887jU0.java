package p000;

import java.util.ArrayList;

/* renamed from: jU0 */
/* loaded from: classes.dex */
public final class C9887jU0 {

    /* renamed from: a */
    public AbstractC10822qn1 f35159a;

    /* renamed from: b */
    public ArrayList f35160b;

    /* renamed from: a */
    public static long m22051a(C1465XH c1465xh, long j) {
        AbstractC10822qn1 abstractC10822qn1 = c1465xh.f13654d;
        if (abstractC10822qn1 instanceof W20) {
            return j;
        }
        ArrayList arrayList = c1465xh.f13661k;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1150SH interfaceC1150SH = (InterfaceC1150SH) arrayList.get(i);
            if (interfaceC1150SH instanceof C1465XH) {
                C1465XH c1465xh2 = (C1465XH) interfaceC1150SH;
                if (c1465xh2.f13654d != abstractC10822qn1) {
                    jMin = Math.min(jMin, m22051a(c1465xh2, c1465xh2.f13656f + j));
                }
            }
        }
        if (c1465xh != abstractC10822qn1.f41164i) {
            return jMin;
        }
        long jMo10527j = abstractC10822qn1.mo10527j();
        long j2 = j - jMo10527j;
        return Math.min(Math.min(jMin, m22051a(abstractC10822qn1.f41163h, j2)), j2 - r9.f13656f);
    }

    /* renamed from: b */
    public static long m22052b(C1465XH c1465xh, long j) {
        AbstractC10822qn1 abstractC10822qn1 = c1465xh.f13654d;
        if (abstractC10822qn1 instanceof W20) {
            return j;
        }
        ArrayList arrayList = c1465xh.f13661k;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1150SH interfaceC1150SH = (InterfaceC1150SH) arrayList.get(i);
            if (interfaceC1150SH instanceof C1465XH) {
                C1465XH c1465xh2 = (C1465XH) interfaceC1150SH;
                if (c1465xh2.f13654d != abstractC10822qn1) {
                    jMax = Math.max(jMax, m22052b(c1465xh2, c1465xh2.f13656f + j));
                }
            }
        }
        if (c1465xh != abstractC10822qn1.f41163h) {
            return jMax;
        }
        long jMo10527j = abstractC10822qn1.mo10527j();
        long j2 = j + jMo10527j;
        return Math.max(Math.max(jMax, m22052b(abstractC10822qn1.f41164i, j2)), j2 - r9.f13656f);
    }
}
