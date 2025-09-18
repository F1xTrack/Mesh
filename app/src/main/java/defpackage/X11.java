package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import com.google.android.gms.tasks.Task;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class X11 implements InterfaceC5252j70, InterfaceC0741Jg0, PZ {
    public static volatile X11 e;
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public X11(int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.c = new Object();
                break;
        }
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str);
    }

    public static String g(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
        }
        return "";
    }

    public static boolean i(CM cm, CM cm2) {
        AbstractC3377dM1.i(cm2.b(), "Fully specified range is not actually fully specified.");
        int i = cm.a;
        int i2 = cm2.a;
        if (i == 2 && i2 == 1) {
            return false;
        }
        if (i != 2 && i != 0 && i != i2) {
            return false;
        }
        int i3 = cm.b;
        return i3 == 0 || i3 == cm2.b;
    }

    public static boolean j(CM cm, CM cm2, HashSet hashSet) {
        if (hashSet.contains(cm2)) {
            return i(cm, cm2);
        }
        cm.toString();
        cm2.toString();
        AbstractC0759Jm0.f("DynamicRangeResolver");
        return false;
    }

    public static CM p(CM cm, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (cm.a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            CM cm2 = (CM) it.next();
            AbstractC3377dM1.h(cm2, "Fully specified DynamicRange cannot be null.");
            AbstractC3377dM1.i(cm2.b(), "Fully specified DynamicRange must have fully defined encoding.");
            if (cm2.a != 1 && j(cm, cm2, hashSet)) {
                return cm2;
            }
        }
        return null;
    }

    public static X11 q(Context context) {
        if (e == null) {
            synchronized (X11.class) {
                try {
                    if (e == null) {
                        e = new X11(context.getApplicationContext(), 0);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static void s(HashSet hashSet, CM cm, C1562Tu0 c1562Tu0) {
        AbstractC3377dM1.i(!hashSet.isEmpty(), "Cannot update already-empty constraints.");
        Set setC = ((GM) c1562Tu0.b).c(cm);
        if (setC.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setC);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + cm + "\nConstraints:\n  " + TextUtils.join("\n  ", setC) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }

    @Override // defpackage.InterfaceC0741Jg0
    public boolean K(InterfaceC1200Pd1 interfaceC1200Pd1, InterfaceC1200Pd1 interfaceC1200Pd12) {
        InterfaceC7662vl interfaceC7662vl = (InterfaceC7662vl) this.c;
        O90.f(interfaceC7662vl, "$a");
        InterfaceC7662vl interfaceC7662vl2 = (InterfaceC7662vl) this.d;
        O90.f(interfaceC7662vl2, "$b");
        O90.f(interfaceC1200Pd1, "c1");
        O90.f(interfaceC1200Pd12, "c2");
        if (interfaceC1200Pd1.equals(interfaceC1200Pd12)) {
            return true;
        }
        InterfaceC1087Ns interfaceC1087NsA = interfaceC1200Pd1.a();
        InterfaceC1087Ns interfaceC1087NsA2 = interfaceC1200Pd12.a();
        if (!(interfaceC1087NsA instanceof InterfaceC5925me1) || !(interfaceC1087NsA2 instanceof InterfaceC5925me1)) {
            return false;
        }
        return OL0.b.f((InterfaceC5925me1) interfaceC1087NsA, (InterfaceC5925me1) interfaceC1087NsA2, this.b, new C2487cI(interfaceC7662vl, 0, interfaceC7662vl2));
    }

    @Override // defpackage.InterfaceC5252j70
    public InterfaceC3903g70 a() {
        Image imageAcquireLatestImage;
        synchronized (this.d) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e2) {
                if (!"ImageReaderContext is not initialized".equals(e2.getMessage())) {
                    throw e2;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new C6388p4(imageAcquireLatestImage);
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public int c() {
        int imageFormat;
        synchronized (this.d) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.InterfaceC5252j70
    public void close() {
        synchronized (this.d) {
            ((ImageReader) this.c).close();
        }
    }

    public void d() throws C1891Ya {
        int iD = new C5772lr0(new C4067h((Context) this.c, 1)).D(15);
        if (iD == -2) {
            throw new C1891Ya("Biometric authentication is unsupported");
        }
        if (iD == -1) {
            throw new C1891Ya("Biometric authentication status is unknown");
        }
        if (iD != 1) {
            if (iD == 15) {
                throw new C1891Ya("An update is required before the biometrics can be used");
            }
            if (iD == 11) {
                throw new C1891Ya("No biometrics are currently enrolled");
            }
            if (iD != 12) {
                return;
            }
        }
        throw new C1891Ya("No hardware available for biometric authentication. Use expo-local-authentication to check if the device supports it");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(javax.crypto.Cipher r6, boolean r7, java.lang.String r8, defpackage.AbstractC1963Yy r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.C1969Za
            if (r0 == 0) goto L13
            r0 = r9
            Za r0 = (defpackage.C1969Za) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Za r0 = new Za
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.RQ1.d(r9)
            goto L7e
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.RQ1.d(r9)
            if (r7 == 0) goto La4
            r0.c = r3
            boolean r7 = r5.b
            if (r7 != 0) goto L9c
            r5.b = r3
            r5.d()
            java.lang.Object r7 = r5.d
            Js0 r7 = (defpackage.C0777Js0) r7
            java.util.HashMap r7 = r7.a
            java.lang.Class<ff1> r9 = defpackage.C3815ff1.class
            java.lang.Object r7 = r7.get(r9)
            java.lang.String r9 = "getModule(...)"
            defpackage.O90.e(r7, r9)
            ff1 r7 = (defpackage.C3815ff1) r7
            com.facebook.react.bridge.ReactContext r7 = r7.a
            android.app.Activity r7 = r7.getCurrentActivity()
            boolean r9 = r7 instanceof androidx.fragment.app.l
            if (r9 == 0) goto L60
            androidx.fragment.app.l r7 = (androidx.fragment.app.l) r7
            goto L61
        L60:
            r7 = r4
        L61:
            if (r7 == 0) goto L94
            rT1 r9 = new rT1
            java.lang.Object r2 = r5.c
            android.content.Context r2 = (android.content.Context) r2
            r9.<init>(r7, r2, r8)
            GK r7 = defpackage.GK.a
            y20 r7 = defpackage.AbstractC0603Hm0.a
            y20 r7 = r7.f
            ab r8 = new ab
            r8.<init>(r9, r6, r5, r4)
            java.lang.Object r9 = defpackage.AbstractC3767fP1.e(r7, r8, r0)
            if (r9 != r1) goto L7e
            return r1
        L7e:
            Ih r9 = (defpackage.C0665Ih) r9
            Oo1 r6 = r9.a
            if (r6 == 0) goto L89
            java.lang.Object r6 = r6.b
            r4 = r6
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
        L89:
            if (r4 == 0) goto L8c
            return r4
        L8c:
            Ya r6 = new Ya
            java.lang.String r7 = "Couldn't get cipher from authentication result"
            r6.<init>(r7)
            throw r6
        L94:
            Ya r6 = new Ya
            java.lang.String r7 = "Cannot display biometric prompt when the app is not in the foreground"
            r6.<init>(r7)
            throw r6
        L9c:
            Ya r6 = new Ya
            java.lang.String r7 = "Authentication is already in progress"
            r6.<init>(r7)
            throw r6
        La4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.X11.e(javax.crypto.Cipher, boolean, java.lang.String, Yy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC5252j70
    public void f() {
        synchronized (this.d) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public int getHeight() {
        int height;
        synchronized (this.d) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    @Override // defpackage.InterfaceC5252j70
    public int getWidth() {
        int width;
        synchronized (this.d) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    @Override // defpackage.InterfaceC5252j70
    public Surface h() {
        Surface surface;
        synchronized (this.d) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    @Override // defpackage.InterfaceC5252j70
    public void k(final InterfaceC4285i70 interfaceC4285i70, final Executor executor) {
        synchronized (this.d) {
            this.b = false;
            ((ImageReader) this.c).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: q4
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    X11 x11 = this.a;
                    Executor executor2 = executor;
                    InterfaceC4285i70 interfaceC4285i702 = interfaceC4285i70;
                    synchronized (x11.d) {
                        try {
                            if (!x11.b) {
                                executor2.execute(new RunnableC6769r4(x11, 0, interfaceC4285i702));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, AbstractC0759Jm0.d());
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public int l() {
        int maxImages;
        synchronized (this.d) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    public AbstractC0038Ag[] m(Handler handler, UQ uq, UQ uq2, UQ uq3, UQ uq4) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.b;
        C1204Pf c1204Pf = (C1204Pf) this.d;
        arrayList.add(new C3462dp0((Context) this.c, c1204Pf, z, handler, uq));
        Context context = (Context) this.c;
        C2226aw c2226aw = new C2226aw(context);
        YN1.f(!c2226aw.c);
        c2226aw.c = true;
        if (((C5772lr0) c2226aw.e) == null) {
            c2226aw.e = new C5772lr0(new InterfaceC7056sa[0]);
        }
        if (((N8) c2226aw.g) == null) {
            c2226aw.g = new N8(context, 9);
        }
        arrayList.add(new C0843Ko0((Context) this.c, c1204Pf, this.b, handler, uq2, new NE(c2226aw)));
        arrayList.add(new G91(uq3, handler.getLooper()));
        arrayList.add(new C0929Lr0(uq4, handler.getLooper()));
        arrayList.add(new C0218Co());
        arrayList.add(new C6016n70(InterfaceC8300z60.w0));
        return (AbstractC0038Ag[]) arrayList.toArray(new AbstractC0038Ag[0]);
    }

    @Override // defpackage.InterfaceC5252j70
    public InterfaceC3903g70 n() {
        Image imageAcquireNextImage;
        synchronized (this.d) {
            try {
                imageAcquireNextImage = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e2) {
                if (!"ImageReaderContext is not initialized".equals(e2.getMessage())) {
                    throw e2;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new C6388p4(imageAcquireNextImage);
        }
    }

    public String o(String str) {
        switch (this.a) {
            case 10:
                if (!this.b) {
                    InterfaceC0476Fw interfaceC0476Fw = (InterfaceC0476Fw) this.c;
                    try {
                        this.d = D12.a(new C6928rv(interfaceC0476Fw.getString("/code/code1", null), interfaceC0476Fw.getString("/code/code2", null), interfaceC0476Fw.getString("/code/code3", null), interfaceC0476Fw.getString("/code/code4", null), "PBKDF2WithHmacSHA1", 10000));
                    } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
                        this.d = null;
                    }
                    this.b = true;
                }
                if (((SecretKeySpec) this.d) == null || !b(str)) {
                    return null;
                }
                try {
                    return new String(D12.c((SecretKeySpec) this.d, AbstractC2252b30.a(g(str))), "UTF-8");
                } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused2) {
                    return null;
                }
            default:
                if (!this.b) {
                    try {
                        this.c = D12.a((C6928rv) this.d);
                    } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused3) {
                        this.c = null;
                    }
                    this.b = true;
                }
                if (((SecretKeySpec) this.c) == null || TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    return new String(D12.c((SecretKeySpec) this.c, AbstractC2252b30.a(str)), "UTF-8");
                } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e2) {
                    e2.getMessage();
                    return null;
                }
        }
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        AbstractC0759Jm0.f("VideoCapture");
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        int i;
        C1371Ri1 c1371Ri1 = (C1371Ri1) this.d;
        if (((C0599Hl) this.c) != c1371Ri1.s || (i = c1371Ri1.u) == 3) {
            return;
        }
        int i2 = this.b ? 1 : 2;
        if (i2 != i) {
            c1371Ri1.u = i2;
            c1371Ri1.L().b(i2);
        }
    }

    public void r() {
        if (this.b) {
            ((Context) this.c).unregisterReceiver((R9) this.d);
            this.b = false;
        }
    }

    public void t(NZ1 nz1) {
        synchronized (this.c) {
            try {
                if (((ArrayDeque) this.d) == null) {
                    this.d = new ArrayDeque();
                }
                ((ArrayDeque) this.d).add(nz1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(Task task) {
        NZ1 nz1;
        synchronized (this.c) {
            if (((ArrayDeque) this.d) != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.c) {
                        try {
                            nz1 = (NZ1) ((ArrayDeque) this.d).poll();
                            if (nz1 == null) {
                                this.b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    nz1.a(task);
                }
            }
        }
    }

    public X11(InterfaceC7662vl interfaceC7662vl, InterfaceC7662vl interfaceC7662vl2, boolean z) {
        this.a = 6;
        this.b = z;
        this.c = interfaceC7662vl;
        this.d = interfaceC7662vl2;
    }

    public X11(C6928rv c6928rv) {
        this.a = 11;
        this.b = false;
        this.d = c6928rv;
    }

    public X11(InterfaceC0476Fw interfaceC0476Fw) {
        this.a = 10;
        this.b = false;
        this.c = interfaceC0476Fw;
    }

    public X11(Context context, C0777Js0 c0777Js0) {
        this.a = 3;
        O90.f(c0777Js0, "moduleRegistry");
        this.c = context;
        this.d = c0777Js0;
    }

    public X11(Context context, Handler handler, UQ uq) {
        this.a = 2;
        this.c = context.getApplicationContext();
        this.d = new R9(this, handler, uq);
    }

    public X11(ImageReader imageReader) {
        this.a = 1;
        this.d = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public X11(C0527Gn c0527Gn) {
        this.a = 7;
        this.c = c0527Gn;
        this.d = C1562Tu0.q0(c0527Gn);
        int[] iArr = (int[]) c0527Gn.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.b = z;
    }

    public X11(Context context, int i) {
        Object w11;
        this.a = i;
        switch (i) {
            case 4:
                this.c = context;
                this.d = new C1204Pf(5, context);
                break;
            default:
                this.d = new HashSet();
                DO r0 = new DO(new S11(context));
                T11 t11 = new T11(this);
                if (Build.VERSION.SDK_INT >= 24) {
                    w11 = new VG(r0, t11);
                } else {
                    w11 = new W11(context, r0, t11);
                }
                this.c = w11;
                break;
        }
    }

    public X11(WC wc) {
        this.a = 5;
        this.c = wc;
        this.d = new C0162Bv0(12);
    }

    public X11(C1371Ri1 c1371Ri1, C0599Hl c0599Hl, boolean z) {
        this.a = 9;
        this.d = c1371Ri1;
        this.c = c0599Hl;
        this.b = z;
    }
}
