package com.android.billingclient.api;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC10234mB1;
import p000.AbstractC9722iB1;
import p000.BA1;
import p000.BD1;
import p000.C10382nL1;
import p000.C11535wM1;
import p000.C8715aM1;
import p000.C9106dN1;
import p000.C9618hN1;
import p000.C9748iO1;
import p000.DL1;
import p000.DM1;
import p000.FN1;
import p000.IN1;
import p000.KL1;
import p000.QN1;
import p000.VN1;
import p000.WM1;

/* loaded from: classes.dex */
final class zzcd implements zzby {
    private final WM1 zzb;
    private final Context zzc;
    private final zzcf zzd;

    public zzcd(Context context, WM1 wm1) {
        this.zzd = new zzcf(context);
        this.zzb = wm1;
        this.zzc = context;
    }

    @Override // com.android.billingclient.api.zzby
    public final void zza(C10382nL1 c10382nL1) {
        if (c10382nL1 == null) {
            return;
        }
        try {
            FN1 fn1M3841t = IN1.m3841t();
            WM1 wm1 = this.zzb;
            if (wm1 != null) {
                fn1M3841t.m22708h();
                IN1.m3838q((IN1) fn1M3841t.f37584b, wm1);
            }
            fn1M3841t.m22708h();
            IN1.m3839r((IN1) fn1M3841t.f37584b, c10382nL1);
            this.zzd.zza((IN1) fn1M3841t.m22706a());
        } catch (Throwable unused) {
            int i = BA1.f614a;
        }
    }

    @Override // com.android.billingclient.api.zzby
    public final void zzb(DL1 dl1) {
        if (dl1 == null) {
            return;
        }
        try {
            FN1 fn1M3841t = IN1.m3841t();
            WM1 wm1 = this.zzb;
            if (wm1 != null) {
                fn1M3841t.m22708h();
                IN1.m3838q((IN1) fn1M3841t.f37584b, wm1);
            }
            fn1M3841t.m22708h();
            IN1.m3840s((IN1) fn1M3841t.f37584b, dl1);
            this.zzd.zza((IN1) fn1M3841t.m22706a());
        } catch (Throwable unused) {
            int i = BA1.f614a;
        }
    }

    @Override // com.android.billingclient.api.zzby
    public final void zzc(byte[] bArr) {
        try {
            zzg(DM1.m1657n(bArr, BD1.m560a()));
        } catch (Throwable unused) {
            int i = BA1.f614a;
        }
    }

    @Override // com.android.billingclient.api.zzby
    public final void zzd(C9748iO1 c9748iO1) {
        if (c9748iO1 == null) {
            return;
        }
        try {
            FN1 fn1M3841t = IN1.m3841t();
            WM1 wm1 = this.zzb;
            if (wm1 != null) {
                fn1M3841t.m22708h();
                IN1.m3838q((IN1) fn1M3841t.f37584b, wm1);
            }
            fn1M3841t.m22708h();
            IN1.m3835n((IN1) fn1M3841t.f37584b, c9748iO1);
            this.zzd.zza((IN1) fn1M3841t.m22706a());
        } catch (Throwable unused) {
            int i = BA1.f614a;
        }
    }

    @Override // com.android.billingclient.api.zzby
    public final void zze(int i, List list, boolean z, boolean z2) {
        DM1 dm1;
        try {
            int i2 = zzbx.zza;
            try {
                C11535wM1 c11535wM1M1664u = DM1.m1664u();
                c11535wM1M1664u.m22708h();
                DM1.m1663t((DM1) c11535wM1M1664u.f37584b, i);
                c11535wM1M1664u.m22708h();
                DM1.m1661r((DM1) c11535wM1M1664u.f37584b);
                c11535wM1M1664u.m22708h();
                DM1.m1660q((DM1) c11535wM1M1664u.f37584b, z2);
                c11535wM1M1664u.m22708h();
                DM1.m1662s((DM1) c11535wM1M1664u.f37584b, list);
                dm1 = (DM1) c11535wM1M1664u.m22706a();
            } catch (Exception unused) {
                int i3 = BA1.f614a;
                dm1 = null;
            }
            zzg(dm1);
        } catch (Throwable unused2) {
            int i4 = BA1.f614a;
        }
    }

    @Override // com.android.billingclient.api.zzby
    public final void zzf(int i, List list, List list2, BillingResult billingResult, boolean z, boolean z2) {
        DM1 dm1;
        try {
            int i2 = zzbx.zza;
            try {
                C11535wM1 c11535wM1M1664u = DM1.m1664u();
                c11535wM1M1664u.m22708h();
                DM1.m1663t((DM1) c11535wM1M1664u.f37584b, 4);
                c11535wM1M1664u.m22708h();
                DM1.m1662s((DM1) c11535wM1M1664u.f37584b, list);
                c11535wM1M1664u.m22708h();
                DM1.m1661r((DM1) c11535wM1M1664u.f37584b);
                c11535wM1M1664u.m22708h();
                DM1.m1660q((DM1) c11535wM1M1664u.f37584b, z2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    QN1 qn1M8432q = VN1.m8432q();
                    List<String> products = purchase.getProducts();
                    qn1M8432q.m22708h();
                    VN1.m8429n((VN1) qn1M8432q.f37584b, products);
                    int purchaseState = purchase.getPurchaseState();
                    qn1M8432q.m22708h();
                    VN1.m8430o((VN1) qn1M8432q.f37584b, purchaseState);
                    String packageName = purchase.getPackageName();
                    qn1M8432q.m22708h();
                    VN1.m8431p((VN1) qn1M8432q.f37584b, packageName);
                    c11535wM1M1664u.m22708h();
                    DM1.m1658o((DM1) c11535wM1M1664u.f37584b, (VN1) qn1M8432q.m22706a());
                }
                KL1 kl1M9720r = C8715aM1.m9720r();
                int responseCode = billingResult.getResponseCode();
                kl1M9720r.m22708h();
                C8715aM1.m9716n((C8715aM1) kl1M9720r.f37584b, responseCode);
                String debugMessage = billingResult.getDebugMessage();
                kl1M9720r.m22708h();
                C8715aM1.m9717o((C8715aM1) kl1M9720r.f37584b, debugMessage);
                c11535wM1M1664u.m22708h();
                DM1.m1659p((DM1) c11535wM1M1664u.f37584b, (C8715aM1) kl1M9720r.m22706a());
                dm1 = (DM1) c11535wM1M1664u.m22706a();
            } catch (Exception unused) {
                int i3 = BA1.f614a;
                dm1 = null;
            }
            zzg(dm1);
        } catch (Throwable unused2) {
            int i4 = BA1.f614a;
        }
    }

    public final void zzg(DM1 dm1) {
        int iMo7926a;
        if (dm1 == null) {
            return;
        }
        try {
            if (this.zzb != null) {
                try {
                    Context context = this.zzc;
                    String string = null;
                    ContentResolver contentResolver = context == null ? null : context.getContentResolver();
                    if (contentResolver != null) {
                        string = Settings.Secure.getString(contentResolver, "android_id");
                    }
                    if (string == null) {
                        iMo7926a = 0;
                    } else {
                        int i = AbstractC10234mB1.f37547a;
                        iMo7926a = AbstractC9722iB1.f28888a.m26325a(string).mo7926a();
                    }
                    long j = (iMo7926a % 100) % 100;
                    if (j < 0) {
                        j += 100;
                    }
                    if (((int) j) < 0) {
                        FN1 fn1M3841t = IN1.m3841t();
                        WM1 wm1 = this.zzb;
                        if (wm1 != null) {
                            fn1M3841t.m22708h();
                            IN1.m3838q((IN1) fn1M3841t.f37584b, wm1);
                        }
                        fn1M3841t.m22708h();
                        IN1.m3836o((IN1) fn1M3841t.f37584b, dm1);
                        C9106dN1 c9106dN1M18811o = C9618hN1.m18811o();
                        zzdi.zza(this.zzc);
                        c9106dN1M18811o.m22708h();
                        C9618hN1.m18810n((C9618hN1) c9106dN1M18811o.f37584b);
                        fn1M3841t.m22708h();
                        IN1.m3837p((IN1) fn1M3841t.f37584b, (C9618hN1) c9106dN1M18811o.m22706a());
                        this.zzd.zza((IN1) fn1M3841t.m22706a());
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable unused2) {
            int i2 = BA1.f614a;
        }
    }
}
