package p000;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.huawei.hms.push.AttributionReporter;
import com.microsoft.codepush.react.CodePushDialog;
import com.microsoft.codepush.react.CodePushNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Pt */
/* loaded from: classes2.dex */
public final class C1000Pt implements ZL0 {

    /* renamed from: h */
    public static boolean f9323h = false;

    /* renamed from: i */
    public static boolean f9324i = false;

    /* renamed from: j */
    public static String f9325j = null;

    /* renamed from: k */
    public static String f9326k = "https://codepush.appcenter.ms/";

    /* renamed from: l */
    public static String f9327l;

    /* renamed from: m */
    public static C1000Pt f9328m;

    /* renamed from: a */
    public boolean f9329a;

    /* renamed from: b */
    public String f9330b;

    /* renamed from: c */
    public C3956du f9331c;

    /* renamed from: d */
    public C1814bu f9332d;

    /* renamed from: e */
    public HZ0 f9333e;

    /* renamed from: f */
    public String f9334f;

    /* renamed from: g */
    public Context f9335g;

    /* renamed from: a */
    public final void m6464a() {
        Z02.m9450b(AbstractC8985cT1.m10704a(this.f9331c.f26382a, "CodePush"));
        HZ0 hz0 = this.f9333e;
        hz0.f4351a.edit().remove("CODE_PUSH_PENDING_UPDATE").commit();
        hz0.f4351a.edit().remove("CODE_PUSH_FAILED_UPDATES").commit();
    }

    /* renamed from: b */
    public final long m6465b() {
        Context context = this.f9335g;
        try {
            return Long.parseLong(context.getResources().getString(context.getResources().getIdentifier("CODE_PUSH_APK_BUILD_TIME", "string", context.getPackageName())).replaceAll("\"", ""));
        } catch (Exception e) {
            throw new C3894cu("Error in getting binary resources modified time", e);
        }
    }

    /* renamed from: c */
    public final String m6466c(String str) {
        Context context = this.f9335g;
        int identifier = context.getResources().getIdentifier("CodePush".concat(str), "string", context.getPackageName());
        if (identifier == 0) {
            return null;
        }
        String string = context.getString(identifier);
        if (string.isEmpty()) {
            return null;
        }
        return string;
    }

    @Override // p000.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        CodePushNativeModule codePushNativeModule = new CodePushNativeModule(reactApplicationContext, this, this.f9331c, this.f9332d, this.f9333e);
        CodePushDialog codePushDialog = new CodePushDialog(reactApplicationContext);
        ArrayList arrayList = new ArrayList();
        arrayList.add(codePushNativeModule);
        arrayList.add(codePushDialog);
        return arrayList;
    }

    @Override // p000.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }

    /* renamed from: d */
    public final String m6467d(String str) {
        JSONObject jSONObjectM17770b;
        C3956du c3956du = this.f9331c;
        this.f9330b = str;
        String strM26245v = AbstractC7222ym.m26245v("assets://", str);
        String strM10704a = null;
        try {
            String str2 = this.f9330b;
            String strM17771c = c3956du.m17771c();
            if (strM17771c != null && (jSONObjectM17770b = c3956du.m17770b()) != null) {
                String strOptString = jSONObjectM17770b.optString("bundlePath", null);
                strM10704a = strOptString == null ? AbstractC8985cT1.m10704a(strM17771c, str2) : AbstractC8985cT1.m10704a(strM17771c, strOptString);
            }
        } catch (C1188St e) {
            e.getMessage();
            m6464a();
        }
        if (strM10704a == null) {
            f9323h = true;
            return strM26245v;
        }
        if (m6469f(c3956du.m17770b())) {
            f9323h = false;
            return strM10704a;
        }
        this.f9329a = false;
        m6464a();
        f9323h = true;
        return strM26245v;
    }

    /* renamed from: e */
    public final void m6468e() {
        JSONObject jSONObject;
        C3956du c3956du = this.f9331c;
        this.f9329a = false;
        HZ0 hz0 = this.f9333e;
        String string = hz0.f4351a.getString("CODE_PUSH_PENDING_UPDATE", null);
        if (string == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            try {
                JSONObject jSONObjectM17770b = c3956du.m17770b();
                if (jSONObjectM17770b != null) {
                    if (!m6469f(jSONObjectM17770b)) {
                        if (!f9325j.equals(jSONObjectM17770b.optString(AttributionReporter.APP_VERSION, null))) {
                            return;
                        }
                    }
                    try {
                        if (!jSONObject.getBoolean("isLoading")) {
                            this.f9329a = true;
                            hz0.m3503e(jSONObject.getString("hash"), true);
                            return;
                        }
                        f9324i = true;
                        hz0.m3502d(c3956du.m17770b());
                        JSONObject jSONObjectM17772d = c3956du.m17772d();
                        Z02.m9450b(c3956du.m17771c());
                        AbstractC8985cT1.m10712i("currentPackage", jSONObjectM17772d.optString("previousPackage", null), jSONObjectM17772d);
                        AbstractC8985cT1.m10712i("previousPackage", null, jSONObjectM17772d);
                        try {
                            AbstractC8985cT1.m10713j(jSONObjectM17772d, AbstractC8985cT1.m10704a(AbstractC8985cT1.m10704a(c3956du.f26382a, "CodePush"), "codepush.json"));
                            hz0.f4351a.edit().remove("CODE_PUSH_PENDING_UPDATE").commit();
                        } catch (IOException e) {
                            throw new C3894cu("Error updating current package info", e);
                        }
                    } catch (JSONException e2) {
                        throw new C3894cu("Unable to read pending update metadata stored in SharedPreferences", e2);
                    }
                }
            } catch (C1188St unused2) {
                m6464a();
            }
        }
    }

    /* renamed from: f */
    public final boolean m6469f(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("binaryModifiedTime", null);
            Long lValueOf = strOptString != null ? Long.valueOf(Long.parseLong(strOptString)) : null;
            String strOptString2 = jSONObject.optString(AttributionReporter.APP_VERSION, null);
            long jM6465b = m6465b();
            if (lValueOf != null && lValueOf.longValue() == jM6465b) {
                if (f9325j.equals(strOptString2)) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            throw new C3894cu("Error in reading binary modified date from package metadata", e);
        }
    }
}
