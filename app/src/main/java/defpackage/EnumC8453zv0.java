package defpackage;

/* renamed from: zv0 */
/* loaded from: classes2.dex */
public final class EnumC8453zv0 extends Enum implements InterfaceC0600Hl0 {
    public static final EnumC8453zv0 a;
    public static final EnumC8453zv0 b;
    public static final EnumC8453zv0 c;
    public static final EnumC8453zv0 d;
    public static final EnumC8453zv0 e;
    public static final EnumC8453zv0 f;
    public static final EnumC8453zv0 g;
    public static final EnumC8453zv0 h;
    public static final /* synthetic */ EnumC8453zv0[] i;

    static {
        EnumC8453zv0 enumC8453zv0 = new EnumC8453zv0("FROM_IDE", 0);
        EnumC8453zv0 enumC8453zv02 = new EnumC8453zv0("FROM_BACKEND", 1);
        EnumC8453zv0 enumC8453zv03 = new EnumC8453zv0("FROM_TEST", 2);
        EnumC8453zv0 enumC8453zv04 = new EnumC8453zv0("FROM_BUILTINS", 3);
        a = enumC8453zv04;
        EnumC8453zv0 enumC8453zv05 = new EnumC8453zv0("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        EnumC8453zv0 enumC8453zv06 = new EnumC8453zv0("WHEN_CHECK_OVERRIDES", 5);
        EnumC8453zv0 enumC8453zv07 = new EnumC8453zv0("FOR_SCRIPT", 6);
        EnumC8453zv0 enumC8453zv08 = new EnumC8453zv0("FROM_REFLECTION", 7);
        b = enumC8453zv08;
        EnumC8453zv0 enumC8453zv09 = new EnumC8453zv0("WHEN_RESOLVE_DECLARATION", 8);
        EnumC8453zv0 enumC8453zv010 = new EnumC8453zv0("WHEN_GET_DECLARATION_SCOPE", 9);
        EnumC8453zv0 enumC8453zv011 = new EnumC8453zv0("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        EnumC8453zv0 enumC8453zv012 = new EnumC8453zv0("FOR_ALREADY_TRACKED", 11);
        c = enumC8453zv012;
        EnumC8453zv0 enumC8453zv013 = new EnumC8453zv0("WHEN_GET_ALL_DESCRIPTORS", 12);
        d = enumC8453zv013;
        EnumC8453zv0 enumC8453zv014 = new EnumC8453zv0("WHEN_TYPING", 13);
        EnumC8453zv0 enumC8453zv015 = new EnumC8453zv0("WHEN_GET_SUPER_MEMBERS", 14);
        e = enumC8453zv015;
        EnumC8453zv0 enumC8453zv016 = new EnumC8453zv0("FOR_NON_TRACKED_SCOPE", 15);
        f = enumC8453zv016;
        EnumC8453zv0 enumC8453zv017 = new EnumC8453zv0("FROM_SYNTHETIC_SCOPE", 16);
        EnumC8453zv0 enumC8453zv018 = new EnumC8453zv0("FROM_DESERIALIZATION", 17);
        g = enumC8453zv018;
        EnumC8453zv0 enumC8453zv019 = new EnumC8453zv0("FROM_JAVA_LOADER", 18);
        h = enumC8453zv019;
        EnumC8453zv0[] enumC8453zv0Arr = {enumC8453zv0, enumC8453zv02, enumC8453zv03, enumC8453zv04, enumC8453zv05, enumC8453zv06, enumC8453zv07, enumC8453zv08, enumC8453zv09, enumC8453zv010, enumC8453zv011, enumC8453zv012, enumC8453zv013, enumC8453zv014, enumC8453zv015, enumC8453zv016, enumC8453zv017, enumC8453zv018, enumC8453zv019, new EnumC8453zv0("WHEN_GET_LOCAL_VARIABLE", 19), new EnumC8453zv0("WHEN_FIND_BY_FQNAME", 20), new EnumC8453zv0("WHEN_GET_COMPANION_OBJECT", 21), new EnumC8453zv0("FOR_DEFAULT_IMPORTS", 22)};
        i = enumC8453zv0Arr;
        F02.c(enumC8453zv0Arr);
    }

    public static EnumC8453zv0 valueOf(String str) {
        return (EnumC8453zv0) Enum.valueOf(EnumC8453zv0.class, str);
    }

    public static EnumC8453zv0[] values() {
        return (EnumC8453zv0[]) i.clone();
    }
}
