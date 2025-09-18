package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class E10 implements InterfaceC7740If0 {

    /* renamed from: b */
    public final L20 f2342b;

    /* renamed from: c */
    public final URL f2343c;

    /* renamed from: d */
    public final String f2344d;

    /* renamed from: e */
    public String f2345e;

    /* renamed from: f */
    public URL f2346f;

    /* renamed from: g */
    public volatile byte[] f2347g;

    /* renamed from: h */
    public int f2348h;

    public E10(URL url) {
        C11321uh0 c11321uh0 = L20.f6471a;
        IL1.m3830d(url, "Argument must not be null");
        this.f2343c = url;
        this.f2344d = null;
        IL1.m3830d(c11321uh0, "Argument must not be null");
        this.f2342b = c11321uh0;
    }

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        if (this.f2347g == null) {
            this.f2347g = m1981c().getBytes(InterfaceC7740If0.f5069a);
        }
        messageDigest.update(this.f2347g);
    }

    /* renamed from: c */
    public final String m1981c() {
        String str = this.f2344d;
        if (str != null) {
            return str;
        }
        URL url = this.f2343c;
        IL1.m3830d(url, "Argument must not be null");
        return url.toString();
    }

    /* renamed from: d */
    public final String m1982d() {
        if (TextUtils.isEmpty(this.f2345e)) {
            String string = this.f2344d;
            if (TextUtils.isEmpty(string)) {
                URL url = this.f2343c;
                IL1.m3830d(url, "Argument must not be null");
                string = url.toString();
            }
            this.f2345e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f2345e;
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof E10)) {
            return false;
        }
        E10 e10 = (E10) obj;
        return m1981c().equals(e10.m1981c()) && this.f2342b.equals(e10.f2342b);
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        if (this.f2348h == 0) {
            int iHashCode = m1981c().hashCode();
            this.f2348h = iHashCode;
            this.f2348h = this.f2342b.hashCode() + (iHashCode * 31);
        }
        return this.f2348h;
    }

    public final String toString() {
        return m1981c();
    }

    public E10(String str, L20 l20) {
        this.f2343c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f2344d = str;
            IL1.m3830d(l20, "Argument must not be null");
            this.f2342b = l20;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
