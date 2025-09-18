package p000;

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
public abstract class AbstractC8964cJ0 extends ConstraintLayout {

    /* renamed from: p */
    public final RunnableC8352Tz0 f17418p;

    /* renamed from: q */
    public int f17419q;

    /* renamed from: r */
    public final C10439no0 f17420r;

    public AbstractC8964cJ0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C10439no0 c10439no0 = new C10439no0();
        this.f17420r = c10439no0;
        C10263mQ0 c10263mQ0 = new C10263mQ0(0.5f);
        C8435Vo1 c8435Vo1M5027e = c10439no0.f38516a.f37931a.m5027e();
        c8435Vo1M5027e.f12767e = c10263mQ0;
        c8435Vo1M5027e.f12768f = c10263mQ0;
        c8435Vo1M5027e.f12769g = c10263mQ0;
        c8435Vo1M5027e.f12770h = c10263mQ0;
        c10439no0.setShapeAppearanceModel(c8435Vo1M5027e.m8561c());
        this.f17420r.m23238j(ColorStateList.valueOf(-1));
        C10439no0 c10439no02 = this.f17420r;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        setBackground(c10439no02);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.f7710x, R.attr.materialClockStyle, 0);
        this.f17419q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f17418p = new RunnableC8352Tz0(8, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC8352Tz0 runnableC8352Tz0 = this.f17418p;
            handler.removeCallbacks(runnableC8352Tz0);
            handler.post(runnableC8352Tz0);
        }
    }

    /* renamed from: g */
    public abstract void mo10667g();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo10667g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC8352Tz0 runnableC8352Tz0 = this.f17418p;
            handler.removeCallbacks(runnableC8352Tz0);
            handler.post(runnableC8352Tz0);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f17420r.m23238j(ColorStateList.valueOf(i));
    }
}
