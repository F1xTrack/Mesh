package defpackage;

/* renamed from: As, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0074As {
    public final KX a;
    public final KX b;
    public final boolean c;

    public C0074As(KX kx, KX kx2, boolean z) {
        if (kx == null) {
            a(1);
            throw null;
        }
        this.a = kx;
        this.b = kx2;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r10) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0074As.a(int):void");
    }

    public static C0074As e(String str, boolean z) {
        String str2;
        if (str == null) {
            a(12);
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
        return new C0074As(new KX(str2), new KX(str), z);
    }

    public static C0074As j(KX kx) {
        if (kx != null) {
            return new C0074As(kx.e(), kx.f());
        }
        a(0);
        throw null;
    }

    public final KX b() {
        KX kx = this.a;
        boolean zD = kx.d();
        KX kx2 = this.b;
        if (zD) {
            if (kx2 != null) {
                return kx2;
            }
            a(9);
            throw null;
        }
        return new KX(kx.b() + "." + kx2.b());
    }

    public final String c() {
        KX kx = this.a;
        boolean zD = kx.d();
        KX kx2 = this.b;
        if (zD) {
            return kx2.b();
        }
        String str = kx.b().replace('.', '/') + "/" + kx2.b();
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final C0074As d(C1559Tt0 c1559Tt0) {
        if (c1559Tt0 != null) {
            return new C0074As(g(), this.b.c(c1559Tt0), this.c);
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0074As.class != obj.getClass()) {
            return false;
        }
        C0074As c0074As = (C0074As) obj;
        return this.a.equals(c0074As.a) && this.b.equals(c0074As.b) && this.c == c0074As.c;
    }

    public final C0074As f() {
        KX kxE = this.b.e();
        if (kxE.d()) {
            return null;
        }
        return new C0074As(g(), kxE, this.c);
    }

    public final KX g() {
        KX kx = this.a;
        if (kx != null) {
            return kx;
        }
        a(5);
        throw null;
    }

    public final KX h() {
        KX kx = this.b;
        if (kx != null) {
            return kx;
        }
        a(6);
        throw null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.c).hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final C1559Tt0 i() {
        C1559Tt0 c1559Tt0F = this.b.f();
        if (c1559Tt0F != null) {
            return c1559Tt0F;
        }
        a(7);
        throw null;
    }

    public final String toString() {
        return this.a.d() ? "/".concat(c()) : c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0074As(KX kx, C1559Tt0 c1559Tt0) {
        this(kx, KX.j(c1559Tt0), false);
        if (kx == null) {
            a(3);
            throw null;
        }
        if (c1559Tt0 != null) {
        } else {
            a(4);
            throw null;
        }
    }
}
