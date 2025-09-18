package com.p018my.tracker.obfuscated;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.my.tracker.obfuscated.m0 */
/* loaded from: classes2.dex */
public final class C2341m0 {

    /* renamed from: a */
    private C2337l0 f20033a;

    /* renamed from: b */
    protected boolean f20034b = false;

    /* renamed from: b */
    private static C2337l0 m13298b(Context context) {
        AbstractC2391y2.m13568a("GoogleAdInfoDataProvider: get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            AbstractC2391y2.m13568a("GoogleAdInfoDataProvider: AId: " + id);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            AbstractC2391y2.m13568a("GoogleAdInfoDataProvider: AId ad tracking enabled: " + zIsLimitAdTrackingEnabled);
            return new C2337l0(id, zIsLimitAdTrackingEnabled);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("GoogleAdInfoDataProvider: failed to get google AId", th);
            return null;
        }
    }

    /* renamed from: a */
    public C2337l0 m13299a(Context context) {
        if (!this.f20034b) {
            this.f20033a = m13298b(context);
            this.f20034b = true;
        }
        return this.f20033a;
    }
}
