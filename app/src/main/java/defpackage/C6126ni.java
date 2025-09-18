package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: ni, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6126ni implements InterfaceC5506kS0, InterfaceC6210o80 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public C6126ni(InterfaceC5935mi interfaceC5935mi, Bitmap bitmap) {
        IL1.d(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        IL1.d(interfaceC5935mi, "BitmapPool must not be null");
        this.c = interfaceC5935mi;
    }

    public static C6126ni b(InterfaceC5935mi interfaceC5935mi, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C6126ni(interfaceC5935mi, bitmap);
    }

    @Override // defpackage.InterfaceC5506kS0
    public final Class a() {
        switch (this.a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // defpackage.InterfaceC5506kS0
    public final Object get() {
        switch (this.a) {
            case 0:
                return (Bitmap) this.b;
            default:
                return new BitmapDrawable((Resources) this.b, (Bitmap) ((InterfaceC5506kS0) this.c).get());
        }
    }

    @Override // defpackage.InterfaceC5506kS0
    public final int getSize() {
        switch (this.a) {
            case 0:
                return AbstractC0121Bh1.c((Bitmap) this.b);
            default:
                return ((InterfaceC5506kS0) this.c).getSize();
        }
    }

    @Override // defpackage.InterfaceC6210o80
    public final void initialize() {
        switch (this.a) {
            case 0:
                ((Bitmap) this.b).prepareToDraw();
                break;
            default:
                InterfaceC5506kS0 interfaceC5506kS0 = (InterfaceC5506kS0) this.c;
                if (interfaceC5506kS0 instanceof InterfaceC6210o80) {
                    ((InterfaceC6210o80) interfaceC5506kS0).initialize();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC5506kS0
    public final void recycle() {
        switch (this.a) {
            case 0:
                ((InterfaceC5935mi) this.c).i((Bitmap) this.b);
                break;
            default:
                ((InterfaceC5506kS0) this.c).recycle();
                break;
        }
    }

    public C6126ni(Resources resources, InterfaceC5506kS0 interfaceC5506kS0) {
        IL1.d(resources, "Argument must not be null");
        this.b = resources;
        IL1.d(interfaceC5506kS0, "Argument must not be null");
        this.c = interfaceC5506kS0;
    }
}
