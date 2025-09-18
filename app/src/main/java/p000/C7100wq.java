package p000;

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
public final class C7100wq extends AbstractC11665xO0 {

    /* renamed from: a */
    public final Paint f45131a;

    /* renamed from: b */
    public final List f45132b;

    public C7100wq() {
        Paint paint = new Paint();
        this.f45131a = paint;
        this.f45132b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p000.AbstractC11665xO0
    /* renamed from: b */
    public final void mo2656b(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f45131a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f45132b.iterator();
        while (it.hasNext()) {
            ((AbstractC11191tg0) it.next()).getClass();
            paint.setColor(AbstractC0749Lu.m5129b(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m11224D0()) {
                canvas.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f18174q.mo2506n(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f18174q.mo2502i(), paint);
            } else {
                canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f18174q.mo2503k(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f18174q.mo2504l(), 0.0f, paint);
            }
        }
    }
}
