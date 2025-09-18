package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PM1 {
    public Long A;
    public Long B;
    public long C;
    public String D;
    public int E;
    public int F;
    public long G;
    public String H;
    public byte[] I;
    public int J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public String Q;
    public boolean R;
    public long S;
    public long T;
    public final C3386dP1 a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public String l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public String q;
    public Boolean r;
    public long s;
    public ArrayList t;
    public String u;
    public boolean v;
    public long w;
    public long x;
    public int y;
    public boolean z;

    public PM1(C3386dP1 c3386dP1, String str) {
        Preconditions.checkNotNull(c3386dP1);
        Preconditions.checkNotEmpty(str);
        this.a = c3386dP1;
        this.b = str;
        C7595vO1 c7595vO1 = c3386dP1.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
    }

    public final void A(String str) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= !Objects.equals(this.f, str);
        this.f = str;
    }

    public final void B(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.O != j;
        this.O = j;
    }

    public final void C(String str) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.R |= !Objects.equals(this.d, str);
        this.d = str;
    }

    public final void D(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.M != j;
        this.M = j;
    }

    public final void E(String str) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= !Objects.equals(this.Q, str);
        this.Q = str;
    }

    public final void F(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.L != j;
        this.L = j;
    }

    public final void G(String str) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= !Objects.equals(this.e, str);
        this.e = str;
    }

    public final void H(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.P != j;
        this.P = j;
    }

    public final void I(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.K != j;
        this.K = j;
    }

    public final void J(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.n != j;
        this.n = j;
    }

    public final void K(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.s != j;
        this.s = j;
    }

    public final void L(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.T != j;
        this.T = j;
    }

    public final void M(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.m != j;
        this.m = j;
    }

    public final long N() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.s;
    }

    public final void O(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.G != j;
        this.G = j;
    }

    public final void P(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.i != j;
        this.i = j;
    }

    public final void Q(long j) {
        Preconditions.checkArgument(j >= 0);
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.g != j;
        this.g = j;
    }

    public final void R(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.h != j;
        this.h = j;
    }

    public final void S(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.x != j;
        this.x = j;
    }

    public final void T(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.w != j;
        this.w = j;
    }

    public final Boolean U() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.r;
    }

    public final void a(long j) {
        C3386dP1 c3386dP1 = this.a;
        C7595vO1 c7595vO1 = c3386dP1.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        long j2 = this.g + j;
        OL1 ol1 = c3386dP1.i;
        String str = this.b;
        if (j2 > 2147483647L) {
            C3386dP1.e(ol1);
            ol1.j.c(OL1.B1(str), "Bundle index overflow. appId");
            j2 = j - 1;
        }
        long j3 = this.G + 1;
        if (j3 > 2147483647L) {
            C3386dP1.e(ol1);
            ol1.j.c(OL1.B1(str), "Delivery index overflow. appId");
            j3 = 0;
        }
        this.R = true;
        this.g = j2;
        this.G = j3;
    }

    public final void b(String str) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.R |= !Objects.equals(this.q, str);
        this.q = str;
    }

    public final void c(List list) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        if (Objects.equals(this.t, list)) {
            return;
        }
        this.R = true;
        this.t = list != null ? new ArrayList(list) : null;
    }

    public final String d() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.q;
    }

    public final String e() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        String str = this.Q;
        E(null);
        return str;
    }

    public final String f() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.b;
    }

    public final String g() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.c;
    }

    public final String h() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.j;
    }

    public final String i() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.f;
    }

    public final String j() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.d;
    }

    public final String k() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.H;
    }

    public final String l() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.D;
    }

    public final boolean m() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.R;
    }

    public final boolean n() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.v;
    }

    public final int o() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.J;
    }

    public final void p(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.k != j;
        this.k = j;
    }

    public final void q(String str) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= !Objects.equals(this.c, str);
        this.c = str;
    }

    public final void r(boolean z) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.o != z;
        this.o = z;
    }

    public final void s(int i) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.F != i;
        this.F = i;
    }

    public final void t(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.C != j;
        this.C = j;
    }

    public final void u(String str) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= !Objects.equals(this.l, str);
        this.l = str;
    }

    public final void v(int i) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.E != i;
        this.E = i;
    }

    public final void w(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.S != j;
        this.S = j;
    }

    public final void x(String str) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final long y() {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        return this.k;
    }

    public final void z(long j) {
        C7595vO1 c7595vO1 = this.a.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        this.R |= this.N != j;
        this.N = j;
    }
}
