package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ht1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0625Ht1 {
    public static final EnumC0625Ht1 a;
    public static final EnumC0625Ht1 b;
    public static final EnumC0625Ht1 c;
    public static final /* synthetic */ EnumC0625Ht1[] d;

    static {
        EnumC0625Ht1 enumC0625Ht1 = new EnumC0625Ht1("INAPP", 0);
        a = enumC0625Ht1;
        EnumC0625Ht1 enumC0625Ht12 = new EnumC0625Ht1("SUBS", 1);
        b = enumC0625Ht12;
        EnumC0625Ht1 enumC0625Ht13 = new EnumC0625Ht1(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = enumC0625Ht13;
        d = new EnumC0625Ht1[]{enumC0625Ht1, enumC0625Ht12, enumC0625Ht13};
    }

    public static EnumC0625Ht1 valueOf(String str) {
        return (EnumC0625Ht1) Enum.valueOf(EnumC0625Ht1.class, str);
    }

    public static EnumC0625Ht1[] values() {
        return (EnumC0625Ht1[]) d.clone();
    }
}
