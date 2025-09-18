package io.sentry;

import io.sentry.protocol.C5157c;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.c */
/* loaded from: classes2.dex */
public final class C5113c {
    public final HashMap a;
    public boolean b;
    public final ILogger c;

    public C5113c(ILogger iLogger) {
        this(new HashMap(), true, iLogger);
    }

    public static C5113c a(C5133i1 c5133i1, D1 d1) {
        C5113c c5113c = new C5113c(d1.getLogger());
        C5157c c5157c = c5133i1.b;
        Q1 q1A = c5157c.a();
        c5113c.d("sentry-trace_id", q1A != null ? q1A.a.toString() : null);
        c5113c.d("sentry-public_key", d1.retrieveParsedDsn().b);
        c5113c.d("sentry-release", c5133i1.f);
        c5113c.d("sentry-environment", c5133i1.g);
        io.sentry.protocol.E e = c5133i1.i;
        c5113c.d("sentry-user_segment", e != null ? c(e) : null);
        c5113c.d("sentry-transaction", c5133i1.v);
        c5113c.d("sentry-sample_rate", null);
        c5113c.d("sentry-sampled", null);
        Object obj = c5157c.get("replay_id");
        if (obj != null && !obj.toString().equals(io.sentry.protocol.t.b.toString())) {
            c5113c.d("sentry-replay_id", obj.toString());
            c5157c.remove("replay_id");
        }
        c5113c.b = false;
        return c5113c;
    }

    public static String c(io.sentry.protocol.E e) {
        String str = e.d;
        if (str != null) {
            return str;
        }
        ConcurrentHashMap concurrentHashMap = e.h;
        if (concurrentHashMap != null) {
            return (String) concurrentHashMap.get("segment");
        }
        return null;
    }

    public final String b(String str) {
        return (String) this.a.get(str);
    }

    public final void d(String str, String str2) {
        if (this.b) {
            this.a.put(str, str2);
        }
    }

    public final void e(M1 m1, io.sentry.protocol.E e, io.sentry.protocol.t tVar, D1 d1, Y0 y0) {
        d("sentry-trace_id", m1.b.c.a.toString());
        d("sentry-public_key", d1.retrieveParsedDsn().b);
        d("sentry-release", d1.getRelease());
        d("sentry-environment", d1.getEnvironment());
        d("sentry-user_segment", e != null ? c(e) : null);
        io.sentry.protocol.C c = m1.n;
        d("sentry-transaction", (c == null || io.sentry.protocol.C.URL.equals(c)) ? null : m1.e);
        if (tVar != null && !io.sentry.protocol.t.b.equals(tVar)) {
            d("sentry-replay_id", tVar.toString());
        }
        Double d = y0 == null ? null : (Double) y0.b;
        d("sentry-sample_rate", !io.sentry.config.a.y(d, false) ? null : new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d));
        Boolean bool = y0 == null ? null : (Boolean) y0.a;
        d("sentry-sampled", bool != null ? bool.toString() : null);
    }

    public final Y1 f() {
        String strB = b("sentry-trace_id");
        String strB2 = b("sentry-replay_id");
        String strB3 = b("sentry-public_key");
        if (strB == null || strB3 == null) {
            return null;
        }
        Y1 y1 = new Y1(new io.sentry.protocol.t(strB), strB3, b("sentry-release"), b("sentry-environment"), b("sentry-user_id"), b("sentry-user_segment"), b("sentry-transaction"), b("sentry-sample_rate"), b("sentry-sampled"), strB2 == null ? null : new io.sentry.protocol.t(strB2));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!AbstractC5110b.a.contains(str) && str2 != null) {
                concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
            }
        }
        y1.k = concurrentHashMap;
        return y1;
    }

    public C5113c(HashMap map, boolean z, ILogger iLogger) {
        this.a = map;
        this.c = iLogger;
        this.b = z;
    }
}
