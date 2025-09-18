package defpackage;

import android.view.View;

/* renamed from: aX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC2152aX0 implements View.OnFocusChangeListener {
    public final /* synthetic */ NB a;

    public ViewOnFocusChangeListenerC2152aX0(NB nb) {
        this.a = nb;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        NB nb = this.a;
        View.OnFocusChangeListener onFocusChangeListener = nb.M;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(nb, z);
        }
    }
}
