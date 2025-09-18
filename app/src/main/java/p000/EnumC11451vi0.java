package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11451vi0 {

    /* renamed from: a */
    public static final EnumC11451vi0 f44499a;

    /* renamed from: b */
    public static final EnumC11451vi0 f44500b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC11451vi0[] f44501c;

    static {
        EnumC11451vi0 enumC11451vi0 = new EnumC11451vi0("POINT", 0);
        f44499a = enumC11451vi0;
        EnumC11451vi0 enumC11451vi02 = new EnumC11451vi0("PERCENT", 1);
        f44500b = enumC11451vi02;
        EnumC11451vi0[] enumC11451vi0Arr = {enumC11451vi0, enumC11451vi02};
        f44501c = enumC11451vi0Arr;
        F02.m2482c(enumC11451vi0Arr);
    }

    public static EnumC11451vi0 valueOf(String str) {
        return (EnumC11451vi0) Enum.valueOf(EnumC11451vi0.class, str);
    }

    public static EnumC11451vi0[] values() {
        return (EnumC11451vi0[]) f44501c.clone();
    }
}
