package p000;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: OI */
/* loaded from: classes2.dex */
public final class C0900OI extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f8344e;

    /* renamed from: f */
    public final /* synthetic */ C0963PI f8345f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0900OI(C0963PI c0963pi, int i) {
        super(1);
        this.f8344e = i;
        this.f8345f = c0963pi;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        AF0 af0M22681h;
        AF0 af0M22681h2;
        switch (this.f8344e) {
            case 0:
                C8340Tt0 c8340Tt0 = (C8340Tt0) obj;
                O90.m5968f(c8340Tt0, "it");
                C0963PI c0963pi = this.f8345f;
                LinkedHashMap linkedHashMap = c0963pi.f8983a;
                C11695xd0 c11695xd0 = C9729iF0.f28980v;
                O90.m5967e(c11695xd0, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(c8340Tt0);
                AbstractC1088RI abstractC1088RI = c0963pi.f8991i;
                Collection<C9729iF0> collectionM18835n = bArr != null ? AbstractC9639hY0.m18835n(AbstractC9639hY0.m18831j(new C1563Yq(c11695xd0, new ByteArrayInputStream(bArr), abstractC1088RI, 1))) : C0779MN.f7117a;
                ArrayList arrayList = new ArrayList(collectionM18835n.size());
                for (C9729iF0 c9729iF0 : collectionM18835n) {
                    C9547gq0 c9547gq0 = (C9547gq0) abstractC1088RI.f10113b.f12668i;
                    O90.m5965c(c9729iF0);
                    C1277UI c1277uiM18666e = c9547gq0.m18666e(c9729iF0);
                    if (!abstractC1088RI.mo2116r(c1277uiM18666e)) {
                        c1277uiM18666e = null;
                    }
                    if (c1277uiM18666e != null) {
                        arrayList.add(c1277uiM18666e);
                    }
                }
                abstractC1088RI.mo2110j(c8340Tt0, arrayList);
                return AbstractC9502gT1.m18572b(arrayList);
            case 1:
                C8340Tt0 c8340Tt02 = (C8340Tt0) obj;
                O90.m5968f(c8340Tt02, "it");
                C0963PI c0963pi2 = this.f8345f;
                LinkedHashMap linkedHashMap2 = c0963pi2.f8984b;
                C11695xd0 c11695xd02 = C10753qF0.f40685v;
                O90.m5967e(c11695xd02, "PARSER");
                byte[] bArr2 = (byte[]) linkedHashMap2.get(c8340Tt02);
                AbstractC1088RI abstractC1088RI2 = c0963pi2.f8991i;
                Collection<C10753qF0> collectionM18835n2 = bArr2 != null ? AbstractC9639hY0.m18835n(AbstractC9639hY0.m18831j(new C1563Yq(c11695xd02, new ByteArrayInputStream(bArr2), abstractC1088RI2, 1))) : C0779MN.f7117a;
                ArrayList arrayList2 = new ArrayList(collectionM18835n2.size());
                for (C10753qF0 c10753qF0 : collectionM18835n2) {
                    C9547gq0 c9547gq02 = (C9547gq0) abstractC1088RI2.f10113b.f12668i;
                    O90.m5965c(c10753qF0);
                    arrayList2.add(c9547gq02.m18667f(c10753qF0));
                }
                abstractC1088RI2.mo2111k(c8340Tt02, arrayList2);
                return AbstractC9502gT1.m18572b(arrayList2);
            default:
                C8340Tt0 c8340Tt03 = (C8340Tt0) obj;
                O90.m5968f(c8340Tt03, "it");
                C0963PI c0963pi3 = this.f8345f;
                byte[] bArr3 = (byte[]) c0963pi3.f8985c.get(c8340Tt03);
                C1340VI c1340vi = null;
                if (bArr3 != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr3);
                    AbstractC1088RI abstractC1088RI3 = c0963pi3.f8991i;
                    CF0 cf0 = (CF0) CF0.f1269p.m25925b(byteArrayInputStream, ((C7129xI) abstractC1088RI3.f10113b.f12662c).f45533p);
                    if (cf0 != null) {
                        C9547gq0 c9547gq03 = (C9547gq0) abstractC1088RI3.f10113b.f12668i;
                        c9547gq03.getClass();
                        List list = cf0.f1279k;
                        O90.m5967e(list, "getAnnotationList(...)");
                        List list2 = list;
                        ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(list2));
                        Iterator it = list2.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            C1361Vd c1361Vd = c9547gq03.f28057a;
                            if (zHasNext) {
                                QE0 qe0 = (QE0) it.next();
                                O90.m5965c(qe0);
                                arrayList3.add(c9547gq03.f28058b.m17575s(qe0, (InterfaceC8392Ut0) c1361Vd.f12663d));
                            } else {
                                InterfaceC0510I5 c0636k5 = arrayList3.isEmpty() ? S20.f10539b : new C0636K5(arrayList3, 0);
                                c1340vi = new C1340VI(((C7129xI) c1361Vd.f12662c).f45518a, (InterfaceC0140CD) c1361Vd.f12664e, c0636k5, CB1.m1002b((InterfaceC8392Ut0) c1361Vd.f12663d, cf0.f1273e), YM1.m9269a((OF0) AbstractC1605ZV.f14928d.m9059c(cf0.f1272d)), cf0, (InterfaceC8392Ut0) c1361Vd.f12663d, (C10226m71) c1361Vd.f12661b, (C7383Bi1) c1361Vd.f12665f, (C10673pd0) c1361Vd.f12660a);
                                List list3 = cf0.f1274f;
                                O90.m5967e(list3, "getTypeParameterList(...)");
                                C8569Yd1 c8569Yd1 = (C8569Yd1) c1361Vd.m8517b(c1340vi, list3, (InterfaceC8392Ut0) c1361Vd.f12663d, (C10226m71) c1361Vd.f12661b, (C7383Bi1) c1361Vd.f12665f, (AbstractC6902th) c1361Vd.f12666g).f12667h;
                                List listM9329b = c8569Yd1.m9329b();
                                C10226m71 c10226m71 = (C10226m71) c1361Vd.f12661b;
                                O90.m5968f(c10226m71, "typeTable");
                                int i = cf0.f1271c;
                                if ((i & 4) == 4) {
                                    af0M22681h = cf0.f1275g;
                                    O90.m5967e(af0M22681h, "getUnderlyingType(...)");
                                } else {
                                    if ((i & 8) != 8) {
                                        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                                    }
                                    af0M22681h = c10226m71.m22681h(cf0.f1276h);
                                }
                                X01 x01M9331d = c8569Yd1.m9331d(af0M22681h, false);
                                int i2 = cf0.f1271c;
                                if ((i2 & 16) == 16) {
                                    af0M22681h2 = cf0.f1277i;
                                    O90.m5967e(af0M22681h2, "getExpandedType(...)");
                                } else {
                                    if ((i2 & 32) != 32) {
                                        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                                    }
                                    af0M22681h2 = c10226m71.m22681h(cf0.f1278j);
                                }
                                c1340vi.m8391B1(listM9329b, x01M9331d, c8569Yd1.m9331d(af0M22681h2, false));
                            }
                        }
                    }
                }
                return c1340vi;
        }
    }
}
