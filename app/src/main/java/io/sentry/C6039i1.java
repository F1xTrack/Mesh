package io.sentry;

import com.huawei.hms.p015rn.push.constants.Core;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.sentry.config.AbstractC6003a;
import io.sentry.exception.C6015a;
import io.sentry.protocol.C6094j;
import io.sentry.protocol.C6095k;
import io.sentry.protocol.C6103s;
import io.sentry.protocol.C6104t;
import java.util.AbstractMap;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.i1 */
/* loaded from: classes2.dex */
public final class C6039i1 extends AbstractC5811V0 implements InterfaceC6058l0 {

    /* renamed from: p */
    public Date f34186p;

    /* renamed from: q */
    public C6095k f34187q;

    /* renamed from: r */
    public String f34188r;

    /* renamed from: s */
    public C6052j0 f34189s;

    /* renamed from: t */
    public C6052j0 f34190t;

    /* renamed from: u */
    public EnumC6069n1 f34191u;

    /* renamed from: v */
    public String f34192v;

    /* renamed from: w */
    public List f34193w;

    /* renamed from: x */
    public ConcurrentHashMap f34194x;

    /* renamed from: y */
    public AbstractMap f34195y;

    public C6039i1(C6015a c6015a) {
        this();
        this.f33425j = c6015a;
    }

    /* renamed from: b */
    public final C6103s m21787b() {
        Boolean bool;
        C6052j0 c6052j0 = this.f34190t;
        if (c6052j0 == null) {
            return null;
        }
        Iterator it = c6052j0.f34215a.iterator();
        while (it.hasNext()) {
            C6103s c6103s = (C6103s) it.next();
            C6094j c6094j = c6103s.f34440f;
            if (c6094j != null && (bool = c6094j.f34386d) != null && !bool.booleanValue()) {
                return c6103s;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m21788c() {
        C6052j0 c6052j0 = this.f34190t;
        return (c6052j0 == null || c6052j0.f34215a.isEmpty()) ? false : true;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("timestamp").mo13825r(iLogger, this.f34186p);
        if (this.f34187q != null) {
            interfaceC5749A0.mo13828u("message").mo13825r(iLogger, this.f34187q);
        }
        if (this.f34188r != null) {
            interfaceC5749A0.mo13828u("logger").mo13811d(this.f34188r);
        }
        C6052j0 c6052j0 = this.f34189s;
        if (c6052j0 != null && !c6052j0.f34215a.isEmpty()) {
            interfaceC5749A0.mo13828u("threads");
            interfaceC5749A0.mo13824q();
            interfaceC5749A0.mo13828u("values").mo13825r(iLogger, this.f34189s.f34215a);
            interfaceC5749A0.mo13817j();
        }
        C6052j0 c6052j02 = this.f34190t;
        if (c6052j02 != null && !c6052j02.f34215a.isEmpty()) {
            interfaceC5749A0.mo13828u(Core.Event.Result.EXCEPTION);
            interfaceC5749A0.mo13824q();
            interfaceC5749A0.mo13828u("values").mo13825r(iLogger, this.f34190t.f34215a);
            interfaceC5749A0.mo13817j();
        }
        if (this.f34191u != null) {
            interfaceC5749A0.mo13828u("level").mo13825r(iLogger, this.f34191u);
        }
        if (this.f34192v != null) {
            interfaceC5749A0.mo13828u("transaction").mo13811d(this.f34192v);
        }
        if (this.f34193w != null) {
            interfaceC5749A0.mo13828u(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT).mo13825r(iLogger, this.f34193w);
        }
        if (this.f34195y != null) {
            interfaceC5749A0.mo13828u("modules").mo13825r(iLogger, this.f34195y);
        }
        AbstractC6003a.m21736E(this, interfaceC5749A0, iLogger);
        ConcurrentHashMap concurrentHashMap = this.f34194x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34194x, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }

    public C6039i1() {
        C6104t c6104t = new C6104t((UUID) null);
        Date dateM21752k = AbstractC6003a.m21752k();
        super(c6104t);
        this.f34186p = dateM21752k;
    }
}
