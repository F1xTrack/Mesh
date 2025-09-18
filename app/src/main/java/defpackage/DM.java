package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class DM {
    public static final HashMap a;
    public static final HashMap b;

    static {
        CM cm;
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        CM cm2 = CM.d;
        map.put(1L, cm2);
        map2.put(cm2, Collections.singletonList(1L));
        map.put(2L, CM.f);
        map2.put((CM) map.get(2L), Collections.singletonList(2L));
        CM cm3 = CM.g;
        map.put(4L, cm3);
        map2.put(cm3, Collections.singletonList(4L));
        CM cm4 = CM.h;
        map.put(8L, cm4);
        map2.put(cm4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cm = CM.i;
            if (!zHasNext) {
                break;
            } else {
                a.put((Long) it.next(), cm);
            }
        }
        b.put(cm, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            CM cm5 = CM.j;
            if (!zHasNext2) {
                b.put(cm5, listAsList2);
                return;
            }
            a.put((Long) it2.next(), cm5);
        }
    }

    public static Long a(CM cm, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(cm);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
