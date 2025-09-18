package p000;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: tN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11154tN1 {
    /* renamed from: a */
    public static byte[] m24915a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
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

    /* renamed from: b */
    public static final InterfaceC0510I5 m24916b(InterfaceC0510I5 interfaceC0510I5, InterfaceC0510I5 interfaceC0510I52) {
        O90.m5968f(interfaceC0510I5, "first");
        O90.m5968f(interfaceC0510I52, "second");
        return interfaceC0510I5.isEmpty() ? interfaceC0510I52 : interfaceC0510I52.isEmpty() ? interfaceC0510I5 : new C0636K5(new InterfaceC0510I5[]{interfaceC0510I5, interfaceC0510I52});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    /* renamed from: c */
    public static C1356VY m24917c(byte[] bArr) {
        C9591hA0 c9591hA0 = new C9591hA0(bArr);
        if (c9591hA0.f28295c < 32) {
            return null;
        }
        c9591hA0.m18741G(0);
        int iM18743a = c9591hA0.m18743a();
        int iM18749g = c9591hA0.m18749g();
        if (iM18749g != iM18743a) {
            AbstractC10872rA1.m24175h("Advertised atom size (" + iM18749g + ") does not match buffer size: " + iM18743a);
            return null;
        }
        int iM18749g2 = c9591hA0.m18749g();
        if (iM18749g2 != 1886614376) {
            AbstractC0852NX.m5767p("Atom type is not pssh: ", iM18749g2);
            return null;
        }
        int iM2497s = AbstractC0325F9.m2497s(c9591hA0.m18749g());
        if (iM2497s > 1) {
            AbstractC0852NX.m5767p("Unsupported pssh version: ", iM2497s);
            return null;
        }
        UUID uuid = new UUID(c9591hA0.m18757o(), c9591hA0.m18757o());
        if (iM2497s == 1) {
            int iM18767y = c9591hA0.m18767y();
            UUID[] uuidArr = new UUID[iM18767y];
            for (int i = 0; i < iM18767y; i++) {
                uuidArr[i] = new UUID(c9591hA0.m18757o(), c9591hA0.m18757o());
            }
        }
        int iM18767y2 = c9591hA0.m18767y();
        int iM18743a2 = c9591hA0.m18743a();
        if (iM18767y2 == iM18743a2) {
            ?? r2 = new byte[iM18767y2];
            c9591hA0.m18747e(r2, 0, iM18767y2);
            return new C1356VY(uuid, iM2497s, r2, 14);
        }
        AbstractC10872rA1.m24175h("Atom data size (" + iM18767y2 + ") does not match the bytes left: " + iM18743a2);
        return null;
    }

    /* renamed from: d */
    public static byte[] m24918d(UUID uuid, byte[] bArr) {
        C1356VY c1356vyM24917c = m24917c(bArr);
        if (c1356vyM24917c == null) {
            return null;
        }
        UUID uuid2 = (UUID) c1356vyM24917c.f12612c;
        if (uuid.equals(uuid2)) {
            return (byte[]) c1356vyM24917c.f12613d;
        }
        AbstractC10872rA1.m24175h("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}
