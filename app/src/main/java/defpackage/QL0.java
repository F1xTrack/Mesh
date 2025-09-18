package defpackage;

import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.UIManagerProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.mes.dnevnik.MainApplication;

/* loaded from: classes2.dex */
public final class QL0 extends PL0 {
    public final C0525Gm0 c;
    public final ArrayList d;
    public final C7925x8 e;

    public QL0(MainApplication mainApplication, C0525Gm0 c0525Gm0) {
        super(mainApplication);
        this.c = c0525Gm0;
        F71 f71 = C6457pR.b;
        List listA = S02.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            List listA2 = ((InterfaceC8275yz0) it.next()).a();
            O90.e(listA2, "createReactNativeHostHandlers(...)");
            AbstractC0314Du.m(arrayList, listA2);
        }
        this.d = arrayList;
        this.e = new C7925x8();
    }

    @Override // defpackage.PL0
    public final boolean b() {
        this.c.getClass();
        return true;
    }

    @Override // defpackage.PL0
    public final OL0 c() {
        this.c.getClass();
        return new OL0(0);
    }

    @Override // defpackage.PL0
    public final QK0 createReactInstanceManager() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        boolean zD = d();
        ArrayList arrayList = this.d;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
        QK0 qk0CreateReactInstanceManager = super.createReactInstanceManager();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            InterfaceC2490cJ interfaceC2490cJ = qk0CreateReactInstanceManager.i;
            throw null;
        }
        qk0CreateReactInstanceManager.a(new RL0(this, zD));
        Field declaredField = PL0.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this.c, qk0CreateReactInstanceManager);
        return qk0CreateReactInstanceManager;
    }

    @Override // defpackage.PL0
    public final boolean d() {
        Boolean bool = (Boolean) AbstractC4175hY0.h(AbstractC4175hY0.m(AbstractC8069xu.t(this.d), C3808fd0.B));
        if (bool != null) {
            return bool.booleanValue();
        }
        this.c.getClass();
        return false;
    }

    public final Object f(String str) throws NoSuchMethodException, SecurityException {
        C7925x8 c7925x8 = this.e;
        Method declaredMethod = (Method) c7925x8.getOrDefault(str, null);
        if (declaredMethod == null) {
            declaredMethod = PL0.class.getDeclaredMethod(str, null);
            declaredMethod.setAccessible(true);
            c7925x8.put(str, declaredMethod);
        }
        return declaredMethod.invoke(this.c, null);
    }

    @Override // defpackage.PL0
    public final String getBundleAssetName() {
        String str = (String) AbstractC4175hY0.h(AbstractC4175hY0.m(AbstractC8069xu.t(this.d), new SL0(this, 0)));
        return str == null ? (String) f("getBundleAssetName") : str;
    }

    @Override // defpackage.PL0
    public final InterfaceC3366dJ getDevSupportManagerFactory() {
        InterfaceC3366dJ interfaceC3366dJ = (InterfaceC3366dJ) AbstractC4175hY0.h(AbstractC4175hY0.m(AbstractC8069xu.t(this.d), C3808fd0.z));
        return interfaceC3366dJ == null ? (InterfaceC3366dJ) f("getDevSupportManagerFactory") : interfaceC3366dJ;
    }

    @Override // defpackage.PL0
    public final String getJSBundleFile() {
        String str = (String) AbstractC4175hY0.h(AbstractC4175hY0.m(AbstractC8069xu.t(this.d), new SL0(this, 1)));
        return str == null ? (String) f("getJSBundleFile") : str;
    }

    @Override // defpackage.PL0
    public final EnumC8200ya0 getJSEngineResolutionAlgorithm() {
        return (EnumC8200ya0) f("getJSEngineResolutionAlgorithm");
    }

    @Override // defpackage.PL0
    public final String getJSMainModuleName() {
        return (String) f("getJSMainModuleName");
    }

    @Override // defpackage.PL0
    public final JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        JavaScriptExecutorFactory javaScriptExecutorFactory = (JavaScriptExecutorFactory) AbstractC4175hY0.h(AbstractC4175hY0.m(AbstractC8069xu.t(this.d), C3808fd0.A));
        return javaScriptExecutorFactory == null ? (JavaScriptExecutorFactory) f("getJavaScriptExecutorFactory") : javaScriptExecutorFactory;
    }

    @Override // defpackage.PL0
    public final List getPackages() {
        return (List) f("getPackages");
    }

    @Override // defpackage.PL0
    public final AbstractC3566eM0 getReactPackageTurboModuleManagerDelegateBuilder() {
        return (AbstractC3566eM0) f("getReactPackageTurboModuleManagerDelegateBuilder");
    }

    @Override // defpackage.PL0
    public final RO0 getRedBoxHandler() {
        AbstractC1705Vq.p(f("getRedBoxHandler"));
        return null;
    }

    @Override // defpackage.PL0
    public final UIManagerProvider getUIManagerProvider() {
        return (UIManagerProvider) f("getUIManagerProvider");
    }
}
