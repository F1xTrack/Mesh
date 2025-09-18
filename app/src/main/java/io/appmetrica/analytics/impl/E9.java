package io.appmetrica.analytics.impl;

import defpackage.AbstractC7680vr;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class E9 extends AbstractC4625ig {
    public final F9 b;

    public E9(C4567g5 c4567g5, TimeProvider timeProvider) {
        super(c4567g5);
        this.b = new F9(c4567g5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        long jOptLong;
        F9 f9 = this.b;
        C5001y9 c5001y9 = f9.a.t().C;
        Long lValueOf = c5001y9 != null ? Long.valueOf(c5001y9.a) : null;
        if (lValueOf != null) {
            tn tnVar = f9.a.v;
            synchronized (tnVar) {
                jOptLong = tnVar.a.a().optLong("external_attribution_window_start", -1L);
            }
            if (jOptLong < 0) {
                jOptLong = f9.b.currentTimeMillis();
                f9.a.v.a(jOptLong);
            }
            if (f9.b.currentTimeMillis() - jOptLong <= lValueOf.longValue()) {
                C4977x9 c4977x9 = (C4977x9) MessageNano.mergeFrom(new C4977x9(), t5.getValueBytes());
                int i = c4977x9.a;
                String str = new String(c4977x9.b, AbstractC7680vr.a);
                String str2 = this.b.a.c.j().get(Integer.valueOf(i));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.a.n.info("Ignoring attribution of type `" + H9.a(i) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                F9 f92 = this.b;
                Map<Integer, String> mapJ = f92.a.c.j();
                mapJ.put(Integer.valueOf(i), str);
                f92.a.c.a(mapJ);
                this.a.n.info("Handling attribution of type `" + H9.a(i) + '`', new Object[0]);
                return false;
            }
        }
        this.a.n.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
