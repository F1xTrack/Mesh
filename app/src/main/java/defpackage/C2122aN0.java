package defpackage;

import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: aN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2122aN0 extends KJ0 implements InterfaceC0691Ip1 {
    public int a0;
    public EditText b0;
    public VM0 c0;
    public String d0;
    public String e0;

    public C2122aN0(InterfaceC3569eN0 interfaceC3569eN0) {
        super(interfaceC3569eN0);
        this.a0 = -1;
        this.d0 = null;
        this.e0 = null;
        this.J = 1;
        D(this);
    }

    @Override // defpackage.EM0
    public final void E(float f, int i) {
        super.E(f, i);
        t();
    }

    @Override // defpackage.InterfaceC0691Ip1
    public final long a0(YogaNodeJNIBase yogaNodeJNIBase, float f, EnumC0769Jp1 enumC0769Jp1, float f2, EnumC0769Jp1 enumC0769Jp12) {
        EditText editText = this.b0;
        UN1.c(editText);
        VM0 vm0 = this.c0;
        if (vm0 != null) {
            editText.setText(vm0.a);
            editText.setTextSize(0, vm0.b);
            editText.setMinLines(vm0.c);
            editText.setMaxLines(vm0.d);
            editText.setInputType(vm0.e);
            editText.setHint(vm0.g);
            editText.setBreakStrategy(vm0.f);
        } else {
            editText.setTextSize(0, this.A.a());
            int i = this.H;
            if (i != -1) {
                editText.setLines(i);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i2 = this.J;
            if (breakStrategy != i2) {
                editText.setBreakStrategy(i2);
            }
        }
        editText.setHint(this.e0);
        editText.measure(AbstractC3341dA1.b(f, enumC0769Jp1), AbstractC3341dA1.b(f2, enumC0769Jp12));
        return AbstractC8095y12.b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // defpackage.EM0, defpackage.DM0
    public final void d(S91 s91) {
        this.d = s91;
        S91 s912 = this.d;
        UN1.c(s912);
        EditText editText = new EditText(new C1417Ry(s912, R.style.Theme_ReactNative_TextInput_DefaultBackground));
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        float paddingStart = editText.getPaddingStart();
        Y21 y21 = this.r;
        y21.b(paddingStart, 4);
        G();
        y21.b(editText.getPaddingTop(), 1);
        G();
        y21.b(editText.getPaddingEnd(), 5);
        G();
        y21.b(editText.getPaddingBottom(), 3);
        G();
        this.b0 = editText;
        editText.setPadding(0, 0, 0, 0);
        this.b0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // defpackage.EM0, defpackage.DM0
    public final void e(Object obj) {
        UN1.a(obj instanceof VM0);
        this.c0 = (VM0) obj;
        i();
    }

    @Override // defpackage.EM0
    public final boolean s() {
        return true;
    }

    @InterfaceC5297jM0(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.a0 = i;
    }

    @InterfaceC5297jM0(name = "placeholder")
    public void setPlaceholder(String str) {
        this.e0 = str;
        t();
    }

    @InterfaceC5297jM0(name = "text")
    public void setText(String str) {
        this.d0 = str;
        t();
    }

    @Override // defpackage.KJ0
    public final void setTextBreakStrategy(String str) {
        if (str == null || "simple".equals(str)) {
            this.J = 0;
            return;
        }
        if ("highQuality".equals(str)) {
            this.J = 1;
        } else {
            if ("balanced".equals(str)) {
                this.J = 2;
                return;
            }
            "Invalid textBreakStrategy: ".concat(str);
            AbstractC3393dS.p("ReactNative");
            this.J = 0;
        }
    }

    @Override // defpackage.EM0
    public final void u(C8216yf1 c8216yf1) {
        if (this.a0 != -1) {
            C2503cN0 c2503cN0 = new C2503cN0(K(this, this.d0, false, null), this.a0, this.Y, n(0), n(1), n(2), n(3), this.I, this.J, this.K);
            c8216yf1.h.add(new C7836wf1(c8216yf1, this.a, c2503cN0, 1));
        }
    }
}
