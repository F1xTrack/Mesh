package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: fv0 */
/* loaded from: classes.dex */
public final class C3862fv0 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final C4053gv0 a;

    public C3862fv0(C4053gv0 c4053gv0) {
        this.a = c4053gv0;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        C4053gv0.a(this.a, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
