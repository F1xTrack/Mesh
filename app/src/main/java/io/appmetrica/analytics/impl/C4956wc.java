package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.wc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4956wc implements InterfaceC4751nm {
    public final Context a;
    public final PermissionResolutionStrategy b;
    public final CellularNetworkTypeExtractor c;
    public final CachedDataProvider.CachedData d;

    public C4956wc(Context context) {
        this.a = context;
        this.b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C4667ka.h().g(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4751nm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized C4932vc a() {
        C4932vc c4932vc;
        try {
            c4932vc = (C4932vc) this.d.getData();
            if (c4932vc == null || this.d.shouldUpdateData()) {
                c4932vc = new C4932vc(this.b.hasNecessaryPermissions(this.a) ? this.c.getNetworkType() : "unknown");
                this.d.setData(c4932vc);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c4932vc;
    }
}
