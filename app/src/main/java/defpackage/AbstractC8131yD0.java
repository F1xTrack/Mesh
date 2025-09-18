package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: yD0 */
/* loaded from: classes.dex */
public abstract class AbstractC8131yD0 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(EnumC7370uD0.a, 0);
        map.put(EnumC7370uD0.b, 1);
        map.put(EnumC7370uD0.c, 2);
        for (EnumC7370uD0 enumC7370uD0 : map.keySet()) {
            a.append(((Integer) b.get(enumC7370uD0)).intValue(), enumC7370uD0);
        }
    }

    public static int a(EnumC7370uD0 enumC7370uD0) {
        Integer num = (Integer) b.get(enumC7370uD0);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC7370uD0);
    }

    public static EnumC7370uD0 b(int i) {
        EnumC7370uD0 enumC7370uD0 = (EnumC7370uD0) a.get(i);
        if (enumC7370uD0 != null) {
            return enumC7370uD0;
        }
        throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Unknown Priority for value "));
    }
}
