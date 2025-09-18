package expo.modules.kotlin.jni;

import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import p000.C4049fN;
import p000.C8180Qr0;
import p000.FM1;
import p000.InterfaceC11518wE0;
import p000.O90;
import p000.S20;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m22267d2 = {"Lexpo/modules/kotlin/jni/PromiseImpl;", "LwE0;", "Lexpo/modules/kotlin/jni/JavaCallback;", "callback", "<init>", "(Lexpo/modules/kotlin/jni/JavaCallback;)V", "Lexpo/modules/kotlin/jni/JavaCallback;", "g", "()Lexpo/modules/kotlin/jni/JavaCallback;", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PromiseImpl implements InterfaceC11518wE0 {

    /* renamed from: a */
    public boolean f26961a;
    private final JavaCallback callback;

    public PromiseImpl(JavaCallback javaCallback) {
        O90.m5968f(javaCallback, "callback");
        this.callback = javaCallback;
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: a */
    public final void mo8103a(String str) throws C8180Qr0 {
        O90.m5968f(str, "result");
        if (this.f26961a) {
            throw new C8180Qr0(5);
        }
        this.callback.m18099f(str);
        this.f26961a = true;
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: b */
    public final void mo8104b(boolean z) throws C8180Qr0 {
        if (this.f26961a) {
            throw new C8180Qr0(5);
        }
        this.callback.m18101h(z);
        this.f26961a = true;
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: c */
    public final void mo8105c(int i) throws C8180Qr0 {
        if (this.f26961a) {
            throw new C8180Qr0(5);
        }
        this.callback.m18097d(i);
        this.f26961a = true;
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: d */
    public final void mo8106d(double d) throws C8180Qr0 {
        if (this.f26961a) {
            throw new C8180Qr0(5);
        }
        this.callback.m18095b(d);
        this.f26961a = true;
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: e */
    public final void mo8107e(float f) throws C8180Qr0 {
        if (this.f26961a) {
            throw new C8180Qr0(5);
        }
        this.callback.m18096c(f);
        this.f26961a = true;
    }

    @Override // p000.InterfaceC11518wE0
    /* renamed from: f */
    public final void mo8108f(CodedException codedException) {
        FM1.m2585l(this, codedException);
    }

    /* renamed from: g, reason: from getter */
    public final JavaCallback getCallback() {
        return this.callback;
    }

    @Override // p000.InterfaceC11518wE0
    public final void reject(String str, String str2, Throwable th) throws C8180Qr0 {
        O90.m5968f(str, "code");
        if (this.f26961a) {
            throw new C8180Qr0(5);
        }
        JavaCallback javaCallback = this.callback;
        if (str2 == null) {
            str2 = th != null ? th.getMessage() : null;
            if (str2 == null) {
                str2 = "unknown";
            }
        }
        javaCallback.m18100g(str, str2);
        this.f26961a = true;
    }

    @Override // p000.InterfaceC11518wE0
    public final void resolve(Object obj) throws C8180Qr0 {
        if (this.f26961a) {
            throw new C8180Qr0(5);
        }
        this.callback.m18098e(S20.m7154l(obj, C4049fN.f27159d));
        this.f26961a = true;
    }
}
