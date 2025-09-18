package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.Dk */
/* loaded from: classes2.dex */
class C2562Dk implements InterfaceC3553ql {

    /* renamed from: a */
    private final C3039Wn f21053a;

    public C2562Dk() {
        this(new C3039Wn());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3553ql
    /* renamed from: a */
    public Bundle mo14011a(Activity activity) {
        ActivityInfo activityInfo;
        C3039Wn c3039Wn = this.f21053a;
        ComponentName componentName = activity.getComponentName();
        c3039Wn.getClass();
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(componentName, 128);
        } catch (Throwable unused) {
            activityInfo = null;
        }
        if (activityInfo != null) {
            return activityInfo.metaData;
        }
        return null;
    }

    public C2562Dk(C3039Wn c3039Wn) {
        this.f21053a = c3039Wn;
    }
}
