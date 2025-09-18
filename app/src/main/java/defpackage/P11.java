package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class P11 extends AbstractC6883rg {
    public final C3538eD h;
    public final WC i;
    public final C6666qX j;
    public final C3547eG l;
    public final C6378p11 n;
    public final C6721qp0 o;
    public InterfaceC4188hc1 p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public P11(C6530pp0 c6530pp0, WC wc, C3547eG c3547eG) {
        this.i = wc;
        this.l = c3547eG;
        SV sv = new SV();
        N70 n70 = P70.b;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        List listEmptyList = Collections.emptyList();
        C3769fQ0 c3769fQ02 = C3769fQ0.e;
        C5575kp0 c5575kp0 = new C5575kp0();
        C6148np0 c6148np0 = C6148np0.a;
        Uri uri = Uri.EMPTY;
        String string = c6530pp0.a.toString();
        string.getClass();
        C6721qp0 c6721qp0 = new C6721qp0(string, new C5384jp0(sv), uri != null ? new C5957mp0(uri, null, null, listEmptyList, P70.u(P70.B(c6530pp0)), -9223372036854775807L) : null, new C5766lp0(c5575kp0), C7484up0.A, c6148np0);
        this.o = c6721qp0;
        C6475pX c6475pX = new C6475pX();
        String str = c6530pp0.b;
        c6475pX.l = AbstractC1865Xr0.n(str == null ? "text/x-unknown" : str);
        c6475pX.d = c6530pp0.c;
        c6475pX.e = c6530pp0.d;
        c6475pX.f = c6530pp0.e;
        c6475pX.b = c6530pp0.f;
        c6475pX.a = null;
        this.j = new C6666qX(c6475pX);
        Map mapEmptyMap = Collections.emptyMap();
        Uri uri2 = c6530pp0.a;
        YN1.i(uri2, "The uri must be set.");
        this.h = new C3538eD(uri2, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1);
        this.n = new C6378p11(-9223372036854775807L, true, false, c6721qp0);
    }

    @Override // defpackage.AbstractC6883rg
    public final InterfaceC8435zp0 b(C0456Fp0 c0456Fp0, C5272jE c5272jE, long j) {
        InterfaceC4188hc1 interfaceC4188hc1 = this.p;
        VY vyA = a(c0456Fp0);
        return new O11(this.h, this.i, interfaceC4188hc1, this.j, this.k, this.l, vyA, this.m);
    }

    @Override // defpackage.AbstractC6883rg
    public final C6721qp0 h() {
        return this.o;
    }

    @Override // defpackage.AbstractC6883rg
    public final void l(InterfaceC4188hc1 interfaceC4188hc1) {
        this.p = interfaceC4188hc1;
        n(this.n);
    }

    @Override // defpackage.AbstractC6883rg
    public final void o(InterfaceC8435zp0 interfaceC8435zp0) {
        ((O11) interfaceC8435zp0).i.P(null);
    }

    @Override // defpackage.AbstractC6883rg
    public final void j() {
    }

    @Override // defpackage.AbstractC6883rg
    public final void q() {
    }
}
