package p000;

import java.io.IOException;

/* renamed from: Gf */
/* loaded from: classes.dex */
public final class C0420Gf extends QG1 implements KI1 {
    private static final C0420Gf zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private InterfaceC11270uH1 zze = C9994kJ1.f36425d;
    private String zzg = "";
    private JE1 zzh = JE1.f5402b;

    static {
        C0420Gf c0420Gf = new C0420Gf();
        zzb = c0420Gf;
        QG1.m6620h(C0420Gf.class, c0420Gf);
    }

    /* renamed from: n */
    public static C0420Gf m3117n(byte[] bArr, DF1 df1) throws DH1 {
        QG1 qg1 = zzb;
        int length = bArr.length;
        if (length != 0) {
            qg1 = (QG1) qg1.mo180m(4, null);
            try {
                InterfaceC11785yK1 interfaceC11785yK1M18426a = C9482gJ1.f27672c.m18426a(qg1.getClass());
                C0623Jt c0623Jt = new C0623Jt();
                df1.getClass();
                c0623Jt.f5773e = df1;
                interfaceC11785yK1M18426a.mo7667g(qg1, bArr, 0, length, c0623Jt);
                interfaceC11785yK1M18426a.mo7661a(qg1);
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
        if (qg1 == null || QG1.m6621j(qg1, true)) {
            return (C0420Gf) qg1;
        }
        throw new DH1(new YL1().getMessage());
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", GC1.class, "zzf", C7415By1.f1111c, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C0420Gf();
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

    /* renamed from: o */
    public final InterfaceC11270uH1 m3118o() {
        return this.zze;
    }
}
