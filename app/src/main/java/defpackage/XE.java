package defpackage;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class XE implements InterfaceC7316tx {
    public final Context a;
    public final IR0 b;

    public XE(Context context, IR0 ir0) {
        this.a = context.getApplicationContext();
        this.b = ir0;
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStart() {
        X11 x11Q = X11.q(this.a);
        IR0 ir0 = this.b;
        synchronized (x11Q) {
            ((HashSet) x11Q.d).add(ir0);
            if (!x11Q.b && !((HashSet) x11Q.d).isEmpty()) {
                x11Q.b = ((U11) x11Q.c).a();
            }
        }
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStop() {
        X11 x11Q = X11.q(this.a);
        IR0 ir0 = this.b;
        synchronized (x11Q) {
            ((HashSet) x11Q.d).remove(ir0);
            if (x11Q.b && ((HashSet) x11Q.d).isEmpty()) {
                ((U11) x11Q.c).unregister();
                x11Q.b = false;
            }
        }
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onDestroy() {
    }
}
