package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class FF implements InterfaceC5369jk0 {
    public static final C2199an o = new C2199an();
    public final C0136Bm1 a;
    public final InterfaceC8101y30 b;
    public final C3547eG c;
    public VY f;
    public C1857Xo1 g;
    public Handler h;
    public C6766r30 i;
    public C7339u30 j;
    public Uri k;
    public C6576q30 l;
    public boolean m;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long n = -9223372036854775807L;

    public FF(C0136Bm1 c0136Bm1, C3547eG c3547eG, InterfaceC8101y30 interfaceC8101y30) {
        this.a = c0136Bm1;
        this.b = interfaceC8101y30;
        this.c = c3547eG;
    }

    public final C6576q30 a(boolean z, Uri uri) {
        HashMap map = this.d;
        C6576q30 c6576q30 = ((EF) map.get(uri)).d;
        if (c6576q30 != null && z) {
            if (!uri.equals(this.k)) {
                List list = this.j.e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((C7148t30) list.get(i)).a)) {
                        C6576q30 c6576q302 = this.l;
                        if (c6576q302 == null || !c6576q302.o) {
                            this.k = uri;
                            EF ef = (EF) map.get(uri);
                            C6576q30 c6576q303 = ef.d;
                            if (c6576q303 == null || !c6576q303.o) {
                                ef.e(b(uri));
                            } else {
                                this.l = c6576q303;
                                this.i.w(c6576q303);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            EF ef2 = (EF) map.get(uri);
            C6576q30 c6576q304 = ef2.d;
            if (!ef2.k) {
                ef2.k = true;
                if (c6576q304 != null && !c6576q304.o) {
                    ef2.c(true);
                }
            }
        }
        return c6576q30;
    }

    public final Uri b(Uri uri) {
        C5812m30 c5812m30;
        C6576q30 c6576q30 = this.l;
        if (c6576q30 == null || !c6576q30.v.e || (c5812m30 = (C5812m30) c6576q30.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c5812m30.b));
        int i = c5812m30.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i;
        EF ef = (EF) this.d.get(uri);
        if (ef.d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, AbstractC0277Dh1.d0(ef.d.u));
        C6576q30 c6576q30 = ef.d;
        return c6576q30.o || (i = c6576q30.d) == 2 || i == 1 || ef.e + jMax > jElapsedRealtime;
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void m(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, boolean z) {
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        long j3 = c6025nA0.a;
        Uri uri = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.c.getClass();
        this.f.J(c4020gk0, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.InterfaceC5369jk0
    public final C3829fk0 o0(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, IOException iOException, int i) {
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        long j3 = c6025nA0.a;
        Uri uri = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        long jE = this.c.e(new C1204Pf(iOException, i, 9));
        boolean z = jE == -9223372036854775807L;
        this.f.P(c4020gk0, c6025nA0.c, iOException, z);
        return z ? C1857Xo1.i : new C3829fk0(0, jE, false);
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void v(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2) {
        C7339u30 c7339u30;
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        AbstractC7530v30 abstractC7530v30 = (AbstractC7530v30) c6025nA0.f;
        boolean z = abstractC7530v30 instanceof C6576q30;
        if (z) {
            String str = abstractC7530v30.a;
            C7339u30 c7339u302 = C7339u30.n;
            Uri uri = Uri.parse(str);
            C6475pX c6475pX = new C6475pX();
            c6475pX.a = "0";
            c6475pX.k = AbstractC1865Xr0.n("application/x-mpegURL");
            c7339u30 = new C7339u30("", Collections.emptyList(), Collections.singletonList(new C7148t30(uri, new C6666qX(c6475pX), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            c7339u30 = (C7339u30) abstractC7530v30;
        }
        this.j = c7339u30;
        this.k = ((C7148t30) c7339u30.e.get(0)).a;
        this.e.add(new DF(this));
        List list = c7339u30.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list.get(i);
            this.d.put(uri2, new EF(this, uri2));
        }
        Uri uri3 = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        EF ef = (EF) this.d.get(this.k);
        if (z) {
            ef.f((C6576q30) abstractC7530v30, c4020gk0);
        } else {
            ef.c(false);
        }
        this.c.getClass();
        this.f.L(c4020gk0, 4);
    }
}
