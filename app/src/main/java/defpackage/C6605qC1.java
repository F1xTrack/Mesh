package defpackage;

/* renamed from: qC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6605qC1 extends C8129yC1 {
    public final int d;

    public C6605qC1(byte[] bArr, int i) {
        super(bArr);
        C8129yC1.i(0, i, bArr.length);
        this.d = i;
    }

    @Override // defpackage.C8129yC1
    public final byte b(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC7209tN0.u(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC8235ym.f(i, "Index > length: ", i2, ", "));
    }

    @Override // defpackage.C8129yC1
    public final byte d(int i) {
        return this.b[i];
    }

    @Override // defpackage.C8129yC1
    public final int h() {
        return this.d;
    }
}
