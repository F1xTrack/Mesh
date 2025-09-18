package p000;

import com.facebook.react.bridge.Promise;
import expo.modules.kotlin.exception.CodedException;

/* renamed from: Ue0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8362Ue0 implements InterfaceC11518wE0 {

    /* renamed from: a */
    public final Promise f11954a;

    public C8362Ue0(Promise promise) {
        O90.m5968f(promise, "bridgePromise");
        this.f11954a = promise;
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: a */
    public final void mo8103a(String str) {
        O90.m5968f(str, "result");
        resolve(str);
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: b */
    public final void mo8104b(boolean z) {
        resolve(Boolean.valueOf(z));
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: c */
    public final void mo8105c(int i) {
        resolve(Integer.valueOf(i));
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: d */
    public final void mo8106d(double d) {
        resolve(Double.valueOf(d));
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: e */
    public final void mo8107e(float f) {
        resolve(Float.valueOf(f));
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: f */
    public final void mo8108f(CodedException codedException) {
        FM1.m2585l(this, codedException);
    }

    @Override // p000.InterfaceC11518wE0
    public final void reject(String str, String str2, Throwable th) {
        O90.m5968f(str, "code");
        this.f11954a.reject(str, str2, th);
    }

    @Override // p000.InterfaceC11518wE0
    public final void resolve(Object obj) {
        this.f11954a.resolve(S20.m7154l(obj, C4049fN.f27159d));
    }
}
