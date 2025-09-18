package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.wc */
/* loaded from: classes2.dex */
public final class C5546wc implements InterfaceC5331nm {

    /* renamed from: a */
    public final Context f32767a;

    /* renamed from: b */
    public final PermissionResolutionStrategy f32768b;

    /* renamed from: c */
    public final CellularNetworkTypeExtractor f32769c;

    /* renamed from: d */
    public final CachedDataProvider.CachedData f32770d;

    public C5546wc(Context context) {
        this.f32767a = context;
        this.f32768b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C5244ka.m20614h().m20623g(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f32769c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f32770d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5331nm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized C5521vc mo20845a() {
        C5521vc c5521vc;
        try {
            c5521vc = (C5521vc) this.f32770d.getData();
            if (c5521vc == null || this.f32770d.shouldUpdateData()) {
                c5521vc = new C5521vc(this.f32768b.hasNecessaryPermissions(this.f32767a) ? this.f32769c.getNetworkType() : "unknown");
                this.f32770d.setData(c5521vc);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5521vc;
    }
}
