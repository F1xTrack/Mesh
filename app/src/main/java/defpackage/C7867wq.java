package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.mes.dnevnik.R;

/* renamed from: wq */
/* loaded from: classes.dex */
public final class C7867wq extends AbstractC7974xO0 {
    public final Paint a;
    public final List b;

    public C7867wq() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.AbstractC7974xO0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((AbstractC7266tg0) it.next()).getClass();
            paint.setColor(AbstractC0937Lu.b(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).D0()) {
                canvas.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.n(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.i(), paint);
            } else {
                canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).q.k(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.l(), 0.0f, paint);
            }
        }
    }
}
