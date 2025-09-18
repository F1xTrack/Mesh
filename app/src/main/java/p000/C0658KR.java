package p000;

import androidx.camera.extensions.impl.ExtensionVersionImpl;
import java.util.Objects;

/* renamed from: KR */
/* loaded from: classes.dex */
public final class C0658KR extends AbstractC0783MR {

    /* renamed from: n */
    public static ExtensionVersionImpl f6103n;

    /* renamed from: m */
    public final C1299Ue f6104m;

    public C0658KR() {
        if (f6103n == null) {
            f6103n = new ExtensionVersionImpl();
        }
        C1299Ue c1299UeM8099e = C1299Ue.m8099e(f6103n.checkApiVersion(C4018et.m18062a().m18066e()));
        if (c1299UeM8099e != null && C4018et.m18062a().m18065b().m8102d() == c1299UeM8099e.m8102d()) {
            this.f6104m = c1299UeM8099e;
        }
        Objects.toString(this.f6104m);
        AbstractC7806Jm0.m4407a("ExtenderVersion");
    }

    @Override // p000.AbstractC0783MR
    /* renamed from: e */
    public final C1299Ue mo4323e() {
        return this.f6104m;
    }

    @Override // p000.AbstractC0783MR
    /* renamed from: f */
    public final boolean mo4324f() {
        try {
            return f6103n.isAdvancedExtenderImplemented();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }
}
