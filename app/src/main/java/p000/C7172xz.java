package p000;

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

/* renamed from: xz */
/* loaded from: classes.dex */
public final class C7172xz extends AbstractC10674pd1 {

    /* renamed from: a */
    public final QK0 f45918a;

    /* renamed from: b */
    public final MK0 f45919b;

    /* renamed from: c */
    public final int f45920c;

    public C7172xz(QK0 qk0, MK0 mk0, int i) {
        this.f45918a = qk0;
        this.f45919b = mk0;
        this.f45920c = i;
    }

    @Override // p000.AbstractC7279zg
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        QK0 qk0;
        str.getClass();
        qk0 = this.f45918a;
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, qk0.f9573i);
            case "Timing":
                return new TimingModule(reactApplicationContext, qk0.f9573i);
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, qk0.f9573i);
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.f45919b);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(qk0.f9573i);
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            case "HeadlessJsTaskSupport":
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case "UIManager":
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
                MT1.m5371b("createUIManagerModule");
                try {
                    return new UIManagerModule(reactApplicationContext, (List<ViewManager>) qk0.m6637g(reactApplicationContext), this.f45920c);
                } finally {
                    Trace.endSection();
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
                }
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for ".concat(str));
        }
    }

    @Override // p000.AbstractC7279zg
    public final InterfaceC9229eL0 getReactModuleInfoProvider() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
        HashMap map = new HashMap();
        for (int i = 0; i < 10; i++) {
            Class cls = clsArr[i];
            InterfaceC9101dL0 interfaceC9101dL0 = (InterfaceC9101dL0) cls.getAnnotation(InterfaceC9101dL0.class);
            map.put(interfaceC9101dL0.name(), new ReactModuleInfo(interfaceC9101dL0.name(), cls.getName(), interfaceC9101dL0.canOverrideExistingModule(), interfaceC9101dL0.needsEagerInit(), interfaceC9101dL0.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
        }
        return new C7109wz(map, 0);
    }
}
