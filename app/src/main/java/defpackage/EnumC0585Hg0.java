package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Hg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0585Hg0 {
    public static final EnumC0585Hg0 A;
    public static final EnumC0585Hg0 B;
    public static final EnumC0585Hg0 C;
    public static final EnumC0585Hg0 D;
    public static final EnumC0585Hg0 E;
    public static final EnumC0585Hg0 F;
    public static final EnumC0585Hg0 G;
    public static final EnumC0585Hg0 H;
    public static final EnumC0585Hg0 I;
    public static final /* synthetic */ EnumC0585Hg0[] J;
    public static final HashMap b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final List j;
    public static final List k;
    public static final List l;
    public static final List m;
    public static final List n;
    public static final EnumC0585Hg0 o;
    public static final EnumC0585Hg0 p;
    public static final EnumC0585Hg0 q;
    public static final EnumC0585Hg0 r;
    public static final EnumC0585Hg0 s;
    public static final EnumC0585Hg0 t;
    public static final EnumC0585Hg0 u;
    public static final EnumC0585Hg0 v;
    public static final EnumC0585Hg0 w;
    public static final EnumC0585Hg0 x;
    public static final EnumC0585Hg0 y;
    public static final EnumC0585Hg0 z;
    public final boolean a;

    static {
        EnumC0585Hg0 enumC0585Hg0 = new EnumC0585Hg0("CLASS", 0, true);
        o = enumC0585Hg0;
        EnumC0585Hg0 enumC0585Hg02 = new EnumC0585Hg0("ANNOTATION_CLASS", 1, true);
        p = enumC0585Hg02;
        EnumC0585Hg0 enumC0585Hg03 = new EnumC0585Hg0("TYPE_PARAMETER", 2, false);
        q = enumC0585Hg03;
        EnumC0585Hg0 enumC0585Hg04 = new EnumC0585Hg0("PROPERTY", 3, true);
        r = enumC0585Hg04;
        EnumC0585Hg0 enumC0585Hg05 = new EnumC0585Hg0("FIELD", 4, true);
        s = enumC0585Hg05;
        EnumC0585Hg0 enumC0585Hg06 = new EnumC0585Hg0("LOCAL_VARIABLE", 5, true);
        t = enumC0585Hg06;
        EnumC0585Hg0 enumC0585Hg07 = new EnumC0585Hg0("VALUE_PARAMETER", 6, true);
        u = enumC0585Hg07;
        EnumC0585Hg0 enumC0585Hg08 = new EnumC0585Hg0("CONSTRUCTOR", 7, true);
        v = enumC0585Hg08;
        EnumC0585Hg0 enumC0585Hg09 = new EnumC0585Hg0("FUNCTION", 8, true);
        w = enumC0585Hg09;
        EnumC0585Hg0 enumC0585Hg010 = new EnumC0585Hg0("PROPERTY_GETTER", 9, true);
        x = enumC0585Hg010;
        EnumC0585Hg0 enumC0585Hg011 = new EnumC0585Hg0("PROPERTY_SETTER", 10, true);
        y = enumC0585Hg011;
        EnumC0585Hg0 enumC0585Hg012 = new EnumC0585Hg0("TYPE", 11, false);
        z = enumC0585Hg012;
        EnumC0585Hg0 enumC0585Hg013 = new EnumC0585Hg0("EXPRESSION", 12, false);
        EnumC0585Hg0 enumC0585Hg014 = new EnumC0585Hg0("FILE", 13, false);
        A = enumC0585Hg014;
        EnumC0585Hg0 enumC0585Hg015 = new EnumC0585Hg0("TYPEALIAS", 14, false);
        EnumC0585Hg0 enumC0585Hg016 = new EnumC0585Hg0("TYPE_PROJECTION", 15, false);
        EnumC0585Hg0 enumC0585Hg017 = new EnumC0585Hg0("STAR_PROJECTION", 16, false);
        EnumC0585Hg0 enumC0585Hg018 = new EnumC0585Hg0("PROPERTY_PARAMETER", 17, false);
        EnumC0585Hg0 enumC0585Hg019 = new EnumC0585Hg0("CLASS_ONLY", 18, false);
        B = enumC0585Hg019;
        EnumC0585Hg0 enumC0585Hg020 = new EnumC0585Hg0("OBJECT", 19, false);
        C = enumC0585Hg020;
        EnumC0585Hg0 enumC0585Hg021 = new EnumC0585Hg0("STANDALONE_OBJECT", 20, false);
        D = enumC0585Hg021;
        EnumC0585Hg0 enumC0585Hg022 = new EnumC0585Hg0("COMPANION_OBJECT", 21, false);
        E = enumC0585Hg022;
        EnumC0585Hg0 enumC0585Hg023 = new EnumC0585Hg0("INTERFACE", 22, false);
        F = enumC0585Hg023;
        EnumC0585Hg0 enumC0585Hg024 = new EnumC0585Hg0("ENUM_CLASS", 23, false);
        G = enumC0585Hg024;
        EnumC0585Hg0 enumC0585Hg025 = new EnumC0585Hg0("ENUM_ENTRY", 24, false);
        H = enumC0585Hg025;
        EnumC0585Hg0 enumC0585Hg026 = new EnumC0585Hg0("LOCAL_CLASS", 25, false);
        I = enumC0585Hg026;
        EnumC0585Hg0[] enumC0585Hg0Arr = {enumC0585Hg0, enumC0585Hg02, enumC0585Hg03, enumC0585Hg04, enumC0585Hg05, enumC0585Hg06, enumC0585Hg07, enumC0585Hg08, enumC0585Hg09, enumC0585Hg010, enumC0585Hg011, enumC0585Hg012, enumC0585Hg013, enumC0585Hg014, enumC0585Hg015, enumC0585Hg016, enumC0585Hg017, enumC0585Hg018, enumC0585Hg019, enumC0585Hg020, enumC0585Hg021, enumC0585Hg022, enumC0585Hg023, enumC0585Hg024, enumC0585Hg025, enumC0585Hg026, new EnumC0585Hg0("LOCAL_FUNCTION", 26, false), new EnumC0585Hg0("MEMBER_FUNCTION", 27, false), new EnumC0585Hg0("TOP_LEVEL_FUNCTION", 28, false), new EnumC0585Hg0("MEMBER_PROPERTY", 29, false), new EnumC0585Hg0("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, false), new EnumC0585Hg0("MEMBER_PROPERTY_WITH_DELEGATE", 31, false), new EnumC0585Hg0("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, false), new EnumC0585Hg0("TOP_LEVEL_PROPERTY", 33, false), new EnumC0585Hg0("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, false), new EnumC0585Hg0("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, false), new EnumC0585Hg0("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, false), new EnumC0585Hg0("BACKING_FIELD", 37, true), new EnumC0585Hg0("INITIALIZER", 38, false), new EnumC0585Hg0("DESTRUCTURING_DECLARATION", 39, false), new EnumC0585Hg0("LAMBDA_EXPRESSION", 40, false), new EnumC0585Hg0("ANONYMOUS_FUNCTION", 41, false), new EnumC0585Hg0("OBJECT_LITERAL", 42, false)};
        J = enumC0585Hg0Arr;
        F02.c(enumC0585Hg0Arr);
        b = new HashMap();
        for (EnumC0585Hg0 enumC0585Hg027 : values()) {
            b.put(enumC0585Hg027.name(), enumC0585Hg027);
        }
        EnumC0585Hg0[] enumC0585Hg0ArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC0585Hg0 enumC0585Hg028 : enumC0585Hg0ArrValues) {
            if (enumC0585Hg028.a) {
                arrayList.add(enumC0585Hg028);
            }
        }
        AbstractC8069xu.g0(arrayList);
        J8.F(values());
        EnumC0585Hg0 enumC0585Hg029 = o;
        c = AbstractC8259yu.f(p, enumC0585Hg029);
        d = AbstractC8259yu.f(I, enumC0585Hg029);
        e = AbstractC8259yu.f(B, enumC0585Hg029);
        EnumC0585Hg0 enumC0585Hg030 = C;
        f = AbstractC8259yu.f(E, enumC0585Hg030, enumC0585Hg029);
        g = AbstractC8259yu.f(D, enumC0585Hg030, enumC0585Hg029);
        h = AbstractC8259yu.f(F, enumC0585Hg029);
        i = AbstractC8259yu.f(G, enumC0585Hg029);
        EnumC0585Hg0 enumC0585Hg031 = r;
        EnumC0585Hg0 enumC0585Hg032 = s;
        j = AbstractC8259yu.f(H, enumC0585Hg031, enumC0585Hg032);
        EnumC0585Hg0 enumC0585Hg033 = y;
        k = AbstractC8259yu.e(enumC0585Hg033);
        EnumC0585Hg0 enumC0585Hg034 = x;
        l = AbstractC8259yu.e(enumC0585Hg034);
        m = AbstractC8259yu.e(w);
        EnumC0585Hg0 enumC0585Hg035 = A;
        n = AbstractC8259yu.e(enumC0585Hg035);
        E5 e5 = E5.h;
        EnumC0585Hg0 enumC0585Hg036 = u;
        AbstractC7096sn0.h(new Pair(e5, enumC0585Hg036), new Pair(E5.b, enumC0585Hg032), new Pair(E5.d, enumC0585Hg031), new Pair(E5.c, enumC0585Hg035), new Pair(E5.e, enumC0585Hg034), new Pair(E5.f, enumC0585Hg033), new Pair(E5.g, enumC0585Hg036), new Pair(E5.i, enumC0585Hg036), new Pair(E5.j, enumC0585Hg032));
    }

    public EnumC0585Hg0(String str, int i2, boolean z2) {
        this.a = z2;
    }

    public static EnumC0585Hg0 valueOf(String str) {
        return (EnumC0585Hg0) Enum.valueOf(EnumC0585Hg0.class, str);
    }

    public static EnumC0585Hg0[] values() {
        return (EnumC0585Hg0[]) J.clone();
    }
}
