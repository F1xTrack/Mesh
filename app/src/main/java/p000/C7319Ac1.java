package p000;

import java.util.Iterator;

/* renamed from: Ac1 */
/* loaded from: classes2.dex */
public final class C7319Ac1 implements InterfaceC9127dY0 {

    /* renamed from: a */
    public final InterfaceC9127dY0 f284a;

    /* renamed from: b */
    public final InterfaceC6497nZ f285b;

    public C7319Ac1(InterfaceC9127dY0 interfaceC9127dY0, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(interfaceC6497nZ, "transformer");
        this.f284a = interfaceC9127dY0;
        this.f285b = interfaceC6497nZ;
    }

    @Override // p000.InterfaceC9127dY0
    public final Iterator iterator() {
        return new C11948zc1(this);
    }
}
