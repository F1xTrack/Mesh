package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: cX */
/* loaded from: classes.dex */
public final class CallableC1853cX implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f17583a;

    /* renamed from: b */
    public final /* synthetic */ String f17584b;

    /* renamed from: c */
    public final /* synthetic */ Context f17585c;

    /* renamed from: d */
    public final /* synthetic */ C1791bX f17586d;

    /* renamed from: e */
    public final /* synthetic */ int f17587e;

    public /* synthetic */ CallableC1853cX(String str, Context context, C1791bX c1791bX, int i, int i2) {
        this.f17583a = i2;
        this.f17584b = str;
        this.f17585c = context;
        this.f17586d = c1791bX;
        this.f17587e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17583a) {
            case 0:
                return AbstractC3996eX.m18006a(this.f17584b, this.f17585c, this.f17586d, this.f17587e);
            default:
                try {
                    return AbstractC3996eX.m18006a(this.f17584b, this.f17585c, this.f17586d, this.f17587e);
                } catch (Throwable unused) {
                    return new C3934dX(-3);
                }
        }
    }
}
