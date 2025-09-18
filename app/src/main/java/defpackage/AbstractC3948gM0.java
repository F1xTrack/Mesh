package defpackage;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: gM0 */
/* loaded from: classes.dex */
public abstract class AbstractC3948gM0 extends TurboModuleManagerDelegate {
    public final ArrayList a;
    public final HashMap b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public AbstractC3948gM0(final BridgeReactContext bridgeReactContext, ArrayList arrayList, HybridData hybridData) {
        super(hybridData);
        this.a = new ArrayList();
        this.b = new HashMap();
        boolean z = false;
        boolean z2 = ReactFeatureFlags.enableBridgelessArchitecture && ReactFeatureFlags.unstable_useTurboModuleInterop;
        this.c = z2;
        if (z2 && ReactFeatureFlags.unstable_useTurboModuleInteropForAllTurboModules) {
            z = true;
        }
        this.d = z;
        this.e = ReactFeatureFlags.unstable_enableTurboModuleSyncVoidMethods;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ZL0 zl0 = (ZL0) it.next();
            boolean z3 = zl0 instanceof AbstractC8407zg;
            HashMap map = this.b;
            ArrayList arrayList2 = this.a;
            if (z3) {
                final AbstractC8407zg abstractC8407zg = (AbstractC8407zg) zl0;
                InterfaceC3757fM0 interfaceC3757fM0 = new InterfaceC3757fM0() { // from class: cM0
                    @Override // defpackage.InterfaceC3757fM0
                    public final NativeModule getModule(String str) {
                        return abstractC8407zg.getModule(str, bridgeReactContext);
                    }
                };
                arrayList2.add(interfaceC3757fM0);
                map.put(interfaceC3757fM0, abstractC8407zg.getReactModuleInfoProvider().a());
            } else if (this.c) {
                List<NativeModule> listCreateNativeModules = zl0.createNativeModules(bridgeReactContext);
                final HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                for (NativeModule nativeModule : listCreateNativeModules) {
                    Class<?> cls = nativeModule.getClass();
                    InterfaceC3373dL0 interfaceC3373dL0 = (InterfaceC3373dL0) cls.getAnnotation(InterfaceC3373dL0.class);
                    String strName = interfaceC3373dL0 != null ? interfaceC3373dL0.name() : nativeModule.getName();
                    map3.put(strName, interfaceC3373dL0 != null ? new ReactModuleInfo(strName, cls.getName(), interfaceC3373dL0.canOverrideExistingModule(), true, interfaceC3373dL0.isCxxModule(), TurboModule.class.isAssignableFrom(cls)) : new ReactModuleInfo(strName, cls.getName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), TurboModule.class.isAssignableFrom(cls)));
                    map2.put(strName, nativeModule);
                }
                InterfaceC3757fM0 interfaceC3757fM02 = new InterfaceC3757fM0() { // from class: dM0
                    @Override // defpackage.InterfaceC3757fM0
                    public final NativeModule getModule(String str) {
                        return (NativeModule) map2.get(str);
                    }
                };
                arrayList2.add(interfaceC3757fM02);
                map.put(interfaceC3757fM02, map3);
            }
        }
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final List getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            for (ReactModuleInfo reactModuleInfo : ((Map) this.b.get((InterfaceC3757fM0) it.next())).values()) {
                if (reactModuleInfo.f && reactModuleInfo.d) {
                    arrayList.add(reactModuleInfo.a);
                }
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final NativeModule getLegacyModule(String str) {
        if (!this.c) {
            return null;
        }
        Iterator it = this.a.iterator();
        NativeModule nativeModule = null;
        while (it.hasNext()) {
            InterfaceC3757fM0 interfaceC3757fM0 = (InterfaceC3757fM0) it.next();
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.b.get(interfaceC3757fM0)).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.f && (nativeModule == null || reactModuleInfo.c)) {
                NativeModule module = interfaceC3757fM0.getModule(str);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return null;
        }
        return nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final TurboModule getModule(String str) {
        Iterator it = this.a.iterator();
        Object obj = null;
        while (it.hasNext()) {
            InterfaceC3757fM0 interfaceC3757fM0 = (InterfaceC3757fM0) it.next();
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.b.get(interfaceC3757fM0)).get(str);
            if (reactModuleInfo != null && reactModuleInfo.f && (obj == null || reactModuleInfo.c)) {
                Object module = interfaceC3757fM0.getModule(str);
                if (module != null) {
                    obj = module;
                }
            }
        }
        if (obj instanceof TurboModule) {
            return (TurboModule) obj;
        }
        return null;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final boolean unstable_enableSyncVoidMethods() {
        return this.e;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final boolean unstable_isLegacyModuleRegistered(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.b.get((InterfaceC3757fM0) it.next())).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final boolean unstable_isModuleRegistered(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.b.get((InterfaceC3757fM0) it.next())).get(str);
            if (reactModuleInfo != null && reactModuleInfo.f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final boolean unstable_shouldEnableLegacyModuleInterop() {
        return this.c;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final boolean unstable_shouldRouteTurboModulesThroughLegacyModuleInterop() {
        return this.d;
    }
}
