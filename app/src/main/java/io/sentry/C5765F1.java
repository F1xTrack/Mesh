package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6104t;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: io.sentry.F1 */
/* loaded from: classes2.dex */
public final class C5765F1 extends AbstractC5811V0 implements InterfaceC6058l0 {

    /* renamed from: p */
    public File f33272p;

    /* renamed from: t */
    public int f33276t;

    /* renamed from: v */
    public Date f33278v;

    /* renamed from: z */
    public HashMap f33282z;

    /* renamed from: s */
    public C6104t f33275s = new C6104t((UUID) null);

    /* renamed from: q */
    public String f33273q = "replay_event";

    /* renamed from: r */
    public EnumC5762E1 f33274r = EnumC5762E1.SESSION;

    /* renamed from: x */
    public List f33280x = new ArrayList();

    /* renamed from: y */
    public List f33281y = new ArrayList();

    /* renamed from: w */
    public List f33279w = new ArrayList();

    /* renamed from: u */
    public Date f33277u = AbstractC6003a.m21752k();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5765F1.class != obj.getClass()) {
            return false;
        }
        C5765F1 c5765f1 = (C5765F1) obj;
        return this.f33276t == c5765f1.f33276t && AbstractC6003a.m21747f(this.f33273q, c5765f1.f33273q) && this.f33274r == c5765f1.f33274r && AbstractC6003a.m21747f(this.f33275s, c5765f1.f33275s) && AbstractC6003a.m21747f(this.f33279w, c5765f1.f33279w) && AbstractC6003a.m21747f(this.f33280x, c5765f1.f33280x) && AbstractC6003a.m21747f(this.f33281y, c5765f1.f33281y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33273q, this.f33274r, this.f33275s, Integer.valueOf(this.f33276t), this.f33279w, this.f33280x, this.f33281y});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("type").mo13811d(this.f33273q);
        interfaceC5749A0.mo13828u("replay_type").mo13825r(iLogger, this.f33274r);
        interfaceC5749A0.mo13828u("segment_id").mo13809b(this.f33276t);
        interfaceC5749A0.mo13828u("timestamp").mo13825r(iLogger, this.f33277u);
        if (this.f33275s != null) {
            interfaceC5749A0.mo13828u("replay_id").mo13825r(iLogger, this.f33275s);
        }
        if (this.f33278v != null) {
            interfaceC5749A0.mo13828u("replay_start_timestamp").mo13825r(iLogger, this.f33278v);
        }
        if (this.f33279w != null) {
            interfaceC5749A0.mo13828u("urls").mo13825r(iLogger, this.f33279w);
        }
        if (this.f33280x != null) {
            interfaceC5749A0.mo13828u("error_ids").mo13825r(iLogger, this.f33280x);
        }
        if (this.f33281y != null) {
            interfaceC5749A0.mo13828u("trace_ids").mo13825r(iLogger, this.f33281y);
        }
        AbstractC6003a.m21736E(this, interfaceC5749A0, iLogger);
        HashMap map = this.f33282z;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f33282z.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
