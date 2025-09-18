package defpackage;

import java.util.Iterator;

/* renamed from: bW */
/* loaded from: classes2.dex */
public final class C2339bW implements InterfaceC3412dY0 {
    public final InterfaceC3412dY0 a;
    public final InterfaceC6099nZ b;
    public final Object c;

    public C2339bW(InterfaceC3412dY0 interfaceC3412dY0, InterfaceC6099nZ interfaceC6099nZ, InterfaceC6099nZ interfaceC6099nZ2) {
        O90.f(interfaceC6099nZ, "transformer");
        this.a = interfaceC3412dY0;
        this.b = interfaceC6099nZ;
        this.c = interfaceC6099nZ2;
    }

    @Override // defpackage.InterfaceC3412dY0
    public final Iterator iterator() {
        return new C7801wU(this);
    }
}
