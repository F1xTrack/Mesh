package p000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class BA1 {

    /* renamed from: a */
    public static final int f614a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static int m534a(Bundle bundle, String str) {
        if (bundle == null) {
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m538e(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        return 6;
    }

    /* renamed from: b */
    public static Bundle m535b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    /* renamed from: c */
    public static BillingResult m536c(Intent intent, String str) {
        if (intent == null) {
            return F91.m2537t(6, "An internal error occurred.");
        }
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(m534a(intent.getExtras(), str));
        builderNewBuilder.setDebugMessage(m537d(intent.getExtras(), str));
        return builderNewBuilder.build();
    }

    /* renamed from: d */
    public static String m537d(Bundle bundle, String str) {
        if (bundle == null) {
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m538e(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        "Unexpected type for debug message: ".concat(obj.getClass().getName());
        return "";
    }

    /* renamed from: e */
    public static void m538e(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = 40000;
        while (!str2.isEmpty() && i > 0) {
            int iMin = Math.min(str2.length(), Math.min(4000, i));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i -= iMin;
        }
    }

    /* renamed from: f */
    public static Purchase m539f(String str, String str2) {
        if (str == null || str2 == null) {
            m538e("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            "Got JSONException while parsing purchase data: ".concat(e.toString());
            return null;
        }
    }
}
