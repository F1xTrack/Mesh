package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Z6 {
    public static volatile Z6 t;
    public final Context e;
    public Y6 f;
    public Y6 g;
    public C4636j3 h;
    public C4660k3 i;
    public C4636j3 j;
    public C4660k3 k;
    public C4716mb l;
    public C4740nb m;
    public C4775om n;
    public C4799pm o;
    public C4716mb p;
    public C4740nb q;
    public Rb r;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final M6 d = C5.a();
    public final C4446b7 s = new C4446b7();

    public Z6(Context context) {
        this.e = context;
    }

    public static Z6 a(Context context) {
        if (t == null) {
            synchronized (Z6.class) {
                try {
                    if (t == null) {
                        t = new Z6(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return t;
    }

    public final synchronized Ea b(Z4 z4) {
        Ea c4716mb;
        String str = new V4(z4).a;
        c4716mb = (Ea) this.b.get(str);
        if (c4716mb == null) {
            c4716mb = new C4716mb(new C4844rk(c(z4)));
            this.b.put(str, c4716mb);
        }
        return c4716mb;
    }

    public final synchronized Y6 c(Z4 z4) {
        Y6 y6;
        try {
            V4 v4 = new V4(z4);
            y6 = (Y6) this.a.get(v4.a);
            if (y6 == null) {
                Context context = this.e;
                C4446b7 c4446b7 = this.s;
                String strA = new C4421a7(c4446b7.a, c4446b7.b, false).a(context, v4);
                M6 m6 = this.d;
                m6.getClass();
                String str = z4.b;
                if (str == null) {
                    str = "main";
                }
                String strConcat = "component-".concat(str);
                C4560fm c4560fm = m6.c;
                W6 w6 = m6.a;
                O6 o6 = w6.a;
                P6 p6 = w6.b;
                C4715ma c4715ma = new C4715ma(false);
                c4715ma.a(112, new Y4());
                C4608hm c4608hm = new C4608hm(strConcat, m6.b.a);
                c4560fm.getClass();
                y6 = new Y6(context, strA, new C4584gm(o6, p6, c4715ma, c4608hm), PublicLogger.getAnonymousInstance());
                this.a.put(v4.a, y6);
            }
        } finally {
        }
        return y6;
    }

    public final synchronized Ea d() {
        try {
            if (this.l == null) {
                this.l = new C4716mb(new C4844rk(h()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public final IBinaryDataHelper e() {
        if (this.j == null) {
            if (this.g == null) {
                Context context = this.e;
                C4446b7 c4446b7 = this.s;
                String strA = new C4421a7(c4446b7.a, c4446b7.b, false).a(context, new C4946w2());
                M6 m6 = this.d;
                m6.getClass();
                HashMap map = new HashMap();
                map.put("binary_data", AbstractC4973x5.a);
                C4560fm c4560fm = m6.c;
                W6 w6 = m6.a;
                Q6 q6 = w6.g;
                R6 r6 = w6.h;
                C4715ma c4715ma = new C4715ma(false);
                C4608hm c4608hm = new C4608hm("auto_inapp", map);
                c4560fm.getClass();
                this.g = new Y6(context, strA, new C4584gm(q6, r6, c4715ma, c4608hm), PublicLogger.getAnonymousInstance());
            }
            this.j = new C4636j3(new C4844rk(this.g));
        }
        return this.j;
    }

    public final Ea f() {
        Rb rb;
        if (this.p == null) {
            synchronized (this) {
                try {
                    if (this.r == null) {
                        C4446b7 c4446b7 = this.s;
                        String strA = new C4421a7(c4446b7.a, c4446b7.b, true).a(this.e, new C4468c4());
                        Context context = this.e;
                        M6 m6 = this.d;
                        m6.getClass();
                        HashMap map = new HashMap();
                        map.put("preferences", InterfaceC5021z5.a);
                        C4560fm c4560fm = m6.c;
                        W6 w6 = m6.a;
                        S6 s6 = w6.c;
                        T6 t6 = w6.d;
                        C4715ma c4715ma = new C4715ma(false);
                        c4715ma.a(112, new C4493d4());
                        C4608hm c4608hm = new C4608hm("service database", map);
                        c4560fm.getClass();
                        this.r = new Rb(context, strA, new V9(strA), new C4584gm(s6, t6, c4715ma, c4608hm));
                    }
                    rb = this.r;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.p = new C4716mb(rb);
        }
        return this.p;
    }

    public final IBinaryDataHelper g() {
        if (this.h == null) {
            this.h = new C4636j3(new C4844rk(h()));
        }
        return this.h;
    }

    public final synchronized Y6 h() {
        try {
            if (this.f == null) {
                Context context = this.e;
                C4446b7 c4446b7 = this.s;
                String strA = new C4421a7(c4446b7.a, c4446b7.b, true).a(context, new C4820qj());
                M6 m6 = this.d;
                m6.getClass();
                HashMap map = new HashMap();
                map.put("preferences", InterfaceC5021z5.a);
                map.put("binary_data", AbstractC4973x5.a);
                map.put("temp_cache", AbstractC4846rm.a);
                Iterator<ModuleServicesDatabase> it = C4667ka.C.m().a().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        map.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C4560fm c4560fm = m6.c;
                W6 w6 = m6.a;
                U6 u6 = w6.e;
                V6 v6 = w6.f;
                C4715ma c4715ma = new C4715ma(false);
                c4715ma.a(114, new C4843rj());
                Iterator<ModuleServicesDatabase> it2 = C4667ka.C.m().a().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c4715ma.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C4608hm c4608hm = new C4608hm("service database", map);
                c4560fm.getClass();
                this.f = new Y6(context, strA, new C4584gm(u6, v6, c4715ma, c4608hm), PublicLogger.getAnonymousInstance());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f;
    }

    public final synchronized IBinaryDataHelper a(Z4 z4) {
        IBinaryDataHelper c4636j3;
        String str = new V4(z4).a;
        c4636j3 = (IBinaryDataHelper) this.c.get(str);
        if (c4636j3 == null) {
            c4636j3 = new C4636j3(new C4844rk(c(z4)));
            this.c.put(str, c4636j3);
        }
        return c4636j3;
    }

    public final synchronized Ea b() {
        return f();
    }

    public final synchronized Ea a() {
        try {
            if (this.q == null) {
                this.q = new C4740nb(f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.q;
    }

    public final synchronized Ea c() {
        try {
            if (this.m == null) {
                if (this.l == null) {
                    this.l = new C4716mb(new C4844rk(h()));
                }
                this.m = new C4740nb(this.l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m;
    }
}
