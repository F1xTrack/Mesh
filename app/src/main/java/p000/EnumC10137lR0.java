package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lR0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC10137lR0 {

    /* renamed from: b */
    public static final EnumC10137lR0 f37058b;

    /* renamed from: c */
    public static final EnumC10137lR0 f37059c;

    /* renamed from: d */
    public static final EnumC10137lR0 f37060d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC10137lR0[] f37061e;

    /* renamed from: a */
    public final String f37062a;

    static {
        EnumC10137lR0 enumC10137lR0 = new EnumC10137lR0("IGNORE", 0, "ignore");
        f37058b = enumC10137lR0;
        EnumC10137lR0 enumC10137lR02 = new EnumC10137lR0("WARN", 1, "warn");
        f37059c = enumC10137lR02;
        EnumC10137lR0 enumC10137lR03 = new EnumC10137lR0("STRICT", 2, "strict");
        f37060d = enumC10137lR03;
        EnumC10137lR0[] enumC10137lR0Arr = {enumC10137lR0, enumC10137lR02, enumC10137lR03};
        f37061e = enumC10137lR0Arr;
        F02.m2482c(enumC10137lR0Arr);
    }

    public EnumC10137lR0(String str, int i, String str2) {
        this.f37062a = str2;
    }

    public static EnumC10137lR0 valueOf(String str) {
        return (EnumC10137lR0) Enum.valueOf(EnumC10137lR0.class, str);
    }

    public static EnumC10137lR0[] values() {
        return (EnumC10137lR0[]) f37061e.clone();
    }
}
