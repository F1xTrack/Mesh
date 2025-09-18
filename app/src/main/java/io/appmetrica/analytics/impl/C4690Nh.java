package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfiguration;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.Nh */
/* loaded from: classes2.dex */
public final class C4690Nh {

    /* renamed from: a */
    public final C4820T4 f30522a;

    /* renamed from: b */
    public final C4719Om f30523b;

    /* renamed from: c */
    public final C4714Oh f30524c;

    /* renamed from: d */
    public final C5134g0 f30525d;

    /* renamed from: e */
    public InterfaceC4765Qk f30526e;

    /* renamed from: f */
    public final C5278lj f30527f;

    public C4690Nh(C5134g0 c5134g0, C4719Om c4719Om, C4820T4 c4820t4, C5278lj c5278lj) {
        this(c5134g0, c4719Om, c4820t4, c5278lj, new C4714Oh(c5134g0, c5278lj));
    }

    /* renamed from: a */
    public final void m19661a(C4737Pg c4737Pg) {
        C4952Yg c4952Yg = c4737Pg.f30624e;
        InterfaceC4765Qk interfaceC4765Qk = this.f30526e;
        if (interfaceC4765Qk != null) {
            c4952Yg.f31090b.setUuid(((C4741Pk) interfaceC4765Qk).m19729g());
        } else {
            c4952Yg.getClass();
        }
        this.f30524c.m19695a(c4737Pg);
    }

    /* renamed from: b */
    public final void m19667b(String str) {
        C4782Re c4782Re = this.f30522a.f31089a;
        synchronized (c4782Re) {
            c4782Re.f30696a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public C4690Nh(C5134g0 c5134g0, C4719Om c4719Om, C4820T4 c4820t4, C5278lj c5278lj, C4714Oh c4714Oh) {
        this.f30525d = c5134g0;
        this.f30522a = c4820t4;
        this.f30523b = c4719Om;
        this.f30527f = c5278lj;
        this.f30524c = c4714Oh;
    }

    /* renamed from: a */
    public final void m19662a(C4741Pk c4741Pk) {
        this.f30526e = c4741Pk;
        this.f30522a.f31090b.setUuid(c4741Pk.m19729g());
    }

    /* renamed from: a */
    public final void m19663a(C4821T5 c4821t5, C4952Yg c4952Yg, int i, Map map) {
        String str;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        this.f30525d.m20403b();
        if (!AbstractC5182hn.m20514a(map)) {
            c4821t5.setValue(AbstractC5020bb.m20174b(map));
            m19660a(c4821t5, c4952Yg);
        }
        C4782Re c4782Re = new C4782Re(c4952Yg.f31089a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c4952Yg.f31090b);
        synchronized (c4952Yg) {
            str = c4952Yg.f31119f;
        }
        m19661a(new C4737Pg(c4821t5, false, i, null, new C4952Yg(c4782Re, counterConfiguration, str)));
    }

    /* renamed from: a */
    public static C4821T5 m19660a(C4821T5 c4821t5, C4952Yg c4952Yg) {
        if (AbstractC5443s9.f32553a.contains(Integer.valueOf(c4821t5.f30764d))) {
            c4821t5.f30763c = c4952Yg.m20039d();
        }
        return c4821t5;
    }

    /* renamed from: a */
    public final void m19666a(List list) {
        C4782Re c4782Re = this.f30522a.f31089a;
        synchronized (c4782Re) {
            c4782Re.f30696a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC5182hn.m20513a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    /* renamed from: a */
    public final void m19665a(HashMap map) {
        C4782Re c4782Re = this.f30522a.f31089a;
        synchronized (c4782Re) {
            c4782Re.f30696a.put("PROCESS_CFG_CLIDS", AbstractC5020bb.m20174b(map));
        }
    }

    /* renamed from: a */
    public final void m19664a(String str) {
        C4782Re c4782Re = this.f30522a.f31089a;
        synchronized (c4782Re) {
            c4782Re.f30696a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }
}
