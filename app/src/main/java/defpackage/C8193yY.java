package defpackage;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: yY */
/* loaded from: classes.dex */
public final class C8193yY implements Transition.TransitionListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ AY e;

    public C8193yY(AY ay, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = ay;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        AY ay = this.e;
        Object obj = this.a;
        if (obj != null) {
            ay.t(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            ay.t(obj2, this.d, null);
        }
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
