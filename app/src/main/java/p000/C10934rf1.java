package p000;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;

/* renamed from: rf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10934rf1 extends AbstractC11700xf1 {

    /* renamed from: b */
    public final int f41795b;

    /* renamed from: c */
    public final /* synthetic */ C11827yf1 f41796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10934rf1(C11827yf1 c11827yf1, int i, int i2) {
        super(i);
        this.f41796c = c11827yf1;
        this.f41795b = i2;
    }

    @Override // p000.InterfaceC11318uf1
    public final void execute() {
        try {
            this.f41796c.f46385b.sendAccessibilityEvent(this.f45729a, this.f41795b);
        } catch (RetryableMountingLayerException e) {
            ReactSoftExceptionLogger.logSoftException("yf1", e);
        }
    }
}
