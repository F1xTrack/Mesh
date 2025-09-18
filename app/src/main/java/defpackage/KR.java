package defpackage;

import androidx.camera.extensions.impl.ExtensionVersionImpl;
import java.util.Objects;

/* loaded from: classes.dex */
public final class KR extends MR {
    public static ExtensionVersionImpl n;
    public final C1591Ue m;

    public KR() {
        if (n == null) {
            n = new ExtensionVersionImpl();
        }
        C1591Ue c1591UeE = C1591Ue.e(n.checkApiVersion(C3664et.a().e()));
        if (c1591UeE != null && C3664et.a().b().d() == c1591UeE.d()) {
            this.m = c1591UeE;
        }
        Objects.toString(this.m);
        AbstractC0759Jm0.a("ExtenderVersion");
    }

    @Override // defpackage.MR
    public final C1591Ue e() {
        return this.m;
    }

    @Override // defpackage.MR
    public final boolean f() {
        try {
            return n.isAdvancedExtenderImplemented();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }
}
