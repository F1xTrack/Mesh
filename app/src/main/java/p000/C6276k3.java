package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k3 */
/* loaded from: classes.dex */
public final class C6276k3 extends AbstractC0358Fg {

    /* renamed from: g */
    public final InterfaceC0168Cf f36234g;

    /* renamed from: h */
    public final long f36235h;

    /* renamed from: i */
    public final long f36236i;

    /* renamed from: j */
    public final long f36237j;

    /* renamed from: k */
    public final int f36238k;

    /* renamed from: l */
    public final int f36239l;

    /* renamed from: m */
    public final float f36240m;

    /* renamed from: n */
    public final float f36241n;

    /* renamed from: o */
    public final P70 f36242o;

    /* renamed from: p */
    public final M71 f36243p;

    /* renamed from: q */
    public float f36244q;

    /* renamed from: r */
    public int f36245r;

    /* renamed from: s */
    public int f36246s;

    /* renamed from: t */
    public long f36247t;

    /* renamed from: u */
    public AbstractC7498Do0 f36248u;

    /* renamed from: v */
    public long f36249v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6276k3(C8149Qb1 c8149Qb1, int[] iArr, InterfaceC0168Cf interfaceC0168Cf, long j, long j2, long j3, P70 p70) {
        super(c8149Qb1, iArr);
        M71 m71 = M71.f6997a;
        if (j3 < j) {
            AbstractC10872rA1.m24175h("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.f36234g = interfaceC0168Cf;
        this.f36235h = j * 1000;
        this.f36236i = j2 * 1000;
        this.f36237j = j3 * 1000;
        this.f36238k = 1279;
        this.f36239l = 719;
        this.f36240m = 0.7f;
        this.f36241n = 0.75f;
        this.f36242o = P70.m6234u(p70);
        this.f36243p = m71;
        this.f36244q = 1.0f;
        this.f36246s = 0;
        this.f36247t = -9223372036854775807L;
        this.f36249v = -2147483647L;
    }

    /* renamed from: u */
    public static void m22139u(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            M70 m70 = (M70) arrayList.get(i);
            if (m70 != null) {
                m70.m3755a(new C6213j3(j, jArr[i]));
            }
        }
    }

    /* renamed from: w */
    public static long m22140w(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        AbstractC7498Do0 abstractC7498Do0 = (AbstractC7498Do0) AbstractC11239u22.m25079b(list);
        long j = abstractC7498Do0.f9817g;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = abstractC7498Do0.f9818h;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    @Override // p000.AbstractC0358Fg, p000.InterfaceC6237jR
    /* renamed from: a */
    public final long mo2722a() {
        return this.f36249v;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // p000.InterfaceC6237jR
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6373c(long r14, long r16, long r18, java.util.List r20, p000.InterfaceC7550Eo0[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            M71 r2 = r0.f36243p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f36245r
            int r5 = r1.length
            if (r4 >= r5) goto L27
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L27
            int r4 = r0.f36245r
            r1 = r1[r4]
            long r4 = r1.mo2424h()
            long r6 = r1.mo2423e()
        L25:
            long r4 = r4 - r6
            goto L43
        L27:
            int r4 = r1.length
            r5 = 0
        L29:
            if (r5 >= r4) goto L3f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3c
            long r4 = r6.mo2424h()
            long r6 = r6.mo2423e()
            goto L25
        L3c:
            int r5 = r5 + 1
            goto L29
        L3f:
            long r4 = m22140w(r20)
        L43:
            int r1 = r0.f36246s
            if (r1 != 0) goto L51
            r1 = 1
            r0.f36246s = r1
            int r1 = r13.m22141v(r2)
            r0.f36245r = r1
            return
        L51:
            int r6 = r0.f36245r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5c
            r7 = r8
            goto L68
        L5c:
            java.lang.Object r7 = p000.AbstractC11239u22.m25079b(r20)
            Do0 r7 = (p000.AbstractC7498Do0) r7
            qX r7 = r7.f9814d
            int r7 = r13.mo2725f(r7)
        L68:
            if (r7 == r8) goto L73
            java.lang.Object r1 = p000.AbstractC11239u22.m25079b(r20)
            Do0 r1 = (p000.AbstractC7498Do0) r1
            int r1 = r1.f9815e
            r6 = r7
        L73:
            int r7 = r13.m22141v(r2)
            if (r7 == r6) goto Lb7
            boolean r2 = r13.mo2723b(r6, r2)
            if (r2 != 0) goto Lb7
            qX[] r2 = r0.f3385d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.f36235h
            if (r10 != 0) goto L91
            goto La3
        L91:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L98
            long r4 = r18 - r4
            goto L9a
        L98:
            r4 = r18
        L9a:
            float r4 = (float) r4
            float r5 = r0.f36241n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La3:
            int r2 = r2.f40970i
            int r3 = r3.f40970i
            if (r2 <= r3) goto Lae
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lae
            goto Lb6
        Lae:
            if (r2 >= r3) goto Lb7
            long r2 = r0.f36236i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb7
        Lb6:
            r7 = r6
        Lb7:
            if (r7 != r6) goto Lba
            goto Lbb
        Lba:
            r1 = 3
        Lbb:
            r0.f36246s = r1
            r0.f36245r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6276k3.mo6373c(long, long, long, java.util.List, Eo0[]):void");
    }

    @Override // p000.AbstractC0358Fg, p000.InterfaceC6237jR
    public final void disable() {
        this.f36248u = null;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: e */
    public final int mo6374e() {
        return this.f36245r;
    }

    @Override // p000.AbstractC0358Fg, p000.InterfaceC6237jR
    public final void enable() {
        this.f36247t = -9223372036854775807L;
        this.f36248u = null;
    }

    @Override // p000.AbstractC0358Fg, p000.InterfaceC6237jR
    /* renamed from: k */
    public final int mo2730k(long j, List list) {
        int i;
        int i2;
        this.f36243p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f36247t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((AbstractC7498Do0) AbstractC11239u22.m25079b(list)).equals(this.f36248u))) {
            return list.size();
        }
        this.f36247t = jElapsedRealtime;
        this.f36248u = list.isEmpty() ? null : (AbstractC7498Do0) AbstractC11239u22.m25079b(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM1788C = AbstractC7485Dh1.m1788C(((AbstractC7498Do0) list.get(size - 1)).f9817g - j, this.f36244q);
        long j3 = this.f36237j;
        if (jM1788C < j3) {
            return size;
        }
        m22140w(list);
        C6686qX c6686qX = this.f3385d[m22141v(jElapsedRealtime)];
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC7498Do0 abstractC7498Do0 = (AbstractC7498Do0) list.get(i3);
            C6686qX c6686qX2 = abstractC7498Do0.f9814d;
            if (AbstractC7485Dh1.m1788C(abstractC7498Do0.f9817g - j, this.f36244q) >= j3 && c6686qX2.f40970i < c6686qX.f40970i && (i = c6686qX2.f40981t) != -1 && i <= this.f36239l && (i2 = c6686qX2.f40980s) != -1 && i2 <= this.f36238k && i < c6686qX.f40981t) {
                return i3;
            }
        }
        return size;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: n */
    public final int mo6375n() {
        return this.f36246s;
    }

    @Override // p000.AbstractC0358Fg, p000.InterfaceC6237jR
    /* renamed from: p */
    public final void mo2734p(float f) {
        this.f36244q = f;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: q */
    public final Object mo6376q() {
        return null;
    }

    /* renamed from: v */
    public final int m22141v(long j) {
        long j2;
        C0959PE c0959pe = (C0959PE) this.f36234g;
        synchronized (c0959pe) {
            j2 = c0959pe.f8927k;
        }
        this.f36249v = j2;
        long j3 = (long) (j2 * this.f36240m);
        this.f36234g.getClass();
        long j4 = (long) (j3 / this.f36244q);
        if (!this.f36242o.isEmpty()) {
            int i = 1;
            while (i < this.f36242o.size() - 1 && ((C6213j3) this.f36242o.get(i)).f34864a < j4) {
                i++;
            }
            C6213j3 c6213j3 = (C6213j3) this.f36242o.get(i - 1);
            C6213j3 c6213j32 = (C6213j3) this.f36242o.get(i);
            long j5 = c6213j3.f34864a;
            long j6 = c6213j3.f34865b;
            j4 = j6 + ((long) (((j4 - j5) / (c6213j32.f34864a - j5)) * (c6213j32.f34865b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3383b; i3++) {
            if (j == Long.MIN_VALUE || !mo2723b(i3, j)) {
                if (mo2728i(i3).f40970i <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
