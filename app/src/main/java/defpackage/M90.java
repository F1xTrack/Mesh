package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class M90 implements InterfaceC1200Pd1, InterfaceC1278Qd1 {
    public AbstractC0663Ig0 a;
    public final LinkedHashSet b;
    public final int c;

    public M90(AbstractCollection abstractCollection) {
        O90.f(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final InterfaceC1087Ns a() {
        return null;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final Collection b() {
        return this.b;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final boolean c() {
        return false;
    }

    public final X01 e() {
        C0733Jd1.b.getClass();
        return NV1.C(C0733Jd1.c, this, MN.a, false, AbstractC6864rZ1.a("member scope for intersection type", this.b), new C8277z(17, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M90) {
            return O90.a(this.b, ((M90) obj).b);
        }
        return false;
    }

    public final String f(InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(interfaceC6099nZ, "getProperTypeRelatedToStringify");
        return AbstractC8069xu.H(AbstractC8069xu.W(this.b, new L90(0, interfaceC6099nZ)), " & ", "{", "}", new C8277z(18, interfaceC6099nZ), 24);
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final List getParameters() {
        return MN.a;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final AbstractC8408zg0 h() {
        AbstractC8408zg0 abstractC8408zg0H = ((AbstractC0663Ig0) this.b.iterator().next()).E().h();
        O90.e(abstractC8408zg0H, "getBuiltIns(...)");
        return abstractC8408zg0H;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return f(C5284jI.E);
    }
}
