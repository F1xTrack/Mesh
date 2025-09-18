package defpackage;

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

/* renamed from: Pt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1246Pt implements ZL0 {
    public static boolean h = false;
    public static boolean i = false;
    public static String j = null;
    public static String k = "https://codepush.appcenter.ms/";
    public static String l;
    public static C1246Pt m;
    public boolean a;
    public String b;
    public C3476du c;
    public C2411bu d;
    public HZ0 e;
    public String f;
    public Context g;

    public final void a() {
        Z02.b(AbstractC2522cT1.a(this.c.a, "CodePush"));
        HZ0 hz0 = this.e;
        hz0.a.edit().remove("CODE_PUSH_PENDING_UPDATE").commit();
        hz0.a.edit().remove("CODE_PUSH_FAILED_UPDATES").commit();
    }

    public final long b() {
        Context context = this.g;
        try {
            return Long.parseLong(context.getResources().getString(context.getResources().getIdentifier("CODE_PUSH_APK_BUILD_TIME", "string", context.getPackageName())).replaceAll("\"", ""));
        } catch (Exception e) {
            throw new C3286cu("Error in getting binary resources modified time", e);
        }
    }

    public final String c(String str) {
        Context context = this.g;
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

    @Override // defpackage.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        CodePushNativeModule codePushNativeModule = new CodePushNativeModule(reactApplicationContext, this, this.c, this.d, this.e);
        CodePushDialog codePushDialog = new CodePushDialog(reactApplicationContext);
        ArrayList arrayList = new ArrayList();
        arrayList.add(codePushNativeModule);
        arrayList.add(codePushDialog);
        return arrayList;
    }

    @Override // defpackage.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }

    public final String d(String str) {
        JSONObject jSONObjectB;
        C3476du c3476du = this.c;
        this.b = str;
        String strV = AbstractC8235ym.v("assets://", str);
        String strA = null;
        try {
            String str2 = this.b;
            String strC = c3476du.c();
            if (strC != null && (jSONObjectB = c3476du.b()) != null) {
                String strOptString = jSONObjectB.optString("bundlePath", null);
                strA = strOptString == null ? AbstractC2522cT1.a(strC, str2) : AbstractC2522cT1.a(strC, strOptString);
            }
        } catch (C1480St e) {
            e.getMessage();
            a();
        }
        if (strA == null) {
            h = true;
            return strV;
        }
        if (f(c3476du.b())) {
            h = false;
            return strA;
        }
        this.a = false;
        a();
        h = true;
        return strV;
    }

    public final void e() {
        JSONObject jSONObject;
        C3476du c3476du = this.c;
        this.a = false;
        HZ0 hz0 = this.e;
        String string = hz0.a.getString("CODE_PUSH_PENDING_UPDATE", null);
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
                JSONObject jSONObjectB = c3476du.b();
                if (jSONObjectB != null) {
                    if (!f(jSONObjectB)) {
                        if (!j.equals(jSONObjectB.optString(AttributionReporter.APP_VERSION, null))) {
                            return;
                        }
                    }
                    try {
                        if (!jSONObject.getBoolean("isLoading")) {
                            this.a = true;
                            hz0.e(jSONObject.getString("hash"), true);
                            return;
                        }
                        i = true;
                        hz0.d(c3476du.b());
                        JSONObject jSONObjectD = c3476du.d();
                        Z02.b(c3476du.c());
                        AbstractC2522cT1.i("currentPackage", jSONObjectD.optString("previousPackage", null), jSONObjectD);
                        AbstractC2522cT1.i("previousPackage", null, jSONObjectD);
                        try {
                            AbstractC2522cT1.j(jSONObjectD, AbstractC2522cT1.a(AbstractC2522cT1.a(c3476du.a, "CodePush"), "codepush.json"));
                            hz0.a.edit().remove("CODE_PUSH_PENDING_UPDATE").commit();
                        } catch (IOException e) {
                            throw new C3286cu("Error updating current package info", e);
                        }
                    } catch (JSONException e2) {
                        throw new C3286cu("Unable to read pending update metadata stored in SharedPreferences", e2);
                    }
                }
            } catch (C1480St unused2) {
                a();
            }
        }
    }

    public final boolean f(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("binaryModifiedTime", null);
            Long lValueOf = strOptString != null ? Long.valueOf(Long.parseLong(strOptString)) : null;
            String strOptString2 = jSONObject.optString(AttributionReporter.APP_VERSION, null);
            long jB = b();
            if (lValueOf != null && lValueOf.longValue() == jB) {
                if (j.equals(strOptString2)) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            throw new C3286cu("Error in reading binary modified date from package metadata", e);
        }
    }
}
