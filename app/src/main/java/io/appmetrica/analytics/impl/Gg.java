package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Gg extends AbstractC4625ig {
    public final Ke b;
    public final tn c;
    public final SafePackageManager d;
    public final TimeProvider e;

    public Gg(C4567g5 c4567g5) {
        this(c4567g5, c4567g5.u(), C4667ka.h().q(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        C4567g5 c4567g5 = this.a;
        if (this.c.d()) {
            return false;
        }
        T5 t5A = ((Eg) c4567g5.l.a()).f ? T5.a(t5, Wa.EVENT_TYPE_APP_UPDATE) : T5.a(t5, Wa.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.d.getInstallerPackageName(c4567g5.a, c4567g5.b.a), ""));
            Ke ke = this.b;
            ke.h.a(ke.a);
            jSONObject.put("preloadInfo", ((He) ke.c()).b());
        } catch (Throwable unused) {
        }
        t5A.setValue(jSONObject.toString());
        C4619i9 c4619i9 = c4567g5.o;
        c4619i9.a(t5A, Uj.a(c4619i9.c.b(t5A), t5A.i));
        tn tnVar = this.c;
        synchronized (tnVar) {
            un unVar = tnVar.a;
            unVar.a(unVar.a().put("init_event_done", true));
        }
        this.c.a(this.e.currentTimeMillis());
        return false;
    }

    public Gg(C4567g5 c4567g5, tn tnVar, Ke ke, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c4567g5);
        this.c = tnVar;
        this.b = ke;
        this.d = safePackageManager;
        this.e = systemTimeProvider;
    }
}
