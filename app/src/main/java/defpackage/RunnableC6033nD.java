package defpackage;

import android.widget.EditText;

/* renamed from: nD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6033nD implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ RunnableC6033nD(EditText editText, int i) {
        this.a = i;
        this.b = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                EditText editText = this.b;
                editText.requestFocus();
                editText.post(new K21(1, editText));
                break;
            default:
                EditText editText2 = this.b;
                if (!(editText2 instanceof C3370dK0)) {
                    if (editText2 != null) {
                        editText2.requestFocus();
                        break;
                    }
                } else {
                    ((C3370dK0) editText2).h();
                    break;
                }
                break;
        }
    }
}
