package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4679km {
    public final InterfaceC4727mm a;
    public final InterfaceC4727mm b;

    public C4679km(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.a = new T2(new C4773ok(context));
            this.b = new T2(new C4956wc(context));
        } else {
            this.a = new W7();
            this.b = new W7();
        }
    }
}
