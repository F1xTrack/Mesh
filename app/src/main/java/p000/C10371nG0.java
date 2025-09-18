package p000;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* renamed from: nG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10371nG0 implements InterfaceC11343us0 {

    /* renamed from: a */
    public final Context f38223a;

    /* renamed from: b */
    public final Class f38224b;

    public C10371nG0(Context context, Class cls) {
        this.f38223a = context;
        this.f38224b = cls;
    }

    @Override // p000.InterfaceC11343us0
    /* renamed from: a */
    public final InterfaceC11215ts0 mo8114a(T71 t71) {
        Class cls = this.f38224b;
        return new C10627pG0(this.f38223a, t71.m7575z(File.class, cls), t71.m7575z(Uri.class, cls), cls);
    }
}
