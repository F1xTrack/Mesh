package p000;

import java.util.Collection;
import java.util.Set;

/* renamed from: Rh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8212Rh0 extends UY1 {

    /* renamed from: a */
    public final /* synthetic */ C11957zh0 f10378a;

    /* renamed from: b */
    public final /* synthetic */ Set f10379b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC8418Vg0 f10380c;

    /* JADX WARN: Multi-variable type inference failed */
    public C8212Rh0(C11957zh0 c11957zh0, Set set, InterfaceC6497nZ interfaceC6497nZ) {
        this.f10378a = c11957zh0;
        this.f10379b = set;
        this.f10380c = (AbstractC8418Vg0) interfaceC6497nZ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Vg0, nZ] */
    @Override // p000.UY1
    /* renamed from: b */
    public final boolean mo7087b(Object obj) {
        InterfaceC6976us interfaceC6976us = (InterfaceC6976us) obj;
        O90.m5968f(interfaceC6976us, "current");
        if (interfaceC6976us == this.f10378a) {
            return true;
        }
        InterfaceC10059kq0 interfaceC10059kq0Mo1433W = interfaceC6976us.mo1433W();
        O90.m5967e(interfaceC10059kq0Mo1433W, "getStaticScope(...)");
        if (!(interfaceC10059kq0Mo1433W instanceof AbstractC8316Th0)) {
            return true;
        }
        this.f10379b.addAll((Collection) this.f10380c.invoke(interfaceC10059kq0Mo1433W));
        return false;
    }

    @Override // p000.UY1
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo7088c() {
        return C8313Tf1.f11463a;
    }
}
