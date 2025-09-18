package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ze1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8403ze1 {
    public static final EnumC8403ze1 a;
    public static final EnumC8403ze1 b;
    public static final /* synthetic */ EnumC8403ze1[] c;

    static {
        EnumC8403ze1 enumC8403ze1 = new EnumC8403ze1("SUPERTYPE", 0);
        a = enumC8403ze1;
        EnumC8403ze1 enumC8403ze12 = new EnumC8403ze1("COMMON", 1);
        b = enumC8403ze12;
        EnumC8403ze1[] enumC8403ze1Arr = {enumC8403ze1, enumC8403ze12};
        c = enumC8403ze1Arr;
        F02.c(enumC8403ze1Arr);
    }

    public static EnumC8403ze1 valueOf(String str) {
        return (EnumC8403ze1) Enum.valueOf(EnumC8403ze1.class, str);
    }

    public static EnumC8403ze1[] values() {
        return (EnumC8403ze1[]) c.clone();
    }
}
