package p000;

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
public final class C8875bc1 implements InterfaceC10864r61, InterfaceC10548oe1, InterfaceC10021kX0 {

    /* renamed from: a */
    public int f17088a;

    /* renamed from: b */
    public Object f17089b;

    /* renamed from: c */
    public final Object f17090c;

    /* renamed from: d */
    public final Object f17091d;

    /* renamed from: e */
    public final Object f17092e;

    public C8875bc1(C6479nH c6479nH, InterfaceC0266ED interfaceC0266ED, InterfaceC7420Cb0 interfaceC7420Cb0, int i) {
        O90.m5968f(c6479nH, "c");
        O90.m5968f(interfaceC7420Cb0, "typeParameterOwner");
        this.f17089b = c6479nH;
        this.f17090c = interfaceC0266ED;
        this.f17088a = i;
        ArrayList typeParameters = interfaceC7420Cb0.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.f17091d = linkedHashMap;
        this.f17092e = ((C8582Yk0) ((C9773ib0) ((C6479nH) this.f17089b).f38228b).f29338a).m9351c(new C7236z(25, this));
    }

    /* renamed from: a */
    public static void m10463a(int i, int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        F12.m2486c(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        F12.m2485b();
    }

    /* renamed from: c */
    public static void m10464c(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = O90.m5970h(str.charAt(!z ? i : length), 32) <= 0;
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
    @Override // p000.InterfaceC10021kX0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5439b(p000.C9591hA0 r36) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8875bc1.mo5439b(hA0):void");
    }

    /* renamed from: d */
    public String m10465d(String str) {
        HashMap map = (HashMap) this.f17090c;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = ((ArrayList) this.f17091d).iterator();
            while (it.hasNext()) {
                InterfaceC6766ro interfaceC6766roMo2395g = ((InterfaceC6766ro) it.next()).mo2395g();
                AbstractC9104dM1.m17545d("CameraInfo doesn't contain Camera2 implementation.", interfaceC6766roMo2395g instanceof C0301Em);
                if (str2.equals(((C0301Em) ((C0301Em) interfaceC6766roMo2395g).f2887c.f3531b).f2885a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public boolean m10466f(C8875bc1 c8875bc1, int i) {
        return c8875bc1 != null && AbstractC7485Dh1.m1812a(((ZQ0[]) this.f17089b)[i], ((ZQ0[]) c8875bc1.f17089b)[i]) && AbstractC7485Dh1.m1812a(((InterfaceC6237jR[]) this.f17090c)[i], ((InterfaceC6237jR[]) c8875bc1.f17090c)[i]);
    }

    /* renamed from: g */
    public boolean m10467g(int i) {
        return ((ZQ0[]) this.f17089b)[i] != null;
    }

    @Override // p000.InterfaceC10864r61, javax.inject.Provider
    public Object get() {
        AbstractC7806Jm0.m4412f("AudioEncAdPrflRslvr");
        Range range = ((C6897tc) this.f17090c).f43167a;
        C7150xd c7150xd = (C7150xd) this.f17092e;
        int i = c7150xd.f45714c;
        C6834sc c6834sc = (C6834sc) this.f17091d;
        int iM17923b = AbstractC9236eO1.m17923b(i, c6834sc.f42498c, c7150xd.f45716e, c6834sc.f42497b, c7150xd.f45715d, range);
        U41 u41 = new U41();
        u41.f11645b = -1;
        u41.f11644a = (String) this.f17089b;
        u41.f11645b = Integer.valueOf(this.f17088a);
        u41.f11646c = EnumC11690xa1.f45684a;
        u41.f11649f = Integer.valueOf(c6834sc.f42498c);
        u41.f11648e = Integer.valueOf(c6834sc.f42497b);
        u41.f11647d = Integer.valueOf(iM17923b);
        return u41.m7882o();
    }

    /* renamed from: h */
    public void m10468h(C1482XY c1482xy) {
    }

    /* renamed from: i */
    public void m10469i(C1482XY c1482xy) throws SQLException {
        Cursor cursorM9075S = c1482xy.m9075S("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorM9075S.moveToFirst()) {
                if (cursorM9075S.getInt(0) == 0) {
                    z = true;
                }
            }
            AbstractC8729aT1.m9749a(cursorM9075S, null);
            AbstractC0325F9 abstractC0325F9 = (AbstractC0325F9) this.f17090c;
            abstractC0325F9.mo2499b(c1482xy);
            if (!z) {
                C0926Oi c0926OiMo2510r = abstractC0325F9.mo2510r(c1482xy);
                if (!c0926OiMo2510r.f8575b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) c0926OiMo2510r.f8576c));
                }
            }
            m10473m(c1482xy);
            abstractC0325F9.mo2507o(c1482xy);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0018  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m10470j(p000.C1482XY r6) throws android.database.SQLException {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.m9075S(r0)
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
            p000.AbstractC8729aT1.m9749a(r0, r3)
            java.lang.Object r0 = r5.f17090c
            F9 r0 = (p000.AbstractC0325F9) r0
            if (r1 == 0) goto L68
            jC r1 = new jC
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r6.m9074J(r1)
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
            p000.AbstractC8729aT1.m9749a(r1, r3)
            java.lang.Object r1 = r5.f17091d
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L73
            java.lang.Object r4 = r5.f17092e
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L54
            goto L73
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r3 = ", found: "
            java.lang.String r0 = p000.AbstractC1374Vq.m8590i(r0, r1, r3, r2)
            r6.<init>(r0)
            throw r6
        L62:
            throw r6     // Catch: java.lang.Throwable -> L63
        L63:
            r0 = move-exception
            p000.AbstractC8729aT1.m9749a(r1, r6)
            throw r0
        L68:
            Oi r1 = r0.mo2510r(r6)
            boolean r2 = r1.f8575b
            if (r2 == 0) goto L79
            r5.m10473m(r6)
        L73:
            r0.mo2508p(r6)
            r5.f17089b = r3
            return
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.Object r1 = r1.f8576c
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L91:
            throw r6     // Catch: java.lang.Throwable -> L92
        L92:
            r1 = move-exception
            p000.AbstractC8729aT1.m9749a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8875bc1.m10470j(XY):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0041 A[EDGE_INSN: B:160:0x0041->B:107:0x0041 BREAK  A[LOOP:1: B:101:0x0029->B:164:?], SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m10471k(p000.C1482XY r17, int r18, int r19) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8875bc1.m10471k(XY, int, int):void");
    }

    @Override // p000.InterfaceC10548oe1
    /* renamed from: l */
    public InterfaceC10292me1 mo10472l(C11285uP0 c11285uP0) {
        O90.m5968f(c11285uP0, "javaTypeParameter");
        C8368Uh0 c8368Uh0 = (C8368Uh0) ((C8478Wk0) this.f17092e).invoke(c11285uP0);
        return c8368Uh0 != null ? c8368Uh0 : ((InterfaceC10548oe1) ((C6479nH) this.f17089b).f38229c).mo10472l(c11285uP0);
    }

    /* renamed from: m */
    public void m10473m(C1482XY c1482xy) throws SQLException {
        c1482xy.m9081w("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c1482xy.m9081w("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.f17091d) + "')");
    }

    public C8875bc1(C6349lD c6349lD, AbstractC0325F9 abstractC0325F9, String str, String str2) {
        this.f17088a = abstractC0325F9.f3082b;
        this.f17089b = c6349lD;
        this.f17090c = abstractC0325F9;
        this.f17091d = str;
        this.f17092e = str2;
    }

    public C8875bc1(C7161xo c7161xo) {
        this.f17088a = 0;
        this.f17090c = new HashMap();
        this.f17092e = new HashSet();
        this.f17089b = new ArrayList();
        this.f17091d = new ArrayList();
        Set hashSet = new HashSet();
        try {
            hashSet = c7161xo.f45796a.mo323T0();
        } catch (C6448mn unused) {
            AbstractC7806Jm0.m4412f("Camera2CameraCoordinator");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (AbstractC8725aR1.m9742b(c7161xo, str) && AbstractC8725aR1.m9742b(c7161xo, str2)) {
                        ((HashSet) this.f17092e).add(new HashSet(Arrays.asList(str, str2)));
                        HashMap map = (HashMap) this.f17090c;
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        ((List) map.get(str)).add((String) arrayList.get(1));
                        ((List) map.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (C10739q80 unused2) {
                    AbstractC7806Jm0.m4412f("Camera2CameraCoordinator");
                }
            }
        }
    }

    public C8875bc1(String str, int i, C6897tc c6897tc, C6834sc c6834sc, C7150xd c7150xd) {
        this.f17089b = str;
        this.f17088a = i;
        this.f17090c = c6897tc;
        this.f17091d = c6834sc;
        this.f17092e = c7150xd;
    }

    public C8875bc1() {
        byte[] bArr;
        byte[] bArr2;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f17088a = iGlCreateProgram;
        F12.m2485b();
        m10463a(iGlCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        m10463a(iGlCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(iGlCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int i2 = 1;
        F12.m2486c("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f17091d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f17089b = new C6914tt[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.f17088a;
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
            C6914tt c6914tt = new C6914tt(15);
            ((C6914tt[]) this.f17089b)[i3] = c6914tt;
            ((HashMap) this.f17091d).put(str, c6914tt);
            i3++;
            i2 = 1;
        }
        this.f17092e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f17088a, 35718, iArr4, 0);
        this.f17090c = new C1210TE[iArr4[0]];
        for (int i7 = 0; i7 < iArr4[i]; i7++) {
            int i8 = this.f17088a;
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
            C1210TE c1210te = new C1210TE(15);
            ((C1210TE[]) this.f17090c)[i7] = c1210te;
            ((HashMap) this.f17092e).put(str2, c1210te);
        }
        F12.m2485b();
    }

    public C8875bc1(ZQ0[] zq0Arr, InterfaceC6237jR[] interfaceC6237jRArr, C9264ec1 c9264ec1, C4218i3 c4218i3) {
        YN1.m9278c(zq0Arr.length == interfaceC6237jRArr.length);
        this.f17089b = zq0Arr;
        this.f17090c = (InterfaceC6237jR[]) interfaceC6237jRArr.clone();
        this.f17091d = c9264ec1;
        this.f17092e = c4218i3;
        this.f17088a = zq0Arr.length;
    }

    @Override // p000.InterfaceC10021kX0
    /* renamed from: e */
    public void mo5441e(C7783Ja1 c7783Ja1, InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
    }

    public C8875bc1(C1004Px c1004Px, C11287uQ0 c11287uQ0, byte[] bArr, C0328FC[] c0328fcArr, int i) {
        this.f17089b = c1004Px;
        this.f17090c = c11287uQ0;
        this.f17091d = bArr;
        this.f17092e = c0328fcArr;
        this.f17088a = i;
    }

    public C8875bc1(C9778id1 c9778id1, int i) {
        this.f17092e = c9778id1;
        this.f17089b = new C0683Kq(new byte[5], 5);
        this.f17090c = new SparseArray();
        this.f17091d = new SparseIntArray();
        this.f17088a = i;
    }
}
