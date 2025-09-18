package defpackage;

import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.nio.ByteBuffer;

/* renamed from: vN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7591vN0 implements InterfaceC1772Wm0 {
    public final int a;
    public final /* synthetic */ ReadableMapBuffer b;

    public C7591vN0(ReadableMapBuffer readableMapBuffer, int i) {
        this.b = readableMapBuffer;
        this.a = i;
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final long a() {
        g(EnumC1694Vm0.f);
        return this.b.a.getLong(this.a + 4);
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final double b() {
        g(EnumC1694Vm0.c);
        return this.b.a.getDouble(this.a + 4);
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final String c() {
        g(EnumC1694Vm0.d);
        return this.b.k(this.a + 4);
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final int d() {
        g(EnumC1694Vm0.b);
        return this.b.a.getInt(this.a + 4);
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final InterfaceC1850Xm0 e() {
        g(EnumC1694Vm0.e);
        int i = this.a + 4;
        ReadableMapBuffer readableMapBuffer = this.b;
        int iD = readableMapBuffer.d(readableMapBuffer.c);
        ByteBuffer byteBuffer = readableMapBuffer.a;
        return new ReadableMapBuffer(byteBuffer, byteBuffer.getInt(i) + iD + 4);
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final boolean f() {
        g(EnumC1694Vm0.a);
        return this.b.a.getInt(this.a + 4) == 1;
    }

    public final void g(EnumC1694Vm0 enumC1694Vm0) {
        EnumC1694Vm0 type = getType();
        if (enumC1694Vm0 == type) {
            return;
        }
        throw new IllegalStateException(("Expected " + enumC1694Vm0 + " for key: " + getKey() + " found " + type + " instead.").toString());
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final int getKey() {
        return this.b.a.getShort(this.a) & 65535;
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final EnumC1694Vm0 getType() {
        return EnumC1694Vm0.values()[this.b.a.getShort(this.a + 2) & 65535];
    }
}
