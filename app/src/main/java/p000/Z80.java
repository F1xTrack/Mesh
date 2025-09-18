package p000;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Z80 implements InterfaceC7635Ge1, L00, InterfaceC10761qJ0 {

    /* renamed from: a */
    public final JavaScriptTypedArray f14759a;

    public Z80(JavaScriptTypedArray javaScriptTypedArray) {
        O90.m5968f(javaScriptTypedArray, "rawArray");
        this.f14759a = javaScriptTypedArray;
    }

    @Override // p000.InterfaceC10761qJ0
    /* renamed from: b */
    public final JavaScriptTypedArray mo3962b() {
        return this.f14759a;
    }

    @Override // p000.L00
    public final Object get(int i) {
        if (i < 0 || i >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return Integer.valueOf(this.f14759a.read4Byte(i * 4));
    }

    @Override // p000.InterfaceC7635Ge1
    public final int getLength() {
        return this.f14759a.getLength();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6653q0(this);
    }
}
