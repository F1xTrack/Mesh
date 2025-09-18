package com.android.billingclient.api;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.BuildConfig;
import com.p019vk.push.core.base.AidlException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
import p000.AL1;
import p000.AbstractC10858r32;
import p000.AbstractC1374Vq;
import p000.AbstractC8091Oy1;
import p000.BA1;
import p000.C10382nL1;
import p000.C10770qN1;
import p000.C11537wN1;
import p000.C7519Dy1;
import p000.C7729Hz1;
import p000.C8715aM1;
import p000.C9742iL1;
import p000.DL1;
import p000.KL1;
import p000.M02;
import p000.MZ1;
import p000.TM1;
import p000.WM1;

/* loaded from: classes.dex */
class BillingClientImpl extends BillingClient {
    private boolean zzA;
    private ExecutorService zzB;
    private volatile int zza;
    private final String zzb;
    private final Handler zzc;
    private volatile zzk zzd;
    private Context zze;
    private zzby zzf;
    private volatile M02 zzg;
    private volatile zzay zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzcn zzz;

    private BillingClientImpl(Activity activity, zzcn zzcnVar, String str) {
        this(activity.getApplicationContext(), zzcnVar, new zzbq(), str, null, null, null, null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzcn zzcnVar, AlternativeBillingListener alternativeBillingListener, String str, zzby zzbyVar) {
        this.zze = context.getApplicationContext();
        TM1 tm1M8752p = WM1.m8752p();
        tm1M8752p.m22708h();
        WM1.m8750n((WM1) tm1M8752p.f37584b, str);
        String packageName = this.zze.getPackageName();
        tm1M8752p.m22708h();
        WM1.m8751o((WM1) tm1M8752p.f37584b, packageName);
        if (zzbyVar != null) {
            this.zzf = zzbyVar;
        } else {
            this.zzf = new zzcd(this.zze, (WM1) tm1M8752p.m22706a());
        }
        if (purchasesUpdatedListener == null) {
            int i = BA1.f614a;
        }
        this.zzd = new zzk(this.zze, purchasesUpdatedListener, null, alternativeBillingListener, null, this.zzf);
        this.zzz = zzcnVar;
        this.zzA = alternativeBillingListener != null;
        this.zze.getPackageName();
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j) {
        zzbq zzbqVar = new zzbq(j);
        if (isReady()) {
            BA1.m538e("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.zzf.zzb(zzbx.zzd(6));
            zzbqVar.onBillingSetupFinished(zzca.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            int i2 = BA1.f614a;
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzd;
            zzbyVar.zza(zzbx.zzb(37, 6, billingResult));
            zzbqVar.onBillingSetupFinished(billingResult);
            return;
        }
        if (this.zza == 3) {
            int i3 = BA1.f614a;
            zzby zzbyVar2 = this.zzf;
            BillingResult billingResult2 = zzca.zzm;
            zzbyVar2.zza(zzbx.zzb(38, 6, billingResult2));
            zzbqVar.onBillingSetupFinished(billingResult2);
            return;
        }
        this.zza = 1;
        BA1.m538e("BillingClient", "Starting in-app billing setup.");
        this.zzh = new zzay(this, zzbqVar, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    i = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.zzb);
                    if (this.zze.bindService(intent2, this.zzh, 1)) {
                        BA1.m538e("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    i = 39;
                }
            }
        }
        this.zza = 0;
        BA1.m538e("BillingClient", "Billing service unavailable on device.");
        zzby zzbyVar3 = this.zzf;
        BillingResult billingResult3 = zzca.zzc;
        zzbyVar3.zza(zzbx.zzb(i, 6, billingResult3));
        zzbqVar.onBillingSetupFinished(billingResult3);
    }

    public static zzcx zzaf(BillingClientImpl billingClientImpl, String str, int i) {
        Bundle bundle;
        BA1.m538e("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = billingClientImpl.zzn;
        String str2 = billingClientImpl.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putString("playBillingLibraryVersion", str2);
        if (z) {
            bundle2.putBoolean("enablePendingPurchases", true);
        }
        List list = null;
        String string = null;
        while (true) {
            int i2 = 9;
            try {
                int i3 = 0;
                if (billingClientImpl.zzn) {
                    M02 m02 = billingClientImpl.zzg;
                    int i4 = true != billingClientImpl.zzv ? 9 : 19;
                    String packageName = billingClientImpl.zze.getPackageName();
                    MZ1 mz1 = (MZ1) m02;
                    Parcel parcelM5403J = mz1.m5403J();
                    parcelM5403J.writeInt(i4);
                    parcelM5403J.writeString(packageName);
                    parcelM5403J.writeString(str);
                    parcelM5403J.writeString(string);
                    int i5 = AbstractC10858r32.f41324a;
                    parcelM5403J.writeInt(1);
                    bundle2.writeToParcel(parcelM5403J, 0);
                    Parcel parcelM5404K = mz1.m5404K(11, parcelM5403J);
                    bundle = (Bundle) AbstractC10858r32.m24151a(parcelM5404K, Bundle.CREATOR);
                    parcelM5404K.recycle();
                } else {
                    M02 m022 = billingClientImpl.zzg;
                    String packageName2 = billingClientImpl.zze.getPackageName();
                    MZ1 mz12 = (MZ1) m022;
                    Parcel parcelM5403J2 = mz12.m5403J();
                    parcelM5403J2.writeInt(3);
                    parcelM5403J2.writeString(packageName2);
                    parcelM5403J2.writeString(str);
                    parcelM5403J2.writeString(string);
                    Parcel parcelM5404K2 = mz12.m5404K(4, parcelM5403J2);
                    bundle = (Bundle) AbstractC10858r32.m24151a(parcelM5404K2, Bundle.CREATOR);
                    parcelM5404K2.recycle();
                }
                zzcy zzcyVarZza = zzcz.zza(bundle, "BillingClient", "getPurchase()");
                BillingResult billingResultZza = zzcyVarZza.zza();
                if (billingResultZza != zzca.zzl) {
                    billingClientImpl.zzf.zza(zzbx.zzb(zzcyVarZza.zzb(), 9, billingResultZza));
                    return new zzcx(billingResultZza, list);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z2 = false;
                while (i3 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i3);
                    String str4 = stringArrayList3.get(i3);
                    BA1.m538e("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i3))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            z2 = true;
                        }
                        arrayList.add(purchase);
                        i3++;
                        i2 = 9;
                    } catch (JSONException unused) {
                        int i6 = BA1.f614a;
                        zzby zzbyVar = billingClientImpl.zzf;
                        BillingResult billingResult = zzca.zzj;
                        zzbyVar.zza(zzbx.zzb(51, 9, billingResult));
                        return new zzcx(billingResult, null);
                    }
                }
                int i7 = i2;
                if (z2) {
                    billingClientImpl.zzf.zza(zzbx.zzb(26, i7, zzca.zzj));
                }
                string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                BA1.m538e("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new zzcx(zzca.zzl, arrayList);
                }
                list = null;
            } catch (Exception unused2) {
                zzby zzbyVar2 = billingClientImpl.zzf;
                BillingResult billingResult2 = zzca.zzm;
                zzbyVar2.zza(zzbx.zzb(52, 9, billingResult2));
                int i8 = BA1.f614a;
                return new zzcx(billingResult2, null);
            }
        }
    }

    public final Handler zzag() {
        return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());
    }

    private final BillingResult zzah(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new Runnable() { // from class: com.android.billingclient.api.zzm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzR(billingResult);
            }
        });
        return billingResult;
    }

    public final BillingResult zzai() {
        return (this.zza == 0 || this.zza == 3) ? zzca.zzm : zzca.zzj;
    }

    @SuppressLint({"PrivateApi"})
    private static String zzaj() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public final Future zzak(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.zzB == null) {
            this.zzB = Executors.newFixedThreadPool(BA1.f614a, new zzap(this));
        }
        try {
            final Future futureSubmit = this.zzB.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    int i = BA1.f614a;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception unused) {
            int i = BA1.f614a;
            return null;
        }
    }

    private final void zzal(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 11, billingResult));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
            return;
        }
        if (zzak(new zzar(this, str, purchaseHistoryResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzZ(purchaseHistoryResponseListener);
            }
        }, zzag()) == null) {
            BillingResult billingResultZzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 11, billingResultZzai));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResultZzai, null);
        }
    }

    private final void zzam(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 9, billingResult));
            C7519Dy1 c7519Dy1 = AbstractC8091Oy1.f8764b;
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, C7729Hz1.f4623e);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            int i = BA1.f614a;
            zzby zzbyVar2 = this.zzf;
            BillingResult billingResult2 = zzca.zzg;
            zzbyVar2.zza(zzbx.zzb(50, 9, billingResult2));
            C7519Dy1 c7519Dy12 = AbstractC8091Oy1.f8764b;
            purchasesResponseListener.onQueryPurchasesResponse(billingResult2, C7729Hz1.f4623e);
            return;
        }
        if (zzak(new zzaq(this, str, purchasesResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzaa
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaa(purchasesResponseListener);
            }
        }, zzag()) == null) {
            BillingResult billingResultZzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 9, billingResultZzai));
            C7519Dy1 c7519Dy13 = AbstractC8091Oy1.f8764b;
            purchasesResponseListener.onQueryPurchasesResponse(billingResultZzai, C7729Hz1.f4623e);
        }
    }

    private final void zzan(BillingResult billingResult, int i, int i2) {
        DL1 dl1 = null;
        C10382nL1 c10382nL1 = null;
        if (billingResult.getResponseCode() == 0) {
            zzby zzbyVar = this.zzf;
            int i3 = zzbx.zza;
            try {
                AL1 al1M1648p = DL1.m1648p();
                al1M1648p.m22708h();
                DL1.m1647o((DL1) al1M1648p.f37584b, 5);
                C10770qN1 c10770qN1M25610o = C11537wN1.m25610o();
                c10770qN1M25610o.m22708h();
                C11537wN1.m25609n((C11537wN1) c10770qN1M25610o.f37584b, i2);
                C11537wN1 c11537wN1 = (C11537wN1) c10770qN1M25610o.m22706a();
                al1M1648p.m22708h();
                DL1.m1646n((DL1) al1M1648p.f37584b, c11537wN1);
                dl1 = (DL1) al1M1648p.m22706a();
            } catch (Exception unused) {
                int i4 = BA1.f614a;
            }
            zzbyVar.zzb(dl1);
            return;
        }
        zzby zzbyVar2 = this.zzf;
        int i5 = zzbx.zza;
        try {
            C9742iL1 c9742iL1M23130r = C10382nL1.m23130r();
            KL1 kl1M9720r = C8715aM1.m9720r();
            int responseCode = billingResult.getResponseCode();
            kl1M9720r.m22708h();
            C8715aM1.m9716n((C8715aM1) kl1M9720r.f37584b, responseCode);
            String debugMessage = billingResult.getDebugMessage();
            kl1M9720r.m22708h();
            C8715aM1.m9717o((C8715aM1) kl1M9720r.f37584b, debugMessage);
            kl1M9720r.m22708h();
            C8715aM1.m9719q((C8715aM1) kl1M9720r.f37584b, i);
            c9742iL1M23130r.m22708h();
            C10382nL1.m23127o((C10382nL1) c9742iL1M23130r.f37584b, (C8715aM1) kl1M9720r.m22706a());
            c9742iL1M23130r.m22708h();
            C10382nL1.m23129q((C10382nL1) c9742iL1M23130r.f37584b, 5);
            C10770qN1 c10770qN1M25610o2 = C11537wN1.m25610o();
            c10770qN1M25610o2.m22708h();
            C11537wN1.m25609n((C11537wN1) c10770qN1M25610o2.f37584b, i2);
            C11537wN1 c11537wN12 = (C11537wN1) c10770qN1M25610o2.m22706a();
            c9742iL1M23130r.m22708h();
            C10382nL1.m23128p((C10382nL1) c9742iL1M23130r.f37584b, c11537wN12);
            c10382nL1 = (C10382nL1) c9742iL1M23130r.m22706a();
        } catch (Exception unused2) {
            int i6 = BA1.f614a;
        }
        zzbyVar2.zza(c10382nL1);
    }

    public static zzbp zzg(BillingClientImpl billingClientImpl, String str) {
        BA1.m538e("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = billingClientImpl.zzn;
        String str2 = billingClientImpl.zzb;
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str2);
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        List list = null;
        String string = null;
        while (billingClientImpl.zzl) {
            int i = 11;
            try {
                M02 m02 = billingClientImpl.zzg;
                String packageName = billingClientImpl.zze.getPackageName();
                MZ1 mz1 = (MZ1) m02;
                Parcel parcelM5403J = mz1.m5403J();
                parcelM5403J.writeInt(6);
                parcelM5403J.writeString(packageName);
                parcelM5403J.writeString(str);
                parcelM5403J.writeString(string);
                int i2 = AbstractC10858r32.f41324a;
                parcelM5403J.writeInt(1);
                int i3 = 0;
                bundle.writeToParcel(parcelM5403J, 0);
                Parcel parcelM5404K = mz1.m5404K(9, parcelM5403J);
                Bundle bundle2 = (Bundle) AbstractC10858r32.m24151a(parcelM5404K, Bundle.CREATOR);
                parcelM5404K.recycle();
                zzcy zzcyVarZza = zzcz.zza(bundle2, "BillingClient", "getPurchaseHistory()");
                BillingResult billingResultZza = zzcyVarZza.zza();
                if (billingResultZza != zzca.zzl) {
                    billingClientImpl.zzf.zza(zzbx.zzb(zzcyVarZza.zzb(), 11, billingResultZza));
                    return new zzbp(billingResultZza, list);
                }
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z2 = false;
                while (i3 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i3);
                    String str4 = stringArrayList3.get(i3);
                    BA1.m538e("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i3))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            z2 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i3++;
                        i = 11;
                    } catch (JSONException unused) {
                        int i4 = BA1.f614a;
                        zzby zzbyVar = billingClientImpl.zzf;
                        BillingResult billingResult = zzca.zzj;
                        zzbyVar.zza(zzbx.zzb(51, 11, billingResult));
                        return new zzbp(billingResult, null);
                    }
                }
                int i5 = i;
                if (z2) {
                    billingClientImpl.zzf.zza(zzbx.zzb(26, i5, zzca.zzj));
                }
                string = bundle2.getString("INAPP_CONTINUATION_TOKEN");
                BA1.m538e("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new zzbp(zzca.zzl, arrayList);
                }
                list = null;
            } catch (RemoteException unused2) {
                int i6 = BA1.f614a;
                zzby zzbyVar2 = billingClientImpl.zzf;
                BillingResult billingResult2 = zzca.zzm;
                zzbyVar2.zza(zzbx.zzb(59, 11, billingResult2));
                return new zzbp(billingResult2, null);
            }
        }
        int i7 = BA1.f614a;
        return new zzbp(zzca.zzq, list);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return;
        }
        if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            int i = BA1.f614a;
            zzby zzbyVar2 = this.zzf;
            BillingResult billingResult2 = zzca.zzi;
            zzbyVar2.zza(zzbx.zzb(26, 3, billingResult2));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            return;
        }
        if (!this.zzn) {
            zzby zzbyVar3 = this.zzf;
            BillingResult billingResult3 = zzca.zzb;
            zzbyVar3.zza(zzbx.zzb(27, 3, billingResult3));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
            return;
        }
        if (zzak(new Callable() { // from class: com.android.billingclient.api.zzq
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzk(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzQ(acknowledgePurchaseResponseListener);
            }
        }, zzag()) == null) {
            BillingResult billingResultZzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 3, billingResultZzai));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultZzai);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
            return;
        }
        if (zzak(new Callable() { // from class: com.android.billingclient.api.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzl(consumeParams, consumeResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzS(consumeResponseListener, consumeParams);
            }
        }, zzag()) == null) {
            BillingResult billingResultZzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 4, billingResultZzai));
            consumeResponseListener.onConsumeResponse(billingResultZzai, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zze
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 15, billingResult));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
            return;
        }
        if (this.zzx) {
            if (zzak(new Callable() { // from class: com.android.billingclient.api.zzv
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzq(alternativeBillingOnlyReportingDetailsListener);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzT(alternativeBillingOnlyReportingDetailsListener);
                }
            }, zzag()) == null) {
                BillingResult billingResultZzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 15, billingResultZzai));
                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultZzai, null);
                return;
            }
            return;
        }
        int i = BA1.f614a;
        zzby zzbyVar2 = this.zzf;
        BillingResult billingResult2 = zzca.zzE;
        zzbyVar2.zza(zzbx.zzb(66, 15, billingResult2));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 24, billingResult));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        if (this.zzy) {
            if (zzak(new Callable() { // from class: com.android.billingclient.api.zzx
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzr(externalOfferReportingDetailsListener);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzag
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzU(externalOfferReportingDetailsListener);
                }
            }, zzag()) == null) {
                BillingResult billingResultZzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 24, billingResultZzai));
                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultZzai, null);
                return;
            }
            return;
        }
        int i = BA1.f614a;
        zzby zzbyVar2 = this.zzf;
        BillingResult billingResult2 = zzca.zzy;
        zzbyVar2.zza(zzbx.zzb(AidlException.HOST_IS_NOT_MASTER, 24, billingResult2));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult2, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        this.zzf.zzb(zzbx.zzd(12));
        try {
            try {
                if (this.zzd != null) {
                    this.zzd.zzf();
                }
                if (this.zzh != null) {
                    this.zzh.zzc();
                }
                if (this.zzh != null && this.zzg != null) {
                    BA1.m538e("BillingClient", "Unbinding from service.");
                    this.zze.unbindService(this.zzh);
                    this.zzh = null;
                }
                this.zzg = null;
                ExecutorService executorService = this.zzB;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.zzB = null;
                }
            } catch (Exception unused) {
                int i = BA1.f614a;
            }
            this.zza = 3;
        } catch (Throwable th) {
            this.zza = 3;
            throw th;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            int i = BA1.f614a;
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 13, billingResult));
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        if (!this.zzu) {
            int i2 = BA1.f614a;
            zzby zzbyVar2 = this.zzf;
            BillingResult billingResult2 = zzca.zzA;
            zzbyVar2.zza(zzbx.zzb(32, 13, billingResult2));
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            return;
        }
        String str = this.zzb;
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (zzak(new Callable() { // from class: com.android.billingclient.api.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzm(bundle, billingConfigResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzV(billingConfigResponseListener);
            }
        }, zzag()) == null) {
            BillingResult billingResultZzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 13, billingResultZzai));
            billingConfigResponseListener.onBillingConfigResponse(billingResultZzai, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.zza;
    }

    @Override // com.android.billingclient.api.BillingClient
    @zze
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 14, billingResult));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        if (this.zzx) {
            if (zzak(new Callable() { // from class: com.android.billingclient.api.zzab
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzs(alternativeBillingOnlyAvailabilityListener);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzac
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzW(alternativeBillingOnlyAvailabilityListener);
                }
            }, zzag()) == null) {
                BillingResult billingResultZzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 14, billingResultZzai));
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResultZzai);
                return;
            }
            return;
        }
        int i = BA1.f614a;
        zzby zzbyVar2 = this.zzf;
        BillingResult billingResult2 = zzca.zzE;
        zzbyVar2.zza(zzbx.zzb(66, 14, billingResult2));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult2);
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 23, billingResult));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        if (this.zzy) {
            if (zzak(new Callable() { // from class: com.android.billingclient.api.zzam
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzt(externalOfferAvailabilityListener);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzan
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzX(externalOfferAvailabilityListener);
                }
            }, zzag()) == null) {
                BillingResult billingResultZzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 23, billingResultZzai));
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResultZzai);
                return;
            }
            return;
        }
        int i = BA1.f614a;
        zzby zzbyVar2 = this.zzf;
        BillingResult billingResult2 = zzca.zzy;
        zzbyVar2.zza(zzbx.zzb(AidlException.HOST_IS_NOT_MASTER, 23, billingResult2));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00d1  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:397:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x047d A[Catch: CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x04d9, blocks: (B:427:0x047d, B:429:0x0484, B:430:0x0488, B:433:0x0491, B:435:0x04a7, B:439:0x04b2, B:440:0x04b6, B:443:0x04bf), top: B:458:0x047b }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0491 A[Catch: CancellationException | TimeoutException -> 0x048f, CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9, TryCatch #2 {Exception -> 0x04d9, blocks: (B:427:0x047d, B:429:0x0484, B:430:0x0488, B:433:0x0491, B:435:0x04a7, B:439:0x04b2, B:440:0x04b6, B:443:0x04bf), top: B:458:0x047b }] */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r32, final com.android.billingclient.api.BillingFlowParams r33) {
        /*
            Method dump skipped, instructions count: 1293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 7, billingResult));
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
            return;
        }
        if (this.zzt) {
            if (zzak(new Callable() { // from class: com.android.billingclient.api.zzaj
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzn(queryProductDetailsParams, productDetailsResponseListener);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzak
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzY(productDetailsResponseListener);
                }
            }, zzag()) == null) {
                BillingResult billingResultZzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 7, billingResultZzai));
                productDetailsResponseListener.onProductDetailsResponse(billingResultZzai, new ArrayList());
                return;
            }
            return;
        }
        int i = BA1.f614a;
        zzby zzbyVar2 = this.zzf;
        BillingResult billingResult2 = zzca.zzv;
        zzbyVar2.zza(zzbx.zzb(20, 7, billingResult2));
        productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzal(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        zzam(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 8, billingResult));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            int i = BA1.f614a;
            zzby zzbyVar2 = this.zzf;
            BillingResult billingResult2 = zzca.zzf;
            zzbyVar2.zza(zzbx.zzb(49, 8, billingResult2));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, null);
            return;
        }
        if (skusList == null) {
            int i2 = BA1.f614a;
            zzby zzbyVar3 = this.zzf;
            BillingResult billingResult3 = zzca.zze;
            zzbyVar3.zza(zzbx.zzb(48, 8, billingResult3));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, null);
            return;
        }
        final String str = null;
        if (zzak(new Callable(skuType, skusList, str, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzy
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzo(this.zzb, this.zzc, null, this.zzd);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzab(skuDetailsResponseListener);
            }
        }, zzag()) == null) {
            BillingResult billingResultZzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 8, billingResultZzai));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResultZzai, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zze
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 16, billingResult));
            return billingResult;
        }
        if (!this.zzx) {
            int i = BA1.f614a;
            zzby zzbyVar2 = this.zzf;
            BillingResult billingResult2 = zzca.zzE;
            zzbyVar2.zza(zzbx.zzb(66, 16, billingResult2));
            return billingResult2;
        }
        final zzat zzatVar = new zzat(this, this.zzc, alternativeBillingOnlyInformationDialogListener);
        if (zzak(new Callable() { // from class: com.android.billingclient.api.zzo
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzu(activity, zzatVar, alternativeBillingOnlyInformationDialogListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzac(alternativeBillingOnlyInformationDialogListener);
            }
        }, this.zzc) != null) {
            return zzca.zzl;
        }
        BillingResult billingResultZzai = zzai();
        this.zzf.zza(zzbx.zzb(25, 16, billingResultZzai));
        return billingResultZzai;
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(2, 25, billingResult));
            return billingResult;
        }
        if (!this.zzy) {
            int i = BA1.f614a;
            zzby zzbyVar2 = this.zzf;
            BillingResult billingResult2 = zzca.zzy;
            zzbyVar2.zza(zzbx.zzb(AidlException.HOST_IS_NOT_MASTER, 25, billingResult2));
            return billingResult2;
        }
        final zzau zzauVar = new zzau(this, this.zzc, externalOfferInformationDialogListener);
        if (zzak(new Callable() { // from class: com.android.billingclient.api.zzaf
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzv(activity, zzauVar, externalOfferInformationDialogListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzah
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzad(externalOfferInformationDialogListener);
            }
        }, this.zzc) != null) {
            return zzca.zzl;
        }
        BillingResult billingResultZzai = zzai();
        this.zzf.zza(zzbx.zzb(25, 25, billingResultZzai));
        return billingResultZzai;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            int i = BA1.f614a;
            return zzca.zzm;
        }
        if (!this.zzp) {
            int i2 = BA1.f614a;
            return zzca.zzw;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.zzb);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        final zzas zzasVar = new zzas(this, this.zzc, inAppMessageResponseListener);
        zzak(new Callable() { // from class: com.android.billingclient.api.zzal
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzp(bundle, activity, zzasVar);
                return null;
            }
        }, 5000L, null, this.zzc);
        return zzca.zzl;
    }

    public final /* synthetic */ void zzQ(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 3, billingResult));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public final /* synthetic */ void zzR(BillingResult billingResult) {
        if (this.zzd.zzd() != null) {
            this.zzd.zzd().onPurchasesUpdated(billingResult, null);
        } else {
            int i = BA1.f614a;
        }
    }

    public final /* synthetic */ void zzS(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 4, billingResult));
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public final /* synthetic */ void zzT(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 15, billingResult));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    public final /* synthetic */ void zzU(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 24, billingResult));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    public final /* synthetic */ void zzV(BillingConfigResponseListener billingConfigResponseListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 13, billingResult));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public final /* synthetic */ void zzW(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 14, billingResult));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    public final /* synthetic */ void zzX(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 23, billingResult));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    public final /* synthetic */ void zzY(ProductDetailsResponseListener productDetailsResponseListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 7, billingResult));
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
    }

    public final /* synthetic */ void zzZ(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 11, billingResult));
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
    }

    public final void zzaa(PurchasesResponseListener purchasesResponseListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 9, billingResult));
        C7519Dy1 c7519Dy1 = AbstractC8091Oy1.f8764b;
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, C7729Hz1.f4623e);
    }

    public final /* synthetic */ void zzab(SkuDetailsResponseListener skuDetailsResponseListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 8, billingResult));
        skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
    }

    public final /* synthetic */ void zzac(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 16, billingResult));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    public final /* synthetic */ void zzad(ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        zzby zzbyVar = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzbyVar.zza(zzbx.zzb(24, 25, billingResult));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    public final Bundle zzc(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        M02 m02 = this.zzg;
        String packageName = this.zze.getPackageName();
        MZ1 mz1 = (MZ1) m02;
        Parcel parcelM5403J = mz1.m5403J();
        parcelM5403J.writeInt(i);
        parcelM5403J.writeString(packageName);
        parcelM5403J.writeString(str);
        parcelM5403J.writeString(str2);
        parcelM5403J.writeString(null);
        int i2 = AbstractC10858r32.f41324a;
        parcelM5403J.writeInt(1);
        bundle.writeToParcel(parcelM5403J, 0);
        Parcel parcelM5404K = mz1.m5404K(8, parcelM5403J);
        Bundle bundle2 = (Bundle) AbstractC10858r32.m24151a(parcelM5404K, Bundle.CREATOR);
        parcelM5404K.recycle();
        return bundle2;
    }

    public final Bundle zzd(String str, String str2) throws Exception {
        M02 m02 = this.zzg;
        String packageName = this.zze.getPackageName();
        MZ1 mz1 = (MZ1) m02;
        Parcel parcelM5403J = mz1.m5403J();
        parcelM5403J.writeInt(3);
        parcelM5403J.writeString(packageName);
        parcelM5403J.writeString(str);
        parcelM5403J.writeString(str2);
        parcelM5403J.writeString(null);
        Parcel parcelM5404K = mz1.m5404K(3, parcelM5403J);
        Bundle bundle = (Bundle) AbstractC10858r32.m24151a(parcelM5404K, Bundle.CREATOR);
        parcelM5404K.recycle();
        return bundle;
    }

    public final Object zzk(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            M02 m02 = this.zzg;
            String packageName = this.zze.getPackageName();
            String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            String str = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            MZ1 mz1 = (MZ1) m02;
            Parcel parcelM5403J = mz1.m5403J();
            parcelM5403J.writeInt(9);
            parcelM5403J.writeString(packageName);
            parcelM5403J.writeString(purchaseToken);
            int i = AbstractC10858r32.f41324a;
            parcelM5403J.writeInt(1);
            bundle.writeToParcel(parcelM5403J, 0);
            Parcel parcelM5404K = mz1.m5404K(902, parcelM5403J);
            Bundle bundle2 = (Bundle) AbstractC10858r32.m24151a(parcelM5404K, Bundle.CREATOR);
            parcelM5404K.recycle();
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzca.zza(BA1.m534a(bundle2, "BillingClient"), BA1.m537d(bundle2, "BillingClient")));
            return null;
        } catch (Exception unused) {
            int i2 = BA1.f614a;
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(28, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return null;
        }
    }

    public final Object zzl(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        String strM537d;
        int i;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            BA1.m538e("BillingClient", "Consuming purchase with token: " + purchaseToken);
            if (this.zzn) {
                M02 m02 = this.zzg;
                String packageName = this.zze.getPackageName();
                boolean z = this.zzn;
                String str = this.zzb;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str);
                }
                MZ1 mz1 = (MZ1) m02;
                Parcel parcelM5403J = mz1.m5403J();
                parcelM5403J.writeInt(9);
                parcelM5403J.writeString(packageName);
                parcelM5403J.writeString(purchaseToken);
                int i2 = AbstractC10858r32.f41324a;
                parcelM5403J.writeInt(1);
                bundle.writeToParcel(parcelM5403J, 0);
                Parcel parcelM5404K = mz1.m5404K(12, parcelM5403J);
                Bundle bundle2 = (Bundle) AbstractC10858r32.m24151a(parcelM5404K, Bundle.CREATOR);
                parcelM5404K.recycle();
                i = bundle2.getInt("RESPONSE_CODE");
                strM537d = BA1.m537d(bundle2, "BillingClient");
            } else {
                M02 m022 = this.zzg;
                String packageName2 = this.zze.getPackageName();
                MZ1 mz12 = (MZ1) m022;
                Parcel parcelM5403J2 = mz12.m5403J();
                parcelM5403J2.writeInt(3);
                parcelM5403J2.writeString(packageName2);
                parcelM5403J2.writeString(purchaseToken);
                Parcel parcelM5404K2 = mz12.m5404K(5, parcelM5403J2);
                int i3 = parcelM5404K2.readInt();
                parcelM5404K2.recycle();
                strM537d = "";
                i = i3;
            }
            BillingResult billingResultZza = zzca.zza(i, strM537d);
            if (i == 0) {
                BA1.m538e("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(billingResultZza, purchaseToken);
                return null;
            }
            this.zzf.zza(zzbx.zzb(23, 4, billingResultZza));
            consumeResponseListener.onConsumeResponse(billingResultZza, purchaseToken);
            return null;
        } catch (Exception unused) {
            int i4 = BA1.f614a;
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(29, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, purchaseToken);
            return null;
        }
    }

    public final /* synthetic */ Object zzm(Bundle bundle, BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        try {
            ((MZ1) this.zzg).m5402I(this.zze.getPackageName(), bundle, new zzbg(billingConfigResponseListener, this.zzf, null));
        } catch (DeadObjectException unused) {
            int i = BA1.f614a;
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzbyVar.zza(zzbx.zzb(62, 13, billingResult));
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
        } catch (Exception unused2) {
            int i2 = BA1.f614a;
            zzby zzbyVar2 = this.zzf;
            BillingResult billingResult2 = zzca.zzj;
            zzbyVar2.zza(zzbx.zzb(62, 13, billingResult2));
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x010f, code lost:
    
        r13 = 4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzn(com.android.billingclient.api.QueryProductDetailsParams r23, com.android.billingclient.api.ProductDetailsResponseListener r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.zzn(com.android.billingclient.api.QueryProductDetailsParams, com.android.billingclient.api.ProductDetailsResponseListener):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b0, code lost:
    
        r4 = 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzo(java.lang.String r18, java.util.List r19, java.lang.String r20, com.android.billingclient.api.SkuDetailsResponseListener r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.zzo(java.lang.String, java.util.List, java.lang.String, com.android.billingclient.api.SkuDetailsResponseListener):java.lang.Object");
    }

    public final Object zzp(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        M02 m02 = this.zzg;
        String packageName = this.zze.getPackageName();
        zzbo zzboVar = new zzbo(new WeakReference(activity), resultReceiver, null);
        MZ1 mz1 = (MZ1) m02;
        Parcel parcelM5403J = mz1.m5403J();
        parcelM5403J.writeInt(12);
        parcelM5403J.writeString(packageName);
        int i = AbstractC10858r32.f41324a;
        parcelM5403J.writeInt(1);
        bundle.writeToParcel(parcelM5403J, 0);
        parcelM5403J.writeStrongBinder(zzboVar);
        mz1.m5405L(1201, parcelM5403J);
        return null;
    }

    public final Void zzq(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        try {
            M02 m02 = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle bundleM535b = BA1.m535b(this.zzb);
            zzba zzbaVar = new zzba(alternativeBillingOnlyReportingDetailsListener, this.zzf, null);
            MZ1 mz1 = (MZ1) m02;
            Parcel parcelM5403J = mz1.m5403J();
            parcelM5403J.writeInt(21);
            parcelM5403J.writeString(packageName);
            int i = AbstractC10858r32.f41324a;
            parcelM5403J.writeInt(1);
            bundleM535b.writeToParcel(parcelM5403J, 0);
            parcelM5403J.writeStrongBinder(zzbaVar);
            mz1.m5406M(1501, parcelM5403J);
        } catch (Exception unused) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzj;
            zzbyVar.zza(zzbx.zzb(70, 15, billingResult));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
        }
        return null;
    }

    public final Void zzr(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        try {
            M02 m02 = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle bundleM535b = BA1.m535b(this.zzb);
            zzbc zzbcVar = new zzbc(externalOfferReportingDetailsListener, this.zzf, null);
            MZ1 mz1 = (MZ1) m02;
            Parcel parcelM5403J = mz1.m5403J();
            parcelM5403J.writeInt(22);
            parcelM5403J.writeString(packageName);
            int i = AbstractC10858r32.f41324a;
            parcelM5403J.writeInt(1);
            bundleM535b.writeToParcel(parcelM5403J, 0);
            parcelM5403J.writeStrongBinder(zzbcVar);
            mz1.m5406M(1801, parcelM5403J);
        } catch (Exception e) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzj;
            String name = e.getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            zzbyVar.zza(zzbx.zzc(94, 24, billingResult, AbstractC1374Vq.m8589h(name, ": ", message)));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
        }
        return null;
    }

    public final Void zzs(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        try {
            M02 m02 = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle bundleM535b = BA1.m535b(this.zzb);
            zzbk zzbkVar = new zzbk(alternativeBillingOnlyAvailabilityListener, this.zzf, null);
            MZ1 mz1 = (MZ1) m02;
            Parcel parcelM5403J = mz1.m5403J();
            parcelM5403J.writeInt(21);
            parcelM5403J.writeString(packageName);
            int i = AbstractC10858r32.f41324a;
            parcelM5403J.writeInt(1);
            bundleM535b.writeToParcel(parcelM5403J, 0);
            parcelM5403J.writeStrongBinder(zzbkVar);
            mz1.m5406M(1401, parcelM5403J);
        } catch (Exception unused) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzj;
            zzbyVar.zza(zzbx.zzb(69, 14, billingResult));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
        }
        return null;
    }

    public final Void zzt(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        try {
            M02 m02 = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle bundleM535b = BA1.m535b(this.zzb);
            zzbm zzbmVar = new zzbm(externalOfferAvailabilityListener, this.zzf, null);
            MZ1 mz1 = (MZ1) m02;
            Parcel parcelM5403J = mz1.m5403J();
            parcelM5403J.writeInt(22);
            parcelM5403J.writeString(packageName);
            int i = AbstractC10858r32.f41324a;
            parcelM5403J.writeInt(1);
            bundleM535b.writeToParcel(parcelM5403J, 0);
            parcelM5403J.writeStrongBinder(zzbmVar);
            mz1.m5406M(1701, parcelM5403J);
        } catch (Exception e) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzj;
            String name = e.getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            zzbyVar.zza(zzbx.zzc(91, 23, billingResult, AbstractC1374Vq.m8589h(name, ": ", message)));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
        }
        return null;
    }

    public final Void zzu(Activity activity, ResultReceiver resultReceiver, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) throws Exception {
        try {
            M02 m02 = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle bundleM535b = BA1.m535b(this.zzb);
            zzbe zzbeVar = new zzbe(new WeakReference(activity), resultReceiver, null);
            MZ1 mz1 = (MZ1) m02;
            Parcel parcelM5403J = mz1.m5403J();
            parcelM5403J.writeInt(21);
            parcelM5403J.writeString(packageName);
            int i = AbstractC10858r32.f41324a;
            parcelM5403J.writeInt(1);
            bundleM535b.writeToParcel(parcelM5403J, 0);
            parcelM5403J.writeStrongBinder(zzbeVar);
            mz1.m5406M(1601, parcelM5403J);
        } catch (Exception unused) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzj;
            zzbyVar.zza(zzbx.zzb(74, 16, billingResult));
            alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
        }
        return null;
    }

    public final Void zzv(Activity activity, ResultReceiver resultReceiver, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) throws Exception {
        try {
            M02 m02 = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle bundleM535b = BA1.m535b(this.zzb);
            zzbi zzbiVar = new zzbi(new WeakReference(activity), resultReceiver, null);
            MZ1 mz1 = (MZ1) m02;
            Parcel parcelM5403J = mz1.m5403J();
            parcelM5403J.writeInt(22);
            parcelM5403J.writeString(packageName);
            int i = AbstractC10858r32.f41324a;
            parcelM5403J.writeInt(1);
            bundleM535b.writeToParcel(parcelM5403J, 0);
            parcelM5403J.writeStrongBinder(zzbiVar);
            mz1.m5406M(1901, parcelM5403J);
        } catch (Exception e) {
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzj;
            String name = e.getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            zzbyVar.zza(zzbx.zzc(98, 25, billingResult, AbstractC1374Vq.m8589h(name, ": ", message)));
            externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
        }
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzal(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        zzam(str, purchasesResponseListener);
    }

    private BillingClientImpl(Context context, zzcn zzcnVar, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, UserChoiceBillingListener userChoiceBillingListener, zzby zzbyVar, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, zzcnVar, userChoiceBillingListener, str, (zzby) null);
    }

    private BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    public BillingClientImpl(String str, Context context, zzby zzbyVar, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        String strZzaj = zzaj();
        this.zzb = strZzaj;
        this.zze = context.getApplicationContext();
        TM1 tm1M8752p = WM1.m8752p();
        tm1M8752p.m22708h();
        WM1.m8750n((WM1) tm1M8752p.f37584b, strZzaj);
        String packageName = this.zze.getPackageName();
        tm1M8752p.m22708h();
        WM1.m8751o((WM1) tm1M8752p.f37584b, packageName);
        this.zzf = new zzcd(this.zze, (WM1) tm1M8752p.m22706a());
        this.zze.getPackageName();
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzcn zzcnVar, UserChoiceBillingListener userChoiceBillingListener, String str, zzby zzbyVar) {
        this.zze = context.getApplicationContext();
        TM1 tm1M8752p = WM1.m8752p();
        tm1M8752p.m22708h();
        WM1.m8750n((WM1) tm1M8752p.f37584b, str);
        String packageName = this.zze.getPackageName();
        tm1M8752p.m22708h();
        WM1.m8751o((WM1) tm1M8752p.f37584b, packageName);
        if (zzbyVar != null) {
            this.zzf = zzbyVar;
        } else {
            this.zzf = new zzcd(this.zze, (WM1) tm1M8752p.m22706a());
        }
        if (purchasesUpdatedListener == null) {
            int i = BA1.f614a;
        }
        this.zzd = new zzk(this.zze, purchasesUpdatedListener, null, null, userChoiceBillingListener, this.zzf);
        this.zzz = zzcnVar;
        this.zzA = userChoiceBillingListener != null;
    }

    public BillingClientImpl(String str, zzcn zzcnVar, Context context, zzcg zzcgVar, zzby zzbyVar, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzaj();
        this.zze = context.getApplicationContext();
        TM1 tm1M8752p = WM1.m8752p();
        String strZzaj = zzaj();
        tm1M8752p.m22708h();
        WM1.m8750n((WM1) tm1M8752p.f37584b, strZzaj);
        String packageName = this.zze.getPackageName();
        tm1M8752p.m22708h();
        WM1.m8751o((WM1) tm1M8752p.f37584b, packageName);
        zzcd zzcdVar = new zzcd(this.zze, (WM1) tm1M8752p.m22706a());
        this.zzf = zzcdVar;
        int i = BA1.f614a;
        this.zzd = new zzk(this.zze, null, null, null, null, zzcdVar);
        this.zzz = zzcnVar;
        this.zze.getPackageName();
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            BA1.m538e("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.zzf.zzb(zzbx.zzd(6));
            billingClientStateListener.onBillingSetupFinished(zzca.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            int i2 = BA1.f614a;
            zzby zzbyVar = this.zzf;
            BillingResult billingResult = zzca.zzd;
            zzbyVar.zza(zzbx.zzb(37, 6, billingResult));
            billingClientStateListener.onBillingSetupFinished(billingResult);
            return;
        }
        if (this.zza == 3) {
            int i3 = BA1.f614a;
            zzby zzbyVar2 = this.zzf;
            BillingResult billingResult2 = zzca.zzm;
            zzbyVar2.zza(zzbx.zzb(38, 6, billingResult2));
            billingClientStateListener.onBillingSetupFinished(billingResult2);
            return;
        }
        this.zza = 1;
        BA1.m538e("BillingClient", "Starting in-app billing setup.");
        this.zzh = new zzay(this, billingClientStateListener, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    i = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.zzb);
                    if (this.zze.bindService(intent2, this.zzh, 1)) {
                        BA1.m538e("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    i = 39;
                }
            }
        }
        this.zza = 0;
        BA1.m538e("BillingClient", "Billing service unavailable on device.");
        zzby zzbyVar3 = this.zzf;
        BillingResult billingResult3 = zzca.zzc;
        zzbyVar3.zza(zzbx.zzb(i, 6, billingResult3));
        billingClientStateListener.onBillingSetupFinished(billingResult3);
    }

    public BillingClientImpl(String str, zzcn zzcnVar, Context context, PurchasesUpdatedListener purchasesUpdatedListener, AlternativeBillingListener alternativeBillingListener, zzby zzbyVar, ExecutorService executorService) {
        String strZzaj = zzaj();
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = strZzaj;
        initialize(context, purchasesUpdatedListener, zzcnVar, alternativeBillingListener, strZzaj, (zzby) null);
    }

    public BillingClientImpl(String str, zzcn zzcnVar, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, zzby zzbyVar, ExecutorService executorService) {
        this(context, zzcnVar, purchasesUpdatedListener, zzaj(), null, userChoiceBillingListener, null, null);
    }
}
