package defpackage;

import java.util.Iterator;

/* renamed from: cM */
/* loaded from: classes2.dex */
public final class C2499cM implements InterfaceC3412dY0, InterfaceC3947gM {
    public final InterfaceC3412dY0 a;
    public final int b;

    public C2499cM(InterfaceC3412dY0 interfaceC3412dY0, int i) {
        this.a = interfaceC3412dY0;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.InterfaceC3947gM
    public final InterfaceC3412dY0 drop(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new C2499cM(this, i) : new C2499cM(this.a, i2);
    }

    @Override // defpackage.InterfaceC3412dY0
    public final Iterator iterator() {
        return new C2309bM(this);
    }
}
