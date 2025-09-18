package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class EQ1 {
    public static final int b(InterfaceC0755Jl interfaceC0755Jl) {
        O90.f(interfaceC0755Jl, "<this>");
        return interfaceC0755Jl.a().size();
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC5338ja(this, i, 11));
    }

    public abstract void c(int i);

    public abstract void d(Typeface typeface);
}
