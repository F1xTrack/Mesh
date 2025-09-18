package defpackage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* renamed from: lL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5675lL implements InterfaceC7446uc1 {
    public final InterfaceC7446uc1 b;
    public final boolean c;

    public C5675lL(InterfaceC7446uc1 interfaceC7446uc1, boolean z) {
        this.b = interfaceC7446uc1;
        this.c = z;
    }

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.InterfaceC7446uc1
    public final InterfaceC5506kS0 b(C7903x10 c7903x10, InterfaceC5506kS0 interfaceC5506kS0, int i, int i2) {
        InterfaceC5935mi interfaceC5935mi = a.a(c7903x10).b;
        Drawable drawable = (Drawable) interfaceC5506kS0.get();
        C6126ni c6126niA = AbstractC7287tn0.a(interfaceC5935mi, drawable, i, i2);
        if (c6126niA != null) {
            InterfaceC5506kS0 interfaceC5506kS0B = this.b.b(c7903x10, c6126niA, i, i2);
            if (!interfaceC5506kS0B.equals(c6126niA)) {
                return new C6126ni(c7903x10.getResources(), interfaceC5506kS0B);
            }
            interfaceC5506kS0B.recycle();
            return interfaceC5506kS0;
        }
        if (!this.c) {
            return interfaceC5506kS0;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        if (obj instanceof C5675lL) {
            return this.b.equals(((C5675lL) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return this.b.hashCode();
    }
}
