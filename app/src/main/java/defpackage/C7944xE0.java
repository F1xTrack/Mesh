package defpackage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;

/* renamed from: xE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7944xE0 implements Promise {
    public final /* synthetic */ FZ a;
    public final /* synthetic */ InterfaceC7754wE0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public C7944xE0(InterfaceC6099nZ interfaceC6099nZ, InterfaceC7754wE0 interfaceC7754wE0) {
        this.a = (FZ) interfaceC6099nZ;
        this.b = interfaceC7754wE0;
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2) {
        if (str == null) {
            str = "UnknownCode";
        }
        this.b.reject(str, str2, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [FZ, nZ] */
    @Override // com.facebook.react.bridge.Promise
    public final void resolve(Object obj) {
        this.a.invoke(obj);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, Throwable th) {
        if (str == null) {
            str = "UnknownCode";
        }
        this.b.reject(str, null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2, Throwable th) {
        if (str == null) {
            str = "UnknownCode";
        }
        this.b.reject(str, str2, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(Throwable th) {
        this.b.reject("UnknownCode", null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(Throwable th, WritableMap writableMap) {
        this.b.reject("UnknownCode", null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, WritableMap writableMap) {
        O90.f(writableMap, "userInfo");
        if (str == null) {
            str = "UnknownCode";
        }
        this.b.reject(str, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, Throwable th, WritableMap writableMap) {
        if (str == null) {
            str = "UnknownCode";
        }
        this.b.reject(str, null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2, WritableMap writableMap) {
        O90.f(writableMap, "userInfo");
        if (str == null) {
            str = "UnknownCode";
        }
        this.b.reject(str, str2, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2, Throwable th, WritableMap writableMap) {
        if (str == null) {
            str = "UnknownCode";
        }
        this.b.reject(str, str2, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str) {
        this.b.reject("UnknownCode", str, null);
    }
}
