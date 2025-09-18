package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.nativead.NativeAd;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.g */
/* loaded from: classes2.dex */
public final class C4274g extends AbstractC4272e {
    public C4274g(C4269b c4269b, ClientContext clientContext) {
        super(c4269b, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, AdValue.class, NativeAd.class)) {
            return false;
        }
        AdValue adValue = (AdValue) objArr[0];
        NativeAd nativeAd = (NativeAd) objArr[1];
        this.f29548a.getClass();
        m19152a(C4269b.m19151a(adValue, ModuleAdType.NATIVE, nativeAd.getResponseInfo(), null));
        return true;
    }
}
