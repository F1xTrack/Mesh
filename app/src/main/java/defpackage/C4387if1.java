package defpackage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: if1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4387if1 implements InterfaceC7455uf1 {
    public final ReadableMap a;
    public final Callback b;
    public final /* synthetic */ C8216yf1 c;

    public C4387if1(C8216yf1 c8216yf1, ReadableMap readableMap, Callback callback) {
        this.c = c8216yf1;
        this.a = readableMap;
        this.b = callback;
    }

    @Override // defpackage.InterfaceC7455uf1
    public final void execute() {
        this.c.b.configureLayoutAnimation(this.a, this.b);
    }
}
