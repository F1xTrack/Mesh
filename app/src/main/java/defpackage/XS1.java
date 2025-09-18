package defpackage;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class XS1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ FR1 h;

    public XS1(FR1 fr1, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = bundle;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = fr1;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.h.H1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
