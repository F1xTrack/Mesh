package p000;

import android.view.MenuInflater;
import android.view.View;

/* renamed from: s2 */
/* loaded from: classes.dex */
public abstract class AbstractC6798s2 {

    /* renamed from: a */
    public final /* synthetic */ int f42204a = 0;

    /* renamed from: b */
    public boolean f42205b;

    /* renamed from: c */
    public Object f42206c;

    public /* synthetic */ AbstractC6798s2() {
    }

    /* renamed from: a */
    public Integer mo3950a(AbstractC6798s2 abstractC6798s2) {
        O90.m5968f(abstractC6798s2, "visibility");
        C8896bn0 c8896bn0 = AbstractC8895bm1.f17143a;
        if (this == abstractC6798s2) {
            return 0;
        }
        C8896bn0 c8896bn02 = AbstractC8895bm1.f17143a;
        Integer num = (Integer) c8896bn02.get(this);
        Integer num2 = (Integer) c8896bn02.get(abstractC6798s2);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* renamed from: b */
    public abstract void mo18163b();

    /* renamed from: c */
    public abstract View mo18164c();

    /* renamed from: d */
    public String mo3951d() {
        return (String) this.f42206c;
    }

    /* renamed from: e */
    public abstract MenuC7450Cq0 mo18165e();

    /* renamed from: f */
    public abstract MenuInflater mo18166f();

    /* renamed from: h */
    public abstract CharSequence mo18167h();

    /* renamed from: i */
    public abstract CharSequence mo18168i();

    /* renamed from: j */
    public abstract void mo18169j();

    /* renamed from: l */
    public abstract boolean mo18170l();

    /* renamed from: n */
    public abstract void mo18171n(View view);

    /* renamed from: o */
    public abstract void mo18172o(int i);

    /* renamed from: p */
    public abstract void mo18173p(CharSequence charSequence);

    /* renamed from: q */
    public abstract void mo18174q(int i);

    /* renamed from: r */
    public abstract void mo18175r(CharSequence charSequence);

    /* renamed from: s */
    public abstract void mo18176s(boolean z);

    public String toString() {
        switch (this.f42204a) {
            case 1:
                return mo3951d();
            default:
                return super.toString();
        }
    }

    public AbstractC6798s2(String str, boolean z) {
        this.f42206c = str;
        this.f42205b = z;
    }

    /* renamed from: m */
    public AbstractC6798s2 mo3952m() {
        return this;
    }
}
