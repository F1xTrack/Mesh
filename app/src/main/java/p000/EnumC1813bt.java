package p000;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bt */
/* loaded from: classes.dex */
public final class EnumC1813bt {

    /* renamed from: a */
    public static final EnumC1813bt f17205a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC1813bt[] f17206b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1813bt EF2;

    static {
        EnumC1813bt enumC1813bt = new EnumC1813bt(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        EnumC1813bt enumC1813bt2 = new EnumC1813bt("ANDROID_FIREBASE", 1);
        f17205a = enumC1813bt2;
        f17206b = new EnumC1813bt[]{enumC1813bt, enumC1813bt2};
    }

    public static EnumC1813bt valueOf(String str) {
        return (EnumC1813bt) Enum.valueOf(EnumC1813bt.class, str);
    }

    public static EnumC1813bt[] values() {
        return (EnumC1813bt[]) f17206b.clone();
    }
}
