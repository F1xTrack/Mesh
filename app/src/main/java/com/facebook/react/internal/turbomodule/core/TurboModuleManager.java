package com.facebook.react.internal.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.internal.turbomodule.core.TurboModuleInteropUtils;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.AbstractC3929dS;
import p000.AbstractC7222ym;
import p000.InterfaceC0965PK;
import p000.UN1;

/* loaded from: classes.dex */
public class TurboModuleManager implements TurboModuleRegistry {
    private final TurboModuleManagerDelegate mDelegate;
    private final List<String> mEagerInitModuleNames;

    @InterfaceC0965PK
    private final HybridData mHybridData;
    private final ModuleProvider mLegacyModuleProvider;
    private final Object mModuleCleanupLock = new Object();
    private boolean mModuleCleanupStarted = false;
    private final Map<String, ModuleHolder> mModuleHolders = new HashMap();
    private final ModuleProvider mTurboModuleProvider;

    public static class ModuleHolder {
        private static volatile int sHolderCount;
        private volatile NativeModule mModule = null;
        private volatile boolean mIsTryingToCreate = false;
        private volatile boolean mIsDoneCreatingModule = false;
        private volatile int mModuleId = sHolderCount;

        public ModuleHolder() {
            sHolderCount++;
        }

        public void endCreatingModule() {
            this.mIsTryingToCreate = false;
            this.mIsDoneCreatingModule = true;
        }

        public NativeModule getModule() {
            return this.mModule;
        }

        public int getModuleId() {
            return this.mModuleId;
        }

        public boolean isCreatingModule() {
            return this.mIsTryingToCreate;
        }

        public boolean isDoneCreatingModule() {
            return this.mIsDoneCreatingModule;
        }

        public void setModule(NativeModule nativeModule) {
            this.mModule = nativeModule;
        }

        public void startCreatingModule() {
            this.mIsTryingToCreate = true;
        }
    }

    public interface ModuleProvider {
        NativeModule getModule(String str);
    }

    static {
        NativeModuleSoLoader.maybeLoadSoLibrary();
    }

    public TurboModuleManager(RuntimeExecutor runtimeExecutor, final TurboModuleManagerDelegate turboModuleManagerDelegate, CallInvokerHolder callInvokerHolder, NativeMethodCallInvokerHolder nativeMethodCallInvokerHolder) {
        ModuleProvider moduleProvider;
        this.mDelegate = turboModuleManagerDelegate;
        this.mHybridData = initHybrid(runtimeExecutor, (CallInvokerHolderImpl) callInvokerHolder, (NativeMethodCallInvokerHolderImpl) nativeMethodCallInvokerHolder, turboModuleManagerDelegate);
        installJSIBindings(shouldEnableLegacyModuleInterop(), enableSyncVoidMethods());
        this.mEagerInitModuleNames = turboModuleManagerDelegate == null ? new ArrayList<>() : turboModuleManagerDelegate.getEagerInitModuleNames();
        ModuleProvider c1927a = new C1927a();
        if (turboModuleManagerDelegate == null) {
            moduleProvider = c1927a;
        } else {
            final int i = 0;
            moduleProvider = new ModuleProvider() { // from class: com.facebook.react.internal.turbomodule.core.b
                @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
                public final NativeModule getModule(String str) {
                    switch (i) {
                        case 0:
                            return TurboModuleManager.lambda$new$1(turboModuleManagerDelegate, str);
                        default:
                            return TurboModuleManager.lambda$new$2(turboModuleManagerDelegate, str);
                    }
                }
            };
        }
        this.mTurboModuleProvider = moduleProvider;
        if (turboModuleManagerDelegate != null && shouldEnableLegacyModuleInterop()) {
            final int i2 = 1;
            c1927a = new ModuleProvider() { // from class: com.facebook.react.internal.turbomodule.core.b
                @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
                public final NativeModule getModule(String str) {
                    switch (i2) {
                        case 0:
                            return TurboModuleManager.lambda$new$1(turboModuleManagerDelegate, str);
                        default:
                            return TurboModuleManager.lambda$new$2(turboModuleManagerDelegate, str);
                    }
                }
            };
        }
        this.mLegacyModuleProvider = c1927a;
    }

    private boolean enableSyncVoidMethods() {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.mDelegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_enableSyncVoidMethods();
    }

    @InterfaceC0965PK
    private CxxModuleWrapper getLegacyCxxModule(String str) {
        if (shouldRouteTurboModulesThroughLegacyModuleInterop()) {
            NativeModule module = getModule(str);
            if (module instanceof CxxModuleWrapper) {
                return (CxxModuleWrapper) module;
            }
            return null;
        }
        if (!isLegacyModule(str)) {
            return null;
        }
        NativeModule module2 = getModule(str);
        if (!(module2 instanceof CxxModuleWrapper) || (module2 instanceof TurboModule)) {
            return null;
        }
        return (CxxModuleWrapper) module2;
    }

    @InterfaceC0965PK
    private NativeModule getLegacyJavaModule(String str) {
        if (shouldRouteTurboModulesThroughLegacyModuleInterop()) {
            NativeModule module = getModule(str);
            if (module instanceof CxxModuleWrapper) {
                return null;
            }
            return module;
        }
        if (!isLegacyModule(str)) {
            return null;
        }
        NativeModule module2 = getModule(str);
        if ((module2 instanceof CxxModuleWrapper) || (module2 instanceof TurboModule)) {
            return null;
        }
        return module2;
    }

    @InterfaceC0965PK
    private static List<TurboModuleInteropUtils.MethodDescriptor> getMethodDescriptorsFromModule(NativeModule nativeModule) {
        return TurboModuleInteropUtils.getMethodDescriptorsFromModule(nativeModule);
    }

    private NativeModule getOrCreateModule(String str, ModuleHolder moduleHolder, boolean z) {
        boolean z2;
        NativeModule module;
        synchronized (moduleHolder) {
            try {
                if (moduleHolder.isDoneCreatingModule()) {
                    if (z) {
                        TurboModulePerfLogger.moduleCreateCacheHit(str, moduleHolder.getModuleId());
                    }
                    return moduleHolder.getModule();
                }
                boolean z3 = false;
                if (moduleHolder.isCreatingModule()) {
                    z2 = false;
                } else {
                    moduleHolder.startCreatingModule();
                    z2 = true;
                }
                if (!z2) {
                    synchronized (moduleHolder) {
                        while (moduleHolder.isCreatingModule()) {
                            try {
                                moduleHolder.wait();
                            } catch (InterruptedException unused) {
                                z3 = true;
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                        module = moduleHolder.getModule();
                    }
                    return module;
                }
                TurboModulePerfLogger.moduleCreateConstructStart(str, moduleHolder.getModuleId());
                NativeModule module2 = this.mTurboModuleProvider.getModule(str);
                if (module2 == null) {
                    module2 = this.mLegacyModuleProvider.getModule(str);
                }
                TurboModulePerfLogger.moduleCreateConstructEnd(str, moduleHolder.getModuleId());
                TurboModulePerfLogger.moduleCreateSetUpStart(str, moduleHolder.getModuleId());
                if (module2 != null) {
                    synchronized (moduleHolder) {
                        moduleHolder.setModule(module2);
                    }
                    module2.initialize();
                } else {
                    StringBuilder sbM26240q = AbstractC7222ym.m26240q("getOrCreateModule(): Unable to create module \"", str, "\". Was legacy: ");
                    sbM26240q.append(isLegacyModule(str));
                    sbM26240q.append(". Was turbo: ");
                    logError(AbstractC7222ym.m26236m(sbM26240q, isTurboModule(str), "."));
                }
                TurboModulePerfLogger.moduleCreateSetUpEnd(str, moduleHolder.getModuleId());
                synchronized (moduleHolder) {
                    moduleHolder.endCreatingModule();
                    moduleHolder.notifyAll();
                }
                return module2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC0965PK
    private TurboModule getTurboJavaModule(String str) {
        if (shouldRouteTurboModulesThroughLegacyModuleInterop() || !isTurboModule(str)) {
            return null;
        }
        NativeModule module = getModule(str);
        if ((module instanceof CxxModuleWrapper) || !(module instanceof TurboModule)) {
            return null;
        }
        return (TurboModule) module;
    }

    @InterfaceC0965PK
    private CxxModuleWrapper getTurboLegacyCxxModule(String str) {
        if (shouldRouteTurboModulesThroughLegacyModuleInterop() || !isTurboModule(str)) {
            return null;
        }
        NativeModule module = getModule(str);
        if ((module instanceof CxxModuleWrapper) && (module instanceof TurboModule)) {
            return (CxxModuleWrapper) module;
        }
        return null;
    }

    private native HybridData initHybrid(RuntimeExecutor runtimeExecutor, CallInvokerHolderImpl callInvokerHolderImpl, NativeMethodCallInvokerHolderImpl nativeMethodCallInvokerHolderImpl, TurboModuleManagerDelegate turboModuleManagerDelegate);

    private native void installJSIBindings(boolean z, boolean z2);

    private boolean isLegacyModule(String str) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.mDelegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isLegacyModuleRegistered(str);
    }

    private boolean isTurboModule(String str) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.mDelegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isModuleRegistered(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NativeModule lambda$new$0(String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NativeModule lambda$new$1(TurboModuleManagerDelegate turboModuleManagerDelegate, String str) {
        return (NativeModule) turboModuleManagerDelegate.getModule(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NativeModule lambda$new$2(TurboModuleManagerDelegate turboModuleManagerDelegate, String str) {
        NativeModule legacyModule = turboModuleManagerDelegate.getLegacyModule(str);
        if (legacyModule == null) {
            return null;
        }
        UN1.m7998b(!(legacyModule instanceof TurboModule), "NativeModule \"" + str + "\" is a TurboModule");
        return legacyModule;
    }

    private void logError(String str) {
        AbstractC3929dS.m17672e("TurboModuleManager");
        if (shouldRouteTurboModulesThroughLegacyModuleInterop()) {
            ReactSoftExceptionLogger.logSoftException("TurboModuleManager", new ReactNoCrashSoftException(str));
        }
    }

    private boolean shouldEnableLegacyModuleInterop() {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.mDelegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_shouldEnableLegacyModuleInterop();
    }

    private boolean shouldRouteTurboModulesThroughLegacyModuleInterop() {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.mDelegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_shouldRouteTurboModulesThroughLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public List<String> getEagerInitModuleNames() {
        return this.mEagerInitModuleNames;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public NativeModule getModule(String str) {
        synchronized (this.mModuleCleanupLock) {
            try {
                if (this.mModuleCleanupStarted) {
                    logError("getModule(): Tried to get module \"" + str + "\", but TurboModuleManager was tearing down. Returning null. Was legacy: " + isLegacyModule(str) + ". Was turbo: " + isTurboModule(str) + ".");
                    return null;
                }
                if (!this.mModuleHolders.containsKey(str)) {
                    this.mModuleHolders.put(str, new ModuleHolder());
                }
                ModuleHolder moduleHolder = this.mModuleHolders.get(str);
                TurboModulePerfLogger.moduleCreateStart(str, moduleHolder.getModuleId());
                NativeModule orCreateModule = getOrCreateModule(str, moduleHolder, true);
                if (orCreateModule != null) {
                    TurboModulePerfLogger.moduleCreateEnd(str, moduleHolder.getModuleId());
                } else {
                    TurboModulePerfLogger.moduleCreateFail(str, moduleHolder.getModuleId());
                }
                return orCreateModule;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public Collection<NativeModule> getModules() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mModuleCleanupLock) {
            arrayList.addAll(this.mModuleHolders.values());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ModuleHolder moduleHolder = (ModuleHolder) it.next();
            synchronized (moduleHolder) {
                try {
                    if (moduleHolder.getModule() != null) {
                        arrayList2.add(moduleHolder.getModule());
                    }
                } finally {
                }
            }
        }
        return arrayList2;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public boolean hasModule(String str) {
        ModuleHolder moduleHolder;
        synchronized (this.mModuleCleanupLock) {
            moduleHolder = this.mModuleHolders.get(str);
        }
        if (moduleHolder == null) {
            return false;
        }
        synchronized (moduleHolder) {
            try {
                return moduleHolder.getModule() != null;
            } finally {
            }
        }
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public void invalidate() {
        synchronized (this.mModuleCleanupLock) {
            this.mModuleCleanupStarted = true;
        }
        for (Map.Entry<String, ModuleHolder> entry : this.mModuleHolders.entrySet()) {
            NativeModule orCreateModule = getOrCreateModule(entry.getKey(), entry.getValue(), false);
            if (orCreateModule != null) {
                orCreateModule.invalidate();
            }
        }
        this.mModuleHolders.clear();
        this.mHybridData.resetNative();
    }
}
