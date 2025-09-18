package defpackage;

import java.util.ArrayList;

/* renamed from: f80 */
/* loaded from: classes.dex */
public final class C3715f80 implements InterfaceC6396p61 {
    public final ArrayList a;

    public C3715f80(ArrayList arrayList) {
        ML1.b("List of suppliers is empty!", !arrayList.isEmpty());
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3715f80) {
            return EI1.a(this.a, ((C3715f80) obj).a);
        }
        return false;
    }

    @Override // defpackage.InterfaceC6396p61
    public final Object get() {
        return new C3524e80(this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        C1857Xo1 c1857Xo1D = EI1.d(this);
        c1857Xo1D.l(this.a, "list");
        return c1857Xo1D.toString();
    }
}
