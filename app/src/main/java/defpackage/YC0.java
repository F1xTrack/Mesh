package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes2.dex */
public final class YC0 {
    public final SharedPreferences a;

    public YC0(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext.getSharedPreferences("RN_KEYCHAIN", 0);
    }

    public static String b(String str) {
        return AbstractC8235ym.i(str, ":c");
    }

    public static String c(String str) {
        return AbstractC8235ym.i(str, ":p");
    }

    public static String d(String str) {
        return AbstractC8235ym.i(str, ":u");
    }

    public final XC0 a(String str) {
        String strD = d(str);
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString(strD, null);
        byte[] bArrDecode = string != null ? Base64.decode(string, 0) : null;
        String string2 = sharedPreferences.getString(c(str), null);
        byte[] bArrDecode2 = string2 != null ? Base64.decode(string2, 0) : null;
        String string3 = sharedPreferences.getString(b(str), null);
        if (bArrDecode == null || bArrDecode2 == null) {
            return null;
        }
        if (string3 == null) {
            string3 = "FacebookConceal";
        }
        return new XC0(string3, bArrDecode, bArrDecode2);
    }

    public final void e(String str) {
        String strD = d(str);
        String strC = c(str);
        this.a.edit().remove(strD).remove(strC).remove(b(str)).apply();
    }

    public final void f(String str, C1864Xr c1864Xr) {
        String strD = d(str);
        String strC = c(str);
        this.a.edit().putString(strD, Base64.encodeToString((byte[]) c1864Xr.a, 0)).putString(strC, Base64.encodeToString((byte[]) c1864Xr.b, 0)).putString(b(str), (String) c1864Xr.c).apply();
    }
}
