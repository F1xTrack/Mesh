package p000;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: DM */
/* loaded from: classes.dex */
public abstract class AbstractC0212DM {

    /* renamed from: a */
    public static final HashMap f1977a;

    /* renamed from: b */
    public static final HashMap f1978b;

    static {
        C0149CM c0149cm;
        HashMap map = new HashMap();
        f1977a = map;
        HashMap map2 = new HashMap();
        f1978b = map2;
        C0149CM c0149cm2 = C0149CM.f1329d;
        map.put(1L, c0149cm2);
        map2.put(c0149cm2, Collections.singletonList(1L));
        map.put(2L, C0149CM.f1331f);
        map2.put((C0149CM) map.get(2L), Collections.singletonList(2L));
        C0149CM c0149cm3 = C0149CM.f1332g;
        map.put(4L, c0149cm3);
        map2.put(c0149cm3, Collections.singletonList(4L));
        C0149CM c0149cm4 = C0149CM.f1333h;
        map.put(8L, c0149cm4);
        map2.put(c0149cm4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0149cm = C0149CM.f1334i;
            if (!zHasNext) {
                break;
            } else {
                f1977a.put((Long) it.next(), c0149cm);
            }
        }
        f1978b.put(c0149cm, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            C0149CM c0149cm5 = C0149CM.f1335j;
            if (!zHasNext2) {
                f1978b.put(c0149cm5, listAsList2);
                return;
            }
            f1977a.put((Long) it2.next(), c0149cm5);
        }
    }

    /* renamed from: a */
    public static Long m1650a(C0149CM c0149cm, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f1978b.get(c0149cm);
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
