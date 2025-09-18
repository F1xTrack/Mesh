package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Jp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7813Jp1 {

    /* renamed from: a */
    public static final EnumC7813Jp1 f5715a;

    /* renamed from: b */
    public static final EnumC7813Jp1 f5716b;

    /* renamed from: c */
    public static final EnumC7813Jp1 f5717c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC7813Jp1[] f5718d;

    static {
        EnumC7813Jp1 enumC7813Jp1 = new EnumC7813Jp1("UNDEFINED", 0);
        f5715a = enumC7813Jp1;
        EnumC7813Jp1 enumC7813Jp12 = new EnumC7813Jp1("EXACTLY", 1);
        f5716b = enumC7813Jp12;
        EnumC7813Jp1 enumC7813Jp13 = new EnumC7813Jp1("AT_MOST", 2);
        f5717c = enumC7813Jp13;
        f5718d = new EnumC7813Jp1[]{enumC7813Jp1, enumC7813Jp12, enumC7813Jp13};
    }

    /* renamed from: a */
    public static EnumC7813Jp1 m4446a(int i) {
        if (i == 0) {
            return f5715a;
        }
        if (i == 1) {
            return f5716b;
        }
        if (i == 2) {
            return f5717c;
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Unknown enum value: "));
    }

    public static EnumC7813Jp1 valueOf(String str) {
        return (EnumC7813Jp1) Enum.valueOf(EnumC7813Jp1.class, str);
    }

    public static EnumC7813Jp1[] values() {
        return (EnumC7813Jp1[]) f5718d.clone();
    }
}
