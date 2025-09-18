package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: jt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5395jt extends AbstractC6495pd1 implements InterfaceC0442Fk1 {
    @Override // defpackage.AbstractC8407zg, defpackage.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ClipboardModule(reactApplicationContext));
        return arrayList;
    }

    @Override // defpackage.InterfaceC0442Fk1
    public final ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        return null;
    }

    @Override // defpackage.AbstractC8407zg, defpackage.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // defpackage.AbstractC8407zg
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (str.equals(ClipboardModule.NAME)) {
            return new ClipboardModule(reactApplicationContext);
        }
        return null;
    }

    @Override // defpackage.AbstractC8407zg
    public final InterfaceC3563eL0 getReactModuleInfoProvider() {
        try {
            return (InterfaceC3563eL0) Class.forName("com.reactnativecommunity.clipboard.ClipboardPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new C4237ht();
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.clipboard.ClipboardPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e2) {
            e = e2;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.clipboard.ClipboardPackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // defpackage.InterfaceC0442Fk1
    public final /* bridge */ /* synthetic */ Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return null;
    }

    @Override // defpackage.AbstractC8407zg
    public final List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return null;
    }
}
