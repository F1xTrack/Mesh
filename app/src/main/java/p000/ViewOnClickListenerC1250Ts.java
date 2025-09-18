package p000;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.swmansion.rnscreens.bottomsheet.DimmingFragment;

/* renamed from: Ts */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1250Ts implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f11566a;

    /* renamed from: b */
    public final /* synthetic */ Object f11567b;

    public /* synthetic */ ViewOnClickListenerC1250Ts(int i, Object obj) {
        this.f11566a = i;
        this.f11567b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11566a) {
            case 0:
                C1502Xs c1502Xs = (C1502Xs) this.f11567b;
                EditText editText = c1502Xs.f14004i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c1502Xs.m1176q();
                    break;
                }
                break;
            case 1:
                C0830NB c0830nb = (C0830NB) this.f11567b;
                O90.m5968f(c0830nb, "this$0");
                View.OnClickListener onClickListener = c0830nb.f7536w1;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                c0830nb.f7537x1.m23893d();
                break;
            case 2:
                DimmingFragment dimmingFragment = (DimmingFragment) this.f11567b;
                O90.m5968f(dimmingFragment, "this$0");
                if (dimmingFragment.f20252a.mo13727h().getSheetClosesOnTouchOutside()) {
                    dimmingFragment.m13731r();
                    break;
                }
                break;
            case 3:
                ((C4237iM) this.f11567b).m19006u();
                break;
            case 4:
                C9927jo0 c9927jo0 = (C9927jo0) this.f11567b;
                c9927jo0.f35411z.setEnabled(c9927jo0.m22104s().f27015a != null);
                c9927jo0.f35409x.toggle();
                c9927jo0.f35398m = c9927jo0.f35398m != 1 ? 1 : 0;
                c9927jo0.m22108y(c9927jo0.f35409x);
                c9927jo0.m22106w();
                break;
            case 5:
                C10487oA0 c10487oA0 = (C10487oA0) this.f11567b;
                EditText editText2 = c10487oA0.f38847f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c10487oA0.f38847f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c10487oA0.f38847f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        c10487oA0.f38847f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        c10487oA0.f38847f.setSelection(selectionEnd);
                    }
                    c10487oA0.m1176q();
                    break;
                }
                break;
            case 6:
                C10915rW0.m24394a((C10915rW0) this.f11567b);
                break;
            default:
                XW0.m9062m((XW0) this.f11567b);
                break;
        }
    }
}
