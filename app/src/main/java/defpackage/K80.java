package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class K80 extends AbstractC0061An1 {
    public final View a;
    public int b;
    public int c;
    public final int[] d;

    public K80(View view) {
        super(0);
        this.d = new int[2];
        this.a = view;
    }

    @Override // defpackage.AbstractC0061An1
    public final void onEnd(C0607Hn1 c0607Hn1) {
        this.a.setTranslationY(0.0f);
    }

    @Override // defpackage.AbstractC0061An1
    public final void onPrepare(C0607Hn1 c0607Hn1) {
        View view = this.a;
        int[] iArr = this.d;
        view.getLocationOnScreen(iArr);
        this.b = iArr[1];
    }

    @Override // defpackage.AbstractC0061An1
    public final C1698Vn1 onProgress(C1698Vn1 c1698Vn1, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C0607Hn1) it.next()).a.c() & 8) != 0) {
                this.a.setTranslationY(AbstractC6009n5.c(this.c, r0.a.b(), 0));
                break;
            }
        }
        return c1698Vn1;
    }

    @Override // defpackage.AbstractC0061An1
    public final C8430zn1 onStart(C0607Hn1 c0607Hn1, C8430zn1 c8430zn1) {
        View view = this.a;
        int[] iArr = this.d;
        view.getLocationOnScreen(iArr);
        int i = this.b - iArr[1];
        this.c = i;
        view.setTranslationY(i);
        return c8430zn1;
    }
}
