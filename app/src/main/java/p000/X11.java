package p000;

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
public final class X11 implements InterfaceC9841j70, InterfaceC7794Jg0, InterfaceC0980PZ {

    /* renamed from: e */
    public static volatile X11 f13485e;

    /* renamed from: a */
    public final /* synthetic */ int f13486a;

    /* renamed from: b */
    public boolean f13487b;

    /* renamed from: c */
    public Object f13488c;

    /* renamed from: d */
    public Object f13489d;

    public X11(int i) {
        this.f13486a = i;
        switch (i) {
            case 12:
                this.f13488c = new Object();
                break;
        }
    }

    /* renamed from: b */
    public static boolean m8910b(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str);
    }

    /* renamed from: g */
    public static String m8911g(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
        }
        return "";
    }

    /* renamed from: i */
    public static boolean m8912i(C0149CM c0149cm, C0149CM c0149cm2) {
        AbstractC9104dM1.m17550i(c0149cm2.m1147b(), "Fully specified range is not actually fully specified.");
        int i = c0149cm.f1336a;
        int i2 = c0149cm2.f1336a;
        if (i == 2 && i2 == 1) {
            return false;
        }
        if (i != 2 && i != 0 && i != i2) {
            return false;
        }
        int i3 = c0149cm.f1337b;
        return i3 == 0 || i3 == c0149cm2.f1337b;
    }

    /* renamed from: j */
    public static boolean m8913j(C0149CM c0149cm, C0149CM c0149cm2, HashSet hashSet) {
        if (hashSet.contains(c0149cm2)) {
            return m8912i(c0149cm, c0149cm2);
        }
        c0149cm.toString();
        c0149cm2.toString();
        AbstractC7806Jm0.m4412f("DynamicRangeResolver");
        return false;
    }

    /* renamed from: p */
    public static C0149CM m8914p(C0149CM c0149cm, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (c0149cm.f1336a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C0149CM c0149cm2 = (C0149CM) it.next();
            AbstractC9104dM1.m17549h(c0149cm2, "Fully specified DynamicRange cannot be null.");
            AbstractC9104dM1.m17550i(c0149cm2.m1147b(), "Fully specified DynamicRange must have fully defined encoding.");
            if (c0149cm2.f1336a != 1 && m8913j(c0149cm, c0149cm2, hashSet)) {
                return c0149cm2;
            }
        }
        return null;
    }

    /* renamed from: q */
    public static X11 m8915q(Context context) {
        if (f13485e == null) {
            synchronized (X11.class) {
                try {
                    if (f13485e == null) {
                        f13485e = new X11(context.getApplicationContext(), 0);
                    }
                } finally {
                }
            }
        }
        return f13485e;
    }

    /* renamed from: s */
    public static void m8916s(HashSet hashSet, C0149CM c0149cm, C8342Tu0 c8342Tu0) {
        AbstractC9104dM1.m17550i(!hashSet.isEmpty(), "Cannot update already-empty constraints.");
        Set setMo3043c = ((InterfaceC0401GM) c8342Tu0.f11590b).mo3043c(c0149cm);
        if (setMo3043c.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setMo3043c);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + c0149cm + "\nConstraints:\n  " + TextUtils.join("\n  ", setMo3043c) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }

    @Override // p000.InterfaceC7794Jg0
    /* renamed from: K */
    public boolean mo1464K(InterfaceC8101Pd1 interfaceC8101Pd1, InterfaceC8101Pd1 interfaceC8101Pd12) {
        InterfaceC7032vl interfaceC7032vl = (InterfaceC7032vl) this.f13488c;
        O90.m5968f(interfaceC7032vl, "$a");
        InterfaceC7032vl interfaceC7032vl2 = (InterfaceC7032vl) this.f13489d;
        O90.m5968f(interfaceC7032vl2, "$b");
        O90.m5968f(interfaceC8101Pd1, "c1");
        O90.m5968f(interfaceC8101Pd12, "c2");
        if (interfaceC8101Pd1.equals(interfaceC8101Pd12)) {
            return true;
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a = interfaceC8101Pd1.mo1962a();
        InterfaceC0873Ns interfaceC0873NsMo1962a2 = interfaceC8101Pd12.mo1962a();
        if (!(interfaceC0873NsMo1962a instanceof InterfaceC10292me1) || !(interfaceC0873NsMo1962a2 instanceof InterfaceC10292me1)) {
            return false;
        }
        return OL0.f8367b.m6022f((InterfaceC10292me1) interfaceC0873NsMo1962a, (InterfaceC10292me1) interfaceC0873NsMo1962a2, this.f13487b, new C1838cI(interfaceC7032vl, 0, interfaceC7032vl2));
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: a */
    public InterfaceC9457g70 mo4037a() {
        Image imageAcquireLatestImage;
        synchronized (this.f13489d) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.f13488c).acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new C6594p4(imageAcquireLatestImage);
        }
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: c */
    public int mo4039c() {
        int imageFormat;
        synchronized (this.f13489d) {
            imageFormat = ((ImageReader) this.f13488c).getImageFormat();
        }
        return imageFormat;
    }

    @Override // p000.InterfaceC9841j70
    public void close() {
        synchronized (this.f13489d) {
            ((ImageReader) this.f13488c).close();
        }
    }

    /* renamed from: d */
    public void m8917d() throws C1547Ya {
        int iM22547D = new C10189lr0(new C4151h((Context) this.f13488c, 1)).m22547D(15);
        if (iM22547D == -2) {
            throw new C1547Ya("Biometric authentication is unsupported");
        }
        if (iM22547D == -1) {
            throw new C1547Ya("Biometric authentication status is unknown");
        }
        if (iM22547D != 1) {
            if (iM22547D == 15) {
                throw new C1547Ya("An update is required before the biometrics can be used");
            }
            if (iM22547D == 11) {
                throw new C1547Ya("No biometrics are currently enrolled");
            }
            if (iM22547D != 12) {
                return;
            }
        }
        throw new C1547Ya("No hardware available for biometric authentication. Use expo-local-authentication to check if the device supports it");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m8918e(javax.crypto.Cipher r6, boolean r7, java.lang.String r8, p000.AbstractC1571Yy r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof p000.C1610Za
            if (r0 == 0) goto L13
            r0 = r9
            Za r0 = (p000.C1610Za) r0
            int r1 = r0.f14986c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14986c = r1
            goto L18
        L13:
            Za r0 = new Za
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f14984a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f14986c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            p000.RQ1.m7017d(r9)
            goto L7e
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            p000.RQ1.m7017d(r9)
            if (r7 == 0) goto La4
            r0.f14986c = r3
            boolean r7 = r5.f13487b
            if (r7 != 0) goto L9c
            r5.f13487b = r3
            r5.m8917d()
            java.lang.Object r7 = r5.f13489d
            Js0 r7 = (p000.C7818Js0) r7
            java.util.HashMap r7 = r7.f5762a
            java.lang.Class<ff1> r9 = p000.C9398ff1.class
            java.lang.Object r7 = r7.get(r9)
            java.lang.String r9 = "getModule(...)"
            p000.O90.m5967e(r7, r9)
            ff1 r7 = (p000.C9398ff1) r7
            com.facebook.react.bridge.ReactContext r7 = r7.f27311a
            android.app.Activity r7 = r7.getCurrentActivity()
            boolean r9 = r7 instanceof androidx.fragment.app.AbstractActivityC1730l
            if (r9 == 0) goto L60
            androidx.fragment.app.l r7 = (androidx.fragment.app.AbstractActivityC1730l) r7
            goto L61
        L60:
            r7 = r4
        L61:
            if (r7 == 0) goto L94
            rT1 r9 = new rT1
            java.lang.Object r2 = r5.f13488c
            android.content.Context r2 = (android.content.Context) r2
            r9.<init>(r7, r2, r8)
            GK r7 = p000.C0399GK.f3694a
            y20 r7 = p000.AbstractC7702Hm0.f4486a
            y20 r7 = r7.f46046f
            ab r8 = new ab
            r8.<init>(r9, r6, r5, r4)
            java.lang.Object r9 = p000.AbstractC9366fP1.m18233e(r7, r8, r0)
            if (r9 != r1) goto L7e
            return r1
        L7e:
            Ih r9 = (p000.C0548Ih) r9
            Oo1 r6 = r9.f5082a
            if (r6 == 0) goto L89
            java.lang.Object r6 = r6.f8628b
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
        throw new UnsupportedOperationException("Method not decompiled: p000.X11.m8918e(javax.crypto.Cipher, boolean, java.lang.String, Yy):java.lang.Object");
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: f */
    public void mo4042f() {
        synchronized (this.f13489d) {
            this.f13487b = true;
            ((ImageReader) this.f13488c).setOnImageAvailableListener(null, null);
        }
    }

    @Override // p000.InterfaceC9841j70
    public int getHeight() {
        int height;
        synchronized (this.f13489d) {
            height = ((ImageReader) this.f13488c).getHeight();
        }
        return height;
    }

    @Override // p000.InterfaceC9841j70
    public int getWidth() {
        int width;
        synchronized (this.f13489d) {
            width = ((ImageReader) this.f13488c).getWidth();
        }
        return width;
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: h */
    public Surface mo4044h() {
        Surface surface;
        synchronized (this.f13489d) {
            surface = ((ImageReader) this.f13488c).getSurface();
        }
        return surface;
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: k */
    public void mo4047k(final InterfaceC9713i70 interfaceC9713i70, final Executor executor) {
        synchronized (this.f13489d) {
            this.f13487b = false;
            ((ImageReader) this.f13488c).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: q4
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    X11 x11 = this.f40574a;
                    Executor executor2 = executor;
                    InterfaceC9713i70 interfaceC9713i702 = interfaceC9713i70;
                    synchronized (x11.f13489d) {
                        try {
                            if (!x11.f13487b) {
                                executor2.execute(new RunnableC6720r4(x11, 0, interfaceC9713i702));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, AbstractC7806Jm0.m4410d());
        }
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: l */
    public int mo4048l() {
        int maxImages;
        synchronized (this.f13489d) {
            maxImages = ((ImageReader) this.f13488c).getMaxImages();
        }
        return maxImages;
    }

    /* renamed from: m */
    public AbstractC0043Ag[] m8919m(Handler handler, SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ, SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ2, SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ3, SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ4) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.f13487b;
        C0986Pf c0986Pf = (C0986Pf) this.f13489d;
        arrayList.add(new C9161dp0((Context) this.f13488c, c0986Pf, z, handler, surfaceHolderCallbackC1285UQ));
        Context context = (Context) this.f13488c;
        C1753aw c1753aw = new C1753aw(context);
        YN1.m9281f(!c1753aw.f16683c);
        c1753aw.f16683c = true;
        if (((C10189lr0) c1753aw.f16685e) == null) {
            c1753aw.f16685e = new C10189lr0(new InterfaceC6832sa[0]);
        }
        if (((C0827N8) c1753aw.f16687g) == null) {
            c1753aw.f16687g = new C0827N8(context, 9);
        }
        arrayList.add(new C7862Ko0((Context) this.f13488c, c0986Pf, this.f13487b, handler, surfaceHolderCallbackC1285UQ2, new C0833NE(c1753aw)));
        arrayList.add(new G91(surfaceHolderCallbackC1285UQ3, handler.getLooper()));
        arrayList.add(new C7920Lr0(surfaceHolderCallbackC1285UQ4, handler.getLooper()));
        arrayList.add(new C0177Co());
        arrayList.add(new C10353n70(InterfaceC11883z60.f46635w0));
        return (AbstractC0043Ag[]) arrayList.toArray(new AbstractC0043Ag[0]);
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: n */
    public InterfaceC9457g70 mo4049n() {
        Image imageAcquireNextImage;
        synchronized (this.f13489d) {
            try {
                imageAcquireNextImage = ((ImageReader) this.f13488c).acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new C6594p4(imageAcquireNextImage);
        }
    }

    /* renamed from: o */
    public String m8920o(String str) {
        switch (this.f13486a) {
            case 10:
                if (!this.f13487b) {
                    InterfaceC0374Fw interfaceC0374Fw = (InterfaceC0374Fw) this.f13488c;
                    try {
                        this.f13489d = D12.m1494a(new C6790rv(interfaceC0374Fw.getString("/code/code1", null), interfaceC0374Fw.getString("/code/code2", null), interfaceC0374Fw.getString("/code/code3", null), interfaceC0374Fw.getString("/code/code4", null), "PBKDF2WithHmacSHA1", 10000));
                    } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
                        this.f13489d = null;
                    }
                    this.f13487b = true;
                }
                if (((SecretKeySpec) this.f13489d) == null || !m8910b(str)) {
                    return null;
                }
                try {
                    return new String(D12.m1496c((SecretKeySpec) this.f13489d, AbstractC8803b30.m10418a(m8911g(str))), "UTF-8");
                } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused2) {
                    return null;
                }
            default:
                if (!this.f13487b) {
                    try {
                        this.f13488c = D12.m1494a((C6790rv) this.f13489d);
                    } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused3) {
                        this.f13488c = null;
                    }
                    this.f13487b = true;
                }
                if (((SecretKeySpec) this.f13488c) == null || TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    return new String(D12.m1496c((SecretKeySpec) this.f13488c, AbstractC8803b30.m10418a(str)), "UTF-8");
                } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e) {
                    e.getMessage();
                    return null;
                }
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        AbstractC7806Jm0.m4412f("VideoCapture");
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        int i;
        C8215Ri1 c8215Ri1 = (C8215Ri1) this.f13489d;
        if (((C0489Hl) this.f13488c) != c8215Ri1.f10393s || (i = c8215Ri1.f10395u) == 3) {
            return;
        }
        int i2 = this.f13487b ? 1 : 2;
        if (i2 != i) {
            c8215Ri1.f10395u = i2;
            c8215Ri1.m7097L().mo3139b(i2);
        }
    }

    /* renamed from: r */
    public void m8921r() {
        if (this.f13487b) {
            ((Context) this.f13488c).unregisterReceiver((RunnableC1079R9) this.f13489d);
            this.f13487b = false;
        }
    }

    /* renamed from: t */
    public void m8922t(NZ1 nz1) {
        synchronized (this.f13488c) {
            try {
                if (((ArrayDeque) this.f13489d) == null) {
                    this.f13489d = new ArrayDeque();
                }
                ((ArrayDeque) this.f13489d).add(nz1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public void m8923u(Task task) {
        NZ1 nz1;
        synchronized (this.f13488c) {
            if (((ArrayDeque) this.f13489d) != null && !this.f13487b) {
                this.f13487b = true;
                while (true) {
                    synchronized (this.f13488c) {
                        try {
                            nz1 = (NZ1) ((ArrayDeque) this.f13489d).poll();
                            if (nz1 == null) {
                                this.f13487b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    nz1.mo4299a(task);
                }
            }
        }
    }

    public X11(InterfaceC7032vl interfaceC7032vl, InterfaceC7032vl interfaceC7032vl2, boolean z) {
        this.f13486a = 6;
        this.f13487b = z;
        this.f13488c = interfaceC7032vl;
        this.f13489d = interfaceC7032vl2;
    }

    public X11(C6790rv c6790rv) {
        this.f13486a = 11;
        this.f13487b = false;
        this.f13489d = c6790rv;
    }

    public X11(InterfaceC0374Fw interfaceC0374Fw) {
        this.f13486a = 10;
        this.f13487b = false;
        this.f13488c = interfaceC0374Fw;
    }

    public X11(Context context, C7818Js0 c7818Js0) {
        this.f13486a = 3;
        O90.m5968f(c7818Js0, "moduleRegistry");
        this.f13488c = context;
        this.f13489d = c7818Js0;
    }

    public X11(Context context, Handler handler, SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ) {
        this.f13486a = 2;
        this.f13488c = context.getApplicationContext();
        this.f13489d = new RunnableC1079R9(this, handler, surfaceHolderCallbackC1285UQ);
    }

    public X11(ImageReader imageReader) {
        this.f13486a = 1;
        this.f13489d = new Object();
        this.f13487b = true;
        this.f13488c = imageReader;
    }

    public X11(C0428Gn c0428Gn) {
        this.f13486a = 7;
        this.f13488c = c0428Gn;
        this.f13489d = C8342Tu0.m7803q0(c0428Gn);
        int[] iArr = (int[]) c0428Gn.m3155a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
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
        this.f13487b = z;
    }

    public X11(Context context, int i) {
        Object w11;
        this.f13486a = i;
        switch (i) {
            case 4:
                this.f13488c = context;
                this.f13489d = new C0986Pf(5, context);
                break;
            default:
                this.f13489d = new HashSet();
                C0214DO c0214do = new C0214DO(new S11(context));
                T11 t11 = new T11(this);
                if (Build.VERSION.SDK_INT >= 24) {
                    w11 = new C1338VG(c0214do, t11);
                } else {
                    w11 = new W11(context, c0214do, t11);
                }
                this.f13488c = w11;
                break;
        }
    }

    public X11(InterfaceC1397WC interfaceC1397WC) {
        this.f13486a = 5;
        this.f13488c = interfaceC1397WC;
        this.f13489d = new C7408Bv0(12);
    }

    public X11(C8215Ri1 c8215Ri1, C0489Hl c0489Hl, boolean z) {
        this.f13486a = 9;
        this.f13489d = c8215Ri1;
        this.f13488c = c0489Hl;
        this.f13487b = z;
    }
}
