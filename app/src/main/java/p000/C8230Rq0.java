package p000;

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
public class C8230Rq0 {

    /* renamed from: a */
    public final Context f10445a;

    /* renamed from: b */
    public final MenuC7450Cq0 f10446b;

    /* renamed from: c */
    public final boolean f10447c;

    /* renamed from: d */
    public final int f10448d;

    /* renamed from: e */
    public View f10449e;

    /* renamed from: g */
    public boolean f10451g;

    /* renamed from: h */
    public InterfaceC8490Wq0 f10452h;

    /* renamed from: i */
    public AbstractC8126Pq0 f10453i;

    /* renamed from: j */
    public C8178Qq0 f10454j;

    /* renamed from: f */
    public int f10450f = 8388611;

    /* renamed from: k */
    public final C8178Qq0 f10455k = new C8178Qq0(this);

    public C8230Rq0(int i, MenuC7450Cq0 menuC7450Cq0, Context context, View view, boolean z) {
        this.f10445a = context;
        this.f10446b = menuC7450Cq0;
        this.f10449e = view;
        this.f10447c = z;
        this.f10448d = i;
    }

    /* renamed from: a */
    public final AbstractC8126Pq0 m7120a() {
        AbstractC8126Pq0 viewOnKeyListenerC10476o41;
        if (this.f10453i == null) {
            Context context = this.f10445a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC10476o41 = new ViewOnKeyListenerC0053Aq(context, this.f10449e, this.f10448d, this.f10447c);
            } else {
                View view = this.f10449e;
                Context context2 = this.f10445a;
                boolean z = this.f10447c;
                viewOnKeyListenerC10476o41 = new ViewOnKeyListenerC10476o41(this.f10448d, this.f10446b, context2, view, z);
            }
            viewOnKeyListenerC10476o41.mo337l(this.f10446b);
            viewOnKeyListenerC10476o41.mo342r(this.f10455k);
            viewOnKeyListenerC10476o41.mo338n(this.f10449e);
            viewOnKeyListenerC10476o41.mo305g(this.f10452h);
            viewOnKeyListenerC10476o41.mo339o(this.f10451g);
            viewOnKeyListenerC10476o41.mo340p(this.f10450f);
            this.f10453i = viewOnKeyListenerC10476o41;
        }
        return this.f10453i;
    }

    /* renamed from: b */
    public final boolean m7121b() {
        AbstractC8126Pq0 abstractC8126Pq0 = this.f10453i;
        return abstractC8126Pq0 != null && abstractC8126Pq0.mo334a();
    }

    /* renamed from: c */
    public void mo7122c() {
        this.f10453i = null;
        C8178Qq0 c8178Qq0 = this.f10454j;
        if (c8178Qq0 != null) {
            c8178Qq0.onDismiss();
        }
    }

    /* renamed from: d */
    public final void m7123d(int i, int i2, boolean z, boolean z2) {
        AbstractC8126Pq0 abstractC8126Pq0M7120a = m7120a();
        abstractC8126Pq0M7120a.mo343s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f10450f, this.f10449e.getLayoutDirection()) & 7) == 5) {
                i -= this.f10449e.getWidth();
            }
            abstractC8126Pq0M7120a.mo341q(i);
            abstractC8126Pq0M7120a.mo344t(i2);
            int i3 = (int) ((this.f10445a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC8126Pq0M7120a.f9296a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC8126Pq0M7120a.mo335b();
    }
}
