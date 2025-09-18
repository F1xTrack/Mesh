package p000;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class TE0 extends AbstractC11487w00 {

    /* renamed from: J */
    public static final TE0 f11218J;

    /* renamed from: K */
    public static final C11695xd0 f11219K = new C11695xd0(8);

    /* renamed from: A */
    public int f11220A;

    /* renamed from: B */
    public List f11221B;

    /* renamed from: C */
    public List f11222C;

    /* renamed from: D */
    public int f11223D;

    /* renamed from: E */
    public GF0 f11224E;

    /* renamed from: F */
    public List f11225F;

    /* renamed from: G */
    public NF0 f11226G;

    /* renamed from: H */
    public byte f11227H;

    /* renamed from: I */
    public int f11228I;

    /* renamed from: b */
    public final AbstractC0488Hk f11229b;

    /* renamed from: c */
    public int f11230c;

    /* renamed from: d */
    public int f11231d;

    /* renamed from: e */
    public int f11232e;

    /* renamed from: f */
    public int f11233f;

    /* renamed from: g */
    public List f11234g;

    /* renamed from: h */
    public List f11235h;

    /* renamed from: i */
    public List f11236i;

    /* renamed from: j */
    public int f11237j;

    /* renamed from: k */
    public List f11238k;

    /* renamed from: l */
    public int f11239l;

    /* renamed from: m */
    public List f11240m;

    /* renamed from: n */
    public List f11241n;

    /* renamed from: o */
    public int f11242o;

    /* renamed from: p */
    public List f11243p;

    /* renamed from: q */
    public List f11244q;

    /* renamed from: r */
    public List f11245r;

    /* renamed from: s */
    public List f11246s;

    /* renamed from: t */
    public List f11247t;

    /* renamed from: u */
    public List f11248u;

    /* renamed from: v */
    public int f11249v;

    /* renamed from: w */
    public int f11250w;

    /* renamed from: x */
    public AF0 f11251x;

    /* renamed from: y */
    public int f11252y;

    /* renamed from: z */
    public List f11253z;

    static {
        TE0 te0 = new TE0();
        f11218J = te0;
        te0.m7648p();
    }

    public TE0(RE0 re0) {
        super(re0);
        this.f11237j = -1;
        this.f11239l = -1;
        this.f11242o = -1;
        this.f11249v = -1;
        this.f11220A = -1;
        this.f11223D = -1;
        this.f11227H = (byte) -1;
        this.f11228I = -1;
        this.f11229b = re0.f41281a;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: a */
    public final AbstractC0631K0 mo127a() {
        return f11218J;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f11228I;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f11230c & 1) == 1 ? C0577J9.m4205e(1, this.f11231d) : 0;
        int iM4206f = 0;
        for (int i2 = 0; i2 < this.f11236i.size(); i2++) {
            iM4206f += C0577J9.m4206f(((Integer) this.f11236i.get(i2)).intValue());
        }
        int iM4207g = iM4205e + iM4206f;
        if (!this.f11236i.isEmpty()) {
            iM4207g = iM4207g + 1 + C0577J9.m4206f(iM4206f);
        }
        this.f11237j = iM4206f;
        if ((this.f11230c & 2) == 2) {
            iM4207g += C0577J9.m4205e(3, this.f11232e);
        }
        if ((this.f11230c & 4) == 4) {
            iM4207g += C0577J9.m4205e(4, this.f11233f);
        }
        for (int i3 = 0; i3 < this.f11234g.size(); i3++) {
            iM4207g += C0577J9.m4207g(5, (AbstractC0631K0) this.f11234g.get(i3));
        }
        for (int i4 = 0; i4 < this.f11235h.size(); i4++) {
            iM4207g += C0577J9.m4207g(6, (AbstractC0631K0) this.f11235h.get(i4));
        }
        int iM4206f2 = 0;
        for (int i5 = 0; i5 < this.f11238k.size(); i5++) {
            iM4206f2 += C0577J9.m4206f(((Integer) this.f11238k.get(i5)).intValue());
        }
        int iM4207g2 = iM4207g + iM4206f2;
        if (!this.f11238k.isEmpty()) {
            iM4207g2 = iM4207g2 + 1 + C0577J9.m4206f(iM4206f2);
        }
        this.f11239l = iM4206f2;
        for (int i6 = 0; i6 < this.f11243p.size(); i6++) {
            iM4207g2 += C0577J9.m4207g(8, (AbstractC0631K0) this.f11243p.get(i6));
        }
        for (int i7 = 0; i7 < this.f11244q.size(); i7++) {
            iM4207g2 += C0577J9.m4207g(9, (AbstractC0631K0) this.f11244q.get(i7));
        }
        for (int i8 = 0; i8 < this.f11245r.size(); i8++) {
            iM4207g2 += C0577J9.m4207g(10, (AbstractC0631K0) this.f11245r.get(i8));
        }
        for (int i9 = 0; i9 < this.f11246s.size(); i9++) {
            iM4207g2 += C0577J9.m4207g(11, (AbstractC0631K0) this.f11246s.get(i9));
        }
        for (int i10 = 0; i10 < this.f11247t.size(); i10++) {
            iM4207g2 += C0577J9.m4207g(13, (AbstractC0631K0) this.f11247t.get(i10));
        }
        int iM4206f3 = 0;
        for (int i11 = 0; i11 < this.f11248u.size(); i11++) {
            iM4206f3 += C0577J9.m4206f(((Integer) this.f11248u.get(i11)).intValue());
        }
        int iM4207g3 = iM4207g2 + iM4206f3;
        if (!this.f11248u.isEmpty()) {
            iM4207g3 = iM4207g3 + 2 + C0577J9.m4206f(iM4206f3);
        }
        this.f11249v = iM4206f3;
        if ((this.f11230c & 8) == 8) {
            iM4207g3 += C0577J9.m4205e(17, this.f11250w);
        }
        if ((this.f11230c & 16) == 16) {
            iM4207g3 += C0577J9.m4207g(18, this.f11251x);
        }
        if ((this.f11230c & 32) == 32) {
            iM4207g3 += C0577J9.m4205e(19, this.f11252y);
        }
        for (int i12 = 0; i12 < this.f11240m.size(); i12++) {
            iM4207g3 += C0577J9.m4207g(20, (AbstractC0631K0) this.f11240m.get(i12));
        }
        int iM4206f4 = 0;
        for (int i13 = 0; i13 < this.f11241n.size(); i13++) {
            iM4206f4 += C0577J9.m4206f(((Integer) this.f11241n.get(i13)).intValue());
        }
        int iM4206f5 = iM4207g3 + iM4206f4;
        if (!this.f11241n.isEmpty()) {
            iM4206f5 = iM4206f5 + 2 + C0577J9.m4206f(iM4206f4);
        }
        this.f11242o = iM4206f4;
        int iM4206f6 = 0;
        for (int i14 = 0; i14 < this.f11253z.size(); i14++) {
            iM4206f6 += C0577J9.m4206f(((Integer) this.f11253z.get(i14)).intValue());
        }
        int iM4207g4 = iM4206f5 + iM4206f6;
        if (!this.f11253z.isEmpty()) {
            iM4207g4 = iM4207g4 + 2 + C0577J9.m4206f(iM4206f6);
        }
        this.f11220A = iM4206f6;
        for (int i15 = 0; i15 < this.f11221B.size(); i15++) {
            iM4207g4 += C0577J9.m4207g(23, (AbstractC0631K0) this.f11221B.get(i15));
        }
        int iM4206f7 = 0;
        for (int i16 = 0; i16 < this.f11222C.size(); i16++) {
            iM4206f7 += C0577J9.m4206f(((Integer) this.f11222C.get(i16)).intValue());
        }
        int iM4207g5 = iM4207g4 + iM4206f7;
        if (!this.f11222C.isEmpty()) {
            iM4207g5 = iM4207g5 + 2 + C0577J9.m4206f(iM4206f7);
        }
        this.f11223D = iM4206f7;
        if ((this.f11230c & 64) == 64) {
            iM4207g5 += C0577J9.m4207g(30, this.f11224E);
        }
        int iM4206f8 = 0;
        for (int i17 = 0; i17 < this.f11225F.size(); i17++) {
            iM4206f8 += C0577J9.m4206f(((Integer) this.f11225F.get(i17)).intValue());
        }
        int size = (this.f11225F.size() * 2) + iM4207g5 + iM4206f8;
        if ((this.f11230c & 128) == 128) {
            size += C0577J9.m4207g(32, this.f11226G);
        }
        int size2 = this.f11229b.size() + m25536j() + size;
        this.f11228I = size2;
        return size2;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return RE0.m6924m();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        RE0 re0M6924m = RE0.m6924m();
        re0M6924m.m6926n(this);
        return re0M6924m;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f11227H;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f11230c & 2) != 2) {
            this.f11227H = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f11234g.size(); i++) {
            if (!((FF0) this.f11234g.get(i)).mo131e()) {
                this.f11227H = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f11235h.size(); i2++) {
            if (!((AF0) this.f11235h.get(i2)).mo131e()) {
                this.f11227H = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f11240m.size(); i3++) {
            if (!((AF0) this.f11240m.get(i3)).mo131e()) {
                this.f11227H = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f11243p.size(); i4++) {
            if (!((VE0) this.f11243p.get(i4)).mo131e()) {
                this.f11227H = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.f11244q.size(); i5++) {
            if (!((C9729iF0) this.f11244q.get(i5)).mo131e()) {
                this.f11227H = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f11245r.size(); i6++) {
            if (!((C10753qF0) this.f11245r.get(i6)).mo131e()) {
                this.f11227H = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.f11246s.size(); i7++) {
            if (!((CF0) this.f11246s.get(i7)).mo131e()) {
                this.f11227H = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f11247t.size(); i8++) {
            if (!((C9089dF0) this.f11247t.get(i8)).mo131e()) {
                this.f11227H = (byte) 0;
                return false;
            }
        }
        if ((this.f11230c & 16) == 16 && !this.f11251x.mo131e()) {
            this.f11227H = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.f11221B.size(); i9++) {
            if (!((AF0) this.f11221B.get(i9)).mo131e()) {
                this.f11227H = (byte) 0;
                return false;
            }
        }
        if ((this.f11230c & 64) == 64 && !this.f11224E.mo131e()) {
            this.f11227H = (byte) 0;
            return false;
        }
        if (m25535i()) {
            this.f11227H = (byte) 1;
            return true;
        }
        this.f11227H = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        C9108dO1 c9108dO1 = new C9108dO1(this);
        if ((this.f11230c & 1) == 1) {
            c0577j9.m4233w(1, this.f11231d);
        }
        if (this.f11236i.size() > 0) {
            c0577j9.m4218F(18);
            c0577j9.m4218F(this.f11237j);
        }
        for (int i = 0; i < this.f11236i.size(); i++) {
            c0577j9.m4234x(((Integer) this.f11236i.get(i)).intValue());
        }
        if ((this.f11230c & 2) == 2) {
            c0577j9.m4233w(3, this.f11232e);
        }
        if ((this.f11230c & 4) == 4) {
            c0577j9.m4233w(4, this.f11233f);
        }
        for (int i2 = 0; i2 < this.f11234g.size(); i2++) {
            c0577j9.m4235y(5, (AbstractC0631K0) this.f11234g.get(i2));
        }
        for (int i3 = 0; i3 < this.f11235h.size(); i3++) {
            c0577j9.m4235y(6, (AbstractC0631K0) this.f11235h.get(i3));
        }
        if (this.f11238k.size() > 0) {
            c0577j9.m4218F(58);
            c0577j9.m4218F(this.f11239l);
        }
        for (int i4 = 0; i4 < this.f11238k.size(); i4++) {
            c0577j9.m4234x(((Integer) this.f11238k.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.f11243p.size(); i5++) {
            c0577j9.m4235y(8, (AbstractC0631K0) this.f11243p.get(i5));
        }
        for (int i6 = 0; i6 < this.f11244q.size(); i6++) {
            c0577j9.m4235y(9, (AbstractC0631K0) this.f11244q.get(i6));
        }
        for (int i7 = 0; i7 < this.f11245r.size(); i7++) {
            c0577j9.m4235y(10, (AbstractC0631K0) this.f11245r.get(i7));
        }
        for (int i8 = 0; i8 < this.f11246s.size(); i8++) {
            c0577j9.m4235y(11, (AbstractC0631K0) this.f11246s.get(i8));
        }
        for (int i9 = 0; i9 < this.f11247t.size(); i9++) {
            c0577j9.m4235y(13, (AbstractC0631K0) this.f11247t.get(i9));
        }
        if (this.f11248u.size() > 0) {
            c0577j9.m4218F(130);
            c0577j9.m4218F(this.f11249v);
        }
        for (int i10 = 0; i10 < this.f11248u.size(); i10++) {
            c0577j9.m4234x(((Integer) this.f11248u.get(i10)).intValue());
        }
        if ((this.f11230c & 8) == 8) {
            c0577j9.m4233w(17, this.f11250w);
        }
        if ((this.f11230c & 16) == 16) {
            c0577j9.m4235y(18, this.f11251x);
        }
        if ((this.f11230c & 32) == 32) {
            c0577j9.m4233w(19, this.f11252y);
        }
        for (int i11 = 0; i11 < this.f11240m.size(); i11++) {
            c0577j9.m4235y(20, (AbstractC0631K0) this.f11240m.get(i11));
        }
        if (this.f11241n.size() > 0) {
            c0577j9.m4218F(170);
            c0577j9.m4218F(this.f11242o);
        }
        for (int i12 = 0; i12 < this.f11241n.size(); i12++) {
            c0577j9.m4234x(((Integer) this.f11241n.get(i12)).intValue());
        }
        if (this.f11253z.size() > 0) {
            c0577j9.m4218F(178);
            c0577j9.m4218F(this.f11220A);
        }
        for (int i13 = 0; i13 < this.f11253z.size(); i13++) {
            c0577j9.m4234x(((Integer) this.f11253z.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f11221B.size(); i14++) {
            c0577j9.m4235y(23, (AbstractC0631K0) this.f11221B.get(i14));
        }
        if (this.f11222C.size() > 0) {
            c0577j9.m4218F(194);
            c0577j9.m4218F(this.f11223D);
        }
        for (int i15 = 0; i15 < this.f11222C.size(); i15++) {
            c0577j9.m4234x(((Integer) this.f11222C.get(i15)).intValue());
        }
        if ((this.f11230c & 64) == 64) {
            c0577j9.m4235y(30, this.f11224E);
        }
        for (int i16 = 0; i16 < this.f11225F.size(); i16++) {
            c0577j9.m4233w(31, ((Integer) this.f11225F.get(i16)).intValue());
        }
        if ((this.f11230c & 128) == 128) {
            c0577j9.m4235y(32, this.f11226G);
        }
        c9108dO1.m17570K(19000, c0577j9);
        c0577j9.m4214B(this.f11229b);
    }

    /* renamed from: p */
    public final void m7648p() {
        this.f11231d = 6;
        this.f11232e = 0;
        this.f11233f = 0;
        this.f11234g = Collections.emptyList();
        this.f11235h = Collections.emptyList();
        this.f11236i = Collections.emptyList();
        this.f11238k = Collections.emptyList();
        this.f11240m = Collections.emptyList();
        this.f11241n = Collections.emptyList();
        this.f11243p = Collections.emptyList();
        this.f11244q = Collections.emptyList();
        this.f11245r = Collections.emptyList();
        this.f11246s = Collections.emptyList();
        this.f11247t = Collections.emptyList();
        this.f11248u = Collections.emptyList();
        this.f11250w = 0;
        this.f11251x = AF0.f123t;
        this.f11252y = 0;
        this.f11253z = Collections.emptyList();
        this.f11221B = Collections.emptyList();
        this.f11222C = Collections.emptyList();
        this.f11224E = GF0.f3648g;
        this.f11225F = Collections.emptyList();
        this.f11226G = NF0.f7670e;
    }

    public TE0() {
        this.f11237j = -1;
        this.f11239l = -1;
        this.f11242o = -1;
        this.f11249v = -1;
        this.f11220A = -1;
        this.f11223D = -1;
        this.f11227H = (byte) -1;
        this.f11228I = -1;
        this.f11229b = AbstractC0488Hk.f4481a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public TE0(C6392lu c6392lu, C0217DR c0217dr) {
        boolean z;
        this.f11237j = -1;
        this.f11239l = -1;
        this.f11242o = -1;
        this.f11249v = -1;
        this.f11220A = -1;
        this.f11223D = -1;
        this.f11227H = (byte) -1;
        this.f11228I = -1;
        m7648p();
        C0425Gk c0425GkM3571s = AbstractC0488Hk.m3571s();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425GkM3571s, 1);
        boolean z2 = false;
        char c = 0;
        while (true) {
            ?? M25540n = 64;
            if (!z2) {
                try {
                    try {
                        try {
                            int iM22586n = c6392lu.m22586n();
                            switch (iM22586n) {
                                case 0:
                                    z = true;
                                    z2 = true;
                                    c = c;
                                case 8:
                                    z = true;
                                    this.f11230c |= 1;
                                    this.f11231d = c6392lu.m22578f();
                                    c = c;
                                case 16:
                                    int i = (c == true ? 1 : 0) & 32;
                                    char c2 = c;
                                    if (i != 32) {
                                        this.f11236i = new ArrayList();
                                        c2 = (c == true ? 1 : 0) | ' ';
                                    }
                                    this.f11236i.add(Integer.valueOf(c6392lu.m22578f()));
                                    c = c2;
                                    z = true;
                                    c = c;
                                case 18:
                                    int iM22576d = c6392lu.m22576d(c6392lu.m22583k());
                                    int i2 = (c == true ? 1 : 0) & 32;
                                    char c3 = c;
                                    if (i2 != 32) {
                                        c3 = c;
                                        if (c6392lu.m22574b() > 0) {
                                            this.f11236i = new ArrayList();
                                            c3 = (c == true ? 1 : 0) | ' ';
                                        }
                                    }
                                    while (c6392lu.m22574b() > 0) {
                                        this.f11236i.add(Integer.valueOf(c6392lu.m22578f()));
                                    }
                                    c6392lu.m22575c(iM22576d);
                                    c = c3;
                                    z = true;
                                    c = c;
                                case 24:
                                    this.f11230c |= 2;
                                    this.f11232e = c6392lu.m22578f();
                                    c = c;
                                    z = true;
                                    c = c;
                                case 32:
                                    this.f11230c |= 4;
                                    this.f11233f = c6392lu.m22578f();
                                    c = c;
                                    z = true;
                                    c = c;
                                case C5043c9.f31377M /* 42 */:
                                    int i3 = (c == true ? 1 : 0) & 8;
                                    char c4 = c;
                                    if (i3 != 8) {
                                        this.f11234g = new ArrayList();
                                        c4 = (c == true ? 1 : 0) | '\b';
                                    }
                                    this.f11234g.add(c6392lu.m22579g(FF0.f3112n, c0217dr));
                                    c = c4;
                                    z = true;
                                    c = c;
                                case 50:
                                    int i4 = (c == true ? 1 : 0) & 16;
                                    char c5 = c;
                                    if (i4 != 16) {
                                        this.f11235h = new ArrayList();
                                        c5 = (c == true ? 1 : 0) | 16;
                                    }
                                    this.f11235h.add(c6392lu.m22579g(AF0.f124u, c0217dr));
                                    c = c5;
                                    z = true;
                                    c = c;
                                case 56:
                                    int i5 = (c == true ? 1 : 0) & 64;
                                    char c6 = c;
                                    if (i5 != 64) {
                                        this.f11238k = new ArrayList();
                                        c6 = (c == true ? 1 : 0) | '@';
                                    }
                                    this.f11238k.add(Integer.valueOf(c6392lu.m22578f()));
                                    c = c6;
                                    z = true;
                                    c = c;
                                case 58:
                                    int iM22576d2 = c6392lu.m22576d(c6392lu.m22583k());
                                    int i6 = (c == true ? 1 : 0) & 64;
                                    char c7 = c;
                                    if (i6 != 64) {
                                        c7 = c;
                                        if (c6392lu.m22574b() > 0) {
                                            this.f11238k = new ArrayList();
                                            c7 = (c == true ? 1 : 0) | '@';
                                        }
                                    }
                                    while (c6392lu.m22574b() > 0) {
                                        this.f11238k.add(Integer.valueOf(c6392lu.m22578f()));
                                    }
                                    c6392lu.m22575c(iM22576d2);
                                    c = c7;
                                    z = true;
                                    c = c;
                                case 66:
                                    int i7 = (c == true ? 1 : 0) & 512;
                                    char c8 = c;
                                    if (i7 != 512) {
                                        this.f11243p = new ArrayList();
                                        c8 = (c == true ? 1 : 0) | 512;
                                    }
                                    this.f11243p.add(c6392lu.m22579g(VE0.f12451j, c0217dr));
                                    c = c8;
                                    z = true;
                                    c = c;
                                case 74:
                                    int i8 = (c == true ? 1 : 0) & 1024;
                                    char c9 = c;
                                    if (i8 != 1024) {
                                        this.f11244q = new ArrayList();
                                        c9 = (c == true ? 1 : 0) | 1024;
                                    }
                                    this.f11244q.add(c6392lu.m22579g(C9729iF0.f28980v, c0217dr));
                                    c = c9;
                                    z = true;
                                    c = c;
                                case 82:
                                    int i9 = (c == true ? 1 : 0) & 2048;
                                    char c10 = c;
                                    if (i9 != 2048) {
                                        this.f11245r = new ArrayList();
                                        c10 = (c == true ? 1 : 0) | 2048;
                                    }
                                    this.f11245r.add(c6392lu.m22579g(C10753qF0.f40685v, c0217dr));
                                    c = c10;
                                    z = true;
                                    c = c;
                                case 90:
                                    int i10 = (c == true ? 1 : 0) & 4096;
                                    char c11 = c;
                                    if (i10 != 4096) {
                                        this.f11246s = new ArrayList();
                                        c11 = (c == true ? 1 : 0) | 4096;
                                    }
                                    this.f11246s.add(c6392lu.m22579g(CF0.f1269p, c0217dr));
                                    c = c11;
                                    z = true;
                                    c = c;
                                case 106:
                                    int i11 = (c == true ? 1 : 0) & 8192;
                                    char c12 = c;
                                    if (i11 != 8192) {
                                        this.f11247t = new ArrayList();
                                        c12 = (c == true ? 1 : 0) | 8192;
                                    }
                                    this.f11247t.add(c6392lu.m22579g(C9089dF0.f25898h, c0217dr));
                                    c = c12;
                                    z = true;
                                    c = c;
                                case 128:
                                    int i12 = (c == true ? 1 : 0) & 16384;
                                    char c13 = c;
                                    if (i12 != 16384) {
                                        this.f11248u = new ArrayList();
                                        c13 = (c == true ? 1 : 0) | 16384;
                                    }
                                    this.f11248u.add(Integer.valueOf(c6392lu.m22578f()));
                                    c = c13;
                                    z = true;
                                    c = c;
                                case 130:
                                    int iM22576d3 = c6392lu.m22576d(c6392lu.m22583k());
                                    int i13 = (c == true ? 1 : 0) & 16384;
                                    char c14 = c;
                                    if (i13 != 16384) {
                                        c14 = c;
                                        if (c6392lu.m22574b() > 0) {
                                            this.f11248u = new ArrayList();
                                            c14 = (c == true ? 1 : 0) | 16384;
                                        }
                                    }
                                    while (c6392lu.m22574b() > 0) {
                                        this.f11248u.add(Integer.valueOf(c6392lu.m22578f()));
                                    }
                                    c6392lu.m22575c(iM22576d3);
                                    c = c14;
                                    z = true;
                                    c = c;
                                case ModuleDescriptor.MODULE_VERSION /* 136 */:
                                    this.f11230c |= 8;
                                    this.f11250w = c6392lu.m22578f();
                                    c = c;
                                    z = true;
                                    c = c;
                                case 146:
                                    C11901zF0 c11901zF0Mo130d = (this.f11230c & 16) == 16 ? this.f11251x.mo130d() : null;
                                    AF0 af0 = (AF0) c6392lu.m22579g(AF0.f124u, c0217dr);
                                    this.f11251x = af0;
                                    if (c11901zF0Mo130d != null) {
                                        c11901zF0Mo130d.m26352n(af0);
                                        this.f11251x = c11901zF0Mo130d.m26351l();
                                    }
                                    this.f11230c |= 16;
                                    c = c;
                                    z = true;
                                    c = c;
                                case 152:
                                    this.f11230c |= 32;
                                    this.f11252y = c6392lu.m22578f();
                                    c = c;
                                    z = true;
                                    c = c;
                                case 162:
                                    int i14 = (c == true ? 1 : 0) & 128;
                                    char c15 = c;
                                    if (i14 != 128) {
                                        this.f11240m = new ArrayList();
                                        c15 = (c == true ? 1 : 0) | 128;
                                    }
                                    this.f11240m.add(c6392lu.m22579g(AF0.f124u, c0217dr));
                                    c = c15;
                                    z = true;
                                    c = c;
                                case 168:
                                    int i15 = (c == true ? 1 : 0) & 256;
                                    char c16 = c;
                                    if (i15 != 256) {
                                        this.f11241n = new ArrayList();
                                        c16 = (c == true ? 1 : 0) | 256;
                                    }
                                    this.f11241n.add(Integer.valueOf(c6392lu.m22578f()));
                                    c = c16;
                                    z = true;
                                    c = c;
                                case 170:
                                    int iM22576d4 = c6392lu.m22576d(c6392lu.m22583k());
                                    int i16 = (c == true ? 1 : 0) & 256;
                                    char c17 = c;
                                    if (i16 != 256) {
                                        c17 = c;
                                        if (c6392lu.m22574b() > 0) {
                                            this.f11241n = new ArrayList();
                                            c17 = (c == true ? 1 : 0) | 256;
                                        }
                                    }
                                    while (c6392lu.m22574b() > 0) {
                                        this.f11241n.add(Integer.valueOf(c6392lu.m22578f()));
                                    }
                                    c6392lu.m22575c(iM22576d4);
                                    c = c17;
                                    z = true;
                                    c = c;
                                case 176:
                                    int i17 = (c == true ? 1 : 0) & 262144;
                                    char c18 = c;
                                    if (i17 != 262144) {
                                        this.f11253z = new ArrayList();
                                        c18 = (c == true ? 1 : 0) | 0;
                                    }
                                    this.f11253z.add(Integer.valueOf(c6392lu.m22578f()));
                                    c = c18;
                                    z = true;
                                    c = c;
                                case 178:
                                    int iM22576d5 = c6392lu.m22576d(c6392lu.m22583k());
                                    int i18 = (c == true ? 1 : 0) & 262144;
                                    char c19 = c;
                                    if (i18 != 262144) {
                                        c19 = c;
                                        if (c6392lu.m22574b() > 0) {
                                            this.f11253z = new ArrayList();
                                            c19 = (c == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (c6392lu.m22574b() > 0) {
                                        this.f11253z.add(Integer.valueOf(c6392lu.m22578f()));
                                    }
                                    c6392lu.m22575c(iM22576d5);
                                    c = c19;
                                    z = true;
                                    c = c;
                                case 186:
                                    int i19 = (c == true ? 1 : 0) & 524288;
                                    char c20 = c;
                                    if (i19 != 524288) {
                                        this.f11221B = new ArrayList();
                                        c20 = (c == true ? 1 : 0) | 0;
                                    }
                                    this.f11221B.add(c6392lu.m22579g(AF0.f124u, c0217dr));
                                    c = c20;
                                    z = true;
                                    c = c;
                                case 192:
                                    int i20 = (c == true ? 1 : 0) & 1048576;
                                    char c21 = c;
                                    if (i20 != 1048576) {
                                        this.f11222C = new ArrayList();
                                        c21 = (c == true ? 1 : 0) | 0;
                                    }
                                    this.f11222C.add(Integer.valueOf(c6392lu.m22578f()));
                                    c = c21;
                                    z = true;
                                    c = c;
                                case 194:
                                    int iM22576d6 = c6392lu.m22576d(c6392lu.m22583k());
                                    int i21 = (c == true ? 1 : 0) & 1048576;
                                    char c22 = c;
                                    if (i21 != 1048576) {
                                        c22 = c;
                                        if (c6392lu.m22574b() > 0) {
                                            this.f11222C = new ArrayList();
                                            c22 = (c == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (c6392lu.m22574b() > 0) {
                                        this.f11222C.add(Integer.valueOf(c6392lu.m22578f()));
                                    }
                                    c6392lu.m22575c(iM22576d6);
                                    c = c22;
                                    z = true;
                                    c = c;
                                case 242:
                                    PE0 pe0M3017j = (this.f11230c & 64) == 64 ? this.f11224E.m3017j() : null;
                                    GF0 gf0 = (GF0) c6392lu.m22579g(GF0.f3649h, c0217dr);
                                    this.f11224E = gf0;
                                    if (pe0M3017j != null) {
                                        pe0M3017j.m6278q(gf0);
                                        this.f11224E = pe0M3017j.m6275m();
                                    }
                                    this.f11230c |= 64;
                                    c = c;
                                    z = true;
                                    c = c;
                                case 248:
                                    int i22 = (c == true ? 1 : 0) & 4194304;
                                    char c23 = c;
                                    if (i22 != 4194304) {
                                        this.f11225F = new ArrayList();
                                        c23 = (c == true ? 1 : 0) | 0;
                                    }
                                    this.f11225F.add(Integer.valueOf(c6392lu.m22578f()));
                                    c = c23;
                                    z = true;
                                    c = c;
                                case 250:
                                    int iM22576d7 = c6392lu.m22576d(c6392lu.m22583k());
                                    int i23 = (c == true ? 1 : 0) & 4194304;
                                    char c24 = c;
                                    if (i23 != 4194304) {
                                        c24 = c;
                                        if (c6392lu.m22574b() > 0) {
                                            this.f11225F = new ArrayList();
                                            c24 = (c == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (c6392lu.m22574b() > 0) {
                                        this.f11225F.add(Integer.valueOf(c6392lu.m22578f()));
                                    }
                                    c6392lu.m22575c(iM22576d7);
                                    c = c24;
                                    z = true;
                                    c = c;
                                case 258:
                                    WE0 we0M5613i = (this.f11230c & 128) == 128 ? this.f11226G.m5613i() : null;
                                    NF0 nf0 = (NF0) c6392lu.m22579g(NF0.f7671f, c0217dr);
                                    this.f11226G = nf0;
                                    if (we0M5613i != null) {
                                        we0M5613i.m8716r(nf0);
                                        this.f11226G = we0M5613i.m8712n();
                                    }
                                    this.f11230c |= 128;
                                    c = c;
                                    z = true;
                                    c = c;
                                default:
                                    M25540n = m25540n(c6392lu, c0577j9M4212n, c0217dr, iM22586n);
                                    c = c;
                                    if (M25540n == 0) {
                                        z2 = true;
                                        c = c;
                                    }
                                    z = true;
                                    c = c;
                            }
                        } catch (IOException e) {
                            Y90 y90 = new Y90(e.getMessage());
                            y90.f14178a = this;
                            throw y90;
                        }
                    } catch (Y90 e2) {
                        e2.f14178a = this;
                        throw e2;
                    }
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.f11236i = Collections.unmodifiableList(this.f11236i);
                    }
                    if (((c == true ? 1 : 0) & 8) == 8) {
                        this.f11234g = Collections.unmodifiableList(this.f11234g);
                    }
                    if (((c == true ? 1 : 0) & 16) == 16) {
                        this.f11235h = Collections.unmodifiableList(this.f11235h);
                    }
                    if (((c == true ? 1 : 0) & 64) == M25540n) {
                        this.f11238k = Collections.unmodifiableList(this.f11238k);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.f11243p = Collections.unmodifiableList(this.f11243p);
                    }
                    if (((c == true ? 1 : 0) & 1024) == 1024) {
                        this.f11244q = Collections.unmodifiableList(this.f11244q);
                    }
                    if (((c == true ? 1 : 0) & 2048) == 2048) {
                        this.f11245r = Collections.unmodifiableList(this.f11245r);
                    }
                    if (((c == true ? 1 : 0) & 4096) == 4096) {
                        this.f11246s = Collections.unmodifiableList(this.f11246s);
                    }
                    if (((c == true ? 1 : 0) & 8192) == 8192) {
                        this.f11247t = Collections.unmodifiableList(this.f11247t);
                    }
                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                        this.f11248u = Collections.unmodifiableList(this.f11248u);
                    }
                    if (((c == true ? 1 : 0) & 128) == 128) {
                        this.f11240m = Collections.unmodifiableList(this.f11240m);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.f11241n = Collections.unmodifiableList(this.f11241n);
                    }
                    if (((c == true ? 1 : 0) & 262144) == 262144) {
                        this.f11253z = Collections.unmodifiableList(this.f11253z);
                    }
                    if (((c == true ? 1 : 0) & 524288) == 524288) {
                        this.f11221B = Collections.unmodifiableList(this.f11221B);
                    }
                    if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                        this.f11222C = Collections.unmodifiableList(this.f11222C);
                    }
                    if (((c == true ? 1 : 0) & 4194304) == 4194304) {
                        this.f11225F = Collections.unmodifiableList(this.f11225F);
                    }
                    try {
                        c0577j9M4212n.m4224m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f11229b = c0425GkM3571s.m3146n();
                        throw th2;
                    }
                    this.f11229b = c0425GkM3571s.m3146n();
                    m25539m();
                    throw th;
                }
            } else {
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.f11236i = Collections.unmodifiableList(this.f11236i);
                }
                if (((c == true ? 1 : 0) & 8) == 8) {
                    this.f11234g = Collections.unmodifiableList(this.f11234g);
                }
                if (((c == true ? 1 : 0) & 16) == 16) {
                    this.f11235h = Collections.unmodifiableList(this.f11235h);
                }
                if (((c == true ? 1 : 0) & 64) == 64) {
                    this.f11238k = Collections.unmodifiableList(this.f11238k);
                }
                if (((c == true ? 1 : 0) & 512) == 512) {
                    this.f11243p = Collections.unmodifiableList(this.f11243p);
                }
                if (((c == true ? 1 : 0) & 1024) == 1024) {
                    this.f11244q = Collections.unmodifiableList(this.f11244q);
                }
                if (((c == true ? 1 : 0) & 2048) == 2048) {
                    this.f11245r = Collections.unmodifiableList(this.f11245r);
                }
                if (((c == true ? 1 : 0) & 4096) == 4096) {
                    this.f11246s = Collections.unmodifiableList(this.f11246s);
                }
                if (((c == true ? 1 : 0) & 8192) == 8192) {
                    this.f11247t = Collections.unmodifiableList(this.f11247t);
                }
                if (((c == true ? 1 : 0) & 16384) == 16384) {
                    this.f11248u = Collections.unmodifiableList(this.f11248u);
                }
                if (((c == true ? 1 : 0) & 128) == 128) {
                    this.f11240m = Collections.unmodifiableList(this.f11240m);
                }
                if (((c == true ? 1 : 0) & 256) == 256) {
                    this.f11241n = Collections.unmodifiableList(this.f11241n);
                }
                if (((c == true ? 1 : 0) & 262144) == 262144) {
                    this.f11253z = Collections.unmodifiableList(this.f11253z);
                }
                if (((c == true ? 1 : 0) & 524288) == 524288) {
                    this.f11221B = Collections.unmodifiableList(this.f11221B);
                }
                if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                    this.f11222C = Collections.unmodifiableList(this.f11222C);
                }
                if (((c == true ? 1 : 0) & 4194304) == 4194304) {
                    this.f11225F = Collections.unmodifiableList(this.f11225F);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f11229b = c0425GkM3571s.m3146n();
                    throw th3;
                }
                this.f11229b = c0425GkM3571s.m3146n();
                m25539m();
                return;
            }
        }
    }
}
