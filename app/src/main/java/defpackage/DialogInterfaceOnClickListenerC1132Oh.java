package defpackage;

import android.content.DialogInterface;
import com.facebook.react.bridge.Callback;
import java.lang.ref.WeakReference;

/* renamed from: Oh */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1132Oh implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ DialogInterfaceOnClickListenerC1132Oh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((C1210Ph) weakReference.get()).h(true);
                    return;
                }
                return;
            case 1:
                try {
                    dialogInterface.cancel();
                    Callback callback = (Callback) obj;
                    if (i == -2) {
                        callback.invoke(1);
                        return;
                    } else {
                        if (i != -1) {
                            throw new C3286cu("Unknown button ID pressed.");
                        }
                        callback.invoke(0);
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            default:
                ((CU) obj).c.h(true);
                return;
        }
    }

    public DialogInterfaceOnClickListenerC1132Oh(C1210Ph c1210Ph) {
        this.a = 0;
        this.b = new WeakReference(c1210Ph);
    }
}
