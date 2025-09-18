package com.huawei.hms.p015rn.availability;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.ZL0;

/* loaded from: classes.dex */
public class HMSAvailabilityPackage implements ZL0 {
    @Override // p000.ZL0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new HMSAvailabilityModule(reactApplicationContext));
    }

    @Override // p000.ZL0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public /* bridge */ /* synthetic */ NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return null;
    }
}
