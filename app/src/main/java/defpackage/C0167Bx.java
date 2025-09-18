package defpackage;

/* renamed from: Bx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167Bx extends C0089Ax implements GX0 {
    public final int h;
    public final long i;

    public C0167Bx(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.h = i;
        this.i = j == -1 ? -1L : j;
    }

    @Override // defpackage.GX0
    public final long a(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }

    @Override // defpackage.GX0
    public final long c() {
        return this.i;
    }

    @Override // defpackage.GX0
    public final int j() {
        return this.h;
    }
}
