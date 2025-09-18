package com.my.tracker.obfuscated;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes2.dex */
public final class m0 {
    private l0 a;
    protected boolean b = false;

    private static l0 b(Context context) {
        y2.a("GoogleAdInfoDataProvider: get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            y2.a("GoogleAdInfoDataProvider: AId: " + id);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            y2.a("GoogleAdInfoDataProvider: AId ad tracking enabled: " + zIsLimitAdTrackingEnabled);
            return new l0(id, zIsLimitAdTrackingEnabled);
        } catch (Throwable th) {
            y2.b("GoogleAdInfoDataProvider: failed to get google AId", th);
            return null;
        }
    }

    public l0 a(Context context) {
        if (!this.b) {
            this.a = b(context);
            this.b = true;
        }
        return this.a;
    }
}
