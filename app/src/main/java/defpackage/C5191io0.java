package defpackage;

import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* renamed from: io0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5191io0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ C5191io0(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((C5381jo0) this.b).z.setEnabled(false);
                break;
            default:
                Iterator it = ((C6336oo0) this.b).a.iterator();
                while (it.hasNext()) {
                    ((C5191io0) it.next()).a();
                }
                break;
        }
    }

    public final void b(Long l) {
        switch (this.a) {
            case 0:
                C5381jo0 c5381jo0 = (C5381jo0) this.b;
                c5381jo0.x(c5381jo0.t());
                c5381jo0.z.setEnabled(c5381jo0.s().a != null);
                break;
            default:
                Iterator it = ((C6336oo0) this.b).a.iterator();
                while (it.hasNext()) {
                    ((C5191io0) it.next()).b(l);
                }
                break;
        }
    }
}
