package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.swmansion.rnscreens.bottomsheet.DimmingFragment;

/* renamed from: Ts */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1555Ts implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnClickListenerC1555Ts(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                C1867Xs c1867Xs = (C1867Xs) this.b;
                EditText editText = c1867Xs.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c1867Xs.q();
                    break;
                }
                break;
            case 1:
                NB nb = (NB) this.b;
                O90.f(nb, "this$0");
                View.OnClickListener onClickListener = nb.w1;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                nb.x1.d();
                break;
            case 2:
                DimmingFragment dimmingFragment = (DimmingFragment) this.b;
                O90.f(dimmingFragment, "this$0");
                if (dimmingFragment.a.h().getSheetClosesOnTouchOutside()) {
                    dimmingFragment.r();
                    break;
                }
                break;
            case 3:
                ((C4329iM) this.b).u();
                break;
            case 4:
                C5381jo0 c5381jo0 = (C5381jo0) this.b;
                c5381jo0.z.setEnabled(c5381jo0.s().a != null);
                c5381jo0.x.toggle();
                c5381jo0.m = c5381jo0.m != 1 ? 1 : 0;
                c5381jo0.y(c5381jo0.x);
                c5381jo0.w();
                break;
            case 5:
                C6216oA0 c6216oA0 = (C6216oA0) this.b;
                EditText editText2 = c6216oA0.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c6216oA0.f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c6216oA0.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        c6216oA0.f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        c6216oA0.f.setSelection(selectionEnd);
                    }
                    c6216oA0.q();
                    break;
                }
                break;
            case 6:
                C6854rW0.a((C6854rW0) this.b);
                break;
            default:
                XW0.m((XW0) this.b);
                break;
        }
    }
}
