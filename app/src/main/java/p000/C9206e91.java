package p000;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: e91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9206e91 implements InterfaceC1586ZC {

    /* renamed from: a */
    public final InterfaceC1586ZC f26572a;

    /* renamed from: b */
    public final C1867cl f26573b;

    /* renamed from: c */
    public boolean f26574c;

    /* renamed from: d */
    public long f26575d;

    public C9206e91(InterfaceC1586ZC interfaceC1586ZC, C1867cl c1867cl) {
        interfaceC1586ZC.getClass();
        this.f26572a = interfaceC1586ZC;
        c1867cl.getClass();
        this.f26573b = c1867cl;
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) throws C1805bl {
        long jMo2365c = this.f26572a.mo2365c(c3976eD);
        this.f26575d = jMo2365c;
        if (jMo2365c == 0) {
            return 0L;
        }
        if (c3976eD.f26601g == -1 && jMo2365c != -1) {
            c3976eD = c3976eD.m17882e(0L, jMo2365c);
        }
        this.f26574c = true;
        C1867cl c1867cl = this.f26573b;
        c1867cl.getClass();
        c3976eD.f26602h.getClass();
        if (c3976eD.f26601g == -1 && c3976eD.m17880c(2)) {
            c1867cl.f17724d = null;
        } else {
            c1867cl.f17724d = c3976eD;
            c1867cl.f17725e = c3976eD.m17880c(4) ? c1867cl.f17722b : Long.MAX_VALUE;
            c1867cl.f17729i = 0L;
            try {
                c1867cl.m10854b(c3976eD);
            } catch (IOException e) {
                throw new C1805bl(e);
            }
        }
        return this.f26575d;
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() throws C1805bl {
        C1867cl c1867cl = this.f26573b;
        try {
            this.f26572a.close();
            if (this.f26574c) {
                this.f26574c = false;
                if (c1867cl.f17724d == null) {
                    return;
                }
                try {
                    c1867cl.m10853a();
                } catch (IOException e) {
                    throw new C1805bl(e);
                }
            }
        } catch (Throwable th) {
            if (this.f26574c) {
                this.f26574c = false;
                if (c1867cl.f17724d != null) {
                    try {
                        c1867cl.m10853a();
                    } catch (IOException e2) {
                        throw new C1805bl(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: d */
    public final void mo5255d(InterfaceC9648hc1 interfaceC9648hc1) {
        interfaceC9648hc1.getClass();
        this.f26572a.mo5255d(interfaceC9648hc1);
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: l */
    public final Map mo3793l() {
        return this.f26572a.mo3793l();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        return this.f26572a.mo2366o();
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) throws IOException {
        if (this.f26575d == 0) {
            return -1;
        }
        int iMo2367r = this.f26572a.mo2367r(bArr, i, i2);
        if (iMo2367r > 0) {
            C1867cl c1867cl = this.f26573b;
            C3976eD c3976eD = c1867cl.f17724d;
            if (c3976eD != null) {
                int i3 = 0;
                while (i3 < iMo2367r) {
                    try {
                        if (c1867cl.f17728h == c1867cl.f17725e) {
                            c1867cl.m10853a();
                            c1867cl.m10854b(c3976eD);
                        }
                        int iMin = (int) Math.min(iMo2367r - i3, c1867cl.f17725e - c1867cl.f17728h);
                        OutputStream outputStream = c1867cl.f17727g;
                        int i4 = AbstractC7485Dh1.f2166a;
                        outputStream.write(bArr, i + i3, iMin);
                        i3 += iMin;
                        long j = iMin;
                        c1867cl.f17728h += j;
                        c1867cl.f17729i += j;
                    } catch (IOException e) {
                        throw new C1805bl(e);
                    }
                }
            }
            long j2 = this.f26575d;
            if (j2 != -1) {
                this.f26575d = j2 - iMo2367r;
            }
        }
        return iMo2367r;
    }
}
