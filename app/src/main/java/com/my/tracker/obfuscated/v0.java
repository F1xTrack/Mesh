package com.my.tracker.obfuscated;

import android.content.Context;

/* loaded from: classes2.dex */
public final class v0 {
    private u0 a = null;
    protected boolean b = false;

    private static u0 b(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            y2.a("HuaweiAdInfoDataProvider: oaid: " + id);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            y2.a("HuaweiAdInfoDataProvider: oaid tracking enabled: " + zIsLimitAdTrackingEnabled);
            return new u0(id, zIsLimitAdTrackingEnabled);
        } catch (Throwable th) {
            y2.b("HuaweiAdInfoDataProvider: failed to get huawei AId", th);
            return null;
        }
    }

    public u0 a(Context context) {
        if (!this.b) {
            this.a = b(context);
            this.b = true;
        }
        return this.a;
    }
}
