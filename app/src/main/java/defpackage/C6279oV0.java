package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* renamed from: oV0 */
/* loaded from: classes.dex */
public final class C6279oV0 implements InterfaceC1845Xk1 {
    public final Application a;
    public final C1767Wk1 b;
    public final Bundle c;
    public final AbstractC0357Ei0 d;
    public final C5706lV0 e;

    public C6279oV0(Application application, InterfaceC6088nV0 interfaceC6088nV0, Bundle bundle) {
        C1767Wk1 c1767Wk1;
        O90.f(interfaceC6088nV0, "owner");
        this.e = interfaceC6088nV0.getSavedStateRegistry();
        this.d = interfaceC6088nV0.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (C1767Wk1.d == null) {
                C1767Wk1.d = new C1767Wk1(application);
            }
            c1767Wk1 = C1767Wk1.d;
            O90.c(c1767Wk1);
        } else {
            c1767Wk1 = new C1767Wk1(null);
        }
        this.b = c1767Wk1;
    }

    @Override // defpackage.InterfaceC1845Xk1
    public final AbstractC1611Uk1 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.InterfaceC1845Xk1
    public final AbstractC1611Uk1 b(Class cls, C0312Dt0 c0312Dt0) {
        S20 s20 = S20.f;
        LinkedHashMap linkedHashMap = c0312Dt0.a;
        String str = (String) linkedHashMap.get(s20);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(LB1.a) == null || linkedHashMap.get(LB1.b) == null) {
            if (this.d != null) {
                return c(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(C3759fN.g);
        boolean zIsAssignableFrom = I4.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? AbstractC6470pV0.a(AbstractC6470pV0.b, cls) : AbstractC6470pV0.a(AbstractC6470pV0.a, cls);
        return constructorA == null ? this.b.b(cls, c0312Dt0) : (!zIsAssignableFrom || application == null) ? AbstractC6470pV0.b(cls, constructorA, LB1.a(c0312Dt0)) : AbstractC6470pV0.b(cls, constructorA, application, LB1.a(c0312Dt0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC1611Uk1 c(Class cls, String str) throws IOException {
        Object obj;
        Application application;
        AbstractC0357Ei0 abstractC0357Ei0 = this.d;
        if (abstractC0357Ei0 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = I4.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.a == null) ? AbstractC6470pV0.a(AbstractC6470pV0.b, cls) : AbstractC6470pV0.a(AbstractC6470pV0.a, cls);
        if (constructorA == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (C5714lY.b == null) {
                C5714lY.b = new C5714lY(2);
            }
            C5714lY c5714lY = C5714lY.b;
            O90.c(c5714lY);
            return c5714lY.a(cls);
        }
        C5706lV0 c5706lV0 = this.e;
        O90.c(c5706lV0);
        Bundle bundle = this.c;
        Bundle bundleA = c5706lV0.a(str);
        Class[] clsArr = C3975gV0.f;
        C3975gV0 c3975gV0A = AbstractC5504kR1.a(bundleA, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, c3975gV0A);
        savedStateHandleController.a(abstractC0357Ei0, c5706lV0);
        EnumC0201Ci0 enumC0201Ci0 = ((a) abstractC0357Ei0).c;
        if (enumC0201Ci0 == EnumC0201Ci0.b || enumC0201Ci0.compareTo(EnumC0201Ci0.d) >= 0) {
            c5706lV0.d();
        } else {
            abstractC0357Ei0.a(new LegacySavedStateHandleController$tryToAddRecreator$1(abstractC0357Ei0, c5706lV0));
        }
        AbstractC1611Uk1 abstractC1611Uk1B = (!zIsAssignableFrom || (application = this.a) == null) ? AbstractC6470pV0.b(cls, constructorA, c3975gV0A) : AbstractC6470pV0.b(cls, constructorA, application, c3975gV0A);
        synchronized (abstractC1611Uk1B.a) {
            try {
                obj = abstractC1611Uk1B.a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == 0) {
                    abstractC1611Uk1B.a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            savedStateHandleController = obj;
        }
        if (abstractC1611Uk1B.c) {
            AbstractC1611Uk1.a(savedStateHandleController);
        }
        return abstractC1611Uk1B;
    }
}
