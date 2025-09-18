package p000;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class N11 implements InterfaceC10175lk0 {

    /* renamed from: a */
    public final long f7463a = C9535gk0.f27975b.getAndIncrement();

    /* renamed from: b */
    public final C3976eD f7464b;

    /* renamed from: c */
    public final M41 f7465c;

    /* renamed from: d */
    public byte[] f7466d;

    public N11(InterfaceC1586ZC interfaceC1586ZC, C3976eD c3976eD) {
        this.f7464b = c3976eD;
        this.f7465c = new M41(interfaceC1586ZC);
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: e */
    public final void mo388e() {
        M41 m41 = this.f7465c;
        m41.f6986b = 0L;
        try {
            m41.mo2365c(this.f7464b);
            int iMo2367r = 0;
            while (iMo2367r != -1) {
                int i = (int) m41.f6986b;
                byte[] bArr = this.f7466d;
                if (bArr == null) {
                    this.f7466d = new byte[1024];
                } else if (i == bArr.length) {
                    this.f7466d = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f7466d;
                iMo2367r = m41.mo2367r(bArr2, i, bArr2.length - i);
            }
            AbstractC9770iZ1.m19065b(m41);
        } catch (Throwable th) {
            AbstractC9770iZ1.m19065b(m41);
            throw th;
        }
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: s */
    public final void mo402s() {
    }
}
