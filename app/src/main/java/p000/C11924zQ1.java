package p000;

/* renamed from: zQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11924zQ1 extends JQ1 {

    /* renamed from: e */
    public final int f46831e;

    /* renamed from: f */
    public final int f46832f;

    public C11924zQ1(byte[] bArr, int i, int i2) {
        super(bArr);
        JQ1.m4317d(i, i + i2, bArr.length);
        this.f46831e = i;
        this.f46832f = i2;
    }

    @Override // p000.JQ1
    /* renamed from: b */
    public final byte mo4319b(int i) {
        int i2 = this.f46832f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f5519b[this.f46831e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC11153tN0.m24909u(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index > length: ", i2, ", "));
    }

    @Override // p000.JQ1
    /* renamed from: i */
    public final byte mo4320i(int i) {
        return this.f5519b[this.f46831e + i];
    }

    @Override // p000.JQ1
    /* renamed from: k */
    public final int mo4321k() {
        return this.f46832f;
    }

    @Override // p000.JQ1
    /* renamed from: q */
    public final int mo4322q() {
        return this.f46831e;
    }
}
