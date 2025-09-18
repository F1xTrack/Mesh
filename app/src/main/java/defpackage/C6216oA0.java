package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import ru.mes.dnevnik.R;

/* renamed from: oA0 */
/* loaded from: classes.dex */
public final class C6216oA0 extends CO {
    public final int e;
    public EditText f;
    public final ViewOnClickListenerC1555Ts g;

    public C6216oA0(BO bo, int i) {
        super(bo);
        this.e = R.drawable.design_password_eye;
        this.g = new ViewOnClickListenerC1555Ts(5, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.CO
    public final void b() {
        q();
    }

    @Override // defpackage.CO
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.CO
    public final int d() {
        return this.e;
    }

    @Override // defpackage.CO
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.CO
    public final boolean k() {
        return true;
    }

    @Override // defpackage.CO
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.CO
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // defpackage.CO
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.CO
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
