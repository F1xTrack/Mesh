package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9325f50 {

    /* renamed from: a */
    public static final /* synthetic */ EnumC9325f50[] f27049a = {new EnumC9325f50("UPPER", 0), new EnumC9325f50("LOWER", 1), new EnumC9325f50("FALSE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC9325f50 EF7;

    public static EnumC9325f50 valueOf(String str) {
        return (EnumC9325f50) Enum.valueOf(EnumC9325f50.class, str);
    }

    public static EnumC9325f50[] values() {
        return (EnumC9325f50[]) f27049a.clone();
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
