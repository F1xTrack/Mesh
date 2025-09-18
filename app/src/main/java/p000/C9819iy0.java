package p000;

import java.util.Iterator;

/* renamed from: iy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9819iy0 extends AbstractC7056w8 {

    /* renamed from: a */
    public final C0699L5 f34822a;

    /* renamed from: b */
    public final int f34823b;

    public C9819iy0(int i, C0699L5 c0699l5) {
        this.f34822a = c0699l5;
        this.f34823b = i;
    }

    @Override // p000.AbstractC7056w8
    /* renamed from: b */
    public final int mo3381b() {
        return 1;
    }

    @Override // p000.AbstractC7056w8
    /* renamed from: d */
    public final void mo3382d(int i, C0699L5 c0699l5) {
        throw new IllegalStateException();
    }

    @Override // p000.AbstractC7056w8
    public final Object get(int i) {
        if (i == this.f34823b) {
            return this.f34822a;
        }
        return null;
    }

    @Override // p000.AbstractC7056w8, java.lang.Iterable
    public final Iterator iterator() {
        return new C9691hy0(0, this);
    }
}
