package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.Fk */
/* loaded from: classes2.dex */
class C2612Fk implements InterfaceC3553ql {

    /* renamed from: a */
    private final Bundle f21233a;

    public C2612Fk(Context context) {
        this(context, new C3039Wn());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3553ql
    /* renamed from: a */
    public Bundle mo14011a(Activity activity) {
        return this.f21233a;
    }

    public C2612Fk(Context context, C3039Wn c3039Wn) {
        ApplicationInfo applicationInfoM15403a = c3039Wn.m15403a(context, context.getPackageName(), 128);
        if (applicationInfoM15403a != null) {
            this.f21233a = applicationInfoM15403a.metaData;
        } else {
            this.f21233a = null;
        }
    }
}
