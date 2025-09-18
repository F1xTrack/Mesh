package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: zF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11901zF0 extends AbstractC11359v00 {

    /* renamed from: d */
    public int f46745d;

    /* renamed from: e */
    public List f46746e;

    /* renamed from: f */
    public boolean f46747f;

    /* renamed from: g */
    public int f46748g;

    /* renamed from: h */
    public AF0 f46749h;

    /* renamed from: i */
    public int f46750i;

    /* renamed from: j */
    public int f46751j;

    /* renamed from: k */
    public int f46752k;

    /* renamed from: l */
    public int f46753l;

    /* renamed from: m */
    public int f46754m;

    /* renamed from: n */
    public AF0 f46755n;

    /* renamed from: o */
    public int f46756o;

    /* renamed from: p */
    public AF0 f46757p;

    /* renamed from: q */
    public int f46758q;

    /* renamed from: r */
    public int f46759r;

    /* renamed from: m */
    public static C11901zF0 m26350m() {
        C11901zF0 c11901zF0 = new C11901zF0();
        c11901zF0.f46746e = Collections.emptyList();
        AF0 af0 = AF0.f123t;
        c11901zF0.f46749h = af0;
        c11901zF0.f46755n = af0;
        c11901zF0.f46757p = af0;
        return c11901zF0;
    }

    public final Object clone() {
        C11901zF0 c11901zF0M26350m = m26350m();
        c11901zF0M26350m.m26352n(m26351l());
        return c11901zF0M26350m;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        AF0 af0M26351l = m26351l();
        if (af0M26351l.mo131e()) {
            return af0M26351l;
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
            xd0 r1 = p000.AF0.f124u     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            AF0 r1 = new AF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m26352n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            AF0 r4 = (p000.AF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m26352n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11901zF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m26352n((AF0) a00);
        return this;
    }

    /* renamed from: l */
    public final AF0 m26351l() {
        AF0 af0 = new AF0(this);
        int i = this.f46745d;
        if ((i & 1) == 1) {
            this.f46746e = Collections.unmodifiableList(this.f46746e);
            this.f46745d &= -2;
        }
        af0.f127d = this.f46746e;
        int i2 = (i & 2) != 2 ? 0 : 1;
        af0.f128e = this.f46747f;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        af0.f129f = this.f46748g;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        af0.f130g = this.f46749h;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        af0.f131h = this.f46750i;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        af0.f132i = this.f46751j;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        af0.f133j = this.f46752k;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        af0.f134k = this.f46753l;
        if ((i & 256) == 256) {
            i2 |= 128;
        }
        af0.f135l = this.f46754m;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        af0.f136m = this.f46755n;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        af0.f137n = this.f46756o;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        af0.f138o = this.f46757p;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        af0.f139p = this.f46758q;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        af0.f140q = this.f46759r;
        af0.f126c = i2;
        return af0;
    }

    /* renamed from: n */
    public final C11901zF0 m26352n(AF0 af0) {
        AF0 af02;
        AF0 af03;
        AF0 af04;
        AF0 af05 = AF0.f123t;
        if (af0 == af05) {
            return this;
        }
        if (!af0.f127d.isEmpty()) {
            if (this.f46746e.isEmpty()) {
                this.f46746e = af0.f127d;
                this.f46745d &= -2;
            } else {
                if ((this.f46745d & 1) != 1) {
                    this.f46746e = new ArrayList(this.f46746e);
                    this.f46745d |= 1;
                }
                this.f46746e.addAll(af0.f127d);
            }
        }
        int i = af0.f126c;
        if ((i & 1) == 1) {
            boolean z = af0.f128e;
            this.f46745d |= 2;
            this.f46747f = z;
        }
        if ((i & 2) == 2) {
            int i2 = af0.f129f;
            this.f46745d |= 4;
            this.f46748g = i2;
        }
        if ((i & 4) == 4) {
            AF0 af06 = af0.f130g;
            if ((this.f46745d & 8) != 8 || (af04 = this.f46749h) == af05) {
                this.f46749h = af06;
            } else {
                C11901zF0 c11901zF0M126r = AF0.m126r(af04);
                c11901zF0M126r.m26352n(af06);
                this.f46749h = c11901zF0M126r.m26351l();
            }
            this.f46745d |= 8;
        }
        if ((af0.f126c & 8) == 8) {
            int i3 = af0.f131h;
            this.f46745d |= 16;
            this.f46750i = i3;
        }
        if (af0.m133p()) {
            int i4 = af0.f132i;
            this.f46745d |= 32;
            this.f46751j = i4;
        }
        int i5 = af0.f126c;
        if ((i5 & 32) == 32) {
            int i6 = af0.f133j;
            this.f46745d |= 64;
            this.f46752k = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = af0.f134k;
            this.f46745d |= 128;
            this.f46753l = i7;
        }
        if ((i5 & 128) == 128) {
            int i8 = af0.f135l;
            this.f46745d |= 256;
            this.f46754m = i8;
        }
        if ((i5 & 256) == 256) {
            AF0 af07 = af0.f136m;
            if ((this.f46745d & 512) != 512 || (af03 = this.f46755n) == af05) {
                this.f46755n = af07;
            } else {
                C11901zF0 c11901zF0M126r2 = AF0.m126r(af03);
                c11901zF0M126r2.m26352n(af07);
                this.f46755n = c11901zF0M126r2.m26351l();
            }
            this.f46745d |= 512;
        }
        int i9 = af0.f126c;
        if ((i9 & 512) == 512) {
            int i10 = af0.f137n;
            this.f46745d |= 1024;
            this.f46756o = i10;
        }
        if ((i9 & 1024) == 1024) {
            AF0 af08 = af0.f138o;
            if ((this.f46745d & 2048) != 2048 || (af02 = this.f46757p) == af05) {
                this.f46757p = af08;
            } else {
                C11901zF0 c11901zF0M126r3 = AF0.m126r(af02);
                c11901zF0M126r3.m26352n(af08);
                this.f46757p = c11901zF0M126r3.m26351l();
            }
            this.f46745d |= 2048;
        }
        int i11 = af0.f126c;
        if ((i11 & 2048) == 2048) {
            int i12 = af0.f139p;
            this.f46745d |= 4096;
            this.f46758q = i12;
        }
        if ((i11 & 4096) == 4096) {
            int i13 = af0.f140q;
            this.f46745d |= 8192;
            this.f46759r = i13;
        }
        m25292k(af0);
        this.f41281a = this.f41281a.m3573d(af0.f125b);
        return this;
    }
}
