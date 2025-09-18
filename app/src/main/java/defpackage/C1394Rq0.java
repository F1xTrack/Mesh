package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import ru.mes.dnevnik.R;

/* renamed from: Rq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1394Rq0 {
    public final Context a;
    public final MenuC0225Cq0 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public InterfaceC1784Wq0 h;
    public AbstractC1238Pq0 i;
    public C1316Qq0 j;
    public int f = 8388611;
    public final C1316Qq0 k = new C1316Qq0(this);

    public C1394Rq0(int i, MenuC0225Cq0 menuC0225Cq0, Context context, View view, boolean z) {
        this.a = context;
        this.b = menuC0225Cq0;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final AbstractC1238Pq0 a() {
        AbstractC1238Pq0 viewOnKeyListenerC6199o41;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC6199o41 = new ViewOnKeyListenerC0068Aq(context, this.e, this.d, this.c);
            } else {
                View view = this.e;
                Context context2 = this.a;
                boolean z = this.c;
                viewOnKeyListenerC6199o41 = new ViewOnKeyListenerC6199o41(this.d, this.b, context2, view, z);
            }
            viewOnKeyListenerC6199o41.l(this.b);
            viewOnKeyListenerC6199o41.r(this.k);
            viewOnKeyListenerC6199o41.n(this.e);
            viewOnKeyListenerC6199o41.g(this.h);
            viewOnKeyListenerC6199o41.o(this.g);
            viewOnKeyListenerC6199o41.p(this.f);
            this.i = viewOnKeyListenerC6199o41;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC1238Pq0 abstractC1238Pq0 = this.i;
        return abstractC1238Pq0 != null && abstractC1238Pq0.a();
    }

    public void c() {
        this.i = null;
        C1316Qq0 c1316Qq0 = this.j;
        if (c1316Qq0 != null) {
            c1316Qq0.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        AbstractC1238Pq0 abstractC1238Pq0A = a();
        abstractC1238Pq0A.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            abstractC1238Pq0A.q(i);
            abstractC1238Pq0A.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC1238Pq0A.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC1238Pq0A.b();
    }
}
