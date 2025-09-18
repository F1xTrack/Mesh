package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: cJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2491cJ0 extends ConstraintLayout {
    public final RunnableC1577Tz0 p;
    public int q;
    public final C6145no0 r;

    public AbstractC2491cJ0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C6145no0 c6145no0 = new C6145no0();
        this.r = c6145no0;
        C5882mQ0 c5882mQ0 = new C5882mQ0(0.5f);
        C1701Vo1 c1701Vo1E = c6145no0.a.a.e();
        c1701Vo1E.e = c5882mQ0;
        c1701Vo1E.f = c5882mQ0;
        c1701Vo1E.g = c5882mQ0;
        c1701Vo1E.h = c5882mQ0;
        c6145no0.setShapeAppearanceModel(c1701Vo1E.c());
        this.r.j(ColorStateList.valueOf(-1));
        C6145no0 c6145no02 = this.r;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        setBackground(c6145no02);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.x, R.attr.materialClockStyle, 0);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.p = new RunnableC1577Tz0(8, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC1577Tz0 runnableC1577Tz0 = this.p;
            handler.removeCallbacks(runnableC1577Tz0);
            handler.post(runnableC1577Tz0);
        }
    }

    public abstract void g();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC1577Tz0 runnableC1577Tz0 = this.p;
            handler.removeCallbacks(runnableC1577Tz0);
            handler.post(runnableC1577Tz0);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.r.j(ColorStateList.valueOf(i));
    }
}
