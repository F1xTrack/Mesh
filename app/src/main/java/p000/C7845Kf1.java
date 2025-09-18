package p000;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.util.Iterator;

/* renamed from: Kf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7845Kf1 implements InterfaceC7635Ge1, L00, InterfaceC10761qJ0 {

    /* renamed from: a */
    public final JavaScriptTypedArray f6249a;

    public C7845Kf1(JavaScriptTypedArray javaScriptTypedArray) {
        O90.m5968f(javaScriptTypedArray, "rawArray");
        this.f6249a = javaScriptTypedArray;
    }

    @Override // p000.InterfaceC10761qJ0
    /* renamed from: b */
    public final JavaScriptTypedArray mo3962b() {
        return this.f6249a;
    }

    @Override // p000.L00
    public final Object get(int i) {
        if (i < 0 || i >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return new C8363Ue1(this.f6249a.readByte(i));
    }

    @Override // p000.InterfaceC7635Ge1
    public final int getLength() {
        return this.f6249a.getLength();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6653q0(this);
    }
}
