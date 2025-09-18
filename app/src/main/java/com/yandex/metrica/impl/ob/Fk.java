package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* loaded from: classes2.dex */
class Fk implements InterfaceC3035ql {
    private final Bundle a;

    public Fk(Context context) {
        this(context, new Wn());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3035ql
    public Bundle a(Activity activity) {
        return this.a;
    }

    public Fk(Context context, Wn wn) {
        ApplicationInfo applicationInfoA = wn.a(context, context.getPackageName(), 128);
        if (applicationInfoA != null) {
            this.a = applicationInfoA.metaData;
        } else {
            this.a = null;
        }
    }
}
