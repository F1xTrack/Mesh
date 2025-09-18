package p000;

import android.os.StrictMode;

/* loaded from: classes.dex */
public final class Y71 extends H21 {
    @Override // p000.H21
    /* renamed from: b */
    public final String mo3242b() {
        throw null;
    }

    @Override // p000.H21
    /* renamed from: c */
    public final int mo3243c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // p000.H21
    public final String toString() {
        return "SystemLoadWrapperSoSource[" + J71.getClassLoaderLdLoadLibrary() + "]";
    }
}
