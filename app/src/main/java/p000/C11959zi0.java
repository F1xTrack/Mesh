package p000;

/* renamed from: zi0 */
/* loaded from: classes.dex */
public final class C11959zi0 {
    /* renamed from: a */
    public static EnumC7382Bi0 m26516a(EnumC7434Ci0 enumC7434Ci0) {
        O90.m5968f(enumC7434Ci0, "state");
        int iOrdinal = enumC7434Ci0.ordinal();
        if (iOrdinal == 2) {
            return EnumC7382Bi0.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return EnumC7382Bi0.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC7382Bi0.ON_PAUSE;
    }

    /* renamed from: b */
    public static EnumC7382Bi0 m26517b(EnumC7434Ci0 enumC7434Ci0) {
        O90.m5968f(enumC7434Ci0, "state");
        int iOrdinal = enumC7434Ci0.ordinal();
        if (iOrdinal == 1) {
            return EnumC7382Bi0.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC7382Bi0.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC7382Bi0.ON_RESUME;
    }

    /* renamed from: c */
    public static EnumC7382Bi0 m26518c(EnumC7434Ci0 enumC7434Ci0) {
        O90.m5968f(enumC7434Ci0, "state");
        int iOrdinal = enumC7434Ci0.ordinal();
        if (iOrdinal == 2) {
            return EnumC7382Bi0.ON_CREATE;
        }
        if (iOrdinal == 3) {
            return EnumC7382Bi0.ON_START;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC7382Bi0.ON_RESUME;
    }
}
