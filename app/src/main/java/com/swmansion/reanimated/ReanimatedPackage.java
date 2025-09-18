package com.swmansion.reanimated;

import android.os.Trace;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.swmansion.worklets.WorkletsModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p000.AbstractC7279zg;
import p000.C7109wz;
import p000.IJ0;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9229eL0;
import p000.OY1;
import p000.QK0;
import ru.mes.dnevnik.MainApplication;

/* loaded from: classes2.dex */
public class ReanimatedPackage extends AbstractC7279zg {
    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        Trace.beginSection(OY1.m6088f("createUIManagerModule"));
        try {
            return ReanimatedUIManagerFactory.create(reactApplicationContext, getReactInstanceManager(reactApplicationContext).m6637g(reactApplicationContext), -1);
        } finally {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0(Map map) {
        return map;
    }

    @Override // p000.AbstractC7279zg
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        switch (str) {
            case "WorkletsModule":
                return new WorkletsModule(reactApplicationContext);
            case "ReanimatedModule":
                return new ReanimatedModule(reactApplicationContext);
            case "UIManager":
                return createUIManager(reactApplicationContext);
            default:
                return null;
        }
    }

    public QK0 getReactInstanceManager(ReactApplicationContext reactApplicationContext) {
        return ((MainApplication) ((IJ0) reactApplicationContext.getApplicationContext())).f41951a.m6302a();
    }

    @Override // p000.AbstractC7279zg
    public InterfaceC9229eL0 getReactModuleInfoProvider() {
        Class[] clsArr = {WorkletsModule.class, ReanimatedModule.class, ReanimatedUIManager.class};
        HashMap map = new HashMap();
        for (int i = 0; i < 3; i++) {
            Class cls = clsArr[i];
            InterfaceC9101dL0 interfaceC9101dL0 = (InterfaceC9101dL0) cls.getAnnotation(InterfaceC9101dL0.class);
            Objects.requireNonNull(interfaceC9101dL0);
            map.put(interfaceC9101dL0.name(), new ReactModuleInfo(interfaceC9101dL0.name(), cls.getName(), true, interfaceC9101dL0.needsEagerInit(), interfaceC9101dL0.isCxxModule(), false));
        }
        return new C7109wz(map, 1);
    }
}
