package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* renamed from: pG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10627pG0 implements InterfaceC11215ts0 {

    /* renamed from: a */
    public final Context f39990a;

    /* renamed from: b */
    public final InterfaceC11215ts0 f39991b;

    /* renamed from: c */
    public final InterfaceC11215ts0 f39992c;

    /* renamed from: d */
    public final Class f39993d;

    public C10627pG0(Context context, InterfaceC11215ts0 interfaceC11215ts0, InterfaceC11215ts0 interfaceC11215ts02, Class cls) {
        this.f39990a = context.getApplicationContext();
        this.f39991b = interfaceC11215ts0;
        this.f39992c = interfaceC11215ts02;
        this.f39993d = cls;
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: a */
    public final boolean mo8529a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC11256uA1.m25126a((Uri) obj);
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: b */
    public final C11087ss0 mo8530b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        Uri uri = (Uri) obj;
        return new C11087ss0(new C8606Yw0(uri), new C10499oG0(this.f39990a, this.f39991b, this.f39992c, uri, i, i2, c7830Jy0, this.f39993d));
    }
}
