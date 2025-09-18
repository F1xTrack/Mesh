package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10625pF0 extends AbstractC11359v00 {

    /* renamed from: d */
    public int f39964d;

    /* renamed from: e */
    public int f39965e;

    /* renamed from: f */
    public int f39966f;

    /* renamed from: g */
    public int f39967g;

    /* renamed from: h */
    public AF0 f39968h;

    /* renamed from: i */
    public int f39969i;

    /* renamed from: j */
    public List f39970j;

    /* renamed from: k */
    public AF0 f39971k;

    /* renamed from: l */
    public int f39972l;

    /* renamed from: m */
    public List f39973m;

    /* renamed from: n */
    public List f39974n;

    /* renamed from: o */
    public IF0 f39975o;

    /* renamed from: p */
    public int f39976p;

    /* renamed from: q */
    public int f39977q;

    /* renamed from: r */
    public List f39978r;

    /* renamed from: m */
    public static C10625pF0 m23665m() {
        C10625pF0 c10625pF0 = new C10625pF0();
        c10625pF0.f39965e = 518;
        c10625pF0.f39966f = 2054;
        AF0 af0 = AF0.f123t;
        c10625pF0.f39968h = af0;
        c10625pF0.f39970j = Collections.emptyList();
        c10625pF0.f39971k = af0;
        c10625pF0.f39973m = Collections.emptyList();
        c10625pF0.f39974n = Collections.emptyList();
        c10625pF0.f39975o = IF0.f4860l;
        c10625pF0.f39978r = Collections.emptyList();
        return c10625pF0;
    }

    public final Object clone() {
        C10625pF0 c10625pF0M23665m = m23665m();
        c10625pF0M23665m.m23667n(m23666l());
        return c10625pF0M23665m;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C10753qF0 c10753qF0M23666l = m23666l();
        if (c10753qF0M23666l.mo131e()) {
            return c10753qF0M23666l;
        }
        throw new C6838sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p000.AbstractC10847r00
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r3, p000.C0217DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = p000.C10753qF0.f40685v     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            qF0 r1 = new qF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m23667n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            qF0 r4 = (p000.C10753qF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m23667n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10625pF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m23667n((C10753qF0) a00);
        return this;
    }

    /* renamed from: l */
    public final C10753qF0 m23666l() {
        C10753qF0 c10753qF0 = new C10753qF0(this);
        int i = this.f39964d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c10753qF0.f40688d = this.f39965e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c10753qF0.f40689e = this.f39966f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c10753qF0.f40690f = this.f39967g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c10753qF0.f40691g = this.f39968h;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c10753qF0.f40692h = this.f39969i;
        if ((i & 32) == 32) {
            this.f39970j = Collections.unmodifiableList(this.f39970j);
            this.f39964d &= -33;
        }
        c10753qF0.f40693i = this.f39970j;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c10753qF0.f40694j = this.f39971k;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c10753qF0.f40695k = this.f39972l;
        if ((this.f39964d & 256) == 256) {
            this.f39973m = Collections.unmodifiableList(this.f39973m);
            this.f39964d &= -257;
        }
        c10753qF0.f40696l = this.f39973m;
        if ((this.f39964d & 512) == 512) {
            this.f39974n = Collections.unmodifiableList(this.f39974n);
            this.f39964d &= -513;
        }
        c10753qF0.f40697m = this.f39974n;
        if ((i & 1024) == 1024) {
            i2 |= 128;
        }
        c10753qF0.f40699o = this.f39975o;
        if ((i & 2048) == 2048) {
            i2 |= 256;
        }
        c10753qF0.f40700p = this.f39976p;
        if ((i & 4096) == 4096) {
            i2 |= 512;
        }
        c10753qF0.f40701q = this.f39977q;
        if ((this.f39964d & 8192) == 8192) {
            this.f39978r = Collections.unmodifiableList(this.f39978r);
            this.f39964d &= -8193;
        }
        c10753qF0.f40702r = this.f39978r;
        c10753qF0.f40687c = i2;
        return c10753qF0;
    }

    /* renamed from: n */
    public final void m23667n(C10753qF0 c10753qF0) {
        IF0 if0;
        AF0 af0;
        AF0 af02;
        if (c10753qF0 == C10753qF0.f40684u) {
            return;
        }
        int i = c10753qF0.f40687c;
        if ((i & 1) == 1) {
            int i2 = c10753qF0.f40688d;
            this.f39964d = 1 | this.f39964d;
            this.f39965e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c10753qF0.f40689e;
            this.f39964d = 2 | this.f39964d;
            this.f39966f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = c10753qF0.f40690f;
            this.f39964d = 4 | this.f39964d;
            this.f39967g = i4;
        }
        if ((i & 8) == 8) {
            AF0 af03 = c10753qF0.f40691g;
            if ((this.f39964d & 8) != 8 || (af02 = this.f39968h) == AF0.f123t) {
                this.f39968h = af03;
            } else {
                C11901zF0 c11901zF0M126r = AF0.m126r(af02);
                c11901zF0M126r.m26352n(af03);
                this.f39968h = c11901zF0M126r.m26351l();
            }
            this.f39964d |= 8;
        }
        if ((c10753qF0.f40687c & 16) == 16) {
            int i5 = c10753qF0.f40692h;
            this.f39964d = 16 | this.f39964d;
            this.f39969i = i5;
        }
        if (!c10753qF0.f40693i.isEmpty()) {
            if (this.f39970j.isEmpty()) {
                this.f39970j = c10753qF0.f40693i;
                this.f39964d &= -33;
            } else {
                if ((this.f39964d & 32) != 32) {
                    this.f39970j = new ArrayList(this.f39970j);
                    this.f39964d |= 32;
                }
                this.f39970j.addAll(c10753qF0.f40693i);
            }
        }
        if (c10753qF0.m23957p()) {
            AF0 af04 = c10753qF0.f40694j;
            if ((this.f39964d & 64) != 64 || (af0 = this.f39971k) == AF0.f123t) {
                this.f39971k = af04;
            } else {
                C11901zF0 c11901zF0M126r2 = AF0.m126r(af0);
                c11901zF0M126r2.m26352n(af04);
                this.f39971k = c11901zF0M126r2.m26351l();
            }
            this.f39964d |= 64;
        }
        if ((c10753qF0.f40687c & 64) == 64) {
            int i6 = c10753qF0.f40695k;
            this.f39964d |= 128;
            this.f39972l = i6;
        }
        if (!c10753qF0.f40696l.isEmpty()) {
            if (this.f39973m.isEmpty()) {
                this.f39973m = c10753qF0.f40696l;
                this.f39964d &= -257;
            } else {
                if ((this.f39964d & 256) != 256) {
                    this.f39973m = new ArrayList(this.f39973m);
                    this.f39964d |= 256;
                }
                this.f39973m.addAll(c10753qF0.f40696l);
            }
        }
        if (!c10753qF0.f40697m.isEmpty()) {
            if (this.f39974n.isEmpty()) {
                this.f39974n = c10753qF0.f40697m;
                this.f39964d &= -513;
            } else {
                if ((this.f39964d & 512) != 512) {
                    this.f39974n = new ArrayList(this.f39974n);
                    this.f39964d |= 512;
                }
                this.f39974n.addAll(c10753qF0.f40697m);
            }
        }
        if ((c10753qF0.f40687c & 128) == 128) {
            IF0 if02 = c10753qF0.f40699o;
            if ((this.f39964d & 1024) != 1024 || (if0 = this.f39975o) == IF0.f4860l) {
                this.f39975o = if02;
            } else {
                HF0 hf0 = new HF0();
                AF0 af05 = AF0.f123t;
                hf0.f4196g = af05;
                hf0.f4198i = af05;
                hf0.m3336m(if0);
                hf0.m3336m(if02);
                this.f39975o = hf0.m3335l();
            }
            this.f39964d |= 1024;
        }
        int i7 = c10753qF0.f40687c;
        if ((i7 & 256) == 256) {
            int i8 = c10753qF0.f40700p;
            this.f39964d |= 2048;
            this.f39976p = i8;
        }
        if ((i7 & 512) == 512) {
            int i9 = c10753qF0.f40701q;
            this.f39964d |= 4096;
            this.f39977q = i9;
        }
        if (!c10753qF0.f40702r.isEmpty()) {
            if (this.f39978r.isEmpty()) {
                this.f39978r = c10753qF0.f40702r;
                this.f39964d &= -8193;
            } else {
                if ((this.f39964d & 8192) != 8192) {
                    this.f39978r = new ArrayList(this.f39978r);
                    this.f39964d |= 8192;
                }
                this.f39978r.addAll(c10753qF0.f40702r);
            }
        }
        m25292k(c10753qF0);
        this.f41281a = this.f41281a.m3573d(c10753qF0.f40686b);
    }
}
