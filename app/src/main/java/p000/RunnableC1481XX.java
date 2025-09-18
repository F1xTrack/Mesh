package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: XX */
/* loaded from: classes.dex */
public final class RunnableC1481XX extends AnimationSet implements Runnable {

    /* renamed from: a */
    public final ViewGroup f13829a;

    /* renamed from: b */
    public final View f13830b;

    /* renamed from: c */
    public boolean f13831c;

    /* renamed from: d */
    public boolean f13832d;

    /* renamed from: e */
    public boolean f13833e;

    public RunnableC1481XX(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f13833e = true;
        this.f13829a = viewGroup;
        this.f13830b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f13833e = true;
        if (this.f13831c) {
            return !this.f13832d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f13831c = true;
            ViewTreeObserverOnPreDrawListenerC9947jy0.m22130a(this.f13829a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f13831c;
        ViewGroup viewGroup = this.f13829a;
        if (z || !this.f13833e) {
            viewGroup.endViewTransition(this.f13830b);
            this.f13832d = true;
        } else {
            this.f13833e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f13833e = true;
        if (this.f13831c) {
            return !this.f13832d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f13831c = true;
            ViewTreeObserverOnPreDrawListenerC9947jy0.m22130a(this.f13829a, this);
        }
        return true;
    }
}
