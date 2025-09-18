package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;
import p000.AbstractC7038vr;

/* renamed from: io.appmetrica.analytics.impl.E9 */
/* loaded from: classes2.dex */
public final class C4466E9 extends AbstractC5200ig {

    /* renamed from: b */
    public final C4490F9 f30060b;

    public C4466E9(C5139g5 c5139g5, TimeProvider timeProvider) {
        super(c5139g5);
        this.f30060b = new C4490F9(c5139g5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        long jOptLong;
        C4490F9 c4490f9 = this.f30060b;
        C5593y9 c5593y9 = c4490f9.f30126a.m20429t().f31781C;
        Long lValueOf = c5593y9 != null ? Long.valueOf(c5593y9.f32852a) : null;
        if (lValueOf != null) {
            C5482tn c5482tn = c4490f9.f30126a.f31743v;
            synchronized (c5482tn) {
                jOptLong = c5482tn.f32656a.m21151a().optLong("external_attribution_window_start", -1L);
            }
            if (jOptLong < 0) {
                jOptLong = c4490f9.f30127b.currentTimeMillis();
                c4490f9.f30126a.f31743v.m21097a(jOptLong);
            }
            if (c4490f9.f30127b.currentTimeMillis() - jOptLong <= lValueOf.longValue()) {
                C5568x9 c5568x9 = (C5568x9) MessageNano.mergeFrom(new C5568x9(), c4821t5.getValueBytes());
                int i = c5568x9.f32817a;
                String str = new String(c5568x9.f32818b, AbstractC7038vr.f44561a);
                String str2 = this.f30060b.f30126a.f31724c.m20834j().get(Integer.valueOf(i));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f31942a.f31735n.info("Ignoring attribution of type `" + AbstractC4538H9.m19465a(i) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                C4490F9 c4490f92 = this.f30060b;
                Map<Integer, String> mapM20834j = c4490f92.f30126a.f31724c.m20834j();
                mapM20834j.put(Integer.valueOf(i), str);
                c4490f92.f30126a.f31724c.m20822a(mapM20834j);
                this.f31942a.f31735n.info("Handling attribution of type `" + AbstractC4538H9.m19465a(i) + '`', new Object[0]);
                return false;
            }
        }
        this.f31942a.f31735n.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
