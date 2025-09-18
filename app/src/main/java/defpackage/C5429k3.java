package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5429k3 extends AbstractC0428Fg {
    public final InterfaceC0191Cf g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final P70 o;
    public final M71 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public AbstractC0297Do0 u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5429k3(C1272Qb1 c1272Qb1, int[] iArr, InterfaceC0191Cf interfaceC0191Cf, long j, long j2, long j3, P70 p70) {
        super(c1272Qb1, iArr);
        M71 m71 = M71.a;
        if (j3 < j) {
            AbstractC6789rA1.h("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = interfaceC0191Cf;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = P70.u(p70);
        this.p = m71;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
        this.v = -2147483647L;
    }

    public static void u(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            M70 m70 = (M70) arrayList.get(i);
            if (m70 != null) {
                m70.a(new C5238j3(j, jArr[i]));
            }
        }
    }

    public static long w(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        AbstractC0297Do0 abstractC0297Do0 = (AbstractC0297Do0) AbstractC7337u22.b(list);
        long j = abstractC0297Do0.g;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = abstractC0297Do0.h;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.AbstractC0428Fg, defpackage.InterfaceC5311jR
    public final long a() {
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // defpackage.InterfaceC5311jR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r14, long r16, long r18, java.util.List r20, defpackage.InterfaceC0375Eo0[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            M71 r2 = r0.p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.r
            int r5 = r1.length
            if (r4 >= r5) goto L27
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L27
            int r4 = r0.r
            r1 = r1[r4]
            long r4 = r1.h()
            long r6 = r1.e()
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
            long r4 = r6.h()
            long r6 = r6.e()
            goto L25
        L3c:
            int r5 = r5 + 1
            goto L29
        L3f:
            long r4 = w(r20)
        L43:
            int r1 = r0.s
            if (r1 != 0) goto L51
            r1 = 1
            r0.s = r1
            int r1 = r13.v(r2)
            r0.r = r1
            return
        L51:
            int r6 = r0.r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5c
            r7 = r8
            goto L68
        L5c:
            java.lang.Object r7 = defpackage.AbstractC7337u22.b(r20)
            Do0 r7 = (defpackage.AbstractC0297Do0) r7
            qX r7 = r7.d
            int r7 = r13.f(r7)
        L68:
            if (r7 == r8) goto L73
            java.lang.Object r1 = defpackage.AbstractC7337u22.b(r20)
            Do0 r1 = (defpackage.AbstractC0297Do0) r1
            int r1 = r1.e
            r6 = r7
        L73:
            int r7 = r13.v(r2)
            if (r7 == r6) goto Lb7
            boolean r2 = r13.b(r6, r2)
            if (r2 != 0) goto Lb7
            qX[] r2 = r0.d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.h
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
            float r5 = r0.n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La3:
            int r2 = r2.i
            int r3 = r3.i
            if (r2 <= r3) goto Lae
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lae
            goto Lb6
        Lae:
            if (r2 >= r3) goto Lb7
            long r2 = r0.i
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
            r0.s = r1
            r0.r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5429k3.c(long, long, long, java.util.List, Eo0[]):void");
    }

    @Override // defpackage.AbstractC0428Fg, defpackage.InterfaceC5311jR
    public final void disable() {
        this.u = null;
    }

    @Override // defpackage.InterfaceC5311jR
    public final int e() {
        return this.r;
    }

    @Override // defpackage.AbstractC0428Fg, defpackage.InterfaceC5311jR
    public final void enable() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.AbstractC0428Fg, defpackage.InterfaceC5311jR
    public final int k(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((AbstractC0297Do0) AbstractC7337u22.b(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (AbstractC0297Do0) AbstractC7337u22.b(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jC = AbstractC0277Dh1.C(((AbstractC0297Do0) list.get(size - 1)).g - j, this.q);
        long j3 = this.j;
        if (jC < j3) {
            return size;
        }
        w(list);
        C6666qX c6666qX = this.d[v(jElapsedRealtime)];
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0297Do0 abstractC0297Do0 = (AbstractC0297Do0) list.get(i3);
            C6666qX c6666qX2 = abstractC0297Do0.d;
            if (AbstractC0277Dh1.C(abstractC0297Do0.g - j, this.q) >= j3 && c6666qX2.i < c6666qX.i && (i = c6666qX2.t) != -1 && i <= this.l && (i2 = c6666qX2.s) != -1 && i2 <= this.k && i < c6666qX.t) {
                return i3;
            }
        }
        return size;
    }

    @Override // defpackage.InterfaceC5311jR
    public final int n() {
        return this.s;
    }

    @Override // defpackage.AbstractC0428Fg, defpackage.InterfaceC5311jR
    public final void p(float f) {
        this.q = f;
    }

    @Override // defpackage.InterfaceC5311jR
    public final Object q() {
        return null;
    }

    public final int v(long j) {
        long j2;
        PE pe = (PE) this.g;
        synchronized (pe) {
            j2 = pe.k;
        }
        this.v = j2;
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((C5238j3) this.o.get(i)).a < j4) {
                i++;
            }
            C5238j3 c5238j3 = (C5238j3) this.o.get(i - 1);
            C5238j3 c5238j32 = (C5238j3) this.o.get(i);
            long j5 = c5238j3.a;
            long j6 = c5238j3.b;
            j4 = j6 + ((long) (((j4 - j5) / (c5238j32.a - j5)) * (c5238j32.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !b(i3, j)) {
                if (i(i3).i <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
