package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class TE0 extends AbstractC7709w00 {
    public static final TE0 J;
    public static final C8019xd0 K = new C8019xd0(8);
    public int A;
    public List B;
    public List C;
    public int D;
    public GF0 E;
    public List F;
    public NF0 G;
    public byte H;
    public int I;
    public final AbstractC0596Hk b;
    public int c;
    public int d;
    public int e;
    public int f;
    public List g;
    public List h;
    public List i;
    public int j;
    public List k;
    public int l;
    public List m;
    public List n;
    public int o;
    public List p;
    public List q;
    public List r;
    public List s;
    public List t;
    public List u;
    public int v;
    public int w;
    public AF0 x;
    public int y;
    public List z;

    static {
        TE0 te0 = new TE0();
        J = te0;
        te0.p();
    }

    public TE0(RE0 re0) {
        super(re0);
        this.j = -1;
        this.l = -1;
        this.o = -1;
        this.v = -1;
        this.A = -1;
        this.D = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.b = re0.a;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final K0 a() {
        return J;
    }

    @Override // defpackage.K0
    public final int b() {
        int i = this.I;
        if (i != -1) {
            return i;
        }
        int iE = (this.c & 1) == 1 ? J9.e(1, this.d) : 0;
        int iF = 0;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            iF += J9.f(((Integer) this.i.get(i2)).intValue());
        }
        int iG = iE + iF;
        if (!this.i.isEmpty()) {
            iG = iG + 1 + J9.f(iF);
        }
        this.j = iF;
        if ((this.c & 2) == 2) {
            iG += J9.e(3, this.e);
        }
        if ((this.c & 4) == 4) {
            iG += J9.e(4, this.f);
        }
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            iG += J9.g(5, (K0) this.g.get(i3));
        }
        for (int i4 = 0; i4 < this.h.size(); i4++) {
            iG += J9.g(6, (K0) this.h.get(i4));
        }
        int iF2 = 0;
        for (int i5 = 0; i5 < this.k.size(); i5++) {
            iF2 += J9.f(((Integer) this.k.get(i5)).intValue());
        }
        int iG2 = iG + iF2;
        if (!this.k.isEmpty()) {
            iG2 = iG2 + 1 + J9.f(iF2);
        }
        this.l = iF2;
        for (int i6 = 0; i6 < this.p.size(); i6++) {
            iG2 += J9.g(8, (K0) this.p.get(i6));
        }
        for (int i7 = 0; i7 < this.q.size(); i7++) {
            iG2 += J9.g(9, (K0) this.q.get(i7));
        }
        for (int i8 = 0; i8 < this.r.size(); i8++) {
            iG2 += J9.g(10, (K0) this.r.get(i8));
        }
        for (int i9 = 0; i9 < this.s.size(); i9++) {
            iG2 += J9.g(11, (K0) this.s.get(i9));
        }
        for (int i10 = 0; i10 < this.t.size(); i10++) {
            iG2 += J9.g(13, (K0) this.t.get(i10));
        }
        int iF3 = 0;
        for (int i11 = 0; i11 < this.u.size(); i11++) {
            iF3 += J9.f(((Integer) this.u.get(i11)).intValue());
        }
        int iG3 = iG2 + iF3;
        if (!this.u.isEmpty()) {
            iG3 = iG3 + 2 + J9.f(iF3);
        }
        this.v = iF3;
        if ((this.c & 8) == 8) {
            iG3 += J9.e(17, this.w);
        }
        if ((this.c & 16) == 16) {
            iG3 += J9.g(18, this.x);
        }
        if ((this.c & 32) == 32) {
            iG3 += J9.e(19, this.y);
        }
        for (int i12 = 0; i12 < this.m.size(); i12++) {
            iG3 += J9.g(20, (K0) this.m.get(i12));
        }
        int iF4 = 0;
        for (int i13 = 0; i13 < this.n.size(); i13++) {
            iF4 += J9.f(((Integer) this.n.get(i13)).intValue());
        }
        int iF5 = iG3 + iF4;
        if (!this.n.isEmpty()) {
            iF5 = iF5 + 2 + J9.f(iF4);
        }
        this.o = iF4;
        int iF6 = 0;
        for (int i14 = 0; i14 < this.z.size(); i14++) {
            iF6 += J9.f(((Integer) this.z.get(i14)).intValue());
        }
        int iG4 = iF5 + iF6;
        if (!this.z.isEmpty()) {
            iG4 = iG4 + 2 + J9.f(iF6);
        }
        this.A = iF6;
        for (int i15 = 0; i15 < this.B.size(); i15++) {
            iG4 += J9.g(23, (K0) this.B.get(i15));
        }
        int iF7 = 0;
        for (int i16 = 0; i16 < this.C.size(); i16++) {
            iF7 += J9.f(((Integer) this.C.get(i16)).intValue());
        }
        int iG5 = iG4 + iF7;
        if (!this.C.isEmpty()) {
            iG5 = iG5 + 2 + J9.f(iF7);
        }
        this.D = iF7;
        if ((this.c & 64) == 64) {
            iG5 += J9.g(30, this.E);
        }
        int iF8 = 0;
        for (int i17 = 0; i17 < this.F.size(); i17++) {
            iF8 += J9.f(((Integer) this.F.get(i17)).intValue());
        }
        int size = (this.F.size() * 2) + iG5 + iF8;
        if ((this.c & 128) == 128) {
            size += J9.g(32, this.G);
        }
        int size2 = this.b.size() + j() + size;
        this.I = size2;
        return size2;
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 c() {
        return RE0.m();
    }

    @Override // defpackage.K0
    public final AbstractC6754r00 d() {
        RE0 re0M = RE0.m();
        re0M.n(this);
        return re0M;
    }

    @Override // defpackage.InterfaceC6917rr0
    public final boolean e() {
        byte b = this.H;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.c & 2) != 2) {
            this.H = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            if (!((FF0) this.g.get(i)).e()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (!((AF0) this.h.get(i2)).e()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            if (!((AF0) this.m.get(i3)).e()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.p.size(); i4++) {
            if (!((VE0) this.p.get(i4)).e()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.q.size(); i5++) {
            if (!((C4309iF0) this.q.get(i5)).e()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.r.size(); i6++) {
            if (!((C6613qF0) this.r.get(i6)).e()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.s.size(); i7++) {
            if (!((CF0) this.s.get(i7)).e()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.t.size(); i8++) {
            if (!((C3355dF0) this.t.get(i8)).e()) {
                this.H = (byte) 0;
                return false;
            }
        }
        if ((this.c & 16) == 16 && !this.x.e()) {
            this.H = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.B.size(); i9++) {
            if (!((AF0) this.B.get(i9)).e()) {
                this.H = (byte) 0;
                return false;
            }
        }
        if ((this.c & 64) == 64 && !this.E.e()) {
            this.H = (byte) 0;
            return false;
        }
        if (i()) {
            this.H = (byte) 1;
            return true;
        }
        this.H = (byte) 0;
        return false;
    }

    @Override // defpackage.K0
    public final void f(J9 j9) throws IOException {
        b();
        C3383dO1 c3383dO1 = new C3383dO1(this);
        if ((this.c & 1) == 1) {
            j9.w(1, this.d);
        }
        if (this.i.size() > 0) {
            j9.F(18);
            j9.F(this.j);
        }
        for (int i = 0; i < this.i.size(); i++) {
            j9.x(((Integer) this.i.get(i)).intValue());
        }
        if ((this.c & 2) == 2) {
            j9.w(3, this.e);
        }
        if ((this.c & 4) == 4) {
            j9.w(4, this.f);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            j9.y(5, (K0) this.g.get(i2));
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            j9.y(6, (K0) this.h.get(i3));
        }
        if (this.k.size() > 0) {
            j9.F(58);
            j9.F(this.l);
        }
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            j9.x(((Integer) this.k.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.p.size(); i5++) {
            j9.y(8, (K0) this.p.get(i5));
        }
        for (int i6 = 0; i6 < this.q.size(); i6++) {
            j9.y(9, (K0) this.q.get(i6));
        }
        for (int i7 = 0; i7 < this.r.size(); i7++) {
            j9.y(10, (K0) this.r.get(i7));
        }
        for (int i8 = 0; i8 < this.s.size(); i8++) {
            j9.y(11, (K0) this.s.get(i8));
        }
        for (int i9 = 0; i9 < this.t.size(); i9++) {
            j9.y(13, (K0) this.t.get(i9));
        }
        if (this.u.size() > 0) {
            j9.F(130);
            j9.F(this.v);
        }
        for (int i10 = 0; i10 < this.u.size(); i10++) {
            j9.x(((Integer) this.u.get(i10)).intValue());
        }
        if ((this.c & 8) == 8) {
            j9.w(17, this.w);
        }
        if ((this.c & 16) == 16) {
            j9.y(18, this.x);
        }
        if ((this.c & 32) == 32) {
            j9.w(19, this.y);
        }
        for (int i11 = 0; i11 < this.m.size(); i11++) {
            j9.y(20, (K0) this.m.get(i11));
        }
        if (this.n.size() > 0) {
            j9.F(170);
            j9.F(this.o);
        }
        for (int i12 = 0; i12 < this.n.size(); i12++) {
            j9.x(((Integer) this.n.get(i12)).intValue());
        }
        if (this.z.size() > 0) {
            j9.F(178);
            j9.F(this.A);
        }
        for (int i13 = 0; i13 < this.z.size(); i13++) {
            j9.x(((Integer) this.z.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.B.size(); i14++) {
            j9.y(23, (K0) this.B.get(i14));
        }
        if (this.C.size() > 0) {
            j9.F(194);
            j9.F(this.D);
        }
        for (int i15 = 0; i15 < this.C.size(); i15++) {
            j9.x(((Integer) this.C.get(i15)).intValue());
        }
        if ((this.c & 64) == 64) {
            j9.y(30, this.E);
        }
        for (int i16 = 0; i16 < this.F.size(); i16++) {
            j9.w(31, ((Integer) this.F.get(i16)).intValue());
        }
        if ((this.c & 128) == 128) {
            j9.y(32, this.G);
        }
        c3383dO1.K(19000, j9);
        j9.B(this.b);
    }

    public final void p() {
        this.d = 6;
        this.e = 0;
        this.f = 0;
        this.g = Collections.emptyList();
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        this.k = Collections.emptyList();
        this.m = Collections.emptyList();
        this.n = Collections.emptyList();
        this.p = Collections.emptyList();
        this.q = Collections.emptyList();
        this.r = Collections.emptyList();
        this.s = Collections.emptyList();
        this.t = Collections.emptyList();
        this.u = Collections.emptyList();
        this.w = 0;
        this.x = AF0.t;
        this.y = 0;
        this.z = Collections.emptyList();
        this.B = Collections.emptyList();
        this.C = Collections.emptyList();
        this.E = GF0.g;
        this.F = Collections.emptyList();
        this.G = NF0.e;
    }

    public TE0() {
        this.j = -1;
        this.l = -1;
        this.o = -1;
        this.v = -1;
        this.A = -1;
        this.D = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.b = AbstractC0596Hk.a;
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
    public TE0(C5780lu c5780lu, DR dr) {
        boolean z;
        this.j = -1;
        this.l = -1;
        this.o = -1;
        this.v = -1;
        this.A = -1;
        this.D = -1;
        this.H = (byte) -1;
        this.I = -1;
        p();
        C0518Gk c0518GkS = AbstractC0596Hk.s();
        J9 j9N = J9.n(c0518GkS, 1);
        boolean z2 = false;
        char c = 0;
        while (true) {
            ?? N = 64;
            if (!z2) {
                try {
                    try {
                        try {
                            int iN = c5780lu.n();
                            switch (iN) {
                                case 0:
                                    z = true;
                                    z2 = true;
                                    c = c;
                                case 8:
                                    z = true;
                                    this.c |= 1;
                                    this.d = c5780lu.f();
                                    c = c;
                                case 16:
                                    int i = (c == true ? 1 : 0) & 32;
                                    char c2 = c;
                                    if (i != 32) {
                                        this.i = new ArrayList();
                                        c2 = (c == true ? 1 : 0) | ' ';
                                    }
                                    this.i.add(Integer.valueOf(c5780lu.f()));
                                    c = c2;
                                    z = true;
                                    c = c;
                                case 18:
                                    int iD = c5780lu.d(c5780lu.k());
                                    int i2 = (c == true ? 1 : 0) & 32;
                                    char c3 = c;
                                    if (i2 != 32) {
                                        c3 = c;
                                        if (c5780lu.b() > 0) {
                                            this.i = new ArrayList();
                                            c3 = (c == true ? 1 : 0) | ' ';
                                        }
                                    }
                                    while (c5780lu.b() > 0) {
                                        this.i.add(Integer.valueOf(c5780lu.f()));
                                    }
                                    c5780lu.c(iD);
                                    c = c3;
                                    z = true;
                                    c = c;
                                case 24:
                                    this.c |= 2;
                                    this.e = c5780lu.f();
                                    c = c;
                                    z = true;
                                    c = c;
                                case 32:
                                    this.c |= 4;
                                    this.f = c5780lu.f();
                                    c = c;
                                    z = true;
                                    c = c;
                                case C4473c9.M /* 42 */:
                                    int i3 = (c == true ? 1 : 0) & 8;
                                    char c4 = c;
                                    if (i3 != 8) {
                                        this.g = new ArrayList();
                                        c4 = (c == true ? 1 : 0) | '\b';
                                    }
                                    this.g.add(c5780lu.g(FF0.n, dr));
                                    c = c4;
                                    z = true;
                                    c = c;
                                case 50:
                                    int i4 = (c == true ? 1 : 0) & 16;
                                    char c5 = c;
                                    if (i4 != 16) {
                                        this.h = new ArrayList();
                                        c5 = (c == true ? 1 : 0) | 16;
                                    }
                                    this.h.add(c5780lu.g(AF0.u, dr));
                                    c = c5;
                                    z = true;
                                    c = c;
                                case 56:
                                    int i5 = (c == true ? 1 : 0) & 64;
                                    char c6 = c;
                                    if (i5 != 64) {
                                        this.k = new ArrayList();
                                        c6 = (c == true ? 1 : 0) | '@';
                                    }
                                    this.k.add(Integer.valueOf(c5780lu.f()));
                                    c = c6;
                                    z = true;
                                    c = c;
                                case 58:
                                    int iD2 = c5780lu.d(c5780lu.k());
                                    int i6 = (c == true ? 1 : 0) & 64;
                                    char c7 = c;
                                    if (i6 != 64) {
                                        c7 = c;
                                        if (c5780lu.b() > 0) {
                                            this.k = new ArrayList();
                                            c7 = (c == true ? 1 : 0) | '@';
                                        }
                                    }
                                    while (c5780lu.b() > 0) {
                                        this.k.add(Integer.valueOf(c5780lu.f()));
                                    }
                                    c5780lu.c(iD2);
                                    c = c7;
                                    z = true;
                                    c = c;
                                case 66:
                                    int i7 = (c == true ? 1 : 0) & 512;
                                    char c8 = c;
                                    if (i7 != 512) {
                                        this.p = new ArrayList();
                                        c8 = (c == true ? 1 : 0) | 512;
                                    }
                                    this.p.add(c5780lu.g(VE0.j, dr));
                                    c = c8;
                                    z = true;
                                    c = c;
                                case 74:
                                    int i8 = (c == true ? 1 : 0) & 1024;
                                    char c9 = c;
                                    if (i8 != 1024) {
                                        this.q = new ArrayList();
                                        c9 = (c == true ? 1 : 0) | 1024;
                                    }
                                    this.q.add(c5780lu.g(C4309iF0.v, dr));
                                    c = c9;
                                    z = true;
                                    c = c;
                                case 82:
                                    int i9 = (c == true ? 1 : 0) & 2048;
                                    char c10 = c;
                                    if (i9 != 2048) {
                                        this.r = new ArrayList();
                                        c10 = (c == true ? 1 : 0) | 2048;
                                    }
                                    this.r.add(c5780lu.g(C6613qF0.v, dr));
                                    c = c10;
                                    z = true;
                                    c = c;
                                case 90:
                                    int i10 = (c == true ? 1 : 0) & 4096;
                                    char c11 = c;
                                    if (i10 != 4096) {
                                        this.s = new ArrayList();
                                        c11 = (c == true ? 1 : 0) | 4096;
                                    }
                                    this.s.add(c5780lu.g(CF0.p, dr));
                                    c = c11;
                                    z = true;
                                    c = c;
                                case 106:
                                    int i11 = (c == true ? 1 : 0) & 8192;
                                    char c12 = c;
                                    if (i11 != 8192) {
                                        this.t = new ArrayList();
                                        c12 = (c == true ? 1 : 0) | 8192;
                                    }
                                    this.t.add(c5780lu.g(C3355dF0.h, dr));
                                    c = c12;
                                    z = true;
                                    c = c;
                                case 128:
                                    int i12 = (c == true ? 1 : 0) & 16384;
                                    char c13 = c;
                                    if (i12 != 16384) {
                                        this.u = new ArrayList();
                                        c13 = (c == true ? 1 : 0) | 16384;
                                    }
                                    this.u.add(Integer.valueOf(c5780lu.f()));
                                    c = c13;
                                    z = true;
                                    c = c;
                                case 130:
                                    int iD3 = c5780lu.d(c5780lu.k());
                                    int i13 = (c == true ? 1 : 0) & 16384;
                                    char c14 = c;
                                    if (i13 != 16384) {
                                        c14 = c;
                                        if (c5780lu.b() > 0) {
                                            this.u = new ArrayList();
                                            c14 = (c == true ? 1 : 0) | 16384;
                                        }
                                    }
                                    while (c5780lu.b() > 0) {
                                        this.u.add(Integer.valueOf(c5780lu.f()));
                                    }
                                    c5780lu.c(iD3);
                                    c = c14;
                                    z = true;
                                    c = c;
                                case ModuleDescriptor.MODULE_VERSION /* 136 */:
                                    this.c |= 8;
                                    this.w = c5780lu.f();
                                    c = c;
                                    z = true;
                                    c = c;
                                case 146:
                                    C8327zF0 c8327zF0D = (this.c & 16) == 16 ? this.x.d() : null;
                                    AF0 af0 = (AF0) c5780lu.g(AF0.u, dr);
                                    this.x = af0;
                                    if (c8327zF0D != null) {
                                        c8327zF0D.n(af0);
                                        this.x = c8327zF0D.l();
                                    }
                                    this.c |= 16;
                                    c = c;
                                    z = true;
                                    c = c;
                                case 152:
                                    this.c |= 32;
                                    this.y = c5780lu.f();
                                    c = c;
                                    z = true;
                                    c = c;
                                case 162:
                                    int i14 = (c == true ? 1 : 0) & 128;
                                    char c15 = c;
                                    if (i14 != 128) {
                                        this.m = new ArrayList();
                                        c15 = (c == true ? 1 : 0) | 128;
                                    }
                                    this.m.add(c5780lu.g(AF0.u, dr));
                                    c = c15;
                                    z = true;
                                    c = c;
                                case 168:
                                    int i15 = (c == true ? 1 : 0) & 256;
                                    char c16 = c;
                                    if (i15 != 256) {
                                        this.n = new ArrayList();
                                        c16 = (c == true ? 1 : 0) | 256;
                                    }
                                    this.n.add(Integer.valueOf(c5780lu.f()));
                                    c = c16;
                                    z = true;
                                    c = c;
                                case 170:
                                    int iD4 = c5780lu.d(c5780lu.k());
                                    int i16 = (c == true ? 1 : 0) & 256;
                                    char c17 = c;
                                    if (i16 != 256) {
                                        c17 = c;
                                        if (c5780lu.b() > 0) {
                                            this.n = new ArrayList();
                                            c17 = (c == true ? 1 : 0) | 256;
                                        }
                                    }
                                    while (c5780lu.b() > 0) {
                                        this.n.add(Integer.valueOf(c5780lu.f()));
                                    }
                                    c5780lu.c(iD4);
                                    c = c17;
                                    z = true;
                                    c = c;
                                case 176:
                                    int i17 = (c == true ? 1 : 0) & 262144;
                                    char c18 = c;
                                    if (i17 != 262144) {
                                        this.z = new ArrayList();
                                        c18 = (c == true ? 1 : 0) | 0;
                                    }
                                    this.z.add(Integer.valueOf(c5780lu.f()));
                                    c = c18;
                                    z = true;
                                    c = c;
                                case 178:
                                    int iD5 = c5780lu.d(c5780lu.k());
                                    int i18 = (c == true ? 1 : 0) & 262144;
                                    char c19 = c;
                                    if (i18 != 262144) {
                                        c19 = c;
                                        if (c5780lu.b() > 0) {
                                            this.z = new ArrayList();
                                            c19 = (c == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (c5780lu.b() > 0) {
                                        this.z.add(Integer.valueOf(c5780lu.f()));
                                    }
                                    c5780lu.c(iD5);
                                    c = c19;
                                    z = true;
                                    c = c;
                                case 186:
                                    int i19 = (c == true ? 1 : 0) & 524288;
                                    char c20 = c;
                                    if (i19 != 524288) {
                                        this.B = new ArrayList();
                                        c20 = (c == true ? 1 : 0) | 0;
                                    }
                                    this.B.add(c5780lu.g(AF0.u, dr));
                                    c = c20;
                                    z = true;
                                    c = c;
                                case 192:
                                    int i20 = (c == true ? 1 : 0) & 1048576;
                                    char c21 = c;
                                    if (i20 != 1048576) {
                                        this.C = new ArrayList();
                                        c21 = (c == true ? 1 : 0) | 0;
                                    }
                                    this.C.add(Integer.valueOf(c5780lu.f()));
                                    c = c21;
                                    z = true;
                                    c = c;
                                case 194:
                                    int iD6 = c5780lu.d(c5780lu.k());
                                    int i21 = (c == true ? 1 : 0) & 1048576;
                                    char c22 = c;
                                    if (i21 != 1048576) {
                                        c22 = c;
                                        if (c5780lu.b() > 0) {
                                            this.C = new ArrayList();
                                            c22 = (c == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (c5780lu.b() > 0) {
                                        this.C.add(Integer.valueOf(c5780lu.f()));
                                    }
                                    c5780lu.c(iD6);
                                    c = c22;
                                    z = true;
                                    c = c;
                                case 242:
                                    PE0 pe0J = (this.c & 64) == 64 ? this.E.j() : null;
                                    GF0 gf0 = (GF0) c5780lu.g(GF0.h, dr);
                                    this.E = gf0;
                                    if (pe0J != null) {
                                        pe0J.q(gf0);
                                        this.E = pe0J.m();
                                    }
                                    this.c |= 64;
                                    c = c;
                                    z = true;
                                    c = c;
                                case 248:
                                    int i22 = (c == true ? 1 : 0) & 4194304;
                                    char c23 = c;
                                    if (i22 != 4194304) {
                                        this.F = new ArrayList();
                                        c23 = (c == true ? 1 : 0) | 0;
                                    }
                                    this.F.add(Integer.valueOf(c5780lu.f()));
                                    c = c23;
                                    z = true;
                                    c = c;
                                case 250:
                                    int iD7 = c5780lu.d(c5780lu.k());
                                    int i23 = (c == true ? 1 : 0) & 4194304;
                                    char c24 = c;
                                    if (i23 != 4194304) {
                                        c24 = c;
                                        if (c5780lu.b() > 0) {
                                            this.F = new ArrayList();
                                            c24 = (c == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (c5780lu.b() > 0) {
                                        this.F.add(Integer.valueOf(c5780lu.f()));
                                    }
                                    c5780lu.c(iD7);
                                    c = c24;
                                    z = true;
                                    c = c;
                                case 258:
                                    WE0 we0I = (this.c & 128) == 128 ? this.G.i() : null;
                                    NF0 nf0 = (NF0) c5780lu.g(NF0.f, dr);
                                    this.G = nf0;
                                    if (we0I != null) {
                                        we0I.r(nf0);
                                        this.G = we0I.n();
                                    }
                                    this.c |= 128;
                                    c = c;
                                    z = true;
                                    c = c;
                                default:
                                    N = n(c5780lu, j9N, dr, iN);
                                    c = c;
                                    if (N == 0) {
                                        z2 = true;
                                        c = c;
                                    }
                                    z = true;
                                    c = c;
                            }
                        } catch (IOException e) {
                            Y90 y90 = new Y90(e.getMessage());
                            y90.a = this;
                            throw y90;
                        }
                    } catch (Y90 e2) {
                        e2.a = this;
                        throw e2;
                    }
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if (((c == true ? 1 : 0) & 8) == 8) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    if (((c == true ? 1 : 0) & 16) == 16) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if (((c == true ? 1 : 0) & 64) == N) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.p = Collections.unmodifiableList(this.p);
                    }
                    if (((c == true ? 1 : 0) & 1024) == 1024) {
                        this.q = Collections.unmodifiableList(this.q);
                    }
                    if (((c == true ? 1 : 0) & 2048) == 2048) {
                        this.r = Collections.unmodifiableList(this.r);
                    }
                    if (((c == true ? 1 : 0) & 4096) == 4096) {
                        this.s = Collections.unmodifiableList(this.s);
                    }
                    if (((c == true ? 1 : 0) & 8192) == 8192) {
                        this.t = Collections.unmodifiableList(this.t);
                    }
                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                        this.u = Collections.unmodifiableList(this.u);
                    }
                    if (((c == true ? 1 : 0) & 128) == 128) {
                        this.m = Collections.unmodifiableList(this.m);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.n = Collections.unmodifiableList(this.n);
                    }
                    if (((c == true ? 1 : 0) & 262144) == 262144) {
                        this.z = Collections.unmodifiableList(this.z);
                    }
                    if (((c == true ? 1 : 0) & 524288) == 524288) {
                        this.B = Collections.unmodifiableList(this.B);
                    }
                    if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                        this.C = Collections.unmodifiableList(this.C);
                    }
                    if (((c == true ? 1 : 0) & 4194304) == 4194304) {
                        this.F = Collections.unmodifiableList(this.F);
                    }
                    try {
                        j9N.m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.b = c0518GkS.n();
                        throw th2;
                    }
                    this.b = c0518GkS.n();
                    m();
                    throw th;
                }
            } else {
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if (((c == true ? 1 : 0) & 8) == 8) {
                    this.g = Collections.unmodifiableList(this.g);
                }
                if (((c == true ? 1 : 0) & 16) == 16) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if (((c == true ? 1 : 0) & 64) == 64) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if (((c == true ? 1 : 0) & 512) == 512) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if (((c == true ? 1 : 0) & 1024) == 1024) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                if (((c == true ? 1 : 0) & 2048) == 2048) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                if (((c == true ? 1 : 0) & 4096) == 4096) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if (((c == true ? 1 : 0) & 8192) == 8192) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if (((c == true ? 1 : 0) & 16384) == 16384) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if (((c == true ? 1 : 0) & 128) == 128) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if (((c == true ? 1 : 0) & 256) == 256) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if (((c == true ? 1 : 0) & 262144) == 262144) {
                    this.z = Collections.unmodifiableList(this.z);
                }
                if (((c == true ? 1 : 0) & 524288) == 524288) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if (((c == true ? 1 : 0) & 4194304) == 4194304) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                try {
                    j9N.m();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.b = c0518GkS.n();
                    throw th3;
                }
                this.b = c0518GkS.n();
                m();
                return;
            }
        }
    }
}
