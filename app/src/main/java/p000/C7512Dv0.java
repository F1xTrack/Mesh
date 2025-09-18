package p000;

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
public final class C7512Dv0 implements InterfaceC0062Az, InterfaceC0750Lv, RemoteCall, InterfaceC7792Jf0, InterfaceC8398Uw0, InterfaceC1845cP, PurchasesUpdatedListener, InterfaceC9875jO0, InterfaceC10201lx0, C21, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static C7512Dv0 f2299b;

    /* renamed from: c */
    public static final /* synthetic */ C7512Dv0 f2300c = new C7512Dv0(1);

    /* renamed from: d */
    public static final C7512Dv0 f2301d = new C7512Dv0(2);

    /* renamed from: e */
    public static final C7512Dv0 f2302e = new C7512Dv0(4);

    /* renamed from: f */
    public static final C7512Dv0 f2303f = new C7512Dv0(5);

    /* renamed from: g */
    public static final /* synthetic */ C7512Dv0 f2304g = new C7512Dv0(6);

    /* renamed from: a */
    public final /* synthetic */ int f2305a;

    public /* synthetic */ C7512Dv0(int i) {
        this.f2305a = i;
    }

    /* renamed from: e */
    public static /* synthetic */ void m1926e(int i) {
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

    /* renamed from: k */
    public static String m1927k(C8284Sr0 c8284Sr0) throws JSONException {
        O90.m5968f(c8284Sr0, CommonUrlParts.MODEL);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", c8284Sr0.f11010a);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : c8284Sr0.f11011b.entrySet()) {
            jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
        }
        jSONObject.put("data", jSONObject2);
        jSONObject.put(CrashHianalyticsData.TIME, c8284Sr0.f11012c);
        String string = jSONObject.toString(0);
        O90.m5967e(string, "jsonObject.toString(0)");
        return string;
    }

    /* renamed from: l */
    public static final void m1928l(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        O90.m5965c(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    /* renamed from: m */
    public static final C4080fs m1929m(C7512Dv0 c7512Dv0, String str) {
        C4080fs c4080fs = new C4080fs(str);
        C4080fs.f27422d.put(str, c4080fs);
        return c4080fs;
    }

    /* renamed from: o */
    public static EnumC10575os0 m1930o(boolean z, boolean z2, boolean z3) {
        return z ? EnumC10575os0.f39324c : z2 ? EnumC10575os0.f39326e : z3 ? EnumC10575os0.f39325d : EnumC10575os0.f39323b;
    }

    /* renamed from: p */
    public static InterfaceC6976us m1931p(InterfaceC6976us interfaceC6976us) {
        C0789MX c0789mxM24695g = AbstractC6814sI.m24695g(interfaceC6976us);
        String str = C11309ub0.f43758a;
        C0664KX c0664kx = (C0664KX) C11309ub0.f43768k.get(c0789mxM24695g);
        if (c0664kx != null) {
            return AbstractC6940uI.m25152e(interfaceC6976us).m26502i(c0664kx);
        }
        throw new IllegalArgumentException("Given class " + interfaceC6976us + " is not a read-only collection");
    }

    /* renamed from: t */
    public static synchronized C7512Dv0 m1932t() {
        try {
            if (f2299b == null) {
                f2299b = new C7512Dv0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2299b;
    }

    /* renamed from: u */
    public static InterfaceC6976us m1933u(C0664KX c0664kx, AbstractC11955zg0 abstractC11955zg0) {
        O90.m5968f(abstractC11955zg0, "builtIns");
        String str = C11309ub0.f43758a;
        C0055As c0055As = (C0055As) C11309ub0.f43765h.get(c0664kx.m4661i());
        if (c0055As != null) {
            return abstractC11955zg0.m26502i(c0055As.m359b());
        }
        return null;
    }

    @Override // p000.InterfaceC7792Jf0
    /* renamed from: I */
    public KeyStore.Entry mo1934I(KeyStore keyStore, SecureStoreOptions secureStoreOptions) throws NoSuchAlgorithmException, KeyStoreException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        O90.m5968f(keyStore, "keyStore");
        O90.m5968f(secureStoreOptions, "options");
        String strMo1935O = mo1935O(secureStoreOptions, secureStoreOptions.getRequireAuthentication());
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strMo1935O, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(secureStoreOptions.getRequireAuthentication()).build();
        O90.m5967e(keyGenParameterSpecBuild, "build(...)");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", keyStore.getProvider());
        keyGenerator.init(keyGenParameterSpecBuild);
        keyGenerator.generateKey();
        KeyStore.Entry entry = keyStore.getEntry(strMo1935O, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null) {
            return secretKeyEntry;
        }
        throw new UnrecoverableEntryException("Could not retrieve the newly generated secret key entry");
    }

    @Override // p000.InterfaceC7792Jf0
    /* renamed from: O */
    public String mo1935O(SecureStoreOptions secureStoreOptions, boolean z) {
        O90.m5968f(secureStoreOptions, "options");
        return AbstractC1374Vq.m8589h(mo1941i(secureStoreOptions), StringUtils.PROCESS_POSTFIX_DELIMITER, z ? "keystoreAuthenticated" : "keystoreUnauthenticated");
    }

    @Override // p000.InterfaceC10201lx0
    /* renamed from: a */
    public long mo1936a(C7000vF c7000vF) {
        return -1L;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.f10059a;
        ((S81) obj2).m7184b(((C11900zE1) obj).m26341h());
    }

    @Override // p000.InterfaceC10201lx0
    /* renamed from: b */
    public CX0 mo1937b() {
        return new C4130gf(-9223372036854775807L);
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        return new ArrayList();
    }

    @Override // p000.InterfaceC1845cP
    /* renamed from: f */
    public void mo1939f(InterfaceC7158xl interfaceC7158xl) {
        if (interfaceC7158xl != null) {
            return;
        }
        m1926e(2);
        throw null;
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        switch (this.f2305a) {
            case 2:
                Object objMo4071h = c8128Pr0.mo4071h(new C11011sG0(InterfaceC0108Bi.class, Executor.class));
                O90.m5967e(objMo4071h, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return N02.m5507e((Executor) objMo4071h);
            default:
                return new PJ1((MO1) c8128Pr0.mo4066a(MO1.class), (C4178hQ) c8128Pr0.mo4066a(C4178hQ.class), (C8906bs0) c8128Pr0.mo4066a(C8906bs0.class));
        }
    }

    @Override // p000.InterfaceC1845cP
    /* renamed from: h */
    public void mo1940h(InterfaceC6976us interfaceC6976us, ArrayList arrayList) {
        if (interfaceC6976us != null) {
            return;
        }
        m1926e(0);
        throw null;
    }

    @Override // p000.InterfaceC7792Jf0
    /* renamed from: i */
    public String mo1941i(SecureStoreOptions secureStoreOptions) {
        O90.m5968f(secureStoreOptions, "options");
        return AbstractC7222ym.m26245v("AES/GCM/NoPadding:", secureStoreOptions.getKeychainService());
    }

    /* renamed from: j */
    public C10314mp1 m1942j(Context context) {
        C10314mp1 c10314mp1;
        O90.m5968f(context, "context");
        synchronized (this) {
            c10314mp1 = C10314mp1.f37957d;
            if (c10314mp1 == null) {
                Context applicationContext = context.getApplicationContext();
                O90.m5967e(applicationContext, "context.applicationContext");
                c10314mp1 = new C10314mp1(applicationContext);
                C10314mp1.f37957d = c10314mp1;
            }
        }
        return c10314mp1;
    }

    /* renamed from: n */
    public Object m1943n(Object obj) throws Throwable {
        MU0 mu0;
        Bitmap bitmapCreateBitmap;
        C4192he c4192he = (C4192he) obj;
        MU0 mu02 = null;
        try {
            try {
                int i = c4192he.f28490c;
                Object obj2 = c4192he.f28488a;
                int i2 = c4192he.f28493f;
                if (i == 35) {
                    InterfaceC9457g70 interfaceC9457g70 = (InterfaceC9457g70) obj2;
                    boolean z = i2 % 180 != 0;
                    mu0 = new MU0(AbstractC9575h22.m18702a(z ? interfaceC9457g70.getHeight() : interfaceC9457g70.getWidth(), z ? interfaceC9457g70.getWidth() : interfaceC9457g70.getHeight(), 1, 2));
                    try {
                        C10607p60 c10607p60M9890d = ImageProcessingUtil.m9890d(interfaceC9457g70, mu0, ByteBuffer.allocateDirect(interfaceC9457g70.getWidth() * interfaceC9457g70.getHeight() * 4), i2, false);
                        interfaceC9457g70.close();
                        if (c10607p60M9890d == null) {
                            throw new C11502w60("Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = AbstractC9831j22.m21966a(c10607p60M9890d);
                        c10607p60M9890d.close();
                    } catch (UnsupportedOperationException e) {
                        e = e;
                        throw new C11502w60("Can't convert " + (c4192he.f28490c == 35 ? "YUV" : "JPEG") + " to bitmap", e);
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
                        throw new IllegalArgumentException("Invalid postview image format : " + c4192he.f28490c);
                    }
                    InterfaceC9457g70 interfaceC9457g702 = (InterfaceC9457g70) obj2;
                    Bitmap bitmapM21966a = AbstractC9831j22.m21966a(interfaceC9457g702);
                    interfaceC9457g702.close();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i2);
                    mu0 = null;
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapM21966a, 0, 0, bitmapM21966a.getWidth(), bitmapM21966a.getHeight(), matrix, true);
                }
                if (mu0 != null) {
                    mu0.close();
                }
                return bitmapCreateBitmap;
            } catch (UnsupportedOperationException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        O90.m5968f(billingResult, "billingResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m1944q(java.lang.String r6, java.security.KeyStore.SecretKeyEntry r7, boolean r8, java.lang.String r9, p000.X11 r10, p000.AbstractC1571Yy r11) throws org.json.JSONException, javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            r5 = this;
            boolean r0 = r11 instanceof p000.C6209j
            if (r0 == 0) goto L13
            r0 = r11
            j r0 = (p000.C6209j) r0
            int r1 = r0.f34835f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34835f = r1
            goto L18
        L13:
            j r0 = new j
            r0.<init>(r5, r11)
        L18:
            java.lang.Object r11 = r0.f34833d
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f34835f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            javax.crypto.spec.GCMParameterSpec r6 = r0.f34832c
            java.lang.String r7 = r0.f34831b
            Dv0 r8 = r0.f34830a
            p000.RQ1.m7017d(r11)
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
            p000.RQ1.m7017d(r11)
            javax.crypto.SecretKey r7 = r7.getSecretKey()
            java.lang.String r11 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r11 = javax.crypto.Cipher.getInstance(r11)
            r11.init(r3, r7)
            java.security.AlgorithmParameters r7 = r11.getParameters()
            java.lang.Class<javax.crypto.spec.GCMParameterSpec> r2 = javax.crypto.spec.GCMParameterSpec.class
            java.security.spec.AlgorithmParameterSpec r7 = r7.getParameterSpec(r2)
            javax.crypto.spec.GCMParameterSpec r7 = (javax.crypto.spec.GCMParameterSpec) r7
            r0.f34830a = r5
            r0.f34831b = r6
            r0.f34832c = r7
            r0.f34835f = r3
            java.lang.Object r11 = r10.m8918e(r11, r8, r9, r0)
            if (r11 != r1) goto L63
            return r1
        L63:
            r8 = r5
        L64:
            javax.crypto.Cipher r11 = (javax.crypto.Cipher) r11
            p000.O90.m5965c(r7)
            r8.getClass()
            java.lang.String r8 = "plaintextValue"
            p000.O90.m5968f(r6, r8)
            java.lang.String r8 = "cipher"
            p000.O90.m5968f(r11, r8)
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = "UTF_8"
            p000.O90.m5967e(r8, r9)
            byte[] r6 = r6.getBytes(r8)
            java.lang.String r8 = "getBytes(...)"
            p000.O90.m5967e(r6, r8)
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
            p000.O90.m5967e(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7512Dv0.m1944q(java.lang.String, java.security.KeyStore$SecretKeyEntry, boolean, java.lang.String, X11, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m1945r(java.lang.String r9, org.json.JSONObject r10, java.security.KeyStore.SecretKeyEntry r11, expo.modules.securestore.SecureStoreOptions r12, p000.X11 r13, p000.AbstractC1571Yy r14) throws javax.crypto.BadPaddingException, org.json.JSONException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, p000.C6861t2, java.security.InvalidAlgorithmParameterException {
        /*
            r8 = this;
            boolean r0 = r14 instanceof p000.C6272k
            if (r0 == 0) goto L13
            r0 = r14
            k r0 = (p000.C6272k) r0
            int r1 = r0.f35474d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35474d = r1
            goto L18
        L13:
            k r0 = new k
            r0.<init>(r8, r14)
        L18:
            java.lang.Object r14 = r0.f35472b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f35474d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            byte[] r9 = r0.f35471a
            p000.RQ1.m7017d(r14)
            goto L7e
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            p000.RQ1.m7017d(r14)
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
            r0.f35471a = r14
            r0.f35474d = r3
            java.lang.Object r9 = r13.m8918e(r2, r10, r9, r0)
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
            p000.O90.m5967e(r9, r10)
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r11 = "UTF_8"
            p000.O90.m5967e(r10, r11)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C7512Dv0.m1945r(java.lang.String, org.json.JSONObject, java.security.KeyStore$SecretKeyEntry, expo.modules.securestore.SecureStoreOptions, X11, Yy):java.lang.Object");
    }

    /* renamed from: s */
    public synchronized C4080fs m1946s(String str) {
        C4080fs c4080fs;
        String strConcat;
        try {
            O90.m5968f(str, "javaName");
            LinkedHashMap linkedHashMap = C4080fs.f27422d;
            c4080fs = (C4080fs) linkedHashMap.get(str);
            if (c4080fs == null) {
                if (D51.m1556o(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    O90.m5967e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (D51.m1556o(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    O90.m5967e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                c4080fs = (C4080fs) linkedHashMap.get(strConcat);
                if (c4080fs == null) {
                    c4080fs = new C4080fs(str);
                }
                linkedHashMap.put(str, c4080fs);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c4080fs;
    }

    @Override // p000.InterfaceC9875jO0
    /* renamed from: v */
    public boolean mo1475v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        if (!(unsatisfiedLinkError instanceof G21) || (unsatisfiedLinkError instanceof F21)) {
            return false;
        }
        String str = ((G21) unsatisfiedLinkError).f3550a;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (H21 h21 : h21Arr) {
            if (h21 instanceof AbstractC11064sg1) {
                AbstractC11064sg1 abstractC11064sg1 = (AbstractC11064sg1) h21;
                if (abstractC11064sg1 instanceof C7215yf) {
                    continue;
                } else {
                    try {
                        abstractC11064sg1.getClass();
                        abstractC11064sg1.mo3244d(2);
                    } catch (Exception unused) {
                        abstractC11064sg1.getClass();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f2305a) {
            case 26:
                C11304uY1.f43748b.get();
                Boolean bool = (Boolean) HY1.f4341b.m8754a();
                bool.getClass();
                return bool;
            case 27:
                PW1.f9104b.get();
                return (String) UW1.f11884m0.m8754a();
            default:
                C9640hY1.f28446b.get();
                return (String) C10664pY1.f40207f.m8754a();
        }
    }

    @Override // p000.InterfaceC10201lx0
    /* renamed from: d */
    public void mo1938d(long j) {
    }
}
