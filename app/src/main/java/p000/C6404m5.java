package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: m5 */
/* loaded from: classes.dex */
public final class C6404m5 {

    /* renamed from: a */
    public boolean f37466a;

    /* renamed from: b */
    public boolean f37467b;

    /* renamed from: c */
    public Object f37468c;

    /* renamed from: d */
    public Object f37469d;

    /* renamed from: e */
    public Object f37470e;

    public C6404m5(InterfaceC0266ED interfaceC0266ED, boolean z, C6479nH c6479nH, EnumC0069B5 enumC0069B5, boolean z2) {
        O90.m5968f(c6479nH, "containerContext");
        this.f37468c = interfaceC0266ED;
        this.f37466a = z;
        this.f37469d = c6479nH;
        this.f37470e = enumC0069B5;
        this.f37467b = z2;
    }

    /* renamed from: a */
    public static void m22657a(Object obj, ArrayList arrayList, C7236z c7236z) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) c7236z.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m22657a(it.next(), arrayList, c7236z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* renamed from: b */
    public static C7566Ew0 m22658b(InterfaceC10292me1 interfaceC10292me1) {
        Iterable arrayList;
        EnumC7514Dw0 enumC7514Dw0;
        O90.m5968f(interfaceC10292me1, "<this>");
        if (!(interfaceC10292me1 instanceof C8368Uh0)) {
            return null;
        }
        List upperBounds = interfaceC10292me1.getUpperBounds();
        O90.m5967e(upperBounds, "getUpperBounds(...)");
        List<InterfaceC7950Mg0> list = upperBounds;
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!US1.m8064x((InterfaceC7950Mg0) it.next())) {
                    if (!z || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (m22660d((InterfaceC7950Mg0) it2.next()) != null) {
                                arrayList = upperBounds;
                                break;
                            }
                        }
                    }
                    if (!z || !list.isEmpty()) {
                        for (InterfaceC7950Mg0 interfaceC7950Mg0 : list) {
                            O90.m5968f(interfaceC7950Mg0, "<this>");
                            if (EZ1.m2351k((AbstractC7742Ig0) interfaceC7950Mg0) != null) {
                                arrayList = new ArrayList();
                                for (InterfaceC7950Mg0 interfaceC7950Mg02 : list) {
                                    O90.m5968f(interfaceC7950Mg02, "<this>");
                                    AbstractC7742Ig0 abstractC7742Ig0M2351k = EZ1.m2351k((AbstractC7742Ig0) interfaceC7950Mg02);
                                    if (abstractC7742Ig0M2351k != null) {
                                        arrayList.add(abstractC7742Ig0M2351k);
                                    }
                                }
                                Iterable iterable = arrayList;
                                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                                    enumC7514Dw0 = EnumC7514Dw0.f2323b;
                                } else {
                                    Iterator it3 = iterable.iterator();
                                    while (it3.hasNext()) {
                                        if (!US1.m8020D((InterfaceC7950Mg0) it3.next())) {
                                            enumC7514Dw0 = EnumC7514Dw0.f2324c;
                                            break;
                                        }
                                    }
                                    enumC7514Dw0 = EnumC7514Dw0.f2323b;
                                }
                                return new C7566Ew0(enumC7514Dw0, arrayList != upperBounds);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C0789MX m22659c(X01 x01) {
        C4177hP c4177hP = AbstractC7375Be1.f963a;
        InterfaceC0873Ns interfaceC0873NsMo1962a = x01.mo3797E().mo1962a();
        InterfaceC6976us interfaceC6976us = interfaceC0873NsMo1962a instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo1962a : null;
        if (interfaceC6976us != null) {
            return AbstractC6814sI.m24695g(interfaceC6976us);
        }
        return null;
    }

    /* renamed from: d */
    public static EnumC7514Dw0 m22660d(InterfaceC7950Mg0 interfaceC7950Mg0) {
        C7460Cv0 c7460Cv0 = C7460Cv0.f1757g;
        if (US1.m8018B(c7460Cv0.mo1112x(interfaceC7950Mg0))) {
            return EnumC7514Dw0.f2323b;
        }
        if (US1.m8018B(c7460Cv0.mo1045V(interfaceC7950Mg0))) {
            return null;
        }
        return EnumC7514Dw0.f2324c;
    }

    /* renamed from: e */
    public void m22661e() {
        ((C11891zA0) this.f37468c).getScrollHandle();
    }

    /* renamed from: f */
    public void m22662f(float f, float f2) {
        m22665i();
        this.f37469d = ValueAnimator.ofFloat(f, f2);
        C6278k5 c6278k5 = new C6278k5(this, 0);
        ((ValueAnimator) this.f37469d).setInterpolator(new DecelerateInterpolator());
        ((ValueAnimator) this.f37469d).addUpdateListener(c6278k5);
        ((ValueAnimator) this.f37469d).addListener(c6278k5);
        ((ValueAnimator) this.f37469d).setDuration(400L);
        ((ValueAnimator) this.f37469d).start();
    }

    /* renamed from: g */
    public void m22663g(float f, float f2) {
        m22665i();
        this.f37469d = ValueAnimator.ofFloat(f, f2);
        C6278k5 c6278k5 = new C6278k5(this, 1);
        ((ValueAnimator) this.f37469d).setInterpolator(new DecelerateInterpolator());
        ((ValueAnimator) this.f37469d).addUpdateListener(c6278k5);
        ((ValueAnimator) this.f37469d).addListener(c6278k5);
        ((ValueAnimator) this.f37469d).setDuration(400L);
        ((ValueAnimator) this.f37469d).start();
    }

    /* renamed from: h */
    public void m22664h(float f, float f2, float f3, float f4) {
        m22665i();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f4);
        this.f37469d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        C6341l5 c6341l5 = new C6341l5(this, f, f2);
        ((ValueAnimator) this.f37469d).addUpdateListener(c6341l5);
        ((ValueAnimator) this.f37469d).addListener(c6341l5);
        ((ValueAnimator) this.f37469d).setDuration(400L);
        ((ValueAnimator) this.f37469d).start();
    }

    /* renamed from: i */
    public void m22665i() {
        ValueAnimator valueAnimator = (ValueAnimator) this.f37469d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37469d = null;
        }
        this.f37466a = false;
        ((OverScroller) this.f37470e).forceFinished(true);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* renamed from: j */
    public ArrayList m22666j(InterfaceC7950Mg0 interfaceC7950Mg0) {
        C6479nH c6479nH = (C6479nH) this.f37469d;
        C7524Eb0 c7524Eb0 = (C7524Eb0) c6479nH.f38230d.getValue();
        C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
        O90.m5968f(interfaceC7950Mg0, "<this>");
        C3964e1 c3964e1 = new C3964e1(interfaceC7950Mg0, ((C0195D5) c9773ib0.f29354q).m1545b(c7524Eb0, ((AbstractC7742Ig0) interfaceC7950Mg0).getAnnotations()), null);
        C7236z c7236z = new C7236z(3, this);
        ArrayList arrayList = new ArrayList(1);
        m22657a(c3964e1, arrayList, c7236z);
        return arrayList;
    }

    public C6404m5(Context context, String str, C8875bc1 c8875bc1, boolean z, boolean z2) {
        O90.m5968f(context, "context");
        O90.m5968f(c8875bc1, "callback");
        this.f37468c = context;
        this.f37469d = str;
        this.f37470e = c8875bc1;
        this.f37466a = z;
        this.f37467b = z2;
    }
}
