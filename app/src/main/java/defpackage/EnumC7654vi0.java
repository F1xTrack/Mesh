package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7654vi0 {
    public static final EnumC7654vi0 a;
    public static final EnumC7654vi0 b;
    public static final /* synthetic */ EnumC7654vi0[] c;

    static {
        EnumC7654vi0 enumC7654vi0 = new EnumC7654vi0("POINT", 0);
        a = enumC7654vi0;
        EnumC7654vi0 enumC7654vi02 = new EnumC7654vi0("PERCENT", 1);
        b = enumC7654vi02;
        EnumC7654vi0[] enumC7654vi0Arr = {enumC7654vi0, enumC7654vi02};
        c = enumC7654vi0Arr;
        F02.c(enumC7654vi0Arr);
    }

    public static EnumC7654vi0 valueOf(String str) {
        return (EnumC7654vi0) Enum.valueOf(EnumC7654vi0.class, str);
    }

    public static EnumC7654vi0[] values() {
        return (EnumC7654vi0[]) c.clone();
    }
}
