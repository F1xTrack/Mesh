package com.swmansion.reanimated;

import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.reflect.InvocationTargetException;
import p000.IJ0;
import p000.InterfaceC1777bJ;
import ru.mes.dnevnik.MainApplication;

/* loaded from: classes2.dex */
public class DevMenuUtils {
    public static void addDevMenuOption(ReactApplicationContext reactApplicationContext, InterfaceC1777bJ interfaceC1777bJ) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        if (reactApplicationContext.getApplicationContext() instanceof IJ0) {
            if (reactApplicationContext.isBridgeless()) {
                ((MainApplication) ((IJ0) reactApplicationContext.getApplicationContext())).m24492a();
                throw null;
            }
            if (((MainApplication) ((IJ0) reactApplicationContext.getApplicationContext())).f41951a.m6302a().f9573i == null) {
                throw new RuntimeException("[Reanimated] DevSupportManager is not available");
            }
        }
    }
}
