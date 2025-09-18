package io.sentry.android.core;

import android.telephony.PhoneStateListener;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.sentry.C5760E;
import io.sentry.C6017f;
import io.sentry.EnumC6069n1;

/* renamed from: io.sentry.android.core.V */
/* loaded from: classes2.dex */
public final class C5849V extends PhoneStateListener {

    /* renamed from: a */
    public final C5760E f33628a = C5760E.f33234a;

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        if (i == 1) {
            C6017f c6017f = new C6017f();
            c6017f.f34146d = "system";
            c6017f.f34148f = "device.event";
            c6017f.m21778b("CALL_STATE_RINGING", NotificationConstants.ACTION);
            c6017f.f34145c = "Device ringing";
            c6017f.f34150h = EnumC6069n1.INFO;
            this.f33628a.m21384a(c6017f);
        }
    }
}
