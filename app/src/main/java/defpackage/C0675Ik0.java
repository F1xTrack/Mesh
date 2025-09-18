package defpackage;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* renamed from: Ik0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675Ik0 {
    public static final C0675Ik0 b = a(new Locale[0]);
    public final InterfaceC0831Kk0 a;

    public C0675Ik0(InterfaceC0831Kk0 interfaceC0831Kk0) {
        this.a = interfaceC0831Kk0;
    }

    public static C0675Ik0 a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C0675Ik0(new C0986Mk0(AbstractC0597Hk0.a(localeArr))) : new C0675Ik0(new C0753Jk0(localeArr));
    }

    public static C0675Ik0 b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(StringUtils.COMMA, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = AbstractC0519Gk0.a(strArrSplit[i]);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0675Ik0) {
            if (this.a.equals(((C0675Ik0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
