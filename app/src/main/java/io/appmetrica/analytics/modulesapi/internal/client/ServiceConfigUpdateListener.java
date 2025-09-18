package io.appmetrica.analytics.modulesapi.internal.client;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m22267d2 = {"Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigUpdateListener;", "", "T", "Lio/appmetrica/analytics/modulesapi/internal/client/ModuleServiceConfig;", "config", "LTf1;", "onServiceConfigUpdated", "(Lio/appmetrica/analytics/modulesapi/internal/client/ModuleServiceConfig;)V", "modules-api_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface ServiceConfigUpdateListener<T> {
    void onServiceConfigUpdated(ModuleServiceConfig<T> config);
}
