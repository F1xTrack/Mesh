package p000;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dl */
/* loaded from: classes.dex */
public final class C3948dl implements InterfaceC1586ZC {

    /* renamed from: a */
    public final N01 f26236a;

    /* renamed from: b */
    public final InterfaceC1586ZC f26237b;

    /* renamed from: c */
    public final C9206e91 f26238c;

    /* renamed from: d */
    public final InterfaceC1586ZC f26239d;

    /* renamed from: e */
    public final boolean f26240e = false;

    /* renamed from: f */
    public final boolean f26241f = false;

    /* renamed from: g */
    public final boolean f26242g = false;

    /* renamed from: h */
    public Uri f26243h;

    /* renamed from: i */
    public C3976eD f26244i;

    /* renamed from: j */
    public C3976eD f26245j;

    /* renamed from: k */
    public InterfaceC1586ZC f26246k;

    /* renamed from: l */
    public long f26247l;

    /* renamed from: m */
    public long f26248m;

    /* renamed from: n */
    public long f26249n;

    /* renamed from: o */
    public P01 f26250o;

    /* renamed from: p */
    public boolean f26251p;

    /* renamed from: q */
    public boolean f26252q;

    /* renamed from: r */
    public long f26253r;

    public C3948dl(N01 n01, InterfaceC1586ZC interfaceC1586ZC, InterfaceC1586ZC interfaceC1586ZC2, C1867cl c1867cl) {
        this.f26236a = n01;
        this.f26237b = interfaceC1586ZC2;
        if (interfaceC1586ZC != null) {
            this.f26239d = interfaceC1586ZC;
            this.f26238c = c1867cl != null ? new C9206e91(interfaceC1586ZC, c1867cl) : null;
        } else {
            this.f26239d = C10361nB0.f38166a;
            this.f26238c = null;
        }
    }

    /* renamed from: a */
    public final void m17734a() {
        N01 n01 = this.f26236a;
        InterfaceC1586ZC interfaceC1586ZC = this.f26246k;
        if (interfaceC1586ZC == null) {
            return;
        }
        try {
            interfaceC1586ZC.close();
        } finally {
            this.f26245j = null;
            this.f26246k = null;
            P01 p01 = this.f26250o;
            if (p01 != null) {
                n01.m5501j(p01);
                this.f26250o = null;
            }
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) {
        N01 n01 = this.f26236a;
        try {
            String string = c3976eD.f26602h;
            long j = c3976eD.f26600f;
            if (string == null) {
                string = c3976eD.f26595a.toString();
            }
            C3914dD c3914dDM17879a = c3976eD.m17879a();
            c3914dDM17879a.f25877h = string;
            C3976eD c3976eDM17503a = c3914dDM17879a.m17503a();
            this.f26244i = c3976eDM17503a;
            Uri uri = c3976eDM17503a.f26595a;
            byte[] bArr = (byte[]) n01.m5498g(string).f14206b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, AbstractC7227yr.f46511c) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f26243h = uri;
            this.f26248m = j;
            boolean z = this.f26241f;
            long j2 = c3976eD.f26601g;
            boolean z2 = (z && this.f26251p) || (this.f26242g && j2 == -1);
            this.f26252q = z2;
            if (z2) {
                this.f26249n = -1L;
            } else {
                long jM8582a = AbstractC1374Vq.m8582a(n01.m5498g(string));
                this.f26249n = jM8582a;
                if (jM8582a != -1) {
                    long j3 = jM8582a - j;
                    this.f26249n = j3;
                    if (j3 < 0) {
                        throw new C1650aD(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.f26249n;
                this.f26249n = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.f26249n;
            if (j5 > 0 || j5 == -1) {
                m17735e(c3976eDM17503a, false);
            }
            return j2 != -1 ? j2 : this.f26249n;
        } catch (Throwable th) {
            if (this.f26246k == this.f26237b || (th instanceof C1242Tk)) {
                this.f26251p = true;
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        this.f26244i = null;
        this.f26243h = null;
        this.f26248m = 0L;
        try {
            m17734a();
        } catch (Throwable th) {
            if (this.f26246k == this.f26237b || (th instanceof C1242Tk)) {
                this.f26251p = true;
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: d */
    public final void mo5255d(InterfaceC9648hc1 interfaceC9648hc1) {
        interfaceC9648hc1.getClass();
        this.f26237b.mo5255d(interfaceC9648hc1);
        this.f26239d.mo5255d(interfaceC9648hc1);
    }

    /* renamed from: e */
    public final void m17735e(C3976eD c3976eD, boolean z) throws InterruptedIOException {
        P01 p01M5504m;
        C3976eD c3976eDM17503a;
        InterfaceC1586ZC interfaceC1586ZC;
        String str = c3976eD.f26602h;
        int i = AbstractC7485Dh1.f2166a;
        if (this.f26252q) {
            p01M5504m = null;
        } else if (this.f26240e) {
            try {
                N01 n01 = this.f26236a;
                long j = this.f26248m;
                long j2 = this.f26249n;
                synchronized (n01) {
                    n01.m5497d();
                    while (true) {
                        p01M5504m = n01.m5504m(j, j2, str);
                        if (p01M5504m != null) {
                            break;
                        } else {
                            n01.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            p01M5504m = this.f26236a.m5504m(this.f26248m, this.f26249n, str);
        }
        if (p01M5504m == null) {
            interfaceC1586ZC = this.f26239d;
            C3914dD c3914dDM17879a = c3976eD.m17879a();
            c3914dDM17879a.f25875f = this.f26248m;
            c3914dDM17879a.f25876g = this.f26249n;
            c3976eDM17503a = c3914dDM17879a.m17503a();
        } else if (p01M5504m.f35356d) {
            Uri uriFromFile = Uri.fromFile(p01M5504m.f35357e);
            long j3 = p01M5504m.f35354b;
            long j4 = this.f26248m - j3;
            long jMin = p01M5504m.f35355c - j4;
            long j5 = this.f26249n;
            if (j5 != -1) {
                jMin = Math.min(jMin, j5);
            }
            C3914dD c3914dDM17879a2 = c3976eD.m17879a();
            c3914dDM17879a2.f25870a = uriFromFile;
            c3914dDM17879a2.f25871b = j3;
            c3914dDM17879a2.f25875f = j4;
            c3914dDM17879a2.f25876g = jMin;
            c3976eDM17503a = c3914dDM17879a2.m17503a();
            interfaceC1586ZC = this.f26237b;
        } else {
            long jMin2 = p01M5504m.f35355c;
            if (jMin2 == -1) {
                jMin2 = this.f26249n;
            } else {
                long j6 = this.f26249n;
                if (j6 != -1) {
                    jMin2 = Math.min(jMin2, j6);
                }
            }
            C3914dD c3914dDM17879a3 = c3976eD.m17879a();
            c3914dDM17879a3.f25875f = this.f26248m;
            c3914dDM17879a3.f25876g = jMin2;
            c3976eDM17503a = c3914dDM17879a3.m17503a();
            interfaceC1586ZC = this.f26238c;
            if (interfaceC1586ZC == null) {
                interfaceC1586ZC = this.f26239d;
                this.f26236a.m5501j(p01M5504m);
                p01M5504m = null;
            }
        }
        this.f26253r = (this.f26252q || interfaceC1586ZC != this.f26239d) ? Long.MAX_VALUE : this.f26248m + 102400;
        if (z) {
            YN1.m9281f(this.f26246k == this.f26239d);
            if (interfaceC1586ZC == this.f26239d) {
                return;
            }
            try {
                m17734a();
            } finally {
            }
        }
        if (p01M5504m != null && !p01M5504m.f35356d) {
            this.f26250o = p01M5504m;
        }
        this.f26246k = interfaceC1586ZC;
        this.f26245j = c3976eDM17503a;
        this.f26247l = 0L;
        long jMo2365c = interfaceC1586ZC.mo2365c(c3976eDM17503a);
        C9108dO1 c9108dO1 = new C9108dO1(9);
        if (c3976eDM17503a.f26601g == -1 && jMo2365c != -1) {
            this.f26249n = jMo2365c;
            c9108dO1.m17571o(Long.valueOf(this.f26248m + jMo2365c), "exo_len");
        }
        if (!(this.f26246k == this.f26237b)) {
            Uri uriMo2366o = interfaceC1586ZC.mo2366o();
            this.f26243h = uriMo2366o;
            Uri uri = c3976eD.f26595a.equals(uriMo2366o) ? null : this.f26243h;
            if (uri == null) {
                ((ArrayList) c9108dO1.f26013c).add("exo_redir");
                ((HashMap) c9108dO1.f26012b).remove("exo_redir");
            } else {
                c9108dO1.m17571o(uri.toString(), "exo_redir");
            }
        }
        if (this.f26246k == this.f26238c) {
            this.f26236a.m5496c(str, c9108dO1);
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: l */
    public final Map mo3793l() {
        return !(this.f26246k == this.f26237b) ? this.f26239d.mo3793l() : Collections.emptyMap();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        return this.f26243h;
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) {
        int i3;
        InterfaceC1586ZC interfaceC1586ZC = this.f26237b;
        if (i2 == 0) {
            return 0;
        }
        if (this.f26249n == 0) {
            return -1;
        }
        C3976eD c3976eD = this.f26244i;
        c3976eD.getClass();
        C3976eD c3976eD2 = this.f26245j;
        c3976eD2.getClass();
        try {
            if (this.f26248m >= this.f26253r) {
                m17735e(c3976eD, true);
            }
            InterfaceC1586ZC interfaceC1586ZC2 = this.f26246k;
            interfaceC1586ZC2.getClass();
            int iMo2367r = interfaceC1586ZC2.mo2367r(bArr, i, i2);
            if (iMo2367r != -1) {
                long j = iMo2367r;
                this.f26248m += j;
                this.f26247l += j;
                long j2 = this.f26249n;
                if (j2 != -1) {
                    this.f26249n = j2 - j;
                }
                return iMo2367r;
            }
            InterfaceC1586ZC interfaceC1586ZC3 = this.f26246k;
            if (interfaceC1586ZC3 == interfaceC1586ZC) {
                i3 = iMo2367r;
            } else {
                i3 = iMo2367r;
                long j3 = c3976eD2.f26601g;
                if (j3 == -1 || this.f26247l < j3) {
                    String str = c3976eD.f26602h;
                    int i4 = AbstractC7485Dh1.f2166a;
                    this.f26249n = 0L;
                    if (!(interfaceC1586ZC3 == this.f26238c)) {
                        return i3;
                    }
                    C9108dO1 c9108dO1 = new C9108dO1(9);
                    c9108dO1.m17571o(Long.valueOf(this.f26248m), "exo_len");
                    this.f26236a.m5496c(str, c9108dO1);
                    return i3;
                }
            }
            long j4 = this.f26249n;
            if (j4 <= 0 && j4 != -1) {
                return i3;
            }
            m17734a();
            m17735e(c3976eD, false);
            return mo2367r(bArr, i, i2);
        } catch (Throwable th) {
            if (this.f26246k == interfaceC1586ZC || (th instanceof C1242Tk)) {
                this.f26251p = true;
            }
            throw th;
        }
    }
}
