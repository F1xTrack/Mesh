package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: h1 */
/* loaded from: classes2.dex */
public final class C4072h1 implements InterfaceC1200Pd1 {
    public final /* synthetic */ VI a;

    public C4072h1(VI vi) {
        this.a = vi;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final InterfaceC1087Ns a() {
        return this.a;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final Collection b() {
        Collection collectionB = this.a.A1().E().b();
        O90.e(collectionB, "getSupertypes(...)");
        return collectionB;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final List getParameters() {
        List list = this.a.q;
        if (list != null) {
            return list;
        }
        O90.o("typeConstructorParameters");
        throw null;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final AbstractC8408zg0 h() {
        return AbstractC7384uI.e(this.a);
    }

    public final String toString() {
        return "[typealias " + this.a.getName().b() + ']';
    }
}
