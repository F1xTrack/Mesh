package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Tu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1561Tu {
    public static final EnumC1561Tu a;
    public static final HashMap b;
    public static final /* synthetic */ EnumC1561Tu[] c;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1561Tu EF10;

    static {
        EnumC1561Tu enumC1561Tu = new EnumC1561Tu("X86_32", 0);
        EnumC1561Tu enumC1561Tu2 = new EnumC1561Tu("X86_64", 1);
        EnumC1561Tu enumC1561Tu3 = new EnumC1561Tu("ARM_UNKNOWN", 2);
        EnumC1561Tu enumC1561Tu4 = new EnumC1561Tu("PPC", 3);
        EnumC1561Tu enumC1561Tu5 = new EnumC1561Tu("PPC64", 4);
        EnumC1561Tu enumC1561Tu6 = new EnumC1561Tu("ARMV6", 5);
        EnumC1561Tu enumC1561Tu7 = new EnumC1561Tu("ARMV7", 6);
        EnumC1561Tu enumC1561Tu8 = new EnumC1561Tu(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
        a = enumC1561Tu8;
        EnumC1561Tu enumC1561Tu9 = new EnumC1561Tu("ARMV7S", 8);
        EnumC1561Tu enumC1561Tu10 = new EnumC1561Tu("ARM64", 9);
        c = new EnumC1561Tu[]{enumC1561Tu, enumC1561Tu2, enumC1561Tu3, enumC1561Tu4, enumC1561Tu5, enumC1561Tu6, enumC1561Tu7, enumC1561Tu8, enumC1561Tu9, enumC1561Tu10};
        HashMap map = new HashMap(4);
        b = map;
        map.put("armeabi-v7a", enumC1561Tu7);
        map.put("armeabi", enumC1561Tu6);
        map.put("arm64-v8a", enumC1561Tu10);
        map.put("x86", enumC1561Tu);
    }

    public static EnumC1561Tu valueOf(String str) {
        return (EnumC1561Tu) Enum.valueOf(EnumC1561Tu.class, str);
    }

    public static EnumC1561Tu[] values() {
        return (EnumC1561Tu[]) c.clone();
    }
}
