package p000;

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

    /* renamed from: c */
    public final C7650Gm0 f9590c;

    /* renamed from: d */
    public final ArrayList f9591d;

    /* renamed from: e */
    public final C7119x8 f9592e;

    public QL0(MainApplication mainApplication, C7650Gm0 c7650Gm0) {
        super(mainApplication);
        this.f9590c = c7650Gm0;
        F71 f71 = C6617pR.f40074b;
        List listM7145a = S02.m7145a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM7145a.iterator();
        while (it.hasNext()) {
            List listMo18083a = ((InterfaceC11866yz0) it.next()).mo18083a();
            O90.m5967e(listMo18083a, "createReactNativeHostHandlers(...)");
            AbstractC0246Du.m1920m(arrayList, listMo18083a);
        }
        this.f9591d = arrayList;
        this.f9592e = new C7119x8();
    }

    @Override // p000.PL0
    /* renamed from: b */
    public final boolean mo6303b() {
        this.f9590c.getClass();
        return true;
    }

    @Override // p000.PL0
    /* renamed from: c */
    public final OL0 mo6304c() {
        this.f9590c.getClass();
        return new OL0(0);
    }

    @Override // p000.PL0
    public final QK0 createReactInstanceManager() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        boolean zMo3152d = mo3152d();
        ArrayList arrayList = this.f9591d;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
        QK0 qk0CreateReactInstanceManager = super.createReactInstanceManager();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            InterfaceC1839cJ interfaceC1839cJ = qk0CreateReactInstanceManager.f9573i;
            throw null;
        }
        qk0CreateReactInstanceManager.m6632a(new RL0(this, zMo3152d));
        Field declaredField = PL0.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this.f9590c, qk0CreateReactInstanceManager);
        return qk0CreateReactInstanceManager;
    }

    @Override // p000.PL0
    /* renamed from: d */
    public final boolean mo3152d() {
        Boolean bool = (Boolean) AbstractC9639hY0.m18829h(AbstractC9639hY0.m18834m(AbstractC7167xu.m25992t(this.f9591d), C9393fd0.f27272B));
        if (bool != null) {
            return bool.booleanValue();
        }
        this.f9590c.getClass();
        return false;
    }

    /* renamed from: f */
    public final Object m6664f(String str) throws NoSuchMethodException, SecurityException {
        C7119x8 c7119x8 = this.f9592e;
        Method declaredMethod = (Method) c7119x8.getOrDefault(str, null);
        if (declaredMethod == null) {
            declaredMethod = PL0.class.getDeclaredMethod(str, null);
            declaredMethod.setAccessible(true);
            c7119x8.put(str, declaredMethod);
        }
        return declaredMethod.invoke(this.f9590c, null);
    }

    @Override // p000.PL0
    public final String getBundleAssetName() {
        String str = (String) AbstractC9639hY0.m18829h(AbstractC9639hY0.m18834m(AbstractC7167xu.m25992t(this.f9591d), new SL0(this, 0)));
        return str == null ? (String) m6664f("getBundleAssetName") : str;
    }

    @Override // p000.PL0
    public final InterfaceC3920dJ getDevSupportManagerFactory() {
        InterfaceC3920dJ interfaceC3920dJ = (InterfaceC3920dJ) AbstractC9639hY0.m18829h(AbstractC9639hY0.m18834m(AbstractC7167xu.m25992t(this.f9591d), C9393fd0.f27300z));
        return interfaceC3920dJ == null ? (InterfaceC3920dJ) m6664f("getDevSupportManagerFactory") : interfaceC3920dJ;
    }

    @Override // p000.PL0
    public final String getJSBundleFile() {
        String str = (String) AbstractC9639hY0.m18829h(AbstractC9639hY0.m18834m(AbstractC7167xu.m25992t(this.f9591d), new SL0(this, 1)));
        return str == null ? (String) m6664f("getJSBundleFile") : str;
    }

    @Override // p000.PL0
    public final EnumC11816ya0 getJSEngineResolutionAlgorithm() {
        return (EnumC11816ya0) m6664f("getJSEngineResolutionAlgorithm");
    }

    @Override // p000.PL0
    public final String getJSMainModuleName() {
        return (String) m6664f("getJSMainModuleName");
    }

    @Override // p000.PL0
    public final JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        JavaScriptExecutorFactory javaScriptExecutorFactory = (JavaScriptExecutorFactory) AbstractC9639hY0.m18829h(AbstractC9639hY0.m18834m(AbstractC7167xu.m25992t(this.f9591d), C9393fd0.f27271A));
        return javaScriptExecutorFactory == null ? (JavaScriptExecutorFactory) m6664f("getJavaScriptExecutorFactory") : javaScriptExecutorFactory;
    }

    @Override // p000.PL0
    public final List getPackages() {
        return (List) m6664f("getPackages");
    }

    @Override // p000.PL0
    public final AbstractC9231eM0 getReactPackageTurboModuleManagerDelegateBuilder() {
        return (AbstractC9231eM0) m6664f("getReactPackageTurboModuleManagerDelegateBuilder");
    }

    @Override // p000.PL0
    public final RO0 getRedBoxHandler() {
        AbstractC1374Vq.m8597p(m6664f("getRedBoxHandler"));
        return null;
    }

    @Override // p000.PL0
    public final UIManagerProvider getUIManagerProvider() {
        return (UIManagerProvider) m6664f("getUIManagerProvider");
    }
}
