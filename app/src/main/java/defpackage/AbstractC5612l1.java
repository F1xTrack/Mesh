package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: l1 */
/* loaded from: classes2.dex */
public abstract class AbstractC5612l1 implements InterfaceC1200Pd1 {
    public int a;
    public final C1376Rk0 b;

    public AbstractC5612l1(Z41 z41) {
        O90.f(z41, "storageManager");
        this.b = new C1376Rk0((C1922Yk0) z41, new C3881g1(1, this), new C8277z(5, this));
    }

    public abstract Collection e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1200Pd1) || obj.hashCode() != hashCode()) {
            return false;
        }
        InterfaceC1200Pd1 interfaceC1200Pd1 = (InterfaceC1200Pd1) obj;
        if (interfaceC1200Pd1.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC1087Ns interfaceC1087NsA = a();
        InterfaceC1087Ns interfaceC1087NsA2 = interfaceC1200Pd1.a();
        if (interfaceC1087NsA2 == null || C5496kP.f(interfaceC1087NsA) || AbstractC7002sI.o(interfaceC1087NsA) || C5496kP.f(interfaceC1087NsA2) || AbstractC7002sI.o(interfaceC1087NsA2)) {
            return false;
        }
        return j(interfaceC1087NsA2);
    }

    public abstract AbstractC0663Ig0 f();

    public abstract C0396Ev0 g();

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        InterfaceC1087Ns interfaceC1087NsA = a();
        int iIdentityHashCode = (C5496kP.f(interfaceC1087NsA) || AbstractC7002sI.o(interfaceC1087NsA)) ? System.identityHashCode(this) : AbstractC7002sI.g(interfaceC1087NsA).a.hashCode();
        this.a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // defpackage.InterfaceC1200Pd1
    /* renamed from: i */
    public final List b() {
        return ((C5421k1) this.b.invoke()).b;
    }

    public abstract boolean j(InterfaceC1087Ns interfaceC1087Ns);

    public List k(List list) {
        return list;
    }
}
