package p000;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PM1 {

    /* renamed from: A */
    public Long f9013A;

    /* renamed from: B */
    public Long f9014B;

    /* renamed from: C */
    public long f9015C;

    /* renamed from: D */
    public String f9016D;

    /* renamed from: E */
    public int f9017E;

    /* renamed from: F */
    public int f9018F;

    /* renamed from: G */
    public long f9019G;

    /* renamed from: H */
    public String f9020H;

    /* renamed from: I */
    public byte[] f9021I;

    /* renamed from: J */
    public int f9022J;

    /* renamed from: K */
    public long f9023K;

    /* renamed from: L */
    public long f9024L;

    /* renamed from: M */
    public long f9025M;

    /* renamed from: N */
    public long f9026N;

    /* renamed from: O */
    public long f9027O;

    /* renamed from: P */
    public long f9028P;

    /* renamed from: Q */
    public String f9029Q;

    /* renamed from: R */
    public boolean f9030R;

    /* renamed from: S */
    public long f9031S;

    /* renamed from: T */
    public long f9032T;

    /* renamed from: a */
    public final C9110dP1 f9033a;

    /* renamed from: b */
    public final String f9034b;

    /* renamed from: c */
    public String f9035c;

    /* renamed from: d */
    public String f9036d;

    /* renamed from: e */
    public String f9037e;

    /* renamed from: f */
    public String f9038f;

    /* renamed from: g */
    public long f9039g;

    /* renamed from: h */
    public long f9040h;

    /* renamed from: i */
    public long f9041i;

    /* renamed from: j */
    public String f9042j;

    /* renamed from: k */
    public long f9043k;

    /* renamed from: l */
    public String f9044l;

    /* renamed from: m */
    public long f9045m;

    /* renamed from: n */
    public long f9046n;

    /* renamed from: o */
    public boolean f9047o;

    /* renamed from: p */
    public boolean f9048p;

    /* renamed from: q */
    public String f9049q;

    /* renamed from: r */
    public Boolean f9050r;

    /* renamed from: s */
    public long f9051s;

    /* renamed from: t */
    public ArrayList f9052t;

    /* renamed from: u */
    public String f9053u;

    /* renamed from: v */
    public boolean f9054v;

    /* renamed from: w */
    public long f9055w;

    /* renamed from: x */
    public long f9056x;

    /* renamed from: y */
    public int f9057y;

    /* renamed from: z */
    public boolean f9058z;

    public PM1(C9110dP1 c9110dP1, String str) {
        Preconditions.checkNotNull(c9110dP1);
        Preconditions.checkNotEmpty(str);
        this.f9033a = c9110dP1;
        this.f9034b = str;
        C11412vO1 c11412vO1 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
    }

    /* renamed from: A */
    public final void m6308A(String str) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= !Objects.equals(this.f9038f, str);
        this.f9038f = str;
    }

    /* renamed from: B */
    public final void m6309B(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9027O != j;
        this.f9027O = j;
    }

    /* renamed from: C */
    public final void m6310C(String str) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f9030R |= !Objects.equals(this.f9036d, str);
        this.f9036d = str;
    }

    /* renamed from: D */
    public final void m6311D(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9025M != j;
        this.f9025M = j;
    }

    /* renamed from: E */
    public final void m6312E(String str) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= !Objects.equals(this.f9029Q, str);
        this.f9029Q = str;
    }

    /* renamed from: F */
    public final void m6313F(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9024L != j;
        this.f9024L = j;
    }

    /* renamed from: G */
    public final void m6314G(String str) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= !Objects.equals(this.f9037e, str);
        this.f9037e = str;
    }

    /* renamed from: H */
    public final void m6315H(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9028P != j;
        this.f9028P = j;
    }

    /* renamed from: I */
    public final void m6316I(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9023K != j;
        this.f9023K = j;
    }

    /* renamed from: J */
    public final void m6317J(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9046n != j;
        this.f9046n = j;
    }

    /* renamed from: K */
    public final void m6318K(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9051s != j;
        this.f9051s = j;
    }

    /* renamed from: L */
    public final void m6319L(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9032T != j;
        this.f9032T = j;
    }

    /* renamed from: M */
    public final void m6320M(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9045m != j;
        this.f9045m = j;
    }

    /* renamed from: N */
    public final long m6321N() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9051s;
    }

    /* renamed from: O */
    public final void m6322O(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9019G != j;
        this.f9019G = j;
    }

    /* renamed from: P */
    public final void m6323P(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9041i != j;
        this.f9041i = j;
    }

    /* renamed from: Q */
    public final void m6324Q(long j) {
        Preconditions.checkArgument(j >= 0);
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9039g != j;
        this.f9039g = j;
    }

    /* renamed from: R */
    public final void m6325R(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9040h != j;
        this.f9040h = j;
    }

    /* renamed from: S */
    public final void m6326S(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9056x != j;
        this.f9056x = j;
    }

    /* renamed from: T */
    public final void m6327T(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9055w != j;
        this.f9055w = j;
    }

    /* renamed from: U */
    public final Boolean m6328U() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9050r;
    }

    /* renamed from: a */
    public final void m6329a(long j) {
        C9110dP1 c9110dP1 = this.f9033a;
        C11412vO1 c11412vO1 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        long j2 = this.f9039g + j;
        OL1 ol1 = c9110dP1.f26039i;
        String str = this.f9034b;
        if (j2 > 2147483647L) {
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(OL1.m6026B1(str), "Bundle index overflow. appId");
            j2 = j - 1;
        }
        long j3 = this.f9019G + 1;
        if (j3 > 2147483647L) {
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(OL1.m6026B1(str), "Delivery index overflow. appId");
            j3 = 0;
        }
        this.f9030R = true;
        this.f9039g = j2;
        this.f9019G = j3;
    }

    /* renamed from: b */
    public final void m6330b(String str) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f9030R |= !Objects.equals(this.f9049q, str);
        this.f9049q = str;
    }

    /* renamed from: c */
    public final void m6331c(List list) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        if (Objects.equals(this.f9052t, list)) {
            return;
        }
        this.f9030R = true;
        this.f9052t = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: d */
    public final String m6332d() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9049q;
    }

    /* renamed from: e */
    public final String m6333e() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        String str = this.f9029Q;
        m6312E(null);
        return str;
    }

    /* renamed from: f */
    public final String m6334f() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9034b;
    }

    /* renamed from: g */
    public final String m6335g() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9035c;
    }

    /* renamed from: h */
    public final String m6336h() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9042j;
    }

    /* renamed from: i */
    public final String m6337i() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9038f;
    }

    /* renamed from: j */
    public final String m6338j() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9036d;
    }

    /* renamed from: k */
    public final String m6339k() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9020H;
    }

    /* renamed from: l */
    public final String m6340l() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9016D;
    }

    /* renamed from: m */
    public final boolean m6341m() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9030R;
    }

    /* renamed from: n */
    public final boolean m6342n() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9054v;
    }

    /* renamed from: o */
    public final int m6343o() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9022J;
    }

    /* renamed from: p */
    public final void m6344p(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9043k != j;
        this.f9043k = j;
    }

    /* renamed from: q */
    public final void m6345q(String str) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= !Objects.equals(this.f9035c, str);
        this.f9035c = str;
    }

    /* renamed from: r */
    public final void m6346r(boolean z) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9047o != z;
        this.f9047o = z;
    }

    /* renamed from: s */
    public final void m6347s(int i) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9018F != i;
        this.f9018F = i;
    }

    /* renamed from: t */
    public final void m6348t(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9015C != j;
        this.f9015C = j;
    }

    /* renamed from: u */
    public final void m6349u(String str) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= !Objects.equals(this.f9044l, str);
        this.f9044l = str;
    }

    /* renamed from: v */
    public final void m6350v(int i) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9017E != i;
        this.f9017E = i;
    }

    /* renamed from: w */
    public final void m6351w(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9031S != j;
        this.f9031S = j;
    }

    /* renamed from: x */
    public final void m6352x(String str) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= !Objects.equals(this.f9042j, str);
        this.f9042j = str;
    }

    /* renamed from: y */
    public final long m6353y() {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        return this.f9043k;
    }

    /* renamed from: z */
    public final void m6354z(long j) {
        C11412vO1 c11412vO1 = this.f9033a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        this.f9030R |= this.f9026N != j;
        this.f9026N = j;
    }
}
