package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: v80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11379v80 extends AbstractC10187lq0 {

    /* renamed from: b */
    public final InterfaceC10059kq0 f44208b;

    public C11379v80(InterfaceC10059kq0 interfaceC10059kq0) {
        O90.m5968f(interfaceC10059kq0, "workerScope");
        this.f44208b = interfaceC10059kq0;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: b */
    public final Set mo6677b() {
        return this.f44208b.mo6677b();
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        InterfaceC0873Ns interfaceC0873NsMo1770c = this.f44208b.mo1770c(c8340Tt0, interfaceC7700Hl0);
        if (interfaceC0873NsMo1770c == null) {
            return null;
        }
        InterfaceC6976us interfaceC6976us = interfaceC0873NsMo1770c instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo1770c : null;
        if (interfaceC6976us != null) {
            return interfaceC6976us;
        }
        if (interfaceC0873NsMo1770c instanceof InterfaceC7633Gd1) {
            return (InterfaceC7633Gd1) interfaceC0873NsMo1770c;
        }
        return null;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: d */
    public final Set mo4153d() {
        return this.f44208b.mo4153d();
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: f */
    public final Set mo6678f() {
        return this.f44208b.mo6678f();
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        Collection collection;
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        int i = C4233iI.f29057l & c4233iI.f29066b;
        C4233iI c4233iI2 = i == 0 ? null : new C4233iI(i, c4233iI.f29065a);
        if (c4233iI2 == null) {
            collection = C0779MN.f7117a;
        } else {
            Collection collectionMo2108g = this.f44208b.mo2108g(c4233iI2, interfaceC6497nZ);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionMo2108g) {
                if (obj instanceof InterfaceC0936Os) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    public final String toString() {
        return "Classes from " + this.f44208b;
    }
}
