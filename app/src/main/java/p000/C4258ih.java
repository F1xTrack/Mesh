package p000;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.util.Iterator;

/* renamed from: ih */
/* loaded from: classes2.dex */
public final class C4258ih implements InterfaceC7635Ge1, L00, InterfaceC10761qJ0 {

    /* renamed from: a */
    public final JavaScriptTypedArray f29407a;

    public C4258ih(JavaScriptTypedArray javaScriptTypedArray) {
        O90.m5968f(javaScriptTypedArray, "rawArray");
        this.f29407a = javaScriptTypedArray;
    }

    @Override // p000.InterfaceC10761qJ0
    /* renamed from: b */
    public final JavaScriptTypedArray mo3962b() {
        return this.f29407a;
    }

    @Override // p000.L00
    public final Object get(int i) {
        if (i < 0 || i >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return new C7325Af1(this.f29407a.read8Byte(i * 8));
    }

    @Override // p000.InterfaceC7635Ge1
    public final int getLength() {
        return this.f29407a.getLength();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6653q0(this);
    }
}
