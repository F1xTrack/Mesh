package io.appmetrica.analytics.impl;

import com.huawei.hms.rn.push.constants.NotificationConstants;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4846rm {
    public static final List a = CollectionUtils.createSortedListWithoutRepetitions(NotificationConstants.ID, "scope", "data", "timestamp");
}
