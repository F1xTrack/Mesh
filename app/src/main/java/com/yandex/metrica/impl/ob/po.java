package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class po implements uo<String> {
    private final String a;

    public po(String str) {
        this.a = str;
    }

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return so.a(this);
        }
        return so.a(this, this.a + " is empty.");
    }
}
