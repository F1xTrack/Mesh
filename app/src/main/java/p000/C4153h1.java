package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: h1 */
/* loaded from: classes2.dex */
public final class C4153h1 implements InterfaceC8101Pd1 {

    /* renamed from: a */
    public final /* synthetic */ C1340VI f28153a;

    public C4153h1(C1340VI c1340vi) {
        this.f28153a = c1340vi;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: a */
    public final InterfaceC0873Ns mo1962a() {
        return this.f28153a;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: b */
    public final Collection mo5276b() {
        Collection collectionMo5276b = this.f28153a.m8390A1().mo3797E().mo5276b();
        O90.m5967e(collectionMo5276b, "getSupertypes(...)");
        return collectionMo5276b;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: c */
    public final boolean mo3023c() {
        return true;
    }

    @Override // p000.InterfaceC8101Pd1
    public final List getParameters() {
        List list = this.f28153a.f12505q;
        if (list != null) {
            return list;
        }
        O90.m5977o("typeConstructorParameters");
        throw null;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: h */
    public final AbstractC11955zg0 mo1964h() {
        return AbstractC6940uI.m25152e(this.f28153a);
    }

    public final String toString() {
        return "[typealias " + this.f28153a.getName().m7801b() + ']';
    }
}
