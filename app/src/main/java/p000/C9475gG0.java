package p000;

/* renamed from: gG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9475gG0 {

    /* renamed from: a */
    public final /* synthetic */ int f27649a;

    /* renamed from: b */
    public final C7783Ja1 f27650b;

    /* renamed from: c */
    public final C9591hA0 f27651c;

    /* renamed from: d */
    public boolean f27652d;

    /* renamed from: e */
    public boolean f27653e;

    /* renamed from: f */
    public boolean f27654f;

    /* renamed from: g */
    public long f27655g;

    /* renamed from: h */
    public long f27656h;

    /* renamed from: i */
    public long f27657i;

    public C9475gG0(int i) {
        this.f27649a = i;
        switch (i) {
            case 1:
                this.f27650b = new C7783Ja1(0L);
                this.f27655g = -9223372036854775807L;
                this.f27656h = -9223372036854775807L;
                this.f27657i = -9223372036854775807L;
                this.f27651c = new C9591hA0();
                break;
            default:
                this.f27650b = new C7783Ja1(0L);
                this.f27655g = -9223372036854775807L;
                this.f27656h = -9223372036854775807L;
                this.f27657i = -9223372036854775807L;
                this.f27651c = new C9591hA0();
                break;
        }
    }

    /* renamed from: b */
    public static int m18415b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: c */
    public static long m18416c(C9591hA0 c9591hA0) {
        int i = c9591hA0.f28294b;
        if (c9591hA0.m18743a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c9591hA0.m18747e(bArr, 0, 9);
        c9591hA0.m18741G(i);
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

    /* renamed from: a */
    public final void m18417a(C7000vF c7000vF) {
        switch (this.f27649a) {
            case 0:
                byte[] bArr = AbstractC7485Dh1.f2171f;
                C9591hA0 c9591hA0 = this.f27651c;
                c9591hA0.getClass();
                c9591hA0.m18739E(bArr.length, bArr);
                this.f27652d = true;
                c7000vF.f44297f = 0;
                break;
            default:
                byte[] bArr2 = AbstractC7485Dh1.f2171f;
                C9591hA0 c9591hA02 = this.f27651c;
                c9591hA02.getClass();
                c9591hA02.m18739E(bArr2.length, bArr2);
                this.f27652d = true;
                c7000vF.f44297f = 0;
                break;
        }
    }
}
