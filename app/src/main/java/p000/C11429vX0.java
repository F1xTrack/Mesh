package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import android.preference.PreferenceManager;
import expo.modules.securestore.SecureStoreOptions;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m22267d2 = {"LvX0;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-secure-store_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* renamed from: vX0 */
/* loaded from: classes2.dex */
public final class C11429vX0 extends AbstractC11598ws0 {

    /* renamed from: c */
    public final C7512Dv0 f44403c = new C7512Dv0(7);

    /* renamed from: d */
    public KeyStore f44404d;

    /* renamed from: e */
    public C9196e41 f44405e;

    /* renamed from: f */
    public X11 f44406f;

    /* renamed from: d */
    public static final Object m25430d(C11429vX0 c11429vX0, String str, SecureStoreOptions secureStoreOptions, AbstractC9714i71 abstractC9714i71) {
        SharedPreferences sharedPreferencesM25438k = c11429vX0.m25438k();
        if (sharedPreferencesM25438k.contains(m25431e(str, secureStoreOptions.getKeychainService()))) {
            return c11429vX0.m25439l(str, sharedPreferencesM25438k, secureStoreOptions, abstractC9714i71);
        }
        if (sharedPreferencesM25438k.contains(str)) {
            return c11429vX0.m25439l(str, sharedPreferencesM25438k, secureStoreOptions, abstractC9714i71);
        }
        return null;
    }

    /* renamed from: e */
    public static String m25431e(String str, String str2) {
        return AbstractC1374Vq.m8589h(str2, "-", str);
    }

    /* renamed from: n */
    public static void m25432n(JSONObject jSONObject, SharedPreferences sharedPreferences, String str, boolean z, String str2) throws JSONException, C8180Qr0 {
        jSONObject.put("usesKeystoreSuffix", true);
        jSONObject.put("keystoreAlias", str2);
        jSONObject.put("requireAuthentication", z);
        String string = jSONObject.toString();
        O90.m5967e(string, "toString(...)");
        if (string.length() == 0) {
            throw new C8180Qr0(AbstractC7222ym.m26234k("Could not JSON-encode the encrypted item for SecureStore - the string ", string, " is null or empty"), str, str2, null);
        }
        sharedPreferences.edit().putString(str, string).commit();
    }

    @Override // p000.AbstractC11598ws0
    /* renamed from: a */
    public final C7350As0 mo2834a() {
        OY1.m6083a("[ExpoModulesCore] " + (C11429vX0.class + ".ModuleDefinition"));
        try {
            C11979zs0 c11979zs0 = new C11979zs0(this);
            c11979zs0.f47055a = "ExpoSecureStore";
            C6534o9 c6534o9 = new C6534o9("setValueWithKeyAsync");
            ((LinkedHashMap) c11979zs0.f47061g).put("setValueWithKeyAsync", c6534o9);
            C10789qX0 c10789qX0 = C10789qX0.f40999h;
            IP0 ip0 = BP0.f799a;
            c6534o9.f38832a = new C9330f71("setValueWithKeyAsync", new C0887O5[]{new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), true, c10789qX0)), new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), true, C10789qX0.f41000i)), new C0887O5(new C8420Vh0(ip0.mo3846b(SecureStoreOptions.class), false, C10789qX0.f41001j))}, new C11045sX0(null, this, 0));
            C6534o9 c6534o92 = new C6534o9("getValueWithKeyAsync");
            ((LinkedHashMap) c11979zs0.f47061g).put("getValueWithKeyAsync", c6534o92);
            c6534o92.f38832a = new C9330f71("getValueWithKeyAsync", new C0887O5[]{new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, C10789qX0.f41002k)), new C0887O5(new C8420Vh0(ip0.mo3846b(SecureStoreOptions.class), false, C10789qX0.f41003l))}, new C11045sX0(null, this, 1));
            ((LinkedHashMap) c11979zs0.f47058d).put("setValueWithKeySync", new C11505w71("setValueWithKeySync", new C0887O5[]{new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), true, C10789qX0.f41004m)), new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), true, C10789qX0.f41005n)), new C0887O5(new C8420Vh0(ip0.mo3846b(SecureStoreOptions.class), false, C10789qX0.f41006o))}, new C10917rX0(this, 1)));
            ((LinkedHashMap) c11979zs0.f47058d).put("getValueWithKeySync", new C11505w71("getValueWithKeySync", new C0887O5[]{new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, C10789qX0.f41007p)), new C0887O5(new C8420Vh0(ip0.mo3846b(SecureStoreOptions.class), false, C10789qX0.f41008q))}, new C10917rX0(this, 2)));
            C0887O5[] c0887o5Arr = {new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, C10789qX0.f40997f)), new C0887O5(new C8420Vh0(ip0.mo3846b(SecureStoreOptions.class), false, C10789qX0.f40998g))};
            C10917rX0 c10917rX0 = new C10917rX0(this, 0);
            ((LinkedHashMap) c11979zs0.f47060f).put("deleteValueWithKeyAsync", C8313Tf1.class.equals(Integer.TYPE) ? new C0486Hi("deleteValueWithKeyAsync", c0887o5Arr, c10917rX0, false, 3) : C8313Tf1.class.equals(Boolean.TYPE) ? new C0486Hi("deleteValueWithKeyAsync", c0887o5Arr, c10917rX0, false, 0) : C8313Tf1.class.equals(Double.TYPE) ? new C0486Hi("deleteValueWithKeyAsync", c0887o5Arr, c10917rX0, false, 1) : C8313Tf1.class.equals(Float.TYPE) ? new C0486Hi("deleteValueWithKeyAsync", c0887o5Arr, c10917rX0, false, 2) : C8313Tf1.class.equals(String.class) ? new C0486Hi("deleteValueWithKeyAsync", c0887o5Arr, c10917rX0, false, 4) : new C6599p9("deleteValueWithKeyAsync", c0887o5Arr, c10917rX0));
            ((LinkedHashMap) c11979zs0.f47058d).put("canUseBiometricAuthentication", new C11505w71("canUseBiometricAuthentication", new C0887O5[0], new C10917rX0(this, 3)));
            LinkedHashMap linkedHashMap = (LinkedHashMap) c11979zs0.f47063i;
            EnumC0844NP enumC0844NP = EnumC0844NP.f7754a;
            linkedHashMap.put(enumC0844NP, new C0987Pg(enumC0844NP, new C10801qd0(24, this)));
            C7350As0 c7350As0M26561b = c11979zs0.m26561b();
            Trace.endSection();
            return c7350As0M26561b;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: f */
    public final void m25433f(String str, SecureStoreOptions secureStoreOptions) throws C6861t2 {
        SharedPreferences sharedPreferencesM25438k = m25438k();
        String strM25431e = m25431e(str, secureStoreOptions.getKeychainService());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(m25437j());
        boolean zCommit = sharedPreferencesM25438k.contains(strM25431e) ? sharedPreferencesM25438k.edit().remove(strM25431e).commit() : true;
        if (sharedPreferencesM25438k.contains(str)) {
            zCommit = sharedPreferencesM25438k.edit().remove(str).commit() && zCommit;
        }
        if (defaultSharedPreferences.contains(str)) {
            zCommit = defaultSharedPreferences.edit().remove(str).commit() && zCommit;
        }
        if (!zCommit) {
            throw new C6861t2("Could not delete the item from SecureStore", str, secureStoreOptions.getKeychainService(), null, 3);
        }
    }

    /* renamed from: g */
    public final KeyStore.Entry m25434g(Class cls, InterfaceC7792Jf0 interfaceC7792Jf0, SecureStoreOptions secureStoreOptions, boolean z) throws NoSuchAlgorithmException, KeyStoreException, C6861t2, UnrecoverableEntryException {
        String strMo1935O = interfaceC7792Jf0.mo1935O(secureStoreOptions, z);
        KeyStore keyStore = this.f44404d;
        if (keyStore == null) {
            O90.m5977o("keyStore");
            throw null;
        }
        if (!keyStore.containsAlias(strMo1935O)) {
            return null;
        }
        KeyStore keyStore2 = this.f44404d;
        if (keyStore2 == null) {
            O90.m5977o("keyStore");
            throw null;
        }
        KeyStore.Entry entry = keyStore2.getEntry(strMo1935O, null);
        if (!cls.isInstance(entry)) {
            throw new C6861t2(AbstractC1374Vq.m8590i("The entry for the keystore alias \"", strMo1935O, "\" is not a ", cls.getSimpleName()), 29);
        }
        KeyStore.Entry entry2 = (KeyStore.Entry) cls.cast(entry);
        if (entry2 != null) {
            return entry2;
        }
        throw new C6861t2(AbstractC7222ym.m26234k("The entry for the keystore alias \"", strMo1935O, "\" couldn't be cast to correct class"), 29);
    }

    /* renamed from: h */
    public final KeyStore.Entry m25435h(Class cls, InterfaceC7792Jf0 interfaceC7792Jf0, SecureStoreOptions secureStoreOptions, boolean z, boolean z2) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        if (z2) {
            return m25434g(cls, interfaceC7792Jf0, secureStoreOptions, z);
        }
        String strMo1941i = interfaceC7792Jf0.mo1941i(secureStoreOptions);
        KeyStore keyStore = this.f44404d;
        if (keyStore == null) {
            O90.m5977o("keyStore");
            throw null;
        }
        if (keyStore.containsAlias(interfaceC7792Jf0.mo1941i(secureStoreOptions))) {
            KeyStore keyStore2 = this.f44404d;
            if (keyStore2 == null) {
                O90.m5977o("keyStore");
                throw null;
            }
            KeyStore.Entry entry = keyStore2.getEntry(strMo1941i, null);
            if (cls.isInstance(entry)) {
                return (KeyStore.Entry) cls.cast(entry);
            }
        }
        return null;
    }

    /* renamed from: i */
    public final KeyStore.Entry m25436i(InterfaceC7792Jf0 interfaceC7792Jf0, SecureStoreOptions secureStoreOptions, boolean z) throws NoSuchAlgorithmException, C1547Ya, KeyStoreException, C6861t2, UnrecoverableEntryException {
        KeyStore.Entry entryM25434g = m25434g(KeyStore.SecretKeyEntry.class, interfaceC7792Jf0, secureStoreOptions, z);
        if (entryM25434g != null) {
            return entryM25434g;
        }
        if (z) {
            X11 x11 = this.f44406f;
            if (x11 == null) {
                O90.m5977o("authenticationHelper");
                throw null;
            }
            x11.m8917d();
        }
        KeyStore keyStore = this.f44404d;
        if (keyStore != null) {
            return interfaceC7792Jf0.mo1934I(keyStore, secureStoreOptions);
        }
        O90.m5977o("keyStore");
        throw null;
    }

    /* renamed from: j */
    public final Context m25437j() throws C6861t2 {
        Context contextM987c = m25721b().m987c();
        if (contextM987c != null) {
            return contextM987c;
        }
        throw new C6861t2(9);
    }

    /* renamed from: k */
    public final SharedPreferences m25438k() {
        SharedPreferences sharedPreferences = m25437j().getSharedPreferences("SecureStore", 0);
        O90.m5967e(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x01cc: RETURN (r17 I:java.lang.Object) A[SYNTHETIC] (LINE:461), block:B:279:? */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0020  */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m25439l(java.lang.String r19, android.content.SharedPreferences r20, expo.modules.securestore.SecureStoreOptions r21, p000.AbstractC1571Yy r22) throws expo.modules.kotlin.exception.CodedException {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11429vX0.m25439l(java.lang.String, android.content.SharedPreferences, expo.modules.securestore.SecureStoreOptions, Yy):java.lang.Object");
    }

    /* renamed from: m */
    public final void m25440m(String str, String str2) throws KeyStoreException {
        KeyStore keyStore = this.f44404d;
        if (keyStore == null) {
            O90.m5977o("keyStore");
            throw null;
        }
        keyStore.deleteEntry(str);
        SharedPreferences sharedPreferencesM25438k = m25438k();
        Map<String, ?> all = sharedPreferencesM25438k.getAll();
        O90.m5967e(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String str3 = value instanceof String ? (String) value : null;
            if (str3 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    String strOptString = jSONObject.optString("keystoreAlias");
                    if (strOptString != null && jSONObject.optBoolean("requireAuthentication", false) && O90.m5963a(str2, strOptString)) {
                        sharedPreferencesM25438k.edit().remove(key).apply();
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x00dc A[Catch: CodedException -> 0x0062, Exception -> 0x00b5, GeneralSecurityException -> 0x00b8, KeyPermanentlyInvalidatedException -> 0x0136, TRY_LEAVE, TryCatch #5 {KeyPermanentlyInvalidatedException -> 0x0136, blocks: (B:135:0x00c3, B:137:0x00dc), top: B:174:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x011f A[Catch: CodedException -> 0x0062, Exception -> 0x00b5, GeneralSecurityException -> 0x00b8, KeyPermanentlyInvalidatedException -> 0x012b, TRY_LEAVE, TryCatch #1 {KeyPermanentlyInvalidatedException -> 0x012b, blocks: (B:143:0x0102, B:145:0x011f), top: B:172:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0020  */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.content.SharedPreferences, expo.modules.securestore.SecureStoreOptions, java.lang.String, vX0] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m25441o(java.lang.String r20, java.lang.String r21, expo.modules.securestore.SecureStoreOptions r22, boolean r23, p000.AbstractC1571Yy r24) throws org.json.JSONException, expo.modules.kotlin.exception.CodedException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11429vX0.m25441o(java.lang.String, java.lang.String, expo.modules.securestore.SecureStoreOptions, boolean, Yy):java.lang.Object");
    }
}
