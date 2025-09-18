package p000;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: AY */
/* loaded from: classes.dex */
public final class C0035AY extends AbstractC0161CY {
    /* renamed from: s */
    public static boolean m203s(Transition transition) {
        return (AbstractC0161CY.m1208h(transition.getTargetIds()) && AbstractC0161CY.m1208h(transition.getTargetNames()) && AbstractC0161CY.m1208h(transition.getTargetTypes())) ? false : true;
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: a */
    public final void mo204a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: b */
    public final void mo205b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo205b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m203s(transition) || !AbstractC0161CY.m1208h(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: c */
    public final void mo206c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: e */
    public final boolean mo207e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: f */
    public final Object mo208f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: i */
    public final Object mo209i(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: j */
    public final Object mo210j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: k */
    public final void mo211k(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C7145xY(view, arrayList));
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: l */
    public final void mo212l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C7208yY(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: m */
    public final void mo213m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC0161CY.m1207g(view, rect);
            ((Transition) obj).setEpicenterCallback(new C7082wY(0, rect));
        }
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: n */
    public final void mo214n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C7082wY(1, rect));
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: o */
    public final void mo215o(Object obj, C0744Lp c0744Lp, RunnableC3973eA runnableC3973eA) {
        ((Transition) obj).addListener(new C7271zY(runnableC3973eA));
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: p */
    public final void mo216p(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0161CY.m1206d(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo205b(transitionSet, arrayList);
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: q */
    public final void mo217q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m219t(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p000.AbstractC0161CY
    /* renamed from: r */
    public final Object mo218r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: t */
    public final void m219t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m219t(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m203s(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }
}
