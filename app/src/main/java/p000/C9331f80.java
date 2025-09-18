package p000;

import java.util.ArrayList;

/* renamed from: f80 */
/* loaded from: classes.dex */
public final class C9331f80 implements InterfaceC10608p61 {

    /* renamed from: a */
    public final ArrayList f27085a;

    public C9331f80(ArrayList arrayList) {
        ML1.m5335b("List of suppliers is empty!", !arrayList.isEmpty());
        this.f27085a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9331f80) {
            return EI1.m2118a(this.f27085a, ((C9331f80) obj).f27085a);
        }
        return false;
    }

    @Override // p000.InterfaceC10608p61
    public final Object get() {
        return new C9203e80(this);
    }

    public final int hashCode() {
        return this.f27085a.hashCode();
    }

    public final String toString() {
        C8539Xo1 c8539Xo1M2121d = EI1.m2121d(this);
        c8539Xo1M2121d.m9143l(this.f27085a, "list");
        return c8539Xo1M2121d.toString();
    }
}
