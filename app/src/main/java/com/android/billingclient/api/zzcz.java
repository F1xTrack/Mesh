package com.android.billingclient.api;

import android.os.Bundle;
import java.util.ArrayList;
import p000.BA1;
import p000.F91;

/* loaded from: classes.dex */
final class zzcz {
    public static zzcy zza(Bundle bundle, String str, String str2) {
        BillingResult billingResult = zzca.zzj;
        if (bundle == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" got null owned items list");
            int i = BA1.f614a;
            return new zzcy(billingResult, 54);
        }
        int iM534a = BA1.m534a(bundle, "BillingClient");
        BillingResult billingResultM2537t = F91.m2537t(iM534a, BA1.m537d(bundle, "BillingClient"));
        if (iM534a != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" failed. Response code: ");
            sb2.append(iM534a);
            return new zzcy(billingResultM2537t, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            StringBuilder sb3 = new StringBuilder("Bundle returned from ");
            sb3.append(str2);
            sb3.append(" doesn't contain required fields.");
            return new zzcy(billingResult, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            StringBuilder sb4 = new StringBuilder("Bundle returned from ");
            sb4.append(str2);
            sb4.append(" contains null SKUs list.");
            return new zzcy(billingResult, 56);
        }
        if (stringArrayList2 == null) {
            StringBuilder sb5 = new StringBuilder("Bundle returned from ");
            sb5.append(str2);
            sb5.append(" contains null purchases list.");
            return new zzcy(billingResult, 57);
        }
        if (stringArrayList3 != null) {
            return new zzcy(zzca.zzl, 1);
        }
        StringBuilder sb6 = new StringBuilder("Bundle returned from ");
        sb6.append(str2);
        sb6.append(" contains null signatures list.");
        return new zzcy(billingResult, 58);
    }
}
