package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: lq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5769lq0 implements InterfaceC5578kq0 {
    @Override // defpackage.InterfaceC5578kq0
    public Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        return MN.a;
    }

    @Override // defpackage.InterfaceC5578kq0
    public Set b() {
        Collection collectionG = g(C4317iI.p, C5284jI.z);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof U01) {
                C1559Tt0 name = ((U01) obj).getName();
                O90.e(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC3584eS0
    public InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        return null;
    }

    @Override // defpackage.InterfaceC5578kq0
    public Set d() {
        return null;
    }

    @Override // defpackage.InterfaceC5578kq0
    public Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        return MN.a;
    }

    @Override // defpackage.InterfaceC5578kq0
    public Set f() {
        Collection collectionG = g(C4317iI.q, C5284jI.z);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof U01) {
                C1559Tt0 name = ((U01) obj).getName();
                O90.e(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC3584eS0
    public Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        return MN.a;
    }
}
