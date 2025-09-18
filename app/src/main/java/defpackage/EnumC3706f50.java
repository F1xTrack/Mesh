package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3706f50 {
    public static final /* synthetic */ EnumC3706f50[] a = {new EnumC3706f50("UPPER", 0), new EnumC3706f50("LOWER", 1), new EnumC3706f50("FALSE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3706f50 EF7;

    public static EnumC3706f50 valueOf(String str) {
        return (EnumC3706f50) Enum.valueOf(EnumC3706f50.class, str);
    }

    public static EnumC3706f50[] values() {
        return (EnumC3706f50[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "upper";
        }
        if (iOrdinal == 1) {
            return "lower";
        }
        if (iOrdinal == 2) {
            return "false";
        }
        throw new IllegalArgumentException();
    }
}
