package p000;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: fv0 */
/* loaded from: classes.dex */
public final class C9429fv0 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a */
    public final C9557gv0 f27462a;

    public C9429fv0(C9557gv0 c9557gv0) {
        this.f27462a = c9557gv0;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        C9557gv0.m18671a(this.f27462a, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
