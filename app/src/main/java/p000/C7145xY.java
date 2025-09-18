package p000;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: xY */
/* loaded from: classes.dex */
public final class C7145xY implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ View f45671a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f45672b;

    public C7145xY(View view, ArrayList arrayList) {
        this.f45671a = view;
        this.f45672b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f45671a.setVisibility(8);
        ArrayList arrayList = this.f45672b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
