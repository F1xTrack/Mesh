package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5819m50 {
    public static final /* synthetic */ EnumC5819m50[] a = {new EnumC5819m50("BESTFIT", 0), new EnumC5819m50("BASIC", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5819m50 EF6;

    public static EnumC5819m50 valueOf(String str) {
        return (EnumC5819m50) Enum.valueOf(EnumC5819m50.class, str);
    }

    public static EnumC5819m50[] values() {
        return (EnumC5819m50[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "best fit";
        }
        if (iOrdinal == 1) {
            return "basic";
        }
        throw new IllegalArgumentException();
    }
}
