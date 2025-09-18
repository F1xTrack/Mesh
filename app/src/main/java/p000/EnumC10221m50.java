package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10221m50 {

    /* renamed from: a */
    public static final /* synthetic */ EnumC10221m50[] f37471a = {new EnumC10221m50("BESTFIT", 0), new EnumC10221m50("BASIC", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10221m50 EF6;

    public static EnumC10221m50 valueOf(String str) {
        return (EnumC10221m50) Enum.valueOf(EnumC10221m50.class, str);
    }

    public static EnumC10221m50[] values() {
        return (EnumC10221m50[]) f37471a.clone();
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
