package defpackage;

import java.util.Iterator;

/* renamed from: Ac1 */
/* loaded from: classes2.dex */
public final class C0028Ac1 implements InterfaceC3412dY0 {
    public final InterfaceC3412dY0 a;
    public final InterfaceC6099nZ b;

    public C0028Ac1(InterfaceC3412dY0 interfaceC3412dY0, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(interfaceC6099nZ, "transformer");
        this.a = interfaceC3412dY0;
        this.b = interfaceC6099nZ;
    }

    @Override // defpackage.InterfaceC3412dY0
    public final Iterator iterator() {
        return new C8397zc1(this);
    }
}
