package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: l1 */
/* loaded from: classes2.dex */
public abstract class AbstractC6337l1 implements InterfaceC8101Pd1 {

    /* renamed from: a */
    public int f36803a;

    /* renamed from: b */
    public final C8218Rk0 f36804b;

    public AbstractC6337l1(Z41 z41) {
        O90.m5968f(z41, "storageManager");
        this.f36804b = new C8218Rk0((C8582Yk0) z41, new C4090g1(1, this), new C7236z(5, this));
    }

    /* renamed from: e */
    public abstract Collection mo3024e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC8101Pd1) || obj.hashCode() != hashCode()) {
            return false;
        }
        InterfaceC8101Pd1 interfaceC8101Pd1 = (InterfaceC8101Pd1) obj;
        if (interfaceC8101Pd1.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a = mo1962a();
        InterfaceC0873Ns interfaceC0873NsMo1962a2 = interfaceC8101Pd1.mo1962a();
        if (interfaceC0873NsMo1962a2 == null || C6298kP.m22200f(interfaceC0873NsMo1962a) || AbstractC6814sI.m24703o(interfaceC0873NsMo1962a) || C6298kP.m22200f(interfaceC0873NsMo1962a2) || AbstractC6814sI.m24703o(interfaceC0873NsMo1962a2)) {
            return false;
        }
        return mo1965j(interfaceC0873NsMo1962a2);
    }

    /* renamed from: f */
    public abstract AbstractC7742Ig0 mo1963f();

    /* renamed from: g */
    public abstract C7564Ev0 mo3025g();

    public final int hashCode() {
        int i = this.f36803a;
        if (i != 0) {
            return i;
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a = mo1962a();
        int iIdentityHashCode = (C6298kP.m22200f(interfaceC0873NsMo1962a) || AbstractC6814sI.m24703o(interfaceC0873NsMo1962a)) ? System.identityHashCode(this) : AbstractC6814sI.m24695g(interfaceC0873NsMo1962a).f7212a.hashCode();
        this.f36803a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: i */
    public final List mo5276b() {
        return ((C6274k1) this.f36804b.invoke()).f36219b;
    }

    /* renamed from: j */
    public abstract boolean mo1965j(InterfaceC0873Ns interfaceC0873Ns);

    /* renamed from: k */
    public List mo22331k(List list) {
        return list;
    }
}
