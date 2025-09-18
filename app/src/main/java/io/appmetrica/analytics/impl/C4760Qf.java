package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.Qf */
/* loaded from: classes2.dex */
public final class C4760Qf implements InterfaceC4431D {

    /* renamed from: a */
    public final String f30663a;

    /* renamed from: b */
    public final C4736Pf f30664b;

    public C4760Qf(String str) {
        this(str, new C4736Pf());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4431D
    /* renamed from: a */
    public final AdTrackingInfoResult mo19304a(Context context) {
        return mo19305a(context, new C5447sd());
    }

    /* renamed from: b */
    public final AdTrackingInfoResult m19746b(Context context) throws NoSuchMethodException, SecurityException {
        int i = AdvIdentifiersProvider.f29834a;
        Method method = AdvIdentifiersProvider.class.getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", this.f30663a);
        C4736Pf c4736Pf = this.f30664b;
        Object[] objArr = {context, bundle};
        AdTrackingInfo adTrackingInfo = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        c4736Pf.getClass();
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            Object obj = AbstractC4387B5.f29894a.get(bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
            if (obj == null) {
                throw new IllegalArgumentException(("Provider " + bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
            adTrackingInfo = new AdTrackingInfo((AdTrackingInfo.Provider) obj, bundle3.getString("io.appmetrica.analytics.identifiers.extra.ID"), bundle3.containsKey("io.appmetrica.analytics.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED")) : null);
        }
        return new AdTrackingInfoResult(adTrackingInfo, IdentifierStatus.INSTANCE.from(bundle2.getString("io.appmetrica.analytics.identifiers.extra.STATUS")), bundle2.getString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE"));
    }

    public C4760Qf(String str, C4736Pf c4736Pf) {
        this.f30663a = str;
        this.f30664b = c4736Pf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4431D
    /* renamed from: a */
    public final AdTrackingInfoResult mo19305a(Context context, InterfaceC4905Wh interfaceC4905Wh) throws InterruptedException {
        AdTrackingInfoResult adTrackingInfoResult;
        AdTrackingInfoResult adTrackingInfoResult2;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider")) {
            C4503Fm c4503Fm = (C4503Fm) interfaceC4905Wh;
            c4503Fm.f30154c = 0;
            adTrackingInfoResult = null;
            while (c4503Fm.m19424b()) {
                try {
                    return m19746b(context);
                } catch (InvocationTargetException e) {
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, AbstractC11153tN0.m24914z(new StringBuilder("exception while fetching "), this.f30663a, " adv_id: ", e.getTargetException() != null ? e.getTargetException().getMessage() : null));
                    adTrackingInfoResult = adTrackingInfoResult2;
                    try {
                        Thread.sleep(((C4503Fm) interfaceC4905Wh).f30153b);
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f30663a + " adv_id: " + th.getMessage());
                    adTrackingInfoResult = adTrackingInfoResult2;
                    Thread.sleep(((C4503Fm) interfaceC4905Wh).f30153b);
                }
            }
        } else {
            adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, "Module io.appmetrica.analytics:analytics-identifiers does not exist");
        }
        return adTrackingInfoResult == null ? new AdTrackingInfoResult() : adTrackingInfoResult;
    }
}
