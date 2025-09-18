package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.km */
/* loaded from: classes2.dex */
public final class C5256km {

    /* renamed from: a */
    public final InterfaceC5306mm f32112a;

    /* renamed from: b */
    public final InterfaceC5306mm f32113b;

    public C5256km(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f32112a = new C4818T2(new C5354ok(context));
            this.f32113b = new C4818T2(new C5546wc(context));
        } else {
            this.f32112a = new C4895W7();
            this.f32113b = new C4895W7();
        }
    }
}
