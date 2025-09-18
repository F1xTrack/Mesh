package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pY */
/* loaded from: classes.dex */
public final class EnumC6624pY {

    /* renamed from: a */
    public static final EnumC6624pY f40182a;

    /* renamed from: b */
    public static final EnumC6624pY f40183b;

    /* renamed from: c */
    public static final EnumC6624pY f40184c;

    /* renamed from: d */
    public static final EnumC6624pY f40185d;

    /* renamed from: e */
    public static final EnumC6624pY f40186e;

    /* renamed from: f */
    public static final EnumC6624pY f40187f;

    /* renamed from: g */
    public static final EnumC6624pY f40188g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC6624pY[] f40189h;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6624pY EF9;

    static {
        EnumC6624pY enumC6624pY = new EnumC6624pY("PENALTY_LOG", 0);
        EnumC6624pY enumC6624pY2 = new EnumC6624pY("PENALTY_DEATH", 1);
        EnumC6624pY enumC6624pY3 = new EnumC6624pY("DETECT_FRAGMENT_REUSE", 2);
        f40182a = enumC6624pY3;
        EnumC6624pY enumC6624pY4 = new EnumC6624pY("DETECT_FRAGMENT_TAG_USAGE", 3);
        f40183b = enumC6624pY4;
        EnumC6624pY enumC6624pY5 = new EnumC6624pY("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f40184c = enumC6624pY5;
        EnumC6624pY enumC6624pY6 = new EnumC6624pY("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f40185d = enumC6624pY6;
        EnumC6624pY enumC6624pY7 = new EnumC6624pY("DETECT_SET_USER_VISIBLE_HINT", 6);
        f40186e = enumC6624pY7;
        EnumC6624pY enumC6624pY8 = new EnumC6624pY("DETECT_TARGET_FRAGMENT_USAGE", 7);
        f40187f = enumC6624pY8;
        EnumC6624pY enumC6624pY9 = new EnumC6624pY("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f40188g = enumC6624pY9;
        f40189h = new EnumC6624pY[]{enumC6624pY, enumC6624pY2, enumC6624pY3, enumC6624pY4, enumC6624pY5, enumC6624pY6, enumC6624pY7, enumC6624pY8, enumC6624pY9};
    }

    public static EnumC6624pY valueOf(String str) {
        return (EnumC6624pY) Enum.valueOf(EnumC6624pY.class, str);
    }

    public static EnumC6624pY[] values() {
        return (EnumC6624pY[]) f40189h.clone();
    }
}
