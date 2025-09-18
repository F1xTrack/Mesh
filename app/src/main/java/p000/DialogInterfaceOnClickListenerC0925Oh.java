package p000;

import android.content.DialogInterface;
import com.facebook.react.bridge.Callback;
import java.lang.ref.WeakReference;

/* renamed from: Oh */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0925Oh implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f8570a;

    /* renamed from: b */
    public final Object f8571b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0925Oh(int i, Object obj) {
        this.f8570a = i;
        this.f8571b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = this.f8571b;
        switch (this.f8570a) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((C0988Ph) weakReference.get()).m6417h(true);
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
                            throw new C3894cu("Unknown button ID pressed.");
                        }
                        callback.invoke(0);
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            default:
                ((C0157CU) obj).f1394c.m6417h(true);
                return;
        }
    }

    public DialogInterfaceOnClickListenerC0925Oh(C0988Ph c0988Ph) {
        this.f8570a = 0;
        this.f8571b = new WeakReference(c0988Ph);
    }
}
