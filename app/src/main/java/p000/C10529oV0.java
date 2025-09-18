package p000;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1742a;
import androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1;
import androidx.lifecycle.SavedStateHandleController;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* renamed from: oV0 */
/* loaded from: classes.dex */
public final class C10529oV0 implements InterfaceC8531Xk1 {

    /* renamed from: a */
    public final Application f39039a;

    /* renamed from: b */
    public final C8479Wk1 f39040b;

    /* renamed from: c */
    public final Bundle f39041c;

    /* renamed from: d */
    public final AbstractC7538Ei0 f39042d;

    /* renamed from: e */
    public final C10145lV0 f39043e;

    public C10529oV0(Application application, InterfaceC10401nV0 interfaceC10401nV0, Bundle bundle) {
        C8479Wk1 c8479Wk1;
        O90.m5968f(interfaceC10401nV0, "owner");
        this.f39043e = interfaceC10401nV0.getSavedStateRegistry();
        this.f39042d = interfaceC10401nV0.getLifecycle();
        this.f39041c = bundle;
        this.f39039a = application;
        if (application != null) {
            if (C8479Wk1.f13371d == null) {
                C8479Wk1.f13371d = new C8479Wk1(application);
            }
            c8479Wk1 = C8479Wk1.f13371d;
            O90.m5965c(c8479Wk1);
        } else {
            c8479Wk1 = new C8479Wk1(null);
        }
        this.f39040b = c8479Wk1;
    }

    @Override // p000.InterfaceC8531Xk1
    /* renamed from: a */
    public final AbstractC8375Uk1 mo8847a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m23494c(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // p000.InterfaceC8531Xk1
    /* renamed from: b */
    public final AbstractC8375Uk1 mo8848b(Class cls, C7508Dt0 c7508Dt0) {
        S20 s20 = S20.f10543f;
        LinkedHashMap linkedHashMap = c7508Dt0.f27599a;
        String str = (String) linkedHashMap.get(s20);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(LB1.f6544a) == null || linkedHashMap.get(LB1.f6545b) == null) {
            if (this.f39042d != null) {
                return m23494c(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(C4049fN.f27162g);
        boolean zIsAssignableFrom = AbstractC0509I4.class.isAssignableFrom(cls);
        Constructor constructorM23810a = (!zIsAssignableFrom || application == null) ? AbstractC10657pV0.m23810a(AbstractC10657pV0.f40127b, cls) : AbstractC10657pV0.m23810a(AbstractC10657pV0.f40126a, cls);
        return constructorM23810a == null ? this.f39040b.mo8848b(cls, c7508Dt0) : (!zIsAssignableFrom || application == null) ? AbstractC10657pV0.m23811b(cls, constructorM23810a, LB1.m4917a(c7508Dt0)) : AbstractC10657pV0.m23811b(cls, constructorM23810a, application, LB1.m4917a(c7508Dt0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final AbstractC8375Uk1 m23494c(Class cls, String str) throws IOException {
        Object obj;
        Application application;
        AbstractC7538Ei0 abstractC7538Ei0 = this.f39042d;
        if (abstractC7538Ei0 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0509I4.class.isAssignableFrom(cls);
        Constructor constructorM23810a = (!zIsAssignableFrom || this.f39039a == null) ? AbstractC10657pV0.m23810a(AbstractC10657pV0.f40127b, cls) : AbstractC10657pV0.m23810a(AbstractC10657pV0.f40126a, cls);
        if (constructorM23810a == null) {
            if (this.f39039a != null) {
                return this.f39040b.mo8847a(cls);
            }
            if (C6370lY.f37105b == null) {
                C6370lY.f37105b = new C6370lY(2);
            }
            C6370lY c6370lY = C6370lY.f37105b;
            O90.m5965c(c6370lY);
            return c6370lY.mo8847a(cls);
        }
        C10145lV0 c10145lV0 = this.f39043e;
        O90.m5965c(c10145lV0);
        Bundle bundle = this.f39041c;
        Bundle bundleM22441a = c10145lV0.m22441a(str);
        Class[] clsArr = C9505gV0.f27813f;
        C9505gV0 c9505gV0M22211a = AbstractC10010kR1.m22211a(bundleM22441a, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, c9505gV0M22211a);
        savedStateHandleController.m10123a(abstractC7538Ei0, c10145lV0);
        EnumC7434Ci0 enumC7434Ci0 = ((C1742a) abstractC7538Ei0).f16309c;
        if (enumC7434Ci0 == EnumC7434Ci0.f1587b || enumC7434Ci0.compareTo(EnumC7434Ci0.f1589d) >= 0) {
            c10145lV0.m22444d();
        } else {
            abstractC7538Ei0.mo2368a(new LegacySavedStateHandleController$tryToAddRecreator$1(abstractC7538Ei0, c10145lV0));
        }
        AbstractC8375Uk1 abstractC8375Uk1M23811b = (!zIsAssignableFrom || (application = this.f39039a) == null) ? AbstractC10657pV0.m23811b(cls, constructorM23810a, c9505gV0M22211a) : AbstractC10657pV0.m23811b(cls, constructorM23810a, application, c9505gV0M22211a);
        synchronized (abstractC8375Uk1M23811b.f12019a) {
            try {
                obj = abstractC8375Uk1M23811b.f12019a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == 0) {
                    abstractC8375Uk1M23811b.f12019a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            savedStateHandleController = obj;
        }
        if (abstractC8375Uk1M23811b.f12021c) {
            AbstractC8375Uk1.m8137a(savedStateHandleController);
        }
        return abstractC8375Uk1M23811b;
    }
}
