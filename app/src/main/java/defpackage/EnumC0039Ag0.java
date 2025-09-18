package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ag0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0039Ag0 {
    public static final C0318Dv0 b;
    public static final LinkedHashMap c;
    public static final EnumC0039Ag0 d;
    public static final EnumC0039Ag0 e;
    public static final EnumC0039Ag0 f;
    public static final EnumC0039Ag0 g;
    public static final EnumC0039Ag0 h;
    public static final EnumC0039Ag0 i;
    public static final /* synthetic */ EnumC0039Ag0[] j;
    public final int a;

    static {
        EnumC0039Ag0 enumC0039Ag0 = new EnumC0039Ag0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        d = enumC0039Ag0;
        EnumC0039Ag0 enumC0039Ag02 = new EnumC0039Ag0("CLASS", 1, 1);
        e = enumC0039Ag02;
        EnumC0039Ag0 enumC0039Ag03 = new EnumC0039Ag0("FILE_FACADE", 2, 2);
        f = enumC0039Ag03;
        EnumC0039Ag0 enumC0039Ag04 = new EnumC0039Ag0("SYNTHETIC_CLASS", 3, 3);
        g = enumC0039Ag04;
        EnumC0039Ag0 enumC0039Ag05 = new EnumC0039Ag0("MULTIFILE_CLASS", 4, 4);
        h = enumC0039Ag05;
        EnumC0039Ag0 enumC0039Ag06 = new EnumC0039Ag0("MULTIFILE_CLASS_PART", 5, 5);
        i = enumC0039Ag06;
        EnumC0039Ag0[] enumC0039Ag0Arr = {enumC0039Ag0, enumC0039Ag02, enumC0039Ag03, enumC0039Ag04, enumC0039Ag05, enumC0039Ag06};
        j = enumC0039Ag0Arr;
        F02.c(enumC0039Ag0Arr);
        b = new C0318Dv0(16);
        EnumC0039Ag0[] enumC0039Ag0ArrValues = values();
        int iB = AbstractC7287tn0.b(enumC0039Ag0ArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
        for (EnumC0039Ag0 enumC0039Ag07 : enumC0039Ag0ArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC0039Ag07.a), enumC0039Ag07);
        }
        c = linkedHashMap;
    }

    public EnumC0039Ag0(String str, int i2, int i3) {
        this.a = i3;
    }

    public static EnumC0039Ag0 valueOf(String str) {
        return (EnumC0039Ag0) Enum.valueOf(EnumC0039Ag0.class, str);
    }

    public static EnumC0039Ag0[] values() {
        return (EnumC0039Ag0[]) j.clone();
    }
}
