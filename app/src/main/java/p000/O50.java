package p000;

import android.net.Uri;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class O50 implements InterfaceC1586ZC {

    /* renamed from: a */
    public final InterfaceC1586ZC f8217a;

    /* renamed from: b */
    public final int f8218b;

    /* renamed from: c */
    public final C10239mE0 f8219c;

    /* renamed from: d */
    public final byte[] f8220d;

    /* renamed from: e */
    public int f8221e;

    public O50(InterfaceC1586ZC interfaceC1586ZC, int i, C10239mE0 c10239mE0) {
        YN1.m9278c(i > 0);
        this.f8217a = interfaceC1586ZC;
        this.f8218b = i;
        this.f8219c = c10239mE0;
        this.f8220d = new byte[1];
        this.f8221e = i;
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: d */
    public final void mo5255d(InterfaceC9648hc1 interfaceC9648hc1) {
        interfaceC9648hc1.getClass();
        this.f8217a.mo5255d(interfaceC9648hc1);
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: l */
    public final Map mo3793l() {
        return this.f8217a.mo3793l();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        return this.f8217a.mo2366o();
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) {
        int i3 = this.f8221e;
        InterfaceC1586ZC interfaceC1586ZC = this.f8217a;
        if (i3 == 0) {
            byte[] bArr2 = this.f8220d;
            int i4 = 0;
            if (interfaceC1586ZC.mo2367r(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iMo2367r = interfaceC1586ZC.mo2367r(bArr3, i4, i6);
                        if (iMo2367r != -1) {
                            i4 += iMo2367r;
                            i6 -= iMo2367r;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        C9591hA0 c9591hA0 = new C9591hA0(bArr3, i5);
                        C10239mE0 c10239mE0 = this.f8219c;
                        long jMax = !c10239mE0.f37581m ? c10239mE0.f37578j : Math.max(c10239mE0.f37582n.m23657k(true), c10239mE0.f37578j);
                        int iM18743a = c9591hA0.m18743a();
                        InterfaceC8357Ub1 interfaceC8357Ub1 = c10239mE0.f37580l;
                        interfaceC8357Ub1.getClass();
                        interfaceC8357Ub1.mo963d(iM18743a, c9591hA0);
                        interfaceC8357Ub1.mo960a(jMax, 1, iM18743a, 0, null);
                        c10239mE0.f37581m = true;
                    }
                }
                this.f8221e = this.f8218b;
            }
            return -1;
        }
        int iMo2367r2 = interfaceC1586ZC.mo2367r(bArr, i, Math.min(this.f8221e, i2));
        if (iMo2367r2 != -1) {
            this.f8221e -= iMo2367r2;
        }
        return iMo2367r2;
    }
}
