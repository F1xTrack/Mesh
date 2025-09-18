package p000;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: lq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10187lq0 implements InterfaceC10059kq0 {
    @Override // p000.InterfaceC10059kq0
    /* renamed from: a */
    public Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: b */
    public Set mo6677b() {
        Collection collectionMo2108g = mo2108g(C4233iI.f29061p, C6228jI.f35048z);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo2108g) {
            if (obj instanceof U01) {
                C8340Tt0 name = ((U01) obj).getName();
                O90.m5967e(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: c */
    public InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        return null;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: d */
    public Set mo4153d() {
        return null;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: e */
    public Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: f */
    public Set mo6678f() {
        Collection collectionMo2108g = mo2108g(C4233iI.f29062q, C6228jI.f35048z);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo2108g) {
            if (obj instanceof U01) {
                C8340Tt0 name = ((U01) obj).getName();
                O90.m5967e(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: g */
    public Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        return C0779MN.f7117a;
    }
}
