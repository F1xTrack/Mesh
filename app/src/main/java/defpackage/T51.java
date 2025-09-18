package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class T51 implements InterfaceC5578kq0 {
    public final InterfaceC5578kq0 b;
    public final C7833we1 c;
    public HashMap d;
    public final F71 e;

    public T51(InterfaceC5578kq0 interfaceC5578kq0, C7833we1 c7833we1) {
        O90.f(interfaceC5578kq0, "workerScope");
        O90.f(c7833we1, "givenSubstitutor");
        this.b = interfaceC5578kq0;
        LB.b(new S51(0, c7833we1));
        AbstractC7452ue1 abstractC7452ue1F = c7833we1.f();
        O90.e(abstractC7452ue1F, "getSubstitution(...)");
        this.c = new C7833we1(AbstractC5889mS1.b(abstractC7452ue1F));
        this.e = LB.b(new C6685qd0(29, this));
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        return i(this.b.a(c1559Tt0, interfaceC0600Hl0));
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set b() {
        return this.b.b();
    }

    @Override // defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        InterfaceC1087Ns interfaceC1087NsC = this.b.c(c1559Tt0, interfaceC0600Hl0);
        if (interfaceC1087NsC != null) {
            return (InterfaceC1087Ns) h(interfaceC1087NsC);
        }
        return null;
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set d() {
        return this.b.d();
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        return i(this.b.e(c1559Tt0, enumC8453zv0));
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set f() {
        return this.b.f();
    }

    @Override // defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        return (Collection) this.e.getValue();
    }

    public final CD h(CD cd) {
        C7833we1 c7833we1 = this.c;
        if (c7833we1.a.e()) {
            return cd;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        HashMap map = this.d;
        O90.c(map);
        Object objB = map.get(cd);
        if (objB == null) {
            if (!(cd instanceof R51)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + cd).toString());
            }
            objB = ((R51) cd).b(c7833we1);
            if (objB == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + cd + " substitution fails");
            }
            map.put(cd, objB);
        }
        return (CD) objB;
    }

    public final Collection i(Collection collection) {
        if (this.c.a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((CD) it.next()));
        }
        return linkedHashSet;
    }
}
