package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.impl.Al */
/* loaded from: classes2.dex */
public final class C4378Al implements UnderlyingNetworkTask {

    /* renamed from: a */
    public final C4428Cl f29869a;

    /* renamed from: b */
    public C5105el f29870b;

    /* renamed from: c */
    public EnumC4621Kk f29871c;

    /* renamed from: d */
    public final RequestDataHolder f29872d;

    /* renamed from: e */
    public final ConfigProvider f29873e;

    /* renamed from: f */
    public final ResponseDataHolder f29874f;

    /* renamed from: g */
    public final FullUrlFormer f29875g;

    /* renamed from: h */
    public final C4812Sk f29876h;

    public C4378Al(C4428Cl c4428Cl, FullUrlFormer<C5055cl> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C5055cl> configProvider) {
        this(c4428Cl, new C4812Sk(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "Startup task for component: " + this.f29869a.f29972a.f30033f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f29875g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f29872d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f29874f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C5055cl) this.f29873e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((C4402Bk) C5244ka.f32038C.m20639x()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f29872d.setHeader("Accept-Encoding", "encrypted");
        return this.f29869a.m19301g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        if (z) {
            return;
        }
        this.f29871c = EnumC4621Kk.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C5105el c5105elHandle = this.f29876h.handle(this.f29874f);
        this.f29870b = c5105elHandle;
        return c5105elHandle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
        this.f29871c = EnumC4621Kk.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f29871c = EnumC4621Kk.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f29870b == null || this.f29874f.getResponseHeaders() == null) {
            return;
        }
        this.f29869a.m19292a(this.f29870b, (C5055cl) this.f29873e.getConfig(), this.f29874f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f29871c == null) {
            this.f29871c = EnumC4621Kk.UNKNOWN;
        }
        this.f29869a.m19290a(this.f29871c);
    }

    public C4378Al(C4428Cl c4428Cl, C4812Sk c4812Sk, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f29869a = c4428Cl;
        this.f29876h = c4812Sk;
        this.f29872d = requestDataHolder;
        this.f29874f = responseDataHolder;
        this.f29873e = configProvider;
        this.f29875g = fullUrlFormer;
        fullUrlFormer.setHosts(((C5055cl) configProvider.getConfig()).m20253k());
    }
}
