package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2408bt {
    public static final EnumC2408bt a;
    public static final /* synthetic */ EnumC2408bt[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2408bt EF2;

    static {
        EnumC2408bt enumC2408bt = new EnumC2408bt(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        EnumC2408bt enumC2408bt2 = new EnumC2408bt("ANDROID_FIREBASE", 1);
        a = enumC2408bt2;
        b = new EnumC2408bt[]{enumC2408bt, enumC2408bt2};
    }

    public static EnumC2408bt valueOf(String str) {
        return (EnumC2408bt) Enum.valueOf(EnumC2408bt.class, str);
    }

    public static EnumC2408bt[] values() {
        return (EnumC2408bt[]) b.clone();
    }
}
