package p000;

import com.p019vk.push.common.ads.PushAdsProvider;
import com.p019vk.push.common.component.TopicComponent;
import com.p019vk.push.common.messaging.interceptor.PushInterceptorStoreProvider;

/* renamed from: As1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7351As1 implements PushAdsProvider {

    /* renamed from: a */
    public final S20 f460a;

    public C7351As1(S20 s20) {
        this.f460a = s20;
    }

    @Override // com.p019vk.push.common.ads.PushAdsProvider
    public final void bind(PushInterceptorStoreProvider pushInterceptorStoreProvider) {
        O90.m5968f(pushInterceptorStoreProvider, "target");
        this.f460a.getClass();
        pushInterceptorStoreProvider.providePushInterceptorStore().addPushInterceptor(new C7399Bq1((TopicComponent) pushInterceptorStoreProvider));
    }

    @Override // com.p019vk.push.common.ads.PushAdsProvider
    public final Q81 setEnabled(boolean z) {
        throw new IllegalStateException("Don't call setEnabled on EmptyPushAdsProviderImpl");
    }
}
