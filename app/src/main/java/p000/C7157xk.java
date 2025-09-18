package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import kotlin.KotlinVersion;

/* renamed from: xk */
/* loaded from: classes.dex */
public final class C7157xk extends FilterOutputStream {

    /* renamed from: a */
    public final /* synthetic */ int f45761a;

    /* renamed from: b */
    public final OutputStream f45762b;

    /* renamed from: c */
    public ByteOrder f45763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7157xk(OutputStream outputStream, ByteOrder byteOrder, int i) {
        super(outputStream);
        this.f45761a = i;
        this.f45762b = outputStream;
        this.f45763c = byteOrder;
    }

    /* renamed from: a */
    public void m25932a(int i) throws IOException {
        this.f45762b.write(i);
    }

    /* renamed from: c */
    public final void m25933c(int i) throws IOException {
        switch (this.f45761a) {
            case 0:
                ByteOrder byteOrder = this.f45763c;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.f45762b;
                if (byteOrder != byteOrder2) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                        outputStream.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        outputStream.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        outputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                        break;
                    }
                } else {
                    outputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    break;
                }
                break;
            default:
                ByteOrder byteOrder3 = this.f45763c;
                ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream2 = this.f45762b;
                if (byteOrder3 != byteOrder4) {
                    if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                        outputStream2.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                        outputStream2.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        outputStream2.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        outputStream2.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                        break;
                    }
                } else {
                    outputStream2.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream2.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream2.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream2.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    break;
                }
                break;
        }
    }

    /* renamed from: e */
    public final void m25934e(short s) throws IOException {
        switch (this.f45761a) {
            case 0:
                ByteOrder byteOrder = this.f45763c;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.f45762b;
                if (byteOrder != byteOrder2) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        outputStream.write(s & 255);
                        break;
                    }
                } else {
                    outputStream.write(s & 255);
                    outputStream.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    break;
                }
                break;
            default:
                ByteOrder byteOrder3 = this.f45763c;
                ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream2 = this.f45762b;
                if (byteOrder3 != byteOrder4) {
                    if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                        outputStream2.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        outputStream2.write(s & 255);
                        break;
                    }
                } else {
                    outputStream2.write(s & 255);
                    outputStream2.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    break;
                }
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        switch (this.f45761a) {
            case 0:
                this.f45762b.write(bArr);
                break;
            default:
                this.f45762b.write(bArr);
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f45761a) {
            case 0:
                this.f45762b.write(bArr, i, i2);
                break;
            default:
                this.f45762b.write(bArr, i, i2);
                break;
        }
    }
}
