package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class T51 implements InterfaceC10059kq0 {

    /* renamed from: b */
    public final InterfaceC10059kq0 f11149b;

    /* renamed from: c */
    public final C11571we1 f11150c;

    /* renamed from: d */
    public HashMap f11151d;

    /* renamed from: e */
    public final F71 f11152e;

    public T51(InterfaceC10059kq0 interfaceC10059kq0, C11571we1 c11571we1) {
        O90.m5968f(interfaceC10059kq0, "workerScope");
        O90.m5968f(c11571we1, "givenSubstitutor");
        this.f11149b = interfaceC10059kq0;
        AbstractC0705LB.m4915b(new S51(0, c11571we1));
        AbstractC11316ue1 abstractC11316ue1M25665f = c11571we1.m25665f();
        O90.m5967e(abstractC11316ue1M25665f, "getSubstitution(...)");
        this.f11150c = new C11571we1(AbstractC10268mS1.m22829b(abstractC11316ue1M25665f));
        this.f11152e = AbstractC0705LB.m4915b(new C10801qd0(29, this));
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: a */
    public final Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        return m7545i(this.f11149b.mo1769a(c8340Tt0, interfaceC7700Hl0));
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: b */
    public final Set mo6677b() {
        return this.f11149b.mo6677b();
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        InterfaceC0873Ns interfaceC0873NsMo1770c = this.f11149b.mo1770c(c8340Tt0, interfaceC7700Hl0);
        if (interfaceC0873NsMo1770c != null) {
            return (InterfaceC0873Ns) m7544h(interfaceC0873NsMo1770c);
        }
        return null;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: d */
    public final Set mo4153d() {
        return this.f11149b.mo4153d();
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: e */
    public final Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        return m7545i(this.f11149b.mo1771e(c8340Tt0, enumC11985zv0));
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: f */
    public final Set mo6678f() {
        return this.f11149b.mo6678f();
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        return (Collection) this.f11152e.getValue();
    }

    /* renamed from: h */
    public final InterfaceC0140CD m7544h(InterfaceC0140CD interfaceC0140CD) {
        C11571we1 c11571we1 = this.f11150c;
        if (c11571we1.f45011a.mo7050e()) {
            return interfaceC0140CD;
        }
        if (this.f11151d == null) {
            this.f11151d = new HashMap();
        }
        HashMap map = this.f11151d;
        O90.m5965c(map);
        Object objMo114b = map.get(interfaceC0140CD);
        if (objMo114b == null) {
            if (!(interfaceC0140CD instanceof R51)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC0140CD).toString());
            }
            objMo114b = ((R51) interfaceC0140CD).mo114b(c11571we1);
            if (objMo114b == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC0140CD + " substitution fails");
            }
            map.put(interfaceC0140CD, objMo114b);
        }
        return (InterfaceC0140CD) objMo114b;
    }

    /* renamed from: i */
    public final Collection m7545i(Collection collection) {
        if (this.f11150c.f45011a.mo7050e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(m7544h((InterfaceC0140CD) it.next()));
        }
        return linkedHashSet;
    }
}
