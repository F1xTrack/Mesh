package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Z6 */
/* loaded from: classes2.dex */
public final class C4966Z6 {

    /* renamed from: t */
    public static volatile C4966Z6 f31161t;

    /* renamed from: e */
    public final Context f31166e;

    /* renamed from: f */
    public C4942Y6 f31167f;

    /* renamed from: g */
    public C4942Y6 f31168g;

    /* renamed from: h */
    public C5212j3 f31169h;

    /* renamed from: i */
    public C5237k3 f31170i;

    /* renamed from: j */
    public C5212j3 f31171j;

    /* renamed from: k */
    public C5237k3 f31172k;

    /* renamed from: l */
    public C5295mb f31173l;

    /* renamed from: m */
    public C5320nb f31174m;

    /* renamed from: n */
    public C5356om f31175n;

    /* renamed from: o */
    public C5381pm f31176o;

    /* renamed from: p */
    public C5295mb f31177p;

    /* renamed from: q */
    public C5320nb f31178q;

    /* renamed from: r */
    public C4779Rb f31179r;

    /* renamed from: a */
    public final HashMap f31162a = new HashMap();

    /* renamed from: b */
    public final HashMap f31163b = new HashMap();

    /* renamed from: c */
    public final HashMap f31164c = new HashMap();

    /* renamed from: d */
    public final C4655M6 f31165d = AbstractC4412C5.m19264a();

    /* renamed from: s */
    public final C5016b7 f31180s = new C5016b7();

    public C4966Z6(Context context) {
        this.f31166e = context;
    }

    /* renamed from: a */
    public static C4966Z6 m20064a(Context context) {
        if (f31161t == null) {
            synchronized (C4966Z6.class) {
                try {
                    if (f31161t == null) {
                        f31161t = new C4966Z6(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f31161t;
    }

    /* renamed from: b */
    public final synchronized InterfaceC4467Ea m20068b(C4964Z4 c4964z4) {
        InterfaceC4467Ea c5295mb;
        String str = new C4868V4(c4964z4).f30842a;
        c5295mb = (InterfaceC4467Ea) this.f31163b.get(str);
        if (c5295mb == null) {
            c5295mb = new C5295mb(new C5429rk(m20070c(c4964z4)));
            this.f31163b.put(str, c5295mb);
        }
        return c5295mb;
    }

    /* renamed from: c */
    public final synchronized C4942Y6 m20070c(C4964Z4 c4964z4) {
        C4942Y6 c4942y6;
        try {
            C4868V4 c4868v4 = new C4868V4(c4964z4);
            c4942y6 = (C4942Y6) this.f31162a.get(c4868v4.f30842a);
            if (c4942y6 == null) {
                Context context = this.f31166e;
                C5016b7 c5016b7 = this.f31180s;
                String strM20105a = new C4991a7(c5016b7.f31306a, c5016b7.f31307b, false).m20105a(context, c4868v4);
                C4655M6 c4655m6 = this.f31165d;
                c4655m6.getClass();
                String str = c4964z4.f31145b;
                if (str == null) {
                    str = "main";
                }
                String strConcat = "component-".concat(str);
                C5131fm c5131fm = c4655m6.f30466c;
                C4894W6 c4894w6 = c4655m6.f30464a;
                C4703O6 c4703o6 = c4894w6.f30924a;
                C4727P6 c4727p6 = c4894w6.f30925b;
                C5294ma c5294ma = new C5294ma(false);
                c5294ma.m20705a(112, new C4940Y4());
                C5181hm c5181hm = new C5181hm(strConcat, c4655m6.f30465b.f32722a);
                c5131fm.getClass();
                c4942y6 = new C4942Y6(context, strM20105a, new C5156gm(c4703o6, c4727p6, c5294ma, c5181hm), PublicLogger.getAnonymousInstance());
                this.f31162a.put(c4868v4.f30842a, c4942y6);
            }
        } finally {
        }
        return c4942y6;
    }

    /* renamed from: d */
    public final synchronized InterfaceC4467Ea m20071d() {
        try {
            if (this.f31173l == null) {
                this.f31173l = new C5295mb(new C5429rk(m20075h()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31173l;
    }

    /* renamed from: e */
    public final IBinaryDataHelper m20072e() {
        if (this.f31171j == null) {
            if (this.f31168g == null) {
                Context context = this.f31166e;
                C5016b7 c5016b7 = this.f31180s;
                String strM20105a = new C4991a7(c5016b7.f31306a, c5016b7.f31307b, false).m20105a(context, new C5536w2());
                C4655M6 c4655m6 = this.f31165d;
                c4655m6.getClass();
                HashMap map = new HashMap();
                map.put("binary_data", AbstractC5564x5.f32802a);
                C5131fm c5131fm = c4655m6.f30466c;
                C4894W6 c4894w6 = c4655m6.f30464a;
                C4751Q6 c4751q6 = c4894w6.f30930g;
                C4774R6 c4774r6 = c4894w6.f30931h;
                C5294ma c5294ma = new C5294ma(false);
                C5181hm c5181hm = new C5181hm("auto_inapp", map);
                c5131fm.getClass();
                this.f31168g = new C4942Y6(context, strM20105a, new C5156gm(c4751q6, c4774r6, c5294ma, c5181hm), PublicLogger.getAnonymousInstance());
            }
            this.f31171j = new C5212j3(new C5429rk(this.f31168g));
        }
        return this.f31171j;
    }

    /* renamed from: f */
    public final InterfaceC4467Ea m20073f() {
        C4779Rb c4779Rb;
        if (this.f31177p == null) {
            synchronized (this) {
                try {
                    if (this.f31179r == null) {
                        C5016b7 c5016b7 = this.f31180s;
                        String strM20105a = new C4991a7(c5016b7.f31306a, c5016b7.f31307b, true).m20105a(this.f31166e, new C5038c4());
                        Context context = this.f31166e;
                        C4655M6 c4655m6 = this.f31165d;
                        c4655m6.getClass();
                        HashMap map = new HashMap();
                        map.put("preferences", InterfaceC5614z5.f32913a);
                        C5131fm c5131fm = c4655m6.f30466c;
                        C4894W6 c4894w6 = c4655m6.f30464a;
                        C4798S6 c4798s6 = c4894w6.f30926c;
                        C4822T6 c4822t6 = c4894w6.f30927d;
                        C5294ma c5294ma = new C5294ma(false);
                        c5294ma.m20705a(112, new C5063d4());
                        C5181hm c5181hm = new C5181hm("service database", map);
                        c5131fm.getClass();
                        this.f31179r = new C4779Rb(context, strM20105a, new C4873V9(strM20105a), new C5156gm(c4798s6, c4822t6, c5294ma, c5181hm));
                    }
                    c4779Rb = this.f31179r;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f31177p = new C5295mb(c4779Rb);
        }
        return this.f31177p;
    }

    /* renamed from: g */
    public final IBinaryDataHelper m20074g() {
        if (this.f31169h == null) {
            this.f31169h = new C5212j3(new C5429rk(m20075h()));
        }
        return this.f31169h;
    }

    /* renamed from: h */
    public final synchronized C4942Y6 m20075h() {
        try {
            if (this.f31167f == null) {
                Context context = this.f31166e;
                C5016b7 c5016b7 = this.f31180s;
                String strM20105a = new C4991a7(c5016b7.f31306a, c5016b7.f31307b, true).m20105a(context, new C5403qj());
                C4655M6 c4655m6 = this.f31165d;
                c4655m6.getClass();
                HashMap map = new HashMap();
                map.put("preferences", InterfaceC5614z5.f32913a);
                map.put("binary_data", AbstractC5564x5.f32802a);
                map.put("temp_cache", AbstractC5431rm.f32523a);
                Iterator<ModuleServicesDatabase> it = C5244ka.f32038C.m20628m().mo19190a().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        map.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C5131fm c5131fm = c4655m6.f30466c;
                C4894W6 c4894w6 = c4655m6.f30464a;
                C4846U6 c4846u6 = c4894w6.f30928e;
                C4870V6 c4870v6 = c4894w6.f30929f;
                C5294ma c5294ma = new C5294ma(false);
                c5294ma.m20705a(114, new C5428rj());
                Iterator<ModuleServicesDatabase> it2 = C5244ka.f32038C.m20628m().mo19190a().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c5294ma.m20705a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C5181hm c5181hm = new C5181hm("service database", map);
                c5131fm.getClass();
                this.f31167f = new C4942Y6(context, strM20105a, new C5156gm(c4846u6, c4870v6, c5294ma, c5181hm), PublicLogger.getAnonymousInstance());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31167f;
    }

    /* renamed from: a */
    public final synchronized IBinaryDataHelper m20065a(C4964Z4 c4964z4) {
        IBinaryDataHelper c5212j3;
        String str = new C4868V4(c4964z4).f30842a;
        c5212j3 = (IBinaryDataHelper) this.f31164c.get(str);
        if (c5212j3 == null) {
            c5212j3 = new C5212j3(new C5429rk(m20070c(c4964z4)));
            this.f31164c.put(str, c5212j3);
        }
        return c5212j3;
    }

    /* renamed from: b */
    public final synchronized InterfaceC4467Ea m20067b() {
        return m20073f();
    }

    /* renamed from: a */
    public final synchronized InterfaceC4467Ea m20066a() {
        try {
            if (this.f31178q == null) {
                this.f31178q = new C5320nb(m20073f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31178q;
    }

    /* renamed from: c */
    public final synchronized InterfaceC4467Ea m20069c() {
        try {
            if (this.f31174m == null) {
                if (this.f31173l == null) {
                    this.f31173l = new C5295mb(new C5429rk(m20075h()));
                }
                this.f31174m = new C5320nb(this.f31173l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31174m;
    }
}
