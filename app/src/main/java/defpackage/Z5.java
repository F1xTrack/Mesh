package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class Z5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Z5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                C3708f6 c3708f6 = (C3708f6) this.b;
                c3708f6.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((C6145no0) this.c).i(fFloatValue);
                Drawable drawable = c3708f6.u;
                if (drawable instanceof C6145no0) {
                    ((C6145no0) drawable).i(fFloatValue);
                }
                Iterator it = c3708f6.q.iterator();
                if (it.hasNext()) {
                    throw AbstractC8235ym.d(it);
                }
                return;
            default:
                ((View) ((C8240yn1) ((A61) this.b).b).d.getParent()).invalidate();
                return;
        }
    }
}
