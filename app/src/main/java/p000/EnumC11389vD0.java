package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11389vD0 {

    /* renamed from: a */
    public static final EnumC11389vD0 f44272a;

    /* renamed from: b */
    public static final EnumC11389vD0 f44273b;

    /* renamed from: c */
    public static final EnumC11389vD0 f44274c;

    /* renamed from: d */
    public static final EnumC11389vD0 f44275d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC11389vD0[] f44276e;

    static {
        EnumC11389vD0 enumC11389vD0 = new EnumC11389vD0("IMMEDIATE", 0);
        f44272a = enumC11389vD0;
        EnumC11389vD0 enumC11389vD02 = new EnumC11389vD0("HIGH", 1);
        f44273b = enumC11389vD02;
        EnumC11389vD0 enumC11389vD03 = new EnumC11389vD0("NORMAL", 2);
        f44274c = enumC11389vD03;
        EnumC11389vD0 enumC11389vD04 = new EnumC11389vD0("LOW", 3);
        f44275d = enumC11389vD04;
        f44276e = new EnumC11389vD0[]{enumC11389vD0, enumC11389vD02, enumC11389vD03, enumC11389vD04};
    }

    public static EnumC11389vD0 valueOf(String str) {
        return (EnumC11389vD0) Enum.valueOf(EnumC11389vD0.class, str);
    }

    public static EnumC11389vD0[] values() {
        return (EnumC11389vD0[]) f44276e.clone();
    }
}
