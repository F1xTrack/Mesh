package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Iterator;

/* renamed from: Z5 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1579Z5 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f14706a;

    /* renamed from: b */
    public final /* synthetic */ Object f14707b;

    /* renamed from: c */
    public final /* synthetic */ Object f14708c;

    public /* synthetic */ C1579Z5(Object obj, int i, Object obj2) {
        this.f14706a = i;
        this.f14707b = obj;
        this.f14708c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14706a) {
            case 0:
                C4032f6 c4032f6 = (C4032f6) this.f14707b;
                c4032f6.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((C10439no0) this.f14708c).m23237i(fFloatValue);
                Drawable drawable = c4032f6.f27071u;
                if (drawable instanceof C10439no0) {
                    ((C10439no0) drawable).m23237i(fFloatValue);
                }
                Iterator it = c4032f6.f27067q.iterator();
                if (it.hasNext()) {
                    throw AbstractC7222ym.m26227d(it);
                }
                return;
            default:
                ((View) ((C11843yn1) ((A61) this.f14707b).f73b).f46464d.getParent()).invalidate();
                return;
        }
    }
}
