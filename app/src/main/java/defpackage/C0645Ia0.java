package defpackage;

import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import kotlin.KotlinVersion;

/* renamed from: Ia0 */
/* loaded from: classes.dex */
public final class C0645Ia0 {
    public final ViewGroup e;
    public int a = -1;
    public final float[] b = new float[2];
    public boolean c = false;
    public long d = Long.MIN_VALUE;
    public final L21 f = new L21(3);

    public C0645Ia0(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    public final void a(MotionEvent motionEvent, InterfaceC7405uP interfaceC7405uP) {
        if (this.a == -1) {
            AbstractC3393dS.p("ReactNative");
            return;
        }
        UN1.b(!this.c, "Expected to not have already sent a cancel for this gesture");
        UN1.c(interfaceC7405uP);
        int iE = OZ1.e(this.e);
        int i = this.a;
        EnumC7824wb1 enumC7824wb1 = EnumC7824wb1.f;
        long j = this.d;
        float[] fArr = this.b;
        interfaceC7405uP.g(C7634vb1.a(iE, i, enumC7824wb1, motionEvent, j, fArr[0], fArr[1], this.f));
    }

    public final void b(MotionEvent motionEvent, InterfaceC7405uP interfaceC7405uP) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        float[] fArr = this.b;
        ViewGroup viewGroup = this.e;
        if (action == 0) {
            if (this.a != -1) {
                AbstractC3393dS.e("ReactNative");
            }
            this.c = false;
            this.d = motionEvent.getEventTime();
            this.a = AbstractC8394zb1.a(motionEvent.getX(), motionEvent.getY(), viewGroup, fArr);
            interfaceC7405uP.g(C7634vb1.a(OZ1.e(viewGroup), this.a, EnumC7824wb1.c, motionEvent, this.d, fArr[0], fArr[1], this.f));
            return;
        }
        if (this.c) {
            return;
        }
        if (this.a == -1) {
            AbstractC3393dS.e("ReactNative");
            return;
        }
        if (action == 1) {
            AbstractC8394zb1.a(motionEvent.getX(), motionEvent.getY(), viewGroup, fArr);
            interfaceC7405uP.g(C7634vb1.a(OZ1.e(viewGroup), this.a, EnumC7824wb1.d, motionEvent, this.d, fArr[0], fArr[1], this.f));
            this.a = -1;
            this.d = Long.MIN_VALUE;
            return;
        }
        if (action == 2) {
            AbstractC8394zb1.a(motionEvent.getX(), motionEvent.getY(), viewGroup, fArr);
            interfaceC7405uP.g(C7634vb1.a(OZ1.e(viewGroup), this.a, EnumC7824wb1.e, motionEvent, this.d, fArr[0], fArr[1], this.f));
            return;
        }
        if (action == 5) {
            interfaceC7405uP.g(C7634vb1.a(OZ1.e(viewGroup), this.a, EnumC7824wb1.c, motionEvent, this.d, fArr[0], fArr[1], this.f));
            return;
        }
        if (action == 6) {
            interfaceC7405uP.g(C7634vb1.a(OZ1.e(viewGroup), this.a, EnumC7824wb1.d, motionEvent, this.d, fArr[0], fArr[1], this.f));
            return;
        }
        if (action != 3) {
            AbstractC3393dS.p("ReactNative");
            return;
        }
        if (((SparseIntArray) this.f.b).get((int) motionEvent.getDownTime(), -1) == -1) {
            AbstractC3393dS.e("ReactNative");
        } else {
            a(motionEvent, interfaceC7405uP);
        }
        this.a = -1;
        this.d = Long.MIN_VALUE;
    }

    public final void c(MotionEvent motionEvent, InterfaceC7405uP interfaceC7405uP) {
        if (this.c) {
            return;
        }
        a(motionEvent, interfaceC7405uP);
        this.c = true;
        this.a = -1;
    }
}
