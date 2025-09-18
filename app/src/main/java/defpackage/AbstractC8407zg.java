package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: zg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8407zg implements ZL0 {
    @Override // defpackage.ZL0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    @Override // defpackage.ZL0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> viewManagers = getViewManagers(reactApplicationContext);
        if (viewManagers == null || viewManagers.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = viewManagers.iterator();
        while (it.hasNext()) {
            arrayList.add((ViewManager) it.next().getProvider().get());
        }
        return arrayList;
    }

    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    public Iterable<ModuleHolder> getNativeModuleIterator(final ReactApplicationContext reactApplicationContext) {
        final Iterator it = getReactModuleInfoProvider().a().entrySet().iterator();
        return new Iterable() { // from class: xg
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                AbstractC8407zg abstractC8407zg = this.a;
                abstractC8407zg.getClass();
                return new C8217yg(abstractC8407zg, it, reactApplicationContext);
            }
        };
    }

    public abstract InterfaceC3563eL0 getReactModuleInfoProvider();

    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
