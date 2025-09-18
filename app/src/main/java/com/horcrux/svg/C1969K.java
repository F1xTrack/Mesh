package com.horcrux.svg;

import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9229eL0;

/* renamed from: com.horcrux.svg.K */
/* loaded from: classes.dex */
public final class C1969K implements InterfaceC9229eL0 {
    @Override // p000.InterfaceC9229eL0
    /* renamed from: a */
    public final Map mo9721a() {
        HashMap map = new HashMap();
        Class[] clsArr = {SvgViewModule.class, RNSVGRenderableManager.class};
        for (int i = 0; i < 2; i++) {
            Class cls = clsArr[i];
            InterfaceC9101dL0 interfaceC9101dL0 = (InterfaceC9101dL0) cls.getAnnotation(InterfaceC9101dL0.class);
            String strName = interfaceC9101dL0.name();
            String strName2 = interfaceC9101dL0.name();
            String name = cls.getName();
            boolean zCanOverrideExistingModule = interfaceC9101dL0.canOverrideExistingModule();
            boolean zNeedsEagerInit = interfaceC9101dL0.needsEagerInit();
            interfaceC9101dL0.hasConstants();
            map.put(strName, new ReactModuleInfo(strName2, name, zCanOverrideExistingModule, zNeedsEagerInit, interfaceC9101dL0.isCxxModule(), true, 0));
        }
        return map;
    }
}
