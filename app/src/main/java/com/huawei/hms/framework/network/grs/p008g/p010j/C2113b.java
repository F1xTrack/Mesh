package com.huawei.hms.framework.network.grs.p008g.p010j;

import android.os.SystemClock;
import com.huawei.hms.framework.network.grs.p008g.C2106d;
import java.util.concurrent.Future;

/* renamed from: com.huawei.hms.framework.network.grs.g.j.b */
/* loaded from: classes.dex */
public class C2113b {

    /* renamed from: a */
    private final Future<C2106d> f19104a;

    /* renamed from: b */
    private final long f19105b = SystemClock.elapsedRealtime();

    public C2113b(Future<C2106d> future) {
        this.f19104a = future;
    }

    /* renamed from: a */
    public Future<C2106d> m11843a() {
        return this.f19104a;
    }

    /* renamed from: b */
    public boolean m11844b() {
        return SystemClock.elapsedRealtime() - this.f19105b <= 300000;
    }
}
