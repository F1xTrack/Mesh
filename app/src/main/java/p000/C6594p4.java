package p000;

import android.graphics.Matrix;
import android.media.Image;

/* renamed from: p4 */
/* loaded from: classes.dex */
public final class C6594p4 implements InterfaceC9457g70 {

    /* renamed from: a */
    public final Image f39765a;

    /* renamed from: b */
    public final G10[] f39766b;

    /* renamed from: c */
    public final C0921Od f39767c;

    public C6594p4(Image image) {
        this.f39765a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f39766b = new G10[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f39766b[i] = new G10(2, planes[i]);
            }
        } else {
            this.f39766b = new G10[0];
        }
        this.f39767c = new C0921Od(C10996s81.f42278b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // p000.InterfaceC9457g70
    /* renamed from: P */
    public final K60 mo18403P() {
        return this.f39767c;
    }

    @Override // p000.InterfaceC9457g70
    /* renamed from: Z */
    public final Image mo18404Z() {
        return this.f39765a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f39765a.close();
    }

    @Override // p000.InterfaceC9457g70
    public final int getHeight() {
        return this.f39765a.getHeight();
    }

    @Override // p000.InterfaceC9457g70
    public final int getWidth() {
        return this.f39765a.getWidth();
    }

    @Override // p000.InterfaceC9457g70
    /* renamed from: j0 */
    public final int mo18405j0() {
        return this.f39765a.getFormat();
    }

    @Override // p000.InterfaceC9457g70
    /* renamed from: u */
    public final G10[] mo18406u() {
        return this.f39766b;
    }
}
