package p000;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.filesystem.DownloadOptions;
import java.io.File;

/* renamed from: IT */
/* loaded from: classes2.dex */
public final class C0534IT {

    /* renamed from: a */
    public final DownloadOptions f4940a;

    /* renamed from: b */
    public final DN0 f4941b;

    /* renamed from: c */
    public final File f4942c;

    /* renamed from: d */
    public final boolean f4943d;

    /* renamed from: e */
    public final InterfaceC11518wE0 f4944e;

    public C0534IT(DownloadOptions downloadOptions, DN0 dn0, File file, boolean z, InterfaceC11518wE0 interfaceC11518wE0) {
        O90.m5968f(interfaceC11518wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
        this.f4940a = downloadOptions;
        this.f4941b = dn0;
        this.f4942c = file;
        this.f4943d = z;
        this.f4944e = interfaceC11518wE0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0534IT)) {
            return false;
        }
        C0534IT c0534it = (C0534IT) obj;
        return this.f4940a.equals(c0534it.f4940a) && this.f4941b.equals(c0534it.f4941b) && this.f4942c.equals(c0534it.f4942c) && this.f4943d == c0534it.f4943d && O90.m5963a(this.f4944e, c0534it.f4944e);
    }

    public final int hashCode() {
        return this.f4944e.hashCode() + ((((this.f4942c.hashCode() + ((this.f4941b.hashCode() + (this.f4940a.hashCode() * 31)) * 31)) * 31) + (this.f4943d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "DownloadResumableTaskParams(options=" + this.f4940a + ", call=" + this.f4941b + ", file=" + this.f4942c + ", isResume=" + this.f4943d + ", promise=" + this.f4944e + ")";
    }
}
