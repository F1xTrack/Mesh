package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.nativead.NativeAd;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* loaded from: classes2.dex */
public final class g extends e {
    public g(b bVar, ClientContext clientContext) {
        super(bVar, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, AdValue.class, NativeAd.class)) {
            return false;
        }
        AdValue adValue = (AdValue) objArr[0];
        NativeAd nativeAd = (NativeAd) objArr[1];
        this.a.getClass();
        a(b.a(adValue, ModuleAdType.NATIVE, nativeAd.getResponseInfo(), null));
        return true;
    }
}
