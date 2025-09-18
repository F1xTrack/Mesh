package defpackage;

import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ht, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4237ht implements InterfaceC3563eL0 {
    @Override // defpackage.InterfaceC3563eL0
    public final Map a() {
        HashMap map = new HashMap();
        Class cls = new Class[]{ClipboardModule.class}[0];
        InterfaceC3373dL0 interfaceC3373dL0 = (InterfaceC3373dL0) cls.getAnnotation(InterfaceC3373dL0.class);
        String strName = interfaceC3373dL0.name();
        String strName2 = interfaceC3373dL0.name();
        String name = cls.getName();
        boolean zCanOverrideExistingModule = interfaceC3373dL0.canOverrideExistingModule();
        boolean zNeedsEagerInit = interfaceC3373dL0.needsEagerInit();
        interfaceC3373dL0.hasConstants();
        map.put(strName, new ReactModuleInfo(strName2, name, zCanOverrideExistingModule, zNeedsEagerInit, interfaceC3373dL0.isCxxModule(), TurboModule.class.isAssignableFrom(cls), 0));
        return map;
    }
}
