package p000;

import java.util.Iterator;

/* renamed from: bW */
/* loaded from: classes2.dex */
public final class C1790bW implements InterfaceC9127dY0 {

    /* renamed from: a */
    public final InterfaceC9127dY0 f17053a;

    /* renamed from: b */
    public final InterfaceC6497nZ f17054b;

    /* renamed from: c */
    public final Object f17055c;

    public C1790bW(InterfaceC9127dY0 interfaceC9127dY0, InterfaceC6497nZ interfaceC6497nZ, InterfaceC6497nZ interfaceC6497nZ2) {
        O90.m5968f(interfaceC6497nZ, "transformer");
        this.f17053a = interfaceC9127dY0;
        this.f17054b = interfaceC6497nZ;
        this.f17055c = interfaceC6497nZ2;
    }

    @Override // p000.InterfaceC9127dY0
    public final Iterator iterator() {
        return new C7078wU(this);
    }
}
