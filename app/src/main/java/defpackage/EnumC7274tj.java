package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7274tj {
    public static final EnumC7274tj a;
    public static final EnumC7274tj b;
    public static final EnumC7274tj c;
    public static final /* synthetic */ EnumC7274tj[] d;

    static {
        EnumC7274tj enumC7274tj = new EnumC7274tj("SUSPEND", 0);
        a = enumC7274tj;
        EnumC7274tj enumC7274tj2 = new EnumC7274tj("DROP_OLDEST", 1);
        b = enumC7274tj2;
        EnumC7274tj enumC7274tj3 = new EnumC7274tj("DROP_LATEST", 2);
        c = enumC7274tj3;
        EnumC7274tj[] enumC7274tjArr = {enumC7274tj, enumC7274tj2, enumC7274tj3};
        d = enumC7274tjArr;
        F02.c(enumC7274tjArr);
    }

    public static EnumC7274tj valueOf(String str) {
        return (EnumC7274tj) Enum.valueOf(EnumC7274tj.class, str);
    }

    public static EnumC7274tj[] values() {
        return (EnumC7274tj[]) d.clone();
    }
}
