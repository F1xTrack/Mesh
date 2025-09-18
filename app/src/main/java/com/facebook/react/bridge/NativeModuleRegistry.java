package com.facebook.react.bridge;

import android.os.Trace;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.InterfaceC9101dL0;
import p000.MT1;
import p000.UN1;

/* loaded from: classes.dex */
public class NativeModuleRegistry {
    private final String TAG = "NativeModuleRegistry";
    private final Map<String, ModuleHolder> mModules;
    private final ReactApplicationContext mReactApplicationContext;

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map<String, ModuleHolder> map) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mModules = map;
    }

    private Map<String, ModuleHolder> getModuleMap() {
        return this.mModules;
    }

    private ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }

    public List<NativeModule> getAllModules() {
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleHolder> it = this.mModules.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getModule());
        }
        return arrayList;
    }

    public Collection<ModuleHolder> getCxxModules() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ModuleHolder> entry : this.mModules.entrySet()) {
            if (entry.getValue().isCxxModule()) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public Collection<JavaModuleWrapper> getJavaModules(JSInstance jSInstance) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ModuleHolder> entry : this.mModules.entrySet()) {
            if (!entry.getValue().isCxxModule()) {
                arrayList.add(new JavaModuleWrapper(jSInstance, entry.getValue()));
            }
        }
        return arrayList;
    }

    public <T extends NativeModule> T getModule(Class<T> cls) {
        InterfaceC9101dL0 interfaceC9101dL0 = (InterfaceC9101dL0) cls.getAnnotation(InterfaceC9101dL0.class);
        if (interfaceC9101dL0 == null) {
            throw new IllegalArgumentException("Could not find @ReactModule annotation in class ".concat(cls.getName()));
        }
        ModuleHolder moduleHolder = this.mModules.get(interfaceC9101dL0.name());
        UN1.m8000d(moduleHolder, interfaceC9101dL0.name() + " could not be found. Is it defined in " + cls.getName());
        return (T) moduleHolder.getModule();
    }

    public <T extends NativeModule> boolean hasModule(Class<T> cls) {
        return this.mModules.containsKey(((InterfaceC9101dL0) cls.getAnnotation(InterfaceC9101dL0.class)).name());
    }

    public void notifyJSInstanceDestroy() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread();
        MT1.m5371b("NativeModuleRegistry_notifyJSInstanceDestroy");
        try {
            Iterator<ModuleHolder> it = this.mModules.values().iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void notifyJSInstanceInitialized() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread.");
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        MT1.m5371b("NativeModuleRegistry_notifyJSInstanceInitialized");
        try {
            Iterator<ModuleHolder> it = this.mModules.values().iterator();
            while (it.hasNext()) {
                it.next().markInitializable();
            }
        } finally {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public void onBatchComplete() {
        ModuleHolder moduleHolder = this.mModules.get(UIManagerModule.NAME);
        if (moduleHolder == null || !moduleHolder.hasInstance()) {
            return;
        }
        ((OnBatchCompleteListener) moduleHolder.getModule()).onBatchComplete();
    }

    public void registerModules(NativeModuleRegistry nativeModuleRegistry) {
        UN1.m7998b(this.mReactApplicationContext.equals(nativeModuleRegistry.getReactApplicationContext()), "Extending native modules with non-matching application contexts.");
        for (Map.Entry<String, ModuleHolder> entry : nativeModuleRegistry.getModuleMap().entrySet()) {
            String key = entry.getKey();
            if (!this.mModules.containsKey(key)) {
                this.mModules.put(key, entry.getValue());
            }
        }
    }

    public boolean hasModule(String str) {
        return this.mModules.containsKey(str);
    }

    public NativeModule getModule(String str) {
        ModuleHolder moduleHolder = this.mModules.get(str);
        UN1.m8000d(moduleHolder, "Could not find module with name " + str);
        return moduleHolder.getModule();
    }
}
