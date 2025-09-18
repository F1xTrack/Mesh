package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: zD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8320zD extends View {
    public final Paint a;
    public final HashMap b;
    public final HashMap c;
    public final Paint d;
    public List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8320zD(S91 s91) {
        super(s91);
        O90.f(s91, "context");
        Paint paint = new Paint();
        this.a = paint;
        this.b = new HashMap();
        this.c = new HashMap();
        Paint paint2 = new Paint();
        this.d = paint2;
        this.e = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        O90.f(canvas, "canvas");
        super.onDraw(canvas);
        for (C0571Hb1 c0571Hb1 : this.b.values()) {
            Paint paint = this.a;
            paint.setColor(c0571Hb1.c);
            canvas.drawRect(c0571Hb1.b, paint);
            int i = c0571Hb1.a;
            RunnableC5338ja runnableC5338ja = new RunnableC5338ja(this, i, 5);
            HashMap map = this.c;
            if (!map.containsKey(Integer.valueOf(i))) {
                map.put(Integer.valueOf(i), runnableC5338ja);
                UiThreadUtil.runOnUiThread(runnableC5338ja, 2000L);
            }
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.d);
        }
    }

    public final void setHighlightedElementsRectangles(List<RectF> list) {
        O90.f(list, "elementsRectangles");
        this.e = list;
        invalidate();
    }

    public final void setTraceUpdates(List<C0571Hb1> list) {
        O90.f(list, "traceUpdates");
        for (C0571Hb1 c0571Hb1 : list) {
            int i = c0571Hb1.a;
            HashMap map = this.c;
            if (map.containsKey(Integer.valueOf(i))) {
                UiThreadUtil.removeOnUiThread((Runnable) map.get(Integer.valueOf(i)));
                map.remove(Integer.valueOf(i));
            }
            this.b.put(Integer.valueOf(i), c0571Hb1);
        }
        invalidate();
    }
}
