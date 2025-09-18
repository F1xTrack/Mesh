package p000;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* renamed from: e8 */
/* loaded from: classes.dex */
public final class C3971e8 extends H21 implements InterfaceC9747iO0 {

    /* renamed from: a */
    public final int f26555a;

    /* renamed from: b */
    public C1278UJ f26556b;

    public C3971e8(Context context, int i) {
        this.f26555a = i;
        this.f26556b = new C1278UJ(new File(context.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // p000.InterfaceC9747iO0
    /* renamed from: a */
    public final H21 mo11084a(Context context) {
        this.f26556b = new C1278UJ(new File(context.getApplicationInfo().nativeLibraryDir), this.f26555a | 1);
        return this;
    }

    @Override // p000.H21
    /* renamed from: b */
    public final String mo3242b() {
        throw null;
    }

    @Override // p000.H21
    /* renamed from: c */
    public final int mo3243c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.f26556b.mo3243c(str, i, threadPolicy);
    }

    @Override // p000.H21
    /* renamed from: d */
    public final void mo3244d(int i) {
        this.f26556b.getClass();
    }

    @Override // p000.H21
    public final String toString() {
        return "ApplicationSoSource[" + this.f26556b.toString() + "]";
    }
}
