package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Bi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0123Bi0 {
    private static final /* synthetic */ EnumC0123Bi0[] $VALUES;
    public static final C8414zi0 Companion;
    public static final EnumC0123Bi0 ON_ANY;
    public static final EnumC0123Bi0 ON_CREATE;
    public static final EnumC0123Bi0 ON_DESTROY;
    public static final EnumC0123Bi0 ON_PAUSE;
    public static final EnumC0123Bi0 ON_RESUME;
    public static final EnumC0123Bi0 ON_START;
    public static final EnumC0123Bi0 ON_STOP;

    static {
        EnumC0123Bi0 enumC0123Bi0 = new EnumC0123Bi0("ON_CREATE", 0);
        ON_CREATE = enumC0123Bi0;
        EnumC0123Bi0 enumC0123Bi02 = new EnumC0123Bi0("ON_START", 1);
        ON_START = enumC0123Bi02;
        EnumC0123Bi0 enumC0123Bi03 = new EnumC0123Bi0("ON_RESUME", 2);
        ON_RESUME = enumC0123Bi03;
        EnumC0123Bi0 enumC0123Bi04 = new EnumC0123Bi0("ON_PAUSE", 3);
        ON_PAUSE = enumC0123Bi04;
        EnumC0123Bi0 enumC0123Bi05 = new EnumC0123Bi0("ON_STOP", 4);
        ON_STOP = enumC0123Bi05;
        EnumC0123Bi0 enumC0123Bi06 = new EnumC0123Bi0("ON_DESTROY", 5);
        ON_DESTROY = enumC0123Bi06;
        EnumC0123Bi0 enumC0123Bi07 = new EnumC0123Bi0("ON_ANY", 6);
        ON_ANY = enumC0123Bi07;
        $VALUES = new EnumC0123Bi0[]{enumC0123Bi0, enumC0123Bi02, enumC0123Bi03, enumC0123Bi04, enumC0123Bi05, enumC0123Bi06, enumC0123Bi07};
        Companion = new C8414zi0();
    }

    public static EnumC0123Bi0 valueOf(String str) {
        return (EnumC0123Bi0) Enum.valueOf(EnumC0123Bi0.class, str);
    }

    public static EnumC0123Bi0[] values() {
        return (EnumC0123Bi0[]) $VALUES.clone();
    }

    public final EnumC0201Ci0 a() {
        switch (AbstractC0045Ai0.a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0201Ci0.c;
            case 3:
            case 4:
                return EnumC0201Ci0.d;
            case 5:
                return EnumC0201Ci0.e;
            case 6:
                return EnumC0201Ci0.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
