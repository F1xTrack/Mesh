package p000;

/* renamed from: Bx */
/* loaded from: classes.dex */
public final class C0123Bx extends C0060Ax implements GX0 {

    /* renamed from: h */
    public final int f1096h;

    /* renamed from: i */
    public final long f1097i;

    public C0123Bx(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.f1096h = i;
        this.f1097i = j == -1 ? -1L : j;
    }

    @Override // p000.GX0
    /* renamed from: a */
    public final long mo927a(long j) {
        return (Math.max(0L, j - this.f477b) * 8000000) / this.f480e;
    }

    @Override // p000.GX0
    /* renamed from: c */
    public final long mo928c() {
        return this.f1097i;
    }

    @Override // p000.GX0
    /* renamed from: j */
    public final int mo929j() {
        return this.f1096h;
    }
}
