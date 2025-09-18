package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.B5 */
/* loaded from: classes2.dex */
public abstract class AbstractC4387B5 {

    /* renamed from: a */
    public static final Map f29894a;

    static {
        HashMap map = new HashMap();
        map.put("google", AdTrackingInfo.Provider.GOOGLE);
        map.put("huawei", AdTrackingInfo.Provider.HMS);
        map.put("yandex", AdTrackingInfo.Provider.YANDEX);
        f29894a = Collections.unmodifiableMap(map);
    }
}
