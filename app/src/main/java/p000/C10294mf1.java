package p000;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;

/* renamed from: mf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10294mf1 extends AbstractC11700xf1 implements InterfaceC10166lf1 {

    /* renamed from: b */
    public final String f37820b;

    /* renamed from: c */
    public final ReadableArray f37821c;

    /* renamed from: d */
    public int f37822d;

    /* renamed from: e */
    public final /* synthetic */ C11827yf1 f37823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10294mf1(C11827yf1 c11827yf1, int i, String str, ReadableArray readableArray) {
        super(i);
        this.f37823e = c11827yf1;
        this.f37822d = 0;
        this.f37820b = str;
        this.f37821c = readableArray;
    }

    @Override // p000.InterfaceC10166lf1
    /* renamed from: a */
    public final int mo22238a() {
        return this.f37822d;
    }

    @Override // p000.InterfaceC10166lf1
    /* renamed from: b */
    public final void mo22239b() {
        this.f37822d++;
    }

    @Override // p000.InterfaceC10166lf1
    /* renamed from: c */
    public final void mo22240c() {
        this.f37823e.f46385b.dispatchCommand(this.f45729a, this.f37820b, this.f37821c);
    }

    @Override // p000.InterfaceC11318uf1
    public final void execute() {
        try {
            this.f37823e.f46385b.dispatchCommand(this.f45729a, this.f37820b, this.f37821c);
        } catch (Throwable th) {
            ReactSoftExceptionLogger.logSoftException("yf1", new RuntimeException("Error dispatching View Command", th));
        }
    }
}
