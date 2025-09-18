package defpackage;

import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.util.Iterator;

/* renamed from: wN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7781wN0 implements Iterator, InterfaceC7451ue0 {
    public int a;
    public final int b;
    public final /* synthetic */ ReadableMapBuffer c;

    public C7781wN0(ReadableMapBuffer readableMapBuffer) {
        this.c = readableMapBuffer;
        this.b = readableMapBuffer.c - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a <= this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        this.a = i + 1;
        int i2 = ReadableMapBuffer.d;
        ReadableMapBuffer readableMapBuffer = this.c;
        return new C7591vN0(readableMapBuffer, readableMapBuffer.d(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
