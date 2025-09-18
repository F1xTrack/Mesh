package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.d */
/* loaded from: classes2.dex */
public final class C4271d extends AbstractC4272e {
    public C4271d(C4269b c4269b, ClientContext clientContext) {
        super(c4269b, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, AdValue.class, AdView.class)) {
            return false;
        }
        AdValue adValue = (AdValue) objArr[0];
        AdView adView = (AdView) objArr[1];
        this.f29548a.getClass();
        m19152a(C4269b.m19151a(adValue, ModuleAdType.BANNER, adView.getResponseInfo(), adView.getAdUnitId()));
        return true;
    }
}
