package io.sentry;

import com.huawei.hms.rn.push.constants.Core;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.AbstractMap;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.i1 */
/* loaded from: classes2.dex */
public final class C5133i1 extends V0 implements InterfaceC5141l0 {
    public Date p;
    public io.sentry.protocol.k q;
    public String r;
    public C5135j0 s;
    public C5135j0 t;
    public EnumC5148n1 u;
    public String v;
    public List w;
    public ConcurrentHashMap x;
    public AbstractMap y;

    public C5133i1(io.sentry.exception.a aVar) {
        this();
        this.j = aVar;
    }

    public final io.sentry.protocol.s b() {
        Boolean bool;
        C5135j0 c5135j0 = this.t;
        if (c5135j0 == null) {
            return null;
        }
        Iterator it = c5135j0.a.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.s sVar = (io.sentry.protocol.s) it.next();
            io.sentry.protocol.j jVar = sVar.f;
            if (jVar != null && (bool = jVar.d) != null && !bool.booleanValue()) {
                return sVar;
            }
        }
        return null;
    }

    public final boolean c() {
        C5135j0 c5135j0 = this.t;
        return (c5135j0 == null || c5135j0.a.isEmpty()) ? false : true;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("timestamp").r(iLogger, this.p);
        if (this.q != null) {
            a0.u("message").r(iLogger, this.q);
        }
        if (this.r != null) {
            a0.u("logger").d(this.r);
        }
        C5135j0 c5135j0 = this.s;
        if (c5135j0 != null && !c5135j0.a.isEmpty()) {
            a0.u("threads");
            a0.q();
            a0.u("values").r(iLogger, this.s.a);
            a0.j();
        }
        C5135j0 c5135j02 = this.t;
        if (c5135j02 != null && !c5135j02.a.isEmpty()) {
            a0.u(Core.Event.Result.EXCEPTION);
            a0.q();
            a0.u("values").r(iLogger, this.t.a);
            a0.j();
        }
        if (this.u != null) {
            a0.u("level").r(iLogger, this.u);
        }
        if (this.v != null) {
            a0.u("transaction").d(this.v);
        }
        if (this.w != null) {
            a0.u(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT).r(iLogger, this.w);
        }
        if (this.y != null) {
            a0.u("modules").r(iLogger, this.y);
        }
        io.sentry.config.a.E(this, a0, iLogger);
        ConcurrentHashMap concurrentHashMap = this.x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.x, str, a0, str, iLogger);
            }
        }
        a0.j();
    }

    public C5133i1() {
        io.sentry.protocol.t tVar = new io.sentry.protocol.t((UUID) null);
        Date dateK = io.sentry.config.a.k();
        super(tVar);
        this.p = dateK;
    }
}
