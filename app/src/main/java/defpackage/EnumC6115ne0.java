package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ne0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6115ne0 {
    public static final EnumC6115ne0 a;
    public static final EnumC6115ne0 b;
    public static final /* synthetic */ EnumC6115ne0[] c;

    static {
        EnumC6115ne0 enumC6115ne0 = new EnumC6115ne0("DECLARED", 0);
        a = enumC6115ne0;
        EnumC6115ne0 enumC6115ne02 = new EnumC6115ne0("INHERITED", 1);
        b = enumC6115ne02;
        EnumC6115ne0[] enumC6115ne0Arr = {enumC6115ne0, enumC6115ne02};
        c = enumC6115ne0Arr;
        F02.c(enumC6115ne0Arr);
    }

    public static EnumC6115ne0 valueOf(String str) {
        return (EnumC6115ne0) Enum.valueOf(EnumC6115ne0.class, str);
    }

    public static EnumC6115ne0[] values() {
        return (EnumC6115ne0[]) c.clone();
    }
}
