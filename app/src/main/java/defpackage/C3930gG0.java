package defpackage;

/* renamed from: gG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3930gG0 {
    public final /* synthetic */ int a;
    public final C0724Ja1 b;
    public final C4103hA0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public C3930gG0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new C0724Ja1(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new C4103hA0();
                break;
            default:
                this.b = new C0724Ja1(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new C4103hA0();
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(C4103hA0 c4103hA0) {
        int i = c4103hA0.b;
        if (c4103hA0.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c4103hA0.e(bArr, 0, 9);
        c4103hA0.G(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(C7566vF c7566vF) {
        switch (this.a) {
            case 0:
                byte[] bArr = AbstractC0277Dh1.f;
                C4103hA0 c4103hA0 = this.c;
                c4103hA0.getClass();
                c4103hA0.E(bArr.length, bArr);
                this.d = true;
                c7566vF.f = 0;
                break;
            default:
                byte[] bArr2 = AbstractC0277Dh1.f;
                C4103hA0 c4103hA02 = this.c;
                c4103hA02.getClass();
                c4103hA02.E(bArr2.length, bArr2);
                this.d = true;
                c7566vF.f = 0;
                break;
        }
    }
}
