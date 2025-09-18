package p000;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: kD */
/* loaded from: classes.dex */
public final class C6286kD implements InterfaceC0643KC {

    /* renamed from: a */
    public final /* synthetic */ int f36353a;

    /* renamed from: b */
    public final Comparable f36354b;

    /* renamed from: c */
    public final Object f36355c;

    /* renamed from: d */
    public Object f36356d;

    public /* synthetic */ C6286kD(int i, Comparable comparable, Object obj) {
        this.f36353a = i;
        this.f36354b = comparable;
        this.f36355c = obj;
    }

    /* renamed from: e */
    public static C6286kD m22166e(Context context, Uri uri, InterfaceC9644ha1 interfaceC9644ha1) {
        return new C6286kD(2, uri, new C8071Oo1(ComponentCallbacks2C1874a.m10883a(context).f17776d.m25734a().m17932f(), interfaceC9644ha1, ComponentCallbacks2C1874a.m10883a(context).f17777e, context.getContentResolver()));
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: a */
    public final Class mo3254a() {
        switch (this.f36353a) {
            case 0:
                ((C10212m12) this.f36355c).getClass();
                return InputStream.class;
            case 1:
                return ((InterfaceC7266zT) this.f36355c).mo7157a();
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: b */
    public final void mo3255b() throws IOException {
        switch (this.f36353a) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f36356d).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                Object obj = this.f36356d;
                if (obj != null) {
                    try {
                        ((InterfaceC7266zT) this.f36355c).mo7159j(obj);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f36356d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: c */
    public final void mo3256c(EnumC11389vD0 enumC11389vD0, InterfaceC0580JC interfaceC0580JC) throws Throwable {
        switch (this.f36353a) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamM22628e = C10212m12.m22628e((String) this.f36354b);
                    this.f36356d = byteArrayInputStreamM22628e;
                    interfaceC0580JC.mo557j(byteArrayInputStreamM22628e);
                    break;
                } catch (IllegalArgumentException e) {
                    interfaceC0580JC.mo556e(e);
                    return;
                }
            case 1:
                try {
                    Object objMo7158e = ((InterfaceC7266zT) this.f36355c).mo7158e((File) this.f36354b);
                    this.f36356d = objMo7158e;
                    interfaceC0580JC.mo557j(objMo7158e);
                    break;
                } catch (FileNotFoundException e2) {
                    interfaceC0580JC.mo556e(e2);
                    return;
                }
            default:
                try {
                    InputStream inputStreamM22170i = m22170i();
                    this.f36356d = inputStreamM22170i;
                    interfaceC0580JC.mo557j(inputStreamM22170i);
                    break;
                } catch (FileNotFoundException e3) {
                    interfaceC0580JC.mo556e(e3);
                }
        }
    }

    @Override // p000.InterfaceC0643KC
    public final void cancel() {
        int i = this.f36353a;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: d */
    public final EnumC1460XC mo3257d() {
        switch (this.f36353a) {
        }
        return EnumC1460XC.f13614a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x002b A[PHI: r5
  0x002b: PHI (r5v11 android.database.Cursor) = (r5v2 android.database.Cursor), (r5v14 android.database.Cursor) binds: [B:100:0x003d, B:91:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.InputStream m22170i() throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            java.lang.Comparable r1 = r12.f36354b
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r2 = r12.f36355c
            Oo1 r2 = (p000.C8071Oo1) r2
            r3 = 3
            r4 = 0
            java.lang.Object r5 = r2.f8627a     // Catch: java.lang.Throwable -> L30 java.lang.SecurityException -> L33
            ha1 r5 = (p000.InterfaceC9644ha1) r5     // Catch: java.lang.Throwable -> L30 java.lang.SecurityException -> L33
            android.database.Cursor r5 = r5.mo864h(r1)     // Catch: java.lang.Throwable -> L30 java.lang.SecurityException -> L33
            if (r5 == 0) goto L29
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L34
            if (r6 == 0) goto L29
            r6 = 0
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L34
            r5.close()
            goto L40
        L25:
            r0 = move-exception
            r4 = r5
            goto Lc7
        L29:
            if (r5 == 0) goto L2e
        L2b:
            r5.close()
        L2e:
            r6 = r4
            goto L40
        L30:
            r0 = move-exception
            goto Lc7
        L33:
            r5 = r4
        L34:
            boolean r6 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L3d
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L25
        L3d:
            if (r5 == 0) goto L2e
            goto L2b
        L40:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            java.lang.Object r7 = r2.f8629c
            android.content.ContentResolver r7 = (android.content.ContentResolver) r7
            if (r5 == 0) goto L4c
        L4a:
            r5 = r4
            goto L8d
        L4c:
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L4a
            long r8 = r5.length()
            r10 = 0
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 >= 0) goto L4a
            android.net.Uri r5 = android.net.Uri.fromFile(r5)
            java.io.InputStream r5 = r7.openInputStream(r5)     // Catch: java.lang.NullPointerException -> L6a
            goto L8d
        L6a:
            r0 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "NPE opening uri: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " -> "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            java.lang.Throwable r0 = r2.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L8d:
            r6 = -1
            if (r5 == 0) goto Lbd
            java.io.InputStream r4 = r7.openInputStream(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La8
            java.lang.Object r7 = r2.f8630d     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La8
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La8
            java.lang.Object r2 = r2.f8628b     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La8
            zm0 r2 = (p000.C11967zm0) r2     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La8
            int r0 = p000.AbstractC9063d22.m17477a(r7, r4, r2)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La8
            if (r4 == 0) goto Lbe
            r4.close()     // Catch: java.io.IOException -> Lbe
            goto Lbe
        La6:
            r0 = move-exception
            goto Lb7
        La8:
            boolean r0 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto Lb1
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> La6
        Lb1:
            if (r4 == 0) goto Lbd
            r4.close()     // Catch: java.io.IOException -> Lbd
            goto Lbd
        Lb7:
            if (r4 == 0) goto Lbc
            r4.close()     // Catch: java.io.IOException -> Lbc
        Lbc:
            throw r0
        Lbd:
            r0 = r6
        Lbe:
            if (r0 == r6) goto Lc6
            BQ r1 = new BQ
            r1.<init>(r5, r0)
            r5 = r1
        Lc6:
            return r5
        Lc7:
            if (r4 == 0) goto Lcc
            r4.close()
        Lcc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6286kD.m22170i():java.io.InputStream");
    }

    /* renamed from: f */
    private final void m22167f() {
    }

    /* renamed from: g */
    private final void m22168g() {
    }

    /* renamed from: h */
    private final void m22169h() {
    }
}
