package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: k80 */
/* loaded from: classes.dex */
public final class C9971k80 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f36317a;

    /* renamed from: b */
    public final /* synthetic */ TextView f36318b;

    /* renamed from: c */
    public final /* synthetic */ int f36319c;

    /* renamed from: d */
    public final /* synthetic */ TextView f36320d;

    /* renamed from: e */
    public final /* synthetic */ C10227m80 f36321e;

    public C9971k80(C10227m80 c10227m80, int i, TextView textView, int i2, TextView textView2) {
        this.f36321e = c10227m80;
        this.f36317a = i;
        this.f36318b = textView;
        this.f36319c = i2;
        this.f36320d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C6803s7 c6803s7;
        int i = this.f36317a;
        C10227m80 c10227m80 = this.f36321e;
        c10227m80.f37511n = i;
        c10227m80.f37509l = null;
        TextView textView = this.f36318b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f36319c == 1 && (c6803s7 = c10227m80.f37515r) != null) {
                c6803s7.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f36320d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f36320d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
