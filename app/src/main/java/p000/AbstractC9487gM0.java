package p000;

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
public abstract class AbstractC9487gM0 extends TurboModuleManagerDelegate {

    /* renamed from: a */
    public final ArrayList f27694a;

    /* renamed from: b */
    public final HashMap f27695b;

    /* renamed from: c */
    public final boolean f27696c;

    /* renamed from: d */
    public final boolean f27697d;

    /* renamed from: e */
    public final boolean f27698e;

    public AbstractC9487gM0(final BridgeReactContext bridgeReactContext, ArrayList arrayList, HybridData hybridData) {
        super(hybridData);
        this.f27694a = new ArrayList();
        this.f27695b = new HashMap();
        boolean z = false;
        boolean z2 = ReactFeatureFlags.enableBridgelessArchitecture && ReactFeatureFlags.unstable_useTurboModuleInterop;
        this.f27696c = z2;
        if (z2 && ReactFeatureFlags.unstable_useTurboModuleInteropForAllTurboModules) {
            z = true;
        }
        this.f27697d = z;
        this.f27698e = ReactFeatureFlags.unstable_enableTurboModuleSyncVoidMethods;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ZL0 zl0 = (ZL0) it.next();
            boolean z3 = zl0 instanceof AbstractC7279zg;
            HashMap map = this.f27695b;
            ArrayList arrayList2 = this.f27694a;
            if (z3) {
                final AbstractC7279zg abstractC7279zg = (AbstractC7279zg) zl0;
                InterfaceC9359fM0 interfaceC9359fM0 = new InterfaceC9359fM0() { // from class: cM0
                    @Override // p000.InterfaceC9359fM0
                    public final NativeModule getModule(String str) {
                        return abstractC7279zg.getModule(str, bridgeReactContext);
                    }
                };
                arrayList2.add(interfaceC9359fM0);
                map.put(interfaceC9359fM0, abstractC7279zg.getReactModuleInfoProvider().mo9721a());
            } else if (this.f27696c) {
                List<NativeModule> listCreateNativeModules = zl0.createNativeModules(bridgeReactContext);
                final HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                for (NativeModule nativeModule : listCreateNativeModules) {
                    Class<?> cls = nativeModule.getClass();
                    InterfaceC9101dL0 interfaceC9101dL0 = (InterfaceC9101dL0) cls.getAnnotation(InterfaceC9101dL0.class);
                    String strName = interfaceC9101dL0 != null ? interfaceC9101dL0.name() : nativeModule.getName();
                    map3.put(strName, interfaceC9101dL0 != null ? new ReactModuleInfo(strName, cls.getName(), interfaceC9101dL0.canOverrideExistingModule(), true, interfaceC9101dL0.isCxxModule(), TurboModule.class.isAssignableFrom(cls)) : new ReactModuleInfo(strName, cls.getName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), TurboModule.class.isAssignableFrom(cls)));
                    map2.put(strName, nativeModule);
                }
                InterfaceC9359fM0 interfaceC9359fM02 = new InterfaceC9359fM0() { // from class: dM0
                    @Override // p000.InterfaceC9359fM0
                    public final NativeModule getModule(String str) {
                        return (NativeModule) map2.get(str);
                    }
                };
                arrayList2.add(interfaceC9359fM02);
                map.put(interfaceC9359fM02, map3);
            }
        }
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final List getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f27694a.iterator();
        while (it.hasNext()) {
            for (ReactModuleInfo reactModuleInfo : ((Map) this.f27695b.get((InterfaceC9359fM0) it.next())).values()) {
                if (reactModuleInfo.f17919f && reactModuleInfo.f17917d) {
                    arrayList.add(reactModuleInfo.f17914a);
                }
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final NativeModule getLegacyModule(String str) {
        if (!this.f27696c) {
            return null;
        }
        Iterator it = this.f27694a.iterator();
        NativeModule nativeModule = null;
        while (it.hasNext()) {
            InterfaceC9359fM0 interfaceC9359fM0 = (InterfaceC9359fM0) it.next();
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f27695b.get(interfaceC9359fM0)).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.f17919f && (nativeModule == null || reactModuleInfo.f17916c)) {
                NativeModule module = interfaceC9359fM0.getModule(str);
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
        Iterator it = this.f27694a.iterator();
        Object obj = null;
        while (it.hasNext()) {
            InterfaceC9359fM0 interfaceC9359fM0 = (InterfaceC9359fM0) it.next();
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f27695b.get(interfaceC9359fM0)).get(str);
            if (reactModuleInfo != null && reactModuleInfo.f17919f && (obj == null || reactModuleInfo.f17916c)) {
                Object module = interfaceC9359fM0.getModule(str);
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
        return this.f27698e;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final boolean unstable_isLegacyModuleRegistered(String str) {
        Iterator it = this.f27694a.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f27695b.get((InterfaceC9359fM0) it.next())).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.f17919f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final boolean unstable_isModuleRegistered(String str) {
        Iterator it = this.f27694a.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f27695b.get((InterfaceC9359fM0) it.next())).get(str);
            if (reactModuleInfo != null && reactModuleInfo.f17919f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final boolean unstable_shouldEnableLegacyModuleInterop() {
        return this.f27696c;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public final boolean unstable_shouldRouteTurboModulesThroughLegacyModuleInterop() {
        return this.f27697d;
    }
}
