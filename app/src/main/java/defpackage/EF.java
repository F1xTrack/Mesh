package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class EF implements InterfaceC5369jk0 {
    public final Uri a;
    public final C1857Xo1 b = new C1857Xo1("DefaultHlsPlaylistTracker:MediaPlaylist", 2);
    public final ZC c;
    public C6576q30 d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public IOException j;
    public boolean k;
    public final /* synthetic */ FF l;

    public EF(FF ff, Uri uri) {
        this.l = ff;
        this.a = uri;
        this.c = ((WC) ff.a.b).s0();
    }

    public static boolean a(EF ef, long j) {
        ef.h = SystemClock.elapsedRealtime() + j;
        FF ff = ef.l;
        if (!ef.a.equals(ff.k)) {
            return false;
        }
        List list = ff.j.e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            EF ef2 = (EF) ff.d.get(((C7148t30) list.get(i)).a);
            ef2.getClass();
            if (jElapsedRealtime > ef2.h) {
                Uri uri = ef2.a;
                ff.k = uri;
                ef2.e(ff.b(uri));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        C6576q30 c6576q30 = this.d;
        Uri uri = this.a;
        if (c6576q30 != null) {
            C6385p30 c6385p30 = c6576q30.v;
            if (c6385p30.a != -9223372036854775807L || c6385p30.e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                C6576q30 c6576q302 = this.d;
                if (c6576q302.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c6576q302.k + c6576q302.r.size()));
                    C6576q30 c6576q303 = this.d;
                    if (c6576q303.n != -9223372036854775807L) {
                        P70 p70 = c6576q303.s;
                        int size = p70.size();
                        if (!p70.isEmpty() && ((C5621l30) AbstractC7337u22.b(p70)).m) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                C6385p30 c6385p302 = this.d.v;
                if (c6385p302.a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", c6385p302.b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z) {
        e(z ? b() : this.a);
    }

    public final void d(Uri uri) {
        FF ff = this.l;
        C6025nA0 c6025nA0 = new C6025nA0(this.c, uri, 4, ff.b.f(ff.j, this.d));
        C3547eG c3547eG = ff.c;
        int i = c6025nA0.c;
        ff.f.S(new C4020gk0(c6025nA0.a, c6025nA0.b, this.b.S(c6025nA0, this, c3547eG.d(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.h = 0L;
        if (this.i) {
            return;
        }
        C1857Xo1 c1857Xo1 = this.b;
        if (c1857Xo1.I() || c1857Xo1.G()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.g;
        if (jElapsedRealtime >= j) {
            d(uri);
        } else {
            this.i = true;
            this.l.h.postDelayed(new RunnableC3529eA(this, 7, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.C6576q30 r65, defpackage.C4020gk0 r66) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EF.f(q30, gk0):void");
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void m(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, boolean z) {
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        long j3 = c6025nA0.a;
        Uri uri = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        FF ff = this.l;
        ff.c.getClass();
        ff.f.J(c4020gk0, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    @Override // defpackage.InterfaceC5369jk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C3829fk0 o0(defpackage.InterfaceC5751lk0 r8, long r9, long r11, java.io.IOException r13, int r14) {
        /*
            r7 = this;
            r9 = 1
            r10 = 0
            nA0 r8 = (defpackage.C6025nA0) r8
            gk0 r0 = new gk0
            long r1 = r8.a
            M41 r1 = r8.d
            android.net.Uri r1 = r1.c
            r0.<init>(r11)
            java.lang.String r11 = "_HLS_msn"
            java.lang.String r11 = r1.getQueryParameter(r11)
            if (r11 == 0) goto L19
            r11 = r9
            goto L1a
        L19:
            r11 = r10
        L1a:
            boolean r12 = r13 instanceof defpackage.C7721w30
            fk0 r1 = defpackage.C1857Xo1.h
            FF r2 = r7.l
            int r8 = r8.c
            if (r11 != 0) goto L26
            if (r12 == 0) goto L3e
        L26:
            boolean r11 = r13 instanceof defpackage.C7343u40
            if (r11 == 0) goto L30
            r11 = r13
            u40 r11 = (defpackage.C7343u40) r11
            int r11 = r11.d
            goto L33
        L30:
            r11 = 2147483647(0x7fffffff, float:NaN)
        L33:
            if (r12 != 0) goto L8c
            r12 = 400(0x190, float:5.6E-43)
            if (r11 == r12) goto L8c
            r12 = 503(0x1f7, float:7.05E-43)
            if (r11 != r12) goto L3e
            goto L8c
        L3e:
            Pf r11 = new Pf
            r12 = 9
            r11.<init>(r13, r14, r12)
            java.util.concurrent.CopyOnWriteArrayList r12 = r2.e
            java.util.Iterator r12 = r12.iterator()
            r14 = r10
        L4c:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r12.next()
            z30 r3 = (defpackage.InterfaceC8291z30) r3
            android.net.Uri r4 = r7.a
            boolean r3 = r3.c(r4, r11, r10)
            r3 = r3 ^ r9
            r14 = r14 | r3
            goto L4c
        L61:
            eG r12 = r2.c
            if (r14 == 0) goto L7c
            long r3 = r12.e(r11)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 == 0) goto L79
            fk0 r11 = new fk0
            r11.<init>(r10, r3, r10)
            r1 = r11
            goto L7c
        L79:
            fk0 r10 = defpackage.C1857Xo1.i
            r1 = r10
        L7c:
            boolean r10 = r1.a()
            r9 = r9 ^ r10
            VY r11 = r2.f
            r11.P(r0, r8, r13, r9)
            if (r10 != 0) goto L9c
            r12.getClass()
            goto L9c
        L8c:
            long r11 = android.os.SystemClock.elapsedRealtime()
            r7.g = r11
            r7.c(r10)
            VY r10 = r2.f
            int r11 = defpackage.AbstractC0277Dh1.a
            r10.P(r0, r8, r13, r9)
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EF.o0(lk0, long, long, java.io.IOException, int):fk0");
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void v(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2) {
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        AbstractC7530v30 abstractC7530v30 = (AbstractC7530v30) c6025nA0.f;
        Uri uri = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        if (abstractC7530v30 instanceof C6576q30) {
            f((C6576q30) abstractC7530v30, c4020gk0);
            this.l.f.L(c4020gk0, 4);
        } else {
            C5643lA0 c5643lA0B = C5643lA0.b("Loaded playlist has unexpected type.", null);
            this.j = c5643lA0B;
            this.l.f.P(c4020gk0, 4, c5643lA0B, true);
        }
        this.l.c.getClass();
    }
}
