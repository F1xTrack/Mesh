package p000;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: sd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC11057sd0 {
    BOOLEAN(EnumC11005sD0.f42305f, "boolean", "Z", "java.lang.Boolean"),
    CHAR(EnumC11005sD0.f42306g, "char", "C", "java.lang.Character"),
    BYTE(EnumC11005sD0.f42307h, "byte", "B", "java.lang.Byte"),
    SHORT(EnumC11005sD0.f42308i, "short", "S", "java.lang.Short"),
    INT(EnumC11005sD0.f42309j, "int", "I", "java.lang.Integer"),
    FLOAT(EnumC11005sD0.f42310k, "float", "F", "java.lang.Float"),
    LONG(EnumC11005sD0.f42311l, "long", "J", "java.lang.Long"),
    DOUBLE(EnumC11005sD0.f42312m, "double", "D", "java.lang.Double");


    /* renamed from: m */
    public static final HashSet f42525m = new HashSet();

    /* renamed from: n */
    public static final HashMap f42526n = new HashMap();

    /* renamed from: o */
    public static final EnumMap f42527o = new EnumMap(EnumC11005sD0.class);

    /* renamed from: p */
    public static final HashMap f42528p = new HashMap();

    /* renamed from: a */
    public final EnumC11005sD0 f42530a;

    /* renamed from: b */
    public final String f42531b;

    /* renamed from: c */
    public final String f42532c;

    /* renamed from: d */
    public final C0664KX f42533d;

    static {
        for (EnumC11057sd0 enumC11057sd0 : values()) {
            f42525m.add(enumC11057sd0.m24760e());
            f42526n.put(enumC11057sd0.f42531b, enumC11057sd0);
            f42527o.put((EnumMap) enumC11057sd0.m24759d(), (EnumC11005sD0) enumC11057sd0);
            f42528p.put(enumC11057sd0.m24758c(), enumC11057sd0);
        }
    }

    EnumC11057sd0(EnumC11005sD0 enumC11005sD0, String str, String str2, String str3) {
        if (enumC11005sD0 == null) {
            m24756a(6);
            throw null;
        }
        this.f42530a = enumC11005sD0;
        this.f42531b = str;
        this.f42532c = str2;
        this.f42533d = new C0664KX(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m24756a(int r7) {
        /*
            r0 = 4
            r1 = 2
            if (r7 == r1) goto Lc
            if (r7 == r0) goto Lc
            switch(r7) {
                case 10: goto Lc;
                case 11: goto Lc;
                case 12: goto Lc;
                case 13: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            if (r7 == r1) goto L17
            if (r7 == r0) goto L17
            switch(r7) {
                case 10: goto L17;
                case 11: goto L17;
                case 12: goto L17;
                case 13: goto L17;
                default: goto L15;
            }
        L15:
            r3 = 3
            goto L18
        L17:
            r3 = r1
        L18:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"
            r5 = 0
            switch(r7) {
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L34;
                case 4: goto L39;
                case 5: goto L2f;
                case 6: goto L2a;
                case 7: goto L3c;
                case 8: goto L2f;
                case 9: goto L25;
                case 10: goto L39;
                case 11: goto L39;
                case 12: goto L39;
                case 13: goto L39;
                default: goto L20;
            }
        L20:
            java.lang.String r6 = "className"
            r3[r5] = r6
            goto L40
        L25:
            java.lang.String r6 = "wrapperClassName"
            r3[r5] = r6
            goto L40
        L2a:
            java.lang.String r6 = "primitiveType"
            r3[r5] = r6
            goto L40
        L2f:
            java.lang.String r6 = "desc"
            r3[r5] = r6
            goto L40
        L34:
            java.lang.String r6 = "type"
            r3[r5] = r6
            goto L40
        L39:
            r3[r5] = r4
            goto L40
        L3c:
            java.lang.String r6 = "name"
            r3[r5] = r6
        L40:
            java.lang.String r5 = "get"
            r6 = 1
            if (r7 == r1) goto L61
            if (r7 == r0) goto L61
            switch(r7) {
                case 10: goto L5c;
                case 11: goto L57;
                case 12: goto L52;
                case 13: goto L4d;
                default: goto L4a;
            }
        L4a:
            r3[r6] = r4
            goto L63
        L4d:
            java.lang.String r4 = "getWrapperFqName"
            r3[r6] = r4
            goto L63
        L52:
            java.lang.String r4 = "getDesc"
            r3[r6] = r4
            goto L63
        L57:
            java.lang.String r4 = "getJavaKeywordName"
            r3[r6] = r4
            goto L63
        L5c:
            java.lang.String r4 = "getPrimitiveType"
            r3[r6] = r4
            goto L63
        L61:
            r3[r6] = r5
        L63:
            switch(r7) {
                case 1: goto L75;
                case 2: goto L77;
                case 3: goto L75;
                case 4: goto L77;
                case 5: goto L70;
                case 6: goto L6b;
                case 7: goto L6b;
                case 8: goto L6b;
                case 9: goto L6b;
                case 10: goto L77;
                case 11: goto L77;
                case 12: goto L77;
                case 13: goto L77;
                default: goto L66;
            }
        L66:
            java.lang.String r4 = "isWrapperClassName"
            r3[r1] = r4
            goto L77
        L6b:
            java.lang.String r4 = "<init>"
            r3[r1] = r4
            goto L77
        L70:
            java.lang.String r4 = "getByDesc"
            r3[r1] = r4
            goto L77
        L75:
            r3[r1] = r5
        L77:
            java.lang.String r2 = java.lang.String.format(r2, r3)
            if (r7 == r1) goto L88
            if (r7 == r0) goto L88
            switch(r7) {
                case 10: goto L88;
                case 11: goto L88;
                case 12: goto L88;
                case 13: goto L88;
                default: goto L82;
            }
        L82:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r2)
            goto L8d
        L88:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
        L8d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.EnumC11057sd0.m24756a(int):void");
    }

    /* renamed from: b */
    public static EnumC11057sd0 m24757b(String str) {
        EnumC11057sd0 enumC11057sd0 = (EnumC11057sd0) f42526n.get(str);
        if (enumC11057sd0 != null) {
            return enumC11057sd0;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    /* renamed from: c */
    public final String m24758c() {
        String str = this.f42532c;
        if (str != null) {
            return str;
        }
        m24756a(12);
        throw null;
    }

    /* renamed from: d */
    public final EnumC11005sD0 m24759d() {
        EnumC11005sD0 enumC11005sD0 = this.f42530a;
        if (enumC11005sD0 != null) {
            return enumC11005sD0;
        }
        m24756a(10);
        throw null;
    }

    /* renamed from: e */
    public final C0664KX m24760e() {
        C0664KX c0664kx = this.f42533d;
        if (c0664kx != null) {
            return c0664kx;
        }
        m24756a(13);
        throw null;
    }
}
