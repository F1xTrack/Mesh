package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: tN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7210tN1 {
    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static final I5 b(I5 i5, I5 i52) {
        O90.f(i5, "first");
        O90.f(i52, "second");
        return i5.isEmpty() ? i52 : i52.isEmpty() ? i5 : new K5(new I5[]{i5, i52});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static VY c(byte[] bArr) {
        C4103hA0 c4103hA0 = new C4103hA0(bArr);
        if (c4103hA0.c < 32) {
            return null;
        }
        c4103hA0.G(0);
        int iA = c4103hA0.a();
        int iG = c4103hA0.g();
        if (iG != iA) {
            AbstractC6789rA1.h("Advertised atom size (" + iG + ") does not match buffer size: " + iA);
            return null;
        }
        int iG2 = c4103hA0.g();
        if (iG2 != 1886614376) {
            NX.p("Atom type is not pssh: ", iG2);
            return null;
        }
        int iS = F9.s(c4103hA0.g());
        if (iS > 1) {
            NX.p("Unsupported pssh version: ", iS);
            return null;
        }
        UUID uuid = new UUID(c4103hA0.o(), c4103hA0.o());
        if (iS == 1) {
            int iY = c4103hA0.y();
            UUID[] uuidArr = new UUID[iY];
            for (int i = 0; i < iY; i++) {
                uuidArr[i] = new UUID(c4103hA0.o(), c4103hA0.o());
            }
        }
        int iY2 = c4103hA0.y();
        int iA2 = c4103hA0.a();
        if (iY2 == iA2) {
            ?? r2 = new byte[iY2];
            c4103hA0.e(r2, 0, iY2);
            return new VY(uuid, iS, r2, 14);
        }
        AbstractC6789rA1.h("Atom data size (" + iY2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] d(UUID uuid, byte[] bArr) {
        VY vyC = c(bArr);
        if (vyC == null) {
            return null;
        }
        UUID uuid2 = (UUID) vyC.c;
        if (uuid.equals(uuid2)) {
            return (byte[]) vyC.d;
        }
        AbstractC6789rA1.h("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}
