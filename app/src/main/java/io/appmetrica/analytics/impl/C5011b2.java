package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.b2 */
/* loaded from: classes2.dex */
public final class C5011b2 implements AppSetIdProvider {

    /* renamed from: a */
    public final Context f31278a;

    /* renamed from: b */
    public final IAppSetIdRetriever f31279b;

    /* renamed from: c */
    public volatile AppSetId f31280c;

    /* renamed from: d */
    public CountDownLatch f31281d;

    /* renamed from: e */
    public final long f31282e;

    /* renamed from: f */
    public final C4986a2 f31283f;

    public C5011b2(Context context, IAppSetIdRetriever iAppSetIdRetriever) {
        this.f31278a = context;
        this.f31279b = iAppSetIdRetriever;
        this.f31281d = new CountDownLatch(1);
        this.f31282e = 20L;
        this.f31283f = new C4986a2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f31280c == null) {
            try {
                this.f31281d = new CountDownLatch(1);
                this.f31279b.retrieveAppSetId(this.f31278a, this.f31283f);
                this.f31281d.await(this.f31282e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f31280c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f31280c = appSetId;
        }
        return appSetId;
    }

    public C5011b2(Context context) {
        this(context, AbstractC5036c2.m20209a());
    }
}
