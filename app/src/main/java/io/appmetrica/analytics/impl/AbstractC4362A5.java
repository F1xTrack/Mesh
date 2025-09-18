package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.A5 */
/* loaded from: classes2.dex */
public abstract class AbstractC4362A5 {

    /* renamed from: a */
    public static final List f29845a = CollectionUtils.createSortedListWithoutRepetitions(NotificationConstants.f19487ID, "type", "report_request_parameters", "session_description");

    /* renamed from: b */
    public static final String f29846b = String.format(Locale.US, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", "report_request_parameters", "sessions", NotificationConstants.f19487ID, "type", "events", "session_id", "session_type");

    /* renamed from: c */
    public static final String f29847c = "(select count(events.id) from events where events.session_id = sessions.id) = 0 and cast(id as integer) < ?";
}
