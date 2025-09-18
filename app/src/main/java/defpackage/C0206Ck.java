package defpackage;

/* renamed from: Ck */
/* loaded from: classes.dex */
public final class C0206Ck extends C0362Ek {
    public final int d;
    public final int e;

    public C0206Ck(byte[] bArr, int i, int i2) {
        super(bArr);
        C0362Ek.d(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.C0362Ek
    public final byte b(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC7209tN0.u(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC8235ym.f(i, "Index > length: ", i2, ", "));
    }

    @Override // defpackage.C0362Ek
    public final int h() {
        return this.d;
    }

    @Override // defpackage.C0362Ek
    public final byte i(int i) {
        return this.b[this.d + i];
    }

    @Override // defpackage.C0362Ek
    public final int size() {
        return this.e;
    }
}
