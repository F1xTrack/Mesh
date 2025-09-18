package p000;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: zg */
/* loaded from: classes.dex */
public abstract class AbstractC7279zg implements ZL0 {
    @Override // p000.ZL0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    @Override // p000.ZL0
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
        final Iterator it = getReactModuleInfoProvider().mo9721a().entrySet().iterator();
        return new Iterable() { // from class: xg
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                AbstractC7279zg abstractC7279zg = this.f45730a;
                abstractC7279zg.getClass();
                return new C7216yg(abstractC7279zg, it, reactApplicationContext);
            }
        };
    }

    public abstract InterfaceC9229eL0 getReactModuleInfoProvider();

    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
