package defpackage;

import java.util.concurrent.Callable;

/* renamed from: iV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC4358iV1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C6755r01 b;

    public /* synthetic */ CallableC4358iV1(C6755r01 c6755r01, int i) {
        this.a = i;
        this.b = c6755r01;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
