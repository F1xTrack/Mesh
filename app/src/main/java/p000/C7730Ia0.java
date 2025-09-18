package p000;

import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import kotlin.KotlinVersion;

/* renamed from: Ia0 */
/* loaded from: classes.dex */
public final class C7730Ia0 {

    /* renamed from: e */
    public final ViewGroup f5019e;

    /* renamed from: a */
    public int f5015a = -1;

    /* renamed from: b */
    public final float[] f5016b = new float[2];

    /* renamed from: c */
    public boolean f5017c = false;

    /* renamed from: d */
    public long f5018d = Long.MIN_VALUE;

    /* renamed from: f */
    public final L21 f5020f = new L21(3);

    public C7730Ia0(ViewGroup viewGroup) {
        this.f5019e = viewGroup;
    }

    /* renamed from: a */
    public final void m3943a(MotionEvent motionEvent, InterfaceC6947uP interfaceC6947uP) {
        if (this.f5015a == -1) {
            AbstractC3929dS.m17683p("ReactNative");
            return;
        }
        UN1.m7998b(!this.f5017c, "Expected to not have already sent a cancel for this gesture");
        UN1.m7999c(interfaceC6947uP);
        int iM6094e = OZ1.m6094e(this.f5019e);
        int i = this.f5015a;
        EnumC11565wb1 enumC11565wb1 = EnumC11565wb1.f44990f;
        long j = this.f5018d;
        float[] fArr = this.f5016b;
        interfaceC6947uP.mo11046g(C11438vb1.m25455a(iM6094e, i, enumC11565wb1, motionEvent, j, fArr[0], fArr[1], this.f5020f));
    }

    /* renamed from: b */
    public final void m3944b(MotionEvent motionEvent, InterfaceC6947uP interfaceC6947uP) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        float[] fArr = this.f5016b;
        ViewGroup viewGroup = this.f5019e;
        if (action == 0) {
            if (this.f5015a != -1) {
                AbstractC3929dS.m17672e("ReactNative");
            }
            this.f5017c = false;
            this.f5018d = motionEvent.getEventTime();
            this.f5015a = AbstractC11946zb1.m26475a(motionEvent.getX(), motionEvent.getY(), viewGroup, fArr);
            interfaceC6947uP.mo11046g(C11438vb1.m25455a(OZ1.m6094e(viewGroup), this.f5015a, EnumC11565wb1.f44987c, motionEvent, this.f5018d, fArr[0], fArr[1], this.f5020f));
            return;
        }
        if (this.f5017c) {
            return;
        }
        if (this.f5015a == -1) {
            AbstractC3929dS.m17672e("ReactNative");
            return;
        }
        if (action == 1) {
            AbstractC11946zb1.m26475a(motionEvent.getX(), motionEvent.getY(), viewGroup, fArr);
            interfaceC6947uP.mo11046g(C11438vb1.m25455a(OZ1.m6094e(viewGroup), this.f5015a, EnumC11565wb1.f44988d, motionEvent, this.f5018d, fArr[0], fArr[1], this.f5020f));
            this.f5015a = -1;
            this.f5018d = Long.MIN_VALUE;
            return;
        }
        if (action == 2) {
            AbstractC11946zb1.m26475a(motionEvent.getX(), motionEvent.getY(), viewGroup, fArr);
            interfaceC6947uP.mo11046g(C11438vb1.m25455a(OZ1.m6094e(viewGroup), this.f5015a, EnumC11565wb1.f44989e, motionEvent, this.f5018d, fArr[0], fArr[1], this.f5020f));
            return;
        }
        if (action == 5) {
            interfaceC6947uP.mo11046g(C11438vb1.m25455a(OZ1.m6094e(viewGroup), this.f5015a, EnumC11565wb1.f44987c, motionEvent, this.f5018d, fArr[0], fArr[1], this.f5020f));
            return;
        }
        if (action == 6) {
            interfaceC6947uP.mo11046g(C11438vb1.m25455a(OZ1.m6094e(viewGroup), this.f5015a, EnumC11565wb1.f44988d, motionEvent, this.f5018d, fArr[0], fArr[1], this.f5020f));
            return;
        }
        if (action != 3) {
            AbstractC3929dS.m17683p("ReactNative");
            return;
        }
        if (((SparseIntArray) this.f5020f.f6473b).get((int) motionEvent.getDownTime(), -1) == -1) {
            AbstractC3929dS.m17672e("ReactNative");
        } else {
            m3943a(motionEvent, interfaceC6947uP);
        }
        this.f5015a = -1;
        this.f5018d = Long.MIN_VALUE;
    }

    /* renamed from: c */
    public final void m3945c(MotionEvent motionEvent, InterfaceC6947uP interfaceC6947uP) {
        if (this.f5017c) {
            return;
        }
        m3943a(motionEvent, interfaceC6947uP);
        this.f5017c = true;
        this.f5015a = -1;
    }
}
