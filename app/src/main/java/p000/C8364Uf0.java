package p000;

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
public final class C8364Uf0 extends AbstractC7341An1 implements InterfaceC7516Dx0 {

    /* renamed from: a */
    public final C3924dN f11956a;

    /* renamed from: b */
    public final ViewGroup f11957b;

    /* renamed from: c */
    public final S91 f11958c;

    /* renamed from: d */
    public final C8416Vf0 f11959d;

    /* renamed from: e */
    public final int f11960e;

    /* renamed from: f */
    public double f11961f;

    /* renamed from: g */
    public double f11962g;

    /* renamed from: h */
    public boolean f11963h;

    /* renamed from: i */
    public boolean f11964i;

    /* renamed from: j */
    public int f11965j;

    /* renamed from: k */
    public int f11966k;

    /* renamed from: l */
    public final HashSet f11967l;

    /* renamed from: m */
    public boolean f11968m;

    /* renamed from: n */
    public final ViewTreeObserverOnGlobalFocusChangeListenerC0725LW f11969n;

    /* renamed from: o */
    public final C0851NW f11970o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8364Uf0(C3924dN c3924dN, ViewGroup viewGroup, S91 s91, C8416Vf0 c8416Vf0) {
        super(1);
        O90.m5968f(c8416Vf0, "config");
        this.f11956a = c3924dN;
        this.f11957b = viewGroup;
        this.f11958c = s91;
        this.f11959d = c8416Vf0;
        this.f11960e = OZ1.m6094e(c3924dN);
        this.f11966k = -1;
        this.f11967l = new HashSet();
        ViewTreeObserverOnGlobalFocusChangeListenerC0725LW viewTreeObserverOnGlobalFocusChangeListenerC0725LW = new ViewTreeObserverOnGlobalFocusChangeListenerC0725LW(1, this);
        this.f11969n = viewTreeObserverOnGlobalFocusChangeListenerC0725LW;
        this.f11970o = new C0851NW(viewGroup, c3924dN, s91);
        viewGroup.getViewTreeObserver().addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0725LW);
    }

    /* renamed from: a */
    public final double m8109a() {
        J80 j80Mo5837f;
        J80 j80Mo5837f2;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        C8433Vn1 c8433Vn1M18871a = AbstractC9664hk1.m18871a(this.f11957b);
        int i = 0;
        int i2 = (c8433Vn1M18871a == null || (j80Mo5837f2 = c8433Vn1M18871a.f12756a.mo5837f(8)) == null) ? 0 : j80Mo5837f2.f5355d;
        if (!this.f11959d.f12684a && c8433Vn1M18871a != null && (j80Mo5837f = c8433Vn1M18871a.f12756a.mo5837f(2)) != null) {
            i = j80Mo5837f.f5355d;
        }
        double dM18931a = AbstractC9700i12.m18931a(i2 - i);
        return dM18931a < ConfigValue.DOUBLE_DEFAULT_VALUE ? ConfigValue.DOUBLE_DEFAULT_VALUE : dM18931a;
    }

    /* renamed from: b */
    public final WritableMap m8110b(double d) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        O90.m5967e(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, d);
        writableMapCreateMap.putInt("duration", this.f11965j);
        writableMapCreateMap.putDouble("timestamp", System.currentTimeMillis());
        writableMapCreateMap.putInt("target", this.f11966k);
        WeakReference weakReference = AbstractC10468o12.f38689a;
        String str = null;
        EditText editText = weakReference != null ? (EditText) weakReference.get() : null;
        if (editText != null) {
            int inputType = editText.getInputType() & 15;
            int inputType2 = editText.getInputType() & 4080;
            str = inputType2 == 32 ? "email-address" : inputType2 == 16 ? "url" : inputType2 == 144 ? "visible-password" : inputType == 2 ? ((editText.getInputType() & 8192) == 0 || (editText.getInputType() & 4096) != 0) ? (editText.getInputType() & 4096) != 0 ? "numeric" : "number-pad" : "decimal-pad" : inputType == 3 ? "phone-pad" : "default";
        }
        writableMapCreateMap.putString("type", str);
        S91 s91 = this.f11958c;
        String str2 = "light";
        if (s91 != null && AbstractC8731aU1.m9754c(s91)) {
            str2 = "dark";
        }
        writableMapCreateMap.putString("appearance", str2);
        return writableMapCreateMap;
    }

    /* renamed from: c */
    public final boolean m8111c() {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        C8433Vn1 c8433Vn1M18871a = AbstractC9664hk1.m18871a(this.f11957b);
        if (c8433Vn1M18871a != null) {
            return c8433Vn1M18871a.f12756a.mo5841o(8);
        }
        return false;
    }

    /* renamed from: d */
    public final void m8112d(double d) {
        this.f11965j = 0;
        WritableMap writableMapM8110b = m8110b(d);
        S91 s91 = this.f11958c;
        T91.m7609b(s91, "KeyboardController::keyboardWillShow", writableMapM8110b);
        Iterator it = AbstractC7230yu.m26275f(C10167lg0.f37237g, C10167lg0.f37236f, C10167lg0.f37238h).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C3924dN c3924dN = this.f11956a;
            if (!zHasNext) {
                T91.m7609b(s91, "KeyboardController::keyboardDidShow", m8110b(d));
                T91.m7610c(s91, c3924dN.getId());
                this.f11961f = d;
                return;
            }
            T91.m7608a(s91, c3924dN.getId(), new C10167lg0(this.f11960e, c3924dN.getId(), (EnumC10039kg0) it.next(), d, 1.0d, 0, this.f11966k));
        }
    }

    /* renamed from: e */
    public final void m8113e(Boolean bool, Double d) {
        C8364Uf0 c8364Uf0 = this;
        double dDoubleValue = d != null ? d.doubleValue() : m8109a();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : m8111c();
        c8364Uf0.f11963h = zBooleanValue;
        c8364Uf0.f11962g = dDoubleValue;
        c8364Uf0.f11964i = false;
        c8364Uf0.f11965j = 0;
        String strConcat = "KeyboardController::".concat(!zBooleanValue ? "keyboardDidHide" : "keyboardDidShow");
        WritableMap writableMapM8110b = c8364Uf0.m8110b(dDoubleValue);
        S91 s91 = c8364Uf0.f11958c;
        T91.m7609b(s91, strConcat, writableMapM8110b);
        for (EnumC10039kg0 enumC10039kg0 : AbstractC7230yu.m26275f(C10167lg0.f37236f, C10167lg0.f37238h)) {
            C3924dN c3924dN = c8364Uf0.f11956a;
            T91.m7608a(s91, c3924dN.getId(), new C10167lg0(c8364Uf0.f11960e, c3924dN.getId(), enumC10039kg0, dDoubleValue, !c8364Uf0.f11963h ? ConfigValue.DOUBLE_DEFAULT_VALUE : 1.0d, c8364Uf0.f11965j, c8364Uf0.f11966k));
            c8364Uf0 = this;
        }
    }

    @Override // p000.InterfaceC7516Dx0
    /* renamed from: k */
    public final C8433Vn1 mo1953k(View view, C8433Vn1 c8433Vn1) {
        O90.m5968f(view, "v");
        double dM8109a = m8109a();
        boolean z = (this.f11963h && m8111c()) && !(this.f11964i || AbstractC10343n22.f38062a);
        double d = this.f11961f;
        boolean z2 = d == dM8109a;
        if (z && !z2 && !AbstractC8468Wf0.f13314a) {
            O90.m5968f("onApplyWindowInsets: " + d + " -> " + dM8109a, "message");
            C0851NW c0851nw = this.f11970o;
            if (c0851nw != null) {
                c0851nw.m5751b();
            }
            m8112d(dM8109a);
        }
        return c8433Vn1;
    }

    @Override // p000.AbstractC7341An1
    public final void onEnd(C7705Hn1 c7705Hn1) throws Exception {
        if (!AbstractC9316f12.m18155a(c7705Hn1) || this.f11968m) {
            return;
        }
        this.f11964i = false;
        int iMo2778a = (int) c7705Hn1.f4508a.mo2778a();
        this.f11965j = iMo2778a;
        RunnableC1096RQ runnableC1096RQ = new RunnableC1096RQ(this, 13, c7705Hn1);
        if (iMo2778a == -1) {
            this.f11957b.post(runnableC1096RQ);
        } else {
            runnableC1096RQ.run();
        }
    }

    @Override // p000.AbstractC7341An1
    public final C8433Vn1 onProgress(C8433Vn1 c8433Vn1, List list) {
        Object next;
        O90.m5968f(c8433Vn1, "insets");
        O90.m5968f(list, "runningAnimations");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C7705Hn1 c7705Hn1 = (C7705Hn1) next;
            if (AbstractC9316f12.m18155a(c7705Hn1) && !this.f11967l.contains(c7705Hn1)) {
                break;
            }
        }
        boolean z = next == null;
        if (!this.f11968m && !z) {
            C8416Vf0 c8416Vf0 = this.f11959d;
            c8416Vf0.getClass();
            C8277Sn1 c8277Sn1 = c8433Vn1.f12756a;
            J80 j80Mo5837f = c8277Sn1.mo5837f(8);
            O90.m5967e(j80Mo5837f, "getInsets(...)");
            J80 j80Mo5837f2 = c8277Sn1.mo5837f(7);
            O90.m5967e(j80Mo5837f2, "getInsets(...)");
            if (c8416Vf0.f12684a) {
                j80Mo5837f2 = J80.f5351e;
            }
            J80 j80M4201b = J80.m4201b(j80Mo5837f.f5352a - j80Mo5837f2.f5352a, j80Mo5837f.f5353b - j80Mo5837f2.f5353b, j80Mo5837f.f5354c - j80Mo5837f2.f5354c, j80Mo5837f.f5355d - j80Mo5837f2.f5355d);
            J80 j80M4201b2 = J80.m4201b(Math.max(j80M4201b.f5352a, 0), Math.max(j80M4201b.f5353b, 0), Math.max(j80M4201b.f5354c, 0), Math.max(j80M4201b.f5355d, 0));
            float f = j80M4201b2.f5355d - j80M4201b2.f5353b;
            double dM18931a = AbstractC9700i12.m18931a(f);
            double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
            try {
                double dAbs = Math.abs(dM18931a / this.f11961f);
                if (!Double.isNaN(dAbs)) {
                    if (!Double.isInfinite(dAbs)) {
                        d = dAbs;
                    }
                }
            } catch (ArithmeticException e) {
                boolean z2 = AbstractC8468Wf0.f13314a;
                O90.m5968f("Caught arithmetic exception during `progress` calculation: " + e, "message");
            }
            double d2 = d;
            boolean z3 = AbstractC8468Wf0.f13314a;
            O90.m5968f("DiffY: " + f + " " + dM18931a + " " + d2 + " " + AbstractC10343n22.f38062a + " " + this.f11966k, "message");
            EnumC10039kg0 enumC10039kg0 = AbstractC10343n22.f38062a ? C10167lg0.f37239i : C10167lg0.f37236f;
            C3924dN c3924dN = this.f11956a;
            T91.m7608a(this.f11958c, c3924dN.getId(), new C10167lg0(this.f11960e, c3924dN.getId(), enumC10039kg0, dM18931a, d2, this.f11965j, this.f11966k));
        }
        return c8433Vn1;
    }

    @Override // p000.AbstractC7341An1
    public final C11970zn1 onStart(C7705Hn1 c7705Hn1, C11970zn1 c11970zn1) {
        if (AbstractC9316f12.m18155a(c7705Hn1) && !this.f11968m) {
            this.f11964i = true;
            this.f11963h = m8111c();
            this.f11965j = (int) c7705Hn1.f4508a.mo2778a();
            double dM8109a = m8109a();
            if (this.f11963h) {
                this.f11961f = dM8109a;
            }
            C0851NW c0851nw = this.f11970o;
            if (c0851nw != null) {
                c0851nw.m5751b();
            }
            double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
            boolean z = (dM8109a == ConfigValue.DOUBLE_DEFAULT_VALUE || this.f11962g == dM8109a) ? false : true;
            boolean z2 = this.f11963h;
            boolean z3 = z2 && this.f11962g != ConfigValue.DOUBLE_DEFAULT_VALUE;
            if (z && z3 && AbstractC8468Wf0.f13314a) {
                m8112d(dM8109a);
                this.f11967l.add(c7705Hn1);
                return c11970zn1;
            }
            String strConcat = "KeyboardController::".concat(!z2 ? "keyboardWillHide" : "keyboardWillShow");
            WritableMap writableMapM8110b = m8110b(dM8109a);
            S91 s91 = this.f11958c;
            T91.m7609b(s91, strConcat, writableMapM8110b);
            boolean z4 = AbstractC8468Wf0.f13314a;
            O90.m5968f("HEIGHT:: " + dM8109a + " TAG:: " + this.f11966k, "message");
            C3924dN c3924dN = this.f11956a;
            int id = c3924dN.getId();
            int id2 = c3924dN.getId();
            EnumC10039kg0 enumC10039kg0 = C10167lg0.f37237g;
            if (this.f11963h) {
                d = 1.0d;
            }
            T91.m7608a(s91, id, new C10167lg0(this.f11960e, id2, enumC10039kg0, dM8109a, d, this.f11965j, this.f11966k));
        }
        return c11970zn1;
    }
}
