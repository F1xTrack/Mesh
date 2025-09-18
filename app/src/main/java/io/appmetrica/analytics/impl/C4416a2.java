package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;

/* renamed from: io.appmetrica.analytics.impl.a2 */
/* loaded from: classes2.dex */
public final class C4416a2 implements AppSetIdListener {
    public final /* synthetic */ C4441b2 a;

    public C4416a2(C4441b2 c4441b2) {
        this.a = c4441b2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onAppSetIdRetrieved(String str, AppSetIdScope appSetIdScope) {
        this.a.c = new AppSetId(str, appSetIdScope);
        this.a.d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onFailure(Throwable th) {
        this.a.d.countDown();
    }
}
