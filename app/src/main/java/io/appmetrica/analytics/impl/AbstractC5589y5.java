package io.appmetrica.analytics.impl;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.y5 */
/* loaded from: classes2.dex */
public abstract class AbstractC5589y5 {

    /* renamed from: a */
    public static final List f32847a = CollectionUtils.createSortedListWithoutRepetitions(NotificationConstants.f19487ID, "session_id", "session_type", "number_in_session", "type", "global_number", CrashHianalyticsData.TIME, "event_description");
}
