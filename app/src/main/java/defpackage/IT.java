package defpackage;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.filesystem.DownloadOptions;
import java.io.File;

/* loaded from: classes2.dex */
public final class IT {
    public final DownloadOptions a;
    public final DN0 b;
    public final File c;
    public final boolean d;
    public final InterfaceC7754wE0 e;

    public IT(DownloadOptions downloadOptions, DN0 dn0, File file, boolean z, InterfaceC7754wE0 interfaceC7754wE0) {
        O90.f(interfaceC7754wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
        this.a = downloadOptions;
        this.b = dn0;
        this.c = file;
        this.d = z;
        this.e = interfaceC7754wE0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IT)) {
            return false;
        }
        IT it = (IT) obj;
        return this.a.equals(it.a) && this.b.equals(it.b) && this.c.equals(it.c) && this.d == it.d && O90.a(this.e, it.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + (this.d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "DownloadResumableTaskParams(options=" + this.a + ", call=" + this.b + ", file=" + this.c + ", isResume=" + this.d + ", promise=" + this.e + ")";
    }
}
