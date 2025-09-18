package androidx.savedstate;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p000.AbstractC7187yD;
import p000.AbstractC7222ym;
import p000.AbstractC8375Uk1;
import p000.C10145lV0;
import p000.C8583Yk1;
import p000.EnumC7382Bi0;
import p000.InterfaceC10401nV0;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7902Li0;
import p000.InterfaceC8635Zk1;
import p000.InterfaceC9889jV0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m22267d2 = {"Landroidx/savedstate/Recreator;", "LIi0;", "g6", "savedstate_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC7746Ii0 {

    /* renamed from: a */
    public final InterfaceC10401nV0 f16561a;

    public Recreator(InterfaceC10401nV0 interfaceC10401nV0) {
        this.f16561a = interfaceC10401nV0;
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (enumC7382Bi0 != EnumC7382Bi0.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC7902Li0.getLifecycle().mo2369b(this);
        InterfaceC10401nV0 interfaceC10401nV0 = this.f16561a;
        Bundle bundleM22441a = interfaceC10401nV0.getSavedStateRegistry().m22441a("androidx.savedstate.Restarter");
        if (bundleM22441a == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM22441a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC9889jV0.class);
                O90.m5967e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        O90.m5967e(objNewInstance, "{\n                constr…wInstance()\n            }");
                        if (!(interfaceC10401nV0 instanceof InterfaceC8635Zk1)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        C8583Yk1 viewModelStore = ((InterfaceC8635Zk1) interfaceC10401nV0).getViewModelStore();
                        C10145lV0 savedStateRegistry = interfaceC10401nV0.getSavedStateRegistry();
                        viewModelStore.getClass();
                        LinkedHashMap linkedHashMap = viewModelStore.f14501a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            O90.m5968f(str2, "key");
                            AbstractC8375Uk1 abstractC8375Uk1 = (AbstractC8375Uk1) linkedHashMap.get(str2);
                            O90.m5965c(abstractC8375Uk1);
                            AbstractC7187yD.m26095a(abstractC8375Uk1, savedStateRegistry, interfaceC10401nV0.getLifecycle());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            savedStateRegistry.m22444d();
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(AbstractC7222ym.m26245v("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(AbstractC7222ym.m26234k("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
