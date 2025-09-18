package io.sentry;

import java.util.concurrent.Callable;

/* renamed from: io.sentry.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC5118d1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5142l1 b;

    public /* synthetic */ CallableC5118d1(C5142l1 c5142l1, int i) {
        this.a = i;
        this.b = c5142l1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return Integer.valueOf(this.b.t().length);
            case 1:
                return this.b.t();
            case 2:
                return Integer.valueOf(this.b.t().length);
            case 3:
                return this.b.t();
            case 4:
                return Integer.valueOf(this.b.t().length);
            case 5:
                return this.b.t();
            case 6:
                return Integer.valueOf(this.b.t().length);
            case 7:
                return Integer.valueOf(this.b.t().length);
            case 8:
                return this.b.t();
            case 9:
                return this.b.t();
            case 10:
                return Integer.valueOf(this.b.t().length);
            case 11:
                return this.b.t();
            case 12:
                return Integer.valueOf(this.b.t().length);
            default:
                return this.b.t();
        }
    }
}
