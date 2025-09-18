package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: lV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10145lV0 {

    /* renamed from: b */
    public boolean f37085b;

    /* renamed from: c */
    public Bundle f37086c;

    /* renamed from: d */
    public boolean f37087d;

    /* renamed from: e */
    public C4095g6 f37088e;

    /* renamed from: a */
    public final WU0 f37084a = new WU0();

    /* renamed from: f */
    public boolean f37089f = true;

    /* renamed from: a */
    public final Bundle m22441a(String str) {
        if (!this.f37087d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f37086c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f37086c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f37086c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f37086c = null;
        }
        return bundle2;
    }

    /* renamed from: b */
    public final InterfaceC10017kV0 m22442b() {
        String str;
        InterfaceC10017kV0 interfaceC10017kV0;
        Iterator it = this.f37084a.iterator();
        do {
            SU0 su0 = (SU0) it;
            if (!su0.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) su0.next();
            O90.m5967e(entry, "components");
            str = (String) entry.getKey();
            interfaceC10017kV0 = (InterfaceC10017kV0) entry.getValue();
        } while (!O90.m5963a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC10017kV0;
    }

    /* renamed from: c */
    public final void m22443c(String str, InterfaceC10017kV0 interfaceC10017kV0) {
        O90.m5968f(interfaceC10017kV0, "provider");
        if (((InterfaceC10017kV0) this.f37084a.mo1188d(str, interfaceC10017kV0)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: d */
    public final void m22444d() {
        if (!this.f37089f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C4095g6 c4095g6 = this.f37088e;
        if (c4095g6 == null) {
            c4095g6 = new C4095g6(this);
        }
        this.f37088e = c4095g6;
        try {
            C10811qi0.class.getDeclaredConstructor(null);
            C4095g6 c4095g62 = this.f37088e;
            if (c4095g62 != null) {
                ((LinkedHashSet) c4095g62.f27562b).add(C10811qi0.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C10811qi0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
