package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: v80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7546v80 extends AbstractC5769lq0 {
    public final InterfaceC5578kq0 b;

    public C7546v80(InterfaceC5578kq0 interfaceC5578kq0) {
        O90.f(interfaceC5578kq0, "workerScope");
        this.b = interfaceC5578kq0;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set b() {
        return this.b.b();
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        InterfaceC1087Ns interfaceC1087NsC = this.b.c(c1559Tt0, interfaceC0600Hl0);
        if (interfaceC1087NsC == null) {
            return null;
        }
        InterfaceC7492us interfaceC7492us = interfaceC1087NsC instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsC : null;
        if (interfaceC7492us != null) {
            return interfaceC7492us;
        }
        if (interfaceC1087NsC instanceof InterfaceC0499Gd1) {
            return (InterfaceC0499Gd1) interfaceC1087NsC;
        }
        return null;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set d() {
        return this.b.d();
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set f() {
        return this.b.f();
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        Collection collection;
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        int i = C4317iI.l & c4317iI.b;
        C4317iI c4317iI2 = i == 0 ? null : new C4317iI(i, c4317iI.a);
        if (c4317iI2 == null) {
            collection = MN.a;
        } else {
            Collection collectionG = this.b.g(c4317iI2, interfaceC6099nZ);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionG) {
                if (obj instanceof InterfaceC1165Os) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
