package defpackage;

import androidx.activity.a;
import androidx.fragment.app.l;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: px */
/* loaded from: classes2.dex */
public final class C6553px {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Object d;

    public C6744qx a() {
        return new C6744qx(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(C3852fs... c3852fsArr) {
        O90.f(c3852fsArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(c3852fsArr.length);
        for (C3852fs c3852fs : c3852fsArr) {
            arrayList.add(c3852fs.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        O90.f(strArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.c = (String[]) strArr.clone();
    }

    public void d() {
        a onBackPressedDispatcher;
        if (this.a || !this.b) {
            return;
        }
        C6473pW0 c6473pW0 = (C6473pW0) this.c;
        l activity = c6473pW0.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.a(c6473pW0, (MB) this.d);
        }
        this.a = true;
    }

    public void e(EnumC1113Oa1... enumC1113Oa1Arr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(enumC1113Oa1Arr.length);
        for (EnumC1113Oa1 enumC1113Oa1 : enumC1113Oa1Arr) {
            arrayList.add(enumC1113Oa1.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        f((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void f(String... strArr) {
        O90.f(strArr, "tlsVersions");
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }
}
