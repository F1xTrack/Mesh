package defpackage;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3341dA1 {
    public static final C0099Ba0 a = new C0099Ba0();
    public static final C0021Aa0 b = new C0021Aa0();

    public static Object a(String str, Map map) {
        HashMap map2 = (HashMap) map;
        if (!map2.containsKey(str)) {
            return a;
        }
        Object obj = map2.get(str);
        return obj == null ? b : obj;
    }

    public static final int b(float f, EnumC0769Jp1 enumC0769Jp1) {
        int iOrdinal = enumC0769Jp1.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec((int) f, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
    }
}
