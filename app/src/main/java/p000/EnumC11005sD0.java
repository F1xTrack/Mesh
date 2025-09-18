package p000;

import java.util.Set;

/* renamed from: sD0 */
/* loaded from: classes2.dex */
public final class EnumC11005sD0 extends Enum {

    /* renamed from: e */
    public static final Set f42304e;

    /* renamed from: f */
    public static final EnumC11005sD0 f42305f;

    /* renamed from: g */
    public static final EnumC11005sD0 f42306g;

    /* renamed from: h */
    public static final EnumC11005sD0 f42307h;

    /* renamed from: i */
    public static final EnumC11005sD0 f42308i;

    /* renamed from: j */
    public static final EnumC11005sD0 f42309j;

    /* renamed from: k */
    public static final EnumC11005sD0 f42310k;

    /* renamed from: l */
    public static final EnumC11005sD0 f42311l;

    /* renamed from: m */
    public static final EnumC11005sD0 f42312m;

    /* renamed from: n */
    public static final /* synthetic */ EnumC11005sD0[] f42313n;

    /* renamed from: a */
    public final C8340Tt0 f42314a;

    /* renamed from: b */
    public final C8340Tt0 f42315b;

    /* renamed from: c */
    public final Object f42316c;

    /* renamed from: d */
    public final Object f42317d;

    static {
        EnumC11005sD0 enumC11005sD0 = new EnumC11005sD0("BOOLEAN", 0, "Boolean");
        f42305f = enumC11005sD0;
        EnumC11005sD0 enumC11005sD02 = new EnumC11005sD0("CHAR", 1, "Char");
        f42306g = enumC11005sD02;
        EnumC11005sD0 enumC11005sD03 = new EnumC11005sD0("BYTE", 2, "Byte");
        f42307h = enumC11005sD03;
        EnumC11005sD0 enumC11005sD04 = new EnumC11005sD0("SHORT", 3, "Short");
        f42308i = enumC11005sD04;
        EnumC11005sD0 enumC11005sD05 = new EnumC11005sD0("INT", 4, "Int");
        f42309j = enumC11005sD05;
        EnumC11005sD0 enumC11005sD06 = new EnumC11005sD0("FLOAT", 5, "Float");
        f42310k = enumC11005sD06;
        EnumC11005sD0 enumC11005sD07 = new EnumC11005sD0("LONG", 6, "Long");
        f42311l = enumC11005sD07;
        EnumC11005sD0 enumC11005sD08 = new EnumC11005sD0("DOUBLE", 7, "Double");
        f42312m = enumC11005sD08;
        EnumC11005sD0[] enumC11005sD0Arr = {enumC11005sD0, enumC11005sD02, enumC11005sD03, enumC11005sD04, enumC11005sD05, enumC11005sD06, enumC11005sD07, enumC11005sD08};
        f42313n = enumC11005sD0Arr;
        F02.m2482c(enumC11005sD0Arr);
        f42304e = AbstractC0576J8.m4175F(new EnumC11005sD0[]{enumC11005sD02, enumC11005sD03, enumC11005sD04, enumC11005sD05, enumC11005sD06, enumC11005sD07, enumC11005sD08});
    }

    public EnumC11005sD0(String str, int i, String str2) {
        super(str, i);
        this.f42314a = C8340Tt0.m7798e(str2);
        this.f42315b = C8340Tt0.m7798e(str2.concat("Array"));
        EnumC9659hi0 enumC9659hi0 = EnumC9659hi0.f28538b;
        this.f42316c = AbstractC0705LB.m4916c(enumC9659hi0, new C10877rD0(this, 1));
        this.f42317d = AbstractC0705LB.m4916c(enumC9659hi0, new C10877rD0(this, 0));
    }

    public static EnumC11005sD0 valueOf(String str) {
        return (EnumC11005sD0) Enum.valueOf(EnumC11005sD0.class, str);
    }

    public static EnumC11005sD0[] values() {
        return (EnumC11005sD0[]) f42313n.clone();
    }
}
