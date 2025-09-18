package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.opengl.GLES20;
import android.util.Range;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: bc1 */
/* loaded from: classes.dex */
public final class C2359bc1 implements InterfaceC6777r61, InterfaceC6307oe1, InterfaceC5521kX0 {
    public int a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public C2359bc1(C6045nH c6045nH, ED ed, InterfaceC0180Cb0 interfaceC0180Cb0, int i) {
        O90.f(c6045nH, "c");
        O90.f(interfaceC0180Cb0, "typeParameterOwner");
        this.b = c6045nH;
        this.c = ed;
        this.a = i;
        ArrayList typeParameters = interfaceC0180Cb0.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.d = linkedHashMap;
        this.e = ((C1922Yk0) ((C4375ib0) ((C6045nH) this.b).b).a).c(new C8277z(25, this));
    }

    public static void a(int i, int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        F12.c(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        F12.b();
    }

    public static void c(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = O90.h(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0138  */
    @Override // defpackage.InterfaceC5521kX0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(defpackage.C4103hA0 r36) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2359bc1.b(hA0):void");
    }

    public String d(String str) {
        HashMap map = (HashMap) this.c;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = ((ArrayList) this.d).iterator();
            while (it.hasNext()) {
                InterfaceC6907ro interfaceC6907roG = ((InterfaceC6907ro) it.next()).g();
                AbstractC3377dM1.d("CameraInfo doesn't contain Camera2 implementation.", interfaceC6907roG instanceof C0368Em);
                if (str2.equals(((C0368Em) ((C0368Em) interfaceC6907roG).c.b).a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public boolean f(C2359bc1 c2359bc1, int i) {
        return c2359bc1 != null && AbstractC0277Dh1.a(((ZQ0[]) this.b)[i], ((ZQ0[]) c2359bc1.b)[i]) && AbstractC0277Dh1.a(((InterfaceC5311jR[]) this.c)[i], ((InterfaceC5311jR[]) c2359bc1.c)[i]);
    }

    public boolean g(int i) {
        return ((ZQ0[]) this.b)[i] != null;
    }

    @Override // defpackage.InterfaceC6777r61, javax.inject.Provider
    public Object get() {
        AbstractC0759Jm0.f("AudioEncAdPrflRslvr");
        Range range = ((C7253tc) this.c).a;
        C8018xd c8018xd = (C8018xd) this.e;
        int i = c8018xd.c;
        C7062sc c7062sc = (C7062sc) this.d;
        int iB = AbstractC3573eO1.b(i, c7062sc.c, c8018xd.e, c7062sc.b, c8018xd.d, range);
        U41 u41 = new U41();
        u41.b = -1;
        u41.a = (String) this.b;
        u41.b = Integer.valueOf(this.a);
        u41.c = EnumC8011xa1.a;
        u41.f = Integer.valueOf(c7062sc.c);
        u41.e = Integer.valueOf(c7062sc.b);
        u41.d = Integer.valueOf(iB);
        return u41.o();
    }

    public void h(XY xy) {
    }

    public void i(XY xy) throws SQLException {
        Cursor cursorS = xy.S("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorS.moveToFirst()) {
                if (cursorS.getInt(0) == 0) {
                    z = true;
                }
            }
            AbstractC2141aT1.a(cursorS, null);
            F9 f9 = (F9) this.c;
            f9.b(xy);
            if (!z) {
                C1135Oi c1135OiR = f9.r(xy);
                if (!c1135OiR.b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) c1135OiR.c));
                }
            }
            m(xy);
            f9.o(xy);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(defpackage.XY r6) throws android.database.SQLException {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.S(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L15:
            r6 = move-exception
            goto L91
        L18:
            r1 = r2
        L19:
            r3 = 0
            defpackage.AbstractC2141aT1.a(r0, r3)
            java.lang.Object r0 = r5.c
            F9 r0 = (defpackage.F9) r0
            if (r1 == 0) goto L68
            jC r1 = new jC
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r6.J(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L3b
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L39
            goto L3c
        L39:
            r6 = move-exception
            goto L62
        L3b:
            r2 = r3
        L3c:
            defpackage.AbstractC2141aT1.a(r1, r3)
            java.lang.Object r1 = r5.d
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L73
            java.lang.Object r4 = r5.e
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L54
            goto L73
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r3 = ", found: "
            java.lang.String r0 = defpackage.AbstractC1705Vq.i(r0, r1, r3, r2)
            r6.<init>(r0)
            throw r6
        L62:
            throw r6     // Catch: java.lang.Throwable -> L63
        L63:
            r0 = move-exception
            defpackage.AbstractC2141aT1.a(r1, r6)
            throw r0
        L68:
            Oi r1 = r0.r(r6)
            boolean r2 = r1.b
            if (r2 == 0) goto L79
            r5.m(r6)
        L73:
            r0.p(r6)
            r5.b = r3
            return
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.Object r1 = r1.c
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L91:
            throw r6     // Catch: java.lang.Throwable -> L92
        L92:
            r1 = move-exception
            defpackage.AbstractC2141aT1.a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2359bc1.j(XY):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0041 A[EDGE_INSN: B:160:0x0041->B:107:0x0041 BREAK  A[LOOP:1: B:101:0x0029->B:164:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(defpackage.XY r17, int r18, int r19) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2359bc1.k(XY, int, int):void");
    }

    @Override // defpackage.InterfaceC6307oe1
    public InterfaceC5925me1 l(C7406uP0 c7406uP0) {
        O90.f(c7406uP0, "javaTypeParameter");
        C1601Uh0 c1601Uh0 = (C1601Uh0) ((C1766Wk0) this.e).invoke(c7406uP0);
        return c1601Uh0 != null ? c1601Uh0 : ((InterfaceC6307oe1) ((C6045nH) this.b).c).l(c7406uP0);
    }

    public void m(XY xy) throws SQLException {
        xy.w("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        xy.w("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.d) + "')");
    }

    public C2359bc1(C5651lD c5651lD, F9 f9, String str, String str2) {
        this.a = f9.b;
        this.b = c5651lD;
        this.c = f9;
        this.d = str;
        this.e = str2;
    }

    public C2359bc1(C8051xo c8051xo) {
        this.a = 0;
        this.c = new HashMap();
        this.e = new HashSet();
        this.b = new ArrayList();
        this.d = new ArrayList();
        Set hashSet = new HashSet();
        try {
            hashSet = c8051xo.a.T0();
        } catch (C5950mn unused) {
            AbstractC0759Jm0.f("Camera2CameraCoordinator");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (AbstractC2135aR1.b(c8051xo, str) && AbstractC2135aR1.b(c8051xo, str2)) {
                        ((HashSet) this.e).add(new HashSet(Arrays.asList(str, str2)));
                        HashMap map = (HashMap) this.c;
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        ((List) map.get(str)).add((String) arrayList.get(1));
                        ((List) map.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (C6592q80 unused2) {
                    AbstractC0759Jm0.f("Camera2CameraCoordinator");
                }
            }
        }
    }

    public C2359bc1(String str, int i, C7253tc c7253tc, C7062sc c7062sc, C8018xd c8018xd) {
        this.b = str;
        this.a = i;
        this.c = c7253tc;
        this.d = c7062sc;
        this.e = c8018xd;
    }

    public C2359bc1() {
        byte[] bArr;
        byte[] bArr2;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.a = iGlCreateProgram;
        F12.b();
        a(iGlCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        a(iGlCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(iGlCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int i2 = 1;
        F12.c("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.b = new C7304tt[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.a;
            int[] iArr3 = new int[i2];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i5 = iArr3[0];
            byte[] bArr3 = new byte[i5];
            GLES20.glGetActiveAttrib(i4, i3, i5, new int[i2], 0, new int[i2], 0, new int[i2], 0, bArr3, 0);
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    bArr2 = bArr3;
                    i6 = i5;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i6] == 0) {
                        break;
                    }
                    i6++;
                    bArr3 = bArr2;
                }
            }
            String str = new String(bArr2, 0, i6);
            GLES20.glGetAttribLocation(i4, str);
            C7304tt c7304tt = new C7304tt(15);
            ((C7304tt[]) this.b)[i3] = c7304tt;
            ((HashMap) this.d).put(str, c7304tt);
            i3++;
            i2 = 1;
        }
        this.e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr4, 0);
        this.c = new TE[iArr4[0]];
        for (int i7 = 0; i7 < iArr4[i]; i7++) {
            int i8 = this.a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i8, 35719, iArr5, i);
            int i9 = iArr5[i];
            byte[] bArr4 = new byte[i9];
            GLES20.glGetActiveUniform(i8, i7, i9, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    bArr = bArr4;
                    i10 = i9;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i10] == 0) {
                        break;
                    }
                    i10++;
                    bArr4 = bArr;
                }
            }
            i = 0;
            String str2 = new String(bArr, 0, i10);
            GLES20.glGetUniformLocation(i8, str2);
            TE te = new TE(15);
            ((TE[]) this.c)[i7] = te;
            ((HashMap) this.e).put(str2, te);
        }
        F12.b();
    }

    public C2359bc1(ZQ0[] zq0Arr, InterfaceC5311jR[] interfaceC5311jRArr, C3615ec1 c3615ec1, C4271i3 c4271i3) {
        YN1.c(zq0Arr.length == interfaceC5311jRArr.length);
        this.b = zq0Arr;
        this.c = (InterfaceC5311jR[]) interfaceC5311jRArr.clone();
        this.d = c3615ec1;
        this.e = c4271i3;
        this.a = zq0Arr.length;
    }

    @Override // defpackage.InterfaceC5521kX0
    public void e(C0724Ja1 c0724Ja1, YR yr, YM0 ym0) {
    }

    public C2359bc1(C1258Px c1258Px, C7409uQ0 c7409uQ0, byte[] bArr, FC[] fcArr, int i) {
        this.b = c1258Px;
        this.c = c7409uQ0;
        this.d = bArr;
        this.e = fcArr;
        this.a = i;
    }

    public C2359bc1(C4382id1 c4382id1, int i) {
        this.e = c4382id1;
        this.b = new C0848Kq(new byte[5], 5);
        this.c = new SparseArray();
        this.d = new SparseIntArray();
        this.a = i;
    }
}
