package com.horcrux.svg;

import com.facebook.react.module.model.ReactModuleInfo;
import defpackage.InterfaceC3373dL0;
import defpackage.InterfaceC3563eL0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class K implements InterfaceC3563eL0 {
    @Override // defpackage.InterfaceC3563eL0
    public final Map a() {
        HashMap map = new HashMap();
        Class[] clsArr = {SvgViewModule.class, RNSVGRenderableManager.class};
        for (int i = 0; i < 2; i++) {
            Class cls = clsArr[i];
            InterfaceC3373dL0 interfaceC3373dL0 = (InterfaceC3373dL0) cls.getAnnotation(InterfaceC3373dL0.class);
            String strName = interfaceC3373dL0.name();
            String strName2 = interfaceC3373dL0.name();
            String name = cls.getName();
            boolean zCanOverrideExistingModule = interfaceC3373dL0.canOverrideExistingModule();
            boolean zNeedsEagerInit = interfaceC3373dL0.needsEagerInit();
            interfaceC3373dL0.hasConstants();
            map.put(strName, new ReactModuleInfo(strName2, name, zCanOverrideExistingModule, zNeedsEagerInit, interfaceC3373dL0.isCxxModule(), true, 0));
        }
        return map;
    }
}
