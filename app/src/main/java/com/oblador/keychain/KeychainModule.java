package com.oblador.keychain;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p000.AbstractC10195lu0;
import p000.AbstractC11153tN0;
import p000.AbstractC3892cs;
import p000.AbstractC7222ym;
import p000.C0611Jh;
import p000.C0674Kh;
import p000.C0968PN;
import p000.C1564Yr;
import p000.C3954ds;
import p000.C4017es;
import p000.C4103gE;
import p000.C4229iE;
import p000.C4238iN;
import p000.C6473nB;
import p000.C8104Pf0;
import p000.EnumC11810yX0;
import p000.InterfaceC1627Zr;
import p000.InterfaceC4040fE;
import p000.QZ1;
import p000.RunnableC0204DE;
import p000.XC0;
import p000.YC0;

/* loaded from: classes2.dex */
public class KeychainModule extends ReactContextBaseJavaModule {
    public static final String EMPTY_STRING = "";
    public static final String FACE_SUPPORTED_NAME = "Face";
    public static final String FINGERPRINT_SUPPORTED_NAME = "Fingerprint";
    public static final String IRIS_SUPPORTED_NAME = "Iris";
    public static final String KEYCHAIN_MODULE = "RNKeychainManager";
    private static final String LOG_TAG = "KeychainModule";
    public static final String WARMING_UP_ALIAS = "warmingUp";
    private final Map<String, InterfaceC1627Zr> cipherStorageMap;
    private final YC0 prefsStorage;

    public KeychainModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.cipherStorageMap = new HashMap();
        this.prefsStorage = new YC0(reactApplicationContext);
        addCipherStorageToMap(new C3954ds(reactApplicationContext));
        addCipherStorageToMap(new C4017es(0));
        addCipherStorageToMap(new C4017es(1));
    }

    private void addCipherStorageToMap(InterfaceC1627Zr interfaceC1627Zr) {
        this.cipherStorageMap.put(interfaceC1627Zr.mo9616b(), interfaceC1627Zr);
    }

    private C1564Yr decryptCredentials(String str, InterfaceC1627Zr interfaceC1627Zr, XC0 xc0, String str2, C0674Kh c0674Kh) throws C6473nB, C8104Pf0 {
        String str3 = xc0.f13620c;
        if (str3.equals(interfaceC1627Zr.mo9616b())) {
            return decryptToResult(str, interfaceC1627Zr, xc0, c0674Kh);
        }
        InterfaceC1627Zr cipherStorageByName = getCipherStorageByName(str3);
        if (cipherStorageByName == null) {
            throw new C8104Pf0(AbstractC7222ym.m26234k("Wrong cipher storage name '", str3, "' or cipher not available"));
        }
        C1564Yr c1564YrDecryptToResult = decryptToResult(str, cipherStorageByName, xc0, c0674Kh);
        if ("automaticUpgradeToMoreSecuredStorage".equals(str2)) {
            try {
                migrateCipherStorage(str, interfaceC1627Zr, cipherStorageByName, c1564YrDecryptToResult);
            } catch (C6473nB unused) {
            }
        }
        return c1564YrDecryptToResult;
    }

    private C1564Yr decryptToResult(String str, InterfaceC1627Zr interfaceC1627Zr, XC0 xc0, C0674Kh c0674Kh) throws C6473nB {
        InterfaceC4040fE interactiveHandler = getInteractiveHandler(interfaceC1627Zr, c0674Kh);
        interfaceC1627Zr.mo9622h(interactiveHandler, str, (byte[]) xc0.f2473a, (byte[]) xc0.f2474b);
        Throwable thMo18196c = interactiveHandler.mo18196c();
        int i = C6473nB.f38165a;
        if (thMo18196c == null) {
            if (interactiveHandler.getResult() != null) {
                return interactiveHandler.getResult();
            }
            throw new C6473nB("No decryption results and no error. Something deeply wrong!");
        }
        if (thMo18196c instanceof C6473nB) {
            throw ((C6473nB) thMo18196c);
        }
        throw new C6473nB("Wrapped error: " + thMo18196c.getMessage(), thMo18196c);
    }

    private Collection<String> doGetAllGenericPasswordServices() throws C8104Pf0 {
        YC0 yc0 = this.prefsStorage;
        yc0.getClass();
        HashSet hashSet = new HashSet();
        SharedPreferences sharedPreferences = yc0.f14203a;
        for (String str : sharedPreferences.getAll().keySet()) {
            if (str.endsWith(":c")) {
                hashSet.add(sharedPreferences.getString(str, null));
            }
        }
        ArrayList arrayList = new ArrayList(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(getCipherStorageByName((String) it.next()));
        }
        HashSet hashSet2 = new HashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            KeyStore keyStoreM17433t = ((AbstractC3892cs) ((InterfaceC1627Zr) it2.next())).m17433t();
            try {
                Iterator it3 = new HashSet(Collections.list(keyStoreM17433t.aliases())).iterator();
                while (it3.hasNext()) {
                    String str2 = (String) it3.next();
                    if (!str2.equals(WARMING_UP_ALIAS)) {
                        hashSet2.add(str2);
                    }
                }
            } catch (KeyStoreException e) {
                throw new C8104Pf0("Error accessing aliases in keystore " + keyStoreM17433t, e);
            }
        }
        return hashSet2;
    }

    private static String getAccessControlOrDefault(ReadableMap readableMap) {
        return getAccessControlOrDefault(readableMap, "None");
    }

    private static String getAliasOrDefault(String str) {
        return str == null ? "" : str;
    }

    private static C0674Kh getPromptInfo(ReadableMap readableMap) {
        ReadableMap map = (readableMap == null || !readableMap.hasKey("authenticationPrompt")) ? null : readableMap.getMap("authenticationPrompt");
        C0611Jh c0611Jh = new C0611Jh();
        if (map != null && map.hasKey("title")) {
            c0611Jh.f5669c = map.getString("title");
        }
        if (map != null && map.hasKey("subtitle")) {
            c0611Jh.f5670d = map.getString("subtitle");
        }
        if (map != null && map.hasKey("description")) {
            c0611Jh.f5671e = map.getString("description");
        }
        if (map != null && map.hasKey("cancel")) {
            c0611Jh.f5672f = map.getString("cancel");
        }
        c0611Jh.f5667a = 15;
        c0611Jh.f5668b = false;
        return c0611Jh.m4386b();
    }

    private static EnumC11810yX0 getSecurityLevelOrDefault(ReadableMap readableMap) {
        return getSecurityLevelOrDefault(readableMap, "ANY");
    }

    private static String getSecurityRulesOrDefault(ReadableMap readableMap) {
        return getSecurityRulesOrDefault(readableMap, LocalNotification.Importance.NONE);
    }

    private InterfaceC1627Zr getSelectedStorage(ReadableMap readableMap) throws C6473nB {
        boolean useBiometry = getUseBiometry(getAccessControlOrDefault(readableMap));
        String specificStorageOrDefault = getSpecificStorageOrDefault(readableMap);
        InterfaceC1627Zr cipherStorageByName = specificStorageOrDefault != null ? getCipherStorageByName(specificStorageOrDefault) : null;
        return cipherStorageByName == null ? getCipherStorageForCurrentAPILevel(useBiometry) : cipherStorageByName;
    }

    private static String getServiceOrDefault(ReadableMap readableMap) {
        return getAliasOrDefault((readableMap == null || !readableMap.hasKey("service")) ? null : readableMap.getString("service"));
    }

    private static String getSpecificStorageOrDefault(ReadableMap readableMap) {
        if (readableMap == null || !readableMap.hasKey("storage")) {
            return null;
        }
        return readableMap.getString("storage");
    }

    public static boolean getUseBiometry(String str) {
        return "BiometryAny".equals(str) || "BiometryCurrentSet".equals(str) || "BiometryAnyOrDevicePasscode".equals(str) || "BiometryCurrentSetOrDevicePasscode".equals(str);
    }

    public void internalWarmingBestCipher() {
        try {
            long jNanoTime = System.nanoTime();
            AbstractC3892cs abstractC3892cs = (AbstractC3892cs) getCipherStorageForCurrentAPILevel();
            abstractC3892cs.m17428o();
            abstractC3892cs.m17427n(WARMING_UP_ALIAS, abstractC3892cs.mo9621g() ? EnumC11810yX0.f46289c : EnumC11810yX0.f46288b);
            abstractC3892cs.m17433t();
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        } catch (Throwable unused) {
        }
    }

    public static void throwIfEmptyLoginPassword(String str, String str2) throws C0968PN {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new C0968PN("you passed empty or null username/password");
        }
    }

    public static void throwIfInsufficientLevel(InterfaceC1627Zr interfaceC1627Zr, EnumC11810yX0 enumC11810yX0) throws C6473nB {
        if (interfaceC1627Zr.mo9615a().compareTo(enumC11810yX0) < 0) {
            throw new C6473nB(AbstractC11153tN0.m24912x("Cipher Storage is too weak. Required security level is: ", enumC11810yX0.name(), ", but only ", interfaceC1627Zr.mo9615a().name(), " is provided"));
        }
    }

    public static KeychainModule withWarming(ReactApplicationContext reactApplicationContext) {
        KeychainModule keychainModule = new KeychainModule(reactApplicationContext);
        Thread thread = new Thread(new RunnableC0204DE(20, keychainModule), "keychain-warming-up");
        thread.setDaemon(true);
        thread.start();
        return keychainModule;
    }

    @ReactMethod
    public void getAllGenericPasswordServices(Promise promise) {
        try {
            promise.resolve(Arguments.makeNativeArray(doGetAllGenericPasswordServices().toArray()));
        } catch (C8104Pf0 e) {
            promise.reject("E_KEYSTORE_ACCESS_ERROR", e);
        }
    }

    public InterfaceC1627Zr getCipherStorageByName(String str) {
        return this.cipherStorageMap.get(str);
    }

    public InterfaceC1627Zr getCipherStorageForCurrentAPILevel() throws C6473nB {
        return getCipherStorageForCurrentAPILevel(true);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put(EnumC11810yX0.f46287a.m26162a(), "ANY");
        map.put(EnumC11810yX0.f46288b.m26162a(), "SECURE_SOFTWARE");
        map.put(EnumC11810yX0.f46289c.m26162a(), "SECURE_HARDWARE");
        return map;
    }

    public void getGenericPassword(String str, ReadableMap readableMap, Promise promise) {
        try {
            XC0 xc0M9236a = this.prefsStorage.m9236a(str);
            if (xc0M9236a == null) {
                promise.resolve(Boolean.FALSE);
                return;
            }
            String str2 = xc0M9236a.f13620c;
            String securityRulesOrDefault = getSecurityRulesOrDefault(readableMap);
            C0674Kh promptInfo = getPromptInfo(readableMap);
            InterfaceC1627Zr cipherStorageForCurrentAPILevel = (securityRulesOrDefault.equals("automaticUpgradeToMoreSecuredStorage") && str2.equals("FacebookConceal")) ? getCipherStorageForCurrentAPILevel(getUseBiometry(getAccessControlOrDefault(readableMap))) : getCipherStorageByName(str2);
            C1564Yr c1564YrDecryptCredentials = decryptCredentials(str, cipherStorageForCurrentAPILevel, xc0M9236a, securityRulesOrDefault, promptInfo);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("service", str);
            writableMapCreateMap.putString("username", (String) c1564YrDecryptCredentials.f2473a);
            writableMapCreateMap.putString("password", (String) c1564YrDecryptCredentials.f2474b);
            writableMapCreateMap.putString("storage", cipherStorageForCurrentAPILevel.mo9616b());
            promise.resolve(writableMapCreateMap);
        } catch (C8104Pf0 e) {
            e.getMessage();
            promise.reject("E_KEYSTORE_ACCESS_ERROR", e);
        } catch (C6473nB e2) {
            e2.getMessage();
            promise.reject("E_CRYPTO_FAILED", e2);
        } catch (Throwable th) {
            th.getMessage();
            promise.reject("E_UNKNOWN_ERROR", th);
        }
    }

    @ReactMethod
    public void getGenericPasswordForOptions(ReadableMap readableMap, Promise promise) {
        getGenericPassword(getServiceOrDefault(readableMap), readableMap, promise);
    }

    public InterfaceC4040fE getInteractiveHandler(InterfaceC1627Zr interfaceC1627Zr, C0674Kh c0674Kh) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (!interfaceC1627Zr.mo9619e()) {
            return new C4238iN((char) 0, 11);
        }
        if (!Build.BRAND.toLowerCase().equals("oneplus") || Arrays.asList(AbstractC10195lu0.f37352b).contains(Build.MODEL)) {
            return new C4103gE(reactApplicationContext, interfaceC1627Zr, c0674Kh);
        }
        C4229iE c4229iE = new C4229iE(reactApplicationContext, interfaceC1627Zr, c0674Kh);
        c4229iE.f28970i = Boolean.FALSE;
        return c4229iE;
    }

    @ReactMethod
    public void getInternetCredentialsForServer(String str, ReadableMap readableMap, Promise promise) {
        getGenericPassword(str, readableMap, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return KEYCHAIN_MODULE;
    }

    @ReactMethod
    public void getSecurityLevel(ReadableMap readableMap, Promise promise) {
        promise.resolve(getSecurityLevel(getUseBiometry(getAccessControlOrDefault(readableMap))).name());
    }

    @ReactMethod
    public void getSupportedBiometryType(Promise promise) {
        try {
            String str = null;
            if (QZ1.m6729b(getReactApplicationContext())) {
                if (isFingerprintAuthAvailable()) {
                    str = FINGERPRINT_SUPPORTED_NAME;
                } else if (isFaceAuthAvailable()) {
                    str = FACE_SUPPORTED_NAME;
                } else if (isIrisAuthAvailable()) {
                    str = IRIS_SUPPORTED_NAME;
                }
            }
            promise.resolve(str);
        } catch (Exception e) {
            e.getMessage();
            promise.reject("E_SUPPORTED_BIOMETRY_ERROR", e);
        } catch (Throwable th) {
            th.getMessage();
            promise.reject("E_UNKNOWN_ERROR", th);
        }
    }

    @ReactMethod
    public void hasInternetCredentialsForServer(String str, Promise promise) {
        String aliasOrDefault = getAliasOrDefault(str);
        XC0 xc0M9236a = this.prefsStorage.m9236a(aliasOrDefault);
        if (xc0M9236a == null) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("service", aliasOrDefault);
        writableMapCreateMap.putString("storage", xc0M9236a.f13620c);
        promise.resolve(writableMapCreateMap);
    }

    public boolean isFaceAuthAvailable() {
        return QZ1.m6729b(getReactApplicationContext()) && getReactApplicationContext().getPackageManager().hasSystemFeature("android.hardware.biometrics.face");
    }

    public boolean isFingerprintAuthAvailable() {
        return QZ1.m6729b(getReactApplicationContext()) && getReactApplicationContext().getPackageManager().hasSystemFeature("android.hardware.fingerprint");
    }

    public boolean isIrisAuthAvailable() {
        return QZ1.m6729b(getReactApplicationContext()) && getReactApplicationContext().getPackageManager().hasSystemFeature("android.hardware.biometrics.iris");
    }

    public boolean isSecureHardwareAvailable() {
        try {
            return getCipherStorageForCurrentAPILevel().mo9621g();
        } catch (C6473nB unused) {
            return false;
        }
    }

    public void migrateCipherStorage(String str, InterfaceC1627Zr interfaceC1627Zr, InterfaceC1627Zr interfaceC1627Zr2, C1564Yr c1564Yr) throws C6473nB, C8104Pf0 {
        this.prefsStorage.m9238f(str, interfaceC1627Zr.mo9617c(str, (String) c1564Yr.f2473a, (String) c1564Yr.f2474b, c1564Yr.f14559c));
        interfaceC1627Zr2.mo9620f(str);
    }

    public void resetGenericPassword(String str, Promise promise) {
        InterfaceC1627Zr cipherStorageByName;
        try {
            XC0 xc0M9236a = this.prefsStorage.m9236a(str);
            if (xc0M9236a != null && (cipherStorageByName = getCipherStorageByName(xc0M9236a.f13620c)) != null) {
                cipherStorageByName.mo9620f(str);
            }
            this.prefsStorage.m9237e(str);
            promise.resolve(Boolean.TRUE);
        } catch (C8104Pf0 e) {
            e.getMessage();
            promise.reject("E_KEYSTORE_ACCESS_ERROR", e);
        } catch (Throwable th) {
            th.getMessage();
            promise.reject("E_UNKNOWN_ERROR", th);
        }
    }

    @ReactMethod
    public void resetGenericPasswordForOptions(ReadableMap readableMap, Promise promise) {
        resetGenericPassword(getServiceOrDefault(readableMap), promise);
    }

    @ReactMethod
    public void resetInternetCredentialsForServer(String str, Promise promise) {
        resetGenericPassword(str, promise);
    }

    public void setGenericPassword(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        try {
            throwIfEmptyLoginPassword(str2, str3);
            EnumC11810yX0 securityLevelOrDefault = getSecurityLevelOrDefault(readableMap);
            InterfaceC1627Zr selectedStorage = getSelectedStorage(readableMap);
            throwIfInsufficientLevel(selectedStorage, securityLevelOrDefault);
            this.prefsStorage.m9238f(str, selectedStorage.mo9617c(str, str2, str3, securityLevelOrDefault));
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("service", str);
            writableMapCreateMap.putString("storage", selectedStorage.mo9616b());
            promise.resolve(writableMapCreateMap);
        } catch (C0968PN e) {
            e.getMessage();
            promise.reject("E_EMPTY_PARAMETERS", e);
        } catch (C6473nB e2) {
            e2.getMessage();
            promise.reject("E_CRYPTO_FAILED", e2);
        } catch (Throwable th) {
            th.getMessage();
            promise.reject("E_UNKNOWN_ERROR", th);
        }
    }

    @ReactMethod
    public void setGenericPasswordForOptions(ReadableMap readableMap, String str, String str2, Promise promise) {
        setGenericPassword(getServiceOrDefault(readableMap), str, str2, readableMap, promise);
    }

    @ReactMethod
    public void setInternetCredentialsForServer(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        setGenericPassword(str, str2, str3, readableMap, promise);
    }

    private static String getAccessControlOrDefault(ReadableMap readableMap, String str) {
        String string = (readableMap == null || !readableMap.hasKey("accessControl")) ? null : readableMap.getString("accessControl");
        return string == null ? str : string;
    }

    private static EnumC11810yX0 getSecurityLevelOrDefault(ReadableMap readableMap, String str) {
        String string = (readableMap == null || !readableMap.hasKey("securityLevel")) ? null : readableMap.getString("securityLevel");
        if (string != null) {
            str = string;
        }
        return EnumC11810yX0.valueOf(str);
    }

    private static String getSecurityRulesOrDefault(ReadableMap readableMap, String str) {
        String string = (readableMap == null || !readableMap.hasKey("rules")) ? null : readableMap.getString("rules");
        return string == null ? str : string;
    }

    public InterfaceC1627Zr getCipherStorageForCurrentAPILevel(boolean z) throws C6473nB {
        int i = Build.VERSION.SDK_INT;
        boolean z2 = z && (isFingerprintAuthAvailable() || isFaceAuthAvailable() || isIrisAuthAvailable());
        InterfaceC1627Zr interfaceC1627Zr = null;
        for (InterfaceC1627Zr interfaceC1627Zr2 : this.cipherStorageMap.values()) {
            interfaceC1627Zr2.getClass();
            int iMo9618d = interfaceC1627Zr2.mo9618d();
            AbstractC3892cs abstractC3892cs = (AbstractC3892cs) interfaceC1627Zr2;
            int iMo9618d2 = abstractC3892cs.mo9618d() + ((abstractC3892cs.mo9619e() ? 1 : 0) * 1000);
            if (iMo9618d <= i) {
                if (interfaceC1627Zr != null) {
                    AbstractC3892cs abstractC3892cs2 = (AbstractC3892cs) interfaceC1627Zr;
                    if (iMo9618d2 < abstractC3892cs2.mo9618d() + ((abstractC3892cs2.mo9619e() ? 1 : 0) * 1000)) {
                    }
                }
                if (!interfaceC1627Zr2.mo9619e() || z2) {
                    interfaceC1627Zr = interfaceC1627Zr2;
                }
            }
        }
        if (interfaceC1627Zr != null) {
            return interfaceC1627Zr;
        }
        throw new C6473nB("Unsupported Android SDK " + Build.VERSION.SDK_INT);
    }

    private EnumC11810yX0 getSecurityLevel(boolean z) {
        EnumC11810yX0 enumC11810yX0 = EnumC11810yX0.f46287a;
        try {
            InterfaceC1627Zr cipherStorageForCurrentAPILevel = getCipherStorageForCurrentAPILevel(z);
            EnumC11810yX0 enumC11810yX0Mo9615a = cipherStorageForCurrentAPILevel.mo9615a();
            EnumC11810yX0 enumC11810yX02 = EnumC11810yX0.f46288b;
            return !(enumC11810yX0Mo9615a.compareTo(enumC11810yX02) >= 0) ? enumC11810yX0 : cipherStorageForCurrentAPILevel.mo9621g() ? EnumC11810yX0.f46289c : enumC11810yX02;
        } catch (C6473nB e) {
            e.getMessage();
            return enumC11810yX0;
        }
    }
}
