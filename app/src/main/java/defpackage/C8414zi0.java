package defpackage;

/* renamed from: zi0 */
/* loaded from: classes.dex */
public final class C8414zi0 {
    public static EnumC0123Bi0 a(EnumC0201Ci0 enumC0201Ci0) {
        O90.f(enumC0201Ci0, "state");
        int iOrdinal = enumC0201Ci0.ordinal();
        if (iOrdinal == 2) {
            return EnumC0123Bi0.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return EnumC0123Bi0.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC0123Bi0.ON_PAUSE;
    }

    public static EnumC0123Bi0 b(EnumC0201Ci0 enumC0201Ci0) {
        O90.f(enumC0201Ci0, "state");
        int iOrdinal = enumC0201Ci0.ordinal();
        if (iOrdinal == 1) {
            return EnumC0123Bi0.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC0123Bi0.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC0123Bi0.ON_RESUME;
    }

    public static EnumC0123Bi0 c(EnumC0201Ci0 enumC0201Ci0) {
        O90.f(enumC0201Ci0, "state");
        int iOrdinal = enumC0201Ci0.ordinal();
        if (iOrdinal == 2) {
            return EnumC0123Bi0.ON_CREATE;
        }
        if (iOrdinal == 3) {
            return EnumC0123Bi0.ON_START;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC0123Bi0.ON_RESUME;
    }
}
