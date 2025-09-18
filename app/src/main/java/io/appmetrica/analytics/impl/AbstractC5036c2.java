package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* renamed from: io.appmetrica.analytics.impl.c2 */
/* loaded from: classes2.dex */
public abstract class AbstractC5036c2 {
    /* renamed from: a */
    public static final IAppSetIdRetriever m20209a() {
        return ReflectionUtils.detectClassExists("com.google.android.gms.appset.AppSet") ? new AppSetIdRetriever() : new C4775R7();
    }
}
