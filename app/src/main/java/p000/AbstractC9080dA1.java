package p000;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9080dA1 {

    /* renamed from: a */
    public static final C7366Ba0 f25853a = new C7366Ba0();

    /* renamed from: b */
    public static final C7314Aa0 f25854b = new C7314Aa0();

    /* renamed from: a */
    public static Object m17501a(String str, Map map) {
        HashMap map2 = (HashMap) map;
        if (!map2.containsKey(str)) {
            return f25853a;
        }
        Object obj = map2.get(str);
        return obj == null ? f25854b : obj;
    }

    /* renamed from: b */
    public static final int m17502b(float f, EnumC7813Jp1 enumC7813Jp1) {
        int iOrdinal = enumC7813Jp1.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec((int) f, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
    }
}
