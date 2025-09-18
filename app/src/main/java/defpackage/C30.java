package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class C30 implements InterfaceC1584Ub1 {
    public static final C6666qX f;
    public static final C6666qX g;
    public final InterfaceC1584Ub1 a;
    public final C6666qX b;
    public C6666qX c;
    public byte[] d;
    public int e;

    static {
        C6475pX c6475pX = new C6475pX();
        c6475pX.l = AbstractC1865Xr0.n("application/id3");
        f = new C6666qX(c6475pX);
        C6475pX c6475pX2 = new C6475pX();
        c6475pX2.l = AbstractC1865Xr0.n("application/x-emsg");
        g = new C6666qX(c6475pX2);
    }

    public C30(InterfaceC1584Ub1 interfaceC1584Ub1, int i) {
        this.a = interfaceC1584Ub1;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void a(long j, int i, int i2, int i3, C1506Tb1 c1506Tb1) {
        this.c.getClass();
        int i4 = this.e - i3;
        C4103hA0 c4103hA0 = new C4103hA0(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.m;
        C6666qX c6666qX = this.b;
        if (!AbstractC0277Dh1.a(str, c6666qX.m)) {
            if (!"application/x-emsg".equals(this.c.m)) {
                AbstractC6789rA1.h("Ignoring sample for unsupported format: " + this.c.m);
                return;
            }
            LP lpE = H7.e(c4103hA0);
            C6666qX c6666qXA = lpE.A();
            String str2 = c6666qX.m;
            if (c6666qXA == null || !AbstractC0277Dh1.a(str2, c6666qXA.m)) {
                AbstractC6789rA1.h("Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + lpE.A());
                return;
            }
            byte[] bArrE0 = lpE.e0();
            bArrE0.getClass();
            c4103hA0 = new C4103hA0(bArrE0);
        }
        int iA = c4103hA0.a();
        InterfaceC1584Ub1 interfaceC1584Ub1 = this.a;
        interfaceC1584Ub1.d(iA, c4103hA0);
        interfaceC1584Ub1.a(j, i, iA, 0, c1506Tb1);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void b(C4103hA0 c4103hA0, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        c4103hA0.e(this.d, this.e, i);
        this.e += i;
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int c(RC rc, int i, boolean z) throws EOFException {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int iR = rc.r(this.d, this.e, i);
        if (iR != -1) {
            this.e += iR;
            return iR;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final /* synthetic */ void d(int i, C4103hA0 c4103hA0) {
        F91.n(this, c4103hA0, i);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int e(RC rc, int i, boolean z) {
        return c(rc, i, z);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void f(C6666qX c6666qX) {
        this.c = c6666qX;
        this.a.f(this.b);
    }
}
