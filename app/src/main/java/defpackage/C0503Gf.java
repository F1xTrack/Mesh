package defpackage;

import java.io.IOException;

/* renamed from: Gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503Gf extends QG1 implements KI1 {
    private static final C0503Gf zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private InterfaceC7383uH1 zze = C5480kJ1.d;
    private String zzg = "";
    private JE1 zzh = JE1.b;

    static {
        C0503Gf c0503Gf = new C0503Gf();
        zzb = c0503Gf;
        QG1.h(C0503Gf.class, c0503Gf);
    }

    public static C0503Gf n(byte[] bArr, DF1 df1) throws DH1 {
        QG1 qg1 = zzb;
        int length = bArr.length;
        if (length != 0) {
            qg1 = (QG1) qg1.m(4, null);
            try {
                InterfaceC8153yK1 interfaceC8153yK1A = C3940gJ1.c.a(qg1.getClass());
                C0779Jt c0779Jt = new C0779Jt();
                df1.getClass();
                c0779Jt.e = df1;
                interfaceC8153yK1A.g(qg1, bArr, 0, length, c0779Jt);
                interfaceC8153yK1A.a(qg1);
            } catch (DH1 e) {
                throw e;
            } catch (YL1 e2) {
                throw new DH1(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof DH1) {
                    throw ((DH1) e3.getCause());
                }
                throw new DH1(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw new DH1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (qg1 == null || QG1.j(qg1, true)) {
            return (C0503Gf) qg1;
        }
        throw new DH1(new YL1().getMessage());
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", GC1.class, "zzf", C0172By1.c, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C0503Gf();
        }
        if (i2 == 4) {
            return new DR1(13, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzi = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final InterfaceC7383uH1 o() {
        return this.zze;
    }
}
