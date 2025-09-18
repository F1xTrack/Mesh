package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: cX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC2532cX implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ C2342bX d;
    public final /* synthetic */ int e;

    public /* synthetic */ CallableC2532cX(String str, Context context, C2342bX c2342bX, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.d = c2342bX;
        this.e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return AbstractC3598eX.a(this.b, this.c, this.d, this.e);
            default:
                try {
                    return AbstractC3598eX.a(this.b, this.c, this.d, this.e);
                } catch (Throwable unused) {
                    return new C3408dX(-3);
                }
        }
    }
}
