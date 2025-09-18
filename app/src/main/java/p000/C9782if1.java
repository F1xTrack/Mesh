package p000;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: if1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9782if1 implements InterfaceC11318uf1 {

    /* renamed from: a */
    public final ReadableMap f29404a;

    /* renamed from: b */
    public final Callback f29405b;

    /* renamed from: c */
    public final /* synthetic */ C11827yf1 f29406c;

    public C9782if1(C11827yf1 c11827yf1, ReadableMap readableMap, Callback callback) {
        this.f29406c = c11827yf1;
        this.f29404a = readableMap;
        this.f29405b = callback;
    }

    @Override // p000.InterfaceC11318uf1
    public final void execute() {
        this.f29406c.f46385b.configureLayoutAnimation(this.f29404a, this.f29405b);
    }
}
