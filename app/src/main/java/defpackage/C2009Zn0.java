package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* renamed from: Zn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2009Zn0 extends AbstractC7974xO0 {
    public final Calendar a = AbstractC6316oh1.g(null);
    public final Calendar b = AbstractC6316oh1.g(null);
    public final /* synthetic */ C2394bo0 c;

    public C2009Zn0(C2394bo0 c2394bo0) {
        this.c = c2394bo0;
    }

    @Override // defpackage.AbstractC7974xO0
    public final void a(Canvas canvas, RecyclerView recyclerView) {
        Object obj;
        if ((recyclerView.getAdapter() instanceof C0535Gp1) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C0535Gp1 c0535Gp1 = (C0535Gp1) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            C2394bo0 c2394bo0 = this.c;
            c2394bo0.c.getClass();
            Iterator it = new ArrayList().iterator();
            while (it.hasNext()) {
                C2045Zz0 c2045Zz0 = (C2045Zz0) it.next();
                Object obj2 = c2045Zz0.a;
                if (obj2 != null && (obj = c2045Zz0.b) != null) {
                    long jLongValue = ((Long) obj2).longValue();
                    Calendar calendar = this.a;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = ((Long) obj).longValue();
                    Calendar calendar2 = this.b;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - c0535Gp1.d.d.a.c;
                    int i2 = calendar2.get(1) - c0535Gp1.d.d.a.c;
                    View viewQ = gridLayoutManager.q(i);
                    View viewQ2 = gridLayoutManager.q(i2);
                    int i3 = gridLayoutManager.F;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    int i6 = i4;
                    while (i6 <= i5) {
                        if (gridLayoutManager.q(gridLayoutManager.F * i6) != null) {
                            canvas.drawRect((i6 != i4 || viewQ == null) ? 0 : (viewQ.getWidth() / 2) + viewQ.getLeft(), r10.getTop() + ((Rect) ((C4271i3) c2394bo0.g.e).b).top, (i6 != i5 || viewQ2 == null) ? recyclerView.getWidth() : (viewQ2.getWidth() / 2) + viewQ2.getLeft(), r10.getBottom() - ((Rect) ((C4271i3) c2394bo0.g.e).b).bottom, (Paint) c2394bo0.g.h);
                        }
                        i6++;
                    }
                }
            }
        }
    }
}
