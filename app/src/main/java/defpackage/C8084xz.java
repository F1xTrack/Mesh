package defpackage;

import android.os.Trace;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import java.util.List;

/* renamed from: xz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8084xz extends AbstractC6495pd1 {
    public final QK0 a;
    public final MK0 b;
    public final int c;

    public C8084xz(QK0 qk0, MK0 mk0, int i) {
        this.a = qk0;
        this.b = mk0;
        this.c = i;
    }

    @Override // defpackage.AbstractC8407zg
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        QK0 qk0;
        str.getClass();
        qk0 = this.a;
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, qk0.i);
            case "Timing":
                return new TimingModule(reactApplicationContext, qk0.i);
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, qk0.i);
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.b);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(qk0.i);
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            case "HeadlessJsTaskSupport":
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case "UIManager":
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
                MT1.b("createUIManagerModule");
                try {
                    return new UIManagerModule(reactApplicationContext, (List<ViewManager>) qk0.g(reactApplicationContext), this.c);
                } finally {
                    Trace.endSection();
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
                }
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for ".concat(str));
        }
    }

    @Override // defpackage.AbstractC8407zg
    public final InterfaceC3563eL0 getReactModuleInfoProvider() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
        HashMap map = new HashMap();
        for (int i = 0; i < 10; i++) {
            Class cls = clsArr[i];
            InterfaceC3373dL0 interfaceC3373dL0 = (InterfaceC3373dL0) cls.getAnnotation(InterfaceC3373dL0.class);
            map.put(interfaceC3373dL0.name(), new ReactModuleInfo(interfaceC3373dL0.name(), cls.getName(), interfaceC3373dL0.canOverrideExistingModule(), interfaceC3373dL0.needsEagerInit(), interfaceC3373dL0.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
        }
        return new C7894wz(map, 0);
    }
}
