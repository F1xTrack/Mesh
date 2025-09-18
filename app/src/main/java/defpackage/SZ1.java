package defpackage;

import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class SZ1 {
    public static final C0593Hj a(C6589q70 c6589q70, C0593Hj c0593Hj, C0593Hj c0593Hj2, Map map) {
        O90.f(c6589q70, "imageRequest");
        EnumC6207o70 enumC6207o70 = EnumC6207o70.a;
        EnumC6207o70 enumC6207o702 = c6589q70.a;
        if (enumC6207o702 == enumC6207o70) {
            return c0593Hj;
        }
        if (enumC6207o702 == EnumC6207o70.b) {
            return c0593Hj2;
        }
        return null;
    }

    public static HashMap b(List list, Map map, Map map2) {
        HashMap mapB = RZ1.b();
        HashMap mapA = RZ1.a();
        HashMap mapC = RZ1.c();
        if (map != null) {
            map.putAll(mapA);
        }
        if (map2 != null) {
            map2.putAll(mapC);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            String name = viewManager.getName();
            HashMap mapC2 = c(viewManager, map, map2);
            if (!mapC2.isEmpty()) {
                mapB.put(name, mapC2);
            }
        }
        mapB.put("genericBubblingEventTypes", mapA);
        mapB.put("genericDirectEventTypes", mapC);
        return mapB;
    }

    public static HashMap c(ViewManager viewManager, Map map, Map map2) {
        HashMap map3 = new HashMap();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            if (ReactFeatureFlags.enableFabricRenderer && ReactFeatureFlags.unstable_useFabricInterop) {
                d(exportedCustomBubblingEventTypeConstants);
            }
            e(map, exportedCustomBubblingEventTypeConstants);
            e(exportedCustomBubblingEventTypeConstants, null);
            map3.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        viewManager.getName();
        if (exportedCustomDirectEventTypeConstants != null) {
            if (ReactFeatureFlags.enableFabricRenderer && ReactFeatureFlags.unstable_useFabricInterop) {
                d(exportedCustomDirectEventTypeConstants);
            }
            e(map2, exportedCustomDirectEventTypeConstants);
            e(exportedCustomDirectEventTypeConstants, null);
            map3.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            map3.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            map3.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            map3.put("NativeProps", nativeProps);
        }
        return map3;
    }

    public static void d(Map map) {
        HashSet hashSet = new HashSet();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (!str.startsWith("top")) {
                    hashSet.add(str);
                }
            }
        }
        if (!(map instanceof HashMap)) {
            map = new HashMap(map);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            map.put("top" + (str2.startsWith("on") ? str2.substring(2) : str2.substring(0, 1).toUpperCase() + str2.substring(1)), map.get(str2));
        }
    }

    public static void e(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Object obj : map2.keySet()) {
            Object obj2 = map2.get(obj);
            Object obj3 = map.get(obj);
            if (obj3 != null && (obj2 instanceof Map) && (obj3 instanceof Map)) {
                if (!(obj3 instanceof HashMap)) {
                    HashMap map3 = new HashMap((Map) obj3);
                    map.replace(obj, map3);
                    obj3 = map3;
                }
                e((Map) obj3, (Map) obj2);
            } else {
                map.put(obj, obj2);
            }
        }
    }
}
