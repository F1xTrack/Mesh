package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6904rn {
    public static final EnumC6904rn a;
    public static final EnumC6904rn b;
    public static final EnumC6904rn c;
    public static final EnumC6904rn d;
    public static final EnumC6904rn e;
    public static final EnumC6904rn f;
    public static final /* synthetic */ EnumC6904rn[] g;

    static {
        EnumC6904rn enumC6904rn = new EnumC6904rn(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        a = enumC6904rn;
        EnumC6904rn enumC6904rn2 = new EnumC6904rn("INACTIVE", 1);
        b = enumC6904rn2;
        EnumC6904rn enumC6904rn3 = new EnumC6904rn("SEARCHING", 2);
        c = enumC6904rn3;
        EnumC6904rn enumC6904rn4 = new EnumC6904rn("FLASH_REQUIRED", 3);
        d = enumC6904rn4;
        EnumC6904rn enumC6904rn5 = new EnumC6904rn("CONVERGED", 4);
        e = enumC6904rn5;
        EnumC6904rn enumC6904rn6 = new EnumC6904rn("LOCKED", 5);
        f = enumC6904rn6;
        g = new EnumC6904rn[]{enumC6904rn, enumC6904rn2, enumC6904rn3, enumC6904rn4, enumC6904rn5, enumC6904rn6};
    }

    public static EnumC6904rn valueOf(String str) {
        return (EnumC6904rn) Enum.valueOf(EnumC6904rn.class, str);
    }

    public static EnumC6904rn[] values() {
        return (EnumC6904rn[]) g.clone();
    }
}
