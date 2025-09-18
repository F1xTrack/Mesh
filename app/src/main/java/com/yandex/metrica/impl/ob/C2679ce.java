package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.ce, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2679ce {
    public static final boolean a(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
