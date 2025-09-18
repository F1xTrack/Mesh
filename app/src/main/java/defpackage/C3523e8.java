package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* renamed from: e8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3523e8 extends H21 implements InterfaceC4336iO0 {
    public final int a;
    public UJ b;

    public C3523e8(Context context, int i) {
        this.a = i;
        this.b = new UJ(new File(context.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // defpackage.InterfaceC4336iO0
    public final H21 a(Context context) {
        this.b = new UJ(new File(context.getApplicationInfo().nativeLibraryDir), this.a | 1);
        return this;
    }

    @Override // defpackage.H21
    public final String b() {
        throw null;
    }

    @Override // defpackage.H21
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.b.c(str, i, threadPolicy);
    }

    @Override // defpackage.H21
    public final void d(int i) {
        this.b.getClass();
    }

    @Override // defpackage.H21
    public final String toString() {
        return "ApplicationSoSource[" + this.b.toString() + "]";
    }
}
