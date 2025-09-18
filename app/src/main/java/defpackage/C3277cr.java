package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: cr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3277cr implements InterfaceC5578kq0 {
    public final String b;
    public final InterfaceC5578kq0[] c;

    public C3277cr(String str, InterfaceC5578kq0[] interfaceC5578kq0Arr) {
        this.b = str;
        this.c = interfaceC5578kq0Arr;
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        InterfaceC5578kq0[] interfaceC5578kq0Arr = this.c;
        int length = interfaceC5578kq0Arr.length;
        if (length == 0) {
            return MN.a;
        }
        if (length == 1) {
            return interfaceC5578kq0Arr[0].a(c1559Tt0, interfaceC0600Hl0);
        }
        Collection collectionB = null;
        for (InterfaceC5578kq0 interfaceC5578kq0 : interfaceC5578kq0Arr) {
            collectionB = AbstractC6840rR1.b(collectionB, interfaceC5578kq0.a(c1559Tt0, interfaceC0600Hl0));
        }
        return collectionB == null ? SN.a : collectionB;
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC5578kq0 interfaceC5578kq0 : this.c) {
            AbstractC0314Du.m(linkedHashSet, interfaceC5578kq0.b());
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        InterfaceC1087Ns interfaceC1087Ns = null;
        for (InterfaceC5578kq0 interfaceC5578kq0 : this.c) {
            InterfaceC1087Ns interfaceC1087NsC = interfaceC5578kq0.c(c1559Tt0, interfaceC0600Hl0);
            if (interfaceC1087NsC != null) {
                if (!(interfaceC1087NsC instanceof InterfaceC1165Os) || !((InterfaceC1165Os) interfaceC1087NsC).M()) {
                    return interfaceC1087NsC;
                }
                if (interfaceC1087Ns == null) {
                    interfaceC1087Ns = interfaceC1087NsC;
                }
            }
        }
        return interfaceC1087Ns;
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set d() {
        InterfaceC5578kq0[] interfaceC5578kq0Arr = this.c;
        O90.f(interfaceC5578kq0Arr, "<this>");
        return AbstractC8123yA1.a(interfaceC5578kq0Arr.length == 0 ? MN.a : new L8(0, interfaceC5578kq0Arr));
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        InterfaceC5578kq0[] interfaceC5578kq0Arr = this.c;
        int length = interfaceC5578kq0Arr.length;
        if (length == 0) {
            return MN.a;
        }
        if (length == 1) {
            return interfaceC5578kq0Arr[0].e(c1559Tt0, enumC8453zv0);
        }
        Collection collectionB = null;
        for (InterfaceC5578kq0 interfaceC5578kq0 : interfaceC5578kq0Arr) {
            collectionB = AbstractC6840rR1.b(collectionB, interfaceC5578kq0.e(c1559Tt0, enumC8453zv0));
        }
        return collectionB == null ? SN.a : collectionB;
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC5578kq0 interfaceC5578kq0 : this.c) {
            AbstractC0314Du.m(linkedHashSet, interfaceC5578kq0.f());
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        InterfaceC5578kq0[] interfaceC5578kq0Arr = this.c;
        int length = interfaceC5578kq0Arr.length;
        if (length == 0) {
            return MN.a;
        }
        if (length == 1) {
            return interfaceC5578kq0Arr[0].g(c4317iI, interfaceC6099nZ);
        }
        Collection collectionB = null;
        for (InterfaceC5578kq0 interfaceC5578kq0 : interfaceC5578kq0Arr) {
            collectionB = AbstractC6840rR1.b(collectionB, interfaceC5578kq0.g(c4317iI, interfaceC6099nZ));
        }
        return collectionB == null ? SN.a : collectionB;
    }

    public final String toString() {
        return this.b;
    }
}
