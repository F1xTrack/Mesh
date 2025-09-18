package com.dylanvann.fastimage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC10674pd1;
import p000.C1660aN;
import p000.InterfaceC9229eL0;

/* loaded from: classes.dex */
public class FastImageViewPackage extends AbstractC10674pd1 {
    public static Map lambda$getReactModuleInfoProvider$0() {
        HashMap map = new HashMap();
        map.put("FastImageView", new ReactModuleInfo("FastImageView", "FastImageView", false, false, false, false));
        return map;
    }

    @Override // p000.AbstractC7279zg, p000.ZL0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new FastImageViewManager());
    }

    @Override // p000.AbstractC7279zg
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("FastImageView")) {
            return new FastImageViewModule(reactApplicationContext);
        }
        return null;
    }

    @Override // p000.AbstractC7279zg
    public InterfaceC9229eL0 getReactModuleInfoProvider() {
        return new C1660aN(1);
    }
}
