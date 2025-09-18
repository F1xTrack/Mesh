package defpackage;

/* renamed from: xE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7945xE1 extends GE1 {
    public final int d;
    public final int e;

    public C7945xE1(byte[] bArr, int i, int i2) {
        super(bArr);
        JE1.A(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.GE1
    public final int G() {
        return this.d;
    }

    @Override // defpackage.GE1, defpackage.JE1
    public final byte b(int i) {
        JE1.F(i, this.e);
        return this.c[this.d + i];
    }

    @Override // defpackage.GE1, defpackage.JE1
    public final byte d(int i) {
        return this.c[this.d + i];
    }

    @Override // defpackage.GE1, defpackage.JE1
    public final int i() {
        return this.e;
    }

    @Override // defpackage.GE1, defpackage.JE1
    public final void k(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.c, this.d + i, bArr, i2, i3);
    }
}
