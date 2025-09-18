package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import ru.mes.dnevnik.R;

/* renamed from: oA0 */
/* loaded from: classes.dex */
public final class C10487oA0 extends AbstractC0151CO {

    /* renamed from: e */
    public final int f38846e;

    /* renamed from: f */
    public EditText f38847f;

    /* renamed from: g */
    public final ViewOnClickListenerC1250Ts f38848g;

    public C10487oA0(C0088BO c0088bo, int i) {
        super(c0088bo);
        this.f38846e = R.drawable.design_password_eye;
        this.f38848g = new ViewOnClickListenerC1250Ts(5, this);
        if (i != 0) {
            this.f38846e = i;
        }
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: b */
    public final void mo1161b() {
        m1176q();
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: c */
    public final int mo1162c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: d */
    public final int mo1163d() {
        return this.f38846e;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: f */
    public final View.OnClickListener mo1165f() {
        return this.f38848g;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: k */
    public final boolean mo1170k() {
        return true;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: l */
    public final boolean mo1171l() {
        EditText editText = this.f38847f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: m */
    public final void mo1172m(EditText editText) {
        this.f38847f = editText;
        m1176q();
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: r */
    public final void mo1177r() {
        EditText editText = this.f38847f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f38847f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: s */
    public final void mo1178s() {
        EditText editText = this.f38847f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
