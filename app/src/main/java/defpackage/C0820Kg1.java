package defpackage;

/* renamed from: Kg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820Kg1 extends AbstractC0975Mg1 {
    @Override // defpackage.AbstractC0975Mg1
    public final boolean c(long j, Object obj) {
        return this.a.getBoolean(obj, j);
    }

    @Override // defpackage.AbstractC0975Mg1
    public final byte d(long j, Object obj) {
        return this.a.getByte(obj, j);
    }

    @Override // defpackage.AbstractC0975Mg1
    public final double e(long j, Object obj) {
        return this.a.getDouble(obj, j);
    }

    @Override // defpackage.AbstractC0975Mg1
    public final float f(long j, Object obj) {
        return this.a.getFloat(obj, j);
    }

    @Override // defpackage.AbstractC0975Mg1
    public final void k(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // defpackage.AbstractC0975Mg1
    public final void l(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // defpackage.AbstractC0975Mg1
    public final void m(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // defpackage.AbstractC0975Mg1
    public final void n(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }
}
