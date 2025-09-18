package p000;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: nF */
/* loaded from: classes.dex */
public final class C6477nF implements InterfaceC1091RL {

    /* renamed from: a */
    public final UUID f38192a;

    /* renamed from: b */
    public final InterfaceC0342FQ f38193b;

    /* renamed from: c */
    public final C8539Xo1 f38194c;

    /* renamed from: d */
    public final HashMap f38195d;

    /* renamed from: e */
    public final boolean f38196e;

    /* renamed from: f */
    public final int[] f38197f;

    /* renamed from: g */
    public final boolean f38198g;

    /* renamed from: h */
    public final C7967Mo1 f38199h;

    /* renamed from: i */
    public final C3979eG f38200i;

    /* renamed from: j */
    public final QQ0 f38201j;

    /* renamed from: k */
    public final long f38202k;

    /* renamed from: l */
    public final ArrayList f38203l;

    /* renamed from: m */
    public final Set f38204m;

    /* renamed from: n */
    public final Set f38205n;

    /* renamed from: o */
    public int f38206o;

    /* renamed from: p */
    public InterfaceC0468HQ f38207p;

    /* renamed from: q */
    public C6288kF f38208q;

    /* renamed from: r */
    public C6288kF f38209r;

    /* renamed from: s */
    public Looper f38210s;

    /* renamed from: t */
    public Handler f38211t;

    /* renamed from: u */
    public NB0 f38212u;

    /* renamed from: v */
    public volatile HandlerC0319F3 f38213v;

    public C6477nF(UUID uuid, InterfaceC0342FQ interfaceC0342FQ, C8539Xo1 c8539Xo1, HashMap map, boolean z, int[] iArr, boolean z2, C3979eG c3979eG, long j) {
        uuid.getClass();
        YN1.m9277b("Use C.CLEARKEY_UUID instead", !AbstractC0865Nk.f7978b.equals(uuid));
        this.f38192a = uuid;
        this.f38193b = interfaceC0342FQ;
        this.f38194c = c8539Xo1;
        this.f38195d = map;
        this.f38196e = z;
        this.f38197f = iArr;
        this.f38198g = z2;
        this.f38200i = c3979eG;
        this.f38199h = new C7967Mo1(9);
        this.f38201j = new QQ0(this);
        this.f38203l = new ArrayList();
        this.f38204m = Collections.newSetFromMap(new IdentityHashMap());
        this.f38205n = Collections.newSetFromMap(new IdentityHashMap());
        this.f38202k = j;
    }

    /* renamed from: c */
    public static boolean m23104c(C6288kF c6288kF) {
        c6288kF.m22181o();
        if (c6288kF.f36384o != 1) {
            return false;
        }
        C0652KL c0652klMo4950c = c6288kF.mo4950c();
        c0652klMo4950c.getClass();
        Throwable cause = c0652klMo4950c.getCause();
        return (cause instanceof ResourceBusyException) || AbstractC9185e02.m17815d(cause);
    }

    /* renamed from: h */
    public static ArrayList m23105h(C0589JL c0589jl, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c0589jl.f5488d);
        for (int i = 0; i < c0589jl.f5488d; i++) {
            C0526IL c0526il = c0589jl.f5485a[i];
            if ((c0526il.m3826a(uuid) || (AbstractC0865Nk.f7979c.equals(uuid) && c0526il.m3826a(AbstractC0865Nk.f7978b))) && (c0526il.f4902e != null || z)) {
                arrayList.add(c0526il);
            }
        }
        return arrayList;
    }

    @Override // p000.InterfaceC1091RL
    /* renamed from: a */
    public final InterfaceC0715LL mo6995a(C0903OL c0903ol, C6686qX c6686qX) {
        m23110l(false);
        YN1.m9281f(this.f38206o > 0);
        YN1.m9283h(this.f38210s);
        return m23106b(this.f38210s, c0903ol, c6686qX, true);
    }

    /* renamed from: b */
    public final InterfaceC0715LL m23106b(Looper looper, C0903OL c0903ol, C6686qX c6686qX, boolean z) {
        if (this.f38213v == null) {
            this.f38213v = new HandlerC0319F3(this, looper, 3);
        }
        C0589JL c0589jl = c6686qX.f40978q;
        int i = 0;
        C6288kF c6288kFM23108g = null;
        if (c0589jl == null) {
            int iM9165h = AbstractC8544Xr0.m9165h(c6686qX.f40974m);
            InterfaceC0468HQ interfaceC0468HQ = this.f38207p;
            interfaceC0468HQ.getClass();
            if (interfaceC0468HQ.mo3421u() == 2 && C1167SY.f10846c) {
                return null;
            }
            int[] iArr = this.f38197f;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iM9165h) {
                    break;
                }
                i++;
            }
            if (i == -1 || interfaceC0468HQ.mo3421u() == 1) {
                return null;
            }
            C6288kF c6288kF = this.f38208q;
            if (c6288kF == null) {
                N70 n70 = P70.f8867b;
                C6288kF c6288kFM23108g2 = m23108g(C9367fQ0.f27184e, true, null, z);
                this.f38203l.add(c6288kFM23108g2);
                this.f38208q = c6288kFM23108g2;
            } else {
                c6288kF.mo4952e(null);
            }
            return this.f38208q;
        }
        ArrayList arrayListM23105h = m23105h(c0589jl, this.f38192a, false);
        if (arrayListM23105h.isEmpty()) {
            C6351lF c6351lF = new C6351lF("Media does not support uuid: " + this.f38192a);
            AbstractC10872rA1.m24172e("DRM error", c6351lF);
            if (c0903ol != null) {
                c0903ol.m6018d(c6351lF);
            }
            return new C4114gP(new C0652KL(AuthCode.StatusCode.CERT_FINGERPRINT_ERROR, c6351lF));
        }
        if (this.f38196e) {
            Iterator it = this.f38203l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6288kF c6288kF2 = (C6288kF) it.next();
                if (AbstractC7485Dh1.m1812a(c6288kF2.f36370a, arrayListM23105h)) {
                    c6288kFM23108g = c6288kF2;
                    break;
                }
            }
        } else {
            c6288kFM23108g = this.f38209r;
        }
        if (c6288kFM23108g == null) {
            c6288kFM23108g = m23108g(arrayListM23105h, false, c0903ol, z);
            if (!this.f38196e) {
                this.f38209r = c6288kFM23108g;
            }
            this.f38203l.add(c6288kFM23108g);
        } else {
            c6288kFM23108g.mo4952e(c0903ol);
        }
        return c6288kFM23108g;
    }

    @Override // p000.InterfaceC1091RL
    /* renamed from: d */
    public final InterfaceC1029QL mo6996d(C0903OL c0903ol, C6686qX c6686qX) {
        YN1.m9281f(this.f38206o > 0);
        YN1.m9283h(this.f38210s);
        C6414mF c6414mF = new C6414mF(this, c0903ol);
        Handler handler = this.f38211t;
        handler.getClass();
        handler.post(new RunnableC3973eA(c6414mF, 6, c6686qX));
        return c6414mF;
    }

    @Override // p000.InterfaceC1091RL
    /* renamed from: e */
    public final void mo6997e() {
        m23110l(true);
        int i = this.f38206o;
        this.f38206o = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f38207p == null) {
            InterfaceC0468HQ interfaceC0468HQMo2631k = this.f38193b.mo2631k(this.f38192a);
            this.f38207p = interfaceC0468HQMo2631k;
            interfaceC0468HQMo2631k.mo3413k(new C8170Qm0(13, this));
        } else {
            if (this.f38202k == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f38203l;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((C6288kF) arrayList.get(i2)).mo4952e(null);
                i2++;
            }
        }
    }

    /* renamed from: f */
    public final C6288kF m23107f(List list, boolean z, C0903OL c0903ol) {
        this.f38207p.getClass();
        boolean z2 = this.f38198g | z;
        InterfaceC0468HQ interfaceC0468HQ = this.f38207p;
        Looper looper = this.f38210s;
        looper.getClass();
        NB0 nb0 = this.f38212u;
        nb0.getClass();
        C6288kF c6288kF = new C6288kF(this.f38192a, interfaceC0468HQ, this.f38199h, this.f38201j, list, z2, z, null, this.f38195d, this.f38194c, looper, this.f38200i, nb0);
        c6288kF.mo4952e(c0903ol);
        if (this.f38202k != -9223372036854775807L) {
            c6288kF.mo4952e(null);
        }
        return c6288kF;
    }

    /* renamed from: g */
    public final C6288kF m23108g(List list, boolean z, C0903OL c0903ol, boolean z2) {
        C6288kF c6288kFM23107f = m23107f(list, z, c0903ol);
        boolean zM23104c = m23104c(c6288kFM23107f);
        long j = this.f38202k;
        Set set = this.f38205n;
        if (zM23104c && !set.isEmpty()) {
            AbstractC10168lg1 it = V70.m8308u(set).iterator();
            while (it.hasNext()) {
                ((InterfaceC0715LL) it.next()).mo4951d(null);
            }
            c6288kFM23107f.mo4951d(c0903ol);
            if (j != -9223372036854775807L) {
                c6288kFM23107f.mo4951d(null);
            }
            c6288kFM23107f = m23107f(list, z, c0903ol);
        }
        if (!m23104c(c6288kFM23107f) || !z2) {
            return c6288kFM23107f;
        }
        Set set2 = this.f38204m;
        if (set2.isEmpty()) {
            return c6288kFM23107f;
        }
        AbstractC10168lg1 it2 = V70.m8308u(set2).iterator();
        while (it2.hasNext()) {
            ((C6414mF) it2.next()).release();
        }
        if (!set.isEmpty()) {
            AbstractC10168lg1 it3 = V70.m8308u(set).iterator();
            while (it3.hasNext()) {
                ((InterfaceC0715LL) it3.next()).mo4951d(null);
            }
        }
        c6288kFM23107f.mo4951d(c0903ol);
        if (j != -9223372036854775807L) {
            c6288kFM23107f.mo4951d(null);
        }
        return m23107f(list, z, c0903ol);
    }

    @Override // p000.InterfaceC1091RL
    /* renamed from: i */
    public final void mo6998i(Looper looper, NB0 nb0) {
        synchronized (this) {
            try {
                Looper looper2 = this.f38210s;
                if (looper2 == null) {
                    this.f38210s = looper;
                    this.f38211t = new Handler(looper);
                } else {
                    YN1.m9281f(looper2 == looper);
                    this.f38211t.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f38212u = nb0;
    }

    @Override // p000.InterfaceC1091RL
    /* renamed from: j */
    public final int mo6999j(C6686qX c6686qX) {
        String str;
        m23110l(false);
        InterfaceC0468HQ interfaceC0468HQ = this.f38207p;
        interfaceC0468HQ.getClass();
        int iMo3421u = interfaceC0468HQ.mo3421u();
        C0589JL c0589jl = c6686qX.f40978q;
        if (c0589jl == null) {
            int iM9165h = AbstractC8544Xr0.m9165h(c6686qX.f40974m);
            int i = 0;
            while (true) {
                int[] iArr = this.f38197f;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iM9165h) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                return iMo3421u;
            }
            return 0;
        }
        UUID uuid = this.f38192a;
        if (!m23105h(c0589jl, uuid, true).isEmpty()) {
            str = c0589jl.f5487c;
            if (str == null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    if (AbstractC7485Dh1.f2166a >= 25) {
                        return iMo3421u;
                    }
                } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                    return iMo3421u;
                }
            }
        } else if (c0589jl.f5488d == 1 && c0589jl.f5485a[0].m3826a(AbstractC0865Nk.f7978b)) {
            AbstractC10872rA1.m24175h("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
            str = c0589jl.f5487c;
            return str == null ? iMo3421u : iMo3421u;
        }
        return 1;
    }

    /* renamed from: k */
    public final void m23109k() {
        if (this.f38207p != null && this.f38206o == 0 && this.f38203l.isEmpty() && this.f38204m.isEmpty()) {
            InterfaceC0468HQ interfaceC0468HQ = this.f38207p;
            interfaceC0468HQ.getClass();
            interfaceC0468HQ.release();
            this.f38207p = null;
        }
    }

    /* renamed from: l */
    public final void m23110l(boolean z) {
        if (z && this.f38210s == null) {
            AbstractC10872rA1.m24176i("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f38210s;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            AbstractC10872rA1.m24176i("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f38210s.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p000.InterfaceC1091RL
    public final void release() {
        m23110l(true);
        int i = this.f38206o - 1;
        this.f38206o = i;
        if (i != 0) {
            return;
        }
        if (this.f38202k != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f38203l);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C6288kF) arrayList.get(i2)).mo4951d(null);
            }
        }
        AbstractC10168lg1 it = V70.m8308u(this.f38204m).iterator();
        while (it.hasNext()) {
            ((C6414mF) it.next()).release();
        }
        m23109k();
    }
}
