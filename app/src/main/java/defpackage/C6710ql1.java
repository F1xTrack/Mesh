package defpackage;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ql1 */
/* loaded from: classes.dex */
public final class C6710ql1 {
    public BaseInterpolator c;
    public N02 d;
    public boolean e;
    public long b = -1;
    public final C3803fb1 f = new C3803fb1(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((C6519pl1) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C6519pl1 c6519pl1 = (C6519pl1) it.next();
            long j = this.b;
            if (j >= 0) {
                c6519pl1.c(j);
            }
            BaseInterpolator baseInterpolator = this.c;
            if (baseInterpolator != null && (view = (View) c6519pl1.a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                c6519pl1.d(this.f);
            }
            View view2 = (View) c6519pl1.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
