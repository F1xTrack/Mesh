package p000;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: yY */
/* loaded from: classes.dex */
public final class C7208yY implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Object f46292a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f46293b;

    /* renamed from: c */
    public final /* synthetic */ Object f46294c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f46295d;

    /* renamed from: e */
    public final /* synthetic */ C0035AY f46296e;

    public C7208yY(C0035AY c0035ay, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f46296e = c0035ay;
        this.f46292a = obj;
        this.f46293b = arrayList;
        this.f46294c = obj2;
        this.f46295d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C0035AY c0035ay = this.f46296e;
        Object obj = this.f46292a;
        if (obj != null) {
            c0035ay.m219t(obj, this.f46293b, null);
        }
        Object obj2 = this.f46294c;
        if (obj2 != null) {
            c0035ay.m219t(obj2, this.f46295d, null);
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
