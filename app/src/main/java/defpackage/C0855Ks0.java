package defpackage;

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
public final class C0855Ks0 implements ZL0 {
    public CC0 a;
    public ReactAdapterPackage b;
    public NativeModulesProxy c;
    public ArrayList d;

    public final synchronized NativeModulesProxy a(ReactApplicationContext reactApplicationContext, C0777Js0 c0777Js0) {
        try {
            NativeModulesProxy nativeModulesProxy = this.c;
            if (nativeModulesProxy != null && nativeModulesProxy.getReactContext() != reactApplicationContext) {
                this.c = null;
            }
            if (this.c == null) {
                NativeModulesProxy nativeModulesProxy2 = new NativeModulesProxy(reactApplicationContext, c0777Js0 != null ? c0777Js0 : this.a.O0(reactApplicationContext));
                this.c = nativeModulesProxy2;
                C0117Bg0 kotlinInteropModuleRegistry = nativeModulesProxy2.getKotlinInteropModuleRegistry();
                NativeModulesProxy nativeModulesProxy3 = this.c;
                kotlinInteropModuleRegistry.getClass();
                O90.f(nativeModulesProxy3, "proxyModule");
                kotlinInteropModuleRegistry.a.n = new WeakReference(nativeModulesProxy3);
            }
            if (c0777Js0 != null && c0777Js0 != this.c.getModuleRegistry()) {
                AbstractC7131sz.a.a("❌ NativeModuleProxy was configured with a different instance of the modules registry.", null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    @Override // defpackage.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        NativeModulesProxy nativeModulesProxyA = a(reactApplicationContext, null);
        C0777Js0 moduleRegistry = nativeModulesProxyA.getModuleRegistry();
        for (D90 d90 : this.b.e(reactApplicationContext)) {
            moduleRegistry.getClass();
            Iterator it = d90.a().iterator();
            while (it.hasNext()) {
                moduleRegistry.a.put((Class) it.next(), d90);
            }
        }
        ArrayList arrayList = new ArrayList(2);
        NativeModulesProxy nativeModulesProxyA2 = a(reactApplicationContext, moduleRegistry);
        arrayList.add(nativeModulesProxyA2);
        arrayList.add(new ModuleRegistryReadyNotifier(moduleRegistry));
        Iterator it2 = ((C4139hM0) moduleRegistry.a.get(C4139hM0.class)).a.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(((ZL0) it2.next()).createNativeModules(reactApplicationContext));
        }
        arrayList.add(new ExpoBridgeModule(reactApplicationContext, new WeakReference(nativeModulesProxyA2)));
        if (this.d != null) {
            C0117Bg0 kotlinInteropModuleRegistry = nativeModulesProxyA.getKotlinInteropModuleRegistry();
            ArrayList arrayList2 = this.d;
            kotlinInteropModuleRegistry.getClass();
            O90.f(arrayList2, "viewWrapperHolders");
            Trace.beginSection(OY1.f("[ExpoModulesCore] KotlinInteropModuleRegistry.updateModuleHoldersInViewManagers"));
            try {
                ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(arrayList2));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((InterfaceC0601Hl1) it3.next()).getViewWrapperDelegate());
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    AbstractC0910Lk1 abstractC0910Lk1 = (AbstractC0910Lk1) it4.next();
                    C0387Es0 c0387Es0I = kotlinInteropModuleRegistry.a.c.i(abstractC0910Lk1.a.b.a);
                    if (c0387Es0I == null) {
                        throw new IllegalArgumentException(("Cannot update the module holder for " + abstractC0910Lk1.a.b.a + ".").toString());
                    }
                    abstractC0910Lk1.a = c0387Es0I;
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        return arrayList;
    }

    @Override // defpackage.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        CC0 cc0 = this.a;
        HashSet hashSet = (HashSet) cc0.c;
        if (hashSet == null) {
            cc0.c = new HashSet();
            for (InterfaceC8275yz0 interfaceC8275yz0 : (List) cc0.b) {
                if (interfaceC8275yz0 instanceof ZL0) {
                    ((HashSet) cc0.c).addAll(((ZL0) interfaceC8275yz0).createViewManagers(reactApplicationContext));
                }
            }
            hashSet = (HashSet) cc0.c;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        NativeModulesProxy nativeModulesProxyA = a(reactApplicationContext, null);
        Objects.requireNonNull(nativeModulesProxyA);
        C0117Bg0 kotlinInteropModuleRegistry = nativeModulesProxyA.getKotlinInteropModuleRegistry();
        kotlinInteropModuleRegistry.getClass();
        Trace.beginSection(OY1.f("[ExpoModulesCore] KotlinInteropModuleRegistry.exportViewManagers"));
        try {
            C0699Is0 c0699Is0 = kotlinInteropModuleRegistry.a.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = c0699Is0.iterator();
            while (it.hasNext()) {
                ((C0387Es0) it.next()).b.getClass();
            }
            ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(arrayList2));
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                C0387Es0 c0387Es0 = (C0387Es0) it2.next();
                O90.f(c0387Es0, "moduleHolder");
                c0387Es0.b.getClass();
                O90.c(null);
                throw null;
            }
            Trace.endSection();
            Trace.beginSection(OY1.f("[ExpoModulesCore] KotlinInteropModuleRegistry.extractViewManagersDelegateHolders"));
            try {
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof InterfaceC0601Hl1) {
                        arrayList4.add(next);
                    }
                }
                Trace.endSection();
                this.d = arrayList4;
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
