package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
public class N extends AbstractC2991p2<Boolean> {
    public N(Context context, String str) {
        super(context, str, "bool");
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2991p2
    public Boolean a(int i) {
        return Boolean.valueOf(this.a.getResources().getBoolean(i));
    }
}
