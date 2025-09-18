package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.Callable;
import p000.AbstractBinderC10081l02;
import p000.BA1;
import p000.C9748iO1;
import p000.M02;
import p000.MZ1;

/* loaded from: classes.dex */
final class zzay implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final Object zzb = new Object();
    private boolean zzc = false;
    private BillingClientStateListener zzd;

    public /* synthetic */ zzay(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzax zzaxVar) {
        this.zza = billingClientImpl;
        this.zzd = billingClientStateListener;
    }

    private final void zzd(BillingResult billingResult) {
        synchronized (this.zzb) {
            try {
                BillingClientStateListener billingClientStateListener = this.zzd;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingSetupFinished(billingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        M02 mz1;
        BA1.m538e("BillingClient", "Billing service connected.");
        BillingClientImpl billingClientImpl = this.zza;
        int i = AbstractBinderC10081l02.f36802a;
        if (iBinder == null) {
            mz1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            mz1 = iInterfaceQueryLocalInterface instanceof M02 ? (M02) iInterfaceQueryLocalInterface : new MZ1(iBinder);
        }
        billingClientImpl.zzg = mz1;
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzav
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zza();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzaw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        };
        BillingClientImpl billingClientImpl2 = this.zza;
        if (billingClientImpl2.zzak(callable, 30000L, runnable, billingClientImpl2.zzag()) == null) {
            BillingClientImpl billingClientImpl3 = this.zza;
            BillingResult billingResultZzai = billingClientImpl3.zzai();
            billingClientImpl3.zzf.zza(zzbx.zzb(25, 6, billingResultZzai));
            zzd(billingResultZzai);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = BA1.f614a;
        this.zza.zzf.zzd(C9748iO1.m19027n());
        this.zza.zzg = null;
        this.zza.zza = 0;
        synchronized (this.zzb) {
            try {
                BillingClientStateListener billingClientStateListener = this.zzd;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingServiceDisconnected();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzay.zza():java.lang.Object");
    }

    public final /* synthetic */ void zzb() {
        this.zza.zza = 0;
        this.zza.zzg = null;
        zzby zzbyVar = this.zza.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 6, billingResult));
        zzd(billingResult);
    }

    public final void zzc() {
        synchronized (this.zzb) {
            this.zzd = null;
            this.zzc = true;
        }
    }
}
