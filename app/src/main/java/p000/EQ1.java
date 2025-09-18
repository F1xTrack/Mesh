package p000;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class EQ1 {
    /* renamed from: b */
    public static final int m2265b(InterfaceC0615Jl interfaceC0615Jl) {
        O90.m5968f(interfaceC0615Jl, "<this>");
        return interfaceC0615Jl.mo3319a().size();
    }

    /* renamed from: a */
    public void m2266a(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC6246ja(this, i, 11));
    }

    /* renamed from: c */
    public abstract void mo2267c(int i);

    /* renamed from: d */
    public abstract void mo2268d(Typeface typeface);
}
