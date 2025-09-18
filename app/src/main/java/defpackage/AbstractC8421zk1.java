package defpackage;

import android.view.ViewGroup;

/* renamed from: zk1 */
/* loaded from: classes.dex */
public abstract class AbstractC8421zk1 {
    public static int a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
