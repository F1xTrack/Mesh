package p000;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.util.Iterator;

/* renamed from: kW */
/* loaded from: classes2.dex */
public final class C6305kW implements InterfaceC7635Ge1, L00, InterfaceC10761qJ0 {

    /* renamed from: a */
    public final JavaScriptTypedArray f36517a;

    public C6305kW(JavaScriptTypedArray javaScriptTypedArray) {
        O90.m5968f(javaScriptTypedArray, "rawArray");
        this.f36517a = javaScriptTypedArray;
    }

    @Override // p000.InterfaceC10761qJ0
    /* renamed from: b */
    public final JavaScriptTypedArray mo3962b() {
        return this.f36517a;
    }

    @Override // p000.L00
    public final Object get(int i) {
        if (i < 0 || i >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return Float.valueOf(this.f36517a.readFloat(i * 4));
    }

    @Override // p000.InterfaceC7635Ge1
    public final int getLength() {
        return this.f36517a.getLength();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6653q0(this);
    }
}
