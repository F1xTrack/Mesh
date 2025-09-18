package p000;

import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ht */
/* loaded from: classes2.dex */
public final class C4207ht implements InterfaceC9229eL0 {
    @Override // p000.InterfaceC9229eL0
    /* renamed from: a */
    public final Map mo9721a() {
        HashMap map = new HashMap();
        Class cls = new Class[]{ClipboardModule.class}[0];
        InterfaceC9101dL0 interfaceC9101dL0 = (InterfaceC9101dL0) cls.getAnnotation(InterfaceC9101dL0.class);
        String strName = interfaceC9101dL0.name();
        String strName2 = interfaceC9101dL0.name();
        String name = cls.getName();
        boolean zCanOverrideExistingModule = interfaceC9101dL0.canOverrideExistingModule();
        boolean zNeedsEagerInit = interfaceC9101dL0.needsEagerInit();
        interfaceC9101dL0.hasConstants();
        map.put(strName, new ReactModuleInfo(strName2, name, zCanOverrideExistingModule, zNeedsEagerInit, interfaceC9101dL0.isCxxModule(), TurboModule.class.isAssignableFrom(cls), 0));
        return map;
    }
}
