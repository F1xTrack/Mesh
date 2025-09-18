package p000;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;

/* renamed from: kf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10038kf1 extends AbstractC11700xf1 implements InterfaceC10166lf1 {

    /* renamed from: b */
    public final int f36594b;

    /* renamed from: c */
    public final ReadableArray f36595c;

    /* renamed from: d */
    public int f36596d;

    /* renamed from: e */
    public final /* synthetic */ C11827yf1 f36597e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10038kf1(C11827yf1 c11827yf1, int i, int i2, ReadableArray readableArray) {
        super(i);
        this.f36597e = c11827yf1;
        this.f36596d = 0;
        this.f36594b = i2;
        this.f36595c = readableArray;
    }

    @Override // p000.InterfaceC10166lf1
    /* renamed from: a */
    public final int mo22238a() {
        return this.f36596d;
    }

    @Override // p000.InterfaceC10166lf1
    /* renamed from: b */
    public final void mo22239b() {
        this.f36596d++;
    }

    @Override // p000.InterfaceC10166lf1
    /* renamed from: c */
    public final void mo22240c() {
        this.f36597e.f46385b.dispatchCommand(this.f45729a, this.f36594b, this.f36595c);
    }

    @Override // p000.InterfaceC11318uf1
    public final void execute() {
        try {
            this.f36597e.f46385b.dispatchCommand(this.f45729a, this.f36594b, this.f36595c);
        } catch (Throwable th) {
            ReactSoftExceptionLogger.logSoftException("yf1", new RuntimeException("Error dispatching View Command", th));
        }
    }
}
