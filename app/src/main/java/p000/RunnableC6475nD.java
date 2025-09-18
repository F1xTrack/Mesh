package p000;

import android.widget.EditText;

/* renamed from: nD */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6475nD implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f38179a;

    /* renamed from: b */
    public final /* synthetic */ EditText f38180b;

    public /* synthetic */ RunnableC6475nD(EditText editText, int i) {
        this.f38179a = i;
        this.f38180b = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38179a) {
            case 0:
                EditText editText = this.f38180b;
                editText.requestFocus();
                editText.post(new K21(1, editText));
                break;
            default:
                EditText editText2 = this.f38180b;
                if (!(editText2 instanceof C9099dK0)) {
                    if (editText2 != null) {
                        editText2.requestFocus();
                        break;
                    }
                } else {
                    ((C9099dK0) editText2).m17539h();
                    break;
                }
                break;
        }
    }
}
