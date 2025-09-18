package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import p000.AbstractBinderC11236u12;
import p000.BA1;

/* loaded from: classes.dex */
final class zzbo extends AbstractBinderC11236u12 {
    final WeakReference zza;
    final ResultReceiver zzb;

    public zzbo(WeakReference weakReference, ResultReceiver resultReceiver, zzbn zzbnVar) {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    @Override // p000.InterfaceC8802b22
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.zzb;
        if (resultReceiver == null) {
            int i = BA1.f614a;
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.zza.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.zzb.send(0, null);
            int i2 = BA1.f614a;
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.zzb);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException unused) {
            this.zzb.send(0, null);
            int i3 = BA1.f614a;
        }
    }
}
