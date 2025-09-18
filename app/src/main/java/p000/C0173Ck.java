package p000;

/* renamed from: Ck */
/* loaded from: classes.dex */
public final class C0173Ck extends C0299Ek {

    /* renamed from: d */
    public final int f1599d;

    /* renamed from: e */
    public final int f1600e;

    public C0173Ck(byte[] bArr, int i, int i2) {
        super(bArr);
        C0299Ek.m2371d(i, i + i2, bArr.length);
        this.f1599d = i;
        this.f1600e = i2;
    }

    @Override // p000.C0299Ek
    /* renamed from: b */
    public final byte mo1302b(int i) {
        int i2 = this.f1600e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f2872b[this.f1599d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC11153tN0.m24909u(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index > length: ", i2, ", "));
    }

    @Override // p000.C0299Ek
    /* renamed from: h */
    public final int mo1303h() {
        return this.f1599d;
    }

    @Override // p000.C0299Ek
    /* renamed from: i */
    public final byte mo1304i(int i) {
        return this.f2872b[this.f1599d + i];
    }

    @Override // p000.C0299Ek
    public final int size() {
        return this.f1600e;
    }
}
