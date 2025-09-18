package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class Na<T> implements Ma<T> {
    @Override // com.yandex.metrica.impl.ob.Ma
    public Q9 a(Context context) {
        return a(context, c(context));
    }

    public abstract Q9 a(Context context, InterfaceC3226y8 interfaceC3226y8);

    @Override // com.yandex.metrica.impl.ob.Ma
    public Q9 b(Context context) {
        return a(context, d(context));
    }

    public abstract InterfaceC3226y8 c(Context context);

    public abstract InterfaceC3226y8 d(Context context);
}
