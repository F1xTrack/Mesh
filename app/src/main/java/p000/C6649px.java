package p000;

import androidx.activity.C1690a;
import androidx.fragment.app.AbstractActivityC1730l;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: px */
/* loaded from: classes2.dex */
public final class C6649px {

    /* renamed from: a */
    public boolean f40445a = true;

    /* renamed from: b */
    public boolean f40446b;

    /* renamed from: c */
    public Object f40447c;

    /* renamed from: d */
    public Object f40448d;

    /* renamed from: a */
    public C6712qx m23890a() {
        return new C6712qx(this.f40445a, this.f40446b, (String[]) this.f40447c, (String[]) this.f40448d);
    }

    /* renamed from: b */
    public void m23891b(C4080fs... c4080fsArr) {
        O90.m5968f(c4080fsArr, "cipherSuites");
        if (!this.f40445a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(c4080fsArr.length);
        for (C4080fs c4080fs : c4080fsArr) {
            arrayList.add(c4080fs.f27439a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m23892c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: c */
    public void m23892c(String... strArr) {
        O90.m5968f(strArr, "cipherSuites");
        if (!this.f40445a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f40447c = (String[]) strArr.clone();
    }

    /* renamed from: d */
    public void m23893d() {
        C1690a onBackPressedDispatcher;
        if (this.f40445a || !this.f40446b) {
            return;
        }
        C10659pW0 c10659pW0 = (C10659pW0) this.f40447c;
        AbstractActivityC1730l activity = c10659pW0.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.m9819a(c10659pW0, (C0767MB) this.f40448d);
        }
        this.f40445a = true;
    }

    /* renamed from: e */
    public void m23894e(EnumC8043Oa1... enumC8043Oa1Arr) {
        if (!this.f40445a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(enumC8043Oa1Arr.length);
        for (EnumC8043Oa1 enumC8043Oa1 : enumC8043Oa1Arr) {
            arrayList.add(enumC8043Oa1.f8506a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m23895f((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: f */
    public void m23895f(String... strArr) {
        O90.m5968f(strArr, "tlsVersions");
        if (!this.f40445a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f40448d = (String[]) strArr.clone();
    }
}
