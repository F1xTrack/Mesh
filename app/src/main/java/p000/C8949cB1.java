package p000;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.EnumMap;
import java.util.Objects;

/* renamed from: cB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8949cB1 {

    /* renamed from: f */
    public static final C8949cB1 f17357f = new C8949cB1((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a */
    public final int f17358a;

    /* renamed from: b */
    public final String f17359b;

    /* renamed from: c */
    public final Boolean f17360c;

    /* renamed from: d */
    public final String f17361d;

    /* renamed from: e */
    public final EnumMap f17362e;

    public C8949cB1(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(TQ1.class);
        this.f17362e = enumMap;
        enumMap.put((EnumMap) TQ1.AD_USER_DATA, (TQ1) (bool == null ? EnumC9242eR1.UNINITIALIZED : bool.booleanValue() ? EnumC9242eR1.GRANTED : EnumC9242eR1.DENIED));
        this.f17358a = i;
        this.f17359b = m10622e();
        this.f17360c = bool2;
        this.f17361d = str;
    }

    /* renamed from: a */
    public static Boolean m10618a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i = ZA1.f14768a[XQ1.m9045g(bundle.getString("ad_personalization")).ordinal()];
        if (i == 3) {
            return Boolean.FALSE;
        }
        if (i != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: b */
    public static C8949cB1 m10619b(int i, Bundle bundle) {
        if (bundle == null) {
            return new C8949cB1((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(TQ1.class);
        for (TQ1 tq1 : EnumC8853bR1.DMA.f17026a) {
            enumMap.put((EnumMap) tq1, (TQ1) XQ1.m9045g(bundle.getString(tq1.f11353a)));
        }
        return new C8949cB1(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* renamed from: c */
    public static C8949cB1 m10620c(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return f17357f;
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(TQ1.class);
        TQ1[] tq1Arr = EnumC8853bR1.DMA.f17026a;
        int length = tq1Arr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put((EnumMap) tq1Arr[i3], (TQ1) XQ1.m9044f(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new C8949cB1(enumMap, i, (Boolean) null, (String) null);
    }

    /* renamed from: d */
    public final EnumC9242eR1 m10621d() {
        EnumC9242eR1 enumC9242eR1 = (EnumC9242eR1) this.f17362e.get(TQ1.AD_USER_DATA);
        return enumC9242eR1 == null ? EnumC9242eR1.UNINITIALIZED : enumC9242eR1;
    }

    /* renamed from: e */
    public final String m10622e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17358a);
        for (TQ1 tq1 : EnumC8853bR1.DMA.f17026a) {
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(XQ1.m9040a((EnumC9242eR1) this.f17362e.get(tq1)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8949cB1)) {
            return false;
        }
        C8949cB1 c8949cB1 = (C8949cB1) obj;
        if (this.f17359b.equalsIgnoreCase(c8949cB1.f17359b) && Objects.equals(this.f17360c, c8949cB1.f17360c)) {
            return Objects.equals(this.f17361d, c8949cB1.f17361d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f17360c;
        int i = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f17361d;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i * 29) + this.f17359b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(XQ1.m9041b(this.f17358a));
        for (TQ1 tq1 : EnumC8853bR1.DMA.f17026a) {
            sb.append(StringUtils.COMMA);
            sb.append(tq1.f11353a);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            EnumC9242eR1 enumC9242eR1 = (EnumC9242eR1) this.f17362e.get(tq1);
            if (enumC9242eR1 == null) {
                sb.append("uninitialized");
            } else {
                int i = ZA1.f14768a[enumC9242eR1.ordinal()];
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
        Boolean bool = this.f17360c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f17361d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public C8949cB1(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(TQ1.class);
        this.f17362e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f17358a = i;
        this.f17359b = m10622e();
        this.f17360c = bool;
        this.f17361d = str;
    }
}
