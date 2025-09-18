package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class VL0 {
    public static final C7532v32 c = new C7532v32(19);
    public static volatile VL0 d;
    public ArrayList a;
    public ArrayList b;

    public final void a(String str, XQ xq) {
        O90.f(str, NotificationConstants.ID);
        O90.f(xq, "player");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((VL0) it.next()).a(str, xq);
        }
    }

    public final void b(String str, XQ xq) {
        O90.f(str, NotificationConstants.ID);
        O90.f(xq, "player");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((VL0) it.next()).b(str, xq);
        }
    }
}
