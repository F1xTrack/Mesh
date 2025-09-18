package defpackage;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: nF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6039nF implements RL {
    public final UUID a;
    public final FQ b;
    public final C1857Xo1 c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean g;
    public final C0999Mo1 h;
    public final C3547eG i;
    public final QQ0 j;
    public final long k;
    public final ArrayList l;
    public final Set m;
    public final Set n;
    public int o;
    public HQ p;
    public C5466kF q;
    public C5466kF r;
    public Looper s;
    public Handler t;
    public NB0 u;
    public volatile F3 v;

    public C6039nF(UUID uuid, FQ fq, C1857Xo1 c1857Xo1, HashMap map, boolean z, int[] iArr, boolean z2, C3547eG c3547eG, long j) {
        uuid.getClass();
        YN1.b("Use C.CLEARKEY_UUID instead", !AbstractC1063Nk.b.equals(uuid));
        this.a = uuid;
        this.b = fq;
        this.c = c1857Xo1;
        this.d = map;
        this.e = z;
        this.f = iArr;
        this.g = z2;
        this.i = c3547eG;
        this.h = new C0999Mo1(9);
        this.j = new QQ0(this);
        this.l = new ArrayList();
        this.m = Collections.newSetFromMap(new IdentityHashMap());
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.k = j;
    }

    public static boolean c(C5466kF c5466kF) {
        c5466kF.o();
        if (c5466kF.o != 1) {
            return false;
        }
        KL klC = c5466kF.c();
        klC.getClass();
        Throwable cause = klC.getCause();
        return (cause instanceof ResourceBusyException) || AbstractC3498e02.d(cause);
    }

    public static ArrayList h(JL jl, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(jl.d);
        for (int i = 0; i < jl.d; i++) {
            IL il = jl.a[i];
            if ((il.a(uuid) || (AbstractC1063Nk.c.equals(uuid) && il.a(AbstractC1063Nk.b))) && (il.e != null || z)) {
                arrayList.add(il);
            }
        }
        return arrayList;
    }

    @Override // defpackage.RL
    public final LL a(OL ol, C6666qX c6666qX) {
        l(false);
        YN1.f(this.o > 0);
        YN1.h(this.s);
        return b(this.s, ol, c6666qX, true);
    }

    public final LL b(Looper looper, OL ol, C6666qX c6666qX, boolean z) {
        if (this.v == null) {
            this.v = new F3(this, looper, 3);
        }
        JL jl = c6666qX.q;
        int i = 0;
        C5466kF c5466kFG = null;
        if (jl == null) {
            int iH = AbstractC1865Xr0.h(c6666qX.m);
            HQ hq = this.p;
            hq.getClass();
            if (hq.u() == 2 && SY.c) {
                return null;
            }
            int[] iArr = this.f;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iH) {
                    break;
                }
                i++;
            }
            if (i == -1 || hq.u() == 1) {
                return null;
            }
            C5466kF c5466kF = this.q;
            if (c5466kF == null) {
                N70 n70 = P70.b;
                C5466kF c5466kFG2 = g(C3769fQ0.e, true, null, z);
                this.l.add(c5466kFG2);
                this.q = c5466kFG2;
            } else {
                c5466kF.e(null);
            }
            return this.q;
        }
        ArrayList arrayListH = h(jl, this.a, false);
        if (arrayListH.isEmpty()) {
            C5657lF c5657lF = new C5657lF("Media does not support uuid: " + this.a);
            AbstractC6789rA1.e("DRM error", c5657lF);
            if (ol != null) {
                ol.d(c5657lF);
            }
            return new C3956gP(new KL(AuthCode.StatusCode.CERT_FINGERPRINT_ERROR, c5657lF));
        }
        if (this.e) {
            Iterator it = this.l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5466kF c5466kF2 = (C5466kF) it.next();
                if (AbstractC0277Dh1.a(c5466kF2.a, arrayListH)) {
                    c5466kFG = c5466kF2;
                    break;
                }
            }
        } else {
            c5466kFG = this.r;
        }
        if (c5466kFG == null) {
            c5466kFG = g(arrayListH, false, ol, z);
            if (!this.e) {
                this.r = c5466kFG;
            }
            this.l.add(c5466kFG);
        } else {
            c5466kFG.e(ol);
        }
        return c5466kFG;
    }

    @Override // defpackage.RL
    public final QL d(OL ol, C6666qX c6666qX) {
        YN1.f(this.o > 0);
        YN1.h(this.s);
        C5848mF c5848mF = new C5848mF(this, ol);
        Handler handler = this.t;
        handler.getClass();
        handler.post(new RunnableC3529eA(c5848mF, 6, c6666qX));
        return c5848mF;
    }

    @Override // defpackage.RL
    public final void e() {
        l(true);
        int i = this.o;
        this.o = i + 1;
        if (i != 0) {
            return;
        }
        if (this.p == null) {
            HQ hqK = this.b.k(this.a);
            this.p = hqK;
            hqK.k(new C1304Qm0(13, this));
        } else {
            if (this.k == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.l;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((C5466kF) arrayList.get(i2)).e(null);
                i2++;
            }
        }
    }

    public final C5466kF f(List list, boolean z, OL ol) {
        this.p.getClass();
        boolean z2 = this.g | z;
        HQ hq = this.p;
        Looper looper = this.s;
        looper.getClass();
        NB0 nb0 = this.u;
        nb0.getClass();
        C5466kF c5466kF = new C5466kF(this.a, hq, this.h, this.j, list, z2, z, null, this.d, this.c, looper, this.i, nb0);
        c5466kF.e(ol);
        if (this.k != -9223372036854775807L) {
            c5466kF.e(null);
        }
        return c5466kF;
    }

    public final C5466kF g(List list, boolean z, OL ol, boolean z2) {
        C5466kF c5466kFF = f(list, z, ol);
        boolean zC = c(c5466kFF);
        long j = this.k;
        Set set = this.n;
        if (zC && !set.isEmpty()) {
            AbstractC5740lg1 it = V70.u(set).iterator();
            while (it.hasNext()) {
                ((LL) it.next()).d(null);
            }
            c5466kFF.d(ol);
            if (j != -9223372036854775807L) {
                c5466kFF.d(null);
            }
            c5466kFF = f(list, z, ol);
        }
        if (!c(c5466kFF) || !z2) {
            return c5466kFF;
        }
        Set set2 = this.m;
        if (set2.isEmpty()) {
            return c5466kFF;
        }
        AbstractC5740lg1 it2 = V70.u(set2).iterator();
        while (it2.hasNext()) {
            ((C5848mF) it2.next()).release();
        }
        if (!set.isEmpty()) {
            AbstractC5740lg1 it3 = V70.u(set).iterator();
            while (it3.hasNext()) {
                ((LL) it3.next()).d(null);
            }
        }
        c5466kFF.d(ol);
        if (j != -9223372036854775807L) {
            c5466kFF.d(null);
        }
        return f(list, z, ol);
    }

    @Override // defpackage.RL
    public final void i(Looper looper, NB0 nb0) {
        synchronized (this) {
            try {
                Looper looper2 = this.s;
                if (looper2 == null) {
                    this.s = looper;
                    this.t = new Handler(looper);
                } else {
                    YN1.f(looper2 == looper);
                    this.t.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.u = nb0;
    }

    @Override // defpackage.RL
    public final int j(C6666qX c6666qX) {
        String str;
        l(false);
        HQ hq = this.p;
        hq.getClass();
        int iU = hq.u();
        JL jl = c6666qX.q;
        if (jl == null) {
            int iH = AbstractC1865Xr0.h(c6666qX.m);
            int i = 0;
            while (true) {
                int[] iArr = this.f;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iH) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                return iU;
            }
            return 0;
        }
        UUID uuid = this.a;
        if (!h(jl, uuid, true).isEmpty()) {
            str = jl.c;
            if (str == null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    if (AbstractC0277Dh1.a >= 25) {
                        return iU;
                    }
                } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                    return iU;
                }
            }
        } else if (jl.d == 1 && jl.a[0].a(AbstractC1063Nk.b)) {
            AbstractC6789rA1.h("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
            str = jl.c;
            return str == null ? iU : iU;
        }
        return 1;
    }

    public final void k() {
        if (this.p != null && this.o == 0 && this.l.isEmpty() && this.m.isEmpty()) {
            HQ hq = this.p;
            hq.getClass();
            hq.release();
            this.p = null;
        }
    }

    public final void l(boolean z) {
        if (z && this.s == null) {
            AbstractC6789rA1.i("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.s;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            AbstractC6789rA1.i("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.s.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.RL
    public final void release() {
        l(true);
        int i = this.o - 1;
        this.o = i;
        if (i != 0) {
            return;
        }
        if (this.k != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.l);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C5466kF) arrayList.get(i2)).d(null);
            }
        }
        AbstractC5740lg1 it = V70.u(this.m).iterator();
        while (it.hasNext()) {
            ((C5848mF) it.next()).release();
        }
        k();
    }
}
