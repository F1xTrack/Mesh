package io.appmetrica.analytics.locationapi.internal;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\f"}, m22267d2 = {"Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProviderFactory;", "", "gplLastKnownLocationExtractorProvider", "Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProvider;", "getGplLastKnownLocationExtractorProvider", "()Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProvider;", "gpsLastKnownLocationExtractorProvider", "getGpsLastKnownLocationExtractorProvider", "networkLastKnownLocationExtractorProvider", "getNetworkLastKnownLocationExtractorProvider", "passiveLastKnownLocationExtractorProvider", "getPassiveLastKnownLocationExtractorProvider", "location-api_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface LastKnownLocationExtractorProviderFactory {
    LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider();

    LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider();

    LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider();

    LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider();
}
