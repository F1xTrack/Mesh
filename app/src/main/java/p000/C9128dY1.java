package p000;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: dY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9128dY1 extends JX1 {
    /* renamed from: B1 */
    public static boolean m17707B1(String str) {
        String str2 = (String) IB1.f4824t.m3028a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(StringUtils.COMMA)) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A1 */
    public final String m17708A1(String str) {
        String strM5662Q1 = m4345y1().m5662Q1(str);
        if (TextUtils.isEmpty(strM5662Q1)) {
            return (String) IB1.f4820r.m3028a(null);
        }
        Uri uri = Uri.parse((String) IB1.f4820r.m3028a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strM5662Q1 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    /* renamed from: z1 */
    public final boolean m17709z1(String str, String str2) {
        PM1 pm1M8264u2;
        C10124lK1 c10124lK1M5658M1 = m4345y1().m5658M1(str);
        if (c10124lK1M5658M1 == null || (pm1M8264u2 = m4344x1().m8264u2(str)) == null) {
            return false;
        }
        if ((c10124lK1M5658M1.m22394E() && c10124lK1M5658M1.m22401v().m23980m() == 100) || m7852u1().m22897y2(str, pm1M8264u2.m6340l())) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && Math.abs(str2.hashCode() % 100) < c10124lK1M5658M1.m22401v().m23980m();
    }
}
