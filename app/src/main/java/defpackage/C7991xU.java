package defpackage;

import java.util.Iterator;

/* renamed from: xU */
/* loaded from: classes2.dex */
public final class C7991xU implements InterfaceC3412dY0 {
    public final InterfaceC3412dY0 a;
    public final boolean b;
    public final Object c;

    public C7991xU(InterfaceC3412dY0 interfaceC3412dY0, boolean z, InterfaceC6099nZ interfaceC6099nZ) {
        this.a = interfaceC3412dY0;
        this.b = z;
        this.c = interfaceC6099nZ;
    }

    @Override // defpackage.InterfaceC3412dY0
    public final Iterator iterator() {
        return new C7801wU(this);
    }
}
