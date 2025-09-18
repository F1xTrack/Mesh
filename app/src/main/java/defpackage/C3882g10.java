package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* renamed from: g10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3882g10 implements InterfaceC7446uc1 {
    public final InterfaceC7446uc1 b;

    public C3882g10(InterfaceC7446uc1 interfaceC7446uc1) {
        IL1.d(interfaceC7446uc1, "Argument must not be null");
        this.b = interfaceC7446uc1;
    }

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.InterfaceC7446uc1
    public final InterfaceC5506kS0 b(C7903x10 c7903x10, InterfaceC5506kS0 interfaceC5506kS0, int i, int i2) {
        C3500e10 c3500e10 = (C3500e10) interfaceC5506kS0.get();
        InterfaceC5506kS0 c6126ni = new C6126ni(a.a(c7903x10).b, ((C5613l10) c3500e10.a.b).l);
        InterfaceC7446uc1 interfaceC7446uc1 = this.b;
        InterfaceC5506kS0 interfaceC5506kS0B = interfaceC7446uc1.b(c7903x10, c6126ni, i, i2);
        if (!c6126ni.equals(interfaceC5506kS0B)) {
            c6126ni.recycle();
        }
        ((C5613l10) c3500e10.a.b).c(interfaceC7446uc1, (Bitmap) interfaceC5506kS0B.get());
        return interfaceC5506kS0;
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        if (obj instanceof C3882g10) {
            return this.b.equals(((C3882g10) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return this.b.hashCode();
    }
}
