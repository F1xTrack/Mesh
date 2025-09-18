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
public final class C4667ka {
    public static volatile C4667ka C;
    public final Context a;
    public volatile Cf b;
    public volatile E6 c;
    public volatile Z2 e;
    public volatile Di f;
    public volatile S g;
    public volatile C4441b2 h;
    public volatile PlatformIdentifiers i;
    public volatile Ke j;
    public volatile Q3 k;
    public volatile C4815qe l;
    public volatile wn m;
    public volatile C4914ui n;
    public volatile C5027zb o;
    public Bk p;
    public volatile Aj r;
    public volatile Db w;
    public volatile C4679km x;
    public volatile C4916uk y;
    public volatile Yc z;
    public final C4643ja q = new C4643ja();
    public final Cc s = new Cc();
    public final Ec t = new Ec();
    public final C4630il u = new C4630il();
    public final C4796pj v = new C4796pj();
    public final C4718md A = new C4718md();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final C4915uj d = new C4915uj();

    public C4667ka(Context context) {
        this.a = context;
    }

    public static void a(Context context) {
        if (C == null) {
            synchronized (C4667ka.class) {
                try {
                    if (C == null) {
                        C = new C4667ka(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    public static C4667ka h() {
        return C;
    }

    public final synchronized wn A() {
        try {
            if (this.m == null) {
                this.m = new wn(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m;
    }

    public final void B() {
        if (this.j == null) {
            synchronized (this) {
                try {
                    if (this.j == null) {
                        Sl slA = Rl.a(C4910ue.class);
                        Context context = this.a;
                        ProtobufStateStorage<Object> protobufStateStorageA = slA.a(context, slA.c(context));
                        C4910ue c4910ue = (C4910ue) protobufStateStorageA.read();
                        this.j = new Ke(this.a, protobufStateStorageA, new Be(), new C4862se(c4910ue), new Je(), new Ae(this.a), new Fe(h().w()), new C4934ve(), c4910ue, "[PreloadInfoStorage]");
                    }
                } finally {
                }
            }
        }
    }

    public final C4441b2 b() {
        C4441b2 c4441b2 = this.h;
        if (c4441b2 == null) {
            synchronized (this) {
                try {
                    c4441b2 = this.h;
                    if (c4441b2 == null) {
                        c4441b2 = new C4441b2(this.a, AbstractC4466c2.a());
                        this.h = c4441b2;
                    }
                } finally {
                }
            }
        }
        return c4441b2;
    }

    public final C4588h2 c() {
        return i().b;
    }

    public final Q3 d() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        Sl slA = Rl.a(J3.class);
                        Context context = this.a;
                        ProtobufStateStorage<Object> protobufStateStorageA = slA.a(context, slA.c(context));
                        this.k = new Q3(this.a, protobufStateStorageA, new R3(), new E3(), new U3(), new C4651ji(this.a), new S3(w()), new F3(), (J3) protobufStateStorageA.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.k;
    }

    public final Context e() {
        return this.a;
    }

    public final E6 f() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = new E6(new D6(w()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final PermissionExtractor g() {
        C4916uk c4916uk = this.y;
        if (c4916uk != null) {
            return c4916uk;
        }
        synchronized (this) {
            try {
                C4916uk c4916uk2 = this.y;
                if (c4916uk2 != null) {
                    return c4916uk2;
                }
                C4916uk c4916uk3 = new C4916uk(m().c.getAskForPermissionStrategy());
                this.y = c4916uk3;
                return c4916uk3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C5027zb i() {
        C5027zb c5027zb = this.o;
        if (c5027zb == null) {
            synchronized (this) {
                try {
                    c5027zb = this.o;
                    if (c5027zb == null) {
                        c5027zb = new C5027zb(new W2(this.a, this.d.a()), new C4588h2());
                        this.o = c5027zb;
                    }
                } finally {
                }
            }
        }
        return c5027zb;
    }

    public final Db j() {
        Db fb = this.w;
        if (fb == null) {
            synchronized (this) {
                try {
                    fb = this.w;
                    if (fb == null) {
                        Context context = this.a;
                        LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                        fb = locationClient == null ? new Fb() : new Eb(context, new Kb(), locationClient);
                        this.w = fb;
                    }
                } finally {
                }
            }
        }
        return fb;
    }

    public final Db k() {
        return j();
    }

    public final Ec l() {
        return this.t;
    }

    public final Aj m() {
        Aj aj = this.r;
        if (aj == null) {
            synchronized (this) {
                try {
                    aj = this.r;
                    if (aj == null) {
                        aj = new Aj();
                        this.r = aj;
                    }
                } finally {
                }
            }
        }
        return aj;
    }

    public final Yc n() {
        Yc yc = this.z;
        if (yc == null) {
            synchronized (this) {
                try {
                    yc = this.z;
                    if (yc == null) {
                        yc = new Yc(this.a, new jn());
                        this.z = yc;
                    }
                } finally {
                }
            }
        }
        return yc;
    }

    public final C4718md o() {
        return this.A;
    }

    public final PlatformIdentifiers p() {
        PlatformIdentifiers platformIdentifiers = this.i;
        if (platformIdentifiers == null) {
            synchronized (this) {
                try {
                    platformIdentifiers = this.i;
                    if (platformIdentifiers == null) {
                        platformIdentifiers = new PlatformIdentifiers(v(), b());
                        this.i = platformIdentifiers;
                    }
                } finally {
                }
            }
        }
        return platformIdentifiers;
    }

    public final Ke q() {
        B();
        return this.j;
    }

    public final Cf r() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = new Cf(this.a, C.A().c);
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final C4914ui s() {
        C4914ui c4914ui = this.n;
        if (c4914ui == null) {
            synchronized (this) {
                try {
                    c4914ui = this.n;
                    if (c4914ui == null) {
                        c4914ui = new C4914ui(this.a);
                        this.n = c4914ui;
                    }
                } finally {
                }
            }
        }
        return c4914ui;
    }

    public final synchronized Di t() {
        return this.f;
    }

    public final C4915uj u() {
        return this.d;
    }

    public final S v() {
        S s = this.g;
        if (s == null) {
            synchronized (this) {
                try {
                    s = this.g;
                    if (s == null) {
                        s = new S(new P(), new M(), new L(), this.d.a(), "ServiceInternal");
                        this.u.a(s);
                        this.g = s;
                    }
                } finally {
                }
            }
        }
        return s;
    }

    public final C4815qe w() {
        if (this.l == null) {
            synchronized (this) {
                try {
                    if (this.l == null) {
                        this.l = new C4815qe(Z6.a(this.a).c());
                    }
                } finally {
                }
            }
        }
        return this.l;
    }

    public final synchronized S2 x() {
        try {
            if (this.p == null) {
                Bk bk = new Bk(this.a);
                this.p = bk;
                this.u.a(bk);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.p;
    }

    public final C4630il y() {
        return this.u;
    }

    public final C4679km z() {
        C4679km c4679km = this.x;
        if (c4679km == null) {
            synchronized (this) {
                try {
                    c4679km = this.x;
                    if (c4679km == null) {
                        c4679km = new C4679km(this.a);
                        this.x = c4679km;
                    }
                } finally {
                }
            }
        }
        return c4679km;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }
}
