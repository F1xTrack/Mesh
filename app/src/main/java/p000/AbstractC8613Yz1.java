package p000;

import android.view.View;

/* renamed from: Yz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8613Yz1 {

    /* renamed from: a */
    public static final C1342VK f14632a = new C1342VK("InvalidModuleNotifier", 1);

    /* renamed from: a */
    public static final void m9443a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0 || mode2 == 0) {
            throw new IllegalStateException("A catalyst view must have an explicit width and height given to it. This should normally happen as part of the standard catalyst UI framework.");
        }
    }
}
