package defpackage;

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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LvX0;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-secure-store_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vX0 */
/* loaded from: classes2.dex */
public final class C7621vX0 extends AbstractC7874ws0 {
    public final C0318Dv0 c = new C0318Dv0(7);
    public KeyStore d;
    public C3513e41 e;
    public X11 f;

    public static final Object d(C7621vX0 c7621vX0, String str, SecureStoreOptions secureStoreOptions, AbstractC4286i71 abstractC4286i71) {
        SharedPreferences sharedPreferencesK = c7621vX0.k();
        if (sharedPreferencesK.contains(e(str, secureStoreOptions.getKeychainService()))) {
            return c7621vX0.l(str, sharedPreferencesK, secureStoreOptions, abstractC4286i71);
        }
        if (sharedPreferencesK.contains(str)) {
            return c7621vX0.l(str, sharedPreferencesK, secureStoreOptions, abstractC4286i71);
        }
        return null;
    }

    public static String e(String str, String str2) {
        return AbstractC1705Vq.h(str2, "-", str);
    }

    public static void n(JSONObject jSONObject, SharedPreferences sharedPreferences, String str, boolean z, String str2) throws JSONException, C1319Qr0 {
        jSONObject.put("usesKeystoreSuffix", true);
        jSONObject.put("keystoreAlias", str2);
        jSONObject.put("requireAuthentication", z);
        String string = jSONObject.toString();
        O90.e(string, "toString(...)");
        if (string.length() == 0) {
            throw new C1319Qr0(AbstractC8235ym.k("Could not JSON-encode the encrypted item for SecureStore - the string ", string, " is null or empty"), str, str2, null);
        }
        sharedPreferences.edit().putString(str, string).commit();
    }

    @Override // defpackage.AbstractC7874ws0
    public final C0075As0 a() {
        OY1.a("[ExpoModulesCore] " + (C7621vX0.class + ".ModuleDefinition"));
        try {
            C8444zs0 c8444zs0 = new C8444zs0(this);
            c8444zs0.a = "ExpoSecureStore";
            C6212o9 c6212o9 = new C6212o9("setValueWithKeyAsync");
            ((LinkedHashMap) c8444zs0.g).put("setValueWithKeyAsync", c6212o9);
            C6667qX0 c6667qX0 = C6667qX0.h;
            IP0 ip0 = BP0.a;
            c6212o9.a = new C3713f71("setValueWithKeyAsync", new O5[]{new O5(new C1679Vh0(ip0.b(String.class), true, c6667qX0)), new O5(new C1679Vh0(ip0.b(String.class), true, C6667qX0.i)), new O5(new C1679Vh0(ip0.b(SecureStoreOptions.class), false, C6667qX0.j))}, new C7048sX0(null, this, 0));
            C6212o9 c6212o92 = new C6212o9("getValueWithKeyAsync");
            ((LinkedHashMap) c8444zs0.g).put("getValueWithKeyAsync", c6212o92);
            c6212o92.a = new C3713f71("getValueWithKeyAsync", new O5[]{new O5(new C1679Vh0(ip0.b(String.class), false, C6667qX0.k)), new O5(new C1679Vh0(ip0.b(SecureStoreOptions.class), false, C6667qX0.l))}, new C7048sX0(null, this, 1));
            ((LinkedHashMap) c8444zs0.d).put("setValueWithKeySync", new C7734w71("setValueWithKeySync", new O5[]{new O5(new C1679Vh0(ip0.b(String.class), true, C6667qX0.m)), new O5(new C1679Vh0(ip0.b(String.class), true, C6667qX0.n)), new O5(new C1679Vh0(ip0.b(SecureStoreOptions.class), false, C6667qX0.o))}, new C6857rX0(this, 1)));
            ((LinkedHashMap) c8444zs0.d).put("getValueWithKeySync", new C7734w71("getValueWithKeySync", new O5[]{new O5(new C1679Vh0(ip0.b(String.class), false, C6667qX0.p)), new O5(new C1679Vh0(ip0.b(SecureStoreOptions.class), false, C6667qX0.q))}, new C6857rX0(this, 2)));
            O5[] o5Arr = {new O5(new C1679Vh0(ip0.b(String.class), false, C6667qX0.f)), new O5(new C1679Vh0(ip0.b(SecureStoreOptions.class), false, C6667qX0.g))};
            C6857rX0 c6857rX0 = new C6857rX0(this, 0);
            ((LinkedHashMap) c8444zs0.f).put("deleteValueWithKeyAsync", C1518Tf1.class.equals(Integer.TYPE) ? new C0590Hi("deleteValueWithKeyAsync", o5Arr, c6857rX0, false, 3) : C1518Tf1.class.equals(Boolean.TYPE) ? new C0590Hi("deleteValueWithKeyAsync", o5Arr, c6857rX0, false, 0) : C1518Tf1.class.equals(Double.TYPE) ? new C0590Hi("deleteValueWithKeyAsync", o5Arr, c6857rX0, false, 1) : C1518Tf1.class.equals(Float.TYPE) ? new C0590Hi("deleteValueWithKeyAsync", o5Arr, c6857rX0, false, 2) : C1518Tf1.class.equals(String.class) ? new C0590Hi("deleteValueWithKeyAsync", o5Arr, c6857rX0, false, 4) : new C6403p9("deleteValueWithKeyAsync", o5Arr, c6857rX0));
            ((LinkedHashMap) c8444zs0.d).put("canUseBiometricAuthentication", new C7734w71("canUseBiometricAuthentication", new O5[0], new C6857rX0(this, 3)));
            LinkedHashMap linkedHashMap = (LinkedHashMap) c8444zs0.i;
            NP np = NP.a;
            linkedHashMap.put(np, new C1207Pg(np, new C6685qd0(24, this)));
            C0075As0 c0075As0B = c8444zs0.b();
            Trace.endSection();
            return c0075As0B;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void f(String str, SecureStoreOptions secureStoreOptions) throws C7143t2 {
        SharedPreferences sharedPreferencesK = k();
        String strE = e(str, secureStoreOptions.getKeychainService());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(j());
        boolean zCommit = sharedPreferencesK.contains(strE) ? sharedPreferencesK.edit().remove(strE).commit() : true;
        if (sharedPreferencesK.contains(str)) {
            zCommit = sharedPreferencesK.edit().remove(str).commit() && zCommit;
        }
        if (defaultSharedPreferences.contains(str)) {
            zCommit = defaultSharedPreferences.edit().remove(str).commit() && zCommit;
        }
        if (!zCommit) {
            throw new C7143t2("Could not delete the item from SecureStore", str, secureStoreOptions.getKeychainService(), null, 3);
        }
    }

    public final KeyStore.Entry g(Class cls, InterfaceC0738Jf0 interfaceC0738Jf0, SecureStoreOptions secureStoreOptions, boolean z) throws NoSuchAlgorithmException, KeyStoreException, C7143t2, UnrecoverableEntryException {
        String strO = interfaceC0738Jf0.O(secureStoreOptions, z);
        KeyStore keyStore = this.d;
        if (keyStore == null) {
            O90.o("keyStore");
            throw null;
        }
        if (!keyStore.containsAlias(strO)) {
            return null;
        }
        KeyStore keyStore2 = this.d;
        if (keyStore2 == null) {
            O90.o("keyStore");
            throw null;
        }
        KeyStore.Entry entry = keyStore2.getEntry(strO, null);
        if (!cls.isInstance(entry)) {
            throw new C7143t2(AbstractC1705Vq.i("The entry for the keystore alias \"", strO, "\" is not a ", cls.getSimpleName()), 29);
        }
        KeyStore.Entry entry2 = (KeyStore.Entry) cls.cast(entry);
        if (entry2 != null) {
            return entry2;
        }
        throw new C7143t2(AbstractC8235ym.k("The entry for the keystore alias \"", strO, "\" couldn't be cast to correct class"), 29);
    }

    public final KeyStore.Entry h(Class cls, InterfaceC0738Jf0 interfaceC0738Jf0, SecureStoreOptions secureStoreOptions, boolean z, boolean z2) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        if (z2) {
            return g(cls, interfaceC0738Jf0, secureStoreOptions, z);
        }
        String strI = interfaceC0738Jf0.i(secureStoreOptions);
        KeyStore keyStore = this.d;
        if (keyStore == null) {
            O90.o("keyStore");
            throw null;
        }
        if (keyStore.containsAlias(interfaceC0738Jf0.i(secureStoreOptions))) {
            KeyStore keyStore2 = this.d;
            if (keyStore2 == null) {
                O90.o("keyStore");
                throw null;
            }
            KeyStore.Entry entry = keyStore2.getEntry(strI, null);
            if (cls.isInstance(entry)) {
                return (KeyStore.Entry) cls.cast(entry);
            }
        }
        return null;
    }

    public final KeyStore.Entry i(InterfaceC0738Jf0 interfaceC0738Jf0, SecureStoreOptions secureStoreOptions, boolean z) throws NoSuchAlgorithmException, C1891Ya, KeyStoreException, C7143t2, UnrecoverableEntryException {
        KeyStore.Entry entryG = g(KeyStore.SecretKeyEntry.class, interfaceC0738Jf0, secureStoreOptions, z);
        if (entryG != null) {
            return entryG;
        }
        if (z) {
            X11 x11 = this.f;
            if (x11 == null) {
                O90.o("authenticationHelper");
                throw null;
            }
            x11.d();
        }
        KeyStore keyStore = this.d;
        if (keyStore != null) {
            return interfaceC0738Jf0.I(keyStore, secureStoreOptions);
        }
        O90.o("keyStore");
        throw null;
    }

    public final Context j() throws C7143t2 {
        Context contextC = b().c();
        if (contextC != null) {
            return contextC;
        }
        throw new C7143t2(9);
    }

    public final SharedPreferences k() {
        SharedPreferences sharedPreferences = j().getSharedPreferences("SecureStore", 0);
        O90.e(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x01cc: RETURN (r17 I:java.lang.Object) A[SYNTHETIC] (LINE:461), block:B:279:? */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0020  */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r19, android.content.SharedPreferences r20, expo.modules.securestore.SecureStoreOptions r21, defpackage.AbstractC1963Yy r22) throws expo.modules.kotlin.exception.CodedException {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7621vX0.l(java.lang.String, android.content.SharedPreferences, expo.modules.securestore.SecureStoreOptions, Yy):java.lang.Object");
    }

    public final void m(String str, String str2) throws KeyStoreException {
        KeyStore keyStore = this.d;
        if (keyStore == null) {
            O90.o("keyStore");
            throw null;
        }
        keyStore.deleteEntry(str);
        SharedPreferences sharedPreferencesK = k();
        Map<String, ?> all = sharedPreferencesK.getAll();
        O90.e(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String str3 = value instanceof String ? (String) value : null;
            if (str3 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    String strOptString = jSONObject.optString("keystoreAlias");
                    if (strOptString != null && jSONObject.optBoolean("requireAuthentication", false) && O90.a(str2, strOptString)) {
                        sharedPreferencesK.edit().remove(key).apply();
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.String r20, java.lang.String r21, expo.modules.securestore.SecureStoreOptions r22, boolean r23, defpackage.AbstractC1963Yy r24) throws org.json.JSONException, expo.modules.kotlin.exception.CodedException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7621vX0.o(java.lang.String, java.lang.String, expo.modules.securestore.SecureStoreOptions, boolean, Yy):java.lang.Object");
    }
}
