package p000;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.C1722d;
import androidx.fragment.app.C1724f;
import androidx.fragment.app.C1740v;
import java.util.Objects;

/* renamed from: EG */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0269EG implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C1740v f2583a;

    /* renamed from: b */
    public final /* synthetic */ C1724f f2584b;

    /* renamed from: c */
    public final /* synthetic */ View f2585c;

    /* renamed from: d */
    public final /* synthetic */ C1722d f2586d;

    public AnimationAnimationListenerC0269EG(C1740v c1740v, C1724f c1724f, View view, C1722d c1722d) {
        this.f2583a = c1740v;
        this.f2584b = c1724f;
        this.f2585c = view;
        this.f2586d = c1722d;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        O90.m5968f(animation, "animation");
        C1724f c1724f = this.f2584b;
        c1724f.f16183a.post(new RunnableC8339Ts1(c1724f, this.f2585c, this.f2586d, 16));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.f2583a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        O90.m5968f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        O90.m5968f(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.f2583a);
        }
    }
}
