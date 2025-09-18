package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import p000.AbstractC11374v51;
import p000.AbstractC11501w51;
import p000.AbstractC7167xu;
import p000.AbstractC7230yu;
import p000.AbstractC8729aT1;
import p000.AbstractC9639hY0;
import p000.C0779MN;
import p000.C10745qB0;
import p000.C11917zN0;
import p000.C7460Cv0;
import p000.C9829j20;
import p000.InterfaceC9127dY0;
import p000.JI1;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m22267d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "Cv0", "okhttp"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f39211e = {42};

    /* renamed from: f */
    public static final List f39212f = AbstractC7230yu.m26274e("*");

    /* renamed from: g */
    public static final PublicSuffixDatabase f39213g = new PublicSuffixDatabase();

    /* renamed from: a */
    public final AtomicBoolean f39214a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f39215b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f39216c;

    /* renamed from: d */
    public byte[] f39217d;

    /* renamed from: c */
    public static List m23536c(String str) {
        List listM25341P = AbstractC11374v51.m25341P(str, new char[]{'.'});
        return O90.m5963a(AbstractC7167xu.m25964J(listM25341P), "") ? AbstractC7167xu.m25996x(1, listM25341P) : listM25341P;
    }

    /* renamed from: a */
    public final String m23537a(String str) throws InterruptedException {
        String strM1459j0;
        String strM1459j02;
        String strM1459j03;
        List listM25341P;
        int size;
        int size2;
        int i = 0;
        String unicode = IDN.toUnicode(str);
        O90.m5967e(unicode, "unicodeDomain");
        List listM23536c = m23536c(unicode);
        if (this.f39214a.get() || !this.f39214a.compareAndSet(false, true)) {
            try {
                this.f39215b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        m23538b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        C10745qB0 c10745qB0 = C10745qB0.f40658a;
                        C10745qB0.f40658a.getClass();
                        C10745qB0.m23946i(5, "Failed to read public suffix list", e);
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f39216c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listM23536c.size();
        byte[][] bArr = new byte[size3][];
        for (int i2 = 0; i2 < size3; i2++) {
            String str2 = (String) listM23536c.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            O90.m5967e(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strM1459j0 = null;
                break;
            }
            byte[] bArr2 = this.f39216c;
            if (bArr2 == null) {
                O90.m5977o("publicSuffixListBytes");
                throw null;
            }
            strM1459j0 = C7460Cv0.m1459j0(bArr2, bArr, i3);
            if (strM1459j0 != null) {
                break;
            }
            i3++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                bArr3[i4] = f39211e;
                byte[] bArr4 = this.f39216c;
                if (bArr4 == null) {
                    O90.m5977o("publicSuffixListBytes");
                    throw null;
                }
                strM1459j02 = C7460Cv0.m1459j0(bArr4, bArr3, i4);
                if (strM1459j02 != null) {
                    break;
                }
            }
            strM1459j02 = null;
        } else {
            strM1459j02 = null;
        }
        if (strM1459j02 != null) {
            int i5 = size3 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                byte[] bArr5 = this.f39217d;
                if (bArr5 == null) {
                    O90.m5977o("publicSuffixExceptionListBytes");
                    throw null;
                }
                strM1459j03 = C7460Cv0.m1459j0(bArr5, bArr, i6);
                if (strM1459j03 != null) {
                    break;
                }
            }
            strM1459j03 = null;
        } else {
            strM1459j03 = null;
        }
        if (strM1459j03 != null) {
            listM25341P = AbstractC11374v51.m25341P("!".concat(strM1459j03), new char[]{'.'});
        } else if (strM1459j0 == null && strM1459j02 == null) {
            listM25341P = f39212f;
        } else {
            List listM25341P2 = C0779MN.f7117a;
            List listM25341P3 = strM1459j0 != null ? AbstractC11374v51.m25341P(strM1459j0, new char[]{'.'}) : listM25341P2;
            if (strM1459j02 != null) {
                listM25341P2 = AbstractC11374v51.m25341P(strM1459j02, new char[]{'.'});
            }
            listM25341P = listM25341P3.size() > listM25341P2.size() ? listM25341P3 : listM25341P2;
        }
        if (listM23536c.size() == listM25341P.size() && ((String) listM25341P.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM25341P.get(0)).charAt(0) == '!') {
            size = listM23536c.size();
            size2 = listM25341P.size();
        } else {
            size = listM23536c.size();
            size2 = listM25341P.size() + 1;
        }
        InterfaceC9127dY0 interfaceC9127dY0M18828g = AbstractC9639hY0.m18828g(AbstractC7167xu.m25992t(m23536c(str)), size - size2);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : interfaceC9127dY0M18828g) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            AbstractC11501w51.m25560a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: b */
    public final void m23538b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                return;
            }
            C11917zN0 c11917zN0M4274b = JI1.m4274b(new C9829j20(JI1.m4279g(resourceAsStream)));
            try {
                long jM26381J = c11917zN0M4274b.m26381J();
                c11917zN0M4274b.m26385X(jM26381J);
                byte[] bArrM23177S = c11917zN0M4274b.f46810b.m23177S(jM26381J);
                long jM26381J2 = c11917zN0M4274b.m26381J();
                c11917zN0M4274b.m26385X(jM26381J2);
                byte[] bArrM23177S2 = c11917zN0M4274b.f46810b.m23177S(jM26381J2);
                AbstractC8729aT1.m9749a(c11917zN0M4274b, null);
                synchronized (this) {
                    this.f39216c = bArrM23177S;
                    this.f39217d = bArrM23177S2;
                }
            } finally {
            }
        } finally {
            this.f39215b.countDown();
        }
    }
}
