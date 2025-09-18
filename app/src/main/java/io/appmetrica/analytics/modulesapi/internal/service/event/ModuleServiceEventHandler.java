package io.appmetrica.analytics.modulesapi.internal.service.event;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m22267d2 = {"Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleServiceEventHandler;", "", "handle", "", "context", "Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerContext;", "reportApi", "Lio/appmetrica/analytics/coreapi/internal/event/CounterReportApi;", "modules-api_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface ModuleServiceEventHandler {
    boolean handle(ModuleEventServiceHandlerContext context, CounterReportApi reportApi);
}
