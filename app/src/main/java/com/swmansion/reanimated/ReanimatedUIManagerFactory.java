package com.swmansion.reanimated;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager;
import java.lang.reflect.Field;
import java.util.List;
import p000.C11827yf1;
import p000.ComponentCallbacks2C7803Jk1;
import p000.PN0;

/* loaded from: classes2.dex */
public class ReanimatedUIManagerFactory {
    public static UIManagerModule create(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1 = new ComponentCallbacks2C7803Jk1(list);
        ReanimatedUIManager reanimatedUIManager = new ReanimatedUIManager(reactApplicationContext, list, i);
        PN0 pn0 = new PN0(reactApplicationContext, componentCallbacks2C7803Jk1, new C11827yf1(reactApplicationContext, new ReanimatedNativeHierarchyManager(componentCallbacks2C7803Jk1, reactApplicationContext), i), reanimatedUIManager.getEventDispatcher());
        Class superclass = ReanimatedUIManager.class.getSuperclass();
        if (superclass == null) {
            return reanimatedUIManager;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mUIImplementation");
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                e.printStackTrace();
            }
            declaredField.set(reanimatedUIManager, pn0);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        return reanimatedUIManager;
    }
}
