package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: uW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7427uW0 {
    public static final EnumC7427uW0 a;
    public static final EnumC7427uW0 b;
    public static final EnumC7427uW0 c;
    public static final EnumC7427uW0 d;
    public static final EnumC7427uW0 e;
    public static final /* synthetic */ EnumC7427uW0[] f;

    static {
        EnumC7427uW0 enumC7427uW0 = new EnumC7427uW0("LEFT", 0);
        a = enumC7427uW0;
        EnumC7427uW0 enumC7427uW02 = new EnumC7427uW0("CENTER", 1);
        b = enumC7427uW02;
        EnumC7427uW0 enumC7427uW03 = new EnumC7427uW0("RIGHT", 2);
        c = enumC7427uW03;
        EnumC7427uW0 enumC7427uW04 = new EnumC7427uW0("BACK", 3);
        d = enumC7427uW04;
        EnumC7427uW0 enumC7427uW05 = new EnumC7427uW0("SEARCH_BAR", 4);
        e = enumC7427uW05;
        EnumC7427uW0[] enumC7427uW0Arr = {enumC7427uW0, enumC7427uW02, enumC7427uW03, enumC7427uW04, enumC7427uW05};
        f = enumC7427uW0Arr;
        F02.c(enumC7427uW0Arr);
    }

    public static EnumC7427uW0 valueOf(String str) {
        return (EnumC7427uW0) Enum.valueOf(EnumC7427uW0.class, str);
    }

    public static EnumC7427uW0[] values() {
        return (EnumC7427uW0[]) f.clone();
    }
}
