package p000;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: jt */
/* loaded from: classes2.dex */
public final class C6265jt extends AbstractC10674pd1 implements InterfaceC7595Fk1 {
    @Override // p000.AbstractC7279zg, p000.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ClipboardModule(reactApplicationContext));
        return arrayList;
    }

    @Override // p000.InterfaceC7595Fk1
    public final ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        return null;
    }

    @Override // p000.AbstractC7279zg, p000.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC7279zg
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (str.equals(ClipboardModule.NAME)) {
            return new ClipboardModule(reactApplicationContext);
        }
        return null;
    }

    @Override // p000.AbstractC7279zg
    public final InterfaceC9229eL0 getReactModuleInfoProvider() {
        try {
            return (InterfaceC9229eL0) Class.forName("com.reactnativecommunity.clipboard.ClipboardPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new C4207ht();
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.clipboard.ClipboardPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e2) {
            e = e2;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.clipboard.ClipboardPackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // p000.InterfaceC7595Fk1
    public final /* bridge */ /* synthetic */ Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return null;
    }

    @Override // p000.AbstractC7279zg
    public final List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return null;
    }
}
