package p000;

import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class SZ1 {
    /* renamed from: a */
    public static final C0487Hj m7392a(C10737q70 c10737q70, C0487Hj c0487Hj, C0487Hj c0487Hj2, Map map) {
        O90.m5968f(c10737q70, "imageRequest");
        EnumC10481o70 enumC10481o70 = EnumC10481o70.f38818a;
        EnumC10481o70 enumC10481o702 = c10737q70.f40608a;
        if (enumC10481o702 == enumC10481o70) {
            return c0487Hj;
        }
        if (enumC10481o702 == EnumC10481o70.f38819b) {
            return c0487Hj2;
        }
        return null;
    }

    /* renamed from: b */
    public static HashMap m7393b(List list, Map map, Map map2) {
        HashMap mapM7037b = RZ1.m7037b();
        HashMap mapM7036a = RZ1.m7036a();
        HashMap mapM7038c = RZ1.m7038c();
        if (map != null) {
            map.putAll(mapM7036a);
        }
        if (map2 != null) {
            map2.putAll(mapM7038c);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            String name = viewManager.getName();
            HashMap mapM7394c = m7394c(viewManager, map, map2);
            if (!mapM7394c.isEmpty()) {
                mapM7037b.put(name, mapM7394c);
            }
        }
        mapM7037b.put("genericBubblingEventTypes", mapM7036a);
        mapM7037b.put("genericDirectEventTypes", mapM7038c);
        return mapM7037b;
    }

    /* renamed from: c */
    public static HashMap m7394c(ViewManager viewManager, Map map, Map map2) {
        HashMap map3 = new HashMap();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            if (ReactFeatureFlags.enableFabricRenderer && ReactFeatureFlags.unstable_useFabricInterop) {
                m7395d(exportedCustomBubblingEventTypeConstants);
            }
            m7396e(map, exportedCustomBubblingEventTypeConstants);
            m7396e(exportedCustomBubblingEventTypeConstants, null);
            map3.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        viewManager.getName();
        if (exportedCustomDirectEventTypeConstants != null) {
            if (ReactFeatureFlags.enableFabricRenderer && ReactFeatureFlags.unstable_useFabricInterop) {
                m7395d(exportedCustomDirectEventTypeConstants);
            }
            m7396e(map2, exportedCustomDirectEventTypeConstants);
            m7396e(exportedCustomDirectEventTypeConstants, null);
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

    /* renamed from: d */
    public static void m7395d(Map map) {
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

    /* renamed from: e */
    public static void m7396e(Map map, Map map2) {
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
                m7396e((Map) obj3, (Map) obj2);
            } else {
                map.put(obj, obj2);
            }
        }
    }
}
