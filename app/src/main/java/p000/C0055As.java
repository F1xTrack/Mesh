package p000;

/* renamed from: As */
/* loaded from: classes2.dex */
public final class C0055As {

    /* renamed from: a */
    public final C0664KX f451a;

    /* renamed from: b */
    public final C0664KX f452b;

    /* renamed from: c */
    public final boolean f453c;

    public C0055As(C0664KX c0664kx, C0664KX c0664kx2, boolean z) {
        if (c0664kx == null) {
            m356a(1);
            throw null;
        }
        this.f451a = c0664kx;
        this.f452b = c0664kx2;
        this.f453c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m356a(int r10) {
        /*
            r0 = 9
            r1 = 7
            r2 = 6
            r3 = 5
            if (r10 == r3) goto L13
            if (r10 == r2) goto L13
            if (r10 == r1) goto L13
            if (r10 == r0) goto L13
            switch(r10) {
                case 13: goto L13;
                case 14: goto L13;
                case 15: goto L13;
                case 16: goto L13;
                default: goto L10;
            }
        L10:
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L15
        L13:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L15:
            r5 = 2
            if (r10 == r3) goto L23
            if (r10 == r2) goto L23
            if (r10 == r1) goto L23
            if (r10 == r0) goto L23
            switch(r10) {
                case 13: goto L23;
                case 14: goto L23;
                case 15: goto L23;
                case 16: goto L23;
                default: goto L21;
            }
        L21:
            r6 = 3
            goto L24
        L23:
            r6 = r5
        L24:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/name/ClassId"
            r8 = 0
            switch(r10) {
                case 1: goto L4d;
                case 2: goto L48;
                case 3: goto L4d;
                case 4: goto L43;
                case 5: goto L40;
                case 6: goto L40;
                case 7: goto L40;
                case 8: goto L3b;
                case 9: goto L40;
                case 10: goto L36;
                case 11: goto L31;
                case 12: goto L31;
                case 13: goto L40;
                case 14: goto L40;
                case 15: goto L40;
                case 16: goto L40;
                default: goto L2c;
            }
        L2c:
            java.lang.String r9 = "topLevelFqName"
            r6[r8] = r9
            goto L51
        L31:
            java.lang.String r9 = "string"
            r6[r8] = r9
            goto L51
        L36:
            java.lang.String r9 = "segment"
            r6[r8] = r9
            goto L51
        L3b:
            java.lang.String r9 = "name"
            r6[r8] = r9
            goto L51
        L40:
            r6[r8] = r7
            goto L51
        L43:
            java.lang.String r9 = "topLevelName"
            r6[r8] = r9
            goto L51
        L48:
            java.lang.String r9 = "relativeClassName"
            r6[r8] = r9
            goto L51
        L4d:
            java.lang.String r9 = "packageFqName"
            r6[r8] = r9
        L51:
            r8 = 1
            if (r10 == r3) goto L79
            if (r10 == r2) goto L74
            if (r10 == r1) goto L6f
            if (r10 == r0) goto L6a
            switch(r10) {
                case 13: goto L65;
                case 14: goto L65;
                case 15: goto L60;
                case 16: goto L60;
                default: goto L5d;
            }
        L5d:
            r6[r8] = r7
            goto L7d
        L60:
            java.lang.String r7 = "asFqNameString"
            r6[r8] = r7
            goto L7d
        L65:
            java.lang.String r7 = "asString"
            r6[r8] = r7
            goto L7d
        L6a:
            java.lang.String r7 = "asSingleFqName"
            r6[r8] = r7
            goto L7d
        L6f:
            java.lang.String r7 = "getShortClassName"
            r6[r8] = r7
            goto L7d
        L74:
            java.lang.String r7 = "getRelativeClassName"
            r6[r8] = r7
            goto L7d
        L79:
            java.lang.String r7 = "getPackageFqName"
            r6[r8] = r7
        L7d:
            switch(r10) {
                case 1: goto L94;
                case 2: goto L94;
                case 3: goto L94;
                case 4: goto L94;
                case 5: goto L98;
                case 6: goto L98;
                case 7: goto L98;
                case 8: goto L8f;
                case 9: goto L98;
                case 10: goto L8a;
                case 11: goto L85;
                case 12: goto L85;
                case 13: goto L98;
                case 14: goto L98;
                case 15: goto L98;
                case 16: goto L98;
                default: goto L80;
            }
        L80:
            java.lang.String r7 = "topLevel"
            r6[r5] = r7
            goto L98
        L85:
            java.lang.String r7 = "fromString"
            r6[r5] = r7
            goto L98
        L8a:
            java.lang.String r7 = "startsWith"
            r6[r5] = r7
            goto L98
        L8f:
            java.lang.String r7 = "createNestedClassId"
            r6[r5] = r7
            goto L98
        L94:
            java.lang.String r7 = "<init>"
            r6[r5] = r7
        L98:
            java.lang.String r4 = java.lang.String.format(r4, r6)
            if (r10 == r3) goto Lad
            if (r10 == r2) goto Lad
            if (r10 == r1) goto Lad
            if (r10 == r0) goto Lad
            switch(r10) {
                case 13: goto Lad;
                case 14: goto Lad;
                case 15: goto Lad;
                case 16: goto Lad;
                default: goto La7;
            }
        La7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r4)
            goto Lb2
        Lad:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
        Lb2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0055As.m356a(int):void");
    }

    /* renamed from: e */
    public static C0055As m357e(String str, boolean z) {
        String str2;
        if (str == null) {
            m356a(12);
            throw null;
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strReplace = str.substring(0, iLastIndexOf).replace('/', '.');
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new C0055As(new C0664KX(str2), new C0664KX(str), z);
    }

    /* renamed from: j */
    public static C0055As m358j(C0664KX c0664kx) {
        if (c0664kx != null) {
            return new C0055As(c0664kx.m4657e(), c0664kx.m4658f());
        }
        m356a(0);
        throw null;
    }

    /* renamed from: b */
    public final C0664KX m359b() {
        C0664KX c0664kx = this.f451a;
        boolean zM4656d = c0664kx.m4656d();
        C0664KX c0664kx2 = this.f452b;
        if (zM4656d) {
            if (c0664kx2 != null) {
                return c0664kx2;
            }
            m356a(9);
            throw null;
        }
        return new C0664KX(c0664kx.m4654b() + "." + c0664kx2.m4654b());
    }

    /* renamed from: c */
    public final String m360c() {
        C0664KX c0664kx = this.f451a;
        boolean zM4656d = c0664kx.m4656d();
        C0664KX c0664kx2 = this.f452b;
        if (zM4656d) {
            return c0664kx2.m4654b();
        }
        String str = c0664kx.m4654b().replace('.', '/') + "/" + c0664kx2.m4654b();
        if (str != null) {
            return str;
        }
        m356a(14);
        throw null;
    }

    /* renamed from: d */
    public final C0055As m361d(C8340Tt0 c8340Tt0) {
        if (c8340Tt0 != null) {
            return new C0055As(m363g(), this.f452b.m4655c(c8340Tt0), this.f453c);
        }
        m356a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0055As.class != obj.getClass()) {
            return false;
        }
        C0055As c0055As = (C0055As) obj;
        return this.f451a.equals(c0055As.f451a) && this.f452b.equals(c0055As.f452b) && this.f453c == c0055As.f453c;
    }

    /* renamed from: f */
    public final C0055As m362f() {
        C0664KX c0664kxM4657e = this.f452b.m4657e();
        if (c0664kxM4657e.m4656d()) {
            return null;
        }
        return new C0055As(m363g(), c0664kxM4657e, this.f453c);
    }

    /* renamed from: g */
    public final C0664KX m363g() {
        C0664KX c0664kx = this.f451a;
        if (c0664kx != null) {
            return c0664kx;
        }
        m356a(5);
        throw null;
    }

    /* renamed from: h */
    public final C0664KX m364h() {
        C0664KX c0664kx = this.f452b;
        if (c0664kx != null) {
            return c0664kx;
        }
        m356a(6);
        throw null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f453c).hashCode() + ((this.f452b.hashCode() + (this.f451a.hashCode() * 31)) * 31);
    }

    /* renamed from: i */
    public final C8340Tt0 m365i() {
        C8340Tt0 c8340Tt0M4658f = this.f452b.m4658f();
        if (c8340Tt0M4658f != null) {
            return c8340Tt0M4658f;
        }
        m356a(7);
        throw null;
    }

    public final String toString() {
        return this.f451a.m4656d() ? "/".concat(m360c()) : m360c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0055As(C0664KX c0664kx, C8340Tt0 c8340Tt0) {
        this(c0664kx, C0664KX.m4653j(c8340Tt0), false);
        if (c0664kx == null) {
            m356a(3);
            throw null;
        }
        if (c8340Tt0 != null) {
        } else {
            m356a(4);
            throw null;
        }
    }
}
