package expo.modules.adapters.react;

import android.os.Trace;
import android.util.SparseArray;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import p000.AbstractC11153tN0;
import p000.AbstractC11205tn0;
import p000.AbstractC11432vY1;
import p000.AbstractC6552oR;
import p000.AbstractC6857sz;
import p000.AbstractC7293zu;
import p000.C0134C7;
import p000.C0779MN;
import p000.C1005Py;
import p000.C7046vz;
import p000.C7378Bg0;
import p000.C7558Es0;
import p000.C7766Is0;
import p000.C7818Js0;
import p000.C7978Mu0;
import p000.C8362Ue0;
import p000.D90;
import p000.EnumC0844NP;
import p000.EnumC10561ol0;
import p000.FM1;
import p000.InterfaceC7974Ms0;
import p000.O90;
import p000.OY1;

/* loaded from: classes2.dex */
public class NativeModulesProxy extends ReactContextBaseJavaModule {
    private static final String EXPORTED_METHODS_KEY = "exportedMethods";
    private static final String METHOD_INFO_KEY = "key";
    private static final String METHOD_INFO_NAME = "name";
    private static final String MODULES_CONSTANTS_KEY = "modulesConstants";
    private static final String NAME = "NativeUnimoduleProxy";
    private static final String UNDEFINED_METHOD_ERROR = "E_UNDEFINED_METHOD";
    private static final String UNEXPECTED_ERROR = "E_UNEXPECTED_ERROR";
    private static final String VIEW_MANAGERS_METADATA_KEY = "viewManagersMetadata";
    private Map<String, Object> cachedConstants;
    private Map<String, Map<String, Integer>> mExportedMethodsKeys;
    private Map<String, SparseArray<String>> mExportedMethodsReverseKeys;
    private C7378Bg0 mKotlinInteropModuleRegistry;
    private C7818Js0 mModuleRegistry;

    public NativeModulesProxy(ReactApplicationContext reactApplicationContext, C7818Js0 c7818Js0) {
        super(reactApplicationContext);
        this.mModuleRegistry = c7818Js0;
        this.mExportedMethodsKeys = new HashMap();
        this.mExportedMethodsReverseKeys = new HashMap();
        InterfaceC7974Ms0 interfaceC7974Ms0 = (InterfaceC7974Ms0) AbstractC6552oR.f38997a.getValue();
        Objects.requireNonNull(interfaceC7974Ms0);
        this.mKotlinInteropModuleRegistry = new C7378Bg0(interfaceC7974Ms0, c7818Js0, new WeakReference(reactApplicationContext));
    }

    private void assignExportedMethodsKeys(String str, List<Map<String, Object>> list) {
        if (this.mExportedMethodsKeys.get(str) == null) {
            this.mExportedMethodsKeys.put(str, new HashMap());
        }
        if (this.mExportedMethodsReverseKeys.get(str) == null) {
            this.mExportedMethodsReverseKeys.put(str, new SparseArray<>());
        }
        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> map = list.get(i);
            if (map.get(METHOD_INFO_NAME) == null || !(map.get(METHOD_INFO_NAME) instanceof String)) {
                throw new RuntimeException("No method name in MethodInfo - " + map.toString());
            }
            String str2 = (String) map.get(METHOD_INFO_NAME);
            Integer num = this.mExportedMethodsKeys.get(str).get(str2);
            if (num == null) {
                int size = this.mExportedMethodsKeys.get(str).values().size();
                map.put(METHOD_INFO_KEY, Integer.valueOf(size));
                this.mExportedMethodsKeys.get(str).put(str2, Integer.valueOf(size));
                this.mExportedMethodsReverseKeys.get(str).put(size, str2);
            } else {
                map.put(METHOD_INFO_KEY, num);
            }
        }
    }

    @ReactMethod
    public void callMethod(String str, int i, ReadableArray readableArray, Promise promise) {
        callMethod(str, this.mExportedMethodsReverseKeys.get(str).get(i), readableArray, promise);
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map<String, Object> map = this.cachedConstants;
        if (map != null) {
            return map;
        }
        this.mModuleRegistry.m4459a();
        C7378Bg0 kotlinInteropModuleRegistry = getKotlinInteropModuleRegistry();
        kotlinInteropModuleRegistry.m798a();
        C0134C7 c0134c7 = kotlinInteropModuleRegistry.f971a;
        c0134c7.getClass();
        Trace.beginSection(OY1.m6088f("[ExpoModulesCore] AppContext.onCreate"));
        try {
            C7766Is0 c7766Is0 = c0134c7.f1198c;
            Iterator it = c7766Is0.iterator();
            while (it.hasNext()) {
                ((C7558Es0) it.next()).m2437b(EnumC0844NP.f7754a);
            }
            Iterator it2 = c7766Is0.iterator();
            while (it2.hasNext()) {
                ((C7558Es0) it2.next()).f2934b.getClass();
            }
            synchronized (c7766Is0) {
                c7766Is0.f5192d = true;
            }
            c7766Is0.m4059d();
            Trace.endSection();
            HashMap map2 = new HashMap(3);
            map2.put(MODULES_CONSTANTS_KEY, new HashMap());
            map2.put(EXPORTED_METHODS_KEY, new HashMap());
            C7378Bg0 c7378Bg0 = this.mKotlinInteropModuleRegistry;
            c7378Bg0.getClass();
            Trace.beginSection(OY1.m6088f("[ExpoModulesCore] KotlinInteropModuleRegistry.viewManagersMetadata"));
            try {
                C7766Is0 c7766Is02 = c7378Bg0.f971a.f1198c;
                ArrayList arrayList = new ArrayList();
                Iterator it3 = c7766Is02.iterator();
                while (it3.hasNext()) {
                    ((C7558Es0) it3.next()).f2934b.getClass();
                }
                int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(arrayList));
                if (iM24983b < 16) {
                    iM24983b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    linkedHashMap.put(((C7558Es0) it4.next()).f2934b.f454a, AbstractC11205tn0.m24984c(new Pair("propsNames", C0779MN.f7117a)));
                }
                Trace.endSection();
                map2.put(VIEW_MANAGERS_METADATA_KEY, linkedHashMap);
                C7978Mu0 c7978Mu0 = AbstractC6857sz.f42743a;
                c7978Mu0.getClass();
                c7978Mu0.m5475l(EnumC10561ol0.f39224c, "✅ Constants were exported", null);
                this.cachedConstants = map2;
                return map2;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public C7378Bg0 getKotlinInteropModuleRegistry() {
        return this.mKotlinInteropModuleRegistry;
    }

    public C7818Js0 getModuleRegistry() {
        return this.mModuleRegistry;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public ReactApplicationContext getReactContext() {
        return getReactApplicationContext();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        C7818Js0 c7818Js0 = this.mModuleRegistry;
        c7818Js0.getClass();
        ArrayList arrayList = new ArrayList(c7818Js0.f5762a.values());
        Iterator it = c7818Js0.f5763b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() != null) {
                arrayList.add((D90) weakReference.get());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((D90) it2.next()).onDestroy();
        }
        C0134C7 c0134c7 = this.mKotlinInteropModuleRegistry.f971a;
        C7766Is0 c7766Is0 = c0134c7.f1198c;
        Trace.beginSection(OY1.m6088f("[ExpoModulesCore] AppContext.onDestroy"));
        try {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) c0134c7.f1197b.get();
            if (reactApplicationContext != null) {
                reactApplicationContext.removeLifecycleEventListener(c0134c7.f1199d);
            }
            c7766Is0.m4061k(EnumC0844NP.f7755b);
            c7766Is0.f5190b.clear();
            C7978Mu0 c7978Mu0 = AbstractC6857sz.f42743a;
            c7978Mu0.getClass();
            EnumC10561ol0 enumC10561ol0 = EnumC10561ol0.f39224c;
            c7978Mu0.m5475l(enumC10561ol0, "✅ ModuleRegistry was destroyed", null);
            ((C7046vz) c0134c7.f1202g.f2933a).f45149a = null;
            AbstractC11432vY1.m25445b(c0134c7.f1206k, new C1005Py());
            AbstractC11432vY1.m25445b(c0134c7.f1207l, new C1005Py());
            AbstractC11432vY1.m25445b(c0134c7.f1205j, new C1005Py());
            c0134c7.f1208m.m18091a();
            c7978Mu0.m5475l(enumC10561ol0, "✅ AppContext was destroyed", null);
            Trace.endSection();
            c7978Mu0.m5475l(enumC10561ol0, "✅ KotlinInteropModuleRegistry was destroyed", null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void callMethod(String str, String str2, ReadableArray readableArray, Promise promise) {
        C7378Bg0 c7378Bg0 = this.mKotlinInteropModuleRegistry;
        c7378Bg0.getClass();
        O90.m5968f(str, METHOD_INFO_NAME);
        C7766Is0 c7766Is0 = c7378Bg0.f971a.f1198c;
        c7766Is0.getClass();
        if (!c7766Is0.f5190b.containsKey(str)) {
            promise.reject(UNDEFINED_METHOD_ERROR, AbstractC11153tN0.m24912x("Method ", str2, " of Java module ", str, " is undefined."));
            return;
        }
        C7378Bg0 c7378Bg02 = this.mKotlinInteropModuleRegistry;
        C8362Ue0 c8362Ue0 = new C8362Ue0(promise);
        c7378Bg02.getClass();
        O90.m5968f(str2, "method");
        O90.m5968f(readableArray, "arguments");
        try {
            C7558Es0 c7558Es0M4060i = c7378Bg02.f971a.f1198c.m4060i(str);
            if (c7558Es0M4060i != null) {
                c7558Es0M4060i.m2436a(str2, readableArray, c8362Ue0);
                return;
            }
            throw new IllegalArgumentException(("Trying to call '" + str2 + "' on the non-existing module '" + str + "'").toString());
        } catch (CodedException e) {
            FM1.m2585l(c8362Ue0, e);
        } catch (Throwable th) {
            FM1.m2585l(c8362Ue0, new UnexpectedException(th.toString(), th));
        }
    }

    public NativeModulesProxy(ReactApplicationContext reactApplicationContext, C7818Js0 c7818Js0, InterfaceC7974Ms0 interfaceC7974Ms0) {
        super(reactApplicationContext);
        this.mModuleRegistry = c7818Js0;
        this.mExportedMethodsKeys = new HashMap();
        this.mExportedMethodsReverseKeys = new HashMap();
        Objects.requireNonNull(interfaceC7974Ms0);
        this.mKotlinInteropModuleRegistry = new C7378Bg0(interfaceC7974Ms0, c7818Js0, new WeakReference(reactApplicationContext));
    }
}
