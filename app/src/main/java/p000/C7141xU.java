package p000;

import java.util.Iterator;

/* renamed from: xU */
/* loaded from: classes2.dex */
public final class C7141xU implements InterfaceC9127dY0 {

    /* renamed from: a */
    public final InterfaceC9127dY0 f45651a;

    /* renamed from: b */
    public final boolean f45652b;

    /* renamed from: c */
    public final Object f45653c;

    public C7141xU(InterfaceC9127dY0 interfaceC9127dY0, boolean z, InterfaceC6497nZ interfaceC6497nZ) {
        this.f45651a = interfaceC9127dY0;
        this.f45652b = z;
        this.f45653c = interfaceC6497nZ;
    }

    @Override // p000.InterfaceC9127dY0
    public final Iterator iterator() {
        return new C7078wU(this);
    }
}
