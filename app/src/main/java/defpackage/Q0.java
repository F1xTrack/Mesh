package defpackage;

import java.util.Random;

/* loaded from: classes2.dex */
public abstract class Q0 extends AbstractC3557eJ0 {
    @Override // defpackage.AbstractC3557eJ0
    public final int a(int i) {
        return ((-i) >> 31) & (g().nextInt() >>> (32 - i));
    }

    @Override // defpackage.AbstractC3557eJ0
    public final int b() {
        return g().nextInt();
    }

    @Override // defpackage.AbstractC3557eJ0
    public final int c(int i) {
        return g().nextInt(i);
    }

    @Override // defpackage.AbstractC3557eJ0
    public final long d() {
        return g().nextLong();
    }

    public abstract Random g();
}
