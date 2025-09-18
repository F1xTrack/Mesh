package io.appmetrica.analytics.reactnative;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.ZL0;

/* loaded from: classes2.dex */
public class AppMetricaPackage implements ZL0 {
    @Override // p000.ZL0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AppMetricaModule(reactApplicationContext));
        return arrayList;
    }

    @Override // p000.ZL0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public /* bridge */ /* synthetic */ NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return null;
    }
}
