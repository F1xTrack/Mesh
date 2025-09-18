package defpackage;

import android.os.Bundle;
import com.huawei.hms.framework.common.ContainerUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.EnumMap;
import java.util.Objects;

/* renamed from: cB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2468cB1 {
    public static final C2468cB1 f = new C2468cB1((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public C2468cB1(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(TQ1.class);
        this.e = enumMap;
        enumMap.put((EnumMap) TQ1.AD_USER_DATA, (TQ1) (bool == null ? EnumC3582eR1.UNINITIALIZED : bool.booleanValue() ? EnumC3582eR1.GRANTED : EnumC3582eR1.DENIED));
        this.a = i;
        this.b = e();
        this.c = bool2;
        this.d = str;
    }

    public static Boolean a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i = ZA1.a[XQ1.g(bundle.getString("ad_personalization")).ordinal()];
        if (i == 3) {
            return Boolean.FALSE;
        }
        if (i != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static C2468cB1 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new C2468cB1((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(TQ1.class);
        for (TQ1 tq1 : EnumC2326bR1.DMA.a) {
            enumMap.put((EnumMap) tq1, (TQ1) XQ1.g(bundle.getString(tq1.a)));
        }
        return new C2468cB1(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C2468cB1 c(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(TQ1.class);
        TQ1[] tq1Arr = EnumC2326bR1.DMA.a;
        int length = tq1Arr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put((EnumMap) tq1Arr[i3], (TQ1) XQ1.f(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new C2468cB1(enumMap, i, (Boolean) null, (String) null);
    }

    public final EnumC3582eR1 d() {
        EnumC3582eR1 enumC3582eR1 = (EnumC3582eR1) this.e.get(TQ1.AD_USER_DATA);
        return enumC3582eR1 == null ? EnumC3582eR1.UNINITIALIZED : enumC3582eR1;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (TQ1 tq1 : EnumC2326bR1.DMA.a) {
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(XQ1.a((EnumC3582eR1) this.e.get(tq1)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2468cB1)) {
            return false;
        }
        C2468cB1 c2468cB1 = (C2468cB1) obj;
        if (this.b.equalsIgnoreCase(c2468cB1.b) && Objects.equals(this.c, c2468cB1.c)) {
            return Objects.equals(this.d, c2468cB1.d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.c;
        int i = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i * 29) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(XQ1.b(this.a));
        for (TQ1 tq1 : EnumC2326bR1.DMA.a) {
            sb.append(StringUtils.COMMA);
            sb.append(tq1.a);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            EnumC3582eR1 enumC3582eR1 = (EnumC3582eR1) this.e.get(tq1);
            if (enumC3582eR1 == null) {
                sb.append("uninitialized");
            } else {
                int i = ZA1.a[enumC3582eR1.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append("eu_consent_policy");
                } else if (i == 3) {
                    sb.append("denied");
                } else if (i == 4) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public C2468cB1(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(TQ1.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = e();
        this.c = bool;
        this.d = str;
    }
}
