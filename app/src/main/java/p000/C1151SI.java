package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: SI */
/* loaded from: classes2.dex */
public final class C1151SI extends AbstractC1088RI {

    /* renamed from: g */
    public final AbstractC7364Az0 f10675g;

    /* renamed from: h */
    public final String f10676h;

    /* renamed from: i */
    public final C0664KX f10677i;

    public C1151SI(AbstractC7364Az0 abstractC7364Az0, C10241mF0 c10241mF0, InterfaceC8392Ut0 interfaceC8392Ut0, AbstractC6902th abstractC6902th, C10673pd0 c10673pd0, C7129xI c7129xI, String str, InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(abstractC7364Az0, "packageDescriptor");
        O90.m5968f(c10241mF0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(abstractC6902th, "metadataVersion");
        O90.m5968f(c7129xI, "components");
        O90.m5968f(str, "debugName");
        GF0 gf0 = c10241mF0.f37596g;
        O90.m5967e(gf0, "getTypeTable(...)");
        C10226m71 c10226m71 = new C10226m71(gf0);
        C7383Bi1 c7383Bi1 = C7383Bi1.f979b;
        NF0 nf0 = c10241mF0.f37597h;
        O90.m5967e(nf0, "getVersionRequirementTable(...)");
        C1361Vd c1361VdM25825a = c7129xI.m25825a(abstractC7364Az0, interfaceC8392Ut0, c10226m71, AbstractC11616x02.m25733a(nf0), abstractC6902th, c10673pd0);
        List list = c10241mF0.f37593d;
        O90.m5967e(list, "getFunctionList(...)");
        List list2 = c10241mF0.f37594e;
        O90.m5967e(list2, "getPropertyList(...)");
        List list3 = c10241mF0.f37595f;
        O90.m5967e(list3, "getTypeAliasList(...)");
        super(c1361VdM25825a, list, list2, list3, interfaceC6434mZ);
        this.f10675g = abstractC7364Az0;
        this.f10676h = str;
        this.f10677i = abstractC7364Az0.f494f;
    }

    @Override // p000.AbstractC1088RI, p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        AbstractC11233u02.m25070b(((C7129xI) this.f10113b.f12662c).f45526i, interfaceC7700Hl0, this.f10675g, c8340Tt0);
        return super.mo1770c(c8340Tt0, interfaceC7700Hl0);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        EnumC11985zv0 enumC11985zv0 = EnumC11985zv0.f47094a;
        Collection collectionM6931i = m6931i(c4233iI, interfaceC6497nZ);
        Iterable iterable = ((C7129xI) this.f10113b.f12662c).f45528k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC0246Du.m1920m(arrayList, ((InterfaceC7102ws) it.next()).mo6738b(this.f10677i));
        }
        return AbstractC7167xu.m25968N(collectionM6931i, arrayList);
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: h */
    public final void mo2109h(ArrayList arrayList, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(interfaceC6497nZ, "nameFilter");
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: l */
    public final C0055As mo2112l(C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "name");
        return new C0055As(this.f10677i, c8340Tt0);
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: n */
    public final Set mo2113n() {
        return C1156SN.f10705a;
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: o */
    public final Set mo2114o() {
        return C1156SN.f10705a;
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: p */
    public final Set mo2115p() {
        return C1156SN.f10705a;
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: q */
    public final boolean mo6933q(C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "name");
        if (!super.mo6933q(c8340Tt0)) {
            Iterable iterable = ((C7129xI) this.f10113b.f12662c).f45528k;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC7102ws) it.next()).mo6739c(this.f10677i, c8340Tt0)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f10676h;
    }
}
