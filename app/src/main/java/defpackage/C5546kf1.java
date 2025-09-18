package defpackage;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;

/* renamed from: kf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5546kf1 extends AbstractC8026xf1 implements InterfaceC5737lf1 {
    public final int b;
    public final ReadableArray c;
    public int d;
    public final /* synthetic */ C8216yf1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5546kf1(C8216yf1 c8216yf1, int i, int i2, ReadableArray readableArray) {
        super(i);
        this.e = c8216yf1;
        this.d = 0;
        this.b = i2;
        this.c = readableArray;
    }

    @Override // defpackage.InterfaceC5737lf1
    public final int a() {
        return this.d;
    }

    @Override // defpackage.InterfaceC5737lf1
    public final void b() {
        this.d++;
    }

    @Override // defpackage.InterfaceC5737lf1
    public final void c() {
        this.e.b.dispatchCommand(this.a, this.b, this.c);
    }

    @Override // defpackage.InterfaceC7455uf1
    public final void execute() {
        try {
            this.e.b.dispatchCommand(this.a, this.b, this.c);
        } catch (Throwable th) {
            ReactSoftExceptionLogger.logSoftException("yf1", new RuntimeException("Error dispatching View Command", th));
        }
    }
}
