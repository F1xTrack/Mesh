package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: FF */
/* loaded from: classes.dex */
public final class C0331FF implements InterfaceC9919jk0 {

    /* renamed from: o */
    public static final C1686an f3096o = new C1686an();

    /* renamed from: a */
    public final C7391Bm1 f3097a;

    /* renamed from: b */
    public final InterfaceC11750y30 f3098b;

    /* renamed from: c */
    public final C3979eG f3099c;

    /* renamed from: f */
    public C1356VY f3102f;

    /* renamed from: g */
    public C8539Xo1 f3103g;

    /* renamed from: h */
    public Handler f3104h;

    /* renamed from: i */
    public C10856r30 f3105i;

    /* renamed from: j */
    public C11240u30 f3106j;

    /* renamed from: k */
    public Uri f3107k;

    /* renamed from: l */
    public C10728q30 f3108l;

    /* renamed from: m */
    public boolean f3109m;

    /* renamed from: e */
    public final CopyOnWriteArrayList f3101e = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final HashMap f3100d = new HashMap();

    /* renamed from: n */
    public long f3110n = -9223372036854775807L;

    public C0331FF(C7391Bm1 c7391Bm1, C3979eG c3979eG, InterfaceC11750y30 interfaceC11750y30) {
        this.f3097a = c7391Bm1;
        this.f3098b = interfaceC11750y30;
        this.f3099c = c3979eG;
    }

    /* renamed from: a */
    public final C10728q30 m2560a(boolean z, Uri uri) {
        HashMap map = this.f3100d;
        C10728q30 c10728q30 = ((C0268EF) map.get(uri)).f2568d;
        if (c10728q30 != null && z) {
            if (!uri.equals(this.f3107k)) {
                List list = this.f3106j.f43457e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((C11112t30) list.get(i)).f42814a)) {
                        C10728q30 c10728q302 = this.f3108l;
                        if (c10728q302 == null || !c10728q302.f40551o) {
                            this.f3107k = uri;
                            C0268EF c0268ef = (C0268EF) map.get(uri);
                            C10728q30 c10728q303 = c0268ef.f2568d;
                            if (c10728q303 == null || !c10728q303.f40551o) {
                                c0268ef.m2104e(m2561b(uri));
                            } else {
                                this.f3108l = c10728q303;
                                this.f3105i.m24150w(c10728q303);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            C0268EF c0268ef2 = (C0268EF) map.get(uri);
            C10728q30 c10728q304 = c0268ef2.f2568d;
            if (!c0268ef2.f2575k) {
                c0268ef2.f2575k = true;
                if (c10728q304 != null && !c10728q304.f40551o) {
                    c0268ef2.m2102c(true);
                }
            }
        }
        return c10728q30;
    }

    /* renamed from: b */
    public final Uri m2561b(Uri uri) {
        C10216m30 c10216m30;
        C10728q30 c10728q30 = this.f3108l;
        if (c10728q30 == null || !c10728q30.f40558v.f39761e || (c10216m30 = (C10216m30) c10728q30.f40556t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c10216m30.f37435b));
        int i = c10216m30.f37436c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    /* renamed from: c */
    public final boolean m2562c(Uri uri) {
        int i;
        C0268EF c0268ef = (C0268EF) this.f3100d.get(uri);
        if (c0268ef.f2568d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, AbstractC7485Dh1.m1819d0(c0268ef.f2568d.f40557u));
        C10728q30 c10728q30 = c0268ef.f2568d;
        return c10728q30.f40551o || (i = c10728q30.f40540d) == 2 || i == 1 || c0268ef.f2569e + jMax > jElapsedRealtime;
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: m */
    public final void mo2001m(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, boolean z) {
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        long j3 = c10359nA0.f38158a;
        Uri uri = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f3099c.getClass();
        this.f3102f.m8472J(c9535gk0, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: o0 */
    public final C9407fk0 mo2002o0(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, IOException iOException, int i) {
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        long j3 = c10359nA0.f38158a;
        Uri uri = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        long jMo17892e = this.f3099c.mo17892e(new C0986Pf(iOException, i, 9));
        boolean z = jMo17892e == -9223372036854775807L;
        this.f3102f.m8478P(c9535gk0, c10359nA0.f38160c, iOException, z);
        return z ? C8539Xo1.f13979i : new C9407fk0(0, jMo17892e, false);
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: v */
    public final void mo2004v(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2) {
        C11240u30 c11240u30;
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        AbstractC11368v30 abstractC11368v30 = (AbstractC11368v30) c10359nA0.f38163f;
        boolean z = abstractC11368v30 instanceof C10728q30;
        if (z) {
            String str = abstractC11368v30.f44119a;
            C11240u30 c11240u302 = C11240u30.f43455n;
            Uri uri = Uri.parse(str);
            C6623pX c6623pX = new C6623pX();
            c6623pX.f40150a = "0";
            c6623pX.f40160k = AbstractC8544Xr0.m9171n("application/x-mpegURL");
            c11240u30 = new C11240u30("", Collections.emptyList(), Collections.singletonList(new C11112t30(uri, new C6686qX(c6623pX), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            c11240u30 = (C11240u30) abstractC11368v30;
        }
        this.f3106j = c11240u30;
        this.f3107k = ((C11112t30) c11240u30.f43457e.get(0)).f42814a;
        this.f3101e.add(new C0205DF(this));
        List list = c11240u30.f43456d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list.get(i);
            this.f3100d.put(uri2, new C0268EF(this, uri2));
        }
        Uri uri3 = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        C0268EF c0268ef = (C0268EF) this.f3100d.get(this.f3107k);
        if (z) {
            c0268ef.m2105f((C10728q30) abstractC11368v30, c9535gk0);
        } else {
            c0268ef.m2102c(false);
        }
        this.f3099c.getClass();
        this.f3102f.m8474L(c9535gk0, 4);
    }
}
