package p000;

import android.os.Trace;
import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.adapters.react.ModuleRegistryReadyNotifier;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.adapters.react.ReactAdapterPackage;
import expo.modules.kotlin.ExpoBridgeModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: Ks0 */
/* loaded from: classes2.dex */
public final class C7870Ks0 implements ZL0 {

    /* renamed from: a */
    public CC0 f6367a;

    /* renamed from: b */
    public ReactAdapterPackage f6368b;

    /* renamed from: c */
    public NativeModulesProxy f6369c;

    /* renamed from: d */
    public ArrayList f6370d;

    /* renamed from: a */
    public final synchronized NativeModulesProxy m4775a(ReactApplicationContext reactApplicationContext, C7818Js0 c7818Js0) {
        try {
            NativeModulesProxy nativeModulesProxy = this.f6369c;
            if (nativeModulesProxy != null && nativeModulesProxy.getReactContext() != reactApplicationContext) {
                this.f6369c = null;
            }
            if (this.f6369c == null) {
                NativeModulesProxy nativeModulesProxy2 = new NativeModulesProxy(reactApplicationContext, c7818Js0 != null ? c7818Js0 : this.f6367a.m1033O0(reactApplicationContext));
                this.f6369c = nativeModulesProxy2;
                C7378Bg0 kotlinInteropModuleRegistry = nativeModulesProxy2.getKotlinInteropModuleRegistry();
                NativeModulesProxy nativeModulesProxy3 = this.f6369c;
                kotlinInteropModuleRegistry.getClass();
                O90.m5968f(nativeModulesProxy3, "proxyModule");
                kotlinInteropModuleRegistry.f971a.f1209n = new WeakReference(nativeModulesProxy3);
            }
            if (c7818Js0 != null && c7818Js0 != this.f6369c.getModuleRegistry()) {
                AbstractC6857sz.f42743a.m5471a("❌ NativeModuleProxy was configured with a different instance of the modules registry.", null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6369c;
    }

    @Override // p000.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        NativeModulesProxy nativeModulesProxyM4775a = m4775a(reactApplicationContext, null);
        C7818Js0 moduleRegistry = nativeModulesProxyM4775a.getModuleRegistry();
        for (D90 d90 : this.f6368b.mo18082e(reactApplicationContext)) {
            moduleRegistry.getClass();
            Iterator it = d90.mo174a().iterator();
            while (it.hasNext()) {
                moduleRegistry.f5762a.put((Class) it.next(), d90);
            }
        }
        ArrayList arrayList = new ArrayList(2);
        NativeModulesProxy nativeModulesProxyM4775a2 = m4775a(reactApplicationContext, moduleRegistry);
        arrayList.add(nativeModulesProxyM4775a2);
        arrayList.add(new ModuleRegistryReadyNotifier(moduleRegistry));
        Iterator it2 = ((C9615hM0) moduleRegistry.f5762a.get(C9615hM0.class)).f28396a.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(((ZL0) it2.next()).createNativeModules(reactApplicationContext));
        }
        arrayList.add(new ExpoBridgeModule(reactApplicationContext, new WeakReference(nativeModulesProxyM4775a2)));
        if (this.f6370d != null) {
            C7378Bg0 kotlinInteropModuleRegistry = nativeModulesProxyM4775a.getKotlinInteropModuleRegistry();
            ArrayList arrayList2 = this.f6370d;
            kotlinInteropModuleRegistry.getClass();
            O90.m5968f(arrayList2, "viewWrapperHolders");
            Trace.beginSection(OY1.m6088f("[ExpoModulesCore] KotlinInteropModuleRegistry.updateModuleHoldersInViewManagers"));
            try {
                ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(arrayList2));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((InterfaceC7701Hl1) it3.next()).getViewWrapperDelegate());
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    AbstractC7907Lk1 abstractC7907Lk1 = (AbstractC7907Lk1) it4.next();
                    C7558Es0 c7558Es0M4060i = kotlinInteropModuleRegistry.f971a.f1198c.m4060i(abstractC7907Lk1.f6826a.f2934b.f454a);
                    if (c7558Es0M4060i == null) {
                        throw new IllegalArgumentException(("Cannot update the module holder for " + abstractC7907Lk1.f6826a.f2934b.f454a + ".").toString());
                    }
                    abstractC7907Lk1.f6826a = c7558Es0M4060i;
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        return arrayList;
    }

    @Override // p000.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        CC0 cc0 = this.f6367a;
        HashSet hashSet = (HashSet) cc0.f1251c;
        if (hashSet == null) {
            cc0.f1251c = new HashSet();
            for (InterfaceC11866yz0 interfaceC11866yz0 : (List) cc0.f1250b) {
                if (interfaceC11866yz0 instanceof ZL0) {
                    ((HashSet) cc0.f1251c).addAll(((ZL0) interfaceC11866yz0).createViewManagers(reactApplicationContext));
                }
            }
            hashSet = (HashSet) cc0.f1251c;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        NativeModulesProxy nativeModulesProxyM4775a = m4775a(reactApplicationContext, null);
        Objects.requireNonNull(nativeModulesProxyM4775a);
        C7378Bg0 kotlinInteropModuleRegistry = nativeModulesProxyM4775a.getKotlinInteropModuleRegistry();
        kotlinInteropModuleRegistry.getClass();
        Trace.beginSection(OY1.m6088f("[ExpoModulesCore] KotlinInteropModuleRegistry.exportViewManagers"));
        try {
            C7766Is0 c7766Is0 = kotlinInteropModuleRegistry.f971a.f1198c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = c7766Is0.iterator();
            while (it.hasNext()) {
                ((C7558Es0) it.next()).f2934b.getClass();
            }
            ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(arrayList2));
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                C7558Es0 c7558Es0 = (C7558Es0) it2.next();
                O90.m5968f(c7558Es0, "moduleHolder");
                c7558Es0.f2934b.getClass();
                O90.m5965c(null);
                throw null;
            }
            Trace.endSection();
            Trace.beginSection(OY1.m6088f("[ExpoModulesCore] KotlinInteropModuleRegistry.extractViewManagersDelegateHolders"));
            try {
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof InterfaceC7701Hl1) {
                        arrayList4.add(next);
                    }
                }
                Trace.endSection();
                this.f6370d = arrayList4;
                arrayList.addAll(arrayList3);
                return arrayList;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
