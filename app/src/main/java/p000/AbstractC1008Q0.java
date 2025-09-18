package p000;

import java.util.Random;

/* renamed from: Q0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1008Q0 extends AbstractC9225eJ0 {
    @Override // p000.AbstractC9225eJ0
    /* renamed from: a */
    public final int mo6522a(int i) {
        return ((-i) >> 31) & (mo6526g().nextInt() >>> (32 - i));
    }

    @Override // p000.AbstractC9225eJ0
    /* renamed from: b */
    public final int mo6523b() {
        return mo6526g().nextInt();
    }

    @Override // p000.AbstractC9225eJ0
    /* renamed from: c */
    public final int mo6524c(int i) {
        return mo6526g().nextInt(i);
    }

    @Override // p000.AbstractC9225eJ0
    /* renamed from: d */
    public final long mo6525d() {
        return mo6526g().nextLong();
    }

    /* renamed from: g */
    public abstract Random mo6526g();
}
