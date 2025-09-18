package io.appmetrica.analytics.modulesapi.internal.client;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¨\u0006\b"}, m22267d2 = {"Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "T", "", "()V", "getBundleConverter", "Lio/appmetrica/analytics/modulesapi/internal/client/BundleToServiceConfigConverter;", "getServiceConfigUpdateListener", "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigUpdateListener;", "modules-api_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public abstract class ServiceConfigExtensionConfiguration<T> {
    public abstract BundleToServiceConfigConverter<T> getBundleConverter();

    public abstract ServiceConfigUpdateListener<T> getServiceConfigUpdateListener();
}
