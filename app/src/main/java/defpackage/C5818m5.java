package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5818m5 {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public C5818m5(ED ed, boolean z, C6045nH c6045nH, B5 b5, boolean z2) {
        O90.f(c6045nH, "containerContext");
        this.c = ed;
        this.a = z;
        this.d = c6045nH;
        this.e = b5;
        this.b = z2;
    }

    public static void a(Object obj, ArrayList arrayList, C8277z c8277z) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) c8277z.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, c8277z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static C0399Ew0 b(InterfaceC5925me1 interfaceC5925me1) {
        Iterable arrayList;
        EnumC0321Dw0 enumC0321Dw0;
        O90.f(interfaceC5925me1, "<this>");
        if (!(interfaceC5925me1 instanceof C1601Uh0)) {
            return null;
        }
        List upperBounds = interfaceC5925me1.getUpperBounds();
        O90.e(upperBounds, "getUpperBounds(...)");
        List<InterfaceC0974Mg0> list = upperBounds;
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!US1.x((InterfaceC0974Mg0) it.next())) {
                    if (!z || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (d((InterfaceC0974Mg0) it2.next()) != null) {
                                arrayList = upperBounds;
                                break;
                            }
                        }
                    }
                    if (!z || !list.isEmpty()) {
                        for (InterfaceC0974Mg0 interfaceC0974Mg0 : list) {
                            O90.f(interfaceC0974Mg0, "<this>");
                            if (EZ1.k((AbstractC0663Ig0) interfaceC0974Mg0) != null) {
                                arrayList = new ArrayList();
                                for (InterfaceC0974Mg0 interfaceC0974Mg02 : list) {
                                    O90.f(interfaceC0974Mg02, "<this>");
                                    AbstractC0663Ig0 abstractC0663Ig0K = EZ1.k((AbstractC0663Ig0) interfaceC0974Mg02);
                                    if (abstractC0663Ig0K != null) {
                                        arrayList.add(abstractC0663Ig0K);
                                    }
                                }
                                Iterable iterable = arrayList;
                                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                                    enumC0321Dw0 = EnumC0321Dw0.b;
                                } else {
                                    Iterator it3 = iterable.iterator();
                                    while (it3.hasNext()) {
                                        if (!US1.D((InterfaceC0974Mg0) it3.next())) {
                                            enumC0321Dw0 = EnumC0321Dw0.c;
                                            break;
                                        }
                                    }
                                    enumC0321Dw0 = EnumC0321Dw0.b;
                                }
                                return new C0399Ew0(enumC0321Dw0, arrayList != upperBounds);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static MX c(X01 x01) {
        C4147hP c4147hP = AbstractC0112Be1.a;
        InterfaceC1087Ns interfaceC1087NsA = x01.E().a();
        InterfaceC7492us interfaceC7492us = interfaceC1087NsA instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsA : null;
        if (interfaceC7492us != null) {
            return AbstractC7002sI.g(interfaceC7492us);
        }
        return null;
    }

    public static EnumC0321Dw0 d(InterfaceC0974Mg0 interfaceC0974Mg0) {
        C0240Cv0 c0240Cv0 = C0240Cv0.g;
        if (US1.B(c0240Cv0.x(interfaceC0974Mg0))) {
            return EnumC0321Dw0.b;
        }
        if (US1.B(c0240Cv0.V(interfaceC0974Mg0))) {
            return null;
        }
        return EnumC0321Dw0.c;
    }

    public void e() {
        ((C8312zA0) this.c).getScrollHandle();
    }

    public void f(float f, float f2) {
        i();
        this.d = ValueAnimator.ofFloat(f, f2);
        C5436k5 c5436k5 = new C5436k5(this, 0);
        ((ValueAnimator) this.d).setInterpolator(new DecelerateInterpolator());
        ((ValueAnimator) this.d).addUpdateListener(c5436k5);
        ((ValueAnimator) this.d).addListener(c5436k5);
        ((ValueAnimator) this.d).setDuration(400L);
        ((ValueAnimator) this.d).start();
    }

    public void g(float f, float f2) {
        i();
        this.d = ValueAnimator.ofFloat(f, f2);
        C5436k5 c5436k5 = new C5436k5(this, 1);
        ((ValueAnimator) this.d).setInterpolator(new DecelerateInterpolator());
        ((ValueAnimator) this.d).addUpdateListener(c5436k5);
        ((ValueAnimator) this.d).addListener(c5436k5);
        ((ValueAnimator) this.d).setDuration(400L);
        ((ValueAnimator) this.d).start();
    }

    public void h(float f, float f2, float f3, float f4) {
        i();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f4);
        this.d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        C5627l5 c5627l5 = new C5627l5(this, f, f2);
        ((ValueAnimator) this.d).addUpdateListener(c5627l5);
        ((ValueAnimator) this.d).addListener(c5627l5);
        ((ValueAnimator) this.d).setDuration(400L);
        ((ValueAnimator) this.d).start();
    }

    public void i() {
        ValueAnimator valueAnimator = (ValueAnimator) this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
        this.a = false;
        ((OverScroller) this.e).forceFinished(true);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public ArrayList j(InterfaceC0974Mg0 interfaceC0974Mg0) {
        C6045nH c6045nH = (C6045nH) this.d;
        C0336Eb0 c0336Eb0 = (C0336Eb0) c6045nH.d.getValue();
        C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
        O90.f(interfaceC0974Mg0, "<this>");
        C3499e1 c3499e1 = new C3499e1(interfaceC0974Mg0, ((D5) c4375ib0.q).b(c0336Eb0, ((AbstractC0663Ig0) interfaceC0974Mg0).getAnnotations()), null);
        C8277z c8277z = new C8277z(3, this);
        ArrayList arrayList = new ArrayList(1);
        a(c3499e1, arrayList, c8277z);
        return arrayList;
    }

    public C5818m5(Context context, String str, C2359bc1 c2359bc1, boolean z, boolean z2) {
        O90.f(context, "context");
        O90.f(c2359bc1, "callback");
        this.c = context;
        this.d = str;
        this.e = c2359bc1;
        this.a = z;
        this.b = z2;
    }
}
