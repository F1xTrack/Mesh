package p000;

import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: aN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8716aN0 extends KJ0 implements InterfaceC7761Ip1 {

    /* renamed from: a0 */
    public int f15481a0;

    /* renamed from: b0 */
    public EditText f15482b0;

    /* renamed from: c0 */
    public VM0 f15483c0;

    /* renamed from: d0 */
    public String f15484d0;

    /* renamed from: e0 */
    public String f15485e0;

    public C8716aN0(InterfaceC9233eN0 interfaceC9233eN0) {
        super(interfaceC9233eN0);
        this.f15481a0 = -1;
        this.f15484d0 = null;
        this.f15485e0 = null;
        this.f5998J = 1;
        m2173D(this);
    }

    @Override // p000.EM0
    /* renamed from: E */
    public final void mo2174E(float f, int i) {
        super.mo2174E(f, i);
        mo2191t();
    }

    @Override // p000.InterfaceC7761Ip1
    /* renamed from: a0 */
    public final long mo4023a0(YogaNodeJNIBase yogaNodeJNIBase, float f, EnumC7813Jp1 enumC7813Jp1, float f2, EnumC7813Jp1 enumC7813Jp12) {
        EditText editText = this.f15482b0;
        UN1.m7999c(editText);
        VM0 vm0 = this.f15483c0;
        if (vm0 != null) {
            editText.setText(vm0.f12527a);
            editText.setTextSize(0, vm0.f12528b);
            editText.setMinLines(vm0.f12529c);
            editText.setMaxLines(vm0.f12530d);
            editText.setInputType(vm0.f12531e);
            editText.setHint(vm0.f12533g);
            editText.setBreakStrategy(vm0.f12532f);
        } else {
            editText.setTextSize(0, this.f5989A.m21976a());
            int i = this.f5996H;
            if (i != -1) {
                editText.setLines(i);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i2 = this.f5998J;
            if (breakStrategy != i2) {
                editText.setBreakStrategy(i2);
            }
        }
        editText.setHint(this.f15485e0);
        editText.measure(AbstractC9080dA1.m17502b(f, enumC7813Jp1), AbstractC9080dA1.m17502b(f2, enumC7813Jp12));
        return AbstractC11746y12.m26033b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // p000.EM0, p000.DM0
    /* renamed from: d */
    public final void mo1654d(S91 s91) {
        this.f2652d = s91;
        S91 s912 = this.f2652d;
        UN1.m7999c(s912);
        EditText editText = new EditText(new C1130Ry(s912, R.style.Theme_ReactNative_TextInput_DefaultBackground));
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        float paddingStart = editText.getPaddingStart();
        Y21 y21 = this.f2666r;
        y21.m9208b(paddingStart, 4);
        m2176G();
        y21.m9208b(editText.getPaddingTop(), 1);
        m2176G();
        y21.m9208b(editText.getPaddingEnd(), 5);
        m2176G();
        y21.m9208b(editText.getPaddingBottom(), 3);
        m2176G();
        this.f15482b0 = editText;
        editText.setPadding(0, 0, 0, 0);
        this.f15482b0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // p000.EM0, p000.DM0
    /* renamed from: e */
    public final void mo1655e(Object obj) {
        UN1.m7997a(obj instanceof VM0);
        this.f15483c0 = (VM0) obj;
        m2180i();
    }

    @Override // p000.EM0
    /* renamed from: s */
    public final boolean mo2190s() {
        return true;
    }

    @InterfaceC9871jM0(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.f15481a0 = i;
    }

    @InterfaceC9871jM0(name = "placeholder")
    public void setPlaceholder(String str) {
        this.f15485e0 = str;
        mo2191t();
    }

    @InterfaceC9871jM0(name = "text")
    public void setText(String str) {
        this.f15484d0 = str;
        mo2191t();
    }

    @Override // p000.KJ0
    public final void setTextBreakStrategy(String str) {
        if (str == null || "simple".equals(str)) {
            this.f5998J = 0;
            return;
        }
        if ("highQuality".equals(str)) {
            this.f5998J = 1;
        } else {
            if ("balanced".equals(str)) {
                this.f5998J = 2;
                return;
            }
            "Invalid textBreakStrategy: ".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            this.f5998J = 0;
        }
    }

    @Override // p000.EM0
    /* renamed from: u */
    public final void mo2192u(C11827yf1 c11827yf1) {
        if (this.f15481a0 != -1) {
            C8972cN0 c8972cN0 = new C8972cN0(m4595K(this, this.f15484d0, false, null), this.f15481a0, this.f6013Y, m2185n(0), m2185n(1), m2185n(2), m2185n(3), this.f5997I, this.f5998J, this.f5999K);
            c11827yf1.f46391h.add(new C11573wf1(c11827yf1, this.f2649a, c8972cN0, 1));
        }
    }
}
