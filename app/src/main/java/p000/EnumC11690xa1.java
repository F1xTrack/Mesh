package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xa1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11690xa1 {

    /* renamed from: a */
    public static final EnumC11690xa1 f45684a;

    /* renamed from: b */
    public static final EnumC11690xa1 f45685b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC11690xa1[] f45686c;

    static {
        EnumC11690xa1 enumC11690xa1 = new EnumC11690xa1("UPTIME", 0);
        f45684a = enumC11690xa1;
        EnumC11690xa1 enumC11690xa12 = new EnumC11690xa1("REALTIME", 1);
        f45685b = enumC11690xa12;
        f45686c = new EnumC11690xa1[]{enumC11690xa1, enumC11690xa12};
    }

    public static EnumC11690xa1 valueOf(String str) {
        return (EnumC11690xa1) Enum.valueOf(EnumC11690xa1.class, str);
    }

    public static EnumC11690xa1[] values() {
        return (EnumC11690xa1[]) f45686c.clone();
    }
}
