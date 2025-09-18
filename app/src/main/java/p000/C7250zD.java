package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: zD */
/* loaded from: classes.dex */
public final class C7250zD extends View {

    /* renamed from: a */
    public final Paint f46723a;

    /* renamed from: b */
    public final HashMap f46724b;

    /* renamed from: c */
    public final HashMap f46725c;

    /* renamed from: d */
    public final Paint f46726d;

    /* renamed from: e */
    public List f46727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7250zD(S91 s91) {
        super(s91);
        O90.m5968f(s91, "context");
        Paint paint = new Paint();
        this.f46723a = paint;
        this.f46724b = new HashMap();
        this.f46725c = new HashMap();
        Paint paint2 = new Paint();
        this.f46726d = paint2;
        this.f46727e = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        O90.m5968f(canvas, "canvas");
        super.onDraw(canvas);
        for (C7681Hb1 c7681Hb1 : this.f46724b.values()) {
            Paint paint = this.f46723a;
            paint.setColor(c7681Hb1.f4361c);
            canvas.drawRect(c7681Hb1.f4360b, paint);
            int i = c7681Hb1.f4359a;
            RunnableC6246ja runnableC6246ja = new RunnableC6246ja(this, i, 5);
            HashMap map = this.f46725c;
            if (!map.containsKey(Integer.valueOf(i))) {
                map.put(Integer.valueOf(i), runnableC6246ja);
                UiThreadUtil.runOnUiThread(runnableC6246ja, 2000L);
            }
        }
        Iterator it = this.f46727e.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.f46726d);
        }
    }

    public final void setHighlightedElementsRectangles(List<RectF> list) {
        O90.m5968f(list, "elementsRectangles");
        this.f46727e = list;
        invalidate();
    }

    public final void setTraceUpdates(List<C7681Hb1> list) {
        O90.m5968f(list, "traceUpdates");
        for (C7681Hb1 c7681Hb1 : list) {
            int i = c7681Hb1.f4359a;
            HashMap map = this.f46725c;
            if (map.containsKey(Integer.valueOf(i))) {
                UiThreadUtil.removeOnUiThread((Runnable) map.get(Integer.valueOf(i)));
                map.remove(Integer.valueOf(i));
            }
            this.f46724b.put(Integer.valueOf(i), c7681Hb1);
        }
        invalidate();
    }
}
