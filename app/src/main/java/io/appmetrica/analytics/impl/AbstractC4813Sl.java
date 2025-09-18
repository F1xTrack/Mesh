package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.Sl */
/* loaded from: classes2.dex */
public abstract class AbstractC4813Sl {
    /* renamed from: a */
    public final ProtobufStateStorage<Object> m19823a(Context context) {
        return mo19602a(context, mo19603c(context));
    }

    /* renamed from: a */
    public abstract ProtobufStateStorage<Object> mo19602a(Context context, IBinaryDataHelper iBinaryDataHelper);

    /* renamed from: b */
    public final ProtobufStateStorage<Object> m19824b(Context context) {
        return mo19602a(context, mo19604d(context));
    }

    /* renamed from: c */
    public abstract IBinaryDataHelper mo19603c(Context context);

    /* renamed from: d */
    public abstract IBinaryDataHelper mo19604d(Context context);
}
