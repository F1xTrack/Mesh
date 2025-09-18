package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.identifiers.impl.h */
/* loaded from: classes2.dex */
public final class C4342h implements InterfaceC4336b {
    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC4336b
    /* renamed from: a */
    public final C4337c mo19171a(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            return new C4337c(IdentifierStatus.OK, new C4335a("google", advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), null, 4);
        } catch (GooglePlayServicesNotAvailableException unused) {
            return new C4337c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, "could not resolve google services", 2);
        } catch (Throwable th) {
            return new C4337c(IdentifierStatus.UNKNOWN, null, "exception while fetching google adv_id: " + th.getMessage(), 2);
        }
    }
}
