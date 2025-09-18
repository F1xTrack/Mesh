package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: vY */
/* loaded from: classes.dex */
public abstract class AbstractC7019vY {

    /* renamed from: a */
    public static final C0035AY f44407a = new C0035AY();

    /* renamed from: b */
    public static final AbstractC0161CY f44408b;

    static {
        AbstractC0161CY abstractC0161CY = null;
        try {
            abstractC0161CY = (AbstractC0161CY) C0476HY.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f44408b = abstractC0161CY;
    }

    /* renamed from: a */
    public static final void m25442a(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
