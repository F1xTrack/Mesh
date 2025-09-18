package p000;

import java.util.Iterator;

/* renamed from: cM */
/* loaded from: classes2.dex */
public final class C1842cM implements InterfaceC9127dY0, InterfaceC4111gM {

    /* renamed from: a */
    public final InterfaceC9127dY0 f17448a;

    /* renamed from: b */
    public final int f17449b;

    public C1842cM(InterfaceC9127dY0 interfaceC9127dY0, int i) {
        this.f17448a = interfaceC9127dY0;
        this.f17449b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p000.InterfaceC4111gM
    public final InterfaceC9127dY0 drop(int i) {
        int i2 = this.f17449b + i;
        return i2 < 0 ? new C1842cM(this, i) : new C1842cM(this.f17448a, i2);
    }

    @Override // p000.InterfaceC9127dY0
    public final Iterator iterator() {
        return new C1780bM(this);
    }
}
