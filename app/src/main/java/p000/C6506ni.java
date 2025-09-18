package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: ni */
/* loaded from: classes.dex */
public final class C6506ni implements InterfaceC10011kS0, InterfaceC10483o80 {

    /* renamed from: a */
    public final /* synthetic */ int f38472a = 1;

    /* renamed from: b */
    public final Object f38473b;

    /* renamed from: c */
    public final Object f38474c;

    public C6506ni(InterfaceC6443mi interfaceC6443mi, Bitmap bitmap) {
        IL1.m3830d(bitmap, "Bitmap must not be null");
        this.f38473b = bitmap;
        IL1.m3830d(interfaceC6443mi, "BitmapPool must not be null");
        this.f38474c = interfaceC6443mi;
    }

    /* renamed from: b */
    public static C6506ni m23171b(InterfaceC6443mi interfaceC6443mi, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C6506ni(interfaceC6443mi, bitmap);
    }

    @Override // p000.InterfaceC10011kS0
    /* renamed from: a */
    public final Class mo4302a() {
        switch (this.f38472a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // p000.InterfaceC10011kS0
    public final Object get() {
        switch (this.f38472a) {
            case 0:
                return (Bitmap) this.f38473b;
            default:
                return new BitmapDrawable((Resources) this.f38473b, (Bitmap) ((InterfaceC10011kS0) this.f38474c).get());
        }
    }

    @Override // p000.InterfaceC10011kS0
    public final int getSize() {
        switch (this.f38472a) {
            case 0:
                return AbstractC7381Bh1.m804c((Bitmap) this.f38473b);
            default:
                return ((InterfaceC10011kS0) this.f38474c).getSize();
        }
    }

    @Override // p000.InterfaceC10483o80
    public final void initialize() {
        switch (this.f38472a) {
            case 0:
                ((Bitmap) this.f38473b).prepareToDraw();
                break;
            default:
                InterfaceC10011kS0 interfaceC10011kS0 = (InterfaceC10011kS0) this.f38474c;
                if (interfaceC10011kS0 instanceof InterfaceC10483o80) {
                    ((InterfaceC10483o80) interfaceC10011kS0).initialize();
                    break;
                }
                break;
        }
    }

    @Override // p000.InterfaceC10011kS0
    public final void recycle() {
        switch (this.f38472a) {
            case 0:
                ((InterfaceC6443mi) this.f38474c).mo319i((Bitmap) this.f38473b);
                break;
            default:
                ((InterfaceC10011kS0) this.f38474c).recycle();
                break;
        }
    }

    public C6506ni(Resources resources, InterfaceC10011kS0 interfaceC10011kS0) {
        IL1.m3830d(resources, "Argument must not be null");
        this.f38473b = resources;
        IL1.m3830d(interfaceC10011kS0, "Argument must not be null");
        this.f38474c = interfaceC10011kS0;
    }
}
