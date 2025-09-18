package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class SI extends RI {
    public final AbstractC0096Az0 g;
    public final String h;
    public final KX i;

    public SI(AbstractC0096Az0 abstractC0096Az0, C5849mF0 c5849mF0, InterfaceC1637Ut0 interfaceC1637Ut0, AbstractC7268th abstractC7268th, C6494pd0 c6494pd0, C7955xI c7955xI, String str, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(abstractC0096Az0, "packageDescriptor");
        O90.f(c5849mF0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(abstractC7268th, "metadataVersion");
        O90.f(c7955xI, "components");
        O90.f(str, "debugName");
        GF0 gf0 = c5849mF0.g;
        O90.e(gf0, "getTypeTable(...)");
        C5826m71 c5826m71 = new C5826m71(gf0);
        C0124Bi1 c0124Bi1 = C0124Bi1.b;
        NF0 nf0 = c5849mF0.h;
        O90.e(nf0, "getVersionRequirementTable(...)");
        C1666Vd c1666VdA = c7955xI.a(abstractC0096Az0, interfaceC1637Ut0, c5826m71, AbstractC7901x02.a(nf0), abstractC7268th, c6494pd0);
        List list = c5849mF0.d;
        O90.e(list, "getFunctionList(...)");
        List list2 = c5849mF0.e;
        O90.e(list2, "getPropertyList(...)");
        List list3 = c5849mF0.f;
        O90.e(list3, "getTypeAliasList(...)");
        super(c1666VdA, list, list2, list3, interfaceC5908mZ);
        this.g = abstractC0096Az0;
        this.h = str;
        this.i = abstractC0096Az0.f;
    }

    @Override // defpackage.RI, defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        AbstractC7329u02.b(((C7955xI) this.b.c).i, interfaceC0600Hl0, this.g, c1559Tt0);
        return super.c(c1559Tt0, interfaceC0600Hl0);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        EnumC8453zv0 enumC8453zv0 = EnumC8453zv0.a;
        Collection collectionI = i(c4317iI, interfaceC6099nZ);
        Iterable iterable = ((C7955xI) this.b.c).k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC0314Du.m(arrayList, ((InterfaceC7873ws) it.next()).b(this.i));
        }
        return AbstractC8069xu.N(collectionI, arrayList);
    }

    @Override // defpackage.RI
    public final void h(ArrayList arrayList, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(interfaceC6099nZ, "nameFilter");
    }

    @Override // defpackage.RI
    public final C0074As l(C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "name");
        return new C0074As(this.i, c1559Tt0);
    }

    @Override // defpackage.RI
    public final Set n() {
        return SN.a;
    }

    @Override // defpackage.RI
    public final Set o() {
        return SN.a;
    }

    @Override // defpackage.RI
    public final Set p() {
        return SN.a;
    }

    @Override // defpackage.RI
    public final boolean q(C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "name");
        if (!super.q(c1559Tt0)) {
            Iterable iterable = ((C7955xI) this.b.c).k;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC7873ws) it.next()).c(this.i, c1559Tt0)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.h;
    }
}
