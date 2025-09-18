package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class M90 implements InterfaceC8101Pd1, InterfaceC8153Qd1 {

    /* renamed from: a */
    public AbstractC7742Ig0 f7010a;

    /* renamed from: b */
    public final LinkedHashSet f7011b;

    /* renamed from: c */
    public final int f7012c;

    public M90(AbstractCollection abstractCollection) {
        O90.m5968f(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f7011b = linkedHashSet;
        this.f7012c = linkedHashSet.hashCode();
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: a */
    public final InterfaceC0873Ns mo1962a() {
        return null;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: b */
    public final Collection mo5276b() {
        return this.f7011b;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: c */
    public final boolean mo3023c() {
        return false;
    }

    /* renamed from: e */
    public final X01 m5277e() {
        C7789Jd1.f5652b.getClass();
        return NV1.m5728C(C7789Jd1.f5653c, this, C0779MN.f7117a, false, AbstractC10922rZ1.m24427a("member scope for intersection type", this.f7011b), new C7236z(17, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M90) {
            return O90.m5963a(this.f7011b, ((M90) obj).f7011b);
        }
        return false;
    }

    /* renamed from: f */
    public final String m5278f(InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(interfaceC6497nZ, "getProperTypeRelatedToStringify");
        return AbstractC7167xu.m25962H(AbstractC7167xu.m25977W(this.f7011b, new L90(0, interfaceC6497nZ)), " & ", "{", "}", new C7236z(18, interfaceC6497nZ), 24);
    }

    @Override // p000.InterfaceC8101Pd1
    public final List getParameters() {
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: h */
    public final AbstractC11955zg0 mo1964h() {
        AbstractC11955zg0 abstractC11955zg0Mo1964h = ((AbstractC7742Ig0) this.f7011b.iterator().next()).mo3797E().mo1964h();
        O90.m5967e(abstractC11955zg0Mo1964h, "getBuiltIns(...)");
        return abstractC11955zg0Mo1964h;
    }

    public final int hashCode() {
        return this.f7012c;
    }

    public final String toString() {
        return m5278f(C6228jI.f35023E);
    }
}
