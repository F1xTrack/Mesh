package p000;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: yt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11854yt0 extends AbstractC11161tR0 {

    /* renamed from: e */
    public static final C8540Xp0 f46525e;

    /* renamed from: f */
    public static final C8540Xp0 f46526f;

    /* renamed from: g */
    public static final byte[] f46527g;

    /* renamed from: h */
    public static final byte[] f46528h;

    /* renamed from: i */
    public static final byte[] f46529i;

    /* renamed from: a */
    public final C0551Ik f46530a;

    /* renamed from: b */
    public final List f46531b;

    /* renamed from: c */
    public final C8540Xp0 f46532c;

    /* renamed from: d */
    public long f46533d;

    static {
        Pattern pattern = C8540Xp0.f13986d;
        f46525e = AbstractC11511wA1.m25569b("multipart/mixed");
        AbstractC11511wA1.m25569b("multipart/alternative");
        AbstractC11511wA1.m25569b("multipart/digest");
        AbstractC11511wA1.m25569b("multipart/parallel");
        f46526f = AbstractC11511wA1.m25569b("multipart/form-data");
        f46527g = new byte[]{58, 32};
        f46528h = new byte[]{13, 10};
        f46529i = new byte[]{45, 45};
    }

    public C11854yt0(C0551Ik c0551Ik, C8540Xp0 c8540Xp0, List list) {
        O90.m5968f(c0551Ik, "boundaryByteString");
        O90.m5968f(c8540Xp0, "type");
        this.f46530a = c0551Ik;
        this.f46531b = list;
        Pattern pattern = C8540Xp0.f13986d;
        this.f46532c = AbstractC11511wA1.m25569b(c8540Xp0 + "; boundary=" + c0551Ik.m3991k());
        this.f46533d = -1L;
    }

    @Override // p000.AbstractC11161tR0
    /* renamed from: a */
    public final long mo9186a() throws EOFException {
        long j = this.f46533d;
        if (j != -1) {
            return j;
        }
        long jM26269e = m26269e(null, true);
        this.f46533d = jM26269e;
        return jM26269e;
    }

    @Override // p000.AbstractC11161tR0
    /* renamed from: b */
    public final C8540Xp0 mo9187b() {
        return this.f46532c;
    }

    @Override // p000.AbstractC11161tR0
    /* renamed from: d */
    public final void mo9188d(InterfaceC0613Jj interfaceC0613Jj) throws EOFException {
        m26269e(interfaceC0613Jj, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final long m26269e(InterfaceC0613Jj interfaceC0613Jj, boolean z) throws EOFException {
        C6507nj c6507nj;
        InterfaceC0613Jj c6507nj2;
        if (z) {
            c6507nj2 = new C6507nj();
            c6507nj = c6507nj2;
        } else {
            c6507nj = 0;
            c6507nj2 = interfaceC0613Jj;
        }
        List list = this.f46531b;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C0551Ik c0551Ik = this.f46530a;
            byte[] bArr = f46529i;
            byte[] bArr2 = f46528h;
            if (i >= size) {
                O90.m5965c(c6507nj2);
                c6507nj2.mo4393a0(bArr);
                c6507nj2.mo4398k0(c0551Ik);
                c6507nj2.mo4393a0(bArr);
                c6507nj2.mo4393a0(bArr2);
                if (!z) {
                    return j;
                }
                O90.m5965c(c6507nj);
                long j2 = j + c6507nj.f38488b;
                c6507nj.m23186m();
                return j2;
            }
            C11727xt0 c11727xt0 = (C11727xt0) list.get(i);
            K20 k20 = c11727xt0.f45874a;
            O90.m5965c(c6507nj2);
            c6507nj2.mo4393a0(bArr);
            c6507nj2.mo4398k0(c0551Ik);
            c6507nj2.mo4393a0(bArr2);
            int size2 = k20.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c6507nj2.mo4391L(k20.m4525d(i2)).mo4393a0(f46527g).mo4391L(k20.m4528q(i2)).mo4393a0(bArr2);
            }
            AbstractC11161tR0 abstractC11161tR0 = c11727xt0.f45875b;
            C8540Xp0 c8540Xp0Mo9187b = abstractC11161tR0.mo9187b();
            if (c8540Xp0Mo9187b != null) {
                c6507nj2.mo4391L("Content-Type: ").mo4391L(c8540Xp0Mo9187b.f13988a).mo4393a0(bArr2);
            }
            long jMo9186a = abstractC11161tR0.mo9186a();
            if (jMo9186a != -1) {
                c6507nj2.mo4391L("Content-Length: ").mo4394f0(jMo9186a).mo4393a0(bArr2);
            } else if (z) {
                O90.m5965c(c6507nj);
                c6507nj.m23186m();
                return -1L;
            }
            c6507nj2.mo4393a0(bArr2);
            if (z) {
                j += jMo9186a;
            } else {
                abstractC11161tR0.mo9188d(c6507nj2);
            }
            c6507nj2.mo4393a0(bArr2);
            i++;
        }
    }
}
