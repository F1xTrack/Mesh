package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* renamed from: pG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6425pG0 implements InterfaceC7302ts0 {
    public final Context a;
    public final InterfaceC7302ts0 b;
    public final InterfaceC7302ts0 c;
    public final Class d;

    public C6425pG0(Context context, InterfaceC7302ts0 interfaceC7302ts0, InterfaceC7302ts0 interfaceC7302ts02, Class cls) {
        this.a = context.getApplicationContext();
        this.b = interfaceC7302ts0;
        this.c = interfaceC7302ts02;
        this.d = cls;
    }

    @Override // defpackage.InterfaceC7302ts0
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC7362uA1.a((Uri) obj);
    }

    @Override // defpackage.InterfaceC7302ts0
    public final C7111ss0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        Uri uri = (Uri) obj;
        return new C7111ss0(new C1958Yw0(uri), new C6234oG0(this.a, this.b, this.c, uri, i, i2, c0795Jy0, this.d));
    }
}
