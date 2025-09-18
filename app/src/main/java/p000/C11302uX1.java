package p000;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: uX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11302uX1 {

    /* renamed from: b */
    public static final String[] f43730b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a */
    public final HashMap f43731a;

    public C11302uX1(HashMap map) {
        HashMap map2 = new HashMap();
        this.f43731a = map2;
        map2.putAll(map);
    }

    /* renamed from: a */
    public final String m25198a() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = f43730b;
        for (int i = 0; i < 6; i++) {
            String str = strArr[i];
            HashMap map = this.f43731a;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final int m25199b() {
        try {
            String str = (String) this.f43731a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11302uX1) {
            return m25198a().equalsIgnoreCase(((C11302uX1) obj).m25198a());
        }
        return false;
    }

    public final int hashCode() {
        return m25198a().hashCode();
    }

    public final String toString() {
        return m25198a();
    }
}
