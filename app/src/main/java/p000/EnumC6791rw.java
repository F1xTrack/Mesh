package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rw */
/* loaded from: classes.dex */
public final class EnumC6791rw {

    /* renamed from: a */
    public static final EnumC6791rw f42159a;

    /* renamed from: b */
    public static final EnumC6791rw f42160b;

    /* renamed from: c */
    public static final EnumC6791rw f42161c;

    /* renamed from: d */
    public static final EnumC6791rw f42162d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC6791rw[] f42163e;

    static {
        EnumC6791rw enumC6791rw = new EnumC6791rw("ALWAYS_OVERRIDE", 0);
        f42159a = enumC6791rw;
        EnumC6791rw enumC6791rw2 = new EnumC6791rw("HIGH_PRIORITY_REQUIRED", 1);
        f42160b = enumC6791rw2;
        EnumC6791rw enumC6791rw3 = new EnumC6791rw("REQUIRED", 2);
        f42161c = enumC6791rw3;
        EnumC6791rw enumC6791rw4 = new EnumC6791rw("OPTIONAL", 3);
        f42162d = enumC6791rw4;
        f42163e = new EnumC6791rw[]{enumC6791rw, enumC6791rw2, enumC6791rw3, enumC6791rw4};
    }

    public static EnumC6791rw valueOf(String str) {
        return (EnumC6791rw) Enum.valueOf(EnumC6791rw.class, str);
    }

    public static EnumC6791rw[] values() {
        return (EnumC6791rw[]) f42163e.clone();
    }
}
