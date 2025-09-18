package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6963s5 {
    public static final EnumC6963s5 a;
    public static final EnumC6963s5 b;
    public static final /* synthetic */ EnumC6963s5[] c;

    static {
        EnumC6963s5 enumC6963s5 = new EnumC6963s5("CALL_BY_NAME", 0);
        a = enumC6963s5;
        EnumC6963s5 enumC6963s52 = new EnumC6963s5("POSITIONAL_CALL", 1);
        b = enumC6963s52;
        EnumC6963s5[] enumC6963s5Arr = {enumC6963s5, enumC6963s52};
        c = enumC6963s5Arr;
        F02.c(enumC6963s5Arr);
    }

    public static EnumC6963s5 valueOf(String str) {
        return (EnumC6963s5) Enum.valueOf(EnumC6963s5.class, str);
    }

    public static EnumC6963s5[] values() {
        return (EnumC6963s5[]) c.clone();
    }
}
