package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class BF0 extends AbstractC11359v00 {

    /* renamed from: d */
    public int f679d;

    /* renamed from: e */
    public int f680e;

    /* renamed from: f */
    public int f681f;

    /* renamed from: g */
    public List f682g;

    /* renamed from: h */
    public AF0 f683h;

    /* renamed from: i */
    public int f684i;

    /* renamed from: j */
    public AF0 f685j;

    /* renamed from: k */
    public int f686k;

    /* renamed from: l */
    public List f687l;

    /* renamed from: m */
    public List f688m;

    /* renamed from: m */
    public static BF0 m565m() {
        BF0 bf0 = new BF0();
        bf0.f680e = 6;
        bf0.f682g = Collections.emptyList();
        AF0 af0 = AF0.f123t;
        bf0.f683h = af0;
        bf0.f685j = af0;
        bf0.f687l = Collections.emptyList();
        bf0.f688m = Collections.emptyList();
        return bf0;
    }

    public final Object clone() {
        BF0 bf0M565m = m565m();
        bf0M565m.m570n(m569l());
        return bf0M565m;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        CF0 cf0M569l = m569l();
        if (cf0M569l.mo131e()) {
            return cf0M569l;
        }
        throw new C6838sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001b  */
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
            xd0 r1 = p000.CF0.f1269p     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            CF0 r1 = new CF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m570n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            CF0 r4 = (p000.CF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m570n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.BF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m570n((CF0) a00);
        return this;
    }

    /* renamed from: l */
    public final CF0 m569l() {
        CF0 cf0 = new CF0(this);
        int i = this.f679d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        cf0.f1272d = this.f680e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        cf0.f1273e = this.f681f;
        if ((i & 4) == 4) {
            this.f682g = Collections.unmodifiableList(this.f682g);
            this.f679d &= -5;
        }
        cf0.f1274f = this.f682g;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        cf0.f1275g = this.f683h;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        cf0.f1276h = this.f684i;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        cf0.f1277i = this.f685j;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        cf0.f1278j = this.f686k;
        if ((this.f679d & 128) == 128) {
            this.f687l = Collections.unmodifiableList(this.f687l);
            this.f679d &= -129;
        }
        cf0.f1279k = this.f687l;
        if ((this.f679d & 256) == 256) {
            this.f688m = Collections.unmodifiableList(this.f688m);
            this.f679d &= -257;
        }
        cf0.f1280l = this.f688m;
        cf0.f1271c = i2;
        return cf0;
    }

    /* renamed from: n */
    public final void m570n(CF0 cf0) {
        AF0 af0;
        AF0 af02;
        if (cf0 == CF0.f1268o) {
            return;
        }
        int i = cf0.f1271c;
        if ((i & 1) == 1) {
            int i2 = cf0.f1272d;
            this.f679d = 1 | this.f679d;
            this.f680e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = cf0.f1273e;
            this.f679d = 2 | this.f679d;
            this.f681f = i3;
        }
        if (!cf0.f1274f.isEmpty()) {
            if (this.f682g.isEmpty()) {
                this.f682g = cf0.f1274f;
                this.f679d &= -5;
            } else {
                if ((this.f679d & 4) != 4) {
                    this.f682g = new ArrayList(this.f682g);
                    this.f679d |= 4;
                }
                this.f682g.addAll(cf0.f1274f);
            }
        }
        if ((cf0.f1271c & 4) == 4) {
            AF0 af03 = cf0.f1275g;
            if ((this.f679d & 8) != 8 || (af02 = this.f683h) == AF0.f123t) {
                this.f683h = af03;
            } else {
                C11901zF0 c11901zF0M126r = AF0.m126r(af02);
                c11901zF0M126r.m26352n(af03);
                this.f683h = c11901zF0M126r.m26351l();
            }
            this.f679d |= 8;
        }
        int i4 = cf0.f1271c;
        if ((i4 & 8) == 8) {
            int i5 = cf0.f1276h;
            this.f679d |= 16;
            this.f684i = i5;
        }
        if ((i4 & 16) == 16) {
            AF0 af04 = cf0.f1277i;
            if ((this.f679d & 32) != 32 || (af0 = this.f685j) == AF0.f123t) {
                this.f685j = af04;
            } else {
                C11901zF0 c11901zF0M126r2 = AF0.m126r(af0);
                c11901zF0M126r2.m26352n(af04);
                this.f685j = c11901zF0M126r2.m26351l();
            }
            this.f679d |= 32;
        }
        if ((cf0.f1271c & 32) == 32) {
            int i6 = cf0.f1278j;
            this.f679d |= 64;
            this.f686k = i6;
        }
        if (!cf0.f1279k.isEmpty()) {
            if (this.f687l.isEmpty()) {
                this.f687l = cf0.f1279k;
                this.f679d &= -129;
            } else {
                if ((this.f679d & 128) != 128) {
                    this.f687l = new ArrayList(this.f687l);
                    this.f679d |= 128;
                }
                this.f687l.addAll(cf0.f1279k);
            }
        }
        if (!cf0.f1280l.isEmpty()) {
            if (this.f688m.isEmpty()) {
                this.f688m = cf0.f1280l;
                this.f679d &= -257;
            } else {
                if ((this.f679d & 256) != 256) {
                    this.f688m = new ArrayList(this.f688m);
                    this.f679d |= 256;
                }
                this.f688m.addAll(cf0.f1280l);
            }
        }
        m25292k(cf0);
        this.f41281a = this.f41281a.m3573d(cf0.f1270b);
    }
}
