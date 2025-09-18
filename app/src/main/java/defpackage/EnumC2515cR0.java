package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cR0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC2515cR0 {
    public static final C2325bR0 a;
    public static final C2134aR0 b;
    public static final /* synthetic */ EnumC2515cR0[] c;

    static {
        C2325bR0 c2325bR0 = new C2325bR0();
        a = c2325bR0;
        C2134aR0 c2134aR0 = new C2134aR0();
        b = c2134aR0;
        EnumC2515cR0[] enumC2515cR0Arr = {c2325bR0, c2134aR0};
        c = enumC2515cR0Arr;
        F02.c(enumC2515cR0Arr);
    }

    public static EnumC2515cR0 valueOf(String str) {
        return (EnumC2515cR0) Enum.valueOf(EnumC2515cR0.class, str);
    }

    public static EnumC2515cR0[] values() {
        return (EnumC2515cR0[]) c.clone();
    }

    public abstract String a(String str);
}
