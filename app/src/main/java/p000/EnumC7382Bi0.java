package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Bi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7382Bi0 {
    private static final /* synthetic */ EnumC7382Bi0[] $VALUES;
    public static final C11959zi0 Companion;
    public static final EnumC7382Bi0 ON_ANY;
    public static final EnumC7382Bi0 ON_CREATE;
    public static final EnumC7382Bi0 ON_DESTROY;
    public static final EnumC7382Bi0 ON_PAUSE;
    public static final EnumC7382Bi0 ON_RESUME;
    public static final EnumC7382Bi0 ON_START;
    public static final EnumC7382Bi0 ON_STOP;

    static {
        EnumC7382Bi0 enumC7382Bi0 = new EnumC7382Bi0("ON_CREATE", 0);
        ON_CREATE = enumC7382Bi0;
        EnumC7382Bi0 enumC7382Bi02 = new EnumC7382Bi0("ON_START", 1);
        ON_START = enumC7382Bi02;
        EnumC7382Bi0 enumC7382Bi03 = new EnumC7382Bi0("ON_RESUME", 2);
        ON_RESUME = enumC7382Bi03;
        EnumC7382Bi0 enumC7382Bi04 = new EnumC7382Bi0("ON_PAUSE", 3);
        ON_PAUSE = enumC7382Bi04;
        EnumC7382Bi0 enumC7382Bi05 = new EnumC7382Bi0("ON_STOP", 4);
        ON_STOP = enumC7382Bi05;
        EnumC7382Bi0 enumC7382Bi06 = new EnumC7382Bi0("ON_DESTROY", 5);
        ON_DESTROY = enumC7382Bi06;
        EnumC7382Bi0 enumC7382Bi07 = new EnumC7382Bi0("ON_ANY", 6);
        ON_ANY = enumC7382Bi07;
        $VALUES = new EnumC7382Bi0[]{enumC7382Bi0, enumC7382Bi02, enumC7382Bi03, enumC7382Bi04, enumC7382Bi05, enumC7382Bi06, enumC7382Bi07};
        Companion = new C11959zi0();
    }

    public static EnumC7382Bi0 valueOf(String str) {
        return (EnumC7382Bi0) Enum.valueOf(EnumC7382Bi0.class, str);
    }

    public static EnumC7382Bi0[] values() {
        return (EnumC7382Bi0[]) $VALUES.clone();
    }

    /* renamed from: a */
    public final EnumC7434Ci0 m812a() {
        switch (AbstractC7330Ai0.f337a[ordinal()]) {
            case 1:
            case 2:
                return EnumC7434Ci0.f1588c;
            case 3:
            case 4:
                return EnumC7434Ci0.f1589d;
            case 5:
                return EnumC7434Ci0.f1590e;
            case 6:
                return EnumC7434Ci0.f1586a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
