package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import p000.BA1;
import p000.SJ1;

/* loaded from: classes.dex */
final class zzbe extends SJ1 {
    final WeakReference zza;
    final ResultReceiver zzb;

    public zzbe(WeakReference weakReference, ResultReceiver resultReceiver, zzbd zzbdVar) {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback");
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    @Override // p000.OM1
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.zzb.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            int i = BA1.f614a;
            this.zzb.send(6, bundle);
            return;
        }
        int iM534a = BA1.m534a(bundle, "BillingClient");
        if (iM534a != 0) {
            this.zzb.send(iM534a, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            BA1.m538e("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            this.zzb.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.zza.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", this.zzb);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e) {
            int i2 = BA1.f614a;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            String name = e.getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + ": " + message);
            this.zzb.send(6, bundle2);
        }
    }
}
