package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: FM */
/* loaded from: classes.dex */
public abstract class AbstractC0338FM {

    /* renamed from: a */
    public static final HashMap f3166a;

    /* renamed from: b */
    public static final HashMap f3167b;

    /* renamed from: c */
    public static final HashMap f3168c;

    /* renamed from: d */
    public static final HashMap f3169d;

    /* renamed from: e */
    public static final HashMap f3170e;

    static {
        HashMap map = new HashMap();
        f3166a = map;
        HashMap map2 = new HashMap();
        f3167b = map2;
        HashMap map3 = new HashMap();
        f3168c = map3;
        HashMap map4 = new HashMap();
        f3169d = map4;
        HashMap map5 = new HashMap();
        f3170e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        C0149CM c0149cm = C0149CM.f1329d;
        map6.put(c0149cm, 1);
        C0149CM c0149cm2 = C0149CM.f1331f;
        map6.put(c0149cm2, 2);
        C0149CM c0149cm3 = C0149CM.f1332g;
        map6.put(c0149cm3, 4096);
        C0149CM c0149cm4 = C0149CM.f1333h;
        map6.put(c0149cm4, 8192);
        HashMap map7 = new HashMap();
        map7.put(c0149cm, 1);
        map7.put(c0149cm2, 2);
        map7.put(c0149cm3, 4096);
        map7.put(c0149cm4, 8192);
        HashMap map8 = new HashMap();
        map8.put(c0149cm, 1);
        map8.put(c0149cm2, 4);
        map8.put(c0149cm3, 4096);
        map8.put(c0149cm4, 16384);
        HashMap map9 = new HashMap();
        map9.put(C0149CM.f1334i, 256);
        map9.put(C0149CM.f1335j, 512);
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    /* renamed from: a */
    public static boolean m2584a(C7276zd c7276zd, C0149CM c0149cm) {
        Set set;
        int i = c7276zd.f46906h;
        Set set2 = (Set) f3166a.get(Integer.valueOf(c0149cm.f1337b));
        return set2 != null && set2.contains(Integer.valueOf(i)) && (set = (Set) f3167b.get(Integer.valueOf(c0149cm.f1336a))) != null && set.contains(Integer.valueOf(c7276zd.f46908j));
    }
}
