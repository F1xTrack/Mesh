package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p000.BA1;

/* loaded from: classes.dex */
final class zzas extends ResultReceiver {
    final /* synthetic */ InAppMessageResponseListener zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzas(BillingClientImpl billingClientImpl, Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.zza = inAppMessageResponseListener;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        InAppMessageResponseListener inAppMessageResponseListener = this.zza;
        int i2 = BA1.f614a;
        inAppMessageResponseListener.onInAppMessageResponse(bundle == null ? new InAppMessageResult(0, null) : new InAppMessageResult(bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN")));
    }
}
