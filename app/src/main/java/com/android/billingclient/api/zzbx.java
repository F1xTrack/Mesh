package com.android.billingclient.api;

import java.util.List;
import p000.AL1;
import p000.AbstractC10078kz1;
import p000.BA1;
import p000.C10382nL1;
import p000.C11535wM1;
import p000.C8715aM1;
import p000.C9742iL1;
import p000.DL1;
import p000.DM1;
import p000.EnumC10768qM1;
import p000.KL1;

/* loaded from: classes.dex */
public final /* synthetic */ class zzbx {
    public static final /* synthetic */ int zza = 0;

    static {
        AbstractC10078kz1 abstractC10078kz1 = zzby.zza;
    }

    public static EnumC10768qM1 zza(String str) {
        AbstractC10078kz1 abstractC10078kz1 = zzby.zza;
        Object obj = EnumC10768qM1.BROADCAST_ACTION_UNSPECIFIED;
        Object obj2 = abstractC10078kz1.get(str);
        if (obj2 != null) {
            obj = obj2;
        }
        return (EnumC10768qM1) obj;
    }

    public static C10382nL1 zzb(int i, int i2, BillingResult billingResult) {
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
            C10382nL1.m23129q((C10382nL1) c9742iL1M23130r.f37584b, i2);
            return (C10382nL1) c9742iL1M23130r.m22706a();
        } catch (Exception unused) {
            int i3 = BA1.f614a;
            return null;
        }
    }

    public static C10382nL1 zzc(int i, int i2, BillingResult billingResult, String str) {
        try {
            KL1 kl1M9720r = C8715aM1.m9720r();
            int responseCode = billingResult.getResponseCode();
            kl1M9720r.m22708h();
            C8715aM1.m9716n((C8715aM1) kl1M9720r.f37584b, responseCode);
            String debugMessage = billingResult.getDebugMessage();
            kl1M9720r.m22708h();
            C8715aM1.m9717o((C8715aM1) kl1M9720r.f37584b, debugMessage);
            kl1M9720r.m22708h();
            C8715aM1.m9719q((C8715aM1) kl1M9720r.f37584b, i);
            if (str != null) {
                kl1M9720r.m22708h();
                C8715aM1.m9718p((C8715aM1) kl1M9720r.f37584b, str);
            }
            C9742iL1 c9742iL1M23130r = C10382nL1.m23130r();
            c9742iL1M23130r.m22708h();
            C10382nL1.m23127o((C10382nL1) c9742iL1M23130r.f37584b, (C8715aM1) kl1M9720r.m22706a());
            c9742iL1M23130r.m22708h();
            C10382nL1.m23129q((C10382nL1) c9742iL1M23130r.f37584b, i2);
            return (C10382nL1) c9742iL1M23130r.m22706a();
        } catch (Exception unused) {
            int i3 = BA1.f614a;
            return null;
        }
    }

    public static DL1 zzd(int i) {
        try {
            AL1 al1M1648p = DL1.m1648p();
            al1M1648p.m22708h();
            DL1.m1647o((DL1) al1M1648p.f37584b, i);
            return (DL1) al1M1648p.m22706a();
        } catch (Exception unused) {
            int i2 = BA1.f614a;
            return null;
        }
    }

    public static DM1 zze(int i, List list) {
        try {
            C11535wM1 c11535wM1M1664u = DM1.m1664u();
            c11535wM1M1664u.m22708h();
            DM1.m1663t((DM1) c11535wM1M1664u.f37584b, 3);
            c11535wM1M1664u.m22708h();
            DM1.m1662s((DM1) c11535wM1M1664u.f37584b, list);
            return (DM1) c11535wM1M1664u.m22706a();
        } catch (Exception unused) {
            int i2 = BA1.f614a;
            return null;
        }
    }
}
