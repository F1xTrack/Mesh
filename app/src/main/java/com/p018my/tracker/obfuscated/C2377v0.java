package com.p018my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.my.tracker.obfuscated.v0 */
/* loaded from: classes2.dex */
public final class C2377v0 {

    /* renamed from: a */
    private C2373u0 f20134a = null;

    /* renamed from: b */
    protected boolean f20135b = false;

    /* renamed from: b */
    private static C2373u0 m13518b(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            AbstractC2391y2.m13568a("HuaweiAdInfoDataProvider: oaid: " + id);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            AbstractC2391y2.m13568a("HuaweiAdInfoDataProvider: oaid tracking enabled: " + zIsLimitAdTrackingEnabled);
            return new C2373u0(id, zIsLimitAdTrackingEnabled);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("HuaweiAdInfoDataProvider: failed to get huawei AId", th);
            return null;
        }
    }

    /* renamed from: a */
    public C2373u0 m13519a(Context context) {
        if (!this.f20135b) {
            this.f20134a = m13518b(context);
            this.f20135b = true;
        }
        return this.f20134a;
    }
}
