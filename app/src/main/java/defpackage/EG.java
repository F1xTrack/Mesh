package defpackage;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.d;
import androidx.fragment.app.f;
import androidx.fragment.app.v;
import java.util.Objects;

/* loaded from: classes.dex */
public final class EG implements Animation.AnimationListener {
    public final /* synthetic */ v a;
    public final /* synthetic */ f b;
    public final /* synthetic */ View c;
    public final /* synthetic */ d d;

    public EG(v vVar, f fVar, View view, d dVar) {
        this.a = vVar;
        this.b = fVar;
        this.c = view;
        this.d = dVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        O90.f(animation, "animation");
        f fVar = this.b;
        fVar.a.post(new RunnableC1557Ts1(fVar, this.c, this.d, 16));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        O90.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        O90.f(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }
}
