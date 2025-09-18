package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: Cc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184Cc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0184Cc1(Object obj, View view, int i) {
        this.a = i;
        this.b = obj;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((InterfaceC6900rl1) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((C7925x8) this.b).remove(animator);
                ((AbstractC0418Fc1) this.c).n.remove(animator);
                break;
            case 1:
                ((InterfaceC6900rl1) this.b).c();
                break;
            default:
                C0607Hn1 c0607Hn1 = (C0607Hn1) this.b;
                c0607Hn1.a.d(1.0f);
                C0295Dn1.e((View) this.c, c0607Hn1);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((AbstractC0418Fc1) this.c).n.add(animator);
                break;
            case 1:
                ((InterfaceC6900rl1) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0184Cc1(AbstractC0418Fc1 abstractC0418Fc1, C7925x8 c7925x8) {
        this.a = 0;
        this.c = abstractC0418Fc1;
        this.b = c7925x8;
    }
}
