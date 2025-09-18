package defpackage;

import com.facebook.react.bridge.Promise;
import expo.modules.kotlin.exception.CodedException;

/* renamed from: Ue0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1592Ue0 implements InterfaceC7754wE0 {
    public final Promise a;

    public C1592Ue0(Promise promise) {
        O90.f(promise, "bridgePromise");
        this.a = promise;
    }

    @Override // defpackage.InterfaceC7754wE0
    public final void a(String str) {
        O90.f(str, "result");
        resolve(str);
    }

    @Override // defpackage.InterfaceC7754wE0
    public final void b(boolean z) {
        resolve(Boolean.valueOf(z));
    }

    @Override // defpackage.InterfaceC7754wE0
    public final void c(int i) {
        resolve(Integer.valueOf(i));
    }

    @Override // defpackage.InterfaceC7754wE0
    public final void d(double d) {
        resolve(Double.valueOf(d));
    }

    @Override // defpackage.InterfaceC7754wE0
    public final void e(float f) {
        resolve(Float.valueOf(f));
    }

    @Override // defpackage.InterfaceC7754wE0
    public final void f(CodedException codedException) {
        FM1.l(this, codedException);
    }

    @Override // defpackage.InterfaceC7754wE0
    public final void reject(String str, String str2, Throwable th) {
        O90.f(str, "code");
        this.a.reject(str, str2, th);
    }

    @Override // defpackage.InterfaceC7754wE0
    public final void resolve(Object obj) {
        this.a.resolve(S20.l(obj, C3759fN.d));
    }
}
