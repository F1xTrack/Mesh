package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: sQ */
/* loaded from: classes.dex */
public class C6822sQ extends InputStream implements DataInput {

    /* renamed from: e */
    public static final ByteOrder f42422e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f */
    public static final ByteOrder f42423f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a */
    public final DataInputStream f42424a;

    /* renamed from: b */
    public ByteOrder f42425b;

    /* renamed from: c */
    public int f42426c;

    /* renamed from: d */
    public byte[] f42427d;

    public C6822sQ(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    /* renamed from: a */
    public final void m24738a(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.f42424a;
            int i3 = i - i2;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f42427d == null) {
                    this.f42427d = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f42427d, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC7222ym.m26230g(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f42426c += i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f42424a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f42426c++;
        return this.f42424a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f42426c++;
        return this.f42424a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f42426c++;
        int i = this.f42424a.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f42426c += 2;
        return this.f42424a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f42426c += i2;
        this.f42424a.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f42426c += 4;
        DataInputStream dataInputStream = this.f42424a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f42425b;
        if (byteOrder == f42422e) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == f42423f) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.f42425b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f42426c += 8;
        DataInputStream dataInputStream = this.f42424a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f42425b;
        if (byteOrder == f42422e) {
            return (i8 << 56) + (i7 << 48) + (i6 << 40) + (i5 << 32) + (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == f42423f) {
            return (i << 56) + (i2 << 48) + (i3 << 40) + (i4 << 32) + (i5 << 24) + (i6 << 16) + (i7 << 8) + i8;
        }
        throw new IOException("Invalid byte order: " + this.f42425b);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f42426c += 2;
        DataInputStream dataInputStream = this.f42424a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f42425b;
        if (byteOrder == f42422e) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == f42423f) {
            return (short) ((i << 8) + i2);
        }
        throw new IOException("Invalid byte order: " + this.f42425b);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f42426c += 2;
        return this.f42424a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f42426c++;
        return this.f42424a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f42426c += 2;
        DataInputStream dataInputStream = this.f42424a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f42425b;
        if (byteOrder == f42422e) {
            return (i2 << 8) + i;
        }
        if (byteOrder == f42423f) {
            return (i << 8) + i2;
        }
        throw new IOException("Invalid byte order: " + this.f42425b);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C6822sQ(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public C6822sQ(InputStream inputStream, ByteOrder byteOrder) {
        this.f42425b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f42424a = dataInputStream;
        dataInputStream.mark(0);
        this.f42426c = 0;
        this.f42425b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f42424a.read(bArr, i, i2);
        this.f42426c += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f42426c += bArr.length;
        this.f42424a.readFully(bArr);
    }
}
