package p000;

import java.util.Iterator;

/* renamed from: xT0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11675xT0 implements Iterator {

    /* renamed from: a */
    public final C11548wT0 f45645a;

    /* renamed from: b */
    public C0110Bk f45646b;

    /* renamed from: c */
    public int f45647c;

    public C11675xT0(C11802yT0 c11802yT0) {
        C11548wT0 c11548wT0 = new C11548wT0(c11802yT0);
        this.f45645a = c11548wT0;
        this.f45646b = new C0110Bk(c11548wT0.m25632a());
        this.f45647c = c11802yT0.f46265b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45647c > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f45646b.hasNext()) {
            this.f45646b = new C0110Bk(this.f45645a.m25632a());
        }
        this.f45647c--;
        return Byte.valueOf(this.f45646b.m843a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
