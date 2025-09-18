package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: uD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11261uD0 {

    /* renamed from: a */
    public static final EnumC11261uD0 f43594a;

    /* renamed from: b */
    public static final EnumC11261uD0 f43595b;

    /* renamed from: c */
    public static final EnumC11261uD0 f43596c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC11261uD0[] f43597d;

    static {
        EnumC11261uD0 enumC11261uD0 = new EnumC11261uD0("DEFAULT", 0);
        f43594a = enumC11261uD0;
        EnumC11261uD0 enumC11261uD02 = new EnumC11261uD0("VERY_LOW", 1);
        f43595b = enumC11261uD02;
        EnumC11261uD0 enumC11261uD03 = new EnumC11261uD0("HIGHEST", 2);
        f43596c = enumC11261uD03;
        f43597d = new EnumC11261uD0[]{enumC11261uD0, enumC11261uD02, enumC11261uD03};
    }

    public static EnumC11261uD0 valueOf(String str) {
        return (EnumC11261uD0) Enum.valueOf(EnumC11261uD0.class, str);
    }

    public static EnumC11261uD0[] values() {
        return (EnumC11261uD0[]) f43597d.clone();
    }
}
