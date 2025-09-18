package io.appmetrica.analytics.logger.appmetrica.internal;

import io.appmetrica.analytics.logger.common.BaseImportantLogger;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m22267d2 = {"Lio/appmetrica/analytics/logger/appmetrica/internal/ImportantLogger;", "Lio/appmetrica/analytics/logger/common/BaseImportantLogger;", "logger_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class ImportantLogger extends BaseImportantLogger {
    public static final ImportantLogger INSTANCE = new ImportantLogger();

    private ImportantLogger() {
        super(AppMetricaModule.NAME);
    }
}
