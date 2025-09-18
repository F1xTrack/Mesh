package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m22267d2 = {"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ActivationBarrier;", "", "", "delay", "Lio/appmetrica/analytics/coreapi/internal/executors/ICommonExecutor;", "executor", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ActivationBarrierCallback;", "callback", "LTf1;", "subscribe", "(JLio/appmetrica/analytics/coreapi/internal/executors/ICommonExecutor;Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ActivationBarrierCallback;)V", "core-api_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface ActivationBarrier {
    void subscribe(long delay, ICommonExecutor executor, ActivationBarrierCallback callback);
}
