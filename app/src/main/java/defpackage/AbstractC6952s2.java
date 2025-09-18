package defpackage;

import android.view.MenuInflater;
import android.view.View;

/* renamed from: s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6952s2 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public Object c;

    public /* synthetic */ AbstractC6952s2() {
    }

    public Integer a(AbstractC6952s2 abstractC6952s2) {
        O90.f(abstractC6952s2, "visibility");
        C2391bn0 c2391bn0 = AbstractC2389bm1.a;
        if (this == abstractC6952s2) {
            return 0;
        }
        C2391bn0 c2391bn02 = AbstractC2389bm1.a;
        Integer num = (Integer) c2391bn02.get(this);
        Integer num2 = (Integer) c2391bn02.get(abstractC6952s2);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void b();

    public abstract View c();

    public String d() {
        return (String) this.c;
    }

    public abstract MenuC0225Cq0 e();

    public abstract MenuInflater f();

    public abstract CharSequence h();

    public abstract CharSequence i();

    public abstract void j();

    public abstract boolean l();

    public abstract void n(View view);

    public abstract void o(int i);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public abstract void s(boolean z);

    public String toString() {
        switch (this.a) {
            case 1:
                return d();
            default:
                return super.toString();
        }
    }

    public AbstractC6952s2(String str, boolean z) {
        this.c = str;
        this.b = z;
    }

    public AbstractC6952s2 m() {
        return this;
    }
}
