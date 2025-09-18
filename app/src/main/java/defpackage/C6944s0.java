package defpackage;

import java.util.RandomAccess;

/* renamed from: s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6944s0 extends AbstractC7135t0 implements RandomAccess {
    public final AbstractC7135t0 a;
    public final int b;
    public final int c;

    public C6944s0(AbstractC7135t0 abstractC7135t0, int i, int i2) {
        O90.f(abstractC7135t0, "list");
        this.a = abstractC7135t0;
        this.b = i;
        AbstractC3758fM1.a(i, i2, abstractC7135t0.b());
        this.c = i2 - i;
    }

    @Override // defpackage.AbstractC7135t0
    public final int b() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        return this.a.get(this.b + i);
    }
}
