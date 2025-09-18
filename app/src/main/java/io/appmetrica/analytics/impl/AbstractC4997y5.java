package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4997y5 {
    public static final List a = CollectionUtils.createSortedListWithoutRepetitions(NotificationConstants.ID, "session_id", "session_type", "number_in_session", "type", "global_number", CrashHianalyticsData.TIME, "event_description");
}
