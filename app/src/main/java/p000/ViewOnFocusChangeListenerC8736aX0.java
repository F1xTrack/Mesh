package p000;

import android.view.View;

/* renamed from: aX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC8736aX0 implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0830NB f15552a;

    public ViewOnFocusChangeListenerC8736aX0(C0830NB c0830nb) {
        this.f15552a = c0830nb;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C0830NB c0830nb = this.f15552a;
        View.OnFocusChangeListener onFocusChangeListener = c0830nb.f35188M;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(c0830nb, z);
        }
    }
}
