package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes2.dex */
public final class YC0 {

    /* renamed from: a */
    public final SharedPreferences f14203a;

    public YC0(ReactApplicationContext reactApplicationContext) {
        this.f14203a = reactApplicationContext.getSharedPreferences("RN_KEYCHAIN", 0);
    }

    /* renamed from: b */
    public static String m9233b(String str) {
        return AbstractC7222ym.m26232i(str, ":c");
    }

    /* renamed from: c */
    public static String m9234c(String str) {
        return AbstractC7222ym.m26232i(str, ":p");
    }

    /* renamed from: d */
    public static String m9235d(String str) {
        return AbstractC7222ym.m26232i(str, ":u");
    }

    /* renamed from: a */
    public final XC0 m9236a(String str) {
        String strM9235d = m9235d(str);
        SharedPreferences sharedPreferences = this.f14203a;
        String string = sharedPreferences.getString(strM9235d, null);
        byte[] bArrDecode = string != null ? Base64.decode(string, 0) : null;
        String string2 = sharedPreferences.getString(m9234c(str), null);
        byte[] bArrDecode2 = string2 != null ? Base64.decode(string2, 0) : null;
        String string3 = sharedPreferences.getString(m9233b(str), null);
        if (bArrDecode == null || bArrDecode2 == null) {
            return null;
        }
        if (string3 == null) {
            string3 = "FacebookConceal";
        }
        return new XC0(string3, bArrDecode, bArrDecode2);
    }

    /* renamed from: e */
    public final void m9237e(String str) {
        String strM9235d = m9235d(str);
        String strM9234c = m9234c(str);
        this.f14203a.edit().remove(strM9235d).remove(strM9234c).remove(m9233b(str)).apply();
    }

    /* renamed from: f */
    public final void m9238f(String str, C1501Xr c1501Xr) {
        String strM9235d = m9235d(str);
        String strM9234c = m9234c(str);
        this.f14203a.edit().putString(strM9235d, Base64.encodeToString((byte[]) c1501Xr.f2473a, 0)).putString(strM9234c, Base64.encodeToString((byte[]) c1501Xr.f2474b, 0)).putString(m9233b(str), (String) c1501Xr.f13993c).apply();
    }
}
