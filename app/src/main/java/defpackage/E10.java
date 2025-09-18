package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class E10 implements InterfaceC0660If0 {
    public final L20 b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public E10(URL url) {
        C7460uh0 c7460uh0 = L20.a;
        IL1.d(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        IL1.d(c7460uh0, "Argument must not be null");
        this.b = c7460uh0;
    }

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(InterfaceC0660If0.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        IL1.d(url, "Argument must not be null");
        return url.toString();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.e)) {
            String string = this.d;
            if (TextUtils.isEmpty(string)) {
                URL url = this.c;
                IL1.d(url, "Argument must not be null");
                string = url.toString();
            }
            this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.e;
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof E10)) {
            return false;
        }
        E10 e10 = (E10) obj;
        return c().equals(e10.c()) && this.b.equals(e10.b);
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = this.b.hashCode() + (iHashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public E10(String str, L20 l20) {
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            IL1.d(l20, "Argument must not be null");
            this.b = l20;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
