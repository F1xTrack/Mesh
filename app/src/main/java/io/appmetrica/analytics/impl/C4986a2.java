package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;

/* renamed from: io.appmetrica.analytics.impl.a2 */
/* loaded from: classes2.dex */
public final class C4986a2 implements AppSetIdListener {

    /* renamed from: a */
    public final /* synthetic */ C5011b2 f31236a;

    public C4986a2(C5011b2 c5011b2) {
        this.f31236a = c5011b2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onAppSetIdRetrieved(String str, AppSetIdScope appSetIdScope) {
        this.f31236a.f31280c = new AppSetId(str, appSetIdScope);
        this.f31236a.f31281d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onFailure(Throwable th) {
        this.f31236a.f31281d.countDown();
    }
}
