package p000;

import java.util.RandomAccess;

/* renamed from: s0 */
/* loaded from: classes2.dex */
public final class C6796s0 extends AbstractC6859t0 implements RandomAccess {

    /* renamed from: a */
    public final AbstractC6859t0 f42190a;

    /* renamed from: b */
    public final int f42191b;

    /* renamed from: c */
    public final int f42192c;

    public C6796s0(AbstractC6859t0 abstractC6859t0, int i, int i2) {
        O90.m5968f(abstractC6859t0, "list");
        this.f42190a = abstractC6859t0;
        this.f42191b = i;
        AbstractC9360fM1.m18221a(i, i2, abstractC6859t0.mo4090b());
        this.f42192c = i2 - i;
    }

    @Override // p000.AbstractC6859t0
    /* renamed from: b */
    public final int mo4090b() {
        return this.f42192c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f42192c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        return this.f42190a.get(this.f42191b + i);
    }
}
