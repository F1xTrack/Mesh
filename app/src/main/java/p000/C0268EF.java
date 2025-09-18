package p000;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.List;

/* renamed from: EF */
/* loaded from: classes.dex */
public final class C0268EF implements InterfaceC9919jk0 {

    /* renamed from: a */
    public final Uri f2565a;

    /* renamed from: b */
    public final C8539Xo1 f2566b = new C8539Xo1("DefaultHlsPlaylistTracker:MediaPlaylist", 2);

    /* renamed from: c */
    public final InterfaceC1586ZC f2567c;

    /* renamed from: d */
    public C10728q30 f2568d;

    /* renamed from: e */
    public long f2569e;

    /* renamed from: f */
    public long f2570f;

    /* renamed from: g */
    public long f2571g;

    /* renamed from: h */
    public long f2572h;

    /* renamed from: i */
    public boolean f2573i;

    /* renamed from: j */
    public IOException f2574j;

    /* renamed from: k */
    public boolean f2575k;

    /* renamed from: l */
    public final /* synthetic */ C0331FF f2576l;

    public C0268EF(C0331FF c0331ff, Uri uri) {
        this.f2576l = c0331ff;
        this.f2565a = uri;
        this.f2567c = ((InterfaceC1397WC) c0331ff.f3097a.f1022b).mo506s0();
    }

    /* renamed from: a */
    public static boolean m2100a(C0268EF c0268ef, long j) {
        c0268ef.f2572h = SystemClock.elapsedRealtime() + j;
        C0331FF c0331ff = c0268ef.f2576l;
        if (!c0268ef.f2565a.equals(c0331ff.f3107k)) {
            return false;
        }
        List list = c0331ff.f3106j.f43457e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C0268EF c0268ef2 = (C0268EF) c0331ff.f3100d.get(((C11112t30) list.get(i)).f42814a);
            c0268ef2.getClass();
            if (jElapsedRealtime > c0268ef2.f2572h) {
                Uri uri = c0268ef2.f2565a;
                c0331ff.f3107k = uri;
                c0268ef2.m2104e(c0331ff.m2561b(uri));
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final Uri m2101b() {
        C10728q30 c10728q30 = this.f2568d;
        Uri uri = this.f2565a;
        if (c10728q30 != null) {
            C10600p30 c10600p30 = c10728q30.f40558v;
            if (c10600p30.f39757a != -9223372036854775807L || c10600p30.f39761e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                C10728q30 c10728q302 = this.f2568d;
                if (c10728q302.f40558v.f39761e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c10728q302.f40547k + c10728q302.f40554r.size()));
                    C10728q30 c10728q303 = this.f2568d;
                    if (c10728q303.f40550n != -9223372036854775807L) {
                        P70 p70 = c10728q303.f40555s;
                        int size = p70.size();
                        if (!p70.isEmpty() && ((C10088l30) AbstractC11239u22.m25079b(p70)).f36845m) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                C10600p30 c10600p302 = this.f2568d.f40558v;
                if (c10600p302.f39757a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", c10600p302.f39758b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    /* renamed from: c */
    public final void m2102c(boolean z) {
        m2104e(z ? m2101b() : this.f2565a);
    }

    /* renamed from: d */
    public final void m2103d(Uri uri) {
        C0331FF c0331ff = this.f2576l;
        C10359nA0 c10359nA0 = new C10359nA0(this.f2567c, uri, 4, c0331ff.f3098b.mo5442f(c0331ff.f3106j, this.f2568d));
        C3979eG c3979eG = c0331ff.f3099c;
        int i = c10359nA0.f38160c;
        c0331ff.f3102f.m8481S(new C9535gk0(c10359nA0.f38158a, c10359nA0.f38159b, this.f2566b.m9136S(c10359nA0, this, c3979eG.mo17891d(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: e */
    public final void m2104e(Uri uri) {
        this.f2572h = 0L;
        if (this.f2573i) {
            return;
        }
        C8539Xo1 c8539Xo1 = this.f2566b;
        if (c8539Xo1.m9127I() || c8539Xo1.m9125G()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f2571g;
        if (jElapsedRealtime >= j) {
            m2103d(uri);
        } else {
            this.f2573i = true;
            this.f2576l.f3104h.postDelayed(new RunnableC3973eA(this, 7, uri), j - jElapsedRealtime);
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
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2105f(p000.C10728q30 r65, p000.C9535gk0 r66) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0268EF.m2105f(q30, gk0):void");
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: m */
    public final void mo2001m(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, boolean z) {
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        long j3 = c10359nA0.f38158a;
        Uri uri = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        C0331FF c0331ff = this.f2576l;
        c0331ff.f3099c.getClass();
        c0331ff.f3102f.m8472J(c9535gk0, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    @Override // p000.InterfaceC9919jk0
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C9407fk0 mo2002o0(p000.InterfaceC10175lk0 r8, long r9, long r11, java.io.IOException r13, int r14) {
        /*
            r7 = this;
            r9 = 1
            r10 = 0
            nA0 r8 = (p000.C10359nA0) r8
            gk0 r0 = new gk0
            long r1 = r8.f38158a
            M41 r1 = r8.f38161d
            android.net.Uri r1 = r1.f6987c
            r0.<init>(r11)
            java.lang.String r11 = "_HLS_msn"
            java.lang.String r11 = r1.getQueryParameter(r11)
            if (r11 == 0) goto L19
            r11 = r9
            goto L1a
        L19:
            r11 = r10
        L1a:
            boolean r12 = r13 instanceof p000.C11496w30
            fk0 r1 = p000.C8539Xo1.f13978h
            FF r2 = r7.f2576l
            int r8 = r8.f38160c
            if (r11 != 0) goto L26
            if (r12 == 0) goto L3e
        L26:
            boolean r11 = r13 instanceof p000.C11243u40
            if (r11 == 0) goto L30
            r11 = r13
            u40 r11 = (p000.C11243u40) r11
            int r11 = r11.f43483d
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
            java.util.concurrent.CopyOnWriteArrayList r12 = r2.f3101e
            java.util.Iterator r12 = r12.iterator()
            r14 = r10
        L4c:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r12.next()
            z30 r3 = (p000.InterfaceC11877z30) r3
            android.net.Uri r4 = r7.f2565a
            boolean r3 = r3.mo1602c(r4, r11, r10)
            r3 = r3 ^ r9
            r14 = r14 | r3
            goto L4c
        L61:
            eG r12 = r2.f3099c
            if (r14 == 0) goto L7c
            long r3 = r12.mo17892e(r11)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 == 0) goto L79
            fk0 r11 = new fk0
            r11.<init>(r10, r3, r10)
            r1 = r11
            goto L7c
        L79:
            fk0 r10 = p000.C8539Xo1.f13979i
            r1 = r10
        L7c:
            boolean r10 = r1.m18291a()
            r9 = r9 ^ r10
            VY r11 = r2.f3102f
            r11.m8478P(r0, r8, r13, r9)
            if (r10 != 0) goto L9c
            r12.getClass()
            goto L9c
        L8c:
            long r11 = android.os.SystemClock.elapsedRealtime()
            r7.f2571g = r11
            r7.m2102c(r10)
            VY r10 = r2.f3102f
            int r11 = p000.AbstractC7485Dh1.f2166a
            r10.m8478P(r0, r8, r13, r9)
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0268EF.mo2002o0(lk0, long, long, java.io.IOException, int):fk0");
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: v */
    public final void mo2004v(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2) {
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        AbstractC11368v30 abstractC11368v30 = (AbstractC11368v30) c10359nA0.f38163f;
        Uri uri = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        if (abstractC11368v30 instanceof C10728q30) {
            m2105f((C10728q30) abstractC11368v30, c9535gk0);
            this.f2576l.f3102f.m8474L(c9535gk0, 4);
        } else {
            C10103lA0 c10103lA0M22367b = C10103lA0.m22367b("Loaded playlist has unexpected type.", null);
            this.f2574j = c10103lA0M22367b;
            this.f2576l.f3102f.m8478P(c9535gk0, 4, c10103lA0M22367b, true);
        }
        this.f2576l.f3099c.getClass();
    }
}
