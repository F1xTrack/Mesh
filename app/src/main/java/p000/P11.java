package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class P11 extends AbstractC6758rg {

    /* renamed from: h */
    public final C3976eD f8780h;

    /* renamed from: i */
    public final InterfaceC1397WC f8781i;

    /* renamed from: j */
    public final C6686qX f8782j;

    /* renamed from: l */
    public final C3979eG f8784l;

    /* renamed from: n */
    public final C10595p11 f8786n;

    /* renamed from: o */
    public final C10825qp0 f8787o;

    /* renamed from: p */
    public InterfaceC9648hc1 f8788p;

    /* renamed from: k */
    public final long f8783k = -9223372036854775807L;

    /* renamed from: m */
    public final boolean f8785m = true;

    public P11(C10697pp0 c10697pp0, InterfaceC1397WC interfaceC1397WC, C3979eG c3979eG) {
        this.f8781i = interfaceC1397WC;
        this.f8784l = c3979eG;
        C1164SV c1164sv = new C1164SV();
        N70 n70 = P70.f8867b;
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
        List listEmptyList = Collections.emptyList();
        C9367fQ0 c9367fQ02 = C9367fQ0.f27184e;
        C10057kp0 c10057kp0 = new C10057kp0();
        C10441np0 c10441np0 = C10441np0.f38550a;
        Uri uri = Uri.EMPTY;
        String string = c10697pp0.f40406a.toString();
        string.getClass();
        C10825qp0 c10825qp0 = new C10825qp0(string, new C9929jp0(c1164sv), uri != null ? new C10313mp0(uri, null, null, listEmptyList, P70.m6234u(P70.m6229B(c10697pp0)), -9223372036854775807L) : null, new C10185lp0(c10057kp0), C11337up0.f43931A, c10441np0);
        this.f8787o = c10825qp0;
        C6623pX c6623pX = new C6623pX();
        String str = c10697pp0.f40407b;
        c6623pX.f40161l = AbstractC8544Xr0.m9171n(str == null ? "text/x-unknown" : str);
        c6623pX.f40153d = c10697pp0.f40408c;
        c6623pX.f40154e = c10697pp0.f40409d;
        c6623pX.f40155f = c10697pp0.f40410e;
        c6623pX.f40151b = c10697pp0.f40411f;
        c6623pX.f40150a = null;
        this.f8782j = new C6686qX(c6623pX);
        Map mapEmptyMap = Collections.emptyMap();
        Uri uri2 = c10697pp0.f40406a;
        YN1.m9284i(uri2, "The uri must be set.");
        this.f8780h = new C3976eD(uri2, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1);
        this.f8786n = new C10595p11(-9223372036854775807L, true, false, c10825qp0);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: b */
    public final InterfaceC11973zp0 mo3162b(C7604Fp0 c7604Fp0, C6224jE c6224jE, long j) {
        InterfaceC9648hc1 interfaceC9648hc1 = this.f8788p;
        C1356VY c1356vyM24438a = m24438a(c7604Fp0);
        return new O11(this.f8780h, this.f8781i, interfaceC9648hc1, this.f8782j, this.f8783k, this.f8784l, c1356vyM24438a, this.f8785m);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: h */
    public final C10825qp0 mo6202h() {
        return this.f8787o;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: l */
    public final void mo6203l(InterfaceC9648hc1 interfaceC9648hc1) {
        this.f8788p = interfaceC9648hc1;
        m24442n(this.f8786n);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: o */
    public final void mo3164o(InterfaceC11973zp0 interfaceC11973zp0) {
        ((O11) interfaceC11973zp0).f8183i.m9133P(null);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: j */
    public final void mo3163j() {
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: q */
    public final void mo3165q() {
    }
}
