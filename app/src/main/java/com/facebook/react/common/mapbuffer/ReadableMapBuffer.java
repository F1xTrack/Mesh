package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.Metadata;
import p000.AbstractC11153tN0;
import p000.AbstractC7038vr;
import p000.AbstractC7167xu;
import p000.C11536wN0;
import p000.C3978eF;
import p000.C8378Um0;
import p000.C9393fd0;
import p000.C9461g90;
import p000.EnumC8430Vm0;
import p000.InterfaceC0965PK;
import p000.InterfaceC8534Xm0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0011\b\u0013\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m22267d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "LXm0;", "Lcom/facebook/jni/HybridData;", "hybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Ljava/nio/ByteBuffer;", "importByteBuffer", "()Ljava/nio/ByteBuffer;", "mHybridData", "Lcom/facebook/jni/HybridData;", "vN0", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
@InterfaceC0965PK
/* loaded from: classes.dex */
public final class ReadableMapBuffer implements InterfaceC8534Xm0 {

    /* renamed from: d */
    public static final /* synthetic */ int f17898d = 0;

    /* renamed from: a */
    public final ByteBuffer f17899a;

    /* renamed from: b */
    public final int f17900b;

    /* renamed from: c */
    public final int f17901c;

    @InterfaceC0965PK
    private final HybridData mHybridData;

    static {
        C3978eF.m17883a();
    }

    @InterfaceC0965PK
    private ReadableMapBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
        ByteBuffer byteBufferImportByteBuffer = importByteBuffer();
        this.f17899a = byteBufferImportByteBuffer;
        this.f17900b = 0;
        if (byteBufferImportByteBuffer.getShort() != 254) {
            byteBufferImportByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f17901c = byteBufferImportByteBuffer.getShort(byteBufferImportByteBuffer.position()) & 65535;
    }

    private final native ByteBuffer importByteBuffer();

    @Override // p000.InterfaceC8534Xm0
    /* renamed from: J */
    public final boolean mo9114J(int i) {
        return m10967b(i) != -1;
    }

    @Override // p000.InterfaceC8534Xm0
    /* renamed from: W */
    public final InterfaceC8534Xm0 mo9115W(int i) {
        int iM10969i = m10969i(i, EnumC8430Vm0.f12721e);
        int iM10968d = m10968d(this.f17901c);
        ByteBuffer byteBuffer = this.f17899a;
        return new ReadableMapBuffer(byteBuffer, byteBuffer.getInt(iM10969i) + iM10968d + 4);
    }

    /* renamed from: b */
    public final int m10967b(int i) {
        InterfaceC8534Xm0.f13966L0.getClass();
        C9461g90 c9461g90 = C8378Um0.f12029b;
        int i2 = c9461g90.f26569a;
        if (i <= c9461g90.f26570b && i2 <= i) {
            short s = (short) i;
            int i3 = this.f17901c - 1;
            int i4 = 0;
            while (i4 <= i3) {
                int i5 = (i4 + i3) >>> 1;
                int i6 = this.f17899a.getShort(m10968d(i5)) & 65535;
                int i7 = 65535 & s;
                if (O90.m5970h(i6, i7) < 0) {
                    i4 = i5 + 1;
                } else {
                    if (O90.m5970h(i6, i7) <= 0) {
                        return i5;
                    }
                    i3 = i5 - 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final int m10968d(int i) {
        return (i * 12) + this.f17900b + 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = ((ReadableMapBuffer) obj).f17899a;
        ByteBuffer byteBuffer2 = this.f17899a;
        if (byteBuffer2 == byteBuffer) {
            return true;
        }
        byteBuffer2.rewind();
        byteBuffer.rewind();
        return byteBuffer2.equals(byteBuffer);
    }

    @Override // p000.InterfaceC8534Xm0
    public final boolean getBoolean(int i) {
        return this.f17899a.getInt(m10969i(i, EnumC8430Vm0.f12717a)) == 1;
    }

    @Override // p000.InterfaceC8534Xm0
    /* renamed from: getCount, reason: from getter */
    public final int getF17901c() {
        return this.f17901c;
    }

    @Override // p000.InterfaceC8534Xm0
    public final double getDouble(int i) {
        return this.f17899a.getDouble(m10969i(i, EnumC8430Vm0.f12719c));
    }

    @Override // p000.InterfaceC8534Xm0
    public final int getInt(int i) {
        return this.f17899a.getInt(m10969i(i, EnumC8430Vm0.f12718b));
    }

    @Override // p000.InterfaceC8534Xm0
    public final String getString(int i) {
        return m10970k(m10969i(i, EnumC8430Vm0.f12720d));
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.f17899a;
        byteBuffer.rewind();
        return byteBuffer.hashCode();
    }

    /* renamed from: i */
    public final int m10969i(int i, EnumC8430Vm0 enumC8430Vm0) {
        int iM10967b = m10967b(i);
        if (iM10967b == -1) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        EnumC8430Vm0 enumC8430Vm02 = EnumC8430Vm0.values()[this.f17899a.getShort(m10968d(iM10967b) + 2) & 65535];
        if (enumC8430Vm02 == enumC8430Vm0) {
            return m10968d(iM10967b) + 4;
        }
        throw new IllegalStateException(("Expected " + enumC8430Vm0 + " for key: " + i + ", found " + enumC8430Vm02 + " instead.").toString());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C11536wN0(this);
    }

    /* renamed from: k */
    public final String m10970k(int i) {
        int iM10968d = m10968d(this.f17901c);
        ByteBuffer byteBuffer = this.f17899a;
        int i2 = byteBuffer.getInt(i) + iM10968d;
        int i3 = byteBuffer.getInt(i2);
        byte[] bArr = new byte[i3];
        byteBuffer.position(i2 + 4);
        byteBuffer.get(bArr, 0, i3);
        return new String(bArr, AbstractC7038vr.f44561a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        AbstractC7167xu.m25961G(this, sb, null, null, null, C9393fd0.f27273C, 62);
        sb.append('}');
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    public ReadableMapBuffer(ByteBuffer byteBuffer, int i) {
        this.mHybridData = null;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        this.f17899a = byteBufferDuplicate;
        this.f17900b = i;
        if (byteBufferDuplicate.getShort() != 254) {
            byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f17901c = byteBufferDuplicate.getShort(byteBufferDuplicate.position()) & 65535;
    }
}
