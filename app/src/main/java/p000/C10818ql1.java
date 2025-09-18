package p000;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ql1 */
/* loaded from: classes.dex */
public final class C10818ql1 {

    /* renamed from: c */
    public BaseInterpolator f41130c;

    /* renamed from: d */
    public N02 f41131d;

    /* renamed from: e */
    public boolean f41132e;

    /* renamed from: b */
    public long f41129b = -1;

    /* renamed from: f */
    public final C9390fb1 f41133f = new C9390fb1(this);

    /* renamed from: a */
    public final ArrayList f41128a = new ArrayList();

    /* renamed from: a */
    public final void m24057a() {
        if (this.f41132e) {
            Iterator it = this.f41128a.iterator();
            while (it.hasNext()) {
                ((C10690pl1) it.next()).m23871b();
            }
            this.f41132e = false;
        }
    }

    /* renamed from: b */
    public final void m24058b() {
        View view;
        if (this.f41132e) {
            return;
        }
        Iterator it = this.f41128a.iterator();
        while (it.hasNext()) {
            C10690pl1 c10690pl1 = (C10690pl1) it.next();
            long j = this.f41129b;
            if (j >= 0) {
                c10690pl1.m23872c(j);
            }
            BaseInterpolator baseInterpolator = this.f41130c;
            if (baseInterpolator != null && (view = (View) c10690pl1.f40376a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f41131d != null) {
                c10690pl1.m23873d(this.f41133f);
            }
            View view2 = (View) c10690pl1.f40376a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f41132e = true;
    }
}
