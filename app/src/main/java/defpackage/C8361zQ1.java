package defpackage;

/* renamed from: zQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8361zQ1 extends JQ1 {
    public final int e;
    public final int f;

    public C8361zQ1(byte[] bArr, int i, int i2) {
        super(bArr);
        JQ1.d(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.JQ1
    public final byte b(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC7209tN0.u(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC8235ym.f(i, "Index > length: ", i2, ", "));
    }

    @Override // defpackage.JQ1
    public final byte i(int i) {
        return this.b[this.e + i];
    }

    @Override // defpackage.JQ1
    public final int k() {
        return this.f;
    }

    @Override // defpackage.JQ1
    public final int q() {
        return this.e;
    }
}
