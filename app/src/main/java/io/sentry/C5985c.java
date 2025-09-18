package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6104t;
import io.sentry.protocol.EnumC6080C;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.c */
/* loaded from: classes2.dex */
public final class C5985c {

    /* renamed from: a */
    public final HashMap f34086a;

    /* renamed from: b */
    public boolean f34087b;

    /* renamed from: c */
    public final ILogger f34088c;

    public C5985c(ILogger iLogger) {
        this(new HashMap(), true, iLogger);
    }

    /* renamed from: a */
    public static C5985c m21698a(C6039i1 c6039i1, C5759D1 c5759d1) {
        C5985c c5985c = new C5985c(c5759d1.getLogger());
        C6087c c6087c = c6039i1.f33417b;
        C5798Q1 c5798q1M21849a = c6087c.m21849a();
        c5985c.m21701d("sentry-trace_id", c5798q1M21849a != null ? c5798q1M21849a.f33379a.toString() : null);
        c5985c.m21701d("sentry-public_key", c5759d1.retrieveParsedDsn().f34509b);
        c5985c.m21701d("sentry-release", c6039i1.f33421f);
        c5985c.m21701d("sentry-environment", c6039i1.f33422g);
        C6082E c6082e = c6039i1.f33424i;
        c5985c.m21701d("sentry-user_segment", c6082e != null ? m21699c(c6082e) : null);
        c5985c.m21701d("sentry-transaction", c6039i1.f34192v);
        c5985c.m21701d("sentry-sample_rate", null);
        c5985c.m21701d("sentry-sampled", null);
        Object obj = c6087c.get("replay_id");
        if (obj != null && !obj.toString().equals(C6104t.f34442b.toString())) {
            c5985c.m21701d("sentry-replay_id", obj.toString());
            c6087c.remove("replay_id");
        }
        c5985c.f34087b = false;
        return c5985c;
    }

    /* renamed from: c */
    public static String m21699c(C6082E c6082e) {
        String str = c6082e.f34291d;
        if (str != null) {
            return str;
        }
        ConcurrentHashMap concurrentHashMap = c6082e.f34295h;
        if (concurrentHashMap != null) {
            return (String) concurrentHashMap.get("segment");
        }
        return null;
    }

    /* renamed from: b */
    public final String m21700b(String str) {
        return (String) this.f34086a.get(str);
    }

    /* renamed from: d */
    public final void m21701d(String str, String str2) {
        if (this.f34087b) {
            this.f34086a.put(str, str2);
        }
    }

    /* renamed from: e */
    public final void m21702e(C5786M1 c5786m1, C6082E c6082e, C6104t c6104t, C5759D1 c5759d1, C5820Y0 c5820y0) {
        m21701d("sentry-trace_id", c5786m1.f33327b.f33367c.f33379a.toString());
        m21701d("sentry-public_key", c5759d1.retrieveParsedDsn().f34509b);
        m21701d("sentry-release", c5759d1.getRelease());
        m21701d("sentry-environment", c5759d1.getEnvironment());
        m21701d("sentry-user_segment", c6082e != null ? m21699c(c6082e) : null);
        EnumC6080C enumC6080C = c5786m1.f33339n;
        m21701d("sentry-transaction", (enumC6080C == null || EnumC6080C.URL.equals(enumC6080C)) ? null : c5786m1.f33330e);
        if (c6104t != null && !C6104t.f34442b.equals(c6104t)) {
            m21701d("sentry-replay_id", c6104t.toString());
        }
        Double d = c5820y0 == null ? null : (Double) c5820y0.f33442b;
        m21701d("sentry-sample_rate", !AbstractC6003a.m21764y(d, false) ? null : new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d));
        Boolean bool = c5820y0 == null ? null : (Boolean) c5820y0.f33441a;
        m21701d("sentry-sampled", bool != null ? bool.toString() : null);
    }

    /* renamed from: f */
    public final C5821Y1 m21703f() {
        String strM21700b = m21700b("sentry-trace_id");
        String strM21700b2 = m21700b("sentry-replay_id");
        String strM21700b3 = m21700b("sentry-public_key");
        if (strM21700b == null || strM21700b3 == null) {
            return null;
        }
        C5821Y1 c5821y1 = new C5821Y1(new C6104t(strM21700b), strM21700b3, m21700b("sentry-release"), m21700b("sentry-environment"), m21700b("sentry-user_id"), m21700b("sentry-user_segment"), m21700b("sentry-transaction"), m21700b("sentry-sample_rate"), m21700b("sentry-sampled"), strM21700b2 == null ? null : new C6104t(strM21700b2));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : this.f34086a.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!AbstractC5979b.f34082a.contains(str) && str2 != null) {
                concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
            }
        }
        c5821y1.f33455k = concurrentHashMap;
        return c5821y1;
    }

    public C5985c(HashMap map, boolean z, ILogger iLogger) {
        this.f34086a = map;
        this.f34088c = iLogger;
        this.f34087b = z;
    }
}
