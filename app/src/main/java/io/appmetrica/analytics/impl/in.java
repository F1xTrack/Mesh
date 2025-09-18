package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes2.dex */
public final class in implements Ha {
    @Override // io.appmetrica.analytics.impl.Ha
    public final String a(Context context) {
        IdentifiersResult identifiersResultQ = new C4719me(Z6.a(context.getApplicationContext()).a()).q();
        if (TextUtils.isEmpty(identifiersResultQ.id)) {
            return null;
        }
        return identifiersResultQ.id;
    }
}
