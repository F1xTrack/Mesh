package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: lV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5706lV0 {
    public boolean b;
    public Bundle c;
    public boolean d;
    public C3899g6 e;
    public final WU0 a = new WU0();
    public boolean f = true;

    public final Bundle a(String str) {
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.c = null;
        }
        return bundle2;
    }

    public final InterfaceC5515kV0 b() {
        String str;
        InterfaceC5515kV0 interfaceC5515kV0;
        Iterator it = this.a.iterator();
        do {
            SU0 su0 = (SU0) it;
            if (!su0.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) su0.next();
            O90.e(entry, "components");
            str = (String) entry.getKey();
            interfaceC5515kV0 = (InterfaceC5515kV0) entry.getValue();
        } while (!O90.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC5515kV0;
    }

    public final void c(String str, InterfaceC5515kV0 interfaceC5515kV0) {
        O90.f(interfaceC5515kV0, "provider");
        if (((InterfaceC5515kV0) this.a.d(str, interfaceC5515kV0)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C3899g6 c3899g6 = this.e;
        if (c3899g6 == null) {
            c3899g6 = new C3899g6(this);
        }
        this.e = c3899g6;
        try {
            C6700qi0.class.getDeclaredConstructor(null);
            C3899g6 c3899g62 = this.e;
            if (c3899g62 != null) {
                ((LinkedHashSet) c3899g62.b).add(C6700qi0.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C6700qi0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
