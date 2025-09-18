package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Z80 implements InterfaceC0502Ge1, L00, InterfaceC6625qJ0 {
    public final JavaScriptTypedArray a;

    public Z80(JavaScriptTypedArray javaScriptTypedArray) {
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
        return Integer.valueOf(this.a.read4Byte(i * 4));
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
