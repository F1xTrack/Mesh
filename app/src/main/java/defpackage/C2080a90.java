package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.util.Iterator;

/* renamed from: a90, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2080a90 implements InterfaceC0502Ge1, L00, InterfaceC6625qJ0 {
    public final JavaScriptTypedArray a;

    public C2080a90(JavaScriptTypedArray javaScriptTypedArray) {
        O90.f(javaScriptTypedArray, "rawArray");
        this.a = javaScriptTypedArray;
    }

    @Override // defpackage.InterfaceC6625qJ0
    public final JavaScriptTypedArray b() {
        return this.a;
    }

    @Override // defpackage.L00
    public final Object get(int i) {
        if (i < 0 || i >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return Byte.valueOf(this.a.readByte(i));
    }

    @Override // defpackage.InterfaceC0502Ge1
    public final int getLength() {
        return this.a.getLength();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6563q0(this);
    }
}
