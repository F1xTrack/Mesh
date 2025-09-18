package defpackage;

import com.vk.push.common.ads.PushAdsProvider;
import com.vk.push.common.component.TopicComponent;
import com.vk.push.common.messaging.interceptor.PushInterceptorStoreProvider;

/* renamed from: As1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0076As1 implements PushAdsProvider {
    public final S20 a;

    public C0076As1(S20 s20) {
        this.a = s20;
    }

    @Override // com.vk.push.common.ads.PushAdsProvider
    public final void bind(PushInterceptorStoreProvider pushInterceptorStoreProvider) {
        O90.f(pushInterceptorStoreProvider, "target");
        this.a.getClass();
        pushInterceptorStoreProvider.providePushInterceptorStore().addPushInterceptor(new C0148Bq1((TopicComponent) pushInterceptorStoreProvider));
    }

    @Override // com.vk.push.common.ads.PushAdsProvider
    public final Q81 setEnabled(boolean z) {
        throw new IllegalStateException("Don't call setEnabled on EmptyPushAdsProviderImpl");
    }
}
