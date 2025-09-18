package p000;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;

/* renamed from: xE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11645xE0 implements Promise {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0351FZ f45489a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC11518wE0 f45490b;

    /* JADX WARN: Multi-variable type inference failed */
    public C11645xE0(InterfaceC6497nZ interfaceC6497nZ, InterfaceC11518wE0 interfaceC11518wE0) {
        this.f45489a = (AbstractC0351FZ) interfaceC6497nZ;
        this.f45490b = interfaceC11518wE0;
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2) {
        if (str == null) {
            str = "UnknownCode";
        }
        this.f45490b.reject(str, str2, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [FZ, nZ] */
    @Override // com.facebook.react.bridge.Promise
    public final void resolve(Object obj) {
        this.f45489a.invoke(obj);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, Throwable th) {
        if (str == null) {
            str = "UnknownCode";
        }
        this.f45490b.reject(str, null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2, Throwable th) {
        if (str == null) {
            str = "UnknownCode";
        }
        this.f45490b.reject(str, str2, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(Throwable th) {
        this.f45490b.reject("UnknownCode", null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(Throwable th, WritableMap writableMap) {
        this.f45490b.reject("UnknownCode", null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, WritableMap writableMap) {
        O90.m5968f(writableMap, "userInfo");
        if (str == null) {
            str = "UnknownCode";
        }
        this.f45490b.reject(str, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, Throwable th, WritableMap writableMap) {
        if (str == null) {
            str = "UnknownCode";
        }
        this.f45490b.reject(str, null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2, WritableMap writableMap) {
        O90.m5968f(writableMap, "userInfo");
        if (str == null) {
            str = "UnknownCode";
        }
        this.f45490b.reject(str, str2, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2, Throwable th, WritableMap writableMap) {
        if (str == null) {
            str = "UnknownCode";
        }
        this.f45490b.reject(str, str2, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str) {
        this.f45490b.reject("UnknownCode", str, null);
    }
}
