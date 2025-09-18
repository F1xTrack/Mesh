package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* renamed from: nG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6043nG0 implements InterfaceC7493us0 {
    public final Context a;
    public final Class b;

    public C6043nG0(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.InterfaceC7493us0
    public final InterfaceC7302ts0 a(T71 t71) {
        Class cls = this.b;
        return new C6425pG0(this.a, t71.z(File.class, cls), t71.z(Uri.class, cls), cls);
    }
}
