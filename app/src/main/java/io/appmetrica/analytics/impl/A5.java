package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class A5 {
    public static final List a = CollectionUtils.createSortedListWithoutRepetitions(NotificationConstants.ID, "type", "report_request_parameters", "session_description");
    public static final String b = String.format(Locale.US, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", "report_request_parameters", "sessions", NotificationConstants.ID, "type", "events", "session_id", "session_type");
    public static final String c = "(select count(events.id) from events where events.session_id = sessions.id) = 0 and cast(id as integer) < ?";
}
