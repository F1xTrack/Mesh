package p000;

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
public final class C8640Zn0 extends AbstractC11665xO0 {

    /* renamed from: a */
    public final Calendar f15127a = AbstractC10554oh1.m23526g(null);

    /* renamed from: b */
    public final Calendar f15128b = AbstractC10554oh1.m23526g(null);

    /* renamed from: c */
    public final /* synthetic */ C8898bo0 f15129c;

    public C8640Zn0(C8898bo0 c8898bo0) {
        this.f15129c = c8898bo0;
    }

    @Override // p000.AbstractC11665xO0
    /* renamed from: a */
    public final void mo9598a(Canvas canvas, RecyclerView recyclerView) {
        Object obj;
        if ((recyclerView.getAdapter() instanceof C7657Gp1) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C7657Gp1 c7657Gp1 = (C7657Gp1) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            C8898bo0 c8898bo0 = this.f15129c;
            c8898bo0.f17161c.getClass();
            Iterator it = new ArrayList().iterator();
            while (it.hasNext()) {
                C8664Zz0 c8664Zz0 = (C8664Zz0) it.next();
                Object obj2 = c8664Zz0.f15267a;
                if (obj2 != null && (obj = c8664Zz0.f15268b) != null) {
                    long jLongValue = ((Long) obj2).longValue();
                    Calendar calendar = this.f15127a;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = ((Long) obj).longValue();
                    Calendar calendar2 = this.f15128b;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - c7657Gp1.f3914d.f17162d.f41848a.f11018c;
                    int i2 = calendar2.get(1) - c7657Gp1.f3914d.f17162d.f41848a.f11018c;
                    View viewMo10222q = gridLayoutManager.mo10222q(i);
                    View viewMo10222q2 = gridLayoutManager.mo10222q(i2);
                    int i3 = gridLayoutManager.f16428F;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    int i6 = i4;
                    while (i6 <= i5) {
                        if (gridLayoutManager.mo10222q(gridLayoutManager.f16428F * i6) != null) {
                            canvas.drawRect((i6 != i4 || viewMo10222q == null) ? 0 : (viewMo10222q.getWidth() / 2) + viewMo10222q.getLeft(), r10.getTop() + ((Rect) ((C4218i3) c8898bo0.f17165g.f1850e).f28782b).top, (i6 != i5 || viewMo10222q2 == null) ? recyclerView.getWidth() : (viewMo10222q2.getWidth() / 2) + viewMo10222q2.getLeft(), r10.getBottom() - ((Rect) ((C4218i3) c8898bo0.f17165g.f1850e).f28782b).bottom, (Paint) c8898bo0.f17165g.f1853h);
                        }
                        i6++;
                    }
                }
            }
        }
    }
}
