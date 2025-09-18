package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* loaded from: classes2.dex */
public final class N8 {
    public final L8 a;
    public final M8 b;
    public final IBinaryDataHelper c;

    public N8(Context context, Z4 z4) {
        this(new M8(), new L8(), Z6.a(context).a(z4));
    }

    public N8(M8 m8, L8 l8, IBinaryDataHelper iBinaryDataHelper) {
        this.b = m8;
        this.a = l8;
        this.c = iBinaryDataHelper;
    }
}
