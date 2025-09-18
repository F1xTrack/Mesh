package p000;

/* renamed from: qC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10748qC1 extends C11769yC1 {

    /* renamed from: d */
    public final int f40670d;

    public C10748qC1(byte[] bArr, int i) {
        super(bArr);
        C11769yC1.m26093i(0, i, bArr.length);
        this.f40670d = i;
    }

    @Override // p000.C11769yC1
    /* renamed from: b */
    public final byte mo23953b(int i) {
        int i2 = this.f40670d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f46140b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC11153tN0.m24909u(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index > length: ", i2, ", "));
    }

    @Override // p000.C11769yC1
    /* renamed from: d */
    public final byte mo23954d(int i) {
        return this.f46140b[i];
    }

    @Override // p000.C11769yC1
    /* renamed from: h */
    public final int mo23955h() {
        return this.f40670d;
    }
}
