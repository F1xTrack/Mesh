package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* renamed from: p4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6388p4 implements InterfaceC3903g70 {
    public final Image a;
    public final G10[] b;
    public final C1120Od c;

    public C6388p4(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new G10[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new G10(2, planes[i]);
            }
        } else {
            this.b = new G10[0];
        }
        this.c = new C1120Od(C6974s81.b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // defpackage.InterfaceC3903g70
    public final K60 P() {
        return this.c;
    }

    @Override // defpackage.InterfaceC3903g70
    public final Image Z() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.InterfaceC3903g70
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.InterfaceC3903g70
    public final int getWidth() {
        return this.a.getWidth();
    }

    @Override // defpackage.InterfaceC3903g70
    public final int j0() {
        return this.a.getFormat();
    }

    @Override // defpackage.InterfaceC3903g70
    public final G10[] u() {
        return this.b;
    }
}
