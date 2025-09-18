package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class OI extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ PI f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OI(PI pi, int i) {
        super(1);
        this.e = i;
        this.f = pi;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        AF0 af0H;
        AF0 af0H2;
        switch (this.e) {
            case 0:
                C1559Tt0 c1559Tt0 = (C1559Tt0) obj;
                O90.f(c1559Tt0, "it");
                PI pi = this.f;
                LinkedHashMap linkedHashMap = pi.a;
                C8019xd0 c8019xd0 = C4309iF0.v;
                O90.e(c8019xd0, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(c1559Tt0);
                RI ri = pi.i;
                Collection<C4309iF0> collectionN = bArr != null ? AbstractC4175hY0.n(AbstractC4175hY0.j(new C1939Yq(c8019xd0, new ByteArrayInputStream(bArr), ri, 1))) : MN.a;
                ArrayList arrayList = new ArrayList(collectionN.size());
                for (C4309iF0 c4309iF0 : collectionN) {
                    C4038gq0 c4038gq0 = (C4038gq0) ri.b.i;
                    O90.c(c4309iF0);
                    UI uiE = c4038gq0.e(c4309iF0);
                    if (!ri.r(uiE)) {
                        uiE = null;
                    }
                    if (uiE != null) {
                        arrayList.add(uiE);
                    }
                }
                ri.j(c1559Tt0, arrayList);
                return AbstractC3970gT1.b(arrayList);
            case 1:
                C1559Tt0 c1559Tt02 = (C1559Tt0) obj;
                O90.f(c1559Tt02, "it");
                PI pi2 = this.f;
                LinkedHashMap linkedHashMap2 = pi2.b;
                C8019xd0 c8019xd02 = C6613qF0.v;
                O90.e(c8019xd02, "PARSER");
                byte[] bArr2 = (byte[]) linkedHashMap2.get(c1559Tt02);
                RI ri2 = pi2.i;
                Collection<C6613qF0> collectionN2 = bArr2 != null ? AbstractC4175hY0.n(AbstractC4175hY0.j(new C1939Yq(c8019xd02, new ByteArrayInputStream(bArr2), ri2, 1))) : MN.a;
                ArrayList arrayList2 = new ArrayList(collectionN2.size());
                for (C6613qF0 c6613qF0 : collectionN2) {
                    C4038gq0 c4038gq02 = (C4038gq0) ri2.b.i;
                    O90.c(c6613qF0);
                    arrayList2.add(c4038gq02.f(c6613qF0));
                }
                ri2.k(c1559Tt02, arrayList2);
                return AbstractC3970gT1.b(arrayList2);
            default:
                C1559Tt0 c1559Tt03 = (C1559Tt0) obj;
                O90.f(c1559Tt03, "it");
                PI pi3 = this.f;
                byte[] bArr3 = (byte[]) pi3.c.get(c1559Tt03);
                VI vi = null;
                if (bArr3 != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr3);
                    RI ri3 = pi3.i;
                    CF0 cf0 = (CF0) CF0.p.b(byteArrayInputStream, ((C7955xI) ri3.b.c).p);
                    if (cf0 != null) {
                        C4038gq0 c4038gq03 = (C4038gq0) ri3.b.i;
                        c4038gq03.getClass();
                        List list = cf0.k;
                        O90.e(list, "getAnnotationList(...)");
                        List list2 = list;
                        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(list2));
                        Iterator it = list2.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            C1666Vd c1666Vd = c4038gq03.a;
                            if (zHasNext) {
                                QE0 qe0 = (QE0) it.next();
                                O90.c(qe0);
                                arrayList3.add(c4038gq03.b.s(qe0, (InterfaceC1637Ut0) c1666Vd.d));
                            } else {
                                I5 k5 = arrayList3.isEmpty() ? S20.b : new K5(arrayList3, 0);
                                vi = new VI(((C7955xI) c1666Vd.c).a, (CD) c1666Vd.e, k5, CB1.b((InterfaceC1637Ut0) c1666Vd.d, cf0.e), YM1.a((OF0) ZV.d.c(cf0.d)), cf0, (InterfaceC1637Ut0) c1666Vd.d, (C5826m71) c1666Vd.b, (C0124Bi1) c1666Vd.f, (C6494pd0) c1666Vd.a);
                                List list3 = cf0.f;
                                O90.e(list3, "getTypeParameterList(...)");
                                C1902Yd1 c1902Yd1 = (C1902Yd1) c1666Vd.b(vi, list3, (InterfaceC1637Ut0) c1666Vd.d, (C5826m71) c1666Vd.b, (C0124Bi1) c1666Vd.f, (AbstractC7268th) c1666Vd.g).h;
                                List listB = c1902Yd1.b();
                                C5826m71 c5826m71 = (C5826m71) c1666Vd.b;
                                O90.f(c5826m71, "typeTable");
                                int i = cf0.c;
                                if ((i & 4) == 4) {
                                    af0H = cf0.g;
                                    O90.e(af0H, "getUnderlyingType(...)");
                                } else {
                                    if ((i & 8) != 8) {
                                        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                                    }
                                    af0H = c5826m71.h(cf0.h);
                                }
                                X01 x01D = c1902Yd1.d(af0H, false);
                                int i2 = cf0.c;
                                if ((i2 & 16) == 16) {
                                    af0H2 = cf0.i;
                                    O90.e(af0H2, "getExpandedType(...)");
                                } else {
                                    if ((i2 & 32) != 32) {
                                        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                                    }
                                    af0H2 = c5826m71.h(cf0.j);
                                }
                                vi.B1(listB, x01D, c1902Yd1.d(af0H2, false));
                            }
                        }
                    }
                }
                return vi;
        }
    }
}
