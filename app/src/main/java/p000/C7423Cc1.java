package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: Cc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7423Cc1 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f1480a;

    /* renamed from: b */
    public final /* synthetic */ Object f1481b;

    /* renamed from: c */
    public final /* synthetic */ Object f1482c;

    public /* synthetic */ C7423Cc1(Object obj, View view, int i) {
        this.f1480a = i;
        this.f1481b = obj;
        this.f1482c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1480a) {
            case 1:
                ((InterfaceC10946rl1) this.f1481b).mo5508a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1480a) {
            case 0:
                ((C7119x8) this.f1481b).remove(animator);
                ((AbstractC7579Fc1) this.f1482c).f3349n.remove(animator);
                break;
            case 1:
                ((InterfaceC10946rl1) this.f1481b).mo18261c();
                break;
            default:
                C7705Hn1 c7705Hn1 = (C7705Hn1) this.f1481b;
                c7705Hn1.f4508a.mo2781d(1.0f);
                C7497Dn1.m1892e((View) this.f1482c, c7705Hn1);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1480a) {
            case 0:
                ((AbstractC7579Fc1) this.f1482c).f3349n.add(animator);
                break;
            case 1:
                ((InterfaceC10946rl1) this.f1481b).mo5509b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C7423Cc1(AbstractC7579Fc1 abstractC7579Fc1, C7119x8 c7119x8) {
        this.f1480a = 0;
        this.f1482c = abstractC7579Fc1;
        this.f1481b = c7119x8;
    }
}
