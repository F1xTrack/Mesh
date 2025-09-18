package p000;

/* renamed from: xE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11646xE1 extends GE1 {

    /* renamed from: d */
    public final int f45491d;

    /* renamed from: e */
    public final int f45492e;

    public C11646xE1(byte[] bArr, int i, int i2) {
        super(bArr);
        JE1.m4257A(i, i + i2, bArr.length);
        this.f45491d = i;
        this.f45492e = i2;
    }

    @Override // p000.GE1
    /* renamed from: G */
    public final int mo3002G() {
        return this.f45491d;
    }

    @Override // p000.GE1, p000.JE1
    /* renamed from: b */
    public final byte mo3004b(int i) {
        JE1.m4260F(i, this.f45492e);
        return this.f3646c[this.f45491d + i];
    }

    @Override // p000.GE1, p000.JE1
    /* renamed from: d */
    public final byte mo3005d(int i) {
        return this.f3646c[this.f45491d + i];
    }

    @Override // p000.GE1, p000.JE1
    /* renamed from: i */
    public final int mo3006i() {
        return this.f45492e;
    }

    @Override // p000.GE1, p000.JE1
    /* renamed from: k */
    public final void mo3007k(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f3646c, this.f45491d + i, bArr, i2, i3);
    }
}
