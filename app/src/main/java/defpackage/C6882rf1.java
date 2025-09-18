package defpackage;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;

/* renamed from: rf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6882rf1 extends AbstractC8026xf1 {
    public final int b;
    public final /* synthetic */ C8216yf1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6882rf1(C8216yf1 c8216yf1, int i, int i2) {
        super(i);
        this.c = c8216yf1;
        this.b = i2;
    }

    @Override // defpackage.InterfaceC7455uf1
    public final void execute() {
        try {
            this.c.b.sendAccessibilityEvent(this.a, this.b);
        } catch (RetryableMountingLayerException e) {
            ReactSoftExceptionLogger.logSoftException("yf1", e);
        }
    }
}
