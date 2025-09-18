package p000;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* renamed from: Ik0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7750Ik0 {

    /* renamed from: b */
    public static final C7750Ik0 f5120b = m3993a(new Locale[0]);

    /* renamed from: a */
    public final InterfaceC7854Kk0 f5121a;

    public C7750Ik0(InterfaceC7854Kk0 interfaceC7854Kk0) {
        this.f5121a = interfaceC7854Kk0;
    }

    /* renamed from: a */
    public static C7750Ik0 m3993a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C7750Ik0(new C7958Mk0(AbstractC7698Hk0.m3584a(localeArr))) : new C7750Ik0(new C7802Jk0(localeArr));
    }

    /* renamed from: b */
    public static C7750Ik0 m3994b(String str) {
        if (str == null || str.isEmpty()) {
            return f5120b;
        }
        String[] strArrSplit = str.split(StringUtils.COMMA, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = AbstractC7646Gk0.m3147a(strArrSplit[i]);
        }
        return m3993a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7750Ik0) {
            if (this.f5121a.equals(((C7750Ik0) obj).f5121a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5121a.hashCode();
    }

    public final String toString() {
        return this.f5121a.toString();
    }
}
