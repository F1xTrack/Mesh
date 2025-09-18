package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xa1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8011xa1 {
    public static final EnumC8011xa1 a;
    public static final EnumC8011xa1 b;
    public static final /* synthetic */ EnumC8011xa1[] c;

    static {
        EnumC8011xa1 enumC8011xa1 = new EnumC8011xa1("UPTIME", 0);
        a = enumC8011xa1;
        EnumC8011xa1 enumC8011xa12 = new EnumC8011xa1("REALTIME", 1);
        b = enumC8011xa12;
        c = new EnumC8011xa1[]{enumC8011xa1, enumC8011xa12};
    }

    public static EnumC8011xa1 valueOf(String str) {
        return (EnumC8011xa1) Enum.valueOf(EnumC8011xa1.class, str);
    }

    public static EnumC8011xa1[] values() {
        return (EnumC8011xa1[]) c.clone();
    }
}
