package defpackage;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7095sn {
    public static final EnumC7095sn a;
    public static final EnumC7095sn b;
    public static final EnumC7095sn c;
    public static final EnumC7095sn d;
    public static final EnumC7095sn e;
    public static final EnumC7095sn f;
    public static final EnumC7095sn g;
    public static final /* synthetic */ EnumC7095sn[] h;

    static {
        EnumC7095sn enumC7095sn = new EnumC7095sn(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        a = enumC7095sn;
        EnumC7095sn enumC7095sn2 = new EnumC7095sn("INACTIVE", 1);
        b = enumC7095sn2;
        EnumC7095sn enumC7095sn3 = new EnumC7095sn("SCANNING", 2);
        c = enumC7095sn3;
        EnumC7095sn enumC7095sn4 = new EnumC7095sn("PASSIVE_FOCUSED", 3);
        d = enumC7095sn4;
        EnumC7095sn enumC7095sn5 = new EnumC7095sn("PASSIVE_NOT_FOCUSED", 4);
        e = enumC7095sn5;
        EnumC7095sn enumC7095sn6 = new EnumC7095sn("LOCKED_FOCUSED", 5);
        f = enumC7095sn6;
        EnumC7095sn enumC7095sn7 = new EnumC7095sn("LOCKED_NOT_FOCUSED", 6);
        g = enumC7095sn7;
        h = new EnumC7095sn[]{enumC7095sn, enumC7095sn2, enumC7095sn3, enumC7095sn4, enumC7095sn5, enumC7095sn6, enumC7095sn7};
    }

    public static EnumC7095sn valueOf(String str) {
        return (EnumC7095sn) Enum.valueOf(EnumC7095sn.class, str);
    }

    public static EnumC7095sn[] values() {
        return (EnumC7095sn[]) h.clone();
    }
}
