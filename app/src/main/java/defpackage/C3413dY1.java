package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: dY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3413dY1 extends JX1 {
    public static boolean B1(String str) {
        String str2 = (String) IB1.t.a(null);
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

    public final String A1(String str) {
        String strQ1 = y1().Q1(str);
        if (TextUtils.isEmpty(strQ1)) {
            return (String) IB1.r.a(null);
        }
        Uri uri = Uri.parse((String) IB1.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strQ1 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    public final boolean z1(String str, String str2) {
        PM1 pm1U2;
        C5674lK1 c5674lK1M1 = y1().M1(str);
        if (c5674lK1M1 == null || (pm1U2 = x1().u2(str)) == null) {
            return false;
        }
        if ((c5674lK1M1.E() && c5674lK1M1.v().m() == 100) || u1().y2(str, pm1U2.l())) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && Math.abs(str2.hashCode() % 100) < c5674lK1M1.v().m();
    }
}
