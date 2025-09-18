package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.zf */
/* loaded from: classes2.dex */
public final class C5624zf implements InterfaceC4635La {

    /* renamed from: a */
    public final InstallReferrerClient f32921a;

    /* renamed from: b */
    public final ICommonExecutor f32922b;

    public C5624zf(Context context, ICommonExecutor iCommonExecutor) throws Throwable {
        this(InstallReferrerClient.newBuilder(context).build(), iCommonExecutor);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4635La
    /* renamed from: a */
    public final void mo19597a(InterfaceC4592Jf interfaceC4592Jf) throws Throwable {
        this.f32921a.startConnection(new C5574xf(this, interfaceC4592Jf));
    }

    public C5624zf(InstallReferrerClient installReferrerClient, ICommonExecutor iCommonExecutor) {
        this.f32921a = installReferrerClient;
        this.f32922b = iCommonExecutor;
    }
}
