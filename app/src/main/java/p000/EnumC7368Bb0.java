package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Bb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7368Bb0 {

    /* renamed from: a */
    public static final EnumC7368Bb0 f934a;

    /* renamed from: b */
    public static final EnumC7368Bb0 f935b;

    /* renamed from: c */
    public static final EnumC7368Bb0 f936c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC7368Bb0[] f937d;

    static {
        EnumC7368Bb0 enumC7368Bb0 = new EnumC7368Bb0("INFLEXIBLE", 0);
        f934a = enumC7368Bb0;
        EnumC7368Bb0 enumC7368Bb02 = new EnumC7368Bb0("FLEXIBLE_UPPER_BOUND", 1);
        f935b = enumC7368Bb02;
        EnumC7368Bb0 enumC7368Bb03 = new EnumC7368Bb0("FLEXIBLE_LOWER_BOUND", 2);
        f936c = enumC7368Bb03;
        EnumC7368Bb0[] enumC7368Bb0Arr = {enumC7368Bb0, enumC7368Bb02, enumC7368Bb03};
        f937d = enumC7368Bb0Arr;
        F02.m2482c(enumC7368Bb0Arr);
    }

    public static EnumC7368Bb0 valueOf(String str) {
        return (EnumC7368Bb0) Enum.valueOf(EnumC7368Bb0.class, str);
    }

    public static EnumC7368Bb0[] values() {
        return (EnumC7368Bb0[]) f937d.clone();
    }
}
