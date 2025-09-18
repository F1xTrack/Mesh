package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: Rh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1367Rh0 extends UY1 {
    public final /* synthetic */ C8411zh0 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ AbstractC1676Vg0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public C1367Rh0(C8411zh0 c8411zh0, Set set, InterfaceC6099nZ interfaceC6099nZ) {
        this.a = c8411zh0;
        this.b = set;
        this.c = (AbstractC1676Vg0) interfaceC6099nZ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Vg0, nZ] */
    @Override // defpackage.UY1
    public final boolean b(Object obj) {
        InterfaceC7492us interfaceC7492us = (InterfaceC7492us) obj;
        O90.f(interfaceC7492us, "current");
        if (interfaceC7492us == this.a) {
            return true;
        }
        InterfaceC5578kq0 interfaceC5578kq0W = interfaceC7492us.W();
        O90.e(interfaceC5578kq0W, "getStaticScope(...)");
        if (!(interfaceC5578kq0W instanceof AbstractC1523Th0)) {
            return true;
        }
        this.b.addAll((Collection) this.c.invoke(interfaceC5578kq0W));
        return false;
    }

    @Override // defpackage.UY1
    public final /* bridge */ /* synthetic */ Object c() {
        return C1518Tf1.a;
    }
}
