package io.sentry.android.core;

import android.telephony.PhoneStateListener;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import io.sentry.C5122f;
import io.sentry.EnumC5148n1;

/* loaded from: classes2.dex */
public final class V extends PhoneStateListener {
    public final io.sentry.E a = io.sentry.E.a;

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        if (i == 1) {
            C5122f c5122f = new C5122f();
            c5122f.d = "system";
            c5122f.f = "device.event";
            c5122f.b("CALL_STATE_RINGING", NotificationConstants.ACTION);
            c5122f.c = "Device ringing";
            c5122f.h = EnumC5148n1.INFO;
            this.a.a(c5122f);
        }
    }
}
