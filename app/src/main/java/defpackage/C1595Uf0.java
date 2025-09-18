package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.varioqub.config.model.ConfigValue;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: Uf0 */
/* loaded from: classes2.dex */
public final class C1595Uf0 extends AbstractC0061An1 implements InterfaceC0324Dx0 {
    public final C3378dN a;
    public final ViewGroup b;
    public final S91 c;
    public final C1673Vf0 d;
    public final int e;
    public double f;
    public double g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public final HashSet l;
    public boolean m;
    public final LW n;
    public final NW o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1595Uf0(C3378dN c3378dN, ViewGroup viewGroup, S91 s91, C1673Vf0 c1673Vf0) {
        super(1);
        O90.f(c1673Vf0, "config");
        this.a = c3378dN;
        this.b = viewGroup;
        this.c = s91;
        this.d = c1673Vf0;
        this.e = OZ1.e(c3378dN);
        this.k = -1;
        this.l = new HashSet();
        LW lw = new LW(1, this);
        this.n = lw;
        this.o = new NW(viewGroup, c3378dN, s91);
        viewGroup.getViewTreeObserver().addOnGlobalFocusChangeListener(lw);
    }

    public final double a() {
        J80 j80F;
        J80 j80F2;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        C1698Vn1 c1698Vn1A = AbstractC4212hk1.a(this.b);
        int i = 0;
        int i2 = (c1698Vn1A == null || (j80F2 = c1698Vn1A.a.f(8)) == null) ? 0 : j80F2.d;
        if (!this.d.a && c1698Vn1A != null && (j80F = c1698Vn1A.a.f(2)) != null) {
            i = j80F.d;
        }
        double dA = AbstractC4266i12.a(i2 - i);
        return dA < ConfigValue.DOUBLE_DEFAULT_VALUE ? ConfigValue.DOUBLE_DEFAULT_VALUE : dA;
    }

    public final WritableMap b(double d) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        O90.e(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, d);
        writableMapCreateMap.putInt("duration", this.j);
        writableMapCreateMap.putDouble("timestamp", System.currentTimeMillis());
        writableMapCreateMap.putInt("target", this.k);
        WeakReference weakReference = AbstractC6188o12.a;
        String str = null;
        EditText editText = weakReference != null ? (EditText) weakReference.get() : null;
        if (editText != null) {
            int inputType = editText.getInputType() & 15;
            int inputType2 = editText.getInputType() & 4080;
            str = inputType2 == 32 ? "email-address" : inputType2 == 16 ? "url" : inputType2 == 144 ? "visible-password" : inputType == 2 ? ((editText.getInputType() & 8192) == 0 || (editText.getInputType() & 4096) != 0) ? (editText.getInputType() & 4096) != 0 ? "numeric" : "number-pad" : "decimal-pad" : inputType == 3 ? "phone-pad" : "default";
        }
        writableMapCreateMap.putString("type", str);
        S91 s91 = this.c;
        String str2 = "light";
        if (s91 != null && AbstractC2144aU1.c(s91)) {
            str2 = "dark";
        }
        writableMapCreateMap.putString("appearance", str2);
        return writableMapCreateMap;
    }

    public final boolean c() {
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        C1698Vn1 c1698Vn1A = AbstractC4212hk1.a(this.b);
        if (c1698Vn1A != null) {
            return c1698Vn1A.a.o(8);
        }
        return false;
    }

    public final void d(double d) {
        this.j = 0;
        WritableMap writableMapB = b(d);
        S91 s91 = this.c;
        T91.b(s91, "KeyboardController::keyboardWillShow", writableMapB);
        Iterator it = AbstractC8259yu.f(C5739lg0.g, C5739lg0.f, C5739lg0.h).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C3378dN c3378dN = this.a;
            if (!zHasNext) {
                T91.b(s91, "KeyboardController::keyboardDidShow", b(d));
                T91.c(s91, c3378dN.getId());
                this.f = d;
                return;
            }
            T91.a(s91, c3378dN.getId(), new C5739lg0(this.e, c3378dN.getId(), (EnumC5548kg0) it.next(), d, 1.0d, 0, this.k));
        }
    }

    public final void e(Boolean bool, Double d) {
        C1595Uf0 c1595Uf0 = this;
        double dDoubleValue = d != null ? d.doubleValue() : a();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : c();
        c1595Uf0.h = zBooleanValue;
        c1595Uf0.g = dDoubleValue;
        c1595Uf0.i = false;
        c1595Uf0.j = 0;
        String strConcat = "KeyboardController::".concat(!zBooleanValue ? "keyboardDidHide" : "keyboardDidShow");
        WritableMap writableMapB = c1595Uf0.b(dDoubleValue);
        S91 s91 = c1595Uf0.c;
        T91.b(s91, strConcat, writableMapB);
        for (EnumC5548kg0 enumC5548kg0 : AbstractC8259yu.f(C5739lg0.f, C5739lg0.h)) {
            C3378dN c3378dN = c1595Uf0.a;
            T91.a(s91, c3378dN.getId(), new C5739lg0(c1595Uf0.e, c3378dN.getId(), enumC5548kg0, dDoubleValue, !c1595Uf0.h ? ConfigValue.DOUBLE_DEFAULT_VALUE : 1.0d, c1595Uf0.j, c1595Uf0.k));
            c1595Uf0 = this;
        }
    }

    @Override // defpackage.InterfaceC0324Dx0
    public final C1698Vn1 k(View view, C1698Vn1 c1698Vn1) {
        O90.f(view, "v");
        double dA = a();
        boolean z = (this.h && c()) && !(this.i || AbstractC6001n22.a);
        double d = this.f;
        boolean z2 = d == dA;
        if (z && !z2 && !AbstractC1751Wf0.a) {
            O90.f("onApplyWindowInsets: " + d + " -> " + dA, "message");
            NW nw = this.o;
            if (nw != null) {
                nw.b();
            }
            d(dA);
        }
        return c1698Vn1;
    }

    @Override // defpackage.AbstractC0061An1
    public final void onEnd(C0607Hn1 c0607Hn1) throws Exception {
        if (!AbstractC3693f12.a(c0607Hn1) || this.m) {
            return;
        }
        this.i = false;
        int iA = (int) c0607Hn1.a.a();
        this.j = iA;
        RQ rq = new RQ(this, 13, c0607Hn1);
        if (iA == -1) {
            this.b.post(rq);
        } else {
            rq.run();
        }
    }

    @Override // defpackage.AbstractC0061An1
    public final C1698Vn1 onProgress(C1698Vn1 c1698Vn1, List list) {
        Object next;
        O90.f(c1698Vn1, "insets");
        O90.f(list, "runningAnimations");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0607Hn1 c0607Hn1 = (C0607Hn1) next;
            if (AbstractC3693f12.a(c0607Hn1) && !this.l.contains(c0607Hn1)) {
                break;
            }
        }
        boolean z = next == null;
        if (!this.m && !z) {
            C1673Vf0 c1673Vf0 = this.d;
            c1673Vf0.getClass();
            C1464Sn1 c1464Sn1 = c1698Vn1.a;
            J80 j80F = c1464Sn1.f(8);
            O90.e(j80F, "getInsets(...)");
            J80 j80F2 = c1464Sn1.f(7);
            O90.e(j80F2, "getInsets(...)");
            if (c1673Vf0.a) {
                j80F2 = J80.e;
            }
            J80 j80B = J80.b(j80F.a - j80F2.a, j80F.b - j80F2.b, j80F.c - j80F2.c, j80F.d - j80F2.d);
            J80 j80B2 = J80.b(Math.max(j80B.a, 0), Math.max(j80B.b, 0), Math.max(j80B.c, 0), Math.max(j80B.d, 0));
            float f = j80B2.d - j80B2.b;
            double dA = AbstractC4266i12.a(f);
            double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
            try {
                double dAbs = Math.abs(dA / this.f);
                if (!Double.isNaN(dAbs)) {
                    if (!Double.isInfinite(dAbs)) {
                        d = dAbs;
                    }
                }
            } catch (ArithmeticException e) {
                boolean z2 = AbstractC1751Wf0.a;
                O90.f("Caught arithmetic exception during `progress` calculation: " + e, "message");
            }
            double d2 = d;
            boolean z3 = AbstractC1751Wf0.a;
            O90.f("DiffY: " + f + " " + dA + " " + d2 + " " + AbstractC6001n22.a + " " + this.k, "message");
            EnumC5548kg0 enumC5548kg0 = AbstractC6001n22.a ? C5739lg0.i : C5739lg0.f;
            C3378dN c3378dN = this.a;
            T91.a(this.c, c3378dN.getId(), new C5739lg0(this.e, c3378dN.getId(), enumC5548kg0, dA, d2, this.j, this.k));
        }
        return c1698Vn1;
    }

    @Override // defpackage.AbstractC0061An1
    public final C8430zn1 onStart(C0607Hn1 c0607Hn1, C8430zn1 c8430zn1) {
        if (AbstractC3693f12.a(c0607Hn1) && !this.m) {
            this.i = true;
            this.h = c();
            this.j = (int) c0607Hn1.a.a();
            double dA = a();
            if (this.h) {
                this.f = dA;
            }
            NW nw = this.o;
            if (nw != null) {
                nw.b();
            }
            double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
            boolean z = (dA == ConfigValue.DOUBLE_DEFAULT_VALUE || this.g == dA) ? false : true;
            boolean z2 = this.h;
            boolean z3 = z2 && this.g != ConfigValue.DOUBLE_DEFAULT_VALUE;
            if (z && z3 && AbstractC1751Wf0.a) {
                d(dA);
                this.l.add(c0607Hn1);
                return c8430zn1;
            }
            String strConcat = "KeyboardController::".concat(!z2 ? "keyboardWillHide" : "keyboardWillShow");
            WritableMap writableMapB = b(dA);
            S91 s91 = this.c;
            T91.b(s91, strConcat, writableMapB);
            boolean z4 = AbstractC1751Wf0.a;
            O90.f("HEIGHT:: " + dA + " TAG:: " + this.k, "message");
            C3378dN c3378dN = this.a;
            int id = c3378dN.getId();
            int id2 = c3378dN.getId();
            EnumC5548kg0 enumC5548kg0 = C5739lg0.g;
            if (this.h) {
                d = 1.0d;
            }
            T91.a(s91, id, new C5739lg0(this.e, id2, enumC5548kg0, dA, d, this.j, this.k));
        }
        return c8430zn1;
    }
}
