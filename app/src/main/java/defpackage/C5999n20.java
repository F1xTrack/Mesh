package defpackage;

/* renamed from: n20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5999n20 {
    public final InterfaceC1584Ub1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public C5999n20(InterfaceC1584Ub1 interfaceC1584Ub1) {
        this.a = interfaceC1584Ub1;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f = (i2 - i) + i3;
            } else {
                this.d = ((bArr[i4] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }

    public final void b(int i, long j, boolean z) {
        YN1.f(this.h != -9223372036854775807L);
        if (this.e == 182 && z && this.b) {
            this.a.a(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }
}
