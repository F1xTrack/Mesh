package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class N11 implements InterfaceC5751lk0 {
    public final long a = C4020gk0.b.getAndIncrement();
    public final C3538eD b;
    public final M41 c;
    public byte[] d;

    public N11(ZC zc, C3538eD c3538eD) {
        this.b = c3538eD;
        this.c = new M41(zc);
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void e() {
        M41 m41 = this.c;
        m41.b = 0L;
        try {
            m41.c(this.b);
            int iR = 0;
            while (iR != -1) {
                int i = (int) m41.b;
                byte[] bArr = this.d;
                if (bArr == null) {
                    this.d = new byte[1024];
                } else if (i == bArr.length) {
                    this.d = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.d;
                iR = m41.r(bArr2, i, bArr2.length - i);
            }
            AbstractC4370iZ1.b(m41);
        } catch (Throwable th) {
            AbstractC4370iZ1.b(m41);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void s() {
    }
}
