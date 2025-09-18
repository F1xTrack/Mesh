package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7154t5 {
    public static final EnumC7154t5 a;
    public static final EnumC7154t5 b;
    public static final /* synthetic */ EnumC7154t5[] c;

    static {
        EnumC7154t5 enumC7154t5 = new EnumC7154t5("JAVA", 0);
        a = enumC7154t5;
        EnumC7154t5 enumC7154t52 = new EnumC7154t5("KOTLIN", 1);
        b = enumC7154t52;
        EnumC7154t5[] enumC7154t5Arr = {enumC7154t5, enumC7154t52};
        c = enumC7154t5Arr;
        F02.c(enumC7154t5Arr);
    }

    public static EnumC7154t5 valueOf(String str) {
        return (EnumC7154t5) Enum.valueOf(EnumC7154t5.class, str);
    }

    public static EnumC7154t5[] values() {
        return (EnumC7154t5[]) c.clone();
    }
}
