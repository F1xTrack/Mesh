package p000;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: yD0 */
/* loaded from: classes.dex */
public abstract class AbstractC11770yD0 {

    /* renamed from: a */
    public static final SparseArray f46142a = new SparseArray();

    /* renamed from: b */
    public static final HashMap f46143b;

    static {
        HashMap map = new HashMap();
        f46143b = map;
        map.put(EnumC11261uD0.f43594a, 0);
        map.put(EnumC11261uD0.f43595b, 1);
        map.put(EnumC11261uD0.f43596c, 2);
        for (EnumC11261uD0 enumC11261uD0 : map.keySet()) {
            f46142a.append(((Integer) f46143b.get(enumC11261uD0)).intValue(), enumC11261uD0);
        }
    }

    /* renamed from: a */
    public static int m26100a(EnumC11261uD0 enumC11261uD0) {
        Integer num = (Integer) f46143b.get(enumC11261uD0);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC11261uD0);
    }

    /* renamed from: b */
    public static EnumC11261uD0 m26101b(int i) {
        EnumC11261uD0 enumC11261uD0 = (EnumC11261uD0) f46142a.get(i);
        if (enumC11261uD0 != null) {
            return enumC11261uD0;
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Unknown Priority for value "));
    }
}
