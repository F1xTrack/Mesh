package p000;

import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.nio.ByteBuffer;

/* renamed from: vN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11409vN0 implements InterfaceC8482Wm0 {

    /* renamed from: a */
    public final int f44349a;

    /* renamed from: b */
    public final /* synthetic */ ReadableMapBuffer f44350b;

    public C11409vN0(ReadableMapBuffer readableMapBuffer, int i) {
        this.f44350b = readableMapBuffer;
        this.f44349a = i;
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: a */
    public final long mo8851a() {
        m25405g(EnumC8430Vm0.f12722f);
        return this.f44350b.f17899a.getLong(this.f44349a + 4);
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: b */
    public final double mo8852b() {
        m25405g(EnumC8430Vm0.f12719c);
        return this.f44350b.f17899a.getDouble(this.f44349a + 4);
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: c */
    public final String mo8853c() {
        m25405g(EnumC8430Vm0.f12720d);
        return this.f44350b.m10970k(this.f44349a + 4);
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: d */
    public final int mo8854d() {
        m25405g(EnumC8430Vm0.f12718b);
        return this.f44350b.f17899a.getInt(this.f44349a + 4);
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: e */
    public final InterfaceC8534Xm0 mo8855e() {
        m25405g(EnumC8430Vm0.f12721e);
        int i = this.f44349a + 4;
        ReadableMapBuffer readableMapBuffer = this.f44350b;
        int iM10968d = readableMapBuffer.m10968d(readableMapBuffer.f17901c);
        ByteBuffer byteBuffer = readableMapBuffer.f17899a;
        return new ReadableMapBuffer(byteBuffer, byteBuffer.getInt(i) + iM10968d + 4);
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: f */
    public final boolean mo8856f() {
        m25405g(EnumC8430Vm0.f12717a);
        return this.f44350b.f17899a.getInt(this.f44349a + 4) == 1;
    }

    /* renamed from: g */
    public final void m25405g(EnumC8430Vm0 enumC8430Vm0) {
        EnumC8430Vm0 type = getType();
        if (enumC8430Vm0 == type) {
            return;
        }
        throw new IllegalStateException(("Expected " + enumC8430Vm0 + " for key: " + getKey() + " found " + type + " instead.").toString());
    }

    @Override // p000.InterfaceC8482Wm0
    public final int getKey() {
        return this.f44350b.f17899a.getShort(this.f44349a) & 65535;
    }

    @Override // p000.InterfaceC8482Wm0
    public final EnumC8430Vm0 getType() {
        return EnumC8430Vm0.values()[this.f44350b.f17899a.getShort(this.f44349a + 2) & 65535];
    }
}
