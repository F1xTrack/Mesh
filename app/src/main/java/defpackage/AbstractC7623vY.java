package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: vY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7623vY {
    public static final AY a = new AY();
    public static final CY b;

    static {
        CY cy = null;
        try {
            cy = (CY) HY.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = cy;
    }

    public static final void a(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
