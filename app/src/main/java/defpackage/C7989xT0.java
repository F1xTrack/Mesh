package defpackage;

import java.util.Iterator;

/* renamed from: xT0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7989xT0 implements Iterator {
    public final C7799wT0 a;
    public C0128Bk b;
    public int c;

    public C7989xT0(C8179yT0 c8179yT0) {
        C7799wT0 c7799wT0 = new C7799wT0(c8179yT0);
        this.a = c7799wT0;
        this.b = new C0128Bk(c7799wT0.a());
        this.c = c8179yT0.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = new C0128Bk(this.a.a());
        }
        this.c--;
        return Byte.valueOf(this.b.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
