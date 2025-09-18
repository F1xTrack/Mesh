package p000;

import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.util.Iterator;

/* renamed from: wN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11536wN0 implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public int f44843a;

    /* renamed from: b */
    public final int f44844b;

    /* renamed from: c */
    public final /* synthetic */ ReadableMapBuffer f44845c;

    public C11536wN0(ReadableMapBuffer readableMapBuffer) {
        this.f44845c = readableMapBuffer;
        this.f44844b = readableMapBuffer.f17901c - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44843a <= this.f44844b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f44843a;
        this.f44843a = i + 1;
        int i2 = ReadableMapBuffer.f17898d;
        ReadableMapBuffer readableMapBuffer = this.f44845c;
        return new C11409vN0(readableMapBuffer, readableMapBuffer.m10968d(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
