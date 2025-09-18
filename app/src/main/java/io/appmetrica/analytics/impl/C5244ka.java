package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.locationapi.internal.LocationClient;

/* renamed from: io.appmetrica.analytics.impl.ka */
/* loaded from: classes2.dex */
public final class C5244ka {

    /* renamed from: C */
    public static volatile C5244ka f32038C;

    /* renamed from: a */
    public final Context f32041a;

    /* renamed from: b */
    public volatile C4422Cf f32042b;

    /* renamed from: c */
    public volatile C4463E6 f32043c;

    /* renamed from: e */
    public volatile C4962Z2 f32045e;

    /* renamed from: f */
    public volatile C4450Di f32046f;

    /* renamed from: g */
    public volatile C4791S f32047g;

    /* renamed from: h */
    public volatile C5011b2 f32048h;

    /* renamed from: i */
    public volatile PlatformIdentifiers f32049i;

    /* renamed from: j */
    public volatile C4615Ke f32050j;

    /* renamed from: k */
    public volatile C4748Q3 f32051k;

    /* renamed from: l */
    public volatile C5398qe f32052l;

    /* renamed from: m */
    public volatile C5557wn f32053m;

    /* renamed from: n */
    public volatile C5502ui f32054n;

    /* renamed from: o */
    public volatile C5620zb f32055o;

    /* renamed from: p */
    public C4402Bk f32056p;

    /* renamed from: r */
    public volatile C4376Aj f32058r;

    /* renamed from: w */
    public volatile InterfaceC4443Db f32063w;

    /* renamed from: x */
    public volatile C5256km f32064x;

    /* renamed from: y */
    public volatile C5504uk f32065y;

    /* renamed from: z */
    public volatile C4948Yc f32066z;

    /* renamed from: q */
    public final C5219ja f32057q = new C5219ja();

    /* renamed from: s */
    public final C4419Cc f32059s = new C4419Cc();

    /* renamed from: t */
    public final C4469Ec f32060t = new C4469Ec();

    /* renamed from: u */
    public final C5205il f32061u = new C5205il();

    /* renamed from: v */
    public final C5378pj f32062v = new C5378pj();

    /* renamed from: A */
    public final C5297md f32039A = new C5297md();

    /* renamed from: B */
    public final UtilityServiceProvider f32040B = new UtilityServiceProvider();

    /* renamed from: d */
    public final C5503uj f32044d = new C5503uj();

    public C5244ka(Context context) {
        this.f32041a = context;
    }

    /* renamed from: a */
    public static void m20613a(Context context) {
        if (f32038C == null) {
            synchronized (C5244ka.class) {
                try {
                    if (f32038C == null) {
                        f32038C = new C5244ka(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: h */
    public static C5244ka m20614h() {
        return f32038C;
    }

    /* renamed from: A */
    public final synchronized C5557wn m20615A() {
        try {
            if (this.f32053m == null) {
                this.f32053m = new C5557wn(this.f32041a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f32053m;
    }

    /* renamed from: B */
    public final void m20616B() {
        if (this.f32050j == null) {
            synchronized (this) {
                try {
                    if (this.f32050j == null) {
                        AbstractC4813Sl abstractC4813SlM19787a = C4789Rl.m19787a(C5498ue.class);
                        Context context = this.f32041a;
                        ProtobufStateStorage<Object> protobufStateStorageMo19602a = abstractC4813SlM19787a.mo19602a(context, abstractC4813SlM19787a.mo19603c(context));
                        C5498ue c5498ue = (C5498ue) protobufStateStorageMo19602a.read();
                        this.f32050j = new C4615Ke(this.f32041a, protobufStateStorageMo19602a, new C4396Be(), new C5448se(c5498ue), new C4591Je(), new C4371Ae(this.f32041a), new C4495Fe(m20614h().m20638w()), new C5523ve(), c5498ue, "[PreloadInfoStorage]");
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    public final C5011b2 m20618b() {
        C5011b2 c5011b2 = this.f32048h;
        if (c5011b2 == null) {
            synchronized (this) {
                try {
                    c5011b2 = this.f32048h;
                    if (c5011b2 == null) {
                        c5011b2 = new C5011b2(this.f32041a, AbstractC5036c2.m20209a());
                        this.f32048h = c5011b2;
                    }
                } finally {
                }
            }
        }
        return c5011b2;
    }

    /* renamed from: c */
    public final C5161h2 m20619c() {
        return m20624i().f32918b;
    }

    /* renamed from: d */
    public final C4748Q3 m20620d() {
        if (this.f32051k == null) {
            synchronized (this) {
                try {
                    if (this.f32051k == null) {
                        AbstractC4813Sl abstractC4813SlM19787a = C4789Rl.m19787a(C4580J3.class);
                        Context context = this.f32041a;
                        ProtobufStateStorage<Object> protobufStateStorageMo19602a = abstractC4813SlM19787a.mo19602a(context, abstractC4813SlM19787a.mo19603c(context));
                        this.f32051k = new C4748Q3(this.f32041a, protobufStateStorageMo19602a, new C4771R3(), new C4460E3(), new C4843U3(), new C5227ji(this.f32041a), new C4795S3(m20638w()), new C4484F3(), (C4580J3) protobufStateStorageMo19602a.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f32051k;
    }

    /* renamed from: e */
    public final Context m20621e() {
        return this.f32041a;
    }

    /* renamed from: f */
    public final C4463E6 m20622f() {
        if (this.f32043c == null) {
            synchronized (this) {
                try {
                    if (this.f32043c == null) {
                        this.f32043c = new C4463E6(new C4438D6(m20638w()));
                    }
                } finally {
                }
            }
        }
        return this.f32043c;
    }

    /* renamed from: g */
    public final PermissionExtractor m20623g() {
        C5504uk c5504uk = this.f32065y;
        if (c5504uk != null) {
            return c5504uk;
        }
        synchronized (this) {
            try {
                C5504uk c5504uk2 = this.f32065y;
                if (c5504uk2 != null) {
                    return c5504uk2;
                }
                C5504uk c5504uk3 = new C5504uk(m20628m().f29867c.getAskForPermissionStrategy());
                this.f32065y = c5504uk3;
                return c5504uk3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final C5620zb m20624i() {
        C5620zb c5620zb = this.f32055o;
        if (c5620zb == null) {
            synchronized (this) {
                try {
                    c5620zb = this.f32055o;
                    if (c5620zb == null) {
                        c5620zb = new C5620zb(new C4890W2(this.f32041a, this.f32044d.m21138a()), new C5161h2());
                        this.f32055o = c5620zb;
                    }
                } finally {
                }
            }
        }
        return c5620zb;
    }

    /* renamed from: j */
    public final InterfaceC4443Db m20625j() {
        InterfaceC4443Db c4492Fb = this.f32063w;
        if (c4492Fb == null) {
            synchronized (this) {
                try {
                    c4492Fb = this.f32063w;
                    if (c4492Fb == null) {
                        Context context = this.f32041a;
                        LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                        c4492Fb = locationClient == null ? new C4492Fb() : new C4468Eb(context, new C4612Kb(), locationClient);
                        this.f32063w = c4492Fb;
                    }
                } finally {
                }
            }
        }
        return c4492Fb;
    }

    /* renamed from: k */
    public final InterfaceC4443Db m20626k() {
        return m20625j();
    }

    /* renamed from: l */
    public final C4469Ec m20627l() {
        return this.f32060t;
    }

    /* renamed from: m */
    public final C4376Aj m20628m() {
        C4376Aj c4376Aj = this.f32058r;
        if (c4376Aj == null) {
            synchronized (this) {
                try {
                    c4376Aj = this.f32058r;
                    if (c4376Aj == null) {
                        c4376Aj = new C4376Aj();
                        this.f32058r = c4376Aj;
                    }
                } finally {
                }
            }
        }
        return c4376Aj;
    }

    /* renamed from: n */
    public final C4948Yc m20629n() {
        C4948Yc c4948Yc = this.f32066z;
        if (c4948Yc == null) {
            synchronized (this) {
                try {
                    c4948Yc = this.f32066z;
                    if (c4948Yc == null) {
                        c4948Yc = new C4948Yc(this.f32041a, new C5232jn());
                        this.f32066z = c4948Yc;
                    }
                } finally {
                }
            }
        }
        return c4948Yc;
    }

    /* renamed from: o */
    public final C5297md m20630o() {
        return this.f32039A;
    }

    /* renamed from: p */
    public final PlatformIdentifiers m20631p() {
        PlatformIdentifiers platformIdentifiers = this.f32049i;
        if (platformIdentifiers == null) {
            synchronized (this) {
                try {
                    platformIdentifiers = this.f32049i;
                    if (platformIdentifiers == null) {
                        platformIdentifiers = new PlatformIdentifiers(m20637v(), m20618b());
                        this.f32049i = platformIdentifiers;
                    }
                } finally {
                }
            }
        }
        return platformIdentifiers;
    }

    /* renamed from: q */
    public final C4615Ke m20632q() {
        m20616B();
        return this.f32050j;
    }

    /* renamed from: r */
    public final C4422Cf m20633r() {
        if (this.f32042b == null) {
            synchronized (this) {
                try {
                    if (this.f32042b == null) {
                        this.f32042b = new C4422Cf(this.f32041a, f32038C.m20615A().f32784c);
                    }
                } finally {
                }
            }
        }
        return this.f32042b;
    }

    /* renamed from: s */
    public final C5502ui m20634s() {
        C5502ui c5502ui = this.f32054n;
        if (c5502ui == null) {
            synchronized (this) {
                try {
                    c5502ui = this.f32054n;
                    if (c5502ui == null) {
                        c5502ui = new C5502ui(this.f32041a);
                        this.f32054n = c5502ui;
                    }
                } finally {
                }
            }
        }
        return c5502ui;
    }

    /* renamed from: t */
    public final synchronized C4450Di m20635t() {
        return this.f32046f;
    }

    /* renamed from: u */
    public final C5503uj m20636u() {
        return this.f32044d;
    }

    /* renamed from: v */
    public final C4791S m20637v() {
        C4791S c4791s = this.f32047g;
        if (c4791s == null) {
            synchronized (this) {
                try {
                    c4791s = this.f32047g;
                    if (c4791s == null) {
                        c4791s = new C4791S(new C4720P(), new C4648M(), new C4624L(), this.f32044d.m21138a(), "ServiceInternal");
                        this.f32061u.m20579a(c4791s);
                        this.f32047g = c4791s;
                    }
                } finally {
                }
            }
        }
        return c4791s;
    }

    /* renamed from: w */
    public final C5398qe m20638w() {
        if (this.f32052l == null) {
            synchronized (this) {
                try {
                    if (this.f32052l == null) {
                        this.f32052l = new C5398qe(C4966Z6.m20064a(this.f32041a).m20069c());
                    }
                } finally {
                }
            }
        }
        return this.f32052l;
    }

    /* renamed from: x */
    public final synchronized InterfaceC4794S2 m20639x() {
        try {
            if (this.f32056p == null) {
                C4402Bk c4402Bk = new C4402Bk(this.f32041a);
                this.f32056p = c4402Bk;
                this.f32061u.m20579a(c4402Bk);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f32056p;
    }

    /* renamed from: y */
    public final C5205il m20640y() {
        return this.f32061u;
    }

    /* renamed from: z */
    public final C5256km m20641z() {
        C5256km c5256km = this.f32064x;
        if (c5256km == null) {
            synchronized (this) {
                try {
                    c5256km = this.f32064x;
                    if (c5256km == null) {
                        c5256km = new C5256km(this.f32041a);
                        this.f32064x = c5256km;
                    }
                } finally {
                }
            }
        }
        return c5256km;
    }

    /* renamed from: a */
    public final WaitForActivationDelayBarrier m20617a() {
        return this.f32040B.getActivationBarrier();
    }
}
