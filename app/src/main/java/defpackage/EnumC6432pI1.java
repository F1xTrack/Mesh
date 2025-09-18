package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6432pI1 {
    public static final EnumC6432pI1 a;
    public static final /* synthetic */ EnumC6432pI1[] b;

    static {
        EnumC6432pI1 enumC6432pI1 = new EnumC6432pI1("DEFAULT", 0);
        a = enumC6432pI1;
        b = new EnumC6432pI1[]{enumC6432pI1, new EnumC6432pI1("SIGNED", 1), new EnumC6432pI1("FIXED", 2)};
    }

    public static EnumC6432pI1[] values() {
        return (EnumC6432pI1[]) b.clone();
    }
}
