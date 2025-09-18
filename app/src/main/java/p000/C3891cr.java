package p000;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: cr */
/* loaded from: classes2.dex */
public final class C3891cr implements InterfaceC10059kq0 {

    /* renamed from: b */
    public final String f25678b;

    /* renamed from: c */
    public final InterfaceC10059kq0[] f25679c;

    public C3891cr(String str, InterfaceC10059kq0[] interfaceC10059kq0Arr) {
        this.f25678b = str;
        this.f25679c = interfaceC10059kq0Arr;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: a */
    public final Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        InterfaceC10059kq0[] interfaceC10059kq0Arr = this.f25679c;
        int length = interfaceC10059kq0Arr.length;
        if (length == 0) {
            return C0779MN.f7117a;
        }
        if (length == 1) {
            return interfaceC10059kq0Arr[0].mo1769a(c8340Tt0, interfaceC7700Hl0);
        }
        Collection collectionM24337b = null;
        for (InterfaceC10059kq0 interfaceC10059kq0 : interfaceC10059kq0Arr) {
            collectionM24337b = AbstractC10906rR1.m24337b(collectionM24337b, interfaceC10059kq0.mo1769a(c8340Tt0, interfaceC7700Hl0));
        }
        return collectionM24337b == null ? C1156SN.f10705a : collectionM24337b;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: b */
    public final Set mo6677b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10059kq0 interfaceC10059kq0 : this.f25679c) {
            AbstractC0246Du.m1920m(linkedHashSet, interfaceC10059kq0.mo6677b());
        }
        return linkedHashSet;
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        InterfaceC0873Ns interfaceC0873Ns = null;
        for (InterfaceC10059kq0 interfaceC10059kq0 : this.f25679c) {
            InterfaceC0873Ns interfaceC0873NsMo1770c = interfaceC10059kq0.mo1770c(c8340Tt0, interfaceC7700Hl0);
            if (interfaceC0873NsMo1770c != null) {
                if (!(interfaceC0873NsMo1770c instanceof InterfaceC0936Os) || !((InterfaceC0936Os) interfaceC0873NsMo1770c).mo111M()) {
                    return interfaceC0873NsMo1770c;
                }
                if (interfaceC0873Ns == null) {
                    interfaceC0873Ns = interfaceC0873NsMo1770c;
                }
            }
        }
        return interfaceC0873Ns;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: d */
    public final Set mo4153d() {
        InterfaceC10059kq0[] interfaceC10059kq0Arr = this.f25679c;
        O90.m5968f(interfaceC10059kq0Arr, "<this>");
        return AbstractC11765yA1.m26060a(interfaceC10059kq0Arr.length == 0 ? C0779MN.f7117a : new C0702L8(0, interfaceC10059kq0Arr));
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: e */
    public final Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        InterfaceC10059kq0[] interfaceC10059kq0Arr = this.f25679c;
        int length = interfaceC10059kq0Arr.length;
        if (length == 0) {
            return C0779MN.f7117a;
        }
        if (length == 1) {
            return interfaceC10059kq0Arr[0].mo1771e(c8340Tt0, enumC11985zv0);
        }
        Collection collectionM24337b = null;
        for (InterfaceC10059kq0 interfaceC10059kq0 : interfaceC10059kq0Arr) {
            collectionM24337b = AbstractC10906rR1.m24337b(collectionM24337b, interfaceC10059kq0.mo1771e(c8340Tt0, enumC11985zv0));
        }
        return collectionM24337b == null ? C1156SN.f10705a : collectionM24337b;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: f */
    public final Set mo6678f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10059kq0 interfaceC10059kq0 : this.f25679c) {
            AbstractC0246Du.m1920m(linkedHashSet, interfaceC10059kq0.mo6678f());
        }
        return linkedHashSet;
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        InterfaceC10059kq0[] interfaceC10059kq0Arr = this.f25679c;
        int length = interfaceC10059kq0Arr.length;
        if (length == 0) {
            return C0779MN.f7117a;
        }
        if (length == 1) {
            return interfaceC10059kq0Arr[0].mo2108g(c4233iI, interfaceC6497nZ);
        }
        Collection collectionM24337b = null;
        for (InterfaceC10059kq0 interfaceC10059kq0 : interfaceC10059kq0Arr) {
            collectionM24337b = AbstractC10906rR1.m24337b(collectionM24337b, interfaceC10059kq0.mo2108g(c4233iI, interfaceC6497nZ));
        }
        return collectionM24337b == null ? C1156SN.f10705a : collectionM24337b;
    }

    public final String toString() {
        return this.f25678b;
    }
}
