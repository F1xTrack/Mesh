package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6478pY {
    public static final EnumC6478pY a;
    public static final EnumC6478pY b;
    public static final EnumC6478pY c;
    public static final EnumC6478pY d;
    public static final EnumC6478pY e;
    public static final EnumC6478pY f;
    public static final EnumC6478pY g;
    public static final /* synthetic */ EnumC6478pY[] h;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6478pY EF9;

    static {
        EnumC6478pY enumC6478pY = new EnumC6478pY("PENALTY_LOG", 0);
        EnumC6478pY enumC6478pY2 = new EnumC6478pY("PENALTY_DEATH", 1);
        EnumC6478pY enumC6478pY3 = new EnumC6478pY("DETECT_FRAGMENT_REUSE", 2);
        a = enumC6478pY3;
        EnumC6478pY enumC6478pY4 = new EnumC6478pY("DETECT_FRAGMENT_TAG_USAGE", 3);
        b = enumC6478pY4;
        EnumC6478pY enumC6478pY5 = new EnumC6478pY("DETECT_WRONG_NESTED_HIERARCHY", 4);
        c = enumC6478pY5;
        EnumC6478pY enumC6478pY6 = new EnumC6478pY("DETECT_RETAIN_INSTANCE_USAGE", 5);
        d = enumC6478pY6;
        EnumC6478pY enumC6478pY7 = new EnumC6478pY("DETECT_SET_USER_VISIBLE_HINT", 6);
        e = enumC6478pY7;
        EnumC6478pY enumC6478pY8 = new EnumC6478pY("DETECT_TARGET_FRAGMENT_USAGE", 7);
        f = enumC6478pY8;
        EnumC6478pY enumC6478pY9 = new EnumC6478pY("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        g = enumC6478pY9;
        h = new EnumC6478pY[]{enumC6478pY, enumC6478pY2, enumC6478pY3, enumC6478pY4, enumC6478pY5, enumC6478pY6, enumC6478pY7, enumC6478pY8, enumC6478pY9};
    }

    public static EnumC6478pY valueOf(String str) {
        return (EnumC6478pY) Enum.valueOf(EnumC6478pY.class, str);
    }

    public static EnumC6478pY[] values() {
        return (EnumC6478pY[]) h.clone();
    }
}
