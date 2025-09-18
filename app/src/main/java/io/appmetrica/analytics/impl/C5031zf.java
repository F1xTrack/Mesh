package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.zf */
/* loaded from: classes2.dex */
public final class C5031zf implements La {
    public final InstallReferrerClient a;
    public final ICommonExecutor b;

    public C5031zf(Context context, ICommonExecutor iCommonExecutor) throws Throwable {
        this(InstallReferrerClient.newBuilder(context).build(), iCommonExecutor);
    }

    @Override // io.appmetrica.analytics.impl.La
    public final void a(Jf jf) throws Throwable {
        this.a.startConnection(new C4983xf(this, jf));
    }

    public C5031zf(InstallReferrerClient installReferrerClient, ICommonExecutor iCommonExecutor) {
        this.a = installReferrerClient;
        this.b = iCommonExecutor;
    }
}
