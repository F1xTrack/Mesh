package p000;

/* renamed from: zv0 */
/* loaded from: classes2.dex */
public final class EnumC11985zv0 extends Enum implements InterfaceC7700Hl0 {

    /* renamed from: a */
    public static final EnumC11985zv0 f47094a;

    /* renamed from: b */
    public static final EnumC11985zv0 f47095b;

    /* renamed from: c */
    public static final EnumC11985zv0 f47096c;

    /* renamed from: d */
    public static final EnumC11985zv0 f47097d;

    /* renamed from: e */
    public static final EnumC11985zv0 f47098e;

    /* renamed from: f */
    public static final EnumC11985zv0 f47099f;

    /* renamed from: g */
    public static final EnumC11985zv0 f47100g;

    /* renamed from: h */
    public static final EnumC11985zv0 f47101h;

    /* renamed from: i */
    public static final /* synthetic */ EnumC11985zv0[] f47102i;

    static {
        EnumC11985zv0 enumC11985zv0 = new EnumC11985zv0("FROM_IDE", 0);
        EnumC11985zv0 enumC11985zv02 = new EnumC11985zv0("FROM_BACKEND", 1);
        EnumC11985zv0 enumC11985zv03 = new EnumC11985zv0("FROM_TEST", 2);
        EnumC11985zv0 enumC11985zv04 = new EnumC11985zv0("FROM_BUILTINS", 3);
        f47094a = enumC11985zv04;
        EnumC11985zv0 enumC11985zv05 = new EnumC11985zv0("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        EnumC11985zv0 enumC11985zv06 = new EnumC11985zv0("WHEN_CHECK_OVERRIDES", 5);
        EnumC11985zv0 enumC11985zv07 = new EnumC11985zv0("FOR_SCRIPT", 6);
        EnumC11985zv0 enumC11985zv08 = new EnumC11985zv0("FROM_REFLECTION", 7);
        f47095b = enumC11985zv08;
        EnumC11985zv0 enumC11985zv09 = new EnumC11985zv0("WHEN_RESOLVE_DECLARATION", 8);
        EnumC11985zv0 enumC11985zv010 = new EnumC11985zv0("WHEN_GET_DECLARATION_SCOPE", 9);
        EnumC11985zv0 enumC11985zv011 = new EnumC11985zv0("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        EnumC11985zv0 enumC11985zv012 = new EnumC11985zv0("FOR_ALREADY_TRACKED", 11);
        f47096c = enumC11985zv012;
        EnumC11985zv0 enumC11985zv013 = new EnumC11985zv0("WHEN_GET_ALL_DESCRIPTORS", 12);
        f47097d = enumC11985zv013;
        EnumC11985zv0 enumC11985zv014 = new EnumC11985zv0("WHEN_TYPING", 13);
        EnumC11985zv0 enumC11985zv015 = new EnumC11985zv0("WHEN_GET_SUPER_MEMBERS", 14);
        f47098e = enumC11985zv015;
        EnumC11985zv0 enumC11985zv016 = new EnumC11985zv0("FOR_NON_TRACKED_SCOPE", 15);
        f47099f = enumC11985zv016;
        EnumC11985zv0 enumC11985zv017 = new EnumC11985zv0("FROM_SYNTHETIC_SCOPE", 16);
        EnumC11985zv0 enumC11985zv018 = new EnumC11985zv0("FROM_DESERIALIZATION", 17);
        f47100g = enumC11985zv018;
        EnumC11985zv0 enumC11985zv019 = new EnumC11985zv0("FROM_JAVA_LOADER", 18);
        f47101h = enumC11985zv019;
        EnumC11985zv0[] enumC11985zv0Arr = {enumC11985zv0, enumC11985zv02, enumC11985zv03, enumC11985zv04, enumC11985zv05, enumC11985zv06, enumC11985zv07, enumC11985zv08, enumC11985zv09, enumC11985zv010, enumC11985zv011, enumC11985zv012, enumC11985zv013, enumC11985zv014, enumC11985zv015, enumC11985zv016, enumC11985zv017, enumC11985zv018, enumC11985zv019, new EnumC11985zv0("WHEN_GET_LOCAL_VARIABLE", 19), new EnumC11985zv0("WHEN_FIND_BY_FQNAME", 20), new EnumC11985zv0("WHEN_GET_COMPANION_OBJECT", 21), new EnumC11985zv0("FOR_DEFAULT_IMPORTS", 22)};
        f47102i = enumC11985zv0Arr;
        F02.m2482c(enumC11985zv0Arr);
    }

    public static EnumC11985zv0 valueOf(String str) {
        return (EnumC11985zv0) Enum.valueOf(EnumC11985zv0.class, str);
    }

    public static EnumC11985zv0[] values() {
        return (EnumC11985zv0[]) f47102i.clone();
    }
}
