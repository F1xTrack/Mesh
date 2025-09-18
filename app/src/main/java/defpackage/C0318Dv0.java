package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.security.keystore.KeyGenParameterSpec;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.camera.core.ImageProcessingUtil;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import expo.modules.securestore.SecureStoreOptions;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.crypto.KeyGenerator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Dv0 */
/* loaded from: classes.dex */
public final class C0318Dv0 implements InterfaceC0095Az, InterfaceC0940Lv, RemoteCall, InterfaceC0738Jf0, InterfaceC1646Uw0, InterfaceC2508cP, PurchasesUpdatedListener, InterfaceC5303jO0, InterfaceC5790lx0, C21, InterfaceC6053nJ1 {
    public static C0318Dv0 b;
    public static final /* synthetic */ C0318Dv0 c = new C0318Dv0(1);
    public static final C0318Dv0 d = new C0318Dv0(2);
    public static final C0318Dv0 e = new C0318Dv0(4);
    public static final C0318Dv0 f = new C0318Dv0(5);
    public static final /* synthetic */ C0318Dv0 g = new C0318Dv0(6);
    public final /* synthetic */ int a;

    public /* synthetic */ C0318Dv0(int i) {
        this.a = i;
    }

    public static /* synthetic */ void e(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static String k(C1475Sr0 c1475Sr0) throws JSONException {
        O90.f(c1475Sr0, CommonUrlParts.MODEL);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", c1475Sr0.a);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : c1475Sr0.b.entrySet()) {
            jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
        }
        jSONObject.put("data", jSONObject2);
        jSONObject.put(CrashHianalyticsData.TIME, c1475Sr0.c);
        String string = jSONObject.toString(0);
        O90.e(string, "jsonObject.toString(0)");
        return string;
    }

    public static final void l(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        O90.c(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    public static final C3852fs m(C0318Dv0 c0318Dv0, String str) {
        C3852fs c3852fs = new C3852fs(str);
        C3852fs.d.put(str, c3852fs);
        return c3852fs;
    }

    public static EnumC6348os0 o(boolean z, boolean z2, boolean z3) {
        return z ? EnumC6348os0.c : z2 ? EnumC6348os0.e : z3 ? EnumC6348os0.d : EnumC6348os0.b;
    }

    public static InterfaceC7492us p(InterfaceC7492us interfaceC7492us) {
        MX mxG = AbstractC7002sI.g(interfaceC7492us);
        String str = C7442ub0.a;
        KX kx = (KX) C7442ub0.k.get(mxG);
        if (kx != null) {
            return AbstractC7384uI.e(interfaceC7492us).i(kx);
        }
        throw new IllegalArgumentException("Given class " + interfaceC7492us + " is not a read-only collection");
    }

    public static synchronized C0318Dv0 t() {
        try {
            if (b == null) {
                b = new C0318Dv0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public static InterfaceC7492us u(KX kx, AbstractC8408zg0 abstractC8408zg0) {
        O90.f(abstractC8408zg0, "builtIns");
        String str = C7442ub0.a;
        C0074As c0074As = (C0074As) C7442ub0.h.get(kx.i());
        if (c0074As != null) {
            return abstractC8408zg0.i(c0074As.b());
        }
        return null;
    }

    @Override // defpackage.InterfaceC0738Jf0
    public KeyStore.Entry I(KeyStore keyStore, SecureStoreOptions secureStoreOptions) throws NoSuchAlgorithmException, KeyStoreException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        O90.f(keyStore, "keyStore");
        O90.f(secureStoreOptions, "options");
        String strO = O(secureStoreOptions, secureStoreOptions.getRequireAuthentication());
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strO, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(secureStoreOptions.getRequireAuthentication()).build();
        O90.e(keyGenParameterSpecBuild, "build(...)");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", keyStore.getProvider());
        keyGenerator.init(keyGenParameterSpecBuild);
        keyGenerator.generateKey();
        KeyStore.Entry entry = keyStore.getEntry(strO, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null) {
            return secretKeyEntry;
        }
        throw new UnrecoverableEntryException("Could not retrieve the newly generated secret key entry");
    }

    @Override // defpackage.InterfaceC0738Jf0
    public String O(SecureStoreOptions secureStoreOptions, boolean z) {
        O90.f(secureStoreOptions, "options");
        return AbstractC1705Vq.h(i(secureStoreOptions), StringUtils.PROCESS_POSTFIX_DELIMITER, z ? "keystoreAuthenticated" : "keystoreUnauthenticated");
    }

    @Override // defpackage.InterfaceC5790lx0
    public long a(C7566vF c7566vF) {
        return -1L;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.a;
        ((S81) obj2).b(((C8325zE1) obj).h());
    }

    @Override // defpackage.InterfaceC5790lx0
    public CX0 b() {
        return new C4004gf(-9223372036854775807L);
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        return new ArrayList();
    }

    @Override // defpackage.InterfaceC2508cP
    public void f(InterfaceC8042xl interfaceC8042xl) {
        if (interfaceC8042xl != null) {
            return;
        }
        e(2);
        throw null;
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        switch (this.a) {
            case 2:
                Object objH = c1241Pr0.h(new C6997sG0(InterfaceC0122Bi.class, Executor.class));
                O90.e(objH, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return N02.e((Executor) objH);
            default:
                return new PJ1((MO1) c1241Pr0.a(MO1.class), (C4150hQ) c1241Pr0.a(C4150hQ.class), (C2406bs0) c1241Pr0.a(C2406bs0.class));
        }
    }

    @Override // defpackage.InterfaceC2508cP
    public void h(InterfaceC7492us interfaceC7492us, ArrayList arrayList) {
        if (interfaceC7492us != null) {
            return;
        }
        e(0);
        throw null;
    }

    @Override // defpackage.InterfaceC0738Jf0
    public String i(SecureStoreOptions secureStoreOptions) {
        O90.f(secureStoreOptions, "options");
        return AbstractC8235ym.v("AES/GCM/NoPadding:", secureStoreOptions.getKeychainService());
    }

    public C5958mp1 j(Context context) {
        C5958mp1 c5958mp1;
        O90.f(context, "context");
        synchronized (this) {
            c5958mp1 = C5958mp1.d;
            if (c5958mp1 == null) {
                Context applicationContext = context.getApplicationContext();
                O90.e(applicationContext, "context.applicationContext");
                c5958mp1 = new C5958mp1(applicationContext);
                C5958mp1.d = c5958mp1;
            }
        }
        return c5958mp1;
    }

    public Object n(Object obj) throws Throwable {
        MU0 mu0;
        Bitmap bitmapCreateBitmap;
        C4192he c4192he = (C4192he) obj;
        MU0 mu02 = null;
        try {
            try {
                int i = c4192he.c;
                Object obj2 = c4192he.a;
                int i2 = c4192he.f;
                if (i == 35) {
                    InterfaceC3903g70 interfaceC3903g70 = (InterfaceC3903g70) obj2;
                    boolean z = i2 % 180 != 0;
                    mu0 = new MU0(AbstractC4079h22.a(z ? interfaceC3903g70.getHeight() : interfaceC3903g70.getWidth(), z ? interfaceC3903g70.getWidth() : interfaceC3903g70.getHeight(), 1, 2));
                    try {
                        C6395p60 c6395p60D = ImageProcessingUtil.d(interfaceC3903g70, mu0, ByteBuffer.allocateDirect(interfaceC3903g70.getWidth() * interfaceC3903g70.getHeight() * 4), i2, false);
                        interfaceC3903g70.close();
                        if (c6395p60D == null) {
                            throw new C7730w60("Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = AbstractC5237j22.a(c6395p60D);
                        c6395p60D.close();
                    } catch (UnsupportedOperationException e2) {
                        e = e2;
                        throw new C7730w60("Can't convert " + (c4192he.c == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th) {
                        th = th;
                        mu02 = mu0;
                        if (mu02 != null) {
                            mu02.close();
                        }
                        throw th;
                    }
                } else {
                    if (i != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + c4192he.c);
                    }
                    InterfaceC3903g70 interfaceC3903g702 = (InterfaceC3903g70) obj2;
                    Bitmap bitmapA = AbstractC5237j22.a(interfaceC3903g702);
                    interfaceC3903g702.close();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i2);
                    mu0 = null;
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
                }
                if (mu0 != null) {
                    mu0.close();
                }
                return bitmapCreateBitmap;
            } catch (UnsupportedOperationException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        O90.f(billingResult, "billingResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(java.lang.String r6, java.security.KeyStore.SecretKeyEntry r7, boolean r8, java.lang.String r9, defpackage.X11 r10, defpackage.AbstractC1963Yy r11) throws org.json.JSONException, javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            r5 = this;
            boolean r0 = r11 instanceof defpackage.C5225j
            if (r0 == 0) goto L13
            r0 = r11
            j r0 = (defpackage.C5225j) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            j r0 = new j
            r0.<init>(r5, r11)
        L18:
            java.lang.Object r11 = r0.d
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            javax.crypto.spec.GCMParameterSpec r6 = r0.c
            java.lang.String r7 = r0.b
            Dv0 r8 = r0.a
            defpackage.RQ1.d(r11)
            r4 = r7
            r7 = r6
            r6 = r4
            goto L64
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.RQ1.d(r11)
            javax.crypto.SecretKey r7 = r7.getSecretKey()
            java.lang.String r11 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r11 = javax.crypto.Cipher.getInstance(r11)
            r11.init(r3, r7)
            java.security.AlgorithmParameters r7 = r11.getParameters()
            java.lang.Class<javax.crypto.spec.GCMParameterSpec> r2 = javax.crypto.spec.GCMParameterSpec.class
            java.security.spec.AlgorithmParameterSpec r7 = r7.getParameterSpec(r2)
            javax.crypto.spec.GCMParameterSpec r7 = (javax.crypto.spec.GCMParameterSpec) r7
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.f = r3
            java.lang.Object r11 = r10.e(r11, r8, r9, r0)
            if (r11 != r1) goto L63
            return r1
        L63:
            r8 = r5
        L64:
            javax.crypto.Cipher r11 = (javax.crypto.Cipher) r11
            defpackage.O90.c(r7)
            r8.getClass()
            java.lang.String r8 = "plaintextValue"
            defpackage.O90.f(r6, r8)
            java.lang.String r8 = "cipher"
            defpackage.O90.f(r11, r8)
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = "UTF_8"
            defpackage.O90.e(r8, r9)
            byte[] r6 = r6.getBytes(r8)
            java.lang.String r8 = "getBytes(...)"
            defpackage.O90.e(r6, r8)
            byte[] r6 = r11.doFinal(r6)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            byte[] r9 = r7.getIV()
            java.lang.String r8 = android.util.Base64.encodeToString(r9, r8)
            int r7 = r7.getTLen()
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = "ct"
            org.json.JSONObject r6 = r9.put(r10, r6)
            java.lang.String r9 = "iv"
            org.json.JSONObject r6 = r6.put(r9, r8)
            java.lang.String r8 = "tlen"
            org.json.JSONObject r6 = r6.put(r8, r7)
            java.lang.String r7 = "put(...)"
            defpackage.O90.e(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0318Dv0.q(java.lang.String, java.security.KeyStore$SecretKeyEntry, boolean, java.lang.String, X11, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object r(java.lang.String r9, org.json.JSONObject r10, java.security.KeyStore.SecretKeyEntry r11, expo.modules.securestore.SecureStoreOptions r12, defpackage.X11 r13, defpackage.AbstractC1963Yy r14) throws javax.crypto.BadPaddingException, org.json.JSONException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, defpackage.C7143t2, java.security.InvalidAlgorithmParameterException {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.C5416k
            if (r0 == 0) goto L13
            r0 = r14
            k r0 = (defpackage.C5416k) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            k r0 = new k
            r0.<init>(r8, r14)
        L18:
            java.lang.Object r14 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            byte[] r9 = r0.a
            defpackage.RQ1.d(r14)
            goto L7e
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            defpackage.RQ1.d(r14)
            java.lang.String r14 = "ct"
            java.lang.String r14 = r10.getString(r14)
            java.lang.String r2 = "iv"
            java.lang.String r2 = r10.getString(r2)
            java.lang.String r4 = "tlen"
            int r4 = r10.getInt(r4)
            r5 = 0
            byte[] r14 = android.util.Base64.decode(r14, r5)
            byte[] r2 = android.util.Base64.decode(r2, r5)
            javax.crypto.spec.GCMParameterSpec r5 = new javax.crypto.spec.GCMParameterSpec
            r5.<init>(r4, r2)
            java.lang.String r2 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)
            java.lang.String r6 = "requireAuthentication"
            boolean r10 = r10.optBoolean(r6)
            r6 = 96
            if (r4 < r6) goto L96
            r9 = 2
            javax.crypto.SecretKey r11 = r11.getSecretKey()
            r2.init(r9, r11, r5)
            java.lang.String r9 = r12.getAuthenticationPrompt()
            r0.a = r14
            r0.d = r3
            java.lang.Object r9 = r13.e(r2, r10, r9, r0)
            if (r9 != r1) goto L7b
            return r1
        L7b:
            r7 = r14
            r14 = r9
            r9 = r7
        L7e:
            javax.crypto.Cipher r14 = (javax.crypto.Cipher) r14
            byte[] r9 = r14.doFinal(r9)
            java.lang.String r10 = "doFinal(...)"
            defpackage.O90.e(r9, r10)
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r11 = "UTF_8"
            defpackage.O90.e(r10, r11)
            java.lang.String r11 = new java.lang.String
            r11.<init>(r9, r10)
            return r11
        L96:
            t2 r10 = new t2
            java.lang.String r3 = r12.getKeychainService()
            r4 = 0
            java.lang.String r1 = "Authentication tag length must be at least 96 bits long"
            r5 = 2
            r0 = r10
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0318Dv0.r(java.lang.String, org.json.JSONObject, java.security.KeyStore$SecretKeyEntry, expo.modules.securestore.SecureStoreOptions, X11, Yy):java.lang.Object");
    }

    public synchronized C3852fs s(String str) {
        C3852fs c3852fs;
        String strConcat;
        try {
            O90.f(str, "javaName");
            LinkedHashMap linkedHashMap = C3852fs.d;
            c3852fs = (C3852fs) linkedHashMap.get(str);
            if (c3852fs == null) {
                if (D51.o(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    O90.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (D51.o(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    O90.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                c3852fs = (C3852fs) linkedHashMap.get(strConcat);
                if (c3852fs == null) {
                    c3852fs = new C3852fs(str);
                }
                linkedHashMap.put(str, c3852fs);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3852fs;
    }

    @Override // defpackage.InterfaceC5303jO0
    public boolean v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        if (!(unsatisfiedLinkError instanceof G21) || (unsatisfiedLinkError instanceof F21)) {
            return false;
        }
        String str = ((G21) unsatisfiedLinkError).a;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (H21 h21 : h21Arr) {
            if (h21 instanceof AbstractC7076sg1) {
                AbstractC7076sg1 abstractC7076sg1 = (AbstractC7076sg1) h21;
                if (abstractC7076sg1 instanceof C8214yf) {
                    continue;
                } else {
                    try {
                        abstractC7076sg1.getClass();
                        abstractC7076sg1.d(2);
                    } catch (Exception unused) {
                        abstractC7076sg1.getClass();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                C7434uY1.b.get();
                Boolean bool = (Boolean) HY1.b.a();
                bool.getClass();
                return bool;
            case 27:
                PW1.b.get();
                return (String) UW1.m0.a();
            default:
                C4176hY1.b.get();
                return (String) C6480pY1.f.a();
        }
    }

    @Override // defpackage.InterfaceC5790lx0
    public void d(long j) {
    }
}
