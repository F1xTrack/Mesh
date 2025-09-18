package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfiguration;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class Nh {
    public final T4 a;
    public final Om b;
    public final Oh c;
    public final C4562g0 d;
    public Qk e;
    public final C4700lj f;

    public Nh(C4562g0 c4562g0, Om om, T4 t4, C4700lj c4700lj) {
        this(c4562g0, om, t4, c4700lj, new Oh(c4562g0, c4700lj));
    }

    public final void a(Pg pg) {
        Yg yg = pg.e;
        Qk qk = this.e;
        if (qk != null) {
            yg.b.setUuid(((Pk) qk).g());
        } else {
            yg.getClass();
        }
        this.c.a(pg);
    }

    public final void b(String str) {
        Re re = this.a.a;
        synchronized (re) {
            re.a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public Nh(C4562g0 c4562g0, Om om, T4 t4, C4700lj c4700lj, Oh oh) {
        this.d = c4562g0;
        this.a = t4;
        this.b = om;
        this.f = c4700lj;
        this.c = oh;
    }

    public final void a(Pk pk) {
        this.e = pk;
        this.a.b.setUuid(pk.g());
    }

    public final void a(T5 t5, Yg yg, int i, Map map) {
        String str;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        this.d.b();
        if (!hn.a(map)) {
            t5.setValue(AbstractC4450bb.b(map));
            a(t5, yg);
        }
        Re re = new Re(yg.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(yg.b);
        synchronized (yg) {
            str = yg.f;
        }
        a(new Pg(t5, false, i, null, new Yg(re, counterConfiguration, str)));
    }

    public static T5 a(T5 t5, Yg yg) {
        if (AbstractC4857s9.a.contains(Integer.valueOf(t5.d))) {
            t5.c = yg.d();
        }
        return t5;
    }

    public final void a(List list) {
        Re re = this.a.a;
        synchronized (re) {
            re.a.put("PROCESS_CFG_CUSTOM_HOSTS", hn.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap map) {
        Re re = this.a.a;
        synchronized (re) {
            re.a.put("PROCESS_CFG_CLIDS", AbstractC4450bb.b(map));
        }
    }

    public final void a(String str) {
        Re re = this.a.a;
        synchronized (re) {
            re.a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }
}
